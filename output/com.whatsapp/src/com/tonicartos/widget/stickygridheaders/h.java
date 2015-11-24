// 
// Decompiled by Procyon v0.5.30
// 

package com.tonicartos.widget.stickygridheaders;

class h
{
    private int a;
    final StickyGridHeadersGridView b;
    
    private h(final StickyGridHeadersGridView b) {
        this.b = b;
    }
    
    h(final StickyGridHeadersGridView stickyGridHeadersGridView, final g g) {
        this(stickyGridHeadersGridView);
    }
    
    public boolean a() {
        return this.b.hasWindowFocus() && StickyGridHeadersGridView.a(this.b) == this.a;
    }
    
    public void b() {
        this.a = StickyGridHeadersGridView.b(this.b);
    }
}
