// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.util.units.data;

import com.twitter.util.units.Unit;

public abstract class Data extends Unit
{
    public Data(final double n) {
        super(n);
    }
    
    public Data(final Data data) {
        super(data);
    }
}
