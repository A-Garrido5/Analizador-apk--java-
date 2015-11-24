// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.highlights;

import com.twitter.library.widget.ObservableScrollView;

class q implements Runnable
{
    final /* synthetic */ ObservableScrollView a;
    final /* synthetic */ int b;
    final /* synthetic */ StoriesActivity c;
    
    q(final StoriesActivity c, final ObservableScrollView a, final int b) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    @Override
    public void run() {
        if (!this.c.isFinishing()) {
            final ag ag = (ag)this.a.getTag();
            if (this.a.getChildAt(0).getHeight() <= this.b) {
                ag.D.setVisibility(8);
                return;
            }
            ag.D.setVisibility(0);
        }
    }
}
