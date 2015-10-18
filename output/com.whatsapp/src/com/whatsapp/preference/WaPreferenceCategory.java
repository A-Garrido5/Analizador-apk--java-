// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.preference;

import android.view.View;
import android.view.ViewGroup;
import android.util.AttributeSet;
import android.content.Context;
import android.preference.PreferenceCategory;

public class WaPreferenceCategory extends PreferenceCategory
{
    public WaPreferenceCategory(final Context context) {
        super(context);
    }
    
    public WaPreferenceCategory(final Context context, final AttributeSet set) {
        super(context, set);
    }
    
    public WaPreferenceCategory(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
    }
    
    protected View onCreateView(final ViewGroup viewGroup) {
        return WaPreference.b(super.onCreateView(viewGroup));
    }
}
