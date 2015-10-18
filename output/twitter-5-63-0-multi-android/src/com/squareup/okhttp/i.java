// 
// Decompiled by Procyon v0.5.30
// 

package com.squareup.okhttp;

import java.io.UnsupportedEncodingException;

public final class i
{
    private final String a;
    
    private i(final String a) {
        this.a = a;
    }
    
    public static i a(final String s, final String s2) {
        try {
            return new i("Basic " + bk.a((s + ":" + s2).getBytes("ISO-8859-1")).b());
        }
        catch (UnsupportedEncodingException ex) {
            throw new AssertionError();
        }
    }
    
    public String a() {
        return this.a;
    }
    
    @Override
    public boolean equals(final Object o) {
        return o instanceof i && ((i)o).a.equals(this.a);
    }
    
    @Override
    public int hashCode() {
        return this.a.hashCode();
    }
    
    @Override
    public String toString() {
        return this.a;
    }
}
