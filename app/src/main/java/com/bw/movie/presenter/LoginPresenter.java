package com.bw.movie.presenter;
/*
 *@auther:史陆杰
 *@Date: 2020/5/18
 *@Time:22:03
 *@Description:${DESCRIPTION}
 **/


import com.bw.movie.base.BasePresenter;
import com.bw.movie.bean.EmailBean;
import com.bw.movie.bean.LoginBean;
import com.bw.movie.bean.ZHuBean;
import com.bw.movie.contract.LoginContract;
import com.bw.movie.model.LoginModel;

public class LoginPresenter extends BasePresenter<LoginContract.IView> implements LoginContract.IPresenter {

    private LoginModel loginModel;

    @Override
    protected void initModel() {
        loginModel = new LoginModel();
    }

    @Override
    public void getEmailData(String email) {
        loginModel.getEmailData(email, new LoginContract.IModel.EmailCallBack() {
            @Override
            public void getEmailSuccess(EmailBean emailBean) {
                view.getEmailSuccess(emailBean);
            }

            @Override
            public void getEmailFailer(Throwable throwable) {
                view.getEmailFailer(throwable);
            }
        });
    }

    @Override
    public void getZhuData(String nickName, String pwd, String email, String code) {
        loginModel.getZhuData(nickName, pwd, email, code, new LoginContract.IModel.ZhuCallBack() {
            @Override
            public void getZhuSuccess(ZHuBean zHuBean) {
                view.getZhuSuccess(zHuBean);
            }

            @Override
            public void getZhuFailer(Throwable throwable) {
                view.getZhuFailer(throwable);
            }
        });
    }

    @Override
    public void getLoginData(String email, String pwd) {
        loginModel.getLoginData(email, pwd, new LoginContract.IModel.LoginCallBack() {
            @Override
            public void getLoginSuccess(LoginBean loginBean) {
                view.getLoginSuccess(loginBean);
            }

            @Override
            public void getLoginFailer(Throwable throwable) {
                view.getLoginFailer(throwable);
            }
        });
    }
}
