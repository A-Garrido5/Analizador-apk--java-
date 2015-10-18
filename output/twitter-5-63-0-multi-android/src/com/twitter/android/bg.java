// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import android.text.TextUtils;

public class bg
{
    private final String a;
    private final String b;
    private String[] c;
    private String[] d;
    
    public bg(final String s, final String s2) {
        this(s, s2, new String[] { "Android" }, new String[] { "fileanandroidbug-email", "triage" });
    }
    
    public bg(final String a, final String b, final String[] c, final String[] d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    private String a() {
        if (this.c == null) {
            return "";
        }
        return String.format("#components=\"%s\"", TextUtils.join((CharSequence)",", (Object[])this.c));
    }
    
    private String b() {
        if (this.d == null) {
            return "";
        }
        return String.format("#labels=\"%s\"", TextUtils.join((CharSequence)",", (Object[])this.d));
    }
    
    public bg a(final String... c) {
        this.c = c;
        return this;
    }
    
    public String a(final String s) {
        return String.format("%s in [%s] %s %s %s #issueType=\"Bug\"", s, this.a, String.format("#project=\"%s\"", this.b), this.a(), this.b());
    }
    
    public bg b(final String... d) {
        this.d = d;
        return this;
    }
    
    @Override
    public String toString() {
        return this.a;
    }
}
