// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.provider;

import com.twitter.library.api.PromotedContent;

final class cj
{
    public final long a;
    public final PromotedContent b;
    
    cj(final long a, final PromotedContent b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this != o) {
            if (o == null || this.getClass() != o.getClass()) {
                return false;
            }
            final cj cj = (cj)o;
            if (this.a != cj.a) {
                return false;
            }
            if (this.b != null) {
                return this.b.equals(cj.b);
            }
            if (cj.b != null) {
                return false;
            }
        }
        return true;
    }
    
    @Override
    public int hashCode() {
        final int n = 31 * (int)(this.a ^ this.a >>> 32);
        int hashCode;
        if (this.b != null) {
            hashCode = this.b.hashCode();
        }
        else {
            hashCode = 0;
        }
        return hashCode + n;
    }
}
