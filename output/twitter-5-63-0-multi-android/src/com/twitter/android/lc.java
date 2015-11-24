// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import android.content.SharedPreferences;
import android.content.SharedPreferences$OnSharedPreferenceChangeListener;

class lc implements SharedPreferences$OnSharedPreferenceChangeListener
{
    final /* synthetic */ MainActivity a;
    
    lc(final MainActivity a) {
        this.a = a;
    }
    
    public void onSharedPreferenceChanged(final SharedPreferences sharedPreferences, final String s) {
        if ("data_usage_meter".equals(s)) {
            ActivityWithProgress.a = sharedPreferences.getBoolean("data_usage_meter", false);
            jz.a().a(ActivityWithProgress.a);
        }
    }
}
