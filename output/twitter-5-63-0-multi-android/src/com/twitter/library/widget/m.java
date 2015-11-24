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
import android.annotation.TargetApi;
import android.view.ViewParent;
import android.os.Build$VERSION;
import android.view.MotionEvent;
import android.view.View;
import android.support.v4.view.ViewCompat;
import android.content.res.TypedArray;
import android.view.ViewConfiguration;
import android.view.animation.AnimationUtils;
import android.util.AttributeSet;
import android.content.Context;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import android.graphics.Rect;
import android.widget.AbsListView;
import android.view.View$OnClickListener;
import android.view.VelocityTracker;
import android.widget.OverScroller;
import android.view.ViewGroup;
import android.view.ViewTreeObserver$OnTouchModeChangeListener;

class m implements ViewTreeObserver$OnTouchModeChangeListener
{
    final /* synthetic */ BottomSheetDrawerLayout a;
    
    m(final BottomSheetDrawerLayout a) {
        this.a = a;
    }
    
    public void onTouchModeChanged(final boolean b) {
        if (!b && this.a.hasFocus() && this.a.a(this.a.getFocusedChild())) {
            this.a.a(0, 0.0f);
        }
    }
}
