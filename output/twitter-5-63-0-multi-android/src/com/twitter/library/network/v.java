// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.network;

import android.util.Pair;
import java.util.Comparator;

class v implements Comparator
{
    public int a(final Pair pair, final Pair pair2) {
        if (pair == null && pair2 == null) {
            return 0;
        }
        if (pair == null) {
            return 1;
        }
        if (pair2 == null) {
            return -1;
        }
        return ((String)pair.first).compareTo((String)pair2.first);
    }
}
