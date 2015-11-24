// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.exoplayer;

import android.text.TextUtils;

final class u
{
    public final String a;
    public final boolean b;
    
    public u(final String a, final boolean b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this != o) {
            if (o == null || o.getClass() != u.class) {
                return false;
            }
            final u u = (u)o;
            if (!TextUtils.equals((CharSequence)this.a, (CharSequence)u.a) || this.b != u.b) {
                return false;
            }
        }
        return true;
    }
    
    @Override
    public int hashCode() {
        int hashCode;
        if (this.a == null) {
            hashCode = 0;
        }
        else {
            hashCode = this.a.hashCode();
        }
        final int n = 31 * (hashCode + 31);
        int n2;
        if (this.b) {
            n2 = 1231;
        }
        else {
            n2 = 1237;
        }
        return n2 + n;
    }
}
