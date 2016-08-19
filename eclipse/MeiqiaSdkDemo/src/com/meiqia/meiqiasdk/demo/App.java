package com.meiqia.meiqiasdk.demo;

import android.app.Application;
import android.text.InputType;
import android.widget.Toast;

import com.meiqia.core.MQManager;
import com.meiqia.core.callback.OnInitCallback;
import com.meiqia.meiqiasdk.model.MessageFormInputModel;
import com.meiqia.meiqiasdk.util.MQConfig;

import java.util.ArrayList;

/**
 * 作者:王浩 邮件:bingoogolapple@gmail.com
 * 创建时间:16/5/25 下午4:28
 * 描述:
 */
public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        initMeiqiaSDK();

        MQManager.setDebugMode(true);
    }

    private void initMeiqiaSDK() {
        MQManager.setDebugMode(true);

        // 替换成自己的key
        String meiqiaKey = "a71c257c80dfe883d92a64dca323ec20";
        MQConfig.init(this, meiqiaKey, new OnInitCallback() {
            @Override
            public void onSuccess(String clientId) {
                Toast.makeText(App.this, "init success", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onFailure(int code, String message) {
                Toast.makeText(App.this, "int failure message = " + message, Toast.LENGTH_SHORT).show();
            }
        });

        // 可选
        customMeiqiaSDK();
    }

    private void customMeiqiaSDK() {
        // 配置自定义信息
//        MQConfig.ui.titleGravity = MQConfig.ui.MQTitleGravity.LEFT;
//        MQConfig.ui.backArrowIconResId = android.support.v7.appcompat.R.drawable.abc_ic_ab_back_mtrl_am_alpha;
//        MQConfig.ui.titleBackgroundResId = R.color.test_red;
//        MQConfig.ui.titleTextColorResId = R.color.test_blue;
//        MQConfig.ui.leftChatBubbleColorResId = R.color.test_green;
//        MQConfig.ui.leftChatTextColorResId = R.color.test_red;
//        MQConfig.ui.rightChatBubbleColorResId = R.color.test_red;
//        MQConfig.ui.rightChatTextColorResId = R.color.test_green;
//        MQConfig.ui.robotEvaluateTextColorResId = R.color.test_red;
//        MQConfig.ui.robotMenuItemTextColorResId = R.color.test_blue;
//        MQConfig.ui.robotMenuTipTextColorResId = R.color.test_blue;
    }

}
