// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.av;

import android.view.View$MeasureSpec;
import com.twitter.android.av.t;
import com.twitter.library.av.playback.au;
import android.view.KeyEvent;
import com.twitter.library.av.playback.PlaybackMode;
import com.twitter.library.av.playback.aw;
import com.twitter.library.av.playback.AVPlayer$PlayerStartType;
import com.twitter.library.av.playback.bf;
import android.app.Activity;
import com.twitter.library.av.model.a;
import android.os.Build$VERSION;
import com.twitter.library.util.b;
import com.twitter.library.client.App;
import android.view.View;
import android.os.Looper;
import android.content.Context;
import android.graphics.Rect;
import com.twitter.library.av.playback.AVPlayer;
import java.lang.ref.WeakReference;
import android.os.Handler;
import android.view.View$OnClickListener;
import android.graphics.Point;
import com.twitter.library.av.control.f;
import com.twitter.library.av.control.h;
import android.view.ViewTreeObserver$OnScrollChangedListener;
import android.view.ViewGroup;

public class VideoPlayerView extends ViewGroup implements ViewTreeObserver$OnScrollChangedListener, h, l
{
    private static af g;
    protected final f a;
    protected final VideoPlayerView$Mode b;
    protected final Point c;
    boolean d;
    f e;
    ao f;
    private final View$OnClickListener h;
    private final Handler i;
    private VideoViewContainer j;
    private WeakReference k;
    private final AVPlayer l;
    private final boolean m;
    private aj n;
    private boolean o;
    private Rect p;
    
    public VideoPlayerView(final Context context, final AVPlayer avPlayer, final VideoPlayerView$Mode videoPlayerView$Mode) {
        this(context, avPlayer, new VideoViewContainer(context, avPlayer), new ap(), videoPlayerView$Mode);
    }
    
    public VideoPlayerView(final Context context, final AVPlayer l, final VideoViewContainer j, final ap ap, final VideoPlayerView$Mode b) {
        super(context);
        this.c = new Point(0, 0);
        this.h = (View$OnClickListener)new ag(this);
        this.i = new Handler(Looper.getMainLooper());
        this.k = new WeakReference(null);
        this.o = false;
        this.p = new Rect();
        this.setId(la.video_player_view);
        this.setWillNotDraw(false);
        this.l = l;
        this.b = b;
        boolean m = false;
        Label_0121: {
            if (VideoPlayerView$Mode.c != b) {
                final VideoPlayerView$Mode e = VideoPlayerView$Mode.e;
                m = false;
                if (e != b) {
                    break Label_0121;
                }
            }
            m = true;
        }
        this.m = m;
        this.j = j;
        (this.a = this.l.E().a(context, this.getEmbeddedChromeMode())).setOnChromeClickListener(this);
        this.a.a(context, l);
        if (this.a()) {
            (this.f = ap.a(context)).setScaleType(2);
            this.f.setTweet(this.l.q());
            this.f.a();
        }
        if (!this.m && !this.c(l) && !this.l.J()) {
            this.addView((View)this.j);
        }
        if (this.f != null) {
            this.addView(this.f.getView());
        }
        final View view = this.a.getView();
        if (view != null) {
            this.addView(view);
        }
        this.b();
        if (this.m) {
            this.setOnClickListener(this.h);
        }
        this.k = new WeakReference(null);
    }
    
    private boolean c(final AVPlayer avPlayer) {
        final int orientation = this.getResources().getConfiguration().orientation;
        return !avPlayer.g() && orientation == 2;
    }
    
    private void n() {
        if (this.b != VideoPlayerView$Mode.a && App.a()) {
            throw new IllegalStateException("Can't call startAutoplaying on a " + VideoPlayerView.class.getSimpleName() + " that is not in the " + VideoPlayerView$Mode.a.toString() + "mode");
        }
    }
    
    private void o() {
        if (this.f != null) {
            com.twitter.library.util.b.a(this.f.getView());
        }
    }
    
    public static void setDefaultFullScreenStarterFactory(final af g) {
        VideoPlayerView.g = g;
    }
    
    public void a(final int n) {
        this.a.a(this.getContext(), n);
        if (this.e != null) {
            this.e.a(this.getContext(), n);
        }
        final l l = (l)this.k.get();
        if (l != null) {
            l.a(n);
        }
    }
    
    public void a(final int n, final int n2) {
        if (n != 0 && n2 != 0) {
            this.c.set(n, n2);
        }
        this.j.a(n, n2);
        this.a.j();
        if (this.e != null) {
            this.e.j();
        }
        final l l = (l)this.k.get();
        if (l != null) {
            l.a(n, n2);
        }
    }
    
    public void a(final int n, final int n2, final boolean b, final boolean b2) {
        this.a(n, n2);
        final long a = this.l.x().a;
        final a z = this.l.z();
        final boolean b3 = z == null || z.d();
        this.a.c_(b3);
        if (this.e != null) {
            this.e.c_(b3);
        }
        if (b2) {
            this.a.h();
            if (this.e != null) {
                this.e.h();
            }
        }
        if (b && this.l.A()) {
            this.l.b(false);
        }
        if (Build$VERSION.SDK_INT < 17) {
            this.o();
        }
        final l l = (l)this.k.get();
        if (l != null) {
            l.a(n, n2, b, b2);
        }
    }
    
    public void a(final int n, final String s) {
        this.a.a(this.getContext(), n);
        if (this.e != null) {
            this.e.a(this.getContext(), n);
        }
        final l l = (l)this.k.get();
        if (l != null) {
            l.a(n, s);
        }
    }
    
    protected void a(final Context context, final boolean b) {
        final ae a = VideoPlayerView.g.a();
        if (a != null && context instanceof Activity) {
            a.a(bf.c(this.l.q()), this.l.q(), context, !b);
        }
    }
    
    public void a(final AVPlayer$PlayerStartType avPlayer$PlayerStartType) {
        this.a.a(avPlayer$PlayerStartType);
        if (this.e != null) {
            this.e.a(avPlayer$PlayerStartType);
        }
        this.j.requestLayout();
        this.j.invalidate();
        this.j.setKeepScreenOn(true);
        if (avPlayer$PlayerStartType != AVPlayer$PlayerStartType.c && this.f != null) {
            com.twitter.library.util.b.a(this.f.getView());
        }
        final l l = (l)this.k.get();
        if (l != null) {
            l.a(avPlayer$PlayerStartType);
        }
        if (this.o) {
            this.o = false;
            this.d();
        }
    }
    
    public void a(final AVPlayer avPlayer) {
        if (this.n != null) {
            this.n.a(avPlayer);
        }
    }
    
    public void a(final aw aw, final int n, final boolean b) {
        this.a.a(aw, n, b);
        if (this.e != null) {
            this.e.a(aw, n, b);
        }
        final l l = (l)this.k.get();
        if (l != null) {
            l.a(aw, n, b);
        }
    }
    
    protected boolean a() {
        return this.b.equals(VideoPlayerView$Mode.a) || this.l.J();
    }
    
    public void b() {
        final PlaybackMode correspondingAVPlayerMode = this.getCorrespondingAVPlayerMode();
        this.l.a(this, correspondingAVPlayerMode);
        if (!this.l.J()) {
            this.l.b(correspondingAVPlayerMode);
        }
    }
    
    public void b(final int n, final int n2) {
        if (n == 701) {
            this.a.d();
            if (this.e != null) {
                this.e.d();
            }
        }
        else if (n == 702) {
            this.a.e();
            if (this.e != null) {
                this.e.e();
            }
        }
        else if (n == 3) {
            this.a.c();
            if (this.e != null) {
                this.e.c();
            }
            this.o();
        }
        final l l = (l)this.k.get();
        if (l != null) {
            l.b(n, n2);
        }
    }
    
    public void b(final AVPlayer avPlayer) {
        this.a(this.getContext(), true);
    }
    
    public void b(final boolean b) {
        this.a.c(b);
        if (this.e != null) {
            this.e.c(b);
        }
        final l l = (l)this.k.get();
        if (l != null) {
            l.b(b);
        }
    }
    
    public boolean c() {
        if (this.d) {
            final boolean g = this.a.g();
            if (this.e != null) {
                this.e.g();
            }
            return g;
        }
        return false;
    }
    
    void d() {
        if (this.c(this.l) && this.l.i() && !this.a.a()) {
            if (!this.l.u()) {
                this.o = true;
                return;
            }
            this.a(this.getContext(), false);
        }
    }
    
    public boolean dispatchKeyEvent(final KeyEvent keyEvent) {
        if (4 == keyEvent.getKeyCode()) {
            this.i();
        }
        return super.dispatchKeyEvent(keyEvent);
    }
    
    public void e() {
        this.a.f();
        if (this.e != null) {
            this.e.f();
        }
        final l l = (l)this.k.get();
        if (l != null) {
            l.e();
        }
    }
    
    public void f() {
        final long a = this.l.x().a;
        final a z = this.l.z();
        final boolean b = z == null || z.d();
        this.a.b_(b);
        if (this.e != null) {
            this.e.b_(b);
        }
        this.j.setKeepScreenOn(false);
        if (this.f != null) {
            this.f.getView().setAlpha(1.0f);
            this.f.getView().setVisibility(0);
        }
        final l l = (l)this.k.get();
        if (l != null) {
            l.f();
        }
    }
    
    public au g() {
        this.n();
        this.b();
        this.l.b(this.l.v());
        return this.l.e();
    }
    
    protected f getChromeView() {
        return this.a;
    }
    
    PlaybackMode getCorrespondingAVPlayerMode() {
        switch (ai.a[this.b.ordinal()]) {
            default: {
                return PlaybackMode.a;
            }
            case 1: {
                return PlaybackMode.d;
            }
            case 2:
            case 3: {
                return PlaybackMode.a;
            }
            case 4:
            case 5: {
                return PlaybackMode.b;
            }
        }
    }
    
    protected int getEmbeddedChromeMode() {
        switch (ai.a[this.b.ordinal()]) {
            default: {
                return 0;
            }
            case 1: {
                return 5;
            }
            case 2: {
                return 1;
            }
            case 4: {
                if (as.a()) {
                    return 3;
                }
                return 2;
            }
        }
    }
    
    public Point getVideoSize() {
        return this.c;
    }
    
    protected View getVideoViewContainer() {
        return (View)this.j;
    }
    
    public void h() {
        if (!this.l.J() && (!this.d || !this.j.b())) {
            this.j.a();
            if (this.j.getParent() == null) {
                this.addView((View)this.j, 0);
            }
            if (this.c.x != 0 && this.c.y != 0) {
                this.j.a(this.c.x, this.c.y);
            }
            this.d = true;
            this.j.setKeepScreenOn(this.l.u());
            final l l = (l)this.k.get();
            if (l != null) {
                l.h();
            }
        }
    }
    
    public void i() {
        this.a.i();
        if (this.e != null) {
            this.e.i();
        }
        this.d = false;
        if (t.a()) {
            this.j.j();
        }
        this.j.setKeepScreenOn(false);
        final l l = (l)this.k.get();
        if (l != null) {
            l.i();
        }
    }
    
    public void j() {
        this.j.setKeepScreenOn(false);
        this.a.b();
        if (this.e != null) {
            this.e.b();
        }
        final l l = (l)this.k.get();
        if (l != null) {
            l.j();
        }
    }
    
    public void k() {
        if (this.f != null) {
            this.f.getView().setAlpha(1.0f);
            this.f.getView().setVisibility(0);
        }
    }
    
    public void l() {
        this.a.k();
        if (this.e != null) {
            this.e.k();
        }
        final l l = (l)this.k.get();
        if (l != null) {
            l.l();
        }
    }
    
    public au m() {
        this.n();
        this.l.j();
        this.l.s();
        return this.l.e();
    }
    
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.getResources().getConfiguration().orientation == 1) {
            this.l.a(true);
        }
        this.i.post((Runnable)new ah(this));
        this.getViewTreeObserver().addOnScrollChangedListener((ViewTreeObserver$OnScrollChangedListener)this);
    }
    
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.getViewTreeObserver().removeOnScrollChangedListener((ViewTreeObserver$OnScrollChangedListener)this);
        this.l.c(this.l.u());
    }
    
    protected void onLayout(final boolean b, final int n, final int n2, final int n3, final int n4) {
        final Rect a = this.j.a(n, n2, n3, n4);
        this.j.layout(a.left, a.top, a.right, a.bottom);
        this.a.layout(n, n2, n3, n4);
        if (this.f != null) {
            final int max = Math.max(0, n4 - n2 - Math.round((n3 - n) / this.f.getAspectRatio()));
            this.f.getView().layout(0, max / 2, n3 - n, n4 - n2 - max / 2);
        }
    }
    
    protected void onMeasure(final int n, final int n2) {
        this.setMeasuredDimension(View$MeasureSpec.getSize(n), View$MeasureSpec.getSize(n2));
        this.measureChildren(n, n2);
    }
    
    public void onScrollChanged() {
        this.l.e(this.getGlobalVisibleRect(this.p) && this.p.bottom - this.p.top >= this.getHeight() && this.p.right - this.p.left >= this.getWidth());
    }
    
    public void onWindowFocusChanged(final boolean b) {
        super.onWindowFocusChanged(b);
        if (b) {
            this.h();
            return;
        }
        this.i();
    }
    
    protected void onWindowVisibilityChanged(final int n) {
        super.onWindowVisibilityChanged(n);
        if (n == 0) {
            this.b();
        }
    }
    
    public void setAVPlayerEventListener(final l l) {
        this.k = new WeakReference((T)l);
    }
    
    public void setExternalChromeView(final f e) {
        if (this.e != null && this.e.getOnChromeClickListener() != null) {
            this.e.setOnChromeClickListener(null);
        }
        if (e != null) {
            e.setOnChromeClickListener(this);
        }
        this.e = e;
    }
    
    public void setIsDockingAllowed(final boolean dockingAllowed) {
        this.a.setDockingAllowed(dockingAllowed);
    }
    
    public void setIsFullScreenToggleAllowed(final boolean fullScreenAllowed) {
        this.a.setFullScreenAllowed(fullScreenAllowed);
    }
    
    public void setOnVideoDockListener(final aj n) {
        this.n = n;
    }
}
