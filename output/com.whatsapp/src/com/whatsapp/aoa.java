// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import java.util.Arrays;

final class aoa
{
    private final byte[] a;
    private final String b;
    
    public aoa(final String b, final byte[] a) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this != o) {
            if (o == null) {
                return false;
            }
            if (this.getClass() != o.getClass()) {
                return false;
            }
            final aoa aoa = (aoa)o;
            if (!Arrays.equals(this.a, aoa.a)) {
                return false;
            }
            if (this.b == null) {
                if (aoa.b != null) {
                    return false;
                }
            }
            else if (!this.b.equals(aoa.b)) {
                return false;
            }
        }
        return true;
    }
    
    @Override
    public int hashCode() {
        final int n = 31 * (31 + Arrays.hashCode(this.a));
        int hashCode;
        if (this.b == null) {
            hashCode = 0;
        }
        else {
            hashCode = this.b.hashCode();
        }
        return hashCode + n;
    }
}
