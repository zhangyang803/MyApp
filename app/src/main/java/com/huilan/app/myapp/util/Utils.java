package com.huilan.app.myapp.util;

import android.content.Context;
import android.text.TextUtils;
import android.view.Gravity;
import android.widget.Toast;

/**
 * Created by Administrator on 2018/11/12.
 */

public class Utils {

    /**
     * Toast提示
     */
    public synchronized static void showToast(Context context, String str) {
        try {
            if (context==null|| TextUtils.isEmpty(str)) {
                return;
            }

            Toast toast =Toast.makeText(context,str,Toast.LENGTH_SHORT);
            toast.setGravity(Gravity.CENTER, 0, 0);
            toast.show();

        } catch (Exception e) {
        }
    }

    /**
     * 是否为null或""
     *
     * @param str
     * @return
     */
    public static boolean isEmpty(String str) {
        return str == null || "".equals(str.trim()) || "null".equalsIgnoreCase(str.trim());
    }
}
