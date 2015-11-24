// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import java.util.Arrays;

public class i
{
    private byte[] a;
    private byte[] b;
    private String c;
    
    public i(final String c, final byte[] b, final byte[] a) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    static String a(final i i) {
        return i.c;
    }
    
    static byte[] b(final i i) {
        return i.a;
    }
    
    static byte[] c(final i i) {
        return i.b;
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
            final i i = (i)o;
            if (!Arrays.equals(this.a, i.a)) {
                return false;
            }
            if (!Arrays.equals(this.b, i.b)) {
                return false;
            }
            if (this.c == null) {
                if (i.c != null) {
                    return false;
                }
            }
            else if (!this.c.equals(i.c)) {
                return false;
            }
        }
        return true;
    }
    
    @Override
    public int hashCode() {
        final int n = 31 * (31 * (31 + Arrays.hashCode(this.a)) + Arrays.hashCode(this.b));
        int hashCode;
        if (this.c == null) {
            hashCode = 0;
        }
        else {
            hashCode = this.c.hashCode();
        }
        return hashCode + n;
    }
}
