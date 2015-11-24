// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.util.platform;

import android.content.SharedPreferences$OnSharedPreferenceChangeListener;
import java.util.HashMap;
import android.preference.PreferenceManager;
import android.content.Context;
import java.util.Map;
import android.content.SharedPreferences;

public class g implements n
{
    private final SharedPreferences a;
    private final Map b;
    
    public g(final Context context) {
        this(PreferenceManager.getDefaultSharedPreferences(context));
    }
    
    public g(final SharedPreferences a) {
        this.b = new HashMap();
        this.a = a;
    }
    
    @Override
    public void a(final o o) {
        final h h = new h(this, o);
        this.b.put(o, h);
        this.a.registerOnSharedPreferenceChangeListener((SharedPreferences$OnSharedPreferenceChangeListener)h);
    }
    
    @Override
    public boolean a(final String s, final boolean b) {
        return this.a.getBoolean(s, b);
    }
}
