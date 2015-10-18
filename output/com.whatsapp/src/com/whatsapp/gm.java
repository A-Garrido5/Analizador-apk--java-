// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

public class gm
{
    public static int b;
    private final byte[] a;
    
    public gm(final byte[] a) {
        this.a = a;
    }
    
    public byte[] a() {
        return this.a;
    }
    
    @Override
    public String toString() {
        return new String(this.a);
    }
}
