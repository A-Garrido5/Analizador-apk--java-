// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.media.widget;

import android.view.ViewGroup$LayoutParams;
import android.view.View;
import com.twitter.android.media.camera.m;
import android.util.AttributeSet;
import android.content.Context;
import com.twitter.android.media.camera.CameraPreviewTextureView;
import com.twitter.library.widget.AspectRatioFrameLayout;

public class CameraPreviewContainer extends AspectRatioFrameLayout
{
    public final CameraPreviewTextureView a;
    
    public CameraPreviewContainer(final Context context) {
        this(context, null, 0);
    }
    
    public CameraPreviewContainer(final Context context, final AttributeSet set) {
        this(context, set, 0);
    }
    
    public CameraPreviewContainer(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        this.a = new CameraPreviewTextureView(context, m.a(context));
    }
    
    public void a(final float b, final boolean b2) {
        if (this.b != b) {
            this.b = b;
            if (b2) {
                this.requestLayout();
            }
        }
    }
    
    public void a(final int n, final int n2, final int n3, final int n4) {
        this.layout(n, n2, n3, n4);
        final View view = (View)this.getParent();
        final int width = view.getWidth();
        final int height = view.getHeight();
        final int n5 = (this.getWidth() - width) / 2;
        final int n6 = (this.getHeight() - height) / 2;
        this.a.layout(n5, n6, width + n5, height + n6);
    }
    
    protected void onFinishInflate() {
        super.onFinishInflate();
        this.addView((View)this.a, 0);
        final ViewGroup$LayoutParams layoutParams = this.a.getLayoutParams();
        layoutParams.width = -1;
        layoutParams.height = -1;
    }
    
    public void setDisplayOrientation(final int n) {
        final ViewGroup$LayoutParams layoutParams = this.getLayoutParams();
        if (n == 0) {
            layoutParams.width = -1;
            layoutParams.height = -2;
            return;
        }
        layoutParams.width = -2;
        layoutParams.height = -1;
    }
}
