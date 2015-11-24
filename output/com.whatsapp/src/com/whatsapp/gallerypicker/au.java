// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.gallerypicker;

import android.view.ViewGroup$LayoutParams;
import android.widget.FrameLayout$LayoutParams;
import android.view.MotionEvent;
import android.view.View;
import android.view.View$OnTouchListener;

class au implements View$OnTouchListener
{
    final ImagePreview a;
    final ImagePreview$ThumbImageView b;
    
    au(final ImagePreview$ThumbImageView b, final ImagePreview a) {
        this.b = b;
        this.a = a;
    }
    
    public boolean onTouch(final View view, final MotionEvent motionEvent) {
        switch (motionEvent.getAction()) {
            default: {
                return false;
            }
            case 0: {
                ImagePreview.a(this.b.A, (View)this.b);
                ImagePreview.a(this.b.A, ImagePreview$ThumbImageView.a(this.b));
                ImagePreview.j(this.b.A).setImageDrawable(this.b.getDrawable());
                ImagePreview.j(this.b.A).setMaxWidth(this.b.getWidth());
                ImagePreview.j(this.b.A).setMaxHeight(this.b.getHeight());
                ImagePreview.j(this.b.A).setLayoutParams((ViewGroup$LayoutParams)new FrameLayout$LayoutParams(this.b.getWidth(), this.b.getHeight()));
                ImagePreview.a(this.b.A, motionEvent.getY());
                ImagePreview.b(this.b.A, motionEvent.getX());
                ImagePreview.s(this.b.A).invalidate();
                if (ImagePreview.t(this.b.A) >= 0) {
                    final View child = ImagePreview.p(this.b.A).getChildAt(ImagePreview.t(this.b.A));
                    if (child != ImagePreview.s(this.b.A)) {
                        child.setSelected(false);
                    }
                }
                ImagePreview.n(this.b.A).removeCallbacks(ImagePreview.h(this.b.A));
                ImagePreview.n(this.b.A).postDelayed(ImagePreview.h(this.b.A), 100L);
                ImagePreview.l(this.b.A).setBackgroundColor(0);
                ImagePreview.x(this.b.A).setTextColor(0);
                ImagePreview.i(this.b.A).setAlpha(0);
                ImagePreview.a(this.b.A).setVisibility(0);
                ImagePreview.w(this.b.A).getLocationOnScreen(ImagePreview.d(this.b.A));
                final int n = ImagePreview.d(this.b.A)[0];
                final int n2 = ImagePreview.d(this.b.A)[1];
                ImagePreview.s(this.b.A).getLocationOnScreen(ImagePreview.d(this.b.A));
                ImagePreview.w(this.b.A).setPadding(ImagePreview.d(this.b.A)[0] - n, ImagePreview.d(this.b.A)[1] - n2, 0, 0);
                ImagePreview.l(this.b.A).setPadding(0, 0, 0, ImagePreview.a(this.b.A).getHeight() - ImagePreview.b(this.b.A).getHeight());
                ImagePreview.x(this.b.A).getLocationOnScreen(ImagePreview.d(this.b.A));
                return false;
            }
            case 1:
            case 3: {
                ImagePreview.n(this.b.A).removeCallbacks(ImagePreview.h(this.b.A));
                return false;
            }
        }
    }
}
