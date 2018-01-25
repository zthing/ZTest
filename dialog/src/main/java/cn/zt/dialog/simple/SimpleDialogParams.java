package cn.zt.dialog.simple;

import android.support.annotation.IdRes;
import android.support.annotation.LayoutRes;
import android.support.annotation.StyleRes;

/**
 * 弹窗资源文件id
 * 弹窗显示设置
 *
 * @author : ZhangTao on 2018/1/23 14:38
 */
public class SimpleDialogParams {
    private SimpleDialogParams() {
    }

    int titleId;
    int closeId;
    int contentId;
    int buttonId;
    int layout;
    int btnLayout;
    int btnLineLayout;
    int[] btnDrawables;

    int windowAnimations;
    int themeResId;

    boolean cancelable;
    boolean canceledOnTouchOutside;
    boolean hideInput;
    boolean hideNavigation;

    boolean clickButtonCancel;

    float minWidth;
    float minHeight;
    float maxWidth;
    float maxHeight;
    float width;
    float height;

    private Builder builder;

    public Builder getBuilder() {
        return builder;
    }

    public static class Builder {
        private SimpleDialogParams params;

        public Builder() {
            params = new SimpleDialogParams();
            params.builder = this;
        }

        public Builder(SimpleDialogParams bParams) {
            this();
            this.titleId(bParams.titleId)
                    .closeId(bParams.closeId)
                    .contentId(bParams.contentId)
                    .buttonId(bParams.buttonId)
                    .layout(bParams.layout)
                    .btnLayout(bParams.btnLayout)
                    .btnLineLayout(bParams.btnLineLayout)
                    .btnDrawables(bParams.btnDrawables)
                    .windowAnimations(bParams.windowAnimations)
                    .themeResId(bParams.themeResId)
                    .cancelable(bParams.cancelable)
                    .canceledOnTouchOutside(bParams.canceledOnTouchOutside)
                    .hideInput(bParams.hideInput)
                    .hideNavigation(bParams.hideNavigation)
                    .clickButtonCancel(bParams.clickButtonCancel)
                    .minWidth(bParams.minWidth)
                    .minHeight(bParams.minHeight)
                    .maxWidth(bParams.maxWidth)
                    .maxHeight(bParams.maxHeight)
                    .width(bParams.width)
                    .height(bParams.height);
        }

        /**
         * 弹窗布局文件
         */
        public Builder layout(@LayoutRes int layout) {
            params.layout = layout;
            return this;
        }

        /**
         * 标题
         */
        public Builder titleId(@IdRes int titleId) {
            params.titleId = titleId;
            return this;
        }

        /**
         * 关闭按钮id
         */
        public Builder closeId(@IdRes int closeId) {
            params.closeId = closeId;
            return this;
        }

        /**
         * 弹窗内容布局id - LinearLayout
         */
        public Builder contentId(@IdRes int contentId) {
            params.contentId = contentId;
            return this;
        }

        /**
         * 按钮布局id - LinearLayout
         */
        public Builder buttonId(@IdRes int buttonId) {
            params.buttonId = buttonId;
            return this;
        }

        /**
         * 按钮布局
         */
        public Builder btnLayout(@LayoutRes int btnLayout) {
            params.btnLayout = btnLayout;
            return this;
        }

        /**
         * 按钮布局分割
         */
        public Builder btnLineLayout(@LayoutRes int btnLineLayout) {
            params.btnLineLayout = btnLineLayout;
            return this;
        }

        /**
         * 按钮背景drawable ids, 长度为3 [开始,一个,最后], 默认为按钮布局背景
         */
        public Builder btnDrawables(int[] btnDrawables) {
            params.btnDrawables = btnDrawables;
            return this;
        }

        /**
         * 弹窗动画
         */
        public Builder windowAnimations(@StyleRes int windowAnimations) {
            params.windowAnimations = windowAnimations;
            return this;
        }

        /**
         * 弹窗默认样式[仅在初始化配置时起作用, 在实例化builder时不起作用]
         * 如需要在实例化builder时设置样式，请使用SimpleDialogBuilder(Context context, int themeResId)
         */
        public Builder themeResId(@StyleRes int themeResId) {
            params.themeResId = themeResId;
            return this;
        }

        /**
         * 返回是否可用
         */
        public Builder cancelable(boolean cancelable) {
            params.cancelable = cancelable;
            return this;
        }

        /**
         * 点击外部是否消失
         */
        public Builder canceledOnTouchOutside(boolean canceledOnTouchOutside) {
            params.canceledOnTouchOutside = canceledOnTouchOutside;
            return this;
        }

        /**
         * 是否隐藏输入键盘
         */
        public Builder hideInput(boolean hideInput) {
            params.hideInput = hideInput;
            return this;
        }

        /**
         * 是否隐藏导航栏
         */
        public Builder hideNavigation(boolean hideNavigation) {
            params.hideNavigation = hideNavigation;
            return this;
        }

        /**
         * 点击按钮是否取消弹窗
         */
        public Builder clickButtonCancel(boolean clickButtonCancel) {
            params.clickButtonCancel = clickButtonCancel;
            return this;
        }

        /**
         * 弹窗最小宽度 [0-1：屏幕比；>1：dp]
         */
        public Builder minWidth(float minWidth) {
            params.minWidth = minWidth;
            return this;
        }

        /**
         * 弹窗最小高度 [0-1：屏幕比；>1：dp]
         */
        public Builder minHeight(float minHeight) {
            params.minHeight = minHeight;
            return this;
        }

        /**
         * 弹窗最大宽度 [0-1：屏幕比；>1：dp]
         */
        public Builder maxWidth(float maxWidth) {
            params.maxWidth = maxWidth;
            return this;
        }

        /**
         * 弹窗最大高度 [0-1：屏幕比；>1：dp]
         */
        public Builder maxHeight(float maxHeight) {
            params.maxHeight = maxHeight;
            return this;
        }

        /**
         * 弹窗宽度 [0-1：屏幕比；>1：dp]
         */
        public Builder width(float width) {
            params.width = width;
            return this;
        }

        /**
         * 弹窗高度 [0-1：屏幕比；>1：dp]
         */
        public Builder height(float height) {
            params.height = height;
            return this;
        }

        public SimpleDialogParams params() {
            return params;
        }
    }
}