// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.widget;

import android.view.View;
import com.twitter.library.util.b;

class bx implements Runnable
{
    final /* synthetic */ Runnable a;
    final /* synthetic */ ExpandableViewHost b;
    
    bx(final ExpandableViewHost b, final Runnable a) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public void run() {
        com.twitter.library.util.b.a((View)this.b, this.b.e, 0, 266, this.b.d);
        if (this.a != null) {
            this.b.postDelayed(this.a, 266L);
        }
    }
}
