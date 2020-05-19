package com.bw.movie.contract;
/*
 *@auther:史陆杰
 *@Date: 2020/5/18
 *@Time:21:52
 *@Description:${DESCRIPTION}
 **/


import com.bw.movie.bean.EmailBean;
import com.bw.movie.bean.LoginBean;
import com.bw.movie.bean.ZHuBean;

public interface LoginContract {
    interface IView{
        void getEmailSuccess(EmailBean emailBean);
        void getEmailFailer(Throwable throwable);
        void getZhuSuccess(ZHuBean zHuBean);
        void getZhuFailer(Throwable throwable);
        void getLoginSuccess(LoginBean loginBean);
        void getLoginFailer(Throwable throwable);
    }
    interface IPresenter{
        void getEmailData(String email);
        void getZhuData(String nickName,String pwd,String email,String code);
        void getLoginData(String email,String pwd);
    }
    interface IModel{
        void getEmailData(String email,EmailCallBack emailCallBack);
        void getZhuData(String nickName,String pwd,String email,String code,ZhuCallBack zhuCallBack);
        void getLoginData(String email,String pwd,LoginCallBack loginCallBack);
        interface EmailCallBack {
            void getEmailSuccess(EmailBean emailBean);
            void getEmailFailer(Throwable throwable);
        }
        interface ZhuCallBack {
                void getZhuSuccess(ZHuBean zHuBean);
                void getZhuFailer(Throwable throwable);
            }

        interface LoginCallBack {
            void getLoginSuccess(LoginBean loginBean);
            void getLoginFailer(Throwable throwable);
        }
    }
}
