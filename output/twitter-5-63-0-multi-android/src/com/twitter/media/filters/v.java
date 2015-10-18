// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.media.filters;

class v extends j
{
    final /* synthetic */ GLTextureView j;
    
    public v(final GLTextureView j, final boolean b) {
        this.j = j;
        int n;
        if (b) {
            n = 16;
        }
        else {
            n = 0;
        }
        super(j, 8, 8, 8, 0, n, 0);
    }
}
