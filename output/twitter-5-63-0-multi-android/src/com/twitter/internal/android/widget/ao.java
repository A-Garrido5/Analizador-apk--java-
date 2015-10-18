// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.internal.android.widget;

import java.util.Comparator;

class ao implements Comparator
{
    public int a(final jx jx, final jx jx2) {
        int n = 1;
        final int n2 = jx.j() & jx2.j();
        if (n2 == n || n2 == 2) {
            n = 0;
        }
        else if ((0x1 & jx.j()) == 0x0) {
            if ((0x2 & jx.j()) != 0x0) {
                return -1;
            }
            return 0;
        }
        return n;
    }
}
