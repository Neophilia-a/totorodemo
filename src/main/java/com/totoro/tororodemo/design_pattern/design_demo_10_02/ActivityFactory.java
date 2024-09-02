package com.totoro.tororodemo.design_pattern.design_demo_10_02;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * 功能：
 *
 * @author zhenghang
 * @date 2024/9/1
 */
public class ActivityFactory {
    static Map<Long, Activity> activityMap = new HashMap<>();

    public static Activity getActivity(Long id) {
        Activity activity = activityMap.get(id);
        if (null == activity) {
            // 模拟从实际业务应用从接口中获取活动信息
            activity = new Activity();
            activity.setId(10001L);
            activity.setName("图书嗨乐");
            activity.setDesc("图书优惠券分享激励分享活动第二期");
            activity.setStartTime(new Date());
            activity.setStopTime(new Date());
            activityMap.put(id, activity);
        }
        return activity;
    }
}
