// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.preference;

import android.view.View;
import android.view.ViewGroup;
import android.util.AttributeSet;
import android.content.Context;
import android.preference.ListPreference;

public class WaListPreference extends ListPreference
{
    public static boolean a;
    
    public WaListPreference(final Context context) {
        super(context);
    }
    
    public WaListPreference(final Context context, final AttributeSet set) {
        super(context, set);
    }
    
    protected View onCreateView(final ViewGroup viewGroup) {
        return WaPreference.a(WaPreference.b(super.onCreateView(viewGroup)));
    }
}
