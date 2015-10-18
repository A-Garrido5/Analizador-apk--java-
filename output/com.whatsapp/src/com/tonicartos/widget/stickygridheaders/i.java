// 
// Decompiled by Procyon v0.5.30
// 

package com.tonicartos.widget.stickygridheaders;

import android.view.View;

class i extends h implements Runnable
{
    final StickyGridHeadersGridView c;
    
    private i(final StickyGridHeadersGridView c) {
        super(this.c = c, null);
    }
    
    i(final StickyGridHeadersGridView stickyGridHeadersGridView, final g g) {
        this(stickyGridHeadersGridView);
    }
    
    @Override
    public void run() {
        final View a = this.c.a(this.c.h);
        if (a != null) {
            final long a2 = StickyGridHeadersGridView.a(this.c, this.c.h);
            if (this.a() && !this.c.v && this.c.b(a, a2)) {
                this.c.y = -2;
                this.c.setPressed(false);
                a.setPressed(false);
                if (StickyGridHeadersGridView.c == 0) {
                    return;
                }
            }
            this.c.y = 2;
        }
    }
}
