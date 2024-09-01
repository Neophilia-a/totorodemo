package com.totoro.tororodemo.skill.submit;

import jakarta.annotation.Resource;
import jakarta.servlet.http.HttpServletRequest;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang.StringUtils;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Component;
import org.springframework.util.DigestUtils;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import java.lang.reflect.Method;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.TimeUnit;

/**
 * 功能：
 *
 * @author zhenghang
 * @date 2024/8/8
 */
@Aspect
@Component
@Slf4j
public class RepeatSubmitAspect {

    @Resource
    private StringRedisTemplate stringRedisTemplate;

    @Pointcut(value = "@annotation(repeatSubmit)")
    public void pointCutNoRepeatSubmit(RepeatSubmit repeatSubmit) {

    }

    /**
     *
     * 方式一：ip + url + 类名+ 方法
     * 方法二：url + token
     *
     * @param joinPoint
     * @param repeatSubmit
     * @return
     */
    @Around(value = "pointCutNoRepeatSubmit(repeatSubmit)", argNames = "joinPoint, repeatSubmit")
    public Object around(ProceedingJoinPoint joinPoint, RepeatSubmit repeatSubmit) {
        HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
        String type = repeatSubmit.limitType().name();
        String key = ":repeat_submit:";
        String url = request.getRequestURI();
        String ipAddress = request.getRemoteAddr();
        if (type.equalsIgnoreCase(RepeatSubmit.Type.PARAM.name())) {
            MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
            Method method = methodSignature.getMethod();
            String className = method.getDeclaringClass().getName();
            key = key + String.format("%s-%s-%s-%s", ipAddress, url, className, method);
        } else {
            String token = request.getHeader("token");
            if (StringUtils.isBlank(token)) {
                log.error("token不存在");
                return "token不存在";
            }
            key = key + String.format("%s-%s", token, url);
        }
        key = DigestUtils.md5DigestAsHex(key.getBytes(StandardCharsets.UTF_8));
        if (Boolean.FALSE.equals(stringRedisTemplate.hasKey(key))) {
            stringRedisTemplate.opsForValue().setIfAbsent(key, "", repeatSubmit.lockTime(), TimeUnit.SECONDS);
            try {
                return joinPoint.proceed();
            } catch (Throwable e) {
                log.error("错误发生");
                stringRedisTemplate.delete(key);
            }
        }
        log.info("重复提交，等待10秒");
        return "重复提交, 请稍后再次提交";
    }
}
