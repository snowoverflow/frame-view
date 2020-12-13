package com.yangjl.ui;

import android.content.Context;
import android.widget.Toast;

public class Utils {

    public static void toast(Context context, String msg) {
        Toast.makeText(context.getApplicationContext(), msg, Toast.LENGTH_SHORT).show();
    }
}
