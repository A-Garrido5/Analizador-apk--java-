// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.util.platform;

import android.content.SharedPreferences$OnSharedPreferenceChangeListener;
import java.util.Set;
import java.util.HashMap;
import java.util.Map;
import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;

class f implements SharedPreferences
{
    public boolean contains(final String s) {
        return false;
    }
    
    public SharedPreferences$Editor edit() {
        return null;
    }
    
    public Map getAll() {
        return new HashMap();
    }
    
    public boolean getBoolean(final String s, final boolean b) {
        return b;
    }
    
    public float getFloat(final String s, final float n) {
        return n;
    }
    
    public int getInt(final String s, final int n) {
        return n;
    }
    
    public long getLong(final String s, final long n) {
        return n;
    }
    
    public String getString(final String s, final String s2) {
        return s2;
    }
    
    public Set getStringSet(final String s, final Set set) {
        return set;
    }
    
    public void registerOnSharedPreferenceChangeListener(final SharedPreferences$OnSharedPreferenceChangeListener sharedPreferences$OnSharedPreferenceChangeListener) {
    }
    
    public void unregisterOnSharedPreferenceChangeListener(final SharedPreferences$OnSharedPreferenceChangeListener sharedPreferences$OnSharedPreferenceChangeListener) {
    }
}
