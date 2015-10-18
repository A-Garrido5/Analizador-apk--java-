// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.widget;

import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.content.Context;
import android.widget.RadioButton;

public class StyleableRadioButton extends RadioButton
{
    public final int a;
    public final int b;
    
    public StyleableRadioButton(final Context context) {
        this(context, null);
    }
    
    public StyleableRadioButton(final Context context, final AttributeSet set) {
        this(context, set, kv.radioButtonStyle);
    }
    
    public StyleableRadioButton(final Context context, final AttributeSet set, final int n) {
        super(context, set);
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, li.StyleableRadioButton, n, 0);
        this.a = obtainStyledAttributes.getResourceId(li.StyleableRadioButton_normalStyle, 0);
        this.b = obtainStyledAttributes.getResourceId(li.StyleableRadioButton_checkedStyle, 0);
        obtainStyledAttributes.recycle();
    }
    
    public void setChecked(final boolean checked) {
        super.setChecked(checked);
        final Context context = this.getContext();
        int n;
        if (checked) {
            n = this.b;
        }
        else {
            n = this.a;
        }
        this.setTextAppearance(context, n);
    }
}
