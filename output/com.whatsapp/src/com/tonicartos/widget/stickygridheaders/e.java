// 
// Decompiled by Procyon v0.5.30
// 

package com.tonicartos.widget.stickygridheaders;

import android.view.View;

class e implements Runnable
{
    final View a;
    final j b;
    final StickyGridHeadersGridView c;
    
    e(final StickyGridHeadersGridView c, final View a, final j b) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    @Override
    public void run() {
        this.c.y = -1;
        this.a.setPressed(false);
        this.c.setPressed(false);
        if (!this.c.v) {
            this.b.run();
        }
    }
}
