// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.lists;

import android.os.Bundle;

public class g
{
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final int d;
    public final String e;
    private final Bundle f;
    
    public g(final Bundle f, final boolean c, final boolean a, final int d, final String e) {
        this.f = f;
        this.a = a;
        this.b = (d != -1);
        this.d = d;
        this.c = c;
        this.e = e;
    }
    
    public static g a(final Bundle bundle) {
        int int1 = -1;
        boolean boolean1;
        boolean boolean2;
        String string;
        if (bundle != null) {
            boolean1 = bundle.getBoolean("is_me");
            int1 = bundle.getInt("type", int1);
            boolean2 = bundle.getBoolean("force_restart");
            string = bundle.getString("screen_name");
        }
        else {
            boolean2 = false;
            boolean1 = false;
            string = null;
        }
        return new g(bundle, boolean2, boolean1, int1, string);
    }
    
    public Bundle a() {
        final Bundle bundle = new Bundle();
        if (this.f != null) {
            bundle.putAll(this.f);
        }
        int n;
        if (this.b) {
            n = 1;
        }
        else {
            n = 0;
        }
        bundle.putInt("chmode", n);
        bundle.putBoolean("is_me", this.a);
        bundle.putInt("type", this.d);
        bundle.putBoolean("force_restart", this.c);
        bundle.putString("screen_name", this.e);
        return bundle;
    }
}
