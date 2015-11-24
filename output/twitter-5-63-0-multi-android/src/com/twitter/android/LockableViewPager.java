// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import android.widget.Scroller;
import android.view.MotionEvent;
import java.lang.reflect.Field;
import android.view.animation.Interpolator;
import android.util.AttributeSet;
import android.content.Context;
import android.support.v4.view.ViewPager;

public class LockableViewPager extends ViewPager
{
    private boolean a;
    private kc b;
    
    public LockableViewPager(final Context context) {
        this(context, null);
    }
    
    public LockableViewPager(final Context context, final AttributeSet set) {
        super(context, set);
        this.a = true;
        try {
            final Field declaredField = ViewPager.class.getDeclaredField("mScroller");
            final Field declaredField2 = ViewPager.class.getDeclaredField("sInterpolator");
            if (declaredField != null) {
                if (declaredField2 == null) {
                    return;
                }
                declaredField.setAccessible(true);
                declaredField2.setAccessible(true);
                declaredField.set(this, this.b = new kc(this.getContext(), (Interpolator)declaredField2.get(null), null));
            }
        }
        catch (NoSuchFieldException ex) {}
        catch (IllegalAccessException ex2) {
            goto Label_0090;
        }
    }
    
    public boolean getPagingEnabled() {
        return this.a;
    }
    
    @Override
    public boolean onInterceptTouchEvent(final MotionEvent motionEvent) {
        if (!this.a) {
            return false;
        }
        try {
            return super.onInterceptTouchEvent(motionEvent);
        }
        catch (ArrayIndexOutOfBoundsException ex) {
            return false;
        }
        catch (IllegalArgumentException ex2) {
            return false;
        }
    }
    
    @Override
    public boolean onTouchEvent(final MotionEvent motionEvent) {
        if (!this.a) {
            return false;
        }
        try {
            return super.onTouchEvent(motionEvent);
        }
        catch (ArrayIndexOutOfBoundsException ex) {
            return false;
        }
        catch (IllegalArgumentException ex2) {
            return false;
        }
    }
    
    public void setPagingEnabled(final boolean a) {
        this.a = a;
    }
    
    public void setScrollDurationMilliseconds(final int n) {
        if (this.b != null) {
            this.b.a(n);
        }
    }
}
