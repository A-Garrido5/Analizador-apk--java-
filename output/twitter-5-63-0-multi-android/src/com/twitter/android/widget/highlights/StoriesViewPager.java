// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.widget.highlights;

import android.os.Parcel;
import android.support.v4.os.ParcelableCompatCreatorCallbacks;
import android.support.v4.os.ParcelableCompat;
import android.os.Parcelable$Creator;
import android.view.View$BaseSavedState;
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
import android.view.ViewGroup$LayoutParams;
import android.support.v4.view.KeyEventCompat;
import android.os.Build$VERSION;
import android.view.KeyEvent;
import android.content.res.TypedArray;
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

public class StoriesViewPager extends ViewGroup
{
    private static final int[] a;
    private static final o b;
    private static final Comparator c;
    private static final Interpolator d;
    private boolean A;
    private int B;
    private boolean C;
    private boolean D;
    private int E;
    private int F;
    private int G;
    private float H;
    private float I;
    private float J;
    private float K;
    private int L;
    private VelocityTracker M;
    private int N;
    private int O;
    private int P;
    private int Q;
    private boolean R;
    private WeakReference S;
    private boolean T;
    private boolean U;
    private boolean V;
    private int W;
    private k aa;
    private k ab;
    private j ac;
    private l ad;
    private Method ae;
    private int af;
    private ArrayList ag;
    private final Runnable ah;
    private int ai;
    private float aj;
    private int e;
    private float f;
    private final ArrayList g;
    private final h h;
    private final Rect i;
    private x j;
    private int k;
    private int l;
    private Parcelable m;
    private ClassLoader n;
    private Scroller o;
    private m p;
    private int q;
    private Drawable r;
    private int s;
    private int t;
    private float u;
    private float v;
    private int w;
    private int x;
    private boolean y;
    private boolean z;
    
    static {
        a = new int[] { 16842931 };
        b = new o();
        c = new c();
        d = (Interpolator)new d();
    }
    
    public StoriesViewPager(final Context context) {
        super(context);
        this.g = new ArrayList();
        this.h = new h();
        this.i = new Rect();
        this.l = -1;
        this.m = null;
        this.n = null;
        this.u = -3.4028235E38f;
        this.v = Float.MAX_VALUE;
        this.B = 1;
        this.L = -1;
        this.T = true;
        this.U = false;
        this.ah = new e(this);
        this.ai = 0;
        this.aj = 1.0f;
        this.a(context, null);
    }
    
    public StoriesViewPager(final Context context, final AttributeSet set) {
        super(context, set);
        this.g = new ArrayList();
        this.h = new h();
        this.i = new Rect();
        this.l = -1;
        this.m = null;
        this.n = null;
        this.u = -3.4028235E38f;
        this.v = Float.MAX_VALUE;
        this.B = 1;
        this.L = -1;
        this.T = true;
        this.U = false;
        this.ah = new e(this);
        this.ai = 0;
        this.aj = 1.0f;
        this.a(context, set);
    }
    
    private int a(int max, final float n, final int n2, final int n3) {
        if (Math.abs(n3) > this.P && Math.abs(n2) > this.N) {
            if (n2 <= 0) {
                ++max;
            }
        }
        else {
            float n4;
            if (max >= this.k) {
                n4 = 0.4f;
            }
            else {
                n4 = 0.6f;
            }
            max = (int)(n4 + (n + max));
        }
        if (this.g.size() > 0) {
            max = Math.max(this.g.get(0).b, Math.min(max, this.g.get(-1 + this.g.size()).b));
        }
        return max;
    }
    
    private Rect a(final Rect rect, final View view) {
        Rect rect2;
        if (rect == null) {
            rect2 = new Rect();
        }
        else {
            rect2 = rect;
        }
        if (view == null) {
            rect2.set(0, 0, 0, 0);
            return rect2;
        }
        rect2.left = view.getLeft();
        rect2.right = view.getRight();
        rect2.top = view.getTop();
        rect2.bottom = view.getBottom();
        StoriesViewPager storiesViewPager;
        for (ViewParent viewParent = view.getParent(); viewParent instanceof ViewGroup && viewParent != this; viewParent = storiesViewPager.getParent()) {
            storiesViewPager = (StoriesViewPager)viewParent;
            rect2.left += storiesViewPager.getLeft();
            rect2.right += storiesViewPager.getRight();
            rect2.top += storiesViewPager.getTop();
            rect2.bottom += storiesViewPager.getBottom();
        }
        return rect2;
    }
    
    private void a(final int n, final int n2, final int n3, final int n4) {
        if (n2 > 0 && !this.g.isEmpty()) {
            final int n5 = this.getScrollX() / (n4 + (n2 - this.getPaddingLeft() - this.getPaddingRight())) * (n3 + (n - this.getPaddingLeft() - this.getPaddingRight()));
            this.scrollTo(n5, this.getScrollY());
            if (!this.o.isFinished()) {
                this.o.startScroll(n5, 0, (int)(this.b(this.k).e * n), 0, this.o.getDuration() - this.o.timePassed());
            }
        }
        else {
            final h b = this.b(this.k);
            float min;
            if (b != null) {
                min = Math.min(b.e, this.v);
            }
            else {
                min = 0.0f;
            }
            final int n6 = (int)(min * (n - this.getPaddingLeft() - this.getPaddingRight()));
            if (n6 != this.getScrollX()) {
                this.a(false);
                this.scrollTo(n6, this.getScrollY());
            }
        }
    }
    
    private void a(final int n, final boolean b, final int n2, final boolean b2) {
        final h b3 = this.b(n);
        int n3;
        if (b3 != null) {
            n3 = (int)(this.getClientWidth() * Math.max(this.u, Math.min(b3.e, this.v)));
        }
        else {
            n3 = 0;
        }
        if (b) {
            this.a(n3, 0, n2);
            if (b2 && this.aa != null) {
                this.aa.a(n);
            }
            if (b2 && this.ab != null) {
                this.ab.a(n);
            }
            return;
        }
        if (b2 && this.aa != null) {
            this.aa.a(n);
        }
        if (b2 && this.ab != null) {
            this.ab.a(n);
        }
        this.a(false);
        this.scrollTo(n3, 0);
        this.d(n3);
    }
    
    private void a(final MotionEvent motionEvent) {
        final int actionIndex = MotionEventCompat.getActionIndex(motionEvent);
        if (MotionEventCompat.getPointerId(motionEvent, actionIndex) == this.L) {
            int n;
            if (actionIndex == 0) {
                n = 1;
            }
            else {
                n = 0;
            }
            this.H = MotionEventCompat.getX(motionEvent, n);
            this.L = MotionEventCompat.getPointerId(motionEvent, n);
            if (this.M != null) {
                this.M.clear();
            }
        }
    }
    
    private void a(final h h, final int n, final h h2) {
        final int count = this.j.getCount();
        final int clientWidth = this.getClientWidth();
        float n2;
        if (clientWidth > 0) {
            n2 = this.q / clientWidth;
        }
        else {
            n2 = 0.0f;
        }
        if (h2 != null) {
            final int b = h2.b;
            if (b < h.b) {
                float e = n2 + (h2.e + h2.d);
                for (int i = b + 1, n3 = 0; i <= h.b && n3 < this.g.size(); ++i) {
                    h h3;
                    for (h3 = this.g.get(n3); i > h3.b && n3 < -1 + this.g.size(); ++n3, h3 = this.g.get(n3)) {}
                    while (i < h3.b) {
                        e += n2 + this.j.getPageWidth(i);
                        ++i;
                    }
                    h3.e = e;
                    e += n2 + h3.d;
                }
            }
            else if (b > h.b) {
                int n4 = -1 + this.g.size();
                float e2 = h2.e;
                for (int j = b - 1; j >= h.b && n4 >= 0; --j) {
                    h h4;
                    for (h4 = this.g.get(n4); j < h4.b && n4 > 0; --n4, h4 = this.g.get(n4)) {}
                    while (j > h4.b) {
                        e2 -= n2 + this.j.getPageWidth(j);
                        --j;
                    }
                    e2 -= n2 + h4.d;
                    h4.e = e2;
                }
            }
        }
        final int size = this.g.size();
        float e3 = h.e;
        int k = -1 + h.b;
        float e4;
        if (h.b == 0) {
            e4 = h.e;
        }
        else {
            e4 = -3.4028235E38f;
        }
        this.u = e4;
        float v;
        if (h.b == count - 1) {
            v = h.e + h.d - 1.0f;
        }
        else {
            v = Float.MAX_VALUE;
        }
        this.v = v;
        int n7;
        for (int l = n - 1; l >= 0; l = n7) {
            final h h5 = this.g.get(l);
            float n5 = e3;
            while (k > h5.b) {
                final x m = this.j;
                final int n6 = k - 1;
                n5 -= n2 + m.getPageWidth(k);
                k = n6;
            }
            e3 = n5 - (n2 + h5.d);
            h5.e = e3;
            if (h5.b == 0) {
                this.u = e3;
            }
            n7 = l - 1;
            --k;
        }
        float n8 = n2 + (h.e + h.d);
        int n9 = 1 + h.b;
        int n12;
        for (int n10 = n + 1; n10 < size; n10 = n12) {
            final h h6 = this.g.get(n10);
            float e5 = n8;
            while (n9 < h6.b) {
                final x j2 = this.j;
                final int n11 = n9 + 1;
                e5 += n2 + j2.getPageWidth(n9);
                n9 = n11;
            }
            if (h6.b == count - 1) {
                this.v = e5 + h6.d - 1.0f;
            }
            h6.e = e5;
            n8 = e5 + (n2 + h6.d);
            n12 = n10 + 1;
            ++n9;
        }
        this.U = false;
    }
    
    private void a(final boolean b) {
        boolean b2;
        if (this.ai == 2) {
            b2 = true;
        }
        else {
            b2 = false;
        }
        if (b2) {
            this.setScrollingCacheEnabled(false);
            this.o.abortAnimation();
            final int scrollX = this.getScrollX();
            final int scrollY = this.getScrollY();
            final int currX = this.o.getCurrX();
            final int currY = this.o.getCurrY();
            if (scrollX != currX || scrollY != currY) {
                this.scrollTo(currX, currY);
            }
        }
        this.A = false;
        int i = 0;
        int n = b2 ? 1 : 0;
        while (i < this.g.size()) {
            final h h = this.g.get(i);
            if (h.c) {
                h.c = false;
                n = 1;
            }
            ++i;
        }
        if (n != 0) {
            if (!b) {
                this.ah.run();
                return;
            }
            ViewCompat.postOnAnimation((View)this, this.ah);
        }
    }
    
    private boolean a(final float n, final float n2) {
        return (n < this.F && n2 > 0.0f) || (n > this.getWidth() - this.F && n2 < 0.0f);
    }
    
    private void b(final float h) {
        final float n = this.H - h;
        this.H = h;
        final int clientWidth = this.getClientWidth();
        final float n2 = clientWidth * this.u;
        final float n3 = clientWidth * this.v;
        final float f = n + this.f;
        float n4;
        if (f < n2) {
            n4 = n2 - (n2 - f) * this.aj;
        }
        else if (f > n3) {
            n4 = n3 + (f - n3) * this.aj;
        }
        else {
            n4 = f;
        }
        final h h2 = this.g.get(-1 + this.g.size());
        float n5;
        boolean b;
        if (h2.b != -1 + this.j.getCount()) {
            n5 = h2.e * clientWidth;
            b = false;
        }
        else {
            b = true;
            n5 = n3;
        }
        if (n4 > n5 && b) {
            final float n6 = Math.abs(n4 - n5) / (clientWidth * this.aj);
            if (this.S != null) {
                final g g = (g)this.S.get();
                if (g != null) {
                    g.a(n6);
                }
            }
        }
        this.H += n4 - (int)n4;
        this.scrollTo((int)n4, this.getScrollY());
        this.f = f;
        this.d((int)n4);
    }
    
    private void b(final boolean b) {
        for (int childCount = this.getChildCount(), i = 0; i < childCount; ++i) {
            if (!((StoriesViewPager$LayoutParams)this.getChildAt(i).getLayoutParams()).a) {
                int n;
                if (b) {
                    n = 2;
                }
                else {
                    n = 0;
                }
                ViewCompat.setLayerType(this.getChildAt(i), n, null);
            }
        }
    }
    
    private void c(final boolean b) {
        final ViewParent parent = this.getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(b);
        }
    }
    
    private boolean d(final int n) {
        boolean b;
        if (this.g.size() == 0) {
            this.V = false;
            this.a(0, 0.0f, 0);
            final boolean v = this.V;
            b = false;
            if (!v) {
                throw new IllegalStateException("onPageScrolled did not call superclass implementation");
            }
        }
        else {
            final h i = this.i();
            final int clientWidth = this.getClientWidth();
            final int n2 = clientWidth + this.q;
            final float n3 = this.q / clientWidth;
            final int b2 = i.b;
            final float n4 = (n / clientWidth - i.e) / (n3 + i.d);
            final int n5 = (int)(n4 * n2);
            this.V = false;
            this.a(b2, n4, n5);
            if (!this.V) {
                throw new IllegalStateException("onPageScrolled did not call superclass implementation");
            }
            b = true;
        }
        return b;
    }
    
    private void g() {
        for (int i = 0; i < this.getChildCount(); ++i) {
            if (!((StoriesViewPager$LayoutParams)this.getChildAt(i).getLayoutParams()).a) {
                this.removeViewAt(i);
                --i;
            }
        }
    }
    
    private int getClientWidth() {
        return this.getMeasuredWidth() - this.getPaddingLeft() - this.getPaddingRight();
    }
    
    private void h() {
        if (this.af != 0) {
            if (this.ag == null) {
                this.ag = new ArrayList();
            }
            else {
                this.ag.clear();
            }
            for (int childCount = this.getChildCount(), i = 0; i < childCount; ++i) {
                this.ag.add(this.getChildAt(i));
            }
            Collections.sort((List<Object>)this.ag, StoriesViewPager.b);
        }
    }
    
    private h i() {
        final int clientWidth = this.getClientWidth();
        float n;
        if (clientWidth > 0) {
            n = this.getScrollX() / clientWidth;
        }
        else {
            n = 0.0f;
        }
        float n2;
        if (clientWidth > 0) {
            n2 = this.q / clientWidth;
        }
        else {
            n2 = 0.0f;
        }
        float n3 = 0.0f;
        float n4 = 0.0f;
        int n5 = -1;
        int i = 0;
        int n6 = 1;
        h h = null;
        while (i < this.g.size()) {
            final h h2 = this.g.get(i);
            int n7;
            h h4;
            if (n6 == 0 && h2.b != n5 + 1) {
                final h h3 = this.h;
                h3.e = n2 + (n3 + n4);
                h3.b = n5 + 1;
                h3.d = this.j.getPageWidth(h3.b);
                n7 = i - 1;
                h4 = h3;
            }
            else {
                n7 = i;
                h4 = h2;
            }
            final float e = h4.e;
            final float n8 = n2 + (e + h4.d);
            if (n6 == 0 && n < e) {
                break;
            }
            if (n < n8 || n7 == -1 + this.g.size()) {
                h = h4;
                break;
            }
            final int b = h4.b;
            final float d = h4.d;
            final int n9 = n7 + 1;
            n4 = e;
            n5 = b;
            n3 = d;
            h = h4;
            i = n9;
            n6 = 0;
        }
        return h;
    }
    
    private void j() {
        this.C = false;
        this.D = false;
        if (this.M != null) {
            this.M.recycle();
            this.M = null;
        }
    }
    
    private void setScrollingCacheEnabled(final boolean z) {
        if (this.z != z) {
            this.z = z;
        }
    }
    
    float a(final float n) {
        return (float)Math.sin((float)(0.4712389167638204 * (n - 0.5f)));
    }
    
    public View a(View view) {
        final ViewParent parent = view.getParent();
        if (!(parent instanceof View)) {
            view = null;
        }
        else {
            final View view2 = (View)parent;
            if (view2 != this) {
                return this.a(view2);
            }
        }
        return view;
    }
    
    h a(final int b, final int n) {
        final h h = new h();
        h.b = b;
        h.a = this.j.instantiateItem(this, b);
        h.d = this.j.getPageWidth(b);
        if (n < 0 || n >= this.g.size()) {
            this.g.add(h);
            return h;
        }
        this.g.add(n, h);
        return h;
    }
    
    void a() {
        final int count = this.j.getCount();
        this.e = count;
        int n;
        if (this.g.size() < 1 + 2 * this.B && this.g.size() < count) {
            n = 1;
        }
        else {
            n = 0;
        }
        final int k = this.k;
        int n2 = 0;
        int n3 = k;
        int n4 = n;
        int n10;
        for (int i = 0; i < this.g.size(); i = n10) {
            final h h = this.g.get(i);
            final int itemPosition = this.j.getItemPosition(h.a);
            int n5;
            int n6;
            int n7;
            int n8;
            if (itemPosition == -1) {
                this.j.a(h.a, h.b);
                n5 = i;
                n6 = n2;
                n7 = n3;
                n8 = n4;
            }
            else if (itemPosition == -2) {
                this.g.remove(i);
                final int n9 = i - 1;
                if (n2 == 0) {
                    this.j.startUpdate(this);
                    n2 = 1;
                }
                this.j.destroyItem(this, h.b, h.a);
                if (this.k == h.b) {
                    final int max = Math.max(0, Math.min(this.k, count - 1));
                    n5 = n9;
                    n6 = n2;
                    n7 = max;
                    n8 = 1;
                }
                else {
                    n5 = n9;
                    n6 = n2;
                    n7 = n3;
                    n8 = 1;
                }
            }
            else if (h.b != itemPosition) {
                if (h.b == this.k) {
                    n3 = itemPosition;
                }
                h.b = itemPosition;
                this.j.a(h.a, h.b);
                n5 = i;
                n6 = n2;
                n7 = n3;
                n8 = 1;
            }
            else {
                n5 = i;
                n6 = n2;
                n7 = n3;
                n8 = n4;
            }
            n10 = n5 + 1;
            n4 = n8;
            n3 = n7;
            n2 = n6;
        }
        if (n2 != 0) {
            this.j.finishUpdate(this);
        }
        Collections.sort((List<Object>)this.g, StoriesViewPager.c);
        if (n4 != 0) {
            for (int childCount = this.getChildCount(), j = 0; j < childCount; ++j) {
                final StoriesViewPager$LayoutParams storiesViewPager$LayoutParams = (StoriesViewPager$LayoutParams)this.getChildAt(j).getLayoutParams();
                if (!storiesViewPager$LayoutParams.a) {
                    storiesViewPager$LayoutParams.c = 0.0f;
                }
            }
            this.a(n3, false, true);
            this.requestLayout();
        }
    }
    
    void a(final int k) {
        h h;
        int n2;
        if (this.k != k) {
            int n;
            if (this.k < k) {
                n = 66;
            }
            else {
                n = 17;
            }
            final h b = this.b(this.k);
            this.k = k;
            h = b;
            n2 = n;
        }
        else {
            n2 = 2;
            h = null;
        }
        if (this.j == null) {
            this.h();
        }
        else {
            if (this.A) {
                this.h();
                return;
            }
            if (this.getWindowToken() != null) {
                this.j.startUpdate(this);
                final int b2 = this.B;
                final int max = Math.max(0, this.k - b2);
                final int count = this.j.getCount();
                final int min = Math.min(count - 1, b2 + this.k);
                if (count != this.e) {
                    try {
                        final String s = this.getResources().getResourceName(this.getId());
                        throw new IllegalStateException("The application's PagerAdapter changed the adapter's contents without calling PagerAdapter#notifyDataSetChanged! Expected adapter item count: " + this.e + ", found: " + count + " Pager id: " + s + " Pager class: " + this.getClass() + " Problematic adapter: " + this.j.getClass());
                    }
                    catch (Resources$NotFoundException ex) {
                        final String s = Integer.toHexString(this.getId());
                        throw new IllegalStateException("The application's PagerAdapter changed the adapter's contents without calling PagerAdapter#notifyDataSetChanged! Expected adapter item count: " + this.e + ", found: " + count + " Pager id: " + s + " Pager class: " + this.getClass() + " Problematic adapter: " + this.j.getClass());
                    }
                }
                int i = 0;
                while (true) {
                    while (i < this.g.size()) {
                        final h h2 = this.g.get(i);
                        if (h2.b >= this.k) {
                            if (h2.b != this.k) {
                                break;
                            }
                            h a;
                            if (h2 == null && count > 0) {
                                a = this.a(this.k, i);
                            }
                            else {
                                a = h2;
                            }
                            if (a != null) {
                                final int n3 = i - 1;
                                h h3;
                                if (n3 >= 0) {
                                    h3 = this.g.get(n3);
                                }
                                else {
                                    h3 = null;
                                }
                                final int clientWidth = this.getClientWidth();
                                float n4;
                                if (clientWidth <= 0) {
                                    n4 = 0.0f;
                                }
                                else {
                                    n4 = 2.0f - a.d + this.getPaddingLeft() / clientWidth;
                                }
                                final int n5 = -1 + this.k;
                                float n6 = 0.0f;
                                int j = n5;
                                int n7 = i;
                                int n8 = n3;
                                while (j >= 0) {
                                    if (n6 >= n4 && j < max) {
                                        if (h3 == null) {
                                            break;
                                        }
                                        if (j == h3.b && !h3.c) {
                                            this.g.remove(n8);
                                            this.j.destroyItem(this, j, h3.a);
                                            --n8;
                                            --n7;
                                            if (n8 >= 0) {
                                                h3 = (h)this.g.get(n8);
                                            }
                                            else {
                                                h3 = null;
                                            }
                                        }
                                    }
                                    else if (h3 != null && j == h3.b) {
                                        n6 += h3.d;
                                        if (--n8 >= 0) {
                                            h3 = (h)this.g.get(n8);
                                        }
                                        else {
                                            h3 = null;
                                        }
                                    }
                                    else {
                                        n6 += this.a(j, n8 + 1).d;
                                        ++n7;
                                        if (n8 >= 0) {
                                            h3 = (h)this.g.get(n8);
                                        }
                                        else {
                                            h3 = null;
                                        }
                                    }
                                    --j;
                                }
                                float d = a.d;
                                final int n9 = n7 + 1;
                                if (d < 2.0f) {
                                    h h4;
                                    if (n9 < this.g.size()) {
                                        h4 = this.g.get(n9);
                                    }
                                    else {
                                        h4 = null;
                                    }
                                    float n10;
                                    if (clientWidth <= 0) {
                                        n10 = 0.0f;
                                    }
                                    else {
                                        n10 = 2.0f + this.getPaddingRight() / clientWidth;
                                    }
                                    final int n11 = 1 + this.k;
                                    h h5 = h4;
                                    int n12 = n9;
                                    h h7;
                                    float n14;
                                    float n18;
                                    for (int l = n11; l < count; ++l, n18 = n14, h5 = h7, d = n18) {
                                        if (d >= n10 && l > min) {
                                            if (h5 == null) {
                                                break;
                                            }
                                            if (l == h5.b && !h5.c) {
                                                this.g.remove(n12);
                                                this.j.destroyItem(this, l, h5.a);
                                                h h6;
                                                if (n12 < this.g.size()) {
                                                    h6 = this.g.get(n12);
                                                }
                                                else {
                                                    h6 = null;
                                                }
                                                final float n13 = d;
                                                h7 = h6;
                                                n14 = n13;
                                            }
                                            else {
                                                final float n15 = d;
                                                h7 = h5;
                                                n14 = n15;
                                            }
                                        }
                                        else if (h5 != null && l == h5.b) {
                                            final float n16 = d + h5.d;
                                            h h8;
                                            if (++n12 < this.g.size()) {
                                                h8 = this.g.get(n12);
                                            }
                                            else {
                                                h8 = null;
                                            }
                                            h7 = h8;
                                            n14 = n16;
                                        }
                                        else {
                                            final h a2 = this.a(l, n12);
                                            ++n12;
                                            final float n17 = d + a2.d;
                                            h h9;
                                            if (n12 < this.g.size()) {
                                                h9 = this.g.get(n12);
                                            }
                                            else {
                                                h9 = null;
                                            }
                                            h7 = h9;
                                            n14 = n17;
                                        }
                                    }
                                }
                                this.a(a, n7, h);
                            }
                            final x m = this.j;
                            final int k2 = this.k;
                            Object a3;
                            if (a != null) {
                                a3 = a.a;
                            }
                            else {
                                a3 = null;
                            }
                            m.setPrimaryItem(this, k2, a3);
                            this.j.finishUpdate(this);
                            for (int childCount = this.getChildCount(), f = 0; f < childCount; ++f) {
                                final View child = this.getChildAt(f);
                                final StoriesViewPager$LayoutParams storiesViewPager$LayoutParams = (StoriesViewPager$LayoutParams)child.getLayoutParams();
                                storiesViewPager$LayoutParams.f = f;
                                if (!storiesViewPager$LayoutParams.a && storiesViewPager$LayoutParams.c == 0.0f) {
                                    final h b3 = this.b(child);
                                    if (b3 != null) {
                                        storiesViewPager$LayoutParams.c = b3.d;
                                        storiesViewPager$LayoutParams.e = b3.b;
                                    }
                                }
                            }
                            this.h();
                            if (!this.hasFocus()) {
                                return;
                            }
                            final View focus = this.findFocus();
                            h c;
                            if (focus != null) {
                                c = this.c(focus);
                            }
                            else {
                                c = null;
                            }
                            if (c == null || c.b != this.k) {
                                for (int n19 = 0; n19 < this.getChildCount(); ++n19) {
                                    final View child2 = this.getChildAt(n19);
                                    final h b4 = this.b(child2);
                                    if (b4 != null && b4.b == this.k && child2.requestFocus(n2)) {
                                        break;
                                    }
                                }
                            }
                            return;
                        }
                        else {
                            ++i;
                        }
                    }
                    final h h2 = null;
                    continue;
                }
            }
        }
    }
    
    protected void a(final int n, final float n2, final int n3) {
        if (this.W > 0) {
            final int scrollX = this.getScrollX();
            int paddingLeft = this.getPaddingLeft();
            int paddingRight = this.getPaddingRight();
            final int width = this.getWidth();
            int n5 = 0;
            int n6 = 0;
            int n13;
            for (int childCount = this.getChildCount(), i = 0; i < childCount; ++i, n13 = n6, paddingLeft = n5, paddingRight = n13) {
                final View child = this.getChildAt(i);
                final StoriesViewPager$LayoutParams storiesViewPager$LayoutParams = (StoriesViewPager$LayoutParams)child.getLayoutParams();
                if (!storiesViewPager$LayoutParams.a) {
                    final int n4 = paddingRight;
                    n5 = paddingLeft;
                    n6 = n4;
                }
                else {
                    int max = 0;
                    switch (0x7 & storiesViewPager$LayoutParams.b) {
                        default: {
                            max = paddingLeft;
                            final int n7 = paddingRight;
                            n5 = paddingLeft;
                            n6 = n7;
                            break;
                        }
                        case 3: {
                            final int n8 = paddingLeft + child.getWidth();
                            final int n9 = paddingLeft;
                            n6 = paddingRight;
                            n5 = n8;
                            max = n9;
                            break;
                        }
                        case 1: {
                            max = Math.max((width - child.getMeasuredWidth()) / 2, paddingLeft);
                            final int n10 = paddingRight;
                            n5 = paddingLeft;
                            n6 = n10;
                            break;
                        }
                        case 5: {
                            max = width - paddingRight - child.getMeasuredWidth();
                            final int n11 = paddingRight + child.getMeasuredWidth();
                            n5 = paddingLeft;
                            n6 = n11;
                            break;
                        }
                    }
                    final int n12 = max + scrollX - child.getLeft();
                    if (n12 != 0) {
                        child.offsetLeftAndRight(n12);
                    }
                }
            }
        }
        if (this.aa != null) {
            this.aa.a(n, n2, n3);
        }
        if (this.ab != null) {
            this.ab.a(n, n2, n3);
        }
        if (this.ad != null) {
            final int scrollX2 = this.getScrollX();
            for (int childCount2 = this.getChildCount(), j = 0; j < childCount2; ++j) {
                final View child2 = this.getChildAt(j);
                if (!((StoriesViewPager$LayoutParams)child2.getLayoutParams()).a) {
                    this.ad.a(child2, (child2.getLeft() - scrollX2) / this.getClientWidth());
                }
            }
        }
        this.V = true;
    }
    
    void a(final int n, final int n2, final int n3) {
        if (this.getChildCount() == 0) {
            this.setScrollingCacheEnabled(false);
            return;
        }
        final int scrollX = this.getScrollX();
        final int scrollY = this.getScrollY();
        final int n4 = n - scrollX;
        final int n5 = n2 - scrollY;
        if (n4 == 0 && n5 == 0) {
            this.a(false);
            this.b();
            this.setScrollState(0);
            return;
        }
        this.setScrollingCacheEnabled(true);
        this.setScrollState(2);
        final int clientWidth = this.getClientWidth();
        final int n6 = clientWidth / 2;
        final float n7 = n6 + n6 * this.a(Math.min(1.0f, 1.0f * Math.abs(n4) / clientWidth));
        final int abs = Math.abs(n3);
        int n8;
        if (abs > 0) {
            n8 = 4 * Math.round(1000.0f * Math.abs(n7 / abs));
        }
        else {
            n8 = (int)(600.0f * (1.0f + Math.abs(n4) / (clientWidth * this.j.getPageWidth(this.k) + this.q)));
        }
        this.o.startScroll(scrollX, scrollY, n4, n5, Math.min(n8, 1000));
        ViewCompat.postInvalidateOnAnimation((View)this);
    }
    
    public void a(final int n, final boolean b) {
        this.a(n, b, this.A = false);
    }
    
    void a(final int n, final boolean b, final boolean b2) {
        this.a(n, b, b2, 0);
    }
    
    void a(int k, final boolean b, final boolean b2, final int n) {
        if (this.j == null || this.j.getCount() <= 0) {
            this.setScrollingCacheEnabled(false);
            return;
        }
        if (!b2 && this.k == k && this.g.size() != 0) {
            this.setScrollingCacheEnabled(false);
            return;
        }
        if (k < 0) {
            k = 0;
        }
        else if (k >= this.j.getCount()) {
            k = -1 + this.j.getCount();
        }
        final int b3 = this.B;
        if (k > b3 + this.k || k < this.k - b3) {
            for (int i = 0; i < this.g.size(); ++i) {
                ((h)this.g.get(i)).c = true;
            }
        }
        final int j = this.k;
        boolean b4 = false;
        if (j != k) {
            b4 = true;
        }
        if (this.T) {
            this.k = k;
            if (b4 && this.aa != null) {
                this.aa.a(k);
            }
            if (b4 && this.ab != null) {
                this.ab.a(k);
            }
            this.requestLayout();
            return;
        }
        this.a(k);
        this.a(k, b, n, b4);
    }
    
    void a(final Context context, final AttributeSet set) {
        this.setWillNotDraw(false);
        this.setDescendantFocusability(262144);
        this.setFocusable(true);
        if (set != null) {
            final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, pa.StoriesViewPager);
            this.aj = obtainStyledAttributes.getFloat(0, 1.0f);
            if (this.aj == 0.0f) {
                throw new IllegalArgumentException("Edge pull elasticity factor must be nonzero.");
            }
            obtainStyledAttributes.recycle();
        }
        this.o = new Scroller(context, StoriesViewPager.d);
        final ViewConfiguration value = ViewConfiguration.get(context);
        final float density = context.getResources().getDisplayMetrics().density;
        this.G = ViewConfigurationCompat.getScaledPagingTouchSlop(value);
        this.N = (int)(400.0f * density);
        this.O = value.getScaledMaximumFlingVelocity();
        this.P = (int)(25.0f * density);
        this.Q = (int)(2.0f * density);
        this.E = (int)(16.0f * density);
        ViewCompat.setAccessibilityDelegate((View)this, new i(this));
        if (ViewCompat.getImportantForAccessibility((View)this) == 0) {
            ViewCompat.setImportantForAccessibility((View)this, 1);
        }
    }
    
    public boolean a(final KeyEvent keyEvent) {
        if (keyEvent.getAction() == 0) {
            switch (keyEvent.getKeyCode()) {
                case 21: {
                    return this.c(17);
                }
                case 22: {
                    return this.c(66);
                }
                case 61: {
                    if (Build$VERSION.SDK_INT < 11) {
                        break;
                    }
                    if (KeyEventCompat.hasNoModifiers(keyEvent)) {
                        return this.c(2);
                    }
                    if (KeyEventCompat.hasModifiers(keyEvent, 1)) {
                        return this.c(1);
                    }
                    break;
                }
            }
        }
        return false;
    }
    
    protected boolean a(final View view, final boolean b, final int n, final int n2, final int n3) {
        if (view instanceof ViewGroup) {
            final ViewGroup viewGroup = (ViewGroup)view;
            final int scrollX = view.getScrollX();
            final int scrollY = view.getScrollY();
            for (int i = -1 + viewGroup.getChildCount(); i >= 0; --i) {
                final View child = viewGroup.getChildAt(i);
                if (n2 + scrollX >= child.getLeft() && n2 + scrollX < child.getRight() && n3 + scrollY >= child.getTop() && n3 + scrollY < child.getBottom() && this.a(child, true, n, n2 + scrollX - child.getLeft(), n3 + scrollY - child.getTop())) {
                    return true;
                }
            }
        }
        Label_0141: {
            break Label_0141;
        }
        if (!b || !ViewCompat.canScrollHorizontally(view, -n)) {
            return false;
        }
        return true;
    }
    
    public void addFocusables(final ArrayList list, final int n, final int n2) {
        final int size = list.size();
        final int descendantFocusability = this.getDescendantFocusability();
        if (descendantFocusability != 393216) {
            for (int i = 0; i < this.getChildCount(); ++i) {
                final View child = this.getChildAt(i);
                if (child.getVisibility() == 0) {
                    final h b = this.b(child);
                    if (b != null && b.b == this.k) {
                        child.addFocusables(list, n, n2);
                    }
                }
            }
        }
        if ((descendantFocusability != 262144 || size == list.size()) && this.isFocusable() && ((n2 & 0x1) != 0x1 || !this.isInTouchMode() || this.isFocusableInTouchMode()) && list != null) {
            list.add(this);
        }
    }
    
    public void addTouchables(final ArrayList list) {
        for (int i = 0; i < this.getChildCount(); ++i) {
            final View child = this.getChildAt(i);
            if (child.getVisibility() == 0) {
                final h b = this.b(child);
                if (b != null && b.b == this.k) {
                    child.addTouchables(list);
                }
            }
        }
    }
    
    public void addView(final View view, final int n, final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        ViewGroup$LayoutParams generateLayoutParams;
        if (!this.checkLayoutParams(viewGroup$LayoutParams)) {
            generateLayoutParams = this.generateLayoutParams(viewGroup$LayoutParams);
        }
        else {
            generateLayoutParams = viewGroup$LayoutParams;
        }
        final StoriesViewPager$LayoutParams storiesViewPager$LayoutParams = (StoriesViewPager$LayoutParams)generateLayoutParams;
        storiesViewPager$LayoutParams.a |= (view instanceof f);
        if (!this.y) {
            super.addView(view, n, generateLayoutParams);
            return;
        }
        if (storiesViewPager$LayoutParams != null && storiesViewPager$LayoutParams.a) {
            throw new IllegalStateException("Cannot add pager decor view during layout");
        }
        storiesViewPager$LayoutParams.d = true;
        this.addViewInLayout(view, n, generateLayoutParams);
    }
    
    h b(final int n) {
        for (int i = 0; i < this.g.size(); ++i) {
            final h h = this.g.get(i);
            if (h.b == n) {
                return h;
            }
        }
        return null;
    }
    
    h b(final View view) {
        for (int i = 0; i < this.g.size(); ++i) {
            final h h = this.g.get(i);
            if (this.j.isViewFromObject(view, h.a)) {
                return h;
            }
        }
        return null;
    }
    
    void b() {
        this.a(this.k);
    }
    
    h c(View view) {
        while (true) {
            final ViewParent parent = view.getParent();
            if (parent == this) {
                return this.b(view);
            }
            if (parent == null || !(parent instanceof View)) {
                return null;
            }
            view = (View)parent;
        }
    }
    
    public void c() {
        this.C = false;
        this.D = false;
        this.L = -1;
        if (this.M != null) {
            this.M.recycle();
            this.M = null;
        }
    }
    
    public boolean c(final int n) {
        final View focus = this.findFocus();
        View view = null;
        Label_0012: {
            if (focus == this) {
                view = null;
            }
            else {
                Label_0371: {
                    if (focus != null) {
                        ViewParent viewParent = focus.getParent();
                        while (true) {
                            while (viewParent instanceof ViewGroup) {
                                if (viewParent == this) {
                                    final int n2 = 1;
                                    if (n2 == 0) {
                                        final StringBuilder sb = new StringBuilder();
                                        sb.append(focus.getClass().getSimpleName());
                                        for (ViewParent viewParent2 = focus.getParent(); viewParent2 instanceof ViewGroup; viewParent2 = viewParent2.getParent()) {
                                            sb.append(" => ").append(viewParent2.getClass().getSimpleName());
                                        }
                                        Log.e("ElasticViewPager", "arrowScroll tried to find focus based on non-child current focused view " + sb.toString());
                                        view = null;
                                        break Label_0012;
                                    }
                                    break Label_0371;
                                }
                                else {
                                    viewParent = viewParent.getParent();
                                }
                            }
                            final int n2 = 0;
                            continue;
                        }
                    }
                }
                view = focus;
            }
        }
        final View nextFocus = FocusFinder.getInstance().findNextFocus((ViewGroup)this, view, n);
        while (true) {
            Label_0365: {
                boolean b;
                if (nextFocus != null && nextFocus != view) {
                    if (n == 17) {
                        final int left = this.a(this.i, nextFocus).left;
                        final int left2 = this.a(this.i, view).left;
                        if (view != null && left >= left2) {
                            b = this.d();
                        }
                        else {
                            b = nextFocus.requestFocus();
                        }
                    }
                    else {
                        if (n != 66) {
                            break Label_0365;
                        }
                        final int left3 = this.a(this.i, nextFocus).left;
                        final int left4 = this.a(this.i, view).left;
                        if (view != null && left3 <= left4) {
                            b = this.e();
                        }
                        else {
                            b = nextFocus.requestFocus();
                        }
                    }
                }
                else if (n == 17 || n == 1) {
                    b = this.d();
                }
                else {
                    if (n != 66 && n != 2) {
                        break Label_0365;
                    }
                    b = this.e();
                }
                if (b) {
                    this.playSoundEffect(SoundEffectConstants.getContantForFocusDirection(n));
                }
                return b;
            }
            boolean b = false;
            continue;
        }
    }
    
    public boolean canScrollHorizontally(final int n) {
        boolean b = true;
        if (this.j != null) {
            final int clientWidth = this.getClientWidth();
            final int scrollX = this.getScrollX();
            if (n < 0) {
                if (scrollX <= (int)(clientWidth * this.u)) {
                    b = false;
                }
                return b;
            }
            if (n > 0) {
                if (scrollX >= (int)(clientWidth * this.v)) {
                    b = false;
                }
                return b;
            }
        }
        return false;
    }
    
    protected boolean checkLayoutParams(final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        return viewGroup$LayoutParams instanceof StoriesViewPager$LayoutParams && super.checkLayoutParams(viewGroup$LayoutParams);
    }
    
    public void computeScroll() {
        if (!this.o.isFinished() && this.o.computeScrollOffset()) {
            final int scrollX = this.getScrollX();
            final int scrollY = this.getScrollY();
            final int currX = this.o.getCurrX();
            final int currY = this.o.getCurrY();
            if (scrollX != currX || scrollY != currY) {
                this.scrollTo(currX, currY);
                if (!this.d(currX)) {
                    this.o.abortAnimation();
                    this.scrollTo(0, currY);
                }
            }
            ViewCompat.postInvalidateOnAnimation((View)this);
            return;
        }
        this.a(true);
    }
    
    boolean d() {
        if (this.k > 0) {
            this.a(-1 + this.k, true);
            return true;
        }
        return false;
    }
    
    public boolean dispatchKeyEvent(final KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || this.a(keyEvent);
    }
    
    public boolean dispatchPopulateAccessibilityEvent(final AccessibilityEvent accessibilityEvent) {
        if (accessibilityEvent.getEventType() != 4096) {
            final int childCount = this.getChildCount();
            int n = 0;
            while (true) {
                final boolean dispatchPopulateAccessibilityEvent = false;
                if (n >= childCount) {
                    return dispatchPopulateAccessibilityEvent;
                }
                final View child = this.getChildAt(n);
                if (child.getVisibility() == 0) {
                    final h b = this.b(child);
                    if (b != null && b.b == this.k && child.dispatchPopulateAccessibilityEvent(accessibilityEvent)) {
                        break;
                    }
                }
                ++n;
            }
            return true;
        }
        return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }
    
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        final Drawable r = this.r;
        if (r != null && r.isStateful()) {
            r.setState(this.getDrawableState());
        }
    }
    
    boolean e() {
        if (this.j != null && this.k < -1 + this.j.getCount()) {
            this.a(1 + this.k, true);
            return true;
        }
        return false;
    }
    
    protected ViewGroup$LayoutParams generateDefaultLayoutParams() {
        return new StoriesViewPager$LayoutParams();
    }
    
    public ViewGroup$LayoutParams generateLayoutParams(final AttributeSet set) {
        return new StoriesViewPager$LayoutParams(this.getContext(), set);
    }
    
    protected ViewGroup$LayoutParams generateLayoutParams(final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        return this.generateDefaultLayoutParams();
    }
    
    public PagerAdapter getAdapter() {
        return this.j;
    }
    
    protected int getChildDrawingOrder(final int n, int n2) {
        if (this.af == 2) {
            n2 = n - 1 - n2;
        }
        return ((StoriesViewPager$LayoutParams)this.ag.get(n2).getLayoutParams()).f;
    }
    
    public int getCurrentItem() {
        return this.k;
    }
    
    public int getOffscreenPageLimit() {
        return this.B;
    }
    
    public int getPageMargin() {
        return this.q;
    }
    
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.T = true;
    }
    
    protected void onDetachedFromWindow() {
        this.removeCallbacks(this.ah);
        super.onDetachedFromWindow();
    }
    
    protected void onDraw(final Canvas canvas) {
        super.onDraw(canvas);
        if (this.q > 0 && this.r != null && this.g.size() > 0 && this.j != null) {
            final int scrollX = this.getScrollX();
            final int width = this.getWidth();
            final float n = this.q / width;
            h h = this.g.get(0);
            float e = h.e;
            final int size = this.g.size();
            final int b = h.b;
            final int b2 = this.g.get(size - 1).b;
            int n2 = 0;
            for (int i = b; i < b2; ++i) {
                while (i > h.b && n2 < size) {
                    final ArrayList g = this.g;
                    ++n2;
                    h = g.get(n2);
                }
                float n3;
                if (i == h.b) {
                    n3 = (h.e + h.d) * width;
                    e = n + (h.e + h.d);
                }
                else {
                    final float pageWidth = this.j.getPageWidth(i);
                    n3 = (e + pageWidth) * width;
                    e += pageWidth + n;
                }
                if (n3 + this.q > scrollX) {
                    this.r.setBounds((int)n3, this.s, (int)(0.5f + (n3 + this.q)), this.t);
                    this.r.draw(canvas);
                }
                if (n3 > scrollX + width) {
                    break;
                }
            }
        }
    }
    
    public boolean onInterceptTouchEvent(final MotionEvent motionEvent) {
        boolean b;
        if (!this.isEnabled()) {
            b = true;
        }
        else {
            final int n = 0xFF & motionEvent.getAction();
            if (n == 3 || n == 1) {
                this.c();
                return false;
            }
            if (n != 0) {
                if (this.C) {
                    return true;
                }
                final boolean d = this.D;
                b = false;
                if (d) {
                    return b;
                }
            }
            switch (n) {
                case 2: {
                    final int l = this.L;
                    if (l == -1) {
                        break;
                    }
                    final int pointerIndex = MotionEventCompat.findPointerIndex(motionEvent, l);
                    final float x = MotionEventCompat.getX(motionEvent, pointerIndex);
                    final float n2 = x - this.H;
                    final float abs = Math.abs(n2);
                    final float y = MotionEventCompat.getY(motionEvent, pointerIndex);
                    final float abs2 = Math.abs(y - this.K);
                    if (n2 != 0.0f && !this.a(this.H, n2) && this.a((View)this, false, (int)n2, (int)x, (int)y)) {
                        this.H = x;
                        this.I = y;
                        this.D = true;
                        return false;
                    }
                    if (abs > this.G && 0.5f * abs > abs2) {
                        this.c(this.C = true);
                        this.setScrollState(1);
                        float h;
                        if (n2 > 0.0f) {
                            h = this.J + this.G;
                        }
                        else {
                            h = this.J - this.G;
                        }
                        this.H = h;
                        this.I = y;
                        this.setScrollingCacheEnabled(true);
                    }
                    else if (abs2 > this.G) {
                        this.D = true;
                    }
                    if (this.C) {
                        this.b(x);
                        break;
                    }
                    break;
                }
                case 0: {
                    final float x2 = motionEvent.getX();
                    this.J = x2;
                    this.H = x2;
                    final float y2 = motionEvent.getY();
                    this.K = y2;
                    this.I = y2;
                    this.L = MotionEventCompat.getPointerId(motionEvent, 0);
                    this.D = false;
                    this.o.computeScrollOffset();
                    if (this.ai == 2 && Math.abs(this.o.getFinalX() - this.o.getCurrX()) > this.Q) {
                        this.o.abortAnimation();
                        this.A = false;
                        this.b();
                        this.c(this.C = true);
                        this.setScrollState(1);
                        break;
                    }
                    this.a(false);
                    this.C = false;
                    break;
                }
                case 6: {
                    this.a(motionEvent);
                    break;
                }
            }
            if (this.M == null) {
                this.M = VelocityTracker.obtain();
            }
            this.M.addMovement(motionEvent);
            return this.C;
        }
        return b;
    }
    
    protected void onLayout(final boolean b, final int n, final int n2, final int n3, final int n4) {
        final int childCount = this.getChildCount();
        final int n5 = n3 - n;
        final int n6 = n4 - n2;
        int paddingLeft = this.getPaddingLeft();
        int paddingTop = this.getPaddingTop();
        int paddingRight = this.getPaddingRight();
        int paddingBottom = this.getPaddingBottom();
        final int scrollX = this.getScrollX();
        int w = 0;
        int i = 0;
    Label_0262_Outer:
        while (i < childCount) {
            final View child = this.getChildAt(i);
            while (true) {
                Label_0667: {
                    if (child.getVisibility() == 8) {
                        break Label_0667;
                    }
                    final StoriesViewPager$LayoutParams storiesViewPager$LayoutParams = (StoriesViewPager$LayoutParams)child.getLayoutParams();
                    if (!storiesViewPager$LayoutParams.a) {
                        break Label_0667;
                    }
                    final int n7 = 0x7 & storiesViewPager$LayoutParams.b;
                    final int n8 = 0x70 & storiesViewPager$LayoutParams.b;
                    int max = 0;
                    switch (n7) {
                        default: {
                            max = paddingLeft;
                            break;
                        }
                        case 3: {
                            final int n9 = paddingLeft + child.getMeasuredWidth();
                            max = paddingLeft;
                            paddingLeft = n9;
                            break;
                        }
                        case 1: {
                            max = Math.max((n5 - child.getMeasuredWidth()) / 2, paddingLeft);
                            break;
                        }
                        case 5: {
                            final int n10 = n5 - paddingRight - child.getMeasuredWidth();
                            paddingRight += child.getMeasuredWidth();
                            max = n10;
                            break;
                        }
                    }
                    int max2 = 0;
                    int n12 = 0;
                    int n13 = 0;
                    switch (n8) {
                        default: {
                            max2 = paddingTop;
                            final int n11 = paddingBottom;
                            n12 = paddingTop;
                            n13 = n11;
                            break;
                        }
                        case 48: {
                            final int n14 = paddingTop + child.getMeasuredHeight();
                            final int n15 = paddingTop;
                            n13 = paddingBottom;
                            n12 = n14;
                            max2 = n15;
                            break;
                        }
                        case 16: {
                            max2 = Math.max((n6 - child.getMeasuredHeight()) / 2, paddingTop);
                            final int n16 = paddingBottom;
                            n12 = paddingTop;
                            n13 = n16;
                            break;
                        }
                        case 80: {
                            max2 = n6 - paddingBottom - child.getMeasuredHeight();
                            final int n17 = paddingBottom + child.getMeasuredHeight();
                            n12 = paddingTop;
                            n13 = n17;
                            break;
                        }
                    }
                    final int n18 = max + scrollX;
                    child.layout(n18, max2, n18 + child.getMeasuredWidth(), max2 + child.getMeasuredHeight());
                    final int n19 = w + 1;
                    final int n20 = n12;
                    paddingBottom = n13;
                    final int n21 = paddingRight;
                    final int n22 = paddingLeft;
                    ++i;
                    paddingLeft = n22;
                    paddingRight = n21;
                    paddingTop = n20;
                    w = n19;
                    continue Label_0262_Outer;
                }
                final int n19 = w;
                final int n20 = paddingTop;
                final int n21 = paddingRight;
                final int n22 = paddingLeft;
                continue;
            }
        }
        final int n23 = n5 - paddingLeft - paddingRight;
        for (int j = 0; j < childCount; ++j) {
            final View child2 = this.getChildAt(j);
            if (child2.getVisibility() != 8) {
                final StoriesViewPager$LayoutParams storiesViewPager$LayoutParams2 = (StoriesViewPager$LayoutParams)child2.getLayoutParams();
                if (!storiesViewPager$LayoutParams2.a) {
                    final h b2 = this.b(child2);
                    if (b2 != null) {
                        final int n24 = paddingLeft + (int)(n23 * b2.e);
                        if (storiesViewPager$LayoutParams2.d) {
                            storiesViewPager$LayoutParams2.d = false;
                            child2.measure(View$MeasureSpec.makeMeasureSpec((int)(n23 * storiesViewPager$LayoutParams2.c), 1073741824), View$MeasureSpec.makeMeasureSpec(n6 - paddingTop - paddingBottom, 1073741824));
                        }
                        child2.layout(n24, paddingTop, n24 + child2.getMeasuredWidth(), paddingTop + child2.getMeasuredHeight());
                    }
                }
            }
        }
        this.s = paddingTop;
        this.t = n6 - paddingBottom;
        this.W = w;
        if (this.T && childCount - w > 0) {
            this.a(this.k, false, 0, false);
        }
        this.T = false;
    }
    
    protected void onMeasure(final int n, final int n2) {
        this.setMeasuredDimension(getDefaultSize(0, n), getDefaultSize(0, n2));
        final int measuredWidth = this.getMeasuredWidth();
        this.F = Math.min(measuredWidth / 10, this.E);
        int n3 = measuredWidth - this.getPaddingLeft() - this.getPaddingRight();
        int n4 = this.getMeasuredHeight() - this.getPaddingTop() - this.getPaddingBottom();
    Label_0288:
        for (int childCount = this.getChildCount(), i = 0; i < childCount; ++i) {
            final View child = this.getChildAt(i);
            if (child.getVisibility() != 8) {
                final StoriesViewPager$LayoutParams storiesViewPager$LayoutParams = (StoriesViewPager$LayoutParams)child.getLayoutParams();
                if (storiesViewPager$LayoutParams != null && storiesViewPager$LayoutParams.a) {
                    final int n5 = 0x7 & storiesViewPager$LayoutParams.b;
                    final int n6 = 0x70 & storiesViewPager$LayoutParams.b;
                    int n7 = Integer.MIN_VALUE;
                    int n8 = Integer.MIN_VALUE;
                    boolean b;
                    if (n6 == 48 || n6 == 80) {
                        b = true;
                    }
                    else {
                        b = false;
                    }
                    final boolean b2 = n5 == 3 || n5 == 5;
                    if (b) {
                        n7 = 1073741824;
                    }
                    else if (b2) {
                        n8 = 1073741824;
                    }
                    int n9;
                    int width;
                    if (storiesViewPager$LayoutParams.width != -2) {
                        n9 = 1073741824;
                        if (storiesViewPager$LayoutParams.width != -1) {
                            width = storiesViewPager$LayoutParams.width;
                        }
                        else {
                            width = n3;
                        }
                    }
                    else {
                        n9 = n7;
                        width = n3;
                    }
                    while (true) {
                        Label_0464: {
                            if (storiesViewPager$LayoutParams.height == -2) {
                                break Label_0464;
                            }
                            n8 = 1073741824;
                            if (storiesViewPager$LayoutParams.height == -1) {
                                break Label_0464;
                            }
                            final int height = storiesViewPager$LayoutParams.height;
                            child.measure(View$MeasureSpec.makeMeasureSpec(width, n9), View$MeasureSpec.makeMeasureSpec(height, n8));
                            if (b) {
                                n4 -= child.getMeasuredHeight();
                                continue Label_0288;
                            }
                            if (b2) {
                                n3 -= child.getMeasuredWidth();
                            }
                            continue Label_0288;
                        }
                        final int height = n4;
                        continue;
                    }
                }
            }
        }
        this.w = View$MeasureSpec.makeMeasureSpec(n3, 1073741824);
        this.x = View$MeasureSpec.makeMeasureSpec(n4, 1073741824);
        this.y = true;
        this.b();
        this.y = false;
        for (int childCount2 = this.getChildCount(), j = 0; j < childCount2; ++j) {
            final View child2 = this.getChildAt(j);
            if (child2.getVisibility() != 8) {
                final StoriesViewPager$LayoutParams storiesViewPager$LayoutParams2 = (StoriesViewPager$LayoutParams)child2.getLayoutParams();
                if (storiesViewPager$LayoutParams2 == null || !storiesViewPager$LayoutParams2.a) {
                    child2.measure(View$MeasureSpec.makeMeasureSpec((int)(n3 * storiesViewPager$LayoutParams2.c), 1073741824), this.x);
                }
            }
        }
    }
    
    protected boolean onRequestFocusInDescendants(final int n, final Rect rect) {
        int n2 = -1;
        int childCount = this.getChildCount();
        int i;
        if ((n & 0x2) != 0x0) {
            n2 = 1;
            i = 0;
        }
        else {
            i = childCount - 1;
            childCount = n2;
        }
        while (i != childCount) {
            final View child = this.getChildAt(i);
            if (child.getVisibility() == 0) {
                final h b = this.b(child);
                if (b != null && b.b == this.k && child.requestFocus(n, rect)) {
                    return true;
                }
            }
            i += n2;
        }
        return false;
    }
    
    public void onRestoreInstanceState(final Parcelable parcelable) {
        if (!(parcelable instanceof StoriesViewPager$SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        final StoriesViewPager$SavedState storiesViewPager$SavedState = (StoriesViewPager$SavedState)parcelable;
        super.onRestoreInstanceState(storiesViewPager$SavedState.getSuperState());
        if (this.j != null) {
            this.j.restoreState(storiesViewPager$SavedState.b, storiesViewPager$SavedState.c);
            this.a(storiesViewPager$SavedState.a, false, true);
            return;
        }
        this.l = storiesViewPager$SavedState.a;
        this.m = storiesViewPager$SavedState.b;
        this.n = storiesViewPager$SavedState.c;
    }
    
    public Parcelable onSaveInstanceState() {
        final StoriesViewPager$SavedState storiesViewPager$SavedState = new StoriesViewPager$SavedState(super.onSaveInstanceState());
        storiesViewPager$SavedState.a = this.k;
        if (this.j != null) {
            storiesViewPager$SavedState.b = this.j.saveState();
        }
        return (Parcelable)storiesViewPager$SavedState;
    }
    
    protected void onSizeChanged(final int n, final int n2, final int n3, final int n4) {
        super.onSizeChanged(n, n2, n3, n4);
        if (n != n3) {
            this.a(n, n3, this.q, this.q);
        }
    }
    
    public boolean onTouchEvent(final MotionEvent motionEvent) {
        if (this.isEnabled()) {
            if (this.R) {
                return true;
            }
            if ((motionEvent.getAction() != 0 || motionEvent.getEdgeFlags() == 0) && this.j != null && this.j.getCount() != 0) {
                if (this.M == null) {
                    this.M = VelocityTracker.obtain();
                }
                this.M.addMovement(motionEvent);
                switch (0xFF & motionEvent.getAction()) {
                    case 0: {
                        this.o.abortAnimation();
                        this.A = false;
                        this.b();
                        final float x = motionEvent.getX();
                        this.J = x;
                        this.H = x;
                        final float y = motionEvent.getY();
                        this.K = y;
                        this.I = y;
                        this.f = this.getScrollX();
                        this.L = MotionEventCompat.getPointerId(motionEvent, 0);
                        break;
                    }
                    case 2: {
                        if (!this.C) {
                            final int pointerIndex = MotionEventCompat.findPointerIndex(motionEvent, this.L);
                            final float x2 = MotionEventCompat.getX(motionEvent, pointerIndex);
                            final float abs = Math.abs(x2 - this.H);
                            final float y2 = MotionEventCompat.getY(motionEvent, pointerIndex);
                            final float abs2 = Math.abs(y2 - this.I);
                            if (abs > this.G && abs > abs2) {
                                this.c(this.C = true);
                                float h;
                                if (x2 - this.J > 0.0f) {
                                    h = this.J + this.G;
                                }
                                else {
                                    h = this.J - this.G;
                                }
                                this.H = h;
                                this.I = y2;
                                this.setScrollState(1);
                                this.setScrollingCacheEnabled(true);
                                final ViewParent parent = this.getParent();
                                if (parent != null) {
                                    parent.requestDisallowInterceptTouchEvent(true);
                                }
                            }
                        }
                        if (this.C) {
                            this.b(MotionEventCompat.getX(motionEvent, MotionEventCompat.findPointerIndex(motionEvent, this.L)));
                            break;
                        }
                        break;
                    }
                    case 1: {
                        if (this.C) {
                            final VelocityTracker m = this.M;
                            m.computeCurrentVelocity(1000, (float)this.O);
                            final int n = (int)VelocityTrackerCompat.getXVelocity(m, this.L);
                            this.A = true;
                            final int clientWidth = this.getClientWidth();
                            final int scrollX = this.getScrollX();
                            final h i = this.i();
                            this.a(this.a(i.b, (scrollX / clientWidth - i.e) / i.d, n, (int)(MotionEventCompat.getX(motionEvent, MotionEventCompat.findPointerIndex(motionEvent, this.L)) - this.J)), true, true, n);
                            this.L = -1;
                            this.j();
                            break;
                        }
                        break;
                    }
                    case 3: {
                        if (this.C) {
                            this.a(this.k, true, 0, false);
                            this.L = -1;
                            this.j();
                            break;
                        }
                        break;
                    }
                    case 5: {
                        final int actionIndex = MotionEventCompat.getActionIndex(motionEvent);
                        this.H = MotionEventCompat.getX(motionEvent, actionIndex);
                        this.L = MotionEventCompat.getPointerId(motionEvent, actionIndex);
                        break;
                    }
                    case 6: {
                        this.a(motionEvent);
                        this.H = MotionEventCompat.getX(motionEvent, MotionEventCompat.findPointerIndex(motionEvent, this.L));
                        break;
                    }
                }
                return true;
            }
        }
        return false;
    }
    
    public void removeView(final View view) {
        if (this.y) {
            this.removeViewInLayout(view);
            return;
        }
        super.removeView(view);
    }
    
    public void scrollTo(final int n, final int n2) {
        super.scrollTo(n, n2);
        this.f = n;
    }
    
    public void setAdapter(final x j) {
        if (this.j != null) {
            this.j.unregisterDataSetObserver(this.p);
            this.j.startUpdate(this);
            for (int i = 0; i < this.g.size(); ++i) {
                final h h = this.g.get(i);
                this.j.destroyItem(this, h.b, h.a);
            }
            this.j.finishUpdate(this);
            this.g.clear();
            this.g();
            this.scrollTo(this.k = 0, 0);
        }
        final x k = this.j;
        this.j = j;
        this.e = 0;
        if (this.j != null) {
            if (this.p == null) {
                this.p = new m(this, null);
            }
            this.j.registerDataSetObserver(this.p);
            this.A = false;
            final boolean t = this.T;
            this.T = true;
            this.e = this.j.getCount();
            if (this.l >= 0) {
                this.j.restoreState(this.m, this.n);
                this.a(this.l, false, true);
                this.l = -1;
                this.m = null;
                this.n = null;
            }
            else if (!t) {
                this.b();
            }
            else {
                this.requestLayout();
            }
        }
        if (this.ac != null && k != j) {
            this.ac.a(k, j);
        }
    }
    
    void setChildrenDrawingOrderEnabledCompat(final boolean p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: bipush          7
        //     5: if_icmplt       71
        //     8: aload_0        
        //     9: getfield        com/twitter/android/widget/highlights/StoriesViewPager.ae:Ljava/lang/reflect/Method;
        //    12: ifnonnull       42
        //    15: iconst_1       
        //    16: anewarray       Ljava/lang/Class;
        //    19: astore          9
        //    21: aload           9
        //    23: iconst_0       
        //    24: getstatic       java/lang/Boolean.TYPE:Ljava/lang/Class;
        //    27: aastore        
        //    28: aload_0        
        //    29: ldc             Landroid/view/ViewGroup;.class
        //    31: ldc_w           "setChildrenDrawingOrderEnabled"
        //    34: aload           9
        //    36: invokevirtual   java/lang/Class.getDeclaredMethod:(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
        //    39: putfield        com/twitter/android/widget/highlights/StoriesViewPager.ae:Ljava/lang/reflect/Method;
        //    42: aload_0        
        //    43: getfield        com/twitter/android/widget/highlights/StoriesViewPager.ae:Ljava/lang/reflect/Method;
        //    46: astore          4
        //    48: iconst_1       
        //    49: anewarray       Ljava/lang/Object;
        //    52: astore          5
        //    54: aload           5
        //    56: iconst_0       
        //    57: iload_1        
        //    58: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        //    61: aastore        
        //    62: aload           4
        //    64: aload_0        
        //    65: aload           5
        //    67: invokevirtual   java/lang/reflect/Method.invoke:(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
        //    70: pop            
        //    71: return         
        //    72: astore          7
        //    74: ldc_w           "ElasticViewPager"
        //    77: ldc_w           "Can't find setChildrenDrawingOrderEnabled"
        //    80: aload           7
        //    82: invokestatic    android/util/Log.e:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
        //    85: pop            
        //    86: goto            42
        //    89: astore_2       
        //    90: ldc_w           "ElasticViewPager"
        //    93: ldc_w           "Error changing children drawing order"
        //    96: aload_2        
        //    97: invokestatic    android/util/Log.e:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
        //   100: pop            
        //   101: return         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  15     42     72     89     Ljava/lang/NoSuchMethodException;
        //  42     71     89     102    Ljava/lang/Exception;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0042:
        //     at com.strobel.decompiler.ast.Error.expressionLinkedFromMultipleLocations(Error.java:27)
        //     at com.strobel.decompiler.ast.AstOptimizer.mergeDisparateObjectInitializations(AstOptimizer.java:2592)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:235)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:42)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:214)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:99)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:757)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:655)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:532)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:499)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:141)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:130)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:105)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:317)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:238)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:123)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public void setCurrentItem(final int n) {
        this.A = false;
        this.a(n, !this.T, false);
    }
    
    public void setEdgeListener(final g g) {
        this.S = new WeakReference((T)g);
    }
    
    public void setOffscreenPageLimit(int b) {
        if (b < 1) {
            Log.w("ElasticViewPager", "Requested offscreen page limit " + b + " too small; defaulting to " + 1);
            b = 1;
        }
        if (b != this.B) {
            this.B = b;
            this.b();
        }
    }
    
    void setOnAdapterChangeListener(final j ac) {
        this.ac = ac;
    }
    
    public void setOnPageChangeListener(final k aa) {
        this.aa = aa;
    }
    
    public void setPageMargin(final int q) {
        final int q2 = this.q;
        this.q = q;
        final int width = this.getWidth();
        this.a(width, width, q, q2);
        this.requestLayout();
    }
    
    public void setPageMarginDrawable(@DrawableRes final int n) {
        this.setPageMarginDrawable(this.getContext().getResources().getDrawable(n));
    }
    
    public void setPageMarginDrawable(final Drawable r) {
        this.r = r;
        if (r != null) {
            this.refreshDrawableState();
        }
        this.setWillNotDraw(r == null);
        this.invalidate();
    }
    
    void setScrollState(final int ai) {
        if (this.ai != ai) {
            this.ai = ai;
            this.b(ai != 0);
            if (this.aa != null) {
                this.aa.b(ai);
            }
        }
    }
    
    protected boolean verifyDrawable(final Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.r;
    }
}
