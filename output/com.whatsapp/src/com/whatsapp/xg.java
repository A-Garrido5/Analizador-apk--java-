// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.text.TextUtils;

public class xg
{
    final String a;
    final long b;
    
    public xg(final long b, final String a) {
        this.b = b;
        this.a = a;
    }
    
    public String a() {
        return this.a;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this != o) {
            if (o == null || o.getClass() != this.getClass()) {
                return false;
            }
            final xg xg = (xg)o;
            if (this.b != xg.b || !TextUtils.equals((CharSequence)this.a, (CharSequence)xg.a)) {
                return false;
            }
        }
        return true;
    }
    
    @Override
    public int hashCode() {
        final int n = 31 * (int)(this.b ^ this.b >>> 32);
        int hashCode;
        if (this.a != null) {
            hashCode = this.a.hashCode();
        }
        else {
            hashCode = 0;
        }
        return hashCode + n;
    }
    
    @Override
    public String toString() {
        return this.b + ":" + this.a;
    }
}
