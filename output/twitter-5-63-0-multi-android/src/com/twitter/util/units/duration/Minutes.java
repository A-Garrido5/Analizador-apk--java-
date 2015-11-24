// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.util.units.duration;

import com.twitter.util.units.Unit;

public class Minutes extends Duration
{
    private static final Milliseconds a;
    
    static {
        a = new Milliseconds(60000.0);
    }
    
    public Minutes(final double n) {
        super(n);
    }
    
    public Milliseconds b() {
        return Minutes.a;
    }
}
