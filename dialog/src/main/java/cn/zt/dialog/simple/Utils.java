package cn.zt.dialog.simple;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.view.LayoutInflater;
import android.view.View;

/**
 * @author : ZhangTao on 2018/1/23 15:27
 */
class Utils {

    static View getView(Context context, @LayoutRes int layout) {
        return LayoutInflater.from(context).inflate(layout, null, false);
    }

    static int getScreenWidth(final Context context) {
        return context.getResources().getDisplayMetrics().widthPixels;
    }

    static int getScreenHeight(final Context context) {
        return context.getResources().getDisplayMetrics().heightPixels;
    }

    static int dp2px(final Context context, final float dpValue) {
        final float scale = context.getResources().getDisplayMetrics().density;
        return (int) (dpValue * scale + 0.5f);
    }
}
