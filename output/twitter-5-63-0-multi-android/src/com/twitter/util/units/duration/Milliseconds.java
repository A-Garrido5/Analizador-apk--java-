// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.util.units.duration;

import com.twitter.util.units.Unit;

public class Milliseconds extends Duration
{
    public static final Milliseconds a;
    public static final Milliseconds b;
    
    static {
        a = new Milliseconds(0.0);
        b = new Milliseconds(1.0);
    }
    
    public Milliseconds(final double n) {
        super(n);
    }
    
    public Milliseconds(final Duration duration) {
        super(duration);
    }
    
    public Milliseconds b() {
        return Milliseconds.b;
    }
}
