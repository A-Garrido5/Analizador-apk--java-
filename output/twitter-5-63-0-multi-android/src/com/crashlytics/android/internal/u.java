// 
// Decompiled by Procyon v0.5.30
// 

package com.crashlytics.android.internal;

import java.util.Map;

final class u
{
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final long i;
    public final W j;
    public final Map k;
    private String l;
    
    private u(final String a, final String b, final String c, final String d, final String e, final String f, final String g, final String h, final long i, final W j, final Map k) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
        this.j = j;
        this.k = k;
    }
    
    public static final u a(final String s, final String s2, final String s3, final String s4, final String s5, final String s6, final String s7, final String s8, final W w, final Map map) {
        return new u(s, s2, s3, s4, s5, s6, s7, s8, System.currentTimeMillis(), w, map);
    }
    
    @Override
    public final String toString() {
        if (this.l == null) {
            final StringBuilder sb = new StringBuilder();
            sb.append("[");
            sb.append(this.getClass().getSimpleName());
            sb.append(": appBundleId=");
            sb.append(this.a);
            sb.append(", executionId=");
            sb.append(this.b);
            sb.append(", installationId=");
            sb.append(this.c);
            sb.append(", androidId=");
            sb.append(this.d);
            sb.append(", osVersion=");
            sb.append(this.e);
            sb.append(", deviceModel=");
            sb.append(this.f);
            sb.append(", appVersionCode=");
            sb.append(this.g);
            sb.append(", appVersionName=");
            sb.append(this.h);
            sb.append(", timestamp=");
            sb.append(this.i);
            sb.append(", type=");
            sb.append(this.j);
            sb.append(", details=");
            sb.append(this.k.toString());
            sb.append("]");
            this.l = sb.toString();
        }
        return this.l;
    }
}
