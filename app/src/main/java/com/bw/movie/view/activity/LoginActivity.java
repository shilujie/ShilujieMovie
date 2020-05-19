package com.bw.movie.view.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.bw.movie.R;
import com.bw.movie.base.BaseActivity;
import com.bw.movie.base.BasePresenter;
import com.bw.movie.bean.EmailBean;
import com.bw.movie.bean.LoginBean;
import com.bw.movie.bean.ZHuBean;
import com.bw.movie.contract.LoginContract;
import com.bw.movie.presenter.LoginPresenter;

public class LoginActivity extends BaseActivity implements LoginContract.IView {

    private EditText ed_email;
    private EditText ed_pass;
    private Button wang;
    private Button log;
    private Button wei;
    private TextView zhu;
    private LoginPresenter loginPresenter;
    @Override
    protected void initData() {

    }

    @Override
    protected void initView() {
        ed_email = findViewById(R.id.ed_email);
        ed_pass = findViewById(R.id.ed_pass);
        wang = findViewById(R.id.wang);
        log = findViewById(R.id.login);
        wei = findViewById(R.id.we);
        zhu = findViewById(R.id.zhu);
        zhu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(LoginActivity.this,ZhuActivity.class));
                finish();
            }
        });
        log.setOnClickListener(new View.OnClickListener() {

            private String pass;

            @Override
            public void onClick(View view) {
                String email = ed_email.getText().toString();
                pass = ed_pass.getText().toString();
                loginPresenter.getLoginData(email,pass);
            }
        });
    }

    @Override
    protected BasePresenter providerPresenter() {
        loginPresenter = new LoginPresenter();
        return loginPresenter;
    }

    @Override
    protected int layoutId() {
        return R.layout.activity_login;
    }

    @Override
    public void getEmailSuccess(EmailBean emailBean) {

    }

    @Override
    public void getEmailFailer(Throwable throwable) {

    }

    @Override
    public void getZhuSuccess(ZHuBean zHuBean) {

    }

    @Override
    public void getZhuFailer(Throwable throwable) {

    }

    @Override
    public void getLoginSuccess(LoginBean loginBean) {

    }

    @Override
    public void getLoginFailer(Throwable throwable) {

    }
}
