// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.widget.highlights;

import android.content.res.Resources;

public class p implements a
{
    private final int a;
    private final int b;
    private final int c;
    private final int d;
    private final float e;
    
    public p(final Resources resources) {
        this.a = resources.getColor(2131689585);
        this.b = resources.getColor(2131689584);
        this.c = resources.getColor(2131689583);
        this.d = resources.getInteger(2131623966);
        this.e = resources.getFraction(2131755011, 1, 1);
    }
    
    @Override
    public int[] a() {
        final int n = 2 + Math.max(0, this.d);
        final int[] array = new int[n];
        array[0] = this.c;
        array[n - 1] = this.a;
        for (int i = 1; i < n - 1; ++i) {
            final float n2 = i / (n - 1.0f);
            int n3;
            if (n2 < this.e) {
                n3 = com.twitter.android.util.p.b(this.c, this.b, n2 / this.e);
            }
            else {
                n3 = com.twitter.android.util.p.c(this.b, this.a, (n2 - this.e) / (1.0f - this.e));
            }
            array[i] = n3;
        }
        return array;
    }
}
