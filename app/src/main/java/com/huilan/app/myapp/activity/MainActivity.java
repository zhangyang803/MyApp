package com.huilan.app.myapp.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.huilan.app.myapp.R;
import com.huilan.app.myapp.util.Utils;

public class MainActivity extends BaseActivity {

    Button bt_toast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    public void initView(){

        bt_toast = (Button)findViewById(R.id.bt_toast);

        bt_toast.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        super.onClick(v);
        switch (v.getId()){
            case R.id.bt_toast:
                Utils.showToast(this,"您好！");
                break;
        }
    }
}
