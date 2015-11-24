// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.av.control;

import com.twitter.library.av.playback.aw;
import com.twitter.library.av.playback.AVPlayer$PlayerStartType;
import android.os.Looper;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.content.Context;
import android.widget.ImageButton;
import android.view.View;
import com.twitter.library.av.playback.AVPlayer;
import android.view.View$OnClickListener;
import android.widget.RelativeLayout;

public class VideoControlView extends RelativeLayout implements View$OnClickListener, b
{
    AVPlayer a;
    private a b;
    private final boolean c;
    private View d;
    private View e;
    private View f;
    private ImageButton g;
    private ImageButton h;
    private boolean i;
    private boolean j;
    private boolean k;
    private d l;
    
    VideoControlView(final Context context, final AVPlayer a, final boolean c) {
        super(context);
        this.j = true;
        this.setWillNotDraw(this.k = false);
        this.setFocusable(true);
        this.setFocusableInTouchMode(true);
        this.c = c;
        this.a = a;
        final LayoutInflater layoutInflater = (LayoutInflater)context.getSystemService("layout_inflater");
        this.d = layoutInflater.inflate(lc.av_media_controller, (ViewGroup)null);
        this.f = this.d.findViewById(la.av_media_controller_controls);
        this.b = new a(this.d, this.a, this);
        (this.h = (ImageButton)this.d.findViewById(la.fullscreen)).setOnClickListener((View$OnClickListener)this);
        (this.g = (ImageButton)this.d.findViewById(la.pause)).requestFocus();
        this.g.setOnClickListener((View$OnClickListener)this);
        (this.e = layoutInflater.inflate(lc.av_error_msg, (ViewGroup)null)).setVisibility(8);
        this.addView(this.e);
        this.addView(this.d);
        if (this.c) {
            this.h.setImageResource(kz.ic_video_smallscreen_btn);
        }
    }
    
    private Runnable b(final Context context, final int n) {
        return new c(this, context, n);
    }
    
    private int getFullscreenButtonVisibility() {
        if (!this.j || (this.getResources().getConfiguration().orientation == 2 && this.c)) {
            return 8;
        }
        return 0;
    }
    
    private void i() {
        final com.twitter.library.av.model.a z = this.a.z();
        if (z != null) {
            this.a.x();
            this.i = z.d();
            this.f();
        }
    }
    
    private void j() {
        if (this.i) {
            this.m();
        }
        else {
            this.b.c();
        }
        this.h.setVisibility(this.getFullscreenButtonVisibility());
    }
    
    private void k() {
        this.b.a();
        this.a.b(true);
        this.k = false;
        this.f();
    }
    
    private void l() {
        if (this.k) {
            this.g.setImageResource(kz.ic_video_replay_btn);
            this.g.setContentDescription((CharSequence)this.getResources().getString(lg.replay));
            return;
        }
        if (this.a.u()) {
            this.g.setImageResource(kz.ic_video_pause_btn);
            this.g.setContentDescription((CharSequence)this.getResources().getString(lg.pause));
            return;
        }
        this.g.setImageResource(kz.ic_video_play_btn);
        this.g.setContentDescription((CharSequence)this.getResources().getString(lg.play));
    }
    
    private void m() {
        this.g.setVisibility(0);
        this.b.d();
    }
    
    public void a() {
        this.requestLayout();
    }
    
    public void a(final Context context, final int n) {
        final Runnable b = this.b(context, n);
        if (Looper.getMainLooper() != Looper.myLooper()) {
            this.b.a(b);
            return;
        }
        b.run();
    }
    
    public void a(final AVPlayer$PlayerStartType avPlayer$PlayerStartType) {
        this.k = false;
        if (this.h()) {
            this.l();
            this.i();
        }
    }
    
    public void a(final aw aw) {
        this.b.a(aw);
    }
    
    public void a(final boolean b) {
        if (b && this.k) {
            this.k = false;
            if (this.h()) {
                this.i();
            }
        }
        this.l();
        if (this.l != null) {
            this.l.d(b);
        }
    }
    
    public void b(final boolean i) {
        this.i = i;
        this.k = true;
        this.l();
    }
    
    public boolean b() {
        return this.e.getParent() != null && this.e.getVisibility() == 0;
    }
    
    public void c() {
        final com.twitter.library.av.model.a z = this.a.z();
        if (z != null) {
            this.a.x();
            this.i = z.d();
            this.j();
        }
    }
    
    public void c(final boolean i) {
        this.i = i;
        if (this.a.w()) {
            this.b.b(this.a.x());
        }
    }
    
    public void d() {
        if (this.l != null) {
            this.l.u();
        }
    }
    
    public void e() {
        if (this.h()) {
            com.twitter.library.util.b.a(this.f);
        }
    }
    
    public void f() {
        if (this.g != null) {
            this.g.requestFocus();
        }
        this.j();
        if (!this.h()) {
            com.twitter.library.util.b.b(this.f);
        }
        this.l();
    }
    
    void g() {
        if (this.a == null) {
            return;
        }
        if (this.k) {
            this.k();
        }
        else if (this.a.u()) {
            this.a.s();
        }
        else {
            this.a.b(false);
        }
        this.l();
    }
    
    public boolean h() {
        return this.f.getParent() != null && this.f.getVisibility() == 0;
    }
    
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.a.u()) {
            this.k = false;
            if (this.h()) {
                this.i();
                this.l();
            }
        }
        if (this.k) {
            this.b(this.i);
        }
    }
    
    public void onClick(final View view) {
        if (view.equals(this.h)) {
            this.l.q();
        }
        else if (view.equals(this.g)) {
            this.g();
            if (this.l != null) {
                this.l.t();
            }
        }
    }
    
    protected void onLayout(final boolean b, final int n, final int n2, final int n3, final int n4) {
        super.onLayout(b, n, n2, n3, n4);
        final int n5 = this.getRight() - this.getLeft();
        final int n6 = this.getBottom() - this.getTop();
        this.d.layout(0, 0, n5, n6);
        this.e.layout(0, 0, n5, n6);
    }
    
    public void setIsFullScreenToggleAllowed(final boolean j) {
        this.j = j;
    }
    
    public void setListener(final d l) {
        this.l = l;
    }
}
