package com.bw.movie.view.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import com.bw.movie.R;
import com.bw.movie.base.BaseActivity;
import com.bw.movie.base.BasePresenter;
import com.bw.movie.bean.EmailBean;
import com.bw.movie.bean.LoginBean;
import com.bw.movie.bean.ZHuBean;
import com.bw.movie.contract.LoginContract;
import com.bw.movie.presenter.LoginPresenter;

public class ZhuActivity extends BaseActivity implements LoginContract.IView {

    private ImageView back;
    private EditText ed_name;
    private EditText ed_email;
    private EditText ed_pass;
    private EditText ed_yan;
    private Button zhu;
    private LoginPresenter loginPresenter;
    private Button huo;

    @Override
    protected void initData() {

    }

    @Override
    protected void initView() {
        ed_name = findViewById(R.id.zed_name);
        ed_email = findViewById(R.id.zed_email);
        ed_pass = findViewById(R.id.zed_pass);
        ed_yan= findViewById(R.id.zed_huoqu);
        back = findViewById(R.id.backs);
        huo = findViewById(R.id.huoqu);
        huo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s = ed_email.getText().toString();
                loginPresenter.getEmailData(s);
            }
        });
        zhu = findViewById(R.id.zhuce);
        //点击注册
        zhu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = ed_name.getText().toString();
                String email = ed_email.getText().toString();
                String pass = ed_pass.getText().toString();
                String yan = ed_yan.getText().toString();
                loginPresenter.getZhuData(name,email,pass,yan);
            }
        });
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ZhuActivity.this,LoginActivity.class));
                finish();
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
        return R.layout.activity_zhu;
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
