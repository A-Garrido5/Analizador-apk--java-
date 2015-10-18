// 
// Decompiled by Procyon v0.5.30
// 

package org.whispersystems.curve25519;

public class ai extends RuntimeException
{
    public static boolean b;
    private final Throwable a;
    
    public ai(final String s) {
        super(s);
        this.a = null;
    }
    
    public ai(final Throwable a) {
        this.a = a;
    }
    
    public Throwable a() {
        return this.a;
    }
}
