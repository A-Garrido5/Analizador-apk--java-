// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.util.units.data;

import com.twitter.util.units.Unit;

public class Kibibytes extends Data
{
    private static final Bytes a;
    
    static {
        a = new Bytes(1024.0);
    }
    
    public Kibibytes(final double n) {
        super(n);
    }
    
    public Kibibytes(final Data data) {
        super(data);
    }
    
    public Bytes b() {
        return Kibibytes.a;
    }
}
