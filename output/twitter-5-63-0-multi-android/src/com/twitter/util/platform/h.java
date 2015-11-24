// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.util.platform;

import android.content.SharedPreferences;
import android.content.SharedPreferences$OnSharedPreferenceChangeListener;

class h implements SharedPreferences$OnSharedPreferenceChangeListener
{
    final /* synthetic */ o a;
    final /* synthetic */ g b;
    
    h(final g b, final o a) {
        this.b = b;
        this.a = a;
    }
    
    public void onSharedPreferenceChanged(final SharedPreferences sharedPreferences, final String s) {
        this.a.a(this.b, s);
    }
}
