package com.cgfay.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;

import com.cgfay.design.R;


/**
 * @author CainHuang
 * 2019-09-28
 */
public class TabItem extends View {
    final CharSequence mText;
    final Drawable mIcon;
    final int mCustomLayout;

    public TabItem(Context context) {
        this(context, null);
    }

    public TabItem(Context context, AttributeSet attrs) {
        super(context, attrs);

        TypedArray typedArray = context.obtainStyledAttributes(attrs, com.google.android.material.R.styleable.TabItem);
        mText = typedArray.getText(com.google.android.material.R.styleable.TabItem_android_text);
        mIcon = typedArray.getDrawable(com.google.android.material.R.styleable.TabItem_android_icon);
        mCustomLayout = typedArray.getResourceId(com.google.android.material.R.styleable.TabItem_android_layout, 0);
        typedArray.recycle();
    }
}
