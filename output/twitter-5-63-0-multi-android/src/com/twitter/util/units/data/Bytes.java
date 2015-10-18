// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.util.units.data;

import com.twitter.util.units.Unit;

public class Bytes extends Data
{
    public static final Bytes a;
    
    static {
        a = new Bytes(1.0);
    }
    
    public Bytes(final double n) {
        super(n);
    }
    
    public Bytes b() {
        return Bytes.a;
    }
}
