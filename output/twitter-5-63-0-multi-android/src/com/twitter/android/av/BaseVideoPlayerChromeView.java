// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.av;

import com.twitter.library.util.b;
import com.twitter.library.av.playback.aw;
import com.twitter.library.av.playback.AVPlayer$PlayerStartType;
import android.graphics.drawable.StateListDrawable;
import android.graphics.drawable.Drawable;
import com.twitter.library.util.s;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.content.Context;
import com.twitter.library.av.control.h;
import com.twitter.library.av.control.e;
import com.twitter.library.card.element.l;
import android.widget.ImageView;
import android.view.View;
import com.twitter.library.av.control.VideoControlView;
import com.twitter.library.av.playback.AVPlayer;
import com.twitter.library.av.control.f;
import com.twitter.library.av.control.d;
import android.view.View$OnClickListener;
import android.widget.RelativeLayout;

public abstract class BaseVideoPlayerChromeView extends RelativeLayout implements View$OnClickListener, bd, bj, d, f
{
    protected AVPlayer a;
    protected VideoControlView b;
    protected boolean c;
    protected View d;
    protected bg e;
    protected boolean f;
    protected ImageView g;
    protected boolean h;
    protected boolean i;
    protected l j;
    protected final bb k;
    protected e l;
    private h m;
    
    public BaseVideoPlayerChromeView(final Context context) {
        this(context, new e());
    }
    
    public BaseVideoPlayerChromeView(final Context context, final e l) {
        super(context);
        this.k = new bb(this.getContext());
        this.l = l;
    }
    
    private void x() {
        this.k.a(4000L);
    }
    
    protected ImageView a(final Context context) {
        final ImageView imageView = (ImageView)LayoutInflater.from(context).inflate(2130969199, (ViewGroup)this, false);
        final StateListDrawable a = s.a(context, imageView, context.getResources().getColor(2131689520));
        if (a != null) {
            imageView.setImageDrawable((Drawable)a);
        }
        return imageView;
    }
    
    public void a(final int n, final long n2) {
        int i = 1;
        if (n <= i) {
            i = 0;
        }
        this.i = (i != 0);
    }
    
    public void a(final Context context, final int n) {
        this.v();
        this.s();
        this.b.a(context, n);
    }
    
    public void a(final Context context, final AVPlayer a) {
        this.setWillNotDraw(false);
        this.a = a;
        this.k.a(this);
        if (this.j == null) {
            this.j = this.m();
        }
        this.b(this.getContext(), a);
        this.l();
        this.r();
    }
    
    public void a(final AVPlayer$PlayerStartType avPlayer$PlayerStartType) {
        this.s();
        this.c = false;
        this.v();
        if (this.b != null) {
            this.b.a(avPlayer$PlayerStartType);
        }
        if (this.e != null) {
            this.e.a(avPlayer$PlayerStartType);
        }
        this.x();
        if (avPlayer$PlayerStartType == AVPlayer$PlayerStartType.c) {
            this.o();
        }
    }
    
    public void a(final aw aw, final int n, final boolean b) {
        if (this.b != null) {
            this.b.a(aw);
        }
    }
    
    public boolean a() {
        return this.b != null && this.b.b();
    }
    
    protected boolean a(final View view) {
        return this.a(view, (ViewGroup)this);
    }
    
    protected boolean a(final View view, final ViewGroup viewGroup) {
        return view != null && view.getParent() == viewGroup;
    }
    
    protected View b(final Context context) {
        return LayoutInflater.from(context).inflate(2130968607, (ViewGroup)this, false);
    }
    
    public void b() {
    }
    
    protected void b(final Context context, final AVPlayer avPlayer) {
        if (this.b == null) {
            this.b = this.c(context, avPlayer);
        }
        if (this.b != null) {
            this.b.setListener(this);
        }
        if (this.g == null) {
            this.g = this.a(context);
        }
        if (this.g != null) {
            this.g.setOnClickListener((View$OnClickListener)this);
            this.g.setVisibility(8);
        }
        if (this.d == null) {
            this.d = this.b(context);
        }
        if (this.d != null) {
            this.d.setOnClickListener((View$OnClickListener)this);
            this.d.setVisibility(8);
            if (this.e == null) {
                (this.e = new bg(context, avPlayer)).a(context, this);
            }
        }
    }
    
    public void b_(final boolean b) {
        this.f = true;
        this.c = true;
        this.s();
        if (this.b != null) {
            this.b.b(b);
        }
        this.o();
        this.w();
    }
    
    protected VideoControlView c(final Context context, final AVPlayer avPlayer) {
        return this.l.a(context, avPlayer);
    }
    
    public void c() {
    }
    
    public void c(final boolean b) {
        if (b) {
            this.o();
        }
    }
    
    public void c_(final boolean b) {
        this.f = true;
        this.s();
        if (this.b != null) {
            this.b.c(b);
        }
    }
    
    public void d() {
        this.r();
    }
    
    public void d(final boolean b) {
        if (b && this.c) {
            this.c = false;
            this.v();
            return;
        }
        this.x();
    }
    
    public void e() {
        this.s();
    }
    
    public void f() {
        this.f = false;
        if (this.a.D()) {
            this.r();
        }
    }
    
    public boolean g() {
        final boolean f = this.f;
        boolean b = false;
        if (f) {
            final VideoControlView b2 = this.b;
            b = false;
            if (b2 != null) {
                if (!this.b.h()) {
                    this.o();
                }
                else if (!this.c) {
                    this.n();
                }
                b = true;
            }
        }
        return b;
    }
    
    ImageView getDockButton() {
        return this.g;
    }
    
    public h getOnChromeClickListener() {
        return this.m;
    }
    
    public View getView() {
        return (View)this;
    }
    
    View getViewMoreButton() {
        return this.d;
    }
    
    public void h() {
        this.o();
    }
    
    public void i() {
        this.v();
        this.s();
        this.n();
    }
    
    public void j() {
        this.requestLayout();
        if (this.b != null) {
            this.b.a();
        }
    }
    
    public void k() {
    }
    
    protected void l() {
        if (this.d != null && this.d.getParent() == null) {
            this.addView(this.d);
        }
        if (this.g != null && this.g.getParent() == null) {
            this.addView((View)this.g);
        }
        if (this.b != null && this.b.getParent() == null) {
            this.addView((View)this.b);
        }
    }
    
    protected l m() {
        return new l();
    }
    
    protected void n() {
        if (this.h && this.g != null) {
            com.twitter.library.util.b.a((View)this.g);
        }
        if (this.b != null) {
            this.b.e();
        }
    }
    
    protected void o() {
        if (this.h && this.g != null) {
            com.twitter.library.util.b.b((View)this.g);
        }
        if (this.b != null) {
            this.b.f();
        }
        if (!this.c) {
            this.x();
            return;
        }
        this.k.a();
    }
    
    public void onClick(final View view) {
        if (view.equals(this.g)) {
            final h m = this.m;
            if (m != null) {
                m.a(this.a);
            }
        }
        else if (view.equals(this.d)) {
            this.e.a(this.getContext());
        }
    }
    
    public void p() {
        this.n();
    }
    
    public void q() {
        final h m = this.m;
        if (m != null) {
            m.b(this.a);
        }
    }
    
    public void r() {
        if (this.j != null) {
            this.j.a((ViewGroup)this, this.getContext());
        }
        this.n();
    }
    
    public void s() {
        if (this.j != null) {
            this.j.a((ViewGroup)this);
        }
    }
    
    public void setDockingAllowed(final boolean h) {
        this.h = h;
    }
    
    public void setFullScreenAllowed(final boolean isFullScreenToggleAllowed) {
        if (this.b != null) {
            this.b.setIsFullScreenToggleAllowed(isFullScreenToggleAllowed);
        }
    }
    
    public void setOnChromeClickListener(final h m) {
        this.m = m;
    }
    
    public void t() {
        this.x();
    }
    
    public void u() {
        this.k.a();
    }
    
    protected void v() {
        this.setBackgroundColor(0);
        if (this.d != null) {
            this.d.setVisibility(4);
        }
    }
    
    protected void w() {
        this.setBackgroundColor(this.getContext().getResources().getColor(2131689545));
        if (this.i && this.d != null) {
            this.d.setVisibility(0);
            if (this.e != null) {
                this.e.c();
            }
        }
    }
}
