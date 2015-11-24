// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.media.filters;

import android.view.View;
import android.view.View$OnLayoutChangeListener;

class h implements View$OnLayoutChangeListener
{
    final /* synthetic */ GLTextureView a;
    
    h(final GLTextureView a) {
        this.a = a;
    }
    
    public void onLayoutChange(final View view, final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final int n7, final int n8) {
        this.a.a(this.a.getSurfaceTexture(), 0, n3 - n, n4 - n2);
    }
}
