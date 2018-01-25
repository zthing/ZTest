package cn.zt.dialog.custom;

import cn.zt.dialog.R;
import cn.zt.dialog.simple.SimpleDialogParams;

/**
 * @author : ZhangTao on 2018/1/25 10:32
 */
public class Utils {
    public static SimpleDialogParams.Builder getDefaultDialogParamsBuilder() {
        return new SimpleDialogParams.Builder()
                .layout(R.layout.dialog_default)
                .titleId(R.id.text_dialog_title)
                .closeId(R.id.btn_dialog_close)
                .contentId(R.id.linear_dialog_content)
                .buttonId(R.id.linear_dialog_button)
                .btnLayout(R.layout.dialog_button_layout)
                .btnLineLayout(R.layout.dialog_button_layout_line)
                .btnDrawables(new int[]{R.drawable.selector_dialog_bottom_start
                        , R.drawable.selector_dialog_bottom, R.drawable.selector_dialog_bottom_end})
                .themeResId(R.style.Dialog_Default)
                .cancelable(false)
                .canceledOnTouchOutside(true)
                .clickButtonCancel(true)
//                .minWidth(0.4f)
//                .minHeight(0.5f)
                .maxWidth(0.8f)
                .maxHeight(0.8f);
    }
}
