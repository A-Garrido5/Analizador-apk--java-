// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.widget;

import android.view.accessibility.AccessibilityEvent;
import android.widget.RadioButton;
import android.view.View;
import android.util.AttributeSet;
import android.content.Context;
import android.view.accessibility.AccessibilityManager;
import android.preference.CheckBoxPreference;

public class RadioButtonPreference extends CheckBoxPreference
{
    private boolean a;
    private final AccessibilityManager b;
    
    public RadioButtonPreference(final Context context) {
        this(context, null);
    }
    
    public RadioButtonPreference(final Context context, final AttributeSet set) {
        this(context, set, 0);
    }
    
    public RadioButtonPreference(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        this.b = (AccessibilityManager)this.getContext().getSystemService("accessibility");
        this.setWidgetLayoutResource(2130968988);
    }
    
    protected void onBindView(final View view) {
        super.onBindView(view);
        final RadioButton radioButton = (RadioButton)view.findViewById(2131887158);
        radioButton.setChecked(this.isChecked());
        if (this.a && this.b.isEnabled() && radioButton.isEnabled()) {
            this.a = false;
            radioButton.sendAccessibilityEventUnchecked(AccessibilityEvent.obtain(1));
        }
    }
    
    protected void onClick() {
        this.a = true;
        if (!this.isChecked()) {
            super.onClick();
        }
    }
}
