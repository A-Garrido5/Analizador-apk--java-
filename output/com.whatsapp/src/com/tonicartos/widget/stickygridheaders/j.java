// 
// Decompiled by Procyon v0.5.30
// 

package com.tonicartos.widget.stickygridheaders;

import android.view.View;

class j extends h implements Runnable
{
    int c;
    final StickyGridHeadersGridView d;
    
    private j(final StickyGridHeadersGridView d) {
        super(this.d = d, null);
    }
    
    j(final StickyGridHeadersGridView stickyGridHeadersGridView, final g g) {
        this(stickyGridHeadersGridView);
    }
    
    @Override
    public void run() {
        if (!this.d.v && this.d.d != null && this.d.d.getCount() > 0 && this.c != -1 && this.c < this.d.d.getCount() && this.a()) {
            final View a = this.d.a(this.c);
            if (a != null) {
                this.d.a(a, StickyGridHeadersGridView.a(this.d, this.c));
            }
        }
    }
}
