// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.common;

import java.util.Comparator;

final class h implements Comparator
{
    public int a(final byte[] array, final byte[] array2) {
        for (int min = Math.min(array.length, array2.length), i = 0; i < min; ++i) {
            final int n = 0xFF & array[i];
            final int n2 = 0xFF & array2[i];
            if (n != n2) {
                return n - n2;
            }
        }
        return array.length - array2.length;
    }
}
