// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.widget;

import android.widget.LinearLayout$LayoutParams;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.view.ViewGroup;
import java.util.Iterator;
import android.widget.TextView;
import android.widget.ImageView;
import android.util.Pair;
import android.widget.AbsListView$LayoutParams;
import android.view.ViewGroup$LayoutParams;
import android.view.View;
import java.util.HashSet;
import android.view.animation.AnimationUtils;
import android.database.DataSetObserver;
import android.view.animation.Animation;
import java.lang.ref.WeakReference;
import android.content.Context;
import java.util.Set;
import android.view.View$OnLayoutChangeListener;
import android.widget.BaseAdapter;

public class ChunkedAdapter extends BaseAdapter implements View$OnLayoutChangeListener
{
    private int A;
    private int B;
    private Set C;
    protected final s a;
    protected final s b;
    protected final int c;
    protected BaseAdapter d;
    protected BaseAdapter e;
    private boolean f;
    private final Context g;
    private WeakReference h;
    private WeakReference i;
    private WeakReference j;
    private WeakReference k;
    private final Animation l;
    private final Animation m;
    private final Animation n;
    private final Animation o;
    private ChunkedAdapter$ScrollAction p;
    private int q;
    private int r;
    private int[] s;
    private int t;
    private int[] u;
    private boolean v;
    private boolean w;
    private int x;
    private int y;
    private int z;
    
    public ChunkedAdapter(final Context g, final BaseAdapter d, final BaseAdapter e, final int x, final int y, final int z, final int a) {
        this.f = false;
        this.g = g;
        this.d = d;
        this.e = e;
        this.c = 2130968639;
        this.a = new s(this, 0);
        this.b = new s(this, 1);
        this.d.registerDataSetObserver((DataSetObserver)this.a);
        this.e.registerDataSetObserver((DataSetObserver)this.b);
        this.l = AnimationUtils.loadAnimation(this.g, 2131034165);
        this.m = AnimationUtils.loadAnimation(this.g, 2131034164);
        this.n = AnimationUtils.loadAnimation(this.g, 2131034162);
        this.o = AnimationUtils.loadAnimation(this.g, 2131034163);
        this.s = new int[this.d.getCount()];
        this.u = new int[this.e.getCount()];
        this.v = false;
        this.w = false;
        this.x = x;
        this.y = y;
        this.z = z;
        this.A = a;
        this.C = new HashSet();
        this.B = this.g.getResources().getDimensionPixelSize(2131558513);
    }
    
    private void a(final int n, final int n2, final int n3) {
        if (n2 == 0 && n < this.s.length && n3 != this.s[n]) {
            boolean v = false;
            Label_0040: {
                if (!this.v) {
                    v = false;
                    if (n != 0) {
                        break Label_0040;
                    }
                }
                v = true;
            }
            this.v = v;
            this.r += n3 - this.s[n];
            this.s[n] = n3;
            this.d();
        }
        else if (n2 == 1 && n < this.u.length && n3 != this.u[n]) {
            boolean w = false;
            Label_0127: {
                if (!this.w) {
                    final int n4 = -1 + this.u.length;
                    w = false;
                    if (n != n4) {
                        break Label_0127;
                    }
                }
                w = true;
            }
            this.w = w;
            this.t += n3 - this.u[n];
            this.u[n] = n3;
            this.e();
        }
    }
    
    private void d() {
        if (this.j != null && this.v) {
            final View view = (View)this.j.get();
            if (view != null) {
                final int max = Math.max(0, this.q - this.r - this.B);
                final ViewGroup$LayoutParams layoutParams = view.getLayoutParams();
                layoutParams.height = max;
                view.setLayoutParams(layoutParams);
                view.invalidate();
            }
        }
    }
    
    private void e() {
        if (this.k != null && this.w) {
            final View view = (View)this.k.get();
            if (view != null) {
                final int max = Math.max(0, this.q - this.t);
                final ViewGroup$LayoutParams layoutParams = view.getLayoutParams();
                if (layoutParams == null) {
                    view.setLayoutParams((ViewGroup$LayoutParams)new AbsListView$LayoutParams(-1, max));
                }
                else {
                    layoutParams.height = max;
                    view.setLayoutParams(layoutParams);
                }
                view.invalidate();
            }
        }
    }
    
    public Pair a(int n) {
        final int count = this.d.getCount();
        final int count2 = this.e.getCount();
        BaseAdapter baseAdapter;
        if (n < count) {
            baseAdapter = this.d;
        }
        else {
            final Pair create = null;
            if (n == count) {
                return create;
            }
            final int n2 = count2 + (count + 1);
            baseAdapter = null;
            if (n < n2) {
                baseAdapter = this.e;
                n = -1 + (n - count);
            }
        }
        return Pair.create((Object)baseAdapter, (Object)n);
    }
    
    public void a(final r r) {
        this.C.add(r);
    }
    
    public void a(final t t) {
        final ChunkedAdapter$ScrollAction b = t.b;
        final boolean a = t.a;
        final ImageView imageView = (ImageView)this.i.get();
        if (b != this.p) {
            while (true) {
                int n = 0;
                Label_0222: {
                    int text = 0;
                    switch (com.twitter.android.widget.q.a[t.b.ordinal()]) {
                        default: {
                            if (this.p != ChunkedAdapter$ScrollAction.c) {
                                text = 0;
                                break;
                            }
                            if (a) {
                                n = this.z;
                            }
                            else {
                                n = this.x;
                            }
                            if (imageView != null) {
                                Animation animation;
                                if (a) {
                                    animation = this.m;
                                }
                                else {
                                    animation = this.o;
                                }
                                imageView.startAnimation(animation);
                                text = n;
                                break;
                            }
                            break Label_0222;
                        }
                        case 1: {
                            if (a) {
                                n = this.A;
                            }
                            else {
                                n = this.y;
                            }
                            if (imageView != null) {
                                Animation animation2;
                                if (a) {
                                    animation2 = this.l;
                                }
                                else {
                                    animation2 = this.n;
                                }
                                imageView.startAnimation(animation2);
                                text = n;
                                break;
                            }
                            break Label_0222;
                        }
                    }
                    final TextView textView = (TextView)this.h.get();
                    if (textView != null && text != 0) {
                        textView.setText(text);
                    }
                    this.p = b;
                    return;
                }
                int text = n;
                continue;
            }
        }
    }
    
    public boolean a() {
        return this.e.getCount() > 0;
    }
    
    public boolean areAllItemsEnabled() {
        return this.d.areAllItemsEnabled() && this.e.areAllItemsEnabled() && (this.d.isEmpty() || this.e.isEmpty());
    }
    
    public boolean b() {
        return this.f;
    }
    
    public void c() {
        int text;
        int imageResource;
        if (this.f) {
            final int x = this.x;
            this.f = false;
            text = x;
            imageResource = 2130839219;
        }
        else {
            final int z = this.z;
            this.f = true;
            text = z;
            imageResource = 2130839218;
        }
        final ImageView imageView = (ImageView)this.i.get();
        if (imageView != null) {
            imageView.clearAnimation();
            imageView.setImageResource(imageResource);
        }
        final TextView textView = (TextView)this.h.get();
        if (textView != null) {
            textView.setText(text);
        }
        this.p = ChunkedAdapter$ScrollAction.a;
        final Iterator<r> iterator = (Iterator<r>)this.C.iterator();
        while (iterator.hasNext()) {
            iterator.next().e(this.f);
        }
    }
    
    public int getCount() {
        if (!this.a()) {
            return this.d.getCount();
        }
        return 1 + (1 + this.d.getCount() + this.e.getCount());
    }
    
    public Object getItem(final int n) {
        final Pair a = this.a(n);
        if (a != null && a.first != null) {
            return ((BaseAdapter)a.first).getItem((int)a.second);
        }
        return null;
    }
    
    public long getItemId(final int n) {
        final Pair a = this.a(n);
        if (a == null) {
            return 0L;
        }
        if (a.first != null) {
            return ((BaseAdapter)a.first).getItemId((int)a.second);
        }
        return -1L;
    }
    
    public int getItemViewType(final int n) {
        final Pair a = this.a(n);
        if (a == null) {
            return 0;
        }
        if (a.first == this.d) {
            return 2 + this.d.getItemViewType((int)a.second);
        }
        if (a.first == this.e) {
            return 2 + this.d.getViewTypeCount() + this.e.getItemViewType((int)a.second);
        }
        return 1;
    }
    
    public View getView(final int n, View view, final ViewGroup viewGroup) {
        final Pair a = this.a(n);
        this.q = viewGroup.getMeasuredHeight();
        int n2;
        View view3;
        if (a != null) {
            if (a.first != null) {
                final View view2 = ((BaseAdapter)a.first).getView((int)a.second, view, viewGroup);
                if (a.first == this.d) {
                    n2 = 0;
                }
                else {
                    n2 = 1;
                }
                this.a((int)a.second, n2, view2.getMeasuredHeight());
                view2.addOnLayoutChangeListener((View$OnLayoutChangeListener)this);
                view3 = view2;
            }
            else {
                if (view != null) {
                    return view;
                }
                final View view4 = new View(this.g);
                this.k = new WeakReference(view4);
                this.e();
                n2 = 3;
                view3 = view4;
            }
        }
        else {
            if (!this.a()) {
                throw new IllegalStateException(String.format("Position for ChunkedSectionAdapter is out of range: %d!", n));
            }
            if (view != null) {
                return view;
            }
            final LinearLayout linearLayout = (LinearLayout)LayoutInflater.from(viewGroup.getContext()).inflate(this.c, viewGroup, false);
            final LinearLayout linearLayout2 = (LinearLayout)linearLayout.findViewById(2131886388);
            linearLayout2.setLayoutParams((ViewGroup$LayoutParams)new LinearLayout$LayoutParams(-1, this.B));
            final TextView textView = (TextView)linearLayout2.findViewById(2131886390);
            textView.setText(this.x);
            this.h = new WeakReference(textView);
            this.i = new WeakReference(linearLayout2.findViewById(2131886389));
            this.j = new WeakReference(linearLayout.findViewById(2131886387));
            this.d();
            n2 = 2;
            view3 = (View)linearLayout;
        }
        view3.setTag(2131886098, (Object)n2);
        int intValue;
        if (a == null) {
            intValue = -1;
        }
        else {
            intValue = (int)a.second;
        }
        view3.setTag(2131886097, (Object)intValue);
        view3.setTag(2131886096, (Object)n);
        view = view3;
        return view;
    }
    
    public int getViewTypeCount() {
        return 2 + (this.d.getViewTypeCount() + this.e.getViewTypeCount());
    }
    
    public boolean isEnabled(final int n) {
        final Pair a = this.a(n);
        return a != null && a.first != null && ((BaseAdapter)a.first).isEnabled((int)a.second);
    }
    
    public void onLayoutChange(final View view, final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final int n7, final int n8) {
        if (view instanceof ChunkedPageableListView) {
            this.q = n4 - n2;
            this.d();
            this.e();
        }
        else {
            final Integer n9 = (Integer)view.getTag(2131886097);
            final Integer n10 = (Integer)view.getTag(2131886098);
            if (n9 != null && n10 != null) {
                this.a(n9, n10, n4 - n2);
            }
        }
    }
}
