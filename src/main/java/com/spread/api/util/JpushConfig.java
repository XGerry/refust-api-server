package com.spread.api.util;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author:Gerry
 * @description:
 * @date: Created in 2018/11/21
 */
@Component
public class JpushConfig {
    @Value("${jpush.appKey}")
    private String appkey;
    @Value("${jpush.masterSecret}")
    private String masterSecret;
    @Value("${jpush.liveTime}")
    private String liveTime;

    public String getAppkey() {

        return appkey;
    }

    public String getMasterSecret() {

        return masterSecret;
    }

    public String getLiveTime() {
        return liveTime;
    }

    public void setLiveTime(String liveTime) {

        this.liveTime = liveTime;
    }

    public void setAppkey(String appkey) {
        this.appkey = appkey;
    }

    public void setMasterSecret(String masterSecret) {
        this.masterSecret = masterSecret;
    }
}

