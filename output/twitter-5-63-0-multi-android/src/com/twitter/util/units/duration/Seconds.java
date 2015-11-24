// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.util.units.duration;

import com.twitter.util.units.Unit;

public class Seconds extends Duration
{
    public static final Seconds a;
    private static final Milliseconds b;
    
    static {
        a = new Seconds(1.0);
        b = new Milliseconds(1000.0);
    }
    
    public Seconds(final double n) {
        super(n);
    }
    
    public Seconds(final Duration duration) {
        super(duration);
    }
    
    public Milliseconds b() {
        return Seconds.b;
    }
}
