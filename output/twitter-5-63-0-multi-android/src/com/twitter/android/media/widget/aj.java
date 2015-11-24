// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.media.widget;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.content.Context;
import android.widget.HorizontalScrollView;

class aj extends HorizontalScrollView
{
    private boolean a;
    private boolean b;
    private boolean c;
    
    aj(final Context context) {
        super(context);
    }
    
    private void a(final boolean b) {
        final int scrollX = this.getScrollX();
        final int n = scrollX + this.getMeasuredWidth();
        final ViewGroup viewGroup = (ViewGroup)this.getChildAt(0);
        final int childCount = viewGroup.getChildCount();
    Label_0073:
        while (true) {
            Label_0174: {
                if (b) {
                    for (int i = 0; i < childCount; ++i) {
                        final View child = viewGroup.getChildAt(i);
                        if (child.getVisibility() == 0 && child.getRight() > scrollX) {
                            final View view = child;
                            break Label_0073;
                        }
                    }
                    break Label_0174;
                }
                for (int j = childCount - 1; j >= 0; --j) {
                    final View child2 = viewGroup.getChildAt(j);
                    if (child2.getVisibility() == 0 && child2.getLeft() < n) {
                        final View view = child2;
                        break Label_0073;
                    }
                }
                break Label_0174;
                View view = null;
                if (view != null) {
                    this.smoothScrollBy(view.getLeft() + view.getMeasuredWidth() / 2 - (this.getScrollX() + this.getMeasuredWidth() / 2), 0);
                    this.a = true;
                }
                return;
            }
            final View view = null;
            continue Label_0073;
        }
    }
    
    public void a() {
        final int n = this.getScrollX() + this.getMeasuredWidth() / 2;
        final ViewGroup viewGroup = (ViewGroup)this.getChildAt(0);
        final int childCount = viewGroup.getChildCount();
        View view = null;
        int n2 = Integer.MAX_VALUE;
        while (true) {
            View child;
            for (int i = 0; i < childCount; ++i, view = child) {
                child = viewGroup.getChildAt(i);
                if (child.getLeft() <= n && child.getRight() >= n) {
                    if (child != null) {
                        this.smoothScrollBy(child.getLeft() + child.getMeasuredWidth() / 2 - n, 0);
                    }
                    return;
                }
                if (child.getRight() < n && n - child.getRight() < n2) {
                    n2 = n - child.getRight();
                }
                else if (child.getLeft() > n && child.getLeft() - n < n2) {
                    n2 = child.getLeft() - n;
                }
                else {
                    child = view;
                }
            }
            child = view;
            continue;
        }
    }
    
    public void fling(final int n) {
        if (this.getChildCount() > 0) {
            this.a(n < 0);
        }
    }
    
    protected void onOverScrolled(final int n, final int n2, final boolean b, final boolean b2) {
        this.b = b;
        this.c = (n == 0);
        super.onOverScrolled(n, n2, b, b2);
    }
    
    public boolean onTouchEvent(final MotionEvent motionEvent) {
        final boolean onTouchEvent = super.onTouchEvent(motionEvent);
        if ((0xFF & motionEvent.getAction()) == 0x1) {
            if (!this.a) {
                if (this.b) {
                    this.a(this.c);
                }
                else {
                    this.a();
                }
            }
            this.a = false;
            this.b = false;
        }
        return onTouchEvent;
    }
}
