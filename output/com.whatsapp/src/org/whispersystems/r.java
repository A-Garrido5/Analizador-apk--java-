// 
// Decompiled by Procyon v0.5.30
// 

package org.whispersystems;

public class r
{
    private final byte[] a;
    private final byte[] b;
    
    public r(final byte[] array) {
        final int a = B.a;
        final byte[][] b = m.b(array, 32, 32);
        this.a = b[0];
        this.b = b[1];
        if (bO.s != 0) {
            B.a = a + 1;
        }
    }
    
    public byte[] a() {
        return this.b;
    }
    
    public byte[] b() {
        return this.a;
    }
}
