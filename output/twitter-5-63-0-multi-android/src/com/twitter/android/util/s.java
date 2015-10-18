// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.util;

import java.util.Arrays;
import android.graphics.Bitmap;
import java.util.Comparator;

final class s implements Comparator
{
    final /* synthetic */ float a;
    
    s(final float a) {
        this.a = a;
    }
    
    public int a(final ae ae, final ae ae2) {
        final float a = b(ae, this.a);
        final float a2 = b(ae2, this.a);
        if (a < a2) {
            return 1;
        }
        if (a > a2) {
            return -1;
        }
        return 0;
    }
}
