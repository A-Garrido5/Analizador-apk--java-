// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.widget;

import android.graphics.Rect;

class fx
{
    public final int a;
    public Rect b;
    public final String c;
    
    public fx(final int n, final int n2, final int n3, final int n4, final int a, final String c) {
        this.b = new Rect(n, n2, n3 + 1, n4 + 1);
        if (this.b.isEmpty()) {
            this.b = new Rect(0, 0, 1, 1);
        }
        this.a = a;
        this.c = c;
    }
    
    public boolean a(final int n, final int n2) {
        return this.b.contains(n, n2);
    }
}
