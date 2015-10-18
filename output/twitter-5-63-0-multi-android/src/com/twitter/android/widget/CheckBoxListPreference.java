// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.widget;

import android.widget.CheckBox;
import android.view.View;
import android.content.res.TypedArray;
import com.twitter.android.pa;
import android.util.AttributeSet;
import android.content.Context;
import android.preference.ListPreference;

public class CheckBoxListPreference extends ListPreference
{
    private final String a;
    
    public CheckBoxListPreference(final Context context) {
        this(context, null);
    }
    
    public CheckBoxListPreference(final Context context, final AttributeSet set) {
        super(context, set);
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, pa.CheckBoxListPreference);
        this.a = obtainStyledAttributes.getString(0);
        obtainStyledAttributes.recycle();
        this.setWidgetLayoutResource(2130968987);
    }
    
    protected void onBindView(final View view) {
        super.onBindView(view);
        if (this.a != null) {
            ((CheckBox)view.findViewById(2131887157)).setChecked(!this.a.equals(this.getValue()));
        }
    }
}
