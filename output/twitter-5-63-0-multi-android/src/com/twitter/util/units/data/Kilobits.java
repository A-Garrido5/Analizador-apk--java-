// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.util.units.data;

import com.twitter.util.units.Unit;

public class Kilobits extends Data
{
    private static final Bytes a;
    
    static {
        a = new Bytes(125.0);
    }
    
    public Kilobits(final Data data) {
        super(data);
    }
    
    public Bytes b() {
        return Kilobits.a;
    }
}
