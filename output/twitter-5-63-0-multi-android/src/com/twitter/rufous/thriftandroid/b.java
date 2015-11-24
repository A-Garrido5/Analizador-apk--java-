// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.rufous.thriftandroid;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class b
{
    private Map a;
    
    public RufousScribeLogCollection a() {
        if (this.a == null) {
            throw new IllegalArgumentException("Required field 'logs' was not present! Struct: " + this.toString());
        }
        return new RufousScribeLogCollection(this.a);
    }
    
    public b a(final RufousScribeLogCollection$_Fields rufousScribeLogCollection$_Fields, final Object o, final Object o2) {
        switch (com.twitter.rufous.thriftandroid.a.a[rufousScribeLogCollection$_Fields.ordinal()]) {
            default: {
                return this;
            }
            case 1: {
                if (o instanceof String && o2 instanceof List) {
                    if (this.a == null) {
                        this.a = new HashMap();
                    }
                    this.a.put(o, o2);
                    return this;
                }
                throw new IllegalArgumentException("[String,List<ByteBuffer>] is expected, but [" + o.getClass().toString() + ", " + o2.getClass().toString() + "] type found.");
            }
        }
    }
}
