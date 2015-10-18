// 
// Decompiled by Procyon v0.5.30
// 

package com.google;

final class bD extends bf
{
    private bD() {
        super(null);
    }
    
    bD(final f_ f_) {
        this();
    }
    
    @Override
    boolean a(final int n, final int n2) {
        return (0x1 & (0x1 & n + n2) + n * n2 % 3) == 0x0;
    }
}
