package com.chinaedu.antoolpro;

import android.app.Activity;
import android.app.ActivityManager;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.os.Message;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends Activity {

    @BindView(R.id.tv_main_main)
    TextView mMainTv;
    @BindView(R.id.btn_main_main)
    Button mMainBtn;

    @BindView(R.id.iv_main_level)
    ImageView mLevelIv;

    CountDownTimer cd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);

        mHandler.sendEmptyMessage(1);


    }

    @Override
    protected void onResume() {
        super.onResume();

        ActivityManager.RunningAppProcessInfo rap = new ActivityManager.RunningAppProcessInfo();
        ActivityManager.getMyMemoryState(rap);
    }

    Handler mHandler = new Handler(){

        int i=1;

        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);

            if(i>3){
                i=1;
            }
            mLevelIv.setImageLevel(i);
            i++;
            sendEmptyMessageDelayed(1, 800);
        }
    };

    @Override
    public void onTrimMemory(int level) {
        super.onTrimMemory(level);


    }
}
