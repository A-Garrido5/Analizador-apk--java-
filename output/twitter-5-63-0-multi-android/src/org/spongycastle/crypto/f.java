// 
// Decompiled by Procyon v0.5.30
// 

package org.spongycastle.crypto;

import java.security.SecureRandom;

public class f
{
    private SecureRandom a;
    private int b;
    
    public f(final SecureRandom a, final int b) {
        this.a = a;
        this.b = b;
    }
    
    public SecureRandom a() {
        return this.a;
    }
    
    public int b() {
        return this.b;
    }
}
