// 
// Decompiled by Procyon v0.5.30
// 

package com.crashlytics.android.internal;

import android.os.Build$VERSION;
import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;
import android.content.Context;

public class aj
{
    private final String a;
    private final Context b;
    
    public aj(final ck ck) {
        if (ck.w() == null) {
            throw new IllegalStateException("Cannot get directory before context has been set. Call Sdk.start() first");
        }
        this.b = ck.w();
        this.a = ck.getClass().getName();
    }
    
    public SharedPreferences a() {
        return this.b.getSharedPreferences(this.a, 0);
    }
    
    public boolean a(final SharedPreferences$Editor sharedPreferences$Editor) {
        if (Build$VERSION.SDK_INT >= 9) {
            sharedPreferences$Editor.apply();
            return true;
        }
        return sharedPreferences$Editor.commit();
    }
    
    public SharedPreferences$Editor b() {
        return this.a().edit();
    }
}
