// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.av;

import android.graphics.Rect;
import com.twitter.library.av.playback.AVPlayer;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

public class VideoViewContainer extends ViewGroup implements n
{
    private View a;
    private final aq b;
    
    public VideoViewContainer(final Context context, final AVPlayer avPlayer) {
        this(context, avPlayer, new ar());
    }
    
    VideoViewContainer(final Context context, final AVPlayer avPlayer, final ar ar) {
        super(context);
        this.b = ar.a(context, avPlayer, this);
        this.addView(this.a = this.b.a());
    }
    
    public Rect a(final int n, final int n2, final int n3, final int n4) {
        return this.b.a(n, n2, n3, n4);
    }
    
    public void a() {
        this.removeView(this.a);
        this.addView(this.a = this.b.a());
    }
    
    public void a(final int n, final int n2) {
        this.b.a(n, n2);
    }
    
    public boolean b() {
        return this.a != null && this.a.getParent() != null;
    }
    
    public void j() {
        if (this.a != null && this.a.getParent() == this) {
            this.removeView(this.a);
        }
    }
    
    protected void onLayout(final boolean b, final int n, final int n2, final int n3, final int n4) {
        this.a.layout(0, 0, n3 - n, n4 - n2);
    }
    
    protected void onSizeChanged(final int n, final int n2, final int n3, final int n4) {
        super.onSizeChanged(n, n2, n3, n4);
        this.a.layout(0, 0, n, n2);
    }
    
    public void setKeepScreenOn(final boolean b) {
        this.b.a(b);
    }
}
