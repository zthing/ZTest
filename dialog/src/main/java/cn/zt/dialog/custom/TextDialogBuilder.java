package cn.zt.dialog.custom;

import android.content.Context;
import android.support.annotation.NonNull;
import android.widget.TextView;

import cn.zt.dialog.R;
import cn.zt.dialog.simple.SimpleDialogBuilder;

/**
 * 自定义提醒弹窗
 *
 * @author : ZhangTao on 2018/1/24 16:33
 */
public class TextDialogBuilder extends SimpleDialogBuilder {
    public TextDialogBuilder(@NonNull Context context) {
        super(context, R.style.Dialog_Default);
        params(Utils.getDefaultDialogParamsBuilder().params());
        title("提示");
        addView(R.layout.dialog_view_message);
        addButton("确定");
    }

    public TextDialogBuilder message(CharSequence msg) {
        TextView text_message = findView(R.id.text_message);
        text_message.setText(msg);
        return this;
    }
}