// 
// Decompiled by Procyon v0.5.30
// 

package com.google;

final class bN extends bf
{
    private bN() {
        super(null);
    }
    
    bN(final f_ f_) {
        this();
    }
    
    @Override
    boolean a(final int n, final int n2) {
        final int n3 = n * n2;
        return (n3 & 0x1) + n3 % 3 == 0;
    }
}
