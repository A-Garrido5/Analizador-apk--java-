// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.widget;

import android.util.Log;
import android.os.Parcelable;
import android.view.View$MeasureSpec;
import android.view.ViewTreeObserver;
import android.view.ViewGroup$MarginLayoutParams;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewParent;
import android.view.MotionEvent;
import android.view.View;
import android.support.v4.view.ViewCompat;
import android.content.res.TypedArray;
import android.view.ViewConfiguration;
import android.view.animation.AnimationUtils;
import android.util.AttributeSet;
import android.content.Context;
import android.view.ViewTreeObserver$OnTouchModeChangeListener;
import android.graphics.Rect;
import android.widget.AbsListView;
import android.view.View$OnClickListener;
import android.view.VelocityTracker;
import android.widget.OverScroller;
import android.view.ViewGroup;
import android.annotation.TargetApi;
import android.os.Build$VERSION;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;

class n implements ViewTreeObserver$OnGlobalLayoutListener
{
    final /* synthetic */ BottomSheetDrawerLayout a;
    
    n(final BottomSheetDrawerLayout a) {
        this.a = a;
    }
    
    @TargetApi(16)
    public void onGlobalLayout() {
        if (Build$VERSION.SDK_INT >= 16) {
            this.a.getViewTreeObserver().removeOnGlobalLayoutListener((ViewTreeObserver$OnGlobalLayoutListener)this);
        }
        else {
            this.a.getViewTreeObserver().removeGlobalOnLayoutListener((ViewTreeObserver$OnGlobalLayoutListener)this);
        }
        this.a.w = true;
    }
}
