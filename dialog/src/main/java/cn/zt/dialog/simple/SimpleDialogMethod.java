package cn.zt.dialog.simple;

import android.support.annotation.LayoutRes;
import android.view.View;
import android.widget.LinearLayout;

/**
 * @author : ZhangTao on 2018/1/23 18:18
 */
public interface SimpleDialogMethod {
    SimpleDialogBuilder title(CharSequence sequence);

    SimpleDialogBuilder addButton(CharSequence btn);

    SimpleDialogBuilder addButton(CharSequence btn, SimpleDialogBtnClickListener listener);

    SimpleDialogBuilder addView(View view, LinearLayout.LayoutParams params);

    SimpleDialogBuilder addView(View view);

    SimpleDialogBuilder addView(@LayoutRes int layout);

    SimpleDialogBuilder addView(@LayoutRes int layout, LinearLayout.LayoutParams params);
}