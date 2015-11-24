// 
// Decompiled by Procyon v0.5.30
// 

package com.google;

import java.io.Serializable;
import java.util.Comparator;

final class s implements Comparator, Serializable
{
    private s() {
    }
    
    s(final dX dx) {
        this();
    }
    
    public int a(final aU au, final aU au2) {
        final boolean e = y.e;
        final int intValue = au.d().get(A.STRUCTURED_APPEND_SEQUENCE);
        final int intValue2 = au2.d().get(A.STRUCTURED_APPEND_SEQUENCE);
        int n;
        if (intValue < intValue2) {
            n = -1;
        }
        else {
            if (intValue > intValue2) {
                return 1;
            }
            n = 0;
            if (e) {
                ++fN.a;
                return 0;
            }
        }
        return n;
    }
    
    @Override
    public int compare(final Object o, final Object o2) {
        return this.a((aU)o, (aU)o2);
    }
}
