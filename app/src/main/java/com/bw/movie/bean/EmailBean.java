package com.bw.movie.bean;
/*
 *@auther:史陆杰
 *@Date: 2020/5/18
 *@Time:21:32
 *@Description:${DESCRIPTION}
 **/


public class EmailBean {

    /**
     * message : 发送成功
     * status : 0000
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
