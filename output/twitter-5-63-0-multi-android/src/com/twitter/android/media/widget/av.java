// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.media.widget;

import android.widget.ListAdapter;
import android.view.View$MeasureSpec;
import android.view.View$OnTouchListener;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.util.AttributeSet;
import android.content.Context;
import android.view.ViewConfiguration;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.widget.RelativeLayout;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;

class av implements ViewTreeObserver$OnGlobalLayoutListener
{
    final /* synthetic */ ViewTreeObserver a;
    final /* synthetic */ int b;
    final /* synthetic */ int c;
    final /* synthetic */ VideoSegmentEditView d;
    
    av(final VideoSegmentEditView d, final ViewTreeObserver a, final int b, final int c) {
        this.d = d;
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public void onGlobalLayout() {
        this.a.removeGlobalOnLayoutListener((ViewTreeObserver$OnGlobalLayoutListener)this);
        final VideoSegmentListView a = this.d.j;
        final View child = a.getChildAt(this.b - a.getFirstVisiblePosition());
        if (child != null) {
            final View child2 = a.getChildAt(this.c - a.getFirstVisiblePosition());
            int left;
            if (child2 == null) {
                left = 0;
            }
            else {
                left = child2.getLeft();
            }
            child.setTranslationX((float)(left - child.getLeft()));
            final ObjectAnimator ofFloat = ObjectAnimator.ofFloat((Object)child, View.TRANSLATION_X, new float[] { 0.0f });
            ofFloat.setDuration(100L);
            ofFloat.addUpdateListener((ValueAnimator$AnimatorUpdateListener)new aw(this, a));
            ofFloat.start();
        }
    }
}
