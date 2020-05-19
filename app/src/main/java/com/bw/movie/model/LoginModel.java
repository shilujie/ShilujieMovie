package com.bw.movie.model;
/*
 *@auther:史陆杰
 *@Date: 2020/5/18
 *@Time:21:59
 *@Description:${DESCRIPTION}
 **/


import com.bw.movie.bean.EmailBean;
import com.bw.movie.bean.LoginBean;
import com.bw.movie.bean.ZHuBean;
import com.bw.movie.contract.LoginContract;
import com.bw.movie.util.NetUtil;

import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;

public class LoginModel implements LoginContract.IModel {
    @Override
    public void getEmailData(String email, final EmailCallBack emailCallBack) {
        NetUtil.getInstance().getApi().getEmail(email)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<EmailBean>() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onNext(EmailBean emailBean) {
                        emailCallBack.getEmailSuccess(emailBean);
                    }

                    @Override
                    public void onError(Throwable e) {
                        emailCallBack.getEmailFailer(e);
                    }

                    @Override
                    public void onComplete() {

                    }
                });
    }

    @Override
    public void getZhuData(String nickName, String pwd, String email, String code, final ZhuCallBack zhuCallBack) {
        NetUtil.getInstance().getApi().getZhu(nickName,pwd,email,code)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<ZHuBean>() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onNext(ZHuBean zHuBean) {
                        zhuCallBack.getZhuSuccess(zHuBean);
                    }

                    @Override
                    public void onError(Throwable e) {
                        zhuCallBack.getZhuFailer(e);
                    }

                    @Override
                    public void onComplete() {

                    }
                });
    }

    @Override
    public void getLoginData(String email, String pwd, final LoginCallBack loginCallBack) {
        NetUtil.getInstance().getApi().getLogin(email,pwd)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<LoginBean>() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onNext(LoginBean loginBean) {
                        loginCallBack.getLoginSuccess(loginBean);
                    }

                    @Override
                    public void onError(Throwable e) {
                        loginCallBack.getLoginFailer(e);
                    }

                    @Override
                    public void onComplete() {

                    }
                });

    }
}
