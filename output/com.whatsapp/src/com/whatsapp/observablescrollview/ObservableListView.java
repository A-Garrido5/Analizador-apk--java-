// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.observablescrollview;

import com.whatsapp.DialogToastActivity;
import android.os.Parcelable;
import android.view.View;
import android.util.AttributeSet;
import android.content.Context;
import android.os.Build$VERSION;
import android.util.SparseIntArray;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.widget.AbsListView$OnScrollListener;
import android.widget.ListView;

public class ObservableListView extends ListView implements b
{
    public static boolean i;
    private static final boolean q;
    private int a;
    private int b;
    private AbsListView$OnScrollListener c;
    private a d;
    private boolean e;
    private ViewGroup f;
    private int g;
    private boolean h;
    private int j;
    private g k;
    private AbsListView$OnScrollListener l;
    private int m;
    private boolean n;
    private MotionEvent o;
    private SparseIntArray p;
    
    static {
        q = (Build$VERSION.SDK_INT >= 8);
    }
    
    public ObservableListView(final Context context) {
        super(context);
        this.j = -1;
        this.c = (AbsListView$OnScrollListener)new f(this);
        this.a();
    }
    
    public ObservableListView(final Context context, final AttributeSet set) {
        super(context, set);
        this.j = -1;
        this.c = (AbsListView$OnScrollListener)new f(this);
        this.a();
    }
    
    public ObservableListView(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        this.j = -1;
        this.c = (AbsListView$OnScrollListener)new f(this);
        this.a();
    }
    
    static a a(final ObservableListView observableListView) {
        return observableListView.d;
    }
    
    private void a() {
        this.p = new SparseIntArray();
        super.setOnScrollListener(this.c);
    }
    
    private void b() {
        final boolean i = ObservableListView.i;
        if (this.d != null && this.getChildCount() > 0) {
            final int firstVisiblePosition = this.getFirstVisiblePosition();
            int j = this.getFirstVisiblePosition();
            int n = 0;
            while (j <= this.getLastVisiblePosition()) {
                if (this.p.indexOfKey(j) < 0 || this.getChildAt(n).getHeight() != this.p.get(j)) {
                    this.p.put(j, this.getChildAt(n).getHeight());
                }
                ++j;
                ++n;
                if (i) {
                    break;
                }
            }
            final View child = this.getChildAt(0);
            if (child != null) {
                Label_0345: {
                    if (this.a < firstVisiblePosition) {
                        int n2;
                        if (firstVisiblePosition - this.a != 1) {
                            int k = firstVisiblePosition - 1;
                            n2 = 0;
                            while (k > this.a) {
                                Label_0184: {
                                    if (this.p.indexOfKey(k) > 0) {
                                        n2 += this.p.get(k);
                                        if (!i) {
                                            break Label_0184;
                                        }
                                    }
                                    n2 += child.getHeight();
                                }
                                --k;
                                if (i) {
                                    break;
                                }
                            }
                        }
                        else {
                            n2 = 0;
                        }
                        this.b += n2 + this.j;
                        this.j = child.getHeight();
                        if (!i) {
                            break Label_0345;
                        }
                    }
                    if (firstVisiblePosition < this.a) {
                        int n3;
                        if (this.a - firstVisiblePosition != 1) {
                            int l = -1 + this.a;
                            n3 = 0;
                            while (l > firstVisiblePosition) {
                                Label_0295: {
                                    if (this.p.indexOfKey(l) > 0) {
                                        n3 += this.p.get(l);
                                        if (!i) {
                                            break Label_0295;
                                        }
                                    }
                                    n3 += child.getHeight();
                                }
                                --l;
                                if (i) {
                                    break;
                                }
                            }
                        }
                        else {
                            n3 = 0;
                        }
                        this.b -= n3 + child.getHeight();
                        this.j = child.getHeight();
                        if (!i) {
                            break Label_0345;
                        }
                    }
                    if (firstVisiblePosition == 0) {
                        this.j = child.getHeight();
                    }
                }
                if (this.j < 0) {
                    this.j = 0;
                }
                this.g = this.b - child.getTop();
                this.a = firstVisiblePosition;
                this.d.a(this, this.g, this.h, this.e);
                if (this.h) {
                    this.h = false;
                }
                Label_0461: {
                    if (this.m < this.g) {
                        this.k = com.whatsapp.observablescrollview.g.UP;
                        if (!i) {
                            break Label_0461;
                        }
                    }
                    if (this.g < this.m) {
                        this.k = com.whatsapp.observablescrollview.g.DOWN;
                        if (!i) {
                            break Label_0461;
                        }
                    }
                    this.k = com.whatsapp.observablescrollview.g.STOP;
                }
                this.m = this.g;
            }
        }
    }
    
    static void b(final ObservableListView observableListView) {
        observableListView.b();
    }
    
    static AbsListView$OnScrollListener c(final ObservableListView observableListView) {
        return observableListView.l;
    }
    
    public int c() {
        return this.g;
    }
    
    public boolean onInterceptTouchEvent(final MotionEvent motionEvent) {
        final boolean i = ObservableListView.i;
        if (this.d != null) {
            int n = 0;
            Label_0031: {
                if (ObservableListView.q) {
                    n = motionEvent.getActionMasked();
                    if (!i) {
                        break Label_0031;
                    }
                }
                n = motionEvent.getAction();
            }
            Label_0093: {
                switch (n) {
                    case 0: {
                        this.e = true;
                        this.h = true;
                        this.d.a();
                        if (i) {
                            break Label_0093;
                        }
                        break;
                    }
                    case 1:
                    case 3: {
                        this.e = false;
                        break;
                    }
                }
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }
    
    public void onRestoreInstanceState(final Parcelable parcelable) {
        final d d = (d)parcelable;
        this.a = d.b;
        this.j = d.d;
        this.b = d.e;
        this.m = d.c;
        this.g = d.a;
        this.p = d.f;
        super.onRestoreInstanceState(d.getSuperState());
    }
    
    public Parcelable onSaveInstanceState() {
        final boolean i = ObservableListView.i;
        final d d = new d(super.onSaveInstanceState(), null);
        d.b = this.a;
        d.d = this.j;
        d.e = this.b;
        d.c = this.m;
        d.a = this.g;
        d.f = this.p;
        if (DialogToastActivity.h) {
            ObservableListView.i = !i;
        }
        return (Parcelable)d;
    }
    
    public boolean onTouchEvent(final MotionEvent o) {
        float n = 0.0f;
        final boolean i = ObservableListView.i;
        if (this.d != null) {
            int n2 = 0;
            Label_0035: {
                if (ObservableListView.q) {
                    n2 = o.getActionMasked();
                    if (!i) {
                        break Label_0035;
                    }
                }
                n2 = o.getAction();
            }
            Label_0097: {
                switch (n2) {
                    case 1:
                    case 3: {
                        this.n = false;
                        this.e = false;
                        this.d.a(this.k);
                        if (i) {
                            break Label_0097;
                        }
                        break;
                    }
                    case 2: {
                        if (this.o == null) {
                            this.o = o;
                        }
                        final float n3 = o.getY() - this.o.getY();
                        this.o = MotionEvent.obtainNoHistory(o);
                        if (this.c() - n3 > 0.0f) {
                            break;
                        }
                        if (this.n) {
                            return false;
                        }
                        ViewGroup f = null;
                        Label_0179: {
                            if (this.f == null) {
                                final ViewGroup viewGroup = (ViewGroup)this.getParent();
                                if (!i) {
                                    f = viewGroup;
                                    break Label_0179;
                                }
                            }
                            f = this.f;
                        }
                        Object o2 = this;
                        float n4 = 0.0f;
                        while (o2 != null && o2 != f) {
                            final float n5 = n + (((View)o2).getLeft() - ((View)o2).getScrollX());
                            final float n6 = n4 + (((View)o2).getTop() - ((View)o2).getScrollY());
                            final View view = (View)((View)o2).getParent();
                            if (i) {
                                n4 = n6;
                                n = n5;
                                break;
                            }
                            o2 = view;
                            n4 = n6;
                            n = n5;
                        }
                        final MotionEvent obtainNoHistory = MotionEvent.obtainNoHistory(o);
                        obtainNoHistory.offsetLocation(n, n4);
                        if (f.onInterceptTouchEvent(obtainNoHistory)) {
                            this.n = true;
                            obtainNoHistory.setAction(0);
                            this.post((Runnable)new c(this, f, obtainNoHistory));
                            return false;
                        }
                        return super.onTouchEvent(o);
                    }
                }
            }
        }
        return super.onTouchEvent(o);
    }
    
    public void setOnScrollListener(final AbsListView$OnScrollListener l) {
        this.l = l;
    }
    
    public void setScrollViewCallbacks(final a d) {
        this.d = d;
    }
}
