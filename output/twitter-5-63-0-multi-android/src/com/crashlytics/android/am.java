// 
// Decompiled by Procyon v0.5.30
// 

package com.crashlytics.android;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;

final class am
{
    private final byte[] a;
    private volatile int b;
    
    static {
        new am(new byte[0]);
    }
    
    private am(final byte[] a) {
        this.b = 0;
        this.a = a;
    }
    
    public static am a(final String s) {
        try {
            return new am(s.getBytes("UTF-8"));
        }
        catch (UnsupportedEncodingException ex) {
            throw new RuntimeException("UTF-8 not supported.", ex);
        }
    }
    
    public static am a(final byte[] array, final int n, final int n2) {
        final byte[] array2 = new byte[n2];
        System.arraycopy(array, 0, array2, 0, n2);
        return new am(array2);
    }
    
    public final int a() {
        return this.a.length;
    }
    
    public final void a(final byte[] array, final int n, final int n2, final int n3) {
        System.arraycopy(this.a, n, array, n2, n3);
    }
    
    public final InputStream b() {
        return new ByteArrayInputStream(this.a);
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o != this) {
            if (!(o instanceof am)) {
                return false;
            }
            final am am = (am)o;
            final int length = this.a.length;
            if (length != am.a.length) {
                return false;
            }
            final byte[] a = this.a;
            final byte[] a2 = am.a;
            for (int i = 0; i < length; ++i) {
                if (a[i] != a2[i]) {
                    return false;
                }
            }
        }
        return true;
    }
    
    @Override
    public final int hashCode() {
        int b = this.b;
        if (b == 0) {
            final byte[] a = this.a;
            final int length = this.a.length;
            int i = 0;
            b = length;
            while (i < length) {
                final int n = b * 31 + a[i];
                ++i;
                b = n;
            }
            if (b == 0) {
                b = 1;
            }
            this.b = b;
        }
        return b;
    }
}
