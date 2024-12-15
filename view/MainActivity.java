package com.example.myapp.view;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;


import com.example.myapp.R;
import com.example.myapp.activity.DataAnalyseActivity;
import com.example.myapp.activity.InComeDetailActivity;
import com.example.myapp.activity.NewInComeActivity;
import com.example.myapp.activity.NewPayActivity;
import com.example.myapp.activity.PayDetailActivity;
import com.example.myapp.activity.SysSettingActivity;

public class MainActivity extends AppCompatActivity {
    //定义对象
    ImageButton bt_newincome,bt_incomedetail,btn_newpay,btn_paydetail,bt_dataanalyse,btn_setting;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // 绑定控件
        initView();
        //按钮单击事件
        btnOnClick();
    }
    // 绑定控件--------------------------代码
    private void initView() {
        bt_newincome=findViewById(R.id.bt_newincome_main);
        bt_incomedetail=findViewById(R.id.bt_incomedetail_main);
        btn_newpay=findViewById(R.id.bt_newpay_main);
        btn_paydetail=findViewById(R.id.bt_paydetail_main);
        bt_dataanalyse=findViewById(R.id.bt_dataanalyse_main);
        btn_setting=findViewById(R.id.bt_syssetting_main);
    }
    //按钮单击事件-------------------代码
    private void btnOnClick() {
        bt_newincome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this, NewInComeActivity.class);
                startActivity(intent);
            }
        });
        bt_incomedetail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this, InComeDetailActivity.class);
                startActivity(intent);
            }
        });
        btn_newpay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this, NewPayActivity.class);
                startActivity(intent);
            }
        });
        btn_paydetail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this, PayDetailActivity.class);
                startActivity(intent);
            }
        });
        bt_dataanalyse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this, DataAnalyseActivity.class);
                startActivity(intent);
            }
        });
        btn_setting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this, SysSettingActivity.class);
                startActivity(intent);
            }
        });
    }
}