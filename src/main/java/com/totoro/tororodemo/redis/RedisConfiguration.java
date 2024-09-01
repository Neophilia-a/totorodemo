package com.totoro.tororodemo.redis;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.serializer.GenericJackson2JsonRedisSerializer;
import org.springframework.data.redis.serializer.StringRedisSerializer;

/**
 * 功能：
 *
 * @author zhenghang
 * @date 2024/8/8
 */
@Configuration
@Slf4j
public class RedisConfiguration {
    /**
     JSON 序列化器来对值进行序列化和反序列化
     */
    @Bean
    public RedisTemplate<String, Object> redisTemplate(RedisConnectionFactory cf) {
        RedisTemplate<String, Object> rt= new RedisTemplate<>();
        rt.setConnectionFactory(cf);
        rt.setKeySerializer(new StringRedisSerializer());
        rt.setValueSerializer(new GenericJackson2JsonRedisSerializer());
        log.info("========注册RedisTemplate成功========");
        return rt;
    }

    @Bean
    public StringRedisTemplate stringRedisTemplate(RedisConnectionFactory redisConnectionFactory) {
        log.info("========注册StringRedisTemplate成功========");
        return new StringRedisTemplate(redisConnectionFactory);
    }
}
