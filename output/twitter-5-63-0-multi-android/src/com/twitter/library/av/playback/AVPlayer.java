// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.av.playback;

import android.media.MediaPlayer;
import java.util.ArrayList;
import java.util.List;
import com.twitter.library.client.ad;
import java.util.Iterator;
import com.twitter.library.provider.Tweet;
import com.twitter.library.client.ay;
import android.content.res.Resources$NotFoundException;
import android.view.SurfaceHolder;
import android.app.Activity;
import com.twitter.android.av.t;
import android.media.AudioManager;
import android.view.Surface;
import com.twitter.library.scribe.TwitterScribeAssociation;
import com.twitter.library.av.l;
import android.text.TextUtils;
import android.os.Looper;
import android.content.IntentFilter;
import java.util.HashMap;
import com.twitter.library.media.util.g;
import com.twitter.library.av.aa;
import java.util.Map;
import android.content.BroadcastReceiver;
import android.os.Handler;
import com.twitter.library.av.f;
import com.twitter.internal.android.util.Size;
import java.lang.ref.WeakReference;
import com.twitter.library.av.model.b;
import com.twitter.android.av.ap;
import android.os.Bundle;
import com.twitter.library.av.m;
import com.twitter.library.client.az;
import android.content.Context;
import com.twitter.library.av.k;
import com.twitter.library.media.util.d;
import com.twitter.library.client.af;
import com.twitter.library.av.h;
import com.twitter.android.av.as;
import android.media.MediaPlayer$OnCompletionListener;

public class AVPlayer implements MediaPlayer$OnCompletionListener, as, h, af, d
{
    static final String a;
    static final String b;
    private static k m;
    private static c n;
    private boolean A;
    private final Context B;
    private volatile au C;
    private final p D;
    private final j E;
    private x F;
    private boolean G;
    private az H;
    private z I;
    private boolean J;
    private y K;
    private final m L;
    private final Bundle M;
    private final ap N;
    private boolean O;
    private boolean P;
    volatile b c;
    volatile String d;
    bb e;
    WeakReference f;
    Size g;
    f h;
    boolean i;
    final com.twitter.library.av.playback.as j;
    volatile PlaybackMode k;
    long l;
    private final a o;
    private final int[] p;
    private final int[] q;
    private final Handler r;
    private final ug s;
    private final BroadcastReceiver t;
    private Map u;
    private final com.twitter.library.media.util.b v;
    private WeakReference w;
    private boolean x;
    private float y;
    private boolean z;
    
    static {
        a = AVPlayer.class.getName() + ".IS_REPLAY";
        b = AVPlayer.class.getName() + ".HAS_SCRIBED_SHOW";
        AVPlayer.n = c.a;
    }
    
    protected AVPlayer(final p p3, final au au, final Context context) {
        this(p3, au, context, new j());
    }
    
    protected AVPlayer(final p p4, final au au, final Context context, final j j) {
        this(p4, au, context, j, new com.twitter.library.av.playback.as());
    }
    
    protected AVPlayer(final p d, final au c, final Context context, final j e, final Handler r, final y k, final m l, final aa aa, final a o, final com.twitter.library.av.playback.as j, final f h, final g g) {
        this.e = new bb();
        this.f = new WeakReference(null);
        this.g = Size.a;
        this.i = false;
        this.k = PlaybackMode.a;
        this.p = new int[1];
        this.q = new int[1];
        this.t = new r(this);
        this.u = new HashMap();
        this.w = new WeakReference(null);
        this.x = true;
        this.y = com.twitter.library.media.util.b.a(100, 100);
        this.z = true;
        this.M = new Bundle();
        this.O = false;
        this.B = context.getApplicationContext();
        this.D = d;
        this.E = e;
        this.r = r;
        this.K = k;
        this.L = l;
        this.C = c;
        this.v = g.a(this.B, this);
        this.h = h;
        this.N = aa.a(this.q(), this.B, this);
        this.o = o;
        (this.j = j).a(this, this.r);
        this.h.a(this);
        this.s = new ug();
        final IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
        intentFilter.addAction("android.intent.action.SCREEN_ON");
        this.B.registerReceiver(this.t, intentFilter);
    }
    
    protected AVPlayer(final p p5, final au au, final Context context, final j j, final com.twitter.library.av.playback.as as) {
        this(p5, au, context, j, new Handler(Looper.getMainLooper()), new y(), new m(), new aa(), AVPlayer.n.a(context, au.b()), as, com.twitter.library.av.f.a(context), new g());
    }
    
    private float Q() {
        if (this.f()) {
            return 0.0f;
        }
        return this.y;
    }
    
    private boolean R() {
        final b k = this.K();
        final au e = this.e();
        return k != null && TextUtils.equals((CharSequence)this.d, (CharSequence)e.c());
    }
    
    private void S() {
        final l m = this.m();
        if (m != null) {
            m.a(lg.media_error_audio_focus_rejected, this.B.getString(lg.media_error_audio_focus_rejected));
        }
    }
    
    private boolean T() {
        final b k = this.K();
        return (this.j.c() == null && k == null) || (this.j.c() == null && !k.a());
    }
    
    private boolean U() {
        final b k = this.K();
        return this.j.c() == null && k != null && k.a();
    }
    
    private boolean V() {
        return this.j.c() != null && !this.j.c().o();
    }
    
    private TwitterScribeAssociation W() {
        return this.C.h();
    }
    
    public static void a(final k m) {
        AVPlayer.m = m;
    }
    
    public static void a(final c n) {
        AVPlayer.n = n;
    }
    
    private b b(final Context context) {
        if (!this.M.getBoolean(AVPlayer.b)) {
            this.M.putBoolean(AVPlayer.b, true);
            this.a("show");
        }
        final au e = this.e();
        this.d = e.c();
        final com.twitter.library.av.model.factory.a e2 = e.e();
        if (e2 != null) {
            return e2.a(context, e);
        }
        return null;
    }
    
    public boolean A() {
        return this.x;
    }
    
    public m B() {
        return this.L;
    }
    
    public void C() {
        this.L.a();
        final Surface n = this.n();
        if (n != null) {
            n.release();
            this.f.clear();
        }
    }
    
    public boolean D() {
        return this.j.h();
    }
    
    public k E() {
        return AVPlayer.m;
    }
    
    public void F() {
        this.j.c().s();
    }
    
    public void G() {
        this.j.c().t();
    }
    
    public void H() {
        if (this.A) {
            this.A = false;
            final l m = this.m();
            if (m != null) {
                m.b(true);
            }
        }
    }
    
    public PlaybackMode I() {
        return this.k;
    }
    
    public boolean J() {
        return this.k == PlaybackMode.c;
    }
    
    public b K() {
        synchronized (this.p) {
            return this.c;
        }
    }
    
    public void L() {
        if (this.u()) {
            this.s();
        }
    }
    
    public Size M() {
        return this.g;
    }
    
    j N() {
        return this.E;
    }
    
    Context O() {
        return this.B;
    }
    
    public boolean P() {
        return this.P;
    }
    
    protected b a(final Context context) {
        if (this.R()) {
            return this.K();
        }
        return this.b(context);
    }
    
    protected ab a(final l l) {
        return new ab(l, this, this.r);
    }
    
    protected com.twitter.library.util.d a(final Context context, final String s, final String s2, final com.twitter.library.av.model.a a, final long n) {
        final b k = this.K();
        int a2;
        if (k != null) {
            a2 = k.a(a);
        }
        else {
            a2 = -1;
        }
        final int orientation = context.getResources().getConfiguration().orientation;
        final boolean b = ((AudioManager)context.getSystemService("audio")).getRingerMode() == 0;
        final com.twitter.library.util.d d = new com.twitter.library.util.d();
        d.put(0, (Object)this.q());
        d.put(7, (Object)s);
        d.put(8, (Object)a2);
        d.put(9, (Object)a);
        d.put(11, (Object)orientation);
        d.put(12, (Object)b);
        d.put(13, (Object)s2);
        d.put(18, (Object)k);
        d.put(23, (Object)this.k);
        if (a != null && com.twitter.library.av.model.c.a(a)) {
            d.put(24, (Object)this.j.f().c());
        }
        d.put(22, (Object)this.e().d());
        this.e.a(s, k, d, n);
        return d;
    }
    
    protected com.twitter.library.util.d a(final com.twitter.library.av.model.a a, final String s) {
        final com.twitter.library.util.d d = new com.twitter.library.util.d();
        d.put(0, (Object)this.q());
        d.put(4, (Object)this.h());
        d.put(3, (Object)s);
        d.put(9, (Object)a);
        d.put(18, (Object)this.K());
        d.put(5, (Object)this.e().c());
        return d;
    }
    
    public void a() {
        if (this.j.c() != null) {
            this.j.c().a(null, false);
        }
    }
    
    public void a(final int n) {
        if (this.j.c() != null) {
            this.j.c().b(n);
        }
    }
    
    public void a(final long n, final mc mc) {
        if (com.twitter.android.av.t.a() && n == this.C.b().Q) {
            this.j();
            (this.F = this.K.a(this, null)).a(this.z() == null);
        }
    }
    
    public void a(final Activity activity) {
        if (!activity.isChangingConfigurations()) {
            this.d(false);
        }
    }
    
    public void a(final Surface surface) {
        if (surface != null) {
            this.f = new WeakReference((T)surface);
            if (this.j.c() != null) {
                this.j.c().b(surface);
            }
        }
    }
    
    public void a(final SurfaceHolder surfaceHolder) {
        if (surfaceHolder != null) {
            this.w = new WeakReference((T)surfaceHolder);
            if (this.j.c() != null) {
                this.j.c().a(surfaceHolder);
            }
        }
    }
    
    public void a(final l l, final PlaybackMode playbackMode) {
        this.u.put(playbackMode, this.a(l));
        if (this.j.c() != null) {
            this.j.c().a(this.m());
        }
    }
    
    protected void a(final b b) {
        if (b == null || !b.a()) {
            return;
        }
        this.i = false;
        this.a("open", null, this.j.b(b));
    }
    
    protected void a(final b b, final Context context) {
        boolean b2;
        if (b != null) {
            b2 = true;
        }
        else {
            b2 = false;
        }
        if (b2 && b.a()) {
            this.s.a();
            this.a(b);
            return;
        }
        int n = 0;
        Label_0129: {
            if (!b2) {
                break Label_0129;
            }
            String s = b.e();
        Label_0070_Outer:
            while (true) {
                Label_0135: {
                    if (!b2 || b.b() == 0) {
                        break Label_0135;
                    }
                    n = b.b();
                Label_0087_Outer:
                    while (true) {
                        while (true) {
                            if (s != null) {
                                break Label_0087;
                            }
                            try {
                                s = context.getString(n);
                                this.a("error", s, null);
                                final l m = this.m();
                                if (m != null) {
                                    this.r.post((Runnable)new s(this, m, n));
                                    return;
                                }
                                break Label_0129;
                                n = lg.av_playlist_download_failed;
                                continue Label_0087_Outer;
                                s = null;
                                continue Label_0070_Outer;
                            }
                            catch (Resources$NotFoundException ex) {
                                s = String.format("Error id: %d", n);
                                continue;
                            }
                            break;
                        }
                        break;
                    }
                }
                break;
            }
        }
        this.r.post((Runnable)new com.twitter.library.av.playback.t(this, context, n));
    }
    
    void a(final b b, final com.twitter.library.av.model.a a, final Long n) {
        final com.twitter.library.util.d a2 = this.a(this.B, "playback_lapse", null, a, System.currentTimeMillis());
        this.e.a("playback_lapse", b, a2, 0L);
        a2.put(2, (Object)n);
        this.o.a("AVPlayer.EVENT_LOG_ANALYTICS_EVENT", a2, this.C.h());
    }
    
    void a(final AVMediaPlayer avMediaPlayer) {
        avMediaPlayer.a(this.Q());
    }
    
    public void a(final PlaybackMode playbackMode) {
        this.u.remove(playbackMode);
    }
    
    public void a(final au au) {
        this.C.a(au.b());
        if (au.h() != null) {
            this.C.a(au.h());
        }
    }
    
    public void a(final aw aw, final int n, final boolean b) {
        final l m = this.m();
        if (m != null) {
            m.a(aw, n, b);
        }
    }
    
    public void a(final w w) {
        if (this.F == null && this.K() == null) {
            (this.F = this.K.a(this, w)).a((Object[])new Void[0]);
        }
    }
    
    public void a(final az h) {
        this.H = h;
        this.I = new z(this);
        if (this.H != null) {
            this.H.a(this.I);
        }
    }
    
    public void a(final Tweet tweet) {
        final au e = this.e();
        if (e != null) {
            e.a(tweet);
        }
        final Iterator<l> iterator = this.u.values().iterator();
        while (iterator.hasNext()) {
            iterator.next().l();
        }
    }
    
    public void a(final String s) {
        this.a(s, null, null);
    }
    
    public void a(final String s, final String s2) {
        this.a(s, s2, null);
    }
    
    public void a(final String s, final String s2, final com.twitter.library.av.model.a a) {
        final Context b = this.B;
        com.twitter.library.av.model.a z;
        if (a == null) {
            z = this.z();
        }
        else {
            z = a;
        }
        this.o.a("AVPlayer.EVENT_LOG_ANALYTICS_EVENT", this.a(b, s, s2, z, System.currentTimeMillis()), this.W());
        if ("playback_0".equals(s) && this.j.i()) {
            this.o.a("AVPlayer.EVENT_LOG_ANALYTICS_EVENT", this.a(b, "playlist_start", s2, z, System.currentTimeMillis()), this.W());
        }
        this.o.a("AVPlayer.EVENT_PROMOTED_LOGGING_EVENT", this.a(z, s), this.W());
    }
    
    public void a(final boolean z) {
        this.z = z;
    }
    
    protected void a(final boolean b, final boolean b2) {
        final b k = this.K();
        this.p();
        if (this.G) {
            ad.a().b(this);
            this.G = false;
        }
        if (this.v != null) {
            this.v.b();
        }
        final boolean v = this.v();
        long a = this.j.a(b2);
        while (true) {
            Label_0276: {
                if (v) {
                    break Label_0276;
                }
                while (true) {
                    this.l = a;
                    if (b) {
                        this.C();
                    }
                    if (k != null && !this.i) {
                        this.a("close");
                        this.b(k);
                    }
                    if (this.H != null && this.I != null) {
                        this.H.b(this.I);
                        this.I = null;
                    }
                    this.u.clear();
                    this.w.clear();
                    this.j.g();
                    this.x = true;
                    this.z = true;
                    if (!b2) {
                        break Label_0276;
                    }
                    this.M.clear();
                    this.k = PlaybackMode.a;
                    this.l = 0L;
                    this.d = null;
                    synchronized (this.p) {
                        this.c = null;
                        // monitorexit(this.p)
                        if (!this.O) {
                            this.B.unregisterReceiver(this.t);
                            this.O = true;
                        }
                        this.N.a();
                        this.h.b(this);
                        this.e = new bb();
                        this.j();
                        this.s.b();
                        this.i = true;
                        return;
                        a = 0L;
                        continue;
                    }
                    break;
                }
            }
            this.A = true;
            continue;
        }
    }
    
    public void aA_() {
    }
    
    public void b() {
        if (this.j.c() != null) {
            this.j.c().p();
        }
    }
    
    public void b(final Activity activity) {
    }
    
    void b(final b b) {
        for (final Map.Entry<com.twitter.library.av.model.a, V> entry : this.j.e().entrySet()) {
            final com.twitter.library.av.model.a a = entry.getKey();
            final com.twitter.library.av.playback.f f = (com.twitter.library.av.playback.f)entry.getValue();
            if (f.c()) {
                this.a(b, a, Long.valueOf(f.b()));
            }
        }
    }
    
    public void b(final PlaybackMode k) {
        if (k != this.k) {
            final PlaybackMode i = this.k;
            this.k = k;
            if (this.j.c() != null) {
                this.x = this.j.c().o();
            }
            if (i == PlaybackMode.d) {
                this.v.a();
            }
            else if (k == PlaybackMode.d) {
                this.v.b();
            }
            final b j = this.K();
            if (j != null) {
                this.j.d(j);
                if (this.j.c() != null) {
                    this.a(this.j.c());
                }
            }
            final l m = this.m();
            if (m != null) {
                m.h();
                if (this.j.c() != null) {
                    this.j.c().a(m);
                }
            }
            final Iterator<l> iterator = (Iterator<l>)this.l().iterator();
            while (iterator.hasNext()) {
                iterator.next().i();
            }
        }
    }
    
    public void b(final boolean j) {
        boolean b;
        if (this.V()) {
            if (!this.G) {
                ad.a().a(this);
                this.G = true;
            }
            String s = "play";
            if (j) {
                this.M.putBoolean(AVPlayer.a, true);
                s = "replay";
            }
            else if (this.j.c().q()) {
                s = "resume";
            }
            else if (com.twitter.library.av.w.a()) {
                final Tweet q = this.q();
                if (this.h != null && q != null) {
                    this.h.a(q, this.K());
                }
            }
            this.D.a(this.e().a());
            this.a(s);
            if (this.k == PlaybackMode.d || this.v.a()) {
                this.j.c().a(this.z(), j);
            }
            else {
                this.S();
            }
            b = false;
        }
        else if (this.U()) {
            this.c(true);
            this.a(this.K());
            b = true;
        }
        else {
            if (this.T()) {
                this.c(true);
                this.a((w)null);
            }
            b = true;
        }
        if (b && !this.u()) {
            this.J = j;
            final l m = this.m();
            if (m != null) {
                m.b(701, 0);
            }
        }
    }
    
    public void c() {
        this.y = com.twitter.library.media.util.b.a(100, 50);
        if (this.j.c() != null) {
            this.a(this.j.c());
        }
    }
    
    public void c(final b c) {
        if (c == this.c) {
            return;
        }
        synchronized (this.p) {
            this.c = c;
        }
    }
    
    public void c(final boolean x) {
        this.x = x;
    }
    
    public void d() {
        this.y = com.twitter.library.media.util.b.a(100, 100);
        if (this.j.c() != null) {
            this.a(this.j.c());
        }
    }
    
    public void d(final boolean b) {
        if (!b) {
            this.c(false);
            this.j();
            this.s();
            this.A = true;
        }
    }
    
    public au e() {
        synchronized (this.q) {
            return this.C;
        }
    }
    
    public void e(final boolean p) {
        this.P = p;
    }
    
    public boolean f() {
        return this.k == PlaybackMode.d;
    }
    
    public boolean g() {
        return this.k == PlaybackMode.b;
    }
    
    public Bundle h() {
        return this.M;
    }
    
    public boolean i() {
        return this.z;
    }
    
    public void j() {
        if (this.F != null) {
            this.F.cancel(true);
            this.F.a();
            this.F = null;
        }
    }
    
    public void k() {
        if (this.j.c() == null) {
            this.a(this.K(), this.B);
        }
    }
    
    protected List l() {
        final ArrayList<Object> list = new ArrayList<Object>();
        for (final Map.Entry<K, Object> entry : this.u.entrySet()) {
            if (entry.getKey() != this.k && entry.getValue() != null) {
                list.add(entry.getValue());
            }
        }
        return list;
    }
    
    protected l m() {
        return this.u.get(this.k);
    }
    
    public Surface n() {
        return (Surface)this.f.get();
    }
    
    public SurfaceHolder o() {
        return (SurfaceHolder)this.w.get();
    }
    
    public void onCompletion(final MediaPlayer mediaPlayer) {
        if (this.m() != null) {
            this.m().e();
        }
        final b k = this.K();
        if (k != null) {
            this.c(false);
            if (this.j.c(k)) {
                this.a("open");
                this.a(this.j.c());
                this.j.c().a(null, false);
                return;
            }
            if (this.m() != null) {
                this.m().f();
            }
            if (this.v != null) {
                this.v.b();
            }
        }
    }
    
    protected void p() {
        final Iterator<Map.Entry<Object, l>> iterator = new HashMap<Object, l>(this.u).entrySet().iterator();
        while (iterator.hasNext()) {
            iterator.next().getValue().k();
        }
    }
    
    public Tweet q() {
        return this.e().b();
    }
    
    public boolean r() {
        return this.n() != null;
    }
    
    public void s() {
        if (this.j.c() != null) {
            this.x = false;
            this.a("pause");
            this.v.b();
            this.j.c().p();
        }
    }
    
    public boolean t() {
        return this.j.c() != null;
    }
    
    public boolean u() {
        return this.j.c() != null && this.j.c().o();
    }
    
    public boolean v() {
        return this.j.c() != null && this.j.c().r();
    }
    
    public boolean w() {
        return this.j.c() != null && this.j.c().q();
    }
    
    public aw x() {
        if (this.j.c() != null) {
            return this.j.c().u();
        }
        return new aw(0L, 0L, 0);
    }
    
    public void y() {
        if (this.j.c() != null) {
            this.a("rewind");
        }
    }
    
    public com.twitter.library.av.model.a z() {
        if (this.j != null) {
            return this.j.d();
        }
        return null;
    }
}
