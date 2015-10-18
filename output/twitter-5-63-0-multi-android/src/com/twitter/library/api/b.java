// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.api;

import android.content.Context;

public class b
{
    private String a;
    private boolean b;
    
    public b(final String a, final boolean b) {
        if (a == null) {
            this.a = "";
        }
        else {
            this.a = a;
        }
        this.b = b;
    }
    
    public static b a(final Context context) {
        final ap b = b(context);
        if (b != null) {
            return new b(b.a(), b.b());
        }
        return null;
    }
    
    private static ap b(final Context context) {
        try {
            return ao.b(context);
        }
        catch (Exception ex) {
            return null;
        }
    }
    
    public String a() {
        return this.a;
    }
    
    public boolean b() {
        return this.b;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this != o) {
            if (!(o instanceof b)) {
                return false;
            }
            final b b = (b)o;
            if (this.b != b.b) {
                return false;
            }
            if (!this.a.equals(b.a)) {
                return false;
            }
        }
        return true;
    }
    
    @Override
    public int hashCode() {
        final int n = 31 * this.a.hashCode();
        int n2;
        if (this.b) {
            n2 = 1;
        }
        else {
            n2 = 0;
        }
        return n2 + n;
    }
}
