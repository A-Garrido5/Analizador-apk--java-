// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.api.geo;

import com.twitter.library.platform.m;
import java.util.Comparator;

class d implements Comparator
{
    public int a(final m m, final m i) {
        if (m == null && i == null) {
            return 0;
        }
        if (m == null) {
            return 1;
        }
        if (i == null) {
            return -1;
        }
        return i.b() - m.b();
    }
}
