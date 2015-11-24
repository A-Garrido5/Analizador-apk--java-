// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.client;

import android.content.SharedPreferences$OnSharedPreferenceChangeListener;
import java.util.ArrayList;
import java.util.Map;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import com.twitter.util.collection.CollectionUtils;
import java.util.Set;
import android.util.Base64;
import com.twitter.util.f;
import java.io.Serializable;
import java.util.Iterator;
import android.content.SharedPreferences$Editor;

public class m implements SharedPreferences$Editor
{
    final /* synthetic */ k a;
    private SharedPreferences$Editor b;
    
    private m(final k a, final SharedPreferences$Editor b) {
        this.a = a;
        this.b = b;
    }
    
    public m a() {
        final SharedPreferences$Editor b = this.b;
        final Iterator<String> iterator = this.a.getAll().keySet().iterator();
        while (iterator.hasNext()) {
            b.remove((String)iterator.next());
        }
        return this;
    }
    
    public m a(final String s) {
        this.b.remove(this.a.b(s));
        return this;
    }
    
    public m a(final String s, final float n) {
        this.b.putFloat(this.a.b(s), n);
        return this;
    }
    
    public m a(final String s, final int n) {
        this.b.putInt(this.a.b(s), n);
        return this;
    }
    
    public m a(final String s, final long n) {
        this.b.putLong(this.a.b(s), n);
        return this;
    }
    
    public m a(final String s, final Serializable s2) {
        final byte[] a = f.a(s2);
        if (a != null) {
            this.b.putString(this.a.b(s), Base64.encodeToString(a, 0));
        }
        return this;
    }
    
    public m a(final String s, final String s2) {
        this.b.putString(this.a.b(s), s2);
        return this;
    }
    
    public m a(final String s, final Set set) {
        this.a(s, CollectionUtils.a(set));
        return this;
    }
    
    public m a(final String s, final boolean b) {
        this.b.putBoolean(this.a.b(s), b);
        return this;
    }
    
    public void apply() {
        this.b.apply();
        this.b = null;
        this.a.c = null;
    }
    
    @Deprecated
    public boolean commit() {
        final boolean commit = this.b.commit();
        this.b = null;
        this.a.c = null;
        return commit;
    }
}
