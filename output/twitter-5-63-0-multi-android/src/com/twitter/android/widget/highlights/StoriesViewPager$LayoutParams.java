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
import android.view.accessibility.AccessibilityEvent;
import android.view.SoundEffectConstants;
import android.view.FocusFinder;
import android.util.Log;
import android.support.v4.view.KeyEventCompat;
import android.os.Build$VERSION;
import android.view.KeyEvent;
import android.support.v4.view.AccessibilityDelegateCompat;
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
import android.view.View;
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
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.content.Context;
import android.view.ViewGroup$LayoutParams;

public class StoriesViewPager$LayoutParams extends ViewGroup$LayoutParams
{
    public boolean a;
    public int b;
    public float c;
    public boolean d;
    public int e;
    public int f;
    
    public StoriesViewPager$LayoutParams() {
        super(-1, -1);
        this.c = 0.0f;
    }
    
    public StoriesViewPager$LayoutParams(final Context context, final AttributeSet set) {
        super(context, set);
        this.c = 0.0f;
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, StoriesViewPager.a);
        this.b = obtainStyledAttributes.getInteger(0, 48);
        obtainStyledAttributes.recycle();
    }
}
