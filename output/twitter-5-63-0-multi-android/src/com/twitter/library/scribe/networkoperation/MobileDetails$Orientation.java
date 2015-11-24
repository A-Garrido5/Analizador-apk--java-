// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.scribe.networkoperation;

import android.util.SparseArray;

enum MobileDetails$Orientation
{
    a("PORTRAIT", 0, 1), 
    b("LANDSCAPE", 1, 2);
    
    private static final SparseArray c;
    private final int mValue;
    
    static {
        int i = 0;
        c = new SparseArray();
        for (MobileDetails$Orientation[] values = values(); i < values.length; ++i) {
            final MobileDetails$Orientation mobileDetails$Orientation = values[i];
            MobileDetails$Orientation.c.put(mobileDetails$Orientation.a(), (Object)mobileDetails$Orientation);
        }
    }
    
    private MobileDetails$Orientation(final String s, final int n, final int mValue) {
        this.mValue = mValue;
    }
    
    public static MobileDetails$Orientation a(final int n) {
        return (MobileDetails$Orientation)MobileDetails$Orientation.c.get(n);
    }
    
    public int a() {
        return this.mValue;
    }
}
