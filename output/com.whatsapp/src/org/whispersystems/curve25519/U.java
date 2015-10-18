// 
// Decompiled by Procyon v0.5.30
// 

package org.whispersystems.curve25519;

public class U
{
    public static int a;
    public int[] b;
    public int[] c;
    public int[] d;
    
    public U() {
        this.d = new int[10];
        this.b = new int[10];
        this.c = new int[10];
    }
    
    public U(final int[] d, final int[] b, final int[] c) {
        this.d = d;
        this.b = b;
        this.c = c;
    }
}
