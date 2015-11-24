// 
// Decompiled by Procyon v0.5.30
// 

package org.whispersystems;

import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class O
{
    private final SecretKeySpec a;
    private final SecretKeySpec b;
    private final IvParameterSpec c;
    private final int d;
    
    public O(final SecretKeySpec a, final SecretKeySpec b, final IvParameterSpec c, final int d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public SecretKeySpec a() {
        return this.a;
    }
    
    public SecretKeySpec b() {
        return this.b;
    }
    
    public IvParameterSpec c() {
        return this.c;
    }
    
    public int d() {
        return this.d;
    }
}
