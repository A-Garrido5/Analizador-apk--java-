// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.view.View;
import android.view.ViewTreeObserver$OnPreDrawListener;

class hx implements ViewTreeObserver$OnPreDrawListener
{
    final View a;
    final int b;
    final MediaView c;
    final int d;
    final int e;
    final int f;
    
    hx(final MediaView c, final View a, final int b, final int f, final int d, final int e) {
        this.c = c;
        this.a = a;
        this.b = b;
        this.f = f;
        this.d = d;
        this.e = e;
    }
    
    public boolean onPreDraw() {
        this.a.getViewTreeObserver().removeOnPreDrawListener((ViewTreeObserver$OnPreDrawListener)this);
        final int[] array = new int[2];
        this.a.getLocationOnScreen(array);
        MediaView.e(this.c, this.b - array[0]);
        MediaView.d(this.c, this.f - array[1]);
        MediaView.b(this.c, this.d / this.a.getWidth());
        MediaView.a(this.c, this.e / this.a.getHeight());
        Label_0245: {
            if (MediaView.l(this.c) < MediaView.h(this.c)) {
                MediaView.b(this.c, MediaView.h(this.c));
                MediaView.e(this.c, (int)(MediaView.o(this.c) - (this.a.getWidth() * MediaView.l(this.c) - this.d) / 2.0f));
                if (!App.I) {
                    break Label_0245;
                }
            }
            MediaView.a(this.c, MediaView.l(this.c));
            MediaView.d(this.c, (int)(MediaView.s(this.c) - (this.a.getHeight() * MediaView.h(this.c) - this.e) / 2.0f));
        }
        MediaView.a(this.c);
        return true;
    }
}
