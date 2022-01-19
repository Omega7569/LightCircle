package com.telering.lightcircle;

import android.content.Context;

public class Utils {

    public static int dpToPx(int dp, Context context) {
        float density = context.getResources().getDisplayMetrics().density;

        return Math.round((float)dp*density);
    }

}
