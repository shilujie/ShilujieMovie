package com.bw.movie.bean;
/*
 *@auther:史陆杰
 *@Date: 2020/5/18
 *@Time:21:41
 *@Description:${DESCRIPTION}
 **/


public class LoginBean {

    /**
     * message : 登陆失败,账号或密码错误
     * status : 1001
     */

    private String message;
    private String status;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
