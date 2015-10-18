// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.commerce.view;

import android.content.res.Configuration;
import android.content.res.TypedArray;
import com.twitter.android.composer.FloatingActionButtonLayout;
import com.twitter.android.qs;
import com.twitter.android.qo;
import android.graphics.Rect;
import com.twitter.library.widget.StatusToolBar;
import android.view.animation.AnimationUtils;
import android.graphics.drawable.Drawable;
import com.twitter.library.media.widget.MediaImageView;
import com.twitter.library.media.widget.BaseMediaImageView;
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
import com.twitter.android.tk;
import com.twitter.android.jy;
import android.content.Intent;
import com.twitter.android.client.bn;
import android.os.Bundle;
import java.util.Collection;
import java.util.Collections;
import android.content.res.Resources;
import android.view.animation.Animation;
import android.widget.TextView;
import android.widget.ImageView;
import android.view.View;
import com.twitter.android.widget.SwipeProgressBarView;
import com.twitter.android.widget.SwipeRefreshObserverLayout;
import com.twitter.android.qm;
import com.twitter.android.widget.fc;
import com.twitter.internal.android.widget.ToolBar;
import com.twitter.android.qp;
import com.twitter.library.media.widget.o;
import com.twitter.android.widget.fd;
import com.twitter.android.qr;
import com.twitter.android.qq;
import com.twitter.android.qn;
import android.view.View$OnClickListener;
import com.twitter.android.TimelineActivity;

public class CommerceCollectionActivity extends TimelineActivity implements View$OnClickListener, d, qn, qq, qr, fd, o
{
    protected int a;
    protected int e;
    protected qp f;
    protected ToolBar g;
    protected fc h;
    private CommerceCollectionFragment i;
    private boolean j;
    private int k;
    private int l;
    private qm m;
    private SwipeRefreshObserverLayout n;
    private SwipeProgressBarView o;
    private View p;
    private ImageView q;
    private TextView r;
    private Animation s;
    private Animation t;
    private boolean u;
    private boolean v;
    private boolean w;
    private int x;
    private long y;
    
    protected int a(final Resources resources) {
        return resources.getColor(2131689520);
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
        if (this.w) {
            a.f();
        }
        else {
            a.g();
        }
        return super.a(toolBar);
    }
    
    @Override
    public bn a(final Bundle bundle, final bn bn) {
        final bn a = super.a(bundle, bn);
        a.e(true);
        a.c(2130968653);
        a.b(14);
        a.a(false);
        a.a(0);
        return a;
    }
    
    @Override
    protected jy a(final Intent intent, final bn bn) {
        final tk tk = (tk)bn;
        this.i = new CommerceCollectionFragment();
        this.i.a(intent).h(tk.a);
        return new jy(this.i);
    }
    
    public void a(final int n, final f f) {
        this.a(false);
    }
    
    protected void a(final Bitmap bitmap) {
        float n = 0.0f;
        final Size a = Size.a(this.k, this.l);
        final Size a2 = Size.a(bitmap);
        float n2;
        float n3;
        if (a2.a(a)) {
            n2 = a.b() / a2.b();
            n3 = (a.a() - n2 * a2.a()) / 2.5f;
        }
        else {
            n2 = a.a() / a2.a();
            n = (a.b() - n2 * a2.b()) / 2.5f;
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
        if (this.m == null && bc.a()) {
            this.f.a(a3, false);
            (this.m = new qm((Context)this, this, this.f, 0)).execute((Object[])new Bitmap[] { a3 });
            return;
        }
        this.f.a(a3, true);
    }
    
    public void a(final fc h) {
        this.h = h;
    }
    
    public void a(final MediaImageView mediaImageView, final Bitmap bitmap) {
        if (bitmap != null) {
            this.a(bitmap);
        }
    }
    
    public void a(final boolean b) {
        this.v = false;
        this.n.a(b, false);
        if (!b) {
            this.l();
            return;
        }
        this.k();
        final CommerceCollectionFragment i = this.i;
        if (i != null && i.au()) {
            i.c(true);
            return;
        }
        this.a(false);
    }
    
    public void b(final float n) {
        if (!this.u) {
            this.q.setVisibility(0);
            this.r.setVisibility(0);
            this.p.setVisibility(0);
            this.u = true;
            this.w = true;
            final ToolBar m = this.M();
            if (m != null) {
                m.b(16);
                this.Q();
            }
        }
        int text;
        if (100.0f * n <= 50.0f) {
            this.v = false;
            text = 2131297529;
            if (this.x == 1) {
                this.q.clearAnimation();
                this.q.startAnimation(this.t);
                this.x = 2;
            }
            this.p.setTranslationY((float)((int)(2.0f * (n * this.g.getHeight())) - this.g.getHeight()));
        }
        else {
            this.v = true;
            text = 2131297530;
            if (this.x != 1) {
                this.q.clearAnimation();
                this.q.startAnimation(this.s);
                this.x = 1;
            }
            this.p.setTranslationY(0.0f);
        }
        this.r.setText(text);
    }
    
    public void b(final Drawable backgroundDrawable) {
        if (this.M() != null) {
            this.M().setBackgroundDrawable(backgroundDrawable);
        }
    }
    
    @Override
    public void b(final Bundle bundle, final bn bn) {
        super.b(bundle, bn);
        final Resources resources = this.getResources();
        this.y = this.getIntent().getLongExtra("collection_id", 0L);
        this.n = (SwipeRefreshObserverLayout)this.findViewById(2131886417);
        final int color = resources.getColor(2131689590);
        final int color2 = resources.getColor(2131689556);
        (this.o = (SwipeProgressBarView)this.findViewById(2131886418)).setColorScheme(new int[] { color, color2, color, color2 });
        this.p = this.findViewById(2131886419);
        this.q = (ImageView)this.findViewById(2131886141);
        this.r = (TextView)this.findViewById(2131886143);
        this.s = AnimationUtils.loadAnimation((Context)this, 2131034165);
        this.t = AnimationUtils.loadAnimation((Context)this, 2131034164);
        final TypedArray obtainStyledAttributes = this.getTheme().obtainStyledAttributes(new int[] { 2130772113 });
        this.a = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        obtainStyledAttributes.recycle();
        final ToolBar m = this.M();
        if (m instanceof StatusToolBar) {
            this.a += ((StatusToolBar)m).getStatusBarMessageHeight();
        }
        this.e = this.a(resources);
        this.m();
        while (true) {
            try {
                final Drawable drawable = resources.getDrawable(2130837504);
                this.g = this.M();
                this.f = new qs(this, this, new qo(resources, drawable, new Rect(0, this.l - this.a, this.k, this.l)));
                ((FloatingActionButtonLayout)this.findViewById(2131886398)).a(false);
            }
            catch (Throwable t) {
                final Drawable drawable = null;
                continue;
            }
            break;
        }
    }
    
    public void b(final boolean j) {
        this.j = j;
        this.f.a();
    }
    
    public void d(final int n) {
    }
    
    public long j() {
        return this.y;
    }
    
    protected void k() {
        this.o.setVisibility(0);
        this.o.setProgressTop(this.l - this.a);
        this.o.a();
        this.q.clearAnimation();
        this.q.setVisibility(8);
        this.r.setText(2131297168);
    }
    
    protected void l() {
        this.u = false;
        this.o.b();
        this.o.setVisibility(8);
        this.p.setVisibility(8);
        this.x = 0;
        if (this.w) {
            final ToolBar m = this.M();
            if (m != null) {
                this.w = false;
                m.c(16);
                this.Q();
            }
        }
    }
    
    protected void m() {
        this.k = this.getResources().getDisplayMetrics().widthPixels;
        this.l = (int)(this.k / 2.5f);
    }
    
    public void onClick(final View view) {
    }
    
    public void onConfigurationChanged(final Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.m();
    }
    
    protected void onPause() {
        this.l();
        super.onPause();
    }
    
    protected void onStop() {
        if (this.m != null) {
            this.m.cancel(true);
            this.m = null;
        }
        qm.a(this.h);
        this.h = null;
        super.onStop();
    }
    
    public float r() {
        if (this.j) {
            return 1.0f;
        }
        return 0.0f;
    }
    
    public int s() {
        return this.a(this.getResources());
    }
    
    public View u() {
        return (View)this.i.Y();
    }
    
    public void x() {
        if (this.v) {
            this.a(true);
            return;
        }
        this.l();
    }
    
    public void y() {
        this.m = null;
    }
}
