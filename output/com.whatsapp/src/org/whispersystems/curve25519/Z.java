// 
// Decompiled by Procyon v0.5.30
// 

package org.whispersystems.curve25519;

public class Z
{
    private final byte[] a;
    private final byte[] b;
    
    Z(final byte[] b, final byte[] a) {
        this.b = b;
        this.a = a;
    }
    
    public byte[] a() {
        return this.a;
    }
    
    public byte[] b() {
        return this.b;
    }
}
