// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

class fq implements bv
{
    final MediaView$MediaViewPager a;
    final MediaView b;
    
    fq(final MediaView$MediaViewPager a, final MediaView b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public gl a(final float n, final float n2) {
        if (!this.a.g.isFinishing()) {
            final PhotoView a = MediaView.a(this.a.g, MediaView.c(this.a.g, this.a.getCurrentItem()));
            int a2;
            boolean b;
            if (a != null) {
                a2 = (a.a(n, n2) ? 1 : 0);
                b = a.b(n, n2);
            }
            else {
                b = false;
                a2 = 0;
            }
            if (a2 != 0) {
                if (b) {
                    return gl.BOTH;
                }
                return gl.LEFT;
            }
            else if (b) {
                return gl.RIGHT;
            }
        }
        return gl.NONE;
    }
}
