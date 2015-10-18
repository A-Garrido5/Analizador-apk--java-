// 
// Decompiled by Procyon v0.5.30
// 

package com.google;

import java.util.List;

public final class fH
{
    public static boolean c;
    private final List a;
    private final L b;
    
    public fH(final L b, final List a) {
        final boolean c = fH.c;
        this.b = b;
        this.a = a;
        if (fN.a != 0) {
            fH.c = !c;
        }
    }
    
    public List a() {
        return this.a;
    }
    
    public L b() {
        return this.b;
    }
}
