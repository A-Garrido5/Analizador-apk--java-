// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.av;

import android.view.SurfaceHolder;
import android.content.Context;
import android.view.SurfaceHolder$Callback;
import com.twitter.library.av.playback.AVPlayer;
import android.view.SurfaceView;

public class VideoSurfaceView extends SurfaceView implements ad
{
    protected int a;
    protected int b;
    private AVPlayer c;
    private SurfaceHolder$Callback d;
    
    public VideoSurfaceView(final Context context, final AVPlayer c) {
        super(context);
        this.d = (SurfaceHolder$Callback)new al(this);
        this.c = c;
        this.a();
    }
    
    private void a() {
        this.a = 0;
        this.b = 0;
        final SurfaceHolder holder = this.getHolder();
        if (holder != null) {
            holder.setType(3);
            holder.addCallback(this.d);
        }
        this.setFocusable(true);
        this.setFocusableInTouchMode(true);
        this.requestFocus();
    }
    
    public void a(final int a, final int b) {
        this.a = a;
        this.b = b;
        if (this.a != 0 && this.b != 0) {
            this.requestLayout();
        }
    }
    
    public int getVideoHeight() {
        return this.b;
    }
    
    public int getVideoWidth() {
        return this.a;
    }
    
    protected void onMeasure(final int n, final int n2) {
        int defaultSize = getDefaultSize(this.a, n);
        int defaultSize2 = getDefaultSize(this.b, n2);
        if (this.a > 0 && this.b > 0) {
            if (defaultSize2 * this.a > defaultSize * this.b) {
                defaultSize2 = defaultSize * this.b / this.a;
            }
            else if (defaultSize2 * this.a < defaultSize * this.b) {
                defaultSize = defaultSize2 * this.a / this.b;
            }
        }
        this.setMeasuredDimension(defaultSize, defaultSize2);
    }
}
