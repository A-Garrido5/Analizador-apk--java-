// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import android.view.animation.Interpolator;
import android.content.Context;
import android.widget.Scroller;

class kc extends Scroller
{
    private int a;
    
    private kc(final Context context, final Interpolator interpolator) {
        super(context, interpolator);
        this.a = 250;
    }
    
    private void a(final int a) {
        this.a = a;
    }
    
    public void startScroll(final int n, final int n2, final int n3, final int n4, final int n5) {
        super.startScroll(n, n2, n3, n4, this.a);
    }
}
