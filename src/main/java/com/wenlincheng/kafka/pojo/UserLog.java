package com.wenlincheng.kafka.pojo;

import java.io.Serializable;

/**
 * @ClassName: UserLog
 * @Description: 用户日志
 * @Author: Cheng
 * @Date: 2019/1/26 15:48
 * @Version: 1.0.0
 */
public class UserLog implements Serializable {

    private static final long serialVersionUID = -4738044763672403527L;

    private String username;
    private String userid;
    private String state;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "UserLog{" +
                "username='" + username + '\'' +
                ", userid='" + userid + '\'' +
                ", state='" + state + '\'' +
                '}';
    }
}
