// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.preference;

import android.view.View;
import android.view.ViewGroup;
import android.util.AttributeSet;
import android.content.Context;
import android.preference.CheckBoxPreference;

public class WaCheckBoxPreference extends CheckBoxPreference
{
    public WaCheckBoxPreference(final Context context) {
        super(context);
    }
    
    public WaCheckBoxPreference(final Context context, final AttributeSet set) {
        super(context, set);
    }
    
    public WaCheckBoxPreference(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
    }
    
    protected View onCreateView(final ViewGroup viewGroup) {
        return WaPreference.a(WaPreference.b(super.onCreateView(viewGroup)));
    }
}
