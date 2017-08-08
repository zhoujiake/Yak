package com.zjk.yak.ui.action;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.WindowManager;

import com.zjk.yak.R;

import java.util.Timer;
import java.util.TimerTask;

import me.wangyuwei.particleview.ParticleView;

/**
 * Author   :hymanme
 * Email    :hymanme@163.com
 * Create at 2016/9/8
 * Description:
 */

public class SplashActivity extends AppCompatActivity {
    private ParticleView pv_logo;

    private final Timer timer = new Timer();
    private TimerTask task;
    Handler handler = new Handler() {
            @Override
           public void handleMessage(Message msg) {
                   // TODO Auto-generated method stub
                    // 4秒后跳转到主界面
                Intent intent = new Intent(SplashActivity.this, MainActivity.class);
                SplashActivity.this.startActivity(intent);
                SplashActivity.this.finish();
                timer.cancel();
                }
        };

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_splash);
        pv_logo = (ParticleView) findViewById(R.id.pv_logo);
        pv_logo.setOnParticleAnimListener(new ParticleView.ParticleAnimListener() {
            @Override
            public void onAnimationEnd() {
               /* Intent intent = new Intent(SplashActivity.this, MainActivity.class);
                SplashActivity.this.startActivity(intent);
                SplashActivity.this.finish();*/
            }
        });
        pv_logo.startAnim();
        task = new TimerTask() {
            @Override
            public void run() {
                // TODO Auto-generated method stub
                Message message = new Message();
                message.what = 1;
                handler.sendMessage(message);}
        };
        timer.schedule(task, 5000, 5000);

    }
}
