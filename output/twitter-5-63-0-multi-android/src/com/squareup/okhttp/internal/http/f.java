// 
// Decompiled by Procyon v0.5.30
// 

package com.squareup.okhttp.internal.http;

import java.util.ArrayList;
import java.util.List;
import java.util.Collection;
import java.util.Arrays;

public final class f
{
    private final String[] a;
    
    private f(final h h) {
        this.a = h.a.toArray(new String[h.a.size()]);
    }
    
    private static String a(final String[] array, final String s) {
        for (int i = -2 + array.length; i >= 0; i -= 2) {
            if (s.equalsIgnoreCase(array[i])) {
                return array[i + 1];
            }
        }
        return null;
    }
    
    public int a() {
        return this.a.length / 2;
    }
    
    public String a(final int n) {
        final int n2 = n * 2;
        if (n2 < 0 || n2 >= this.a.length) {
            return null;
        }
        return this.a[n2];
    }
    
    public String a(final String s) {
        return a(this.a, s);
    }
    
    public h b() {
        final h h = new h();
        h.a.addAll(Arrays.asList(this.a));
        return h;
    }
    
    public String b(final int n) {
        final int n2 = 1 + n * 2;
        if (n2 < 0 || n2 >= this.a.length) {
            return null;
        }
        return this.a[n2];
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        for (int i = 0; i < this.a(); ++i) {
            sb.append(this.a(i)).append(": ").append(this.b(i)).append("\n");
        }
        return sb.toString();
    }
}
