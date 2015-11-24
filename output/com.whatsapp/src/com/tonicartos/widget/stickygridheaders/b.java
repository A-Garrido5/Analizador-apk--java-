// 
// Decompiled by Procyon v0.5.30
// 

package com.tonicartos.widget.stickygridheaders;

import android.view.View;
import android.view.ViewConfiguration;

final class b implements Runnable
{
    final StickyGridHeadersGridView a;
    
    b(final StickyGridHeadersGridView a) {
        this.a = a;
    }
    
    @Override
    public void run() {
        final int c = StickyGridHeadersGridView.c;
        if (this.a.y == 0) {
            this.a.y = 1;
            final View a = this.a.a(this.a.h);
            if (a != null && !a.hasFocusable()) {
                if (!this.a.v) {
                    a.setPressed(true);
                    this.a.setPressed(true);
                    this.a.refreshDrawableState();
                    final int longPressTimeout = ViewConfiguration.getLongPressTimeout();
                    Label_0160: {
                        if (this.a.isLongClickable()) {
                            if (this.a.z == null) {
                                this.a.z = new i(this.a, null);
                            }
                            this.a.z.b();
                            this.a.postDelayed((Runnable)this.a.z, (long)longPressTimeout);
                            if (c == 0) {
                                break Label_0160;
                            }
                        }
                        this.a.y = 2;
                    }
                    if (c == 0) {
                        return;
                    }
                }
                this.a.y = 2;
            }
        }
    }
}
