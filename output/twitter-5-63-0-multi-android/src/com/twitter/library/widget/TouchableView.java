// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.widget;

import android.view.ViewConfiguration;
import android.view.View;
import com.twitter.util.t;
import com.twitter.util.a;
import android.view.MotionEvent;
import java.util.Iterator;
import java.util.ArrayList;
import android.util.AttributeSet;
import android.content.Context;
import java.util.List;
import android.view.ViewGroup;

public abstract class TouchableView extends ViewGroup
{
    private final List a;
    private long b;
    
    public TouchableView(final Context context) {
        this(context, null);
    }
    
    public TouchableView(final Context context, final AttributeSet set) {
        this(context, set, 0);
    }
    
    public TouchableView(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        this.a = new ArrayList();
        this.setWillNotDraw(false);
    }
    
    private void a() {
        for (final ap ap : this.a) {
            ap.a(false);
            ap.j();
        }
    }
    
    protected void a(final ap ap) {
        if (!this.a.contains(ap)) {
            this.a.add(ap);
        }
    }
    
    protected boolean a(final MotionEvent motionEvent) {
        return false;
    }
    
    protected void b(final ap ap) {
        this.a.remove(ap);
    }
    
    protected boolean c() {
        return !com.twitter.util.a.a();
    }
    
    protected void d() {
        this.a();
        this.a.clear();
    }
    
    protected int[] onCreateDrawableState(final int n) {
        if (this.a != null) {
            final int[] onCreateDrawableState = super.onCreateDrawableState(n + this.a.size());
            for (final ap ap : this.a) {
                if (ap.c()) {
                    ap.a(onCreateDrawableState);
                }
            }
            return onCreateDrawableState;
        }
        return super.onCreateDrawableState(n);
    }
    
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.a();
    }
    
    protected void onLayout(final boolean b, final int n, final int n2, final int n3, final int n4) {
    }
    
    public void onStartTemporaryDetach() {
        super.onStartTemporaryDetach();
        this.a();
    }
    
    public boolean onTouchEvent(final MotionEvent motionEvent) {
        boolean b = true;
        if (this.c()) {
            final List a = this.a;
            final int n = 0xFF & motionEvent.getAction();
            if (!this.isEnabled()) {
                if (n == (b ? 1 : 0)) {
                    this.a();
                }
                b = false;
            }
            else if (!this.a(motionEvent)) {
                final int n2 = (int)motionEvent.getX();
                final int n3 = (int)motionEvent.getY();
                switch (n) {
                    case 0: {
                        final Iterator<ap> iterator = a.iterator();
                        int n4 = 0;
                        while (iterator.hasNext()) {
                            final ap ap = iterator.next();
                            int n5;
                            if (ap.a(n2, n3)) {
                                if (t.a((View)this)) {
                                    ap.b();
                                    this.postDelayed(ap.e(), (long)ViewConfiguration.getTapTimeout());
                                }
                                else {
                                    ap.a(b);
                                }
                                n5 = (b ? 1 : 0);
                            }
                            else {
                                ap.a(false);
                                n5 = n4;
                            }
                            n4 = n5;
                        }
                        if (n4 != 0) {
                            return b;
                        }
                        return super.onTouchEvent(motionEvent);
                    }
                    case 1: {
                        for (final ap ap2 : a) {
                            final boolean d = ap2.d();
                            if (ap2.c() || d) {
                                if (d) {
                                    ap2.a(b);
                                }
                                if (!this.post(ap2.g())) {
                                    ap2.h();
                                }
                                if (d) {
                                    this.postDelayed(ap2.f(), (long)ViewConfiguration.getPressedStateDuration());
                                }
                                else if (!this.post(ap2.f())) {
                                    ap2.a(false);
                                }
                                ap2.i();
                                return b;
                            }
                        }
                        return super.onTouchEvent(motionEvent);
                    }
                    case 2: {
                        final Iterator<ap> iterator3 = a.iterator();
                        int n6 = 0;
                        while (iterator3.hasNext()) {
                            final ap ap3 = iterator3.next();
                            int n7;
                            if (!ap3.a(n2, n3)) {
                                ap3.i();
                                ap3.a(false);
                                n7 = (b ? 1 : 0);
                            }
                            else {
                                n7 = n6;
                            }
                            n6 = n7;
                        }
                        if (n6 != 0) {
                            return b;
                        }
                        return super.onTouchEvent(motionEvent);
                    }
                    case 3: {
                        this.a();
                        return super.onTouchEvent(motionEvent);
                    }
                }
            }
            return b;
        }
        return super.onTouchEvent(motionEvent);
    }
    
    public void onWindowFocusChanged(final boolean b) {
        super.onWindowFocusChanged(b);
        if (!b) {
            this.a();
        }
    }
}
