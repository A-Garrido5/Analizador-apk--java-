// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.widget.highlights;

import android.support.annotation.DrawableRes;
import android.database.DataSetObserver;
import android.support.v4.view.VelocityTrackerCompat;
import android.view.View$MeasureSpec;
import android.graphics.Canvas;
import android.support.v4.view.PagerAdapter;
import android.view.SoundEffectConstants;
import android.view.FocusFinder;
import android.util.Log;
import android.view.ViewGroup$LayoutParams;
import android.support.v4.view.KeyEventCompat;
import android.os.Build$VERSION;
import android.view.KeyEvent;
import android.content.res.TypedArray;
import android.support.v4.view.ViewConfigurationCompat;
import android.view.ViewConfiguration;
import com.twitter.android.pa;
import android.content.res.Resources$NotFoundException;
import java.util.List;
import java.util.Collections;
import android.graphics.Paint;
import android.support.v4.view.ViewCompat;
import android.support.v4.view.MotionEventCompat;
import android.view.MotionEvent;
import android.view.ViewParent;
import android.util.AttributeSet;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.Scroller;
import android.os.Parcelable;
import com.twitter.android.highlights.x;
import android.graphics.Rect;
import java.util.ArrayList;
import java.lang.reflect.Method;
import java.lang.ref.WeakReference;
import android.view.VelocityTracker;
import android.view.animation.Interpolator;
import java.util.Comparator;
import android.view.ViewGroup;
import android.os.Bundle;
import android.support.v4.view.accessibility.AccessibilityNodeInfoCompat;
import android.support.v4.view.accessibility.AccessibilityRecordCompat;
import android.view.accessibility.AccessibilityEvent;
import android.view.View;
import android.support.v4.view.AccessibilityDelegateCompat;

class i extends AccessibilityDelegateCompat
{
    final /* synthetic */ StoriesViewPager a;
    
    i(final StoriesViewPager a) {
        this.a = a;
    }
    
    private boolean a() {
        return this.a.j != null && this.a.j.getCount() > 1;
    }
    
    @Override
    public void onInitializeAccessibilityEvent(final View view, final AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(view, accessibilityEvent);
        accessibilityEvent.setClassName((CharSequence)StoriesViewPager.class.getName());
        final AccessibilityRecordCompat obtain = AccessibilityRecordCompat.obtain();
        obtain.setScrollable(this.a());
        if (accessibilityEvent.getEventType() == 4096 && this.a.j != null) {
            obtain.setItemCount(this.a.j.getCount());
            obtain.setFromIndex(this.a.k);
            obtain.setToIndex(this.a.k);
        }
    }
    
    @Override
    public void onInitializeAccessibilityNodeInfo(final View view, final AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
        accessibilityNodeInfoCompat.setClassName(StoriesViewPager.class.getName());
        accessibilityNodeInfoCompat.setScrollable(this.a());
        if (this.a.canScrollHorizontally(1)) {
            accessibilityNodeInfoCompat.addAction(4096);
        }
        if (this.a.canScrollHorizontally(-1)) {
            accessibilityNodeInfoCompat.addAction(8192);
        }
    }
    
    @Override
    public boolean performAccessibilityAction(final View view, final int n, final Bundle bundle) {
        if (super.performAccessibilityAction(view, n, bundle)) {
            return true;
        }
        switch (n) {
            default: {
                return false;
            }
            case 4096: {
                if (this.a.canScrollHorizontally(1)) {
                    this.a.setCurrentItem(1 + this.a.k);
                    return true;
                }
                return false;
            }
            case 8192: {
                if (this.a.canScrollHorizontally(-1)) {
                    this.a.setCurrentItem(-1 + this.a.k);
                    return true;
                }
                return false;
            }
        }
    }
}
