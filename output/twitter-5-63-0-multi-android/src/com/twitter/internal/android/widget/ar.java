// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.internal.android.widget;

import java.util.Comparator;

class ar implements Comparator
{
    public int a(final jx jx, final jx jx2) {
        int n = Integer.MAX_VALUE;
        int r = jx.r();
        if (r == -1) {
            r = n;
        }
        final int r2 = jx2.r();
        if (r2 != -1) {
            n = r2;
        }
        if (r > n) {
            return 1;
        }
        if (r < n) {
            return -1;
        }
        return 0;
    }
}
