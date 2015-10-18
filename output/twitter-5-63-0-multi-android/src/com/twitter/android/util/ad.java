// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.util;

import java.util.Arrays;

class ad
{
    int[] a;
    int[] b;
    
    ad(final int[] array) {
        int i = 0;
        int n = -1;
        this.a = null;
        this.b = null;
        final int length = array.length;
        final int[] array2 = new int[length];
        for (int j = 0; j < length; ++j) {
            array2[j] = (0xFFFFFF & array[j]);
        }
        Arrays.sort(array2);
        int k = 0;
        int n2 = n;
        int n3 = n;
        while (k < array2.length) {
            if (array2[k] != n2) {
                ++n3;
                n2 = array2[k];
            }
            ++k;
        }
        final int n4 = n3 + 1;
        this.a = new int[n4];
        this.b = new int[n4];
        int n5 = n;
        while (i < array2.length) {
            if (array2[i] != n) {
                ++n5;
                n = array2[i];
                this.a[n5] = n;
                this.b[n5] = 1;
            }
            else {
                final int[] b = this.b;
                ++b[n5];
            }
            ++i;
        }
    }
    
    public int a() {
        if (this.a == null) {
            return 0;
        }
        return this.a.length;
    }
    
    public int a(final int n) {
        return this.a[n];
    }
    
    public int b(final int n) {
        return this.b[n];
    }
}
