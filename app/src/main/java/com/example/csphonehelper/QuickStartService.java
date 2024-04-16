package com.example.csphonehelper;



import android.annotation.SuppressLint;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Build;
import android.service.quicksettings.TileService;
import android.util.Log;

import android.os.Handler;

import androidx.localbroadcastmanager.content.LocalBroadcastManager;

public class QuickStartService extends TileService {
    @SuppressLint("StartActivityAndCollapseDeprecated")
    @Override
    public void onClick() { // 状态栏快捷按钮点击事件
        super.onClick();
        Log.d("QuickStartService", "onClick");
        if(!MainActivity.isAlive() || !MainActivity.isRunning()) {
            /*// 唤起应用代码重构
            Intent intent = new Intent(this, MainActivity.class);
            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TOP);

            PendingIntent pendingIntent = PendingIntent.getActivity(
                    this,
                    *//*requestCode=*//* 0,
                    intent,
                    PendingIntent.FLAG_UPDATE_CURRENT
            );

            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.UPSIDE_DOWN_CAKE) {
                startActivityAndCollapse(pendingIntent); // 唤起应用
            }*/

            Intent intent = new Intent(this, MainActivity.class);
            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TOP);
            startActivityAndCollapse(intent); // 唤起应用
            Log.d("QuickStartService", "startActivity: MainActivity");
            new Handler().postDelayed(() -> {
                Intent broadcastIntent = new Intent("com.example.csphonehelper.SHOW_KEYBOARD");
                LocalBroadcastManager.getInstance(this).sendBroadcast(broadcastIntent);
                Log.d("QuickStartService", "broadcast: SHOW_KEYBOARD");
            }, 500); // 延迟500ms弹出软键盘
        }
    }
}

