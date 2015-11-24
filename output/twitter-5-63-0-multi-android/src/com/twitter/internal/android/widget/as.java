// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.internal.android.widget;

import java.util.Comparator;

class as implements Comparator
{
    public int a(final jx jx, final jx jx2) {
        if (jx.s() > jx2.s()) {
            return 1;
        }
        if (jx.s() < jx2.s()) {
            return -1;
        }
        return 0;
    }
}
