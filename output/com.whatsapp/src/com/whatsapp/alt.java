// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.view.View;
import android.os.Build$VERSION;
import android.widget.AbsListView;
import android.view.ViewGroup;
import android.graphics.drawable.Drawable;
import android.widget.AbsListView$OnScrollListener;

class alt implements AbsListView$OnScrollListener
{
    final int a;
    final boolean b;
    final MessageDetailsActivity c;
    final Drawable d;
    final ViewGroup e;
    
    alt(final MessageDetailsActivity c, final Drawable d, final boolean b, final ViewGroup e, final int a) {
        this.c = c;
        this.d = d;
        this.b = b;
        this.e = e;
        this.a = a;
    }
    
    public void onScroll(final AbsListView absListView, final int n, final int n2, final int n3) {
        final boolean i = App.I;
        if (MessageDetailsActivity.f(this.c).getFirstVisiblePosition() > 0) {
            this.d.setAlpha(255);
            if (Build$VERSION.SDK_INT < 11 || this.b) {
                return;
            }
            this.e.setTranslationY(0.0f);
            if (!i) {
                return;
            }
        }
        final View child = MessageDetailsActivity.f(this.c).getChildAt(0);
        if (child == null) {
            this.d.setAlpha(0);
            if (Build$VERSION.SDK_INT < 11 || this.b) {
                return;
            }
            this.e.setTranslationY(0.0f);
            if (!i) {
                return;
            }
        }
        final int top = child.getTop();
        this.d.setAlpha(Math.min(255, 255 * -top / Math.min(this.a, child.getHeight())));
        if (Build$VERSION.SDK_INT >= 11 && !this.b) {
            this.e.setTranslationY((float)(-top / 2));
        }
    }
    
    public void onScrollStateChanged(final AbsListView absListView, final int n) {
    }
}
