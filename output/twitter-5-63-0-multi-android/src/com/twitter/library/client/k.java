// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.client;

import android.content.SharedPreferences$OnSharedPreferenceChangeListener;
import java.util.Set;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.Map;
import android.content.SharedPreferences$Editor;
import com.twitter.util.f;
import android.util.Base64;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;

public class k implements SharedPreferences
{
    private final String a;
    private final SharedPreferences b;
    private m c;
    
    public k(final Context context, final String s) {
        this(context, s, null);
    }
    
    public k(final Context context, final String s, final String a) {
        this.a = a;
        this.b = context.getSharedPreferences(s, 0);
    }
    
    private String b(final String s) {
        if (this.a == null) {
            return s;
        }
        return this.a + '_' + s;
    }
    
    @SuppressLint({ "CommitPrefEdits" })
    public m a() {
        if (this.c == null) {
            this.c = new m(this, this.b.edit(), null);
        }
        return this.c;
    }
    
    public Object a(final String s) {
        final String string = this.b.getString(this.b(s), (String)null);
        Object a = null;
        if (string != null) {
            a = f.a(Base64.decode(string, 0));
        }
        return a;
    }
    
    public boolean contains(final String s) {
        return this.b.contains(this.b(s));
    }
    
    public Map getAll() {
        final Map all = this.b.getAll();
        final String a = this.a;
        if (a != null) {
            final ArrayList<String> list = new ArrayList<String>();
            for (final String s : all.keySet()) {
                if (!s.startsWith(a)) {
                    list.add(s);
                }
            }
            final Iterator<String> iterator2 = list.iterator();
            while (iterator2.hasNext()) {
                all.remove(iterator2.next());
            }
        }
        return all;
    }
    
    public boolean getBoolean(final String s, final boolean b) {
        return this.b.getBoolean(this.b(s), b);
    }
    
    public float getFloat(final String s, final float n) {
        return this.b.getFloat(this.b(s), n);
    }
    
    public int getInt(final String s, final int n) {
        return this.b.getInt(this.b(s), n);
    }
    
    public long getLong(final String s, final long n) {
        return this.b.getLong(this.b(s), n);
    }
    
    public String getString(final String s, final String s2) {
        return this.b.getString(this.b(s), s2);
    }
    
    public Set getStringSet(final String s, final Set set) {
        final Set set2 = (Set)this.a(s);
        if (set2 == null) {
            return set;
        }
        return set2;
    }
    
    public void registerOnSharedPreferenceChangeListener(final SharedPreferences$OnSharedPreferenceChangeListener sharedPreferences$OnSharedPreferenceChangeListener) {
        this.b.registerOnSharedPreferenceChangeListener(sharedPreferences$OnSharedPreferenceChangeListener);
    }
    
    public void unregisterOnSharedPreferenceChangeListener(final SharedPreferences$OnSharedPreferenceChangeListener sharedPreferences$OnSharedPreferenceChangeListener) {
        this.b.unregisterOnSharedPreferenceChangeListener(sharedPreferences$OnSharedPreferenceChangeListener);
    }
}
