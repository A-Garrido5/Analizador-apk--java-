// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.util;

import android.text.TextUtils;

public final class bp
{
    public final CharSequence a;
    public final CharSequence b;
    
    public bp(final CharSequence a, final CharSequence b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this != o) {
            if (o == null || this.getClass() != o.getClass()) {
                return false;
            }
            final bp bp = (bp)o;
            if (!TextUtils.equals(this.a, bp.a) || !TextUtils.equals(this.b, bp.b)) {
                return false;
            }
        }
        return true;
    }
    
    @Override
    public int hashCode() {
        int hashCode;
        if (this.a != null) {
            hashCode = this.a.hashCode();
        }
        else {
            hashCode = 0;
        }
        final int n = 31 * (hashCode + 0);
        final CharSequence b = this.b;
        int hashCode2 = 0;
        if (b != null) {
            hashCode2 = this.b.hashCode();
        }
        return n + hashCode2;
    }
}
