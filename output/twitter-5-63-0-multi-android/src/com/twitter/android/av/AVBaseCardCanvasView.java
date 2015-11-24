// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.av;

import com.twitter.library.av.model.Partner;
import com.twitter.library.av.playback.aw;
import com.twitter.library.av.control.b;
import com.twitter.library.av.playback.AVPlayer$PlayerStartType;
import com.twitter.library.av.playback.PlaybackMode;
import android.content.res.Configuration;
import java.util.Arrays;
import android.view.View$OnClickListener;
import android.view.ViewGroup;
import android.util.AttributeSet;
import android.content.Context;
import com.twitter.library.av.control.a;
import com.twitter.library.av.playback.AVPlayer;
import android.widget.ProgressBar;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

public abstract class AVBaseCardCanvasView extends LinearLayout implements k
{
    protected final ImageView a;
    protected final View b;
    protected final View c;
    protected final ProgressBar d;
    protected final ImageView e;
    protected AVPlayer f;
    private a g;
    private boolean h;
    private com.twitter.android.av.l i;
    private Iterable j;
    
    public AVBaseCardCanvasView(final Context context) {
        this(context, null, 0);
    }
    
    public AVBaseCardCanvasView(final Context context, final AttributeSet set) {
        this(context, set, 0);
    }
    
    public AVBaseCardCanvasView(final Context context, final AttributeSet set, final int n) {
        super(context, set);
        this.setOrientation(1);
        View.inflate(context, this.getLayoutId(), (ViewGroup)this);
        this.c = this.findViewById(2131886272);
        this.a = (ImageView)this.findViewById(2131886270);
        this.b = this.findViewById(2131886271);
        this.d = (ProgressBar)this.findViewById(2131886278);
        this.e = (ImageView)this.findViewById(2131886277);
        this.a.setOnClickListener((View$OnClickListener)this);
        this.e.requestFocus();
        this.e.setOnClickListener((View$OnClickListener)this);
        this.j = Arrays.asList(this.a, this.c, this.b);
    }
    
    protected PlaybackMode a(final Configuration configuration) {
        return PlaybackMode.a;
    }
    
    protected void a() {
        this.d.setVisibility(0);
        this.e.setVisibility(4);
    }
    
    public void a(final int n) {
        this.b();
    }
    
    public void a(final int n, final int n2) {
    }
    
    public void a(final int n, final int n2, final boolean b, final boolean b2) {
        this.b();
        this.o();
        if (this.f.w() && this.g != null) {
            this.g.b(this.f.x());
        }
    }
    
    public void a(final int n, final String s) {
        this.b();
    }
    
    public void a(final AVPlayer$PlayerStartType avPlayer$PlayerStartType) {
        this.b();
        this.g();
        this.o();
        this.setKeepScreenOn(true);
    }
    
    public void a(final AVPlayer f, final Configuration configuration) {
        this.f = f;
        this.a();
        this.g = new a((View)this, this.f, this);
        final PlaybackMode a = this.a(configuration);
        this.f.b(a);
        this.f.a(this, a);
        this.g();
    }
    
    public void a(final aw aw, final int n, final boolean b) {
        this.g.a(aw);
    }
    
    public void a(final boolean b) {
        if (b && this.h) {
            this.f.b(false);
            this.h = false;
        }
        this.o();
    }
    
    protected void b() {
        this.d.setVisibility(8);
        this.e.setVisibility(0);
    }
    
    public void b(final int n, final int n2) {
        if (701 == n) {
            this.a();
        }
        else if (702 == n) {
            this.b();
        }
    }
    
    public void b(final boolean b) {
        if (!b && this.f != null) {
            this.f.d(false);
        }
    }
    
    public void c() {
    }
    
    public void d() {
    }
    
    public void e() {
        this.a();
        this.o();
    }
    
    public void f() {
        this.h = true;
        this.o();
        this.setKeepScreenOn(false);
        this.b();
    }
    
    protected void g() {
    }
    
    public View getContentView() {
        return (View)this;
    }
    
    public Iterable getHideableViews() {
        return this.j;
    }
    
    protected abstract int getLayoutId();
    
    public void h() {
        this.o();
        if (this.f.u()) {
            this.b();
        }
    }
    
    public void i() {
    }
    
    public void j() {
        this.o();
        this.setKeepScreenOn(false);
    }
    
    public void k() {
    }
    
    public void l() {
    }
    
    protected void m() {
        if (this.f == null || !this.f.t()) {
            return;
        }
        if (this.h) {
            this.n();
        }
        else if (this.f.u()) {
            this.f.s();
        }
        else {
            this.f.b(false);
        }
        this.o();
    }
    
    protected void n() {
        this.g.a();
        this.f.b(true);
        this.h = false;
        this.o();
    }
    
    protected void o() {
        if (this.h) {
            this.e.setImageResource(2130839441);
            this.e.setContentDescription((CharSequence)this.getResources().getString(2131297551));
            return;
        }
        if (this.f.u()) {
            this.e.setImageResource(2130839439);
            this.e.setContentDescription((CharSequence)this.getResources().getString(2131297376));
            return;
        }
        this.e.setImageResource(2130839440);
        this.e.setContentDescription((CharSequence)this.getResources().getString(2131297442));
    }
    
    public void onClick(final View view) {
        final int id = view.getId();
        if (2131886277 == id) {
            this.m();
        }
        else if (2131886270 == id && this.i != null) {
            this.f.a(PlaybackMode.a);
            this.i.l();
        }
    }
    
    public void setOnDockListener(final com.twitter.android.av.l i) {
        this.i = i;
    }
    
    public void setPartner(final Partner partner) {
    }
}
