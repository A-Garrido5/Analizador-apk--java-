// 
// Decompiled by Procyon v0.5.30
// 

package com.google;

import java.util.BitSet;

final class eH extends e_
{
    @Override
    public void a(final c3 c3, final Object o) {
        this.a(c3, (BitSet)o);
    }
    
    public void a(final c3 c3, final BitSet set) {
        final boolean l = cK.l;
        if (set == null) {
            c3.i();
            return;
        }
        c3.e();
        int i = 0;
        while (i < set.length()) {
            boolean b;
            if (set.get(i)) {
                b = true;
            }
            else {
                b = false;
            }
            c3.a((long)(b ? 1 : 0));
            ++i;
            if (l) {
                break;
            }
        }
        c3.c();
    }
}
