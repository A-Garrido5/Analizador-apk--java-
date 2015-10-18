// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.util.units.duration;

import com.twitter.util.units.Unit;

public abstract class Duration extends Unit
{
    public Duration(final double n) {
        super(n);
    }
    
    public Duration(final Duration duration) {
        super(duration);
    }
}
