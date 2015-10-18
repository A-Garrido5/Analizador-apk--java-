// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.internal.android.widget;

import android.os.Handler;
import android.view.MotionEvent;
import android.widget.Adapter;
import android.view.ViewParent;
import android.view.View$MeasureSpec;
import android.graphics.Canvas;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup;
import android.content.res.TypedArray;
import android.view.ViewConfiguration;
import android.util.AttributeSet;
import android.content.Context;
import android.widget.ListAdapter;
import android.view.VelocityTracker;
import android.graphics.Paint;
import android.graphics.Rect;
import android.database.DataSetObserver;
import android.widget.AdapterView;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.graphics.drawable.TransitionDrawable;

final class q implements Runnable
{
    final /* synthetic */ HorizontalListView a;
    
    q(final HorizontalListView a) {
        this.a = a;
    }
    
    @Override
    public void run() {
        if (this.a.E == 0) {
            this.a.E = 1;
            final View child = this.a.getChildAt(this.a.M - this.a.H);
            if (child != null && !child.hasFocusable()) {
                if (!this.a.e) {
                    child.setPressed(true);
                    this.a.setPressed(true);
                    this.a.c();
                    this.a.refreshDrawableState();
                    if (this.a.I != null) {
                        final Drawable current = this.a.I.getCurrent();
                        if (current != null && current instanceof TransitionDrawable) {
                            ((TransitionDrawable)current).resetTransition();
                        }
                    }
                }
                this.a.E = 2;
            }
        }
    }
}
