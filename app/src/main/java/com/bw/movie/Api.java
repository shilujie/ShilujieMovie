package com.bw.movie;
/*
 *@auther:史陆杰
 *@Date: 2020/5/17
 *@Time:19:50
 *@Description:${DESCRIPTION}
 **/


import com.bw.movie.bean.EmailBean;
import com.bw.movie.bean.LoginBean;
import com.bw.movie.bean.ZHuBean;

import io.reactivex.Observable;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface Api {
    @POST("user/v2/sendOutEmailCode")
    Observable<EmailBean> getEmail(@Body String email);
    @POST("user/v2/register")
    Observable<ZHuBean> getZhu(String nickName,String pwd,String email,String code);
    @POST("user/v2/login")
    Observable<LoginBean> getLogin(String email, String pwd);
}
