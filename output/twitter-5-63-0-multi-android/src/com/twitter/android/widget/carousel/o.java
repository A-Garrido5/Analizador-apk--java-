// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.widget.carousel;

import com.twitter.android.av.FullscreenViewMoreVideoPlayerChromeView;
import com.twitter.android.av.al;
import com.twitter.library.av.control.f;
import android.content.Context;

public class o
{
    private Context a;
    private f b;
    private d c;
    private a d;
    private b e;
    private al f;
    
    public o(final Context a) {
        this.a = a;
    }
    
    public ViewMoreCarouselView a() {
        final ViewMoreCarouselView viewMoreCarouselView = new ViewMoreCarouselView(this.a);
        this.e.a(this.c);
        viewMoreCarouselView.setLayoutManager(this.e);
        if (this.b != null && this.b instanceof FullscreenViewMoreVideoPlayerChromeView) {
            ((FullscreenViewMoreVideoPlayerChromeView)this.b).setListener(this.f);
        }
        viewMoreCarouselView.setAdapter(this.d);
        return viewMoreCarouselView;
    }
    
    public o a(final al f) {
        this.f = f;
        return this;
    }
    
    public o a(final a d) {
        this.d = d;
        return this;
    }
    
    public o a(final b e) {
        this.e = e;
        return this;
    }
    
    public o a(final d c) {
        this.c = c;
        return this;
    }
    
    public o a(final f b) {
        this.b = b;
        return this;
    }
}
