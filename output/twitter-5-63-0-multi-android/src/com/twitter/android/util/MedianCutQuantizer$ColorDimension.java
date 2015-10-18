// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.util;

import java.util.Comparator;

enum MedianCutQuantizer$ColorDimension
{
    a("RED", 0, (Comparator)new ag()), 
    b("GREEN", 1, (Comparator)new af()), 
    c("BLUE", 2, (Comparator)new ab());
    
    public final Comparator comparator;
    
    private MedianCutQuantizer$ColorDimension(final String s, final int n, final Comparator comparator) {
        this.comparator = comparator;
    }
}
