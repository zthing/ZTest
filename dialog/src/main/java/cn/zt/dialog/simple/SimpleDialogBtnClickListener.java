package cn.zt.dialog.simple;

import android.support.v7.app.AlertDialog;
import android.view.View;

/**
 * 自定义 Dialog Button 点击监听
 * @author : ZhangTao on 2018/1/23 18:49
 */
public interface SimpleDialogBtnClickListener {
    void click(View view, AlertDialog dialog);
}
