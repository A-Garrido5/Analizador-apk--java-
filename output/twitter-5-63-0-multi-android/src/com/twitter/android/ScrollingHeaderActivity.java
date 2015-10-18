// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import android.text.TextUtils;
import android.widget.ListView;
import android.view.ViewGroup$LayoutParams;
import android.widget.FrameLayout$LayoutParams;
import android.widget.AdapterView;
import java.util.Iterator;
import android.content.res.TypedArray;
import android.view.animation.AnimationUtils;
import android.graphics.Rect;
import com.twitter.library.widget.StatusToolBar;
import android.widget.ListAdapter;
import android.support.v4.app.Fragment;
import android.graphics.drawable.Drawable;
import android.content.Context;
import com.twitter.android.util.bc;
import android.graphics.Paint;
import android.graphics.Canvas;
import com.twitter.library.media.util.m;
import android.graphics.Bitmap$Config;
import android.graphics.Matrix;
import com.twitter.internal.android.util.Size;
import android.graphics.Bitmap;
import com.twitter.android.client.TwitterListFragment;
import com.twitter.android.client.bn;
import android.os.Bundle;
import android.widget.BaseAdapter;
import android.support.v4.view.PagerAdapter;
import java.util.Collection;
import java.util.Collections;
import com.twitter.internal.android.widget.ToolBar;
import android.content.res.Resources;
import com.twitter.android.widget.fc;
import com.twitter.android.widget.SwipeRefreshObserverLayout;
import com.twitter.android.widget.SwipeProgressBarView;
import com.twitter.internal.android.widget.HorizontalListView;
import com.twitter.android.widget.UnboundedFrameLayout;
import android.support.v4.view.ViewPager;
import java.util.List;
import android.view.animation.Animation;
import android.widget.TextView;
import android.widget.ImageView;
import android.view.View;
import com.twitter.android.widget.InterceptingRelativeLayout;
import android.os.Handler;
import com.twitter.android.widget.ge;
import com.twitter.android.widget.fd;
import com.twitter.android.widget.cy;
import android.widget.AdapterView$OnItemClickListener;
import com.twitter.android.client.TwitterFragmentActivity;

public abstract class ScrollingHeaderActivity extends TwitterFragmentActivity implements AdapterView$OnItemClickListener, qn, qq, qr, cy, fd, ge
{
    private int A;
    private Integer B;
    private int[] F;
    private boolean G;
    private boolean H;
    private boolean I;
    private boolean J;
    private boolean K;
    private boolean L;
    private float M;
    private Handler N;
    private InterceptingRelativeLayout O;
    private qm a;
    private View b;
    private ImageView c;
    private TextView d;
    private Animation e;
    private Animation f;
    private int g;
    private int h;
    private int i;
    private int j;
    protected List k;
    protected ViewPager l;
    protected UnboundedFrameLayout m;
    protected HorizontalListView n;
    protected UnboundedFrameLayout o;
    protected int p;
    protected int q;
    protected SwipeProgressBarView r;
    protected SwipeRefreshObserverLayout s;
    protected boolean t;
    protected fc u;
    protected int v;
    protected ql w;
    protected qp x;
    private int y;
    private int z;
    
    public ScrollingHeaderActivity() {
        this.M = 2.0f;
        this.N = new qk(this);
    }
    
    private void h() {
        this.M().c(16);
        this.d.setVisibility(8);
        this.K = false;
        this.Q();
    }
    
    protected abstract String K_();
    
    public void L_() {
        if (this.y > this.p) {
            this.w.b();
            this.w.c();
        }
        final int height = this.m.getHeight();
        final int g = this.g;
        if (this.B != null) {
            final int n = height - this.p;
            int max;
            if (this.G) {
                max = -n;
            }
            else {
                max = Math.max(-n, this.B);
            }
            this.g = max;
        }
        if (this.z != height) {
            this.e(height);
        }
        if (this.B != null) {
            final int g2 = this.g;
            this.g = g;
            this.b(g2, this.l.getCurrentItem());
            this.B = null;
        }
        this.x.a();
    }
    
    protected int a(final Resources resources) {
        return resources.getDimensionPixelSize(2131558403);
    }
    
    protected int a(final ToolBar toolBar) {
        jx a = toolBar.a(2131886152);
        if (a == null) {
            a = new jx(toolBar, false);
            a.a(2131886152);
            a.b(false);
            a.c(10);
            a.b(2130968576);
            a.d(2131297168);
            toolBar.a(Collections.singletonList(a));
        }
        if (this.K) {
            a.f();
        }
        else {
            a.g();
        }
        return super.a(toolBar);
    }
    
    protected abstract PagerAdapter a(final List p0, final ViewPager p1);
    
    protected abstract BaseAdapter a(final List p0);
    
    @Override
    public bn a(final Bundle bundle, final bn bn) {
        bn.c(2130968762);
        bn.b(14);
        return bn;
    }
    
    protected void a(final int n) {
        if (n == this.l.getCurrentItem()) {
            Object o;
            if (this.k.isEmpty()) {
                o = null;
            }
            else {
                o = this.k.get(this.l.getCurrentItem()).a(this.getSupportFragmentManager());
            }
            if (o instanceof qj) {
                ((qj)o).h(this.v);
            }
        }
    }
    
    protected void a(final int n, final int n2) {
    }
    
    protected void a(final Bitmap bitmap) {
        float n = 0.0f;
        final Size a = Size.a(this.A, this.y);
        final Size a2 = Size.a(bitmap);
        float n2;
        float n3;
        if (a2.a(a)) {
            n2 = a.b() / a2.b();
            n3 = (a.a() - n2 * a2.a()) / this.M;
        }
        else {
            n2 = a.a() / a2.a();
            n = (a.b() - n2 * a2.b()) / this.M;
            n3 = 0.0f;
        }
        final Matrix matrix = new Matrix();
        matrix.setScale(n2, n2);
        matrix.postTranslate((float)(int)(n3 + 0.5f), (float)(int)(n + 0.5f));
        Bitmap$Config bitmap$Config = bitmap.getConfig();
        if (bitmap$Config == null) {
            bitmap$Config = Bitmap$Config.ARGB_8888;
        }
        final Bitmap a3 = com.twitter.library.media.util.m.a(a, bitmap$Config);
        if (a3 == null) {
            return;
        }
        final Canvas canvas = new Canvas(a3);
        final Paint paint = new Paint();
        paint.setFilterBitmap(true);
        canvas.drawBitmap(bitmap, matrix, paint);
        if (this.a == null && bc.a() && !this.L) {
            this.x.a(a3, false);
            (this.a = new qm((Context)this, this, this.x, this.h)).execute((Object[])new Bitmap[] { a3 });
            return;
        }
        this.x.a(a3, true);
    }
    
    protected abstract void a(final Drawable p0);
    
    protected void a(final Fragment fragment) {
        if (fragment instanceof qj) {
            ((qj)fragment).a(this.z + this.v, this.g);
        }
    }
    
    public void a(final fc u) {
        this.a((Drawable)(this.u = u));
    }
    
    public void a(final boolean t) {
        this.H = false;
        this.s.a(t, false);
        this.t = t;
        if (t) {
            this.r.setVisibility(0);
            this.r.setProgressTop(this.i);
            this.r.a();
            this.c.clearAnimation();
            this.c.setVisibility(8);
            this.d.setText(2131297168);
            this.N.sendEmptyMessageDelayed(2, 1000L);
            final int currentItem = this.l.getCurrentItem();
            TwitterListFragment twitterListFragment;
            if (currentItem < this.k.size()) {
                twitterListFragment = (TwitterListFragment)this.k.get(currentItem).a(this.getSupportFragmentManager());
            }
            else {
                twitterListFragment = null;
            }
            if (twitterListFragment == null || !twitterListFragment.au()) {
                this.a(false);
                return;
            }
            twitterListFragment.c(true);
        }
        else {
            this.J = false;
            this.N.removeMessages(2);
            this.r.b();
            this.r.setVisibility(8);
            this.b.setVisibility(8);
            this.j = 0;
            if (this.K) {
                this.M().c(16);
                this.K = false;
                this.Q();
            }
        }
    }
    
    public boolean a(final float n) {
        final int[] array = new int[2];
        this.o.getLocationOnScreen(array);
        return n < array[1] + this.o.getHeight();
    }
    
    protected int b(final Resources resources) {
        return resources.getColor(2131689520);
    }
    
    protected abstract String b();
    
    public void b(final float n) {
        if (!this.J) {
            this.c.setVisibility(0);
            this.d.setVisibility(0);
            this.b.setVisibility(0);
            this.J = true;
            this.K = true;
            this.H().c();
            this.M().b(16);
            this.Q();
        }
        int text;
        if (100.0f * n <= 50.0f) {
            this.H = false;
            text = 2131297529;
            if (this.j == 1) {
                this.c.clearAnimation();
                this.c.startAnimation(this.f);
                this.j = 2;
            }
            this.b.setTranslationY((float)((int)(2.0f * (n * this.v)) - this.v));
        }
        else {
            this.H = true;
            text = 2131297530;
            if (this.j != 1) {
                this.c.clearAnimation();
                this.c.startAnimation(this.e);
                this.j = 1;
            }
            this.b.setTranslationY(0.0f);
        }
        this.d.setText(text);
    }
    
    protected void b(final int n) {
    }
    
    public void b(final int g, final int n) {
        if (n != this.l.getCurrentItem() || this.L || this.z == 0 || this.g == g) {
            return;
        }
        this.g = g;
        this.w.a(g);
        this.I = (g + this.y <= this.p);
        this.x.a();
        this.f(g);
        if (this.t) {
            this.r.setProgressTop(Math.max(this.i + this.g, 0));
        }
        this.a(g, n);
    }
    
    public void b(final Drawable backgroundDrawable) {
        if (this.M() != null) {
            this.M().setBackgroundDrawable(backgroundDrawable);
        }
    }
    
    @Override
    public void b(final Bundle bundle, final bn bn) {
        this.w = new ql(this);
        this.k = this.d();
        this.n = (HorizontalListView)this.findViewById(2131886733);
        this.o = (UnboundedFrameLayout)this.findViewById(2131886735);
        this.n.setAdapter((ListAdapter)this.a(this.k));
        this.n.setOnItemClickListener((AdapterView$OnItemClickListener)this);
        final TypedArray obtainStyledAttributes = this.getTheme().obtainStyledAttributes(new int[] { 2130772113 });
        this.p = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        obtainStyledAttributes.recycle();
        final ToolBar m = this.M();
        if (m instanceof StatusToolBar) {
            this.p += ((StatusToolBar)m).getStatusBarMessageHeight();
        }
        final Resources resources = this.getResources();
        this.q = this.b(resources);
        this.v = resources.getDimensionPixelSize(2131558806);
        this.A = resources.getDisplayMetrics().widthPixels;
        this.y = this.a(resources);
        while (true) {
            try {
                final Drawable drawable = resources.getDrawable(2130837504);
                this.x = new qs(this, this, new qo(resources, drawable, new Rect(0, this.y - this.p, this.A, this.y)));
                (this.m = (UnboundedFrameLayout)this.findViewById(2131886414)).removeAllViews();
                this.m.setOnHeaderSizeChangedListener(this);
                this.L = false;
                (this.s = (SwipeRefreshObserverLayout)this.findViewById(2131886417)).setSwipeListener(this);
                final int color = resources.getColor(2131689590);
                final int color2 = resources.getColor(2131689556);
                this.F = new int[] { color, color2, color, color2 };
                (this.r = (SwipeProgressBarView)this.findViewById(2131886418)).setColorScheme(this.F);
                this.b = this.findViewById(2131886419);
                this.c = (ImageView)this.findViewById(2131886141);
                this.d = (TextView)this.findViewById(2131886143);
                this.e = AnimationUtils.loadAnimation((Context)this, 2131034165);
                this.f = AnimationUtils.loadAnimation((Context)this, 2131034164);
                (this.l = (ViewPager)this.findViewById(2131886367)).setAdapter(this.a(this.k, this.l));
                this.O = (InterceptingRelativeLayout)this.findViewById(2131886416);
                if (this.O != null) {
                    this.O.setInterceptHandler(this);
                }
                if (bundle != null) {
                    this.B = bundle.getInt("STATE_HEADER_OFFSET");
                    this.G = bundle.getBoolean("STATE_HEADER_IS_PINNED");
                }
            }
            catch (Throwable t) {
                final Drawable drawable = null;
                continue;
            }
            break;
        }
    }
    
    protected void b(final boolean b) {
        final View viewById = this.findViewById(2131886734);
        int visibility;
        if (b) {
            visibility = 0;
        }
        else {
            visibility = 8;
        }
        viewById.setVisibility(visibility);
    }
    
    protected void c(final float m) {
        this.M = m;
    }
    
    protected void c(final int i) {
        this.i = i;
    }
    
    protected abstract List d();
    
    public void d(final int h) {
        this.h = h;
    }
    
    protected void e(final int n) {
        this.z = n - this.p;
        final Iterator<gm> iterator = this.k.iterator();
        while (iterator.hasNext()) {
            this.a(iterator.next().a(this.getSupportFragmentManager()));
        }
    }
    
    protected void f(final int n) {
        this.m.setTranslationY((float)n);
        this.o.setTranslationY((float)n);
        if (this.u != null) {
            this.g(n);
        }
    }
    
    protected void g(final int n) {
        this.h = (n + this.y) / (this.y / 5);
        if (this.h >= 5) {
            this.h = 4;
        }
        else if (this.h < 0) {
            this.h = 0;
        }
        this.u.a(this.h);
    }
    
    protected int i() {
        return this.z;
    }
    
    protected int j() {
        return this.p - this.y;
    }
    
    @Override
    protected void onDestroy() {
        this.x.b();
        if (this.m != null) {
            this.m.removeAllViews();
        }
        if (this.O != null) {
            this.O.setInterceptHandler(null);
        }
        if (this.s != null) {
            this.s.setSwipeListener(null);
        }
        super.onDestroy();
    }
    
    public void onItemClick(final AdapterView adapterView, final View view, final int n, final long n2) {
        this.a(n);
    }
    
    @Override
    protected void onSaveInstanceState(final Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("STATE_HEADER_OFFSET", this.g);
        bundle.putBoolean("STATE_HEADER_IS_PINNED", this.z + this.g <= 0);
    }
    
    @Override
    protected void onStop() {
        if (this.a != null) {
            this.a.cancel(true);
            this.a = null;
        }
        qm.a(this.u);
        this.u = null;
        super.onStop();
    }
    
    public float r() {
        if (this.I) {
            return 1.0f;
        }
        return Math.abs(this.g) / (this.y - this.v);
    }
    
    public int s() {
        return this.b(this.getResources());
    }
    
    public void setHeaderView(final View view) {
        if (this.y == this.p) {
            this.w.b(true);
        }
        this.c(this.y - this.p);
        final FrameLayout$LayoutParams frameLayout$LayoutParams = new FrameLayout$LayoutParams(-1, -2);
        this.m.removeAllViews();
        this.m.addView(view, (ViewGroup$LayoutParams)frameLayout$LayoutParams);
        this.m.setVisibility(0);
    }
    
    protected boolean t() {
        return true;
    }
    
    public View u() {
        Object o;
        if (this.k.isEmpty()) {
            o = null;
        }
        else {
            o = this.k.get(this.l.getCurrentItem()).a(this.getSupportFragmentManager());
        }
        if (o instanceof qj) {
            final ListView y = ((TwitterListFragment)o).Y();
            if (y != null) {
                final ListAdapter adapter = y.getAdapter();
                if (adapter == null || adapter.isEmpty()) {
                    return ((qj)o).G();
                }
                return (View)y;
            }
        }
        return (View)this.l;
    }
    
    public View w() {
        return (View)this.s;
    }
    
    public void x() {
        if (this.H) {
            this.a(true);
            return;
        }
        this.N.removeMessages(1);
        this.N.sendEmptyMessageDelayed(1, 50L);
    }
    
    public void y() {
        this.a = null;
    }
}
