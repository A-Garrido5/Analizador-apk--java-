// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import android.os.Parcelable;
import java.util.Iterator;
import com.twitter.library.util.bq;
import android.text.TextUtils;
import android.support.v4.content.CursorLoader;
import com.twitter.library.provider.cc;
import com.twitter.library.provider.ae;
import com.twitter.library.provider.aw;
import android.content.res.Configuration;
import com.twitter.android.av.t;
import com.twitter.internal.android.util.Size;
import com.twitter.library.av.playback.au;
import com.twitter.library.av.playback.ar;
import android.content.Intent;
import android.widget.FrameLayout;
import android.widget.Toast;
import com.twitter.library.av.playback.bf;
import com.twitter.android.widget.bg;
import com.twitter.android.widget.gf;
import com.twitter.library.av.playback.PlaybackMode;
import com.twitter.android.widget.carousel.j;
import com.twitter.library.provider.ad;
import android.database.Cursor;
import android.support.v4.content.Loader;
import com.twitter.library.av.VideoPlayerView$Mode;
import com.twitter.android.client.bn;
import android.os.Bundle;
import java.util.Collection;
import java.util.LinkedList;
import com.twitter.android.av.ba;
import android.view.ViewGroup$LayoutParams;
import android.view.View;
import android.widget.FrameLayout$LayoutParams;
import java.util.List;
import java.util.ArrayList;
import com.twitter.android.widget.carousel.a;
import com.twitter.android.widget.carousel.b;
import com.twitter.library.av.control.f;
import android.content.Context;
import android.view.ViewGroup;
import com.twitter.android.widget.carousel.ViewMoreCarouselView;
import com.twitter.android.widget.carousel.k;
import com.twitter.android.av.ap;
import com.twitter.library.av.playback.p;
import com.twitter.android.av.o;
import com.twitter.android.av.FullscreenViewMoreVideoPlayerChromeView;
import com.twitter.library.scribe.TwitterScribeAssociation;
import com.twitter.library.provider.Tweet;
import com.twitter.library.av.playback.be;
import com.twitter.library.av.VideoPlayerView;
import com.twitter.library.av.playback.AVPlayer;
import com.twitter.library.av.playback.w;
import com.twitter.library.av.aj;
import com.twitter.android.widget.carousel.d;
import com.twitter.android.av.as;
import com.twitter.android.av.al;
import android.support.v4.app.LoaderManager$LoaderCallbacks;
import com.twitter.android.client.TwitterFragmentActivity;

public class AVMediaPlayerActivity extends TwitterFragmentActivity implements LoaderManager$LoaderCallbacks, al, as, d, aj, w
{
    protected AVPlayer a;
    protected VideoPlayerView b;
    protected boolean c;
    protected final be d;
    protected Tweet e;
    protected TwitterScribeAssociation f;
    private FullscreenViewMoreVideoPlayerChromeView g;
    private o h;
    private final p i;
    private ap j;
    private boolean k;
    private boolean l;
    private boolean m;
    private boolean n;
    private boolean o;
    private long p;
    private k q;
    private ViewMoreCarouselView r;
    
    public AVMediaPlayerActivity() {
        this.d = new be();
        this.i = com.twitter.library.av.playback.p.a();
        this.n = false;
        this.o = false;
    }
    
    private void c(final ViewGroup viewGroup) {
        this.g = this.h();
        this.q = new k((Context)this, com.twitter.library.av.playback.p.a(), this.f, this.g);
        this.r = new com.twitter.android.widget.carousel.o((Context)this).a(new b()).a((d)this).a(this.g).a((al)this).a(this.q).a();
        final ArrayList<Tweet> list = new ArrayList<Tweet>(1);
        list.add(this.e);
        this.q.a(list);
        viewGroup.addView((View)this.r, (ViewGroup$LayoutParams)new FrameLayout$LayoutParams(-1, -1));
        if (this.g != null) {
            viewGroup.addView((View)this.g, (ViewGroup$LayoutParams)new FrameLayout$LayoutParams(-1, -1));
        }
    }
    
    private FullscreenViewMoreVideoPlayerChromeView h() {
        final f a = new ba().a((Context)this, 2);
        if (a instanceof FullscreenViewMoreVideoPlayerChromeView) {
            return (FullscreenViewMoreVideoPlayerChromeView)a;
        }
        return null;
    }
    
    private List i() {
        final LinkedList<Object> list = new LinkedList<Object>();
        if (this.a != null) {
            list.add(this.a);
        }
        else if (this.q != null) {
            list.addAll(this.q.d());
            return list;
        }
        return list;
    }
    
    @Override
    public bn a(final Bundle bundle, final bn bn) {
        bn.c(false);
        if (kg.a((Context)this)) {
            bn.a(4);
            bn.d(false);
        }
        return bn;
    }
    
    protected VideoPlayerView a() {
        return new VideoPlayerView((Context)this, this.a, VideoPlayerView$Mode.c);
    }
    
    @Override
    public void a(final int n, final long p2) {
        if (this.g != null && n > 0) {
            this.p = p2;
            this.getSupportLoaderManager().restartLoader(0, null, this);
        }
    }
    
    public void a(final Loader loader, final Cursor cursor) {
        final int count = cursor.getCount();
        final ArrayList list = new ArrayList<Tweet>(count + 1);
        list.add(this.e);
        for (int i = 0; i < count; ++i) {
            if (cursor.moveToPosition(i)) {
                list.add(new ad(cursor).a());
            }
        }
        this.q.a(list);
    }
    
    protected void a(final ViewGroup viewGroup) {
        if (com.twitter.library.av.as.a()) {
            this.c(viewGroup);
            return;
        }
        this.b(viewGroup);
    }
    
    @Override
    public void a(final FullscreenViewMoreVideoPlayerChromeView fullscreenViewMoreVideoPlayerChromeView) {
        if (this.r != null) {
            this.r.setIsExpandedAnimated(!this.r.c());
        }
    }
    
    @Override
    public void a(final b b, final int n) {
    }
    
    @Override
    public void a(final b b, final int n, final int n2) {
        final j a = this.r.a(n);
        final j a2 = this.r.a(n2);
        if (a != null) {
            a.a(true);
            this.q.a(a);
        }
        if (a2 != null) {
            a2.a(false);
            this.q.a(a2);
        }
    }
    
    @Override
    public void a(final AVPlayer avPlayer) {
        this.n = true;
        avPlayer.b(PlaybackMode.c);
        final gf gf = new gf(this.getApplicationContext());
        gf.a(1.7777778f);
        gf.a(avPlayer);
        bg.a().a(gf, 3);
        avPlayer.a("dock");
        this.finish();
    }
    
    @Override
    public void a(final Tweet e) {
        this.e = e;
        this.d.a(e);
    }
    
    protected boolean a(final int n) {
        return n == 1 && bg.c();
    }
    
    protected boolean a(final int n, final String s) {
        return n == 1 || n == 0;
    }
    
    @Override
    public void aj_() {
    }
    
    @Override
    public void b(final Bundle bundle, final bn bn) {
        final Intent intent = this.getIntent();
        this.o = intent.getBooleanExtra("is_from_dock", false);
        this.m = intent.getBooleanExtra("is_from_inline", false);
        if (this.m || this.o) {
            this.overridePendingTransition(2131034142, 0);
        }
        super.b(bundle, bn);
        this.f = (TwitterScribeAssociation)intent.getParcelableExtra("association");
        if (bundle == null) {
            this.e = (Tweet)intent.getParcelableExtra("tw");
        }
        else {
            this.e = (Tweet)bundle.getParcelable("tw");
        }
        this.k = intent.getBooleanExtra("finish_when_portrait", false);
        this.h = new o(this.G());
        this.j = new ap(this.e, (Context)this, this);
        String s = intent.getStringExtra("stream_url");
        final int a = bf.a(this.e);
        if (!this.a(a, s)) {
            Toast.makeText((Context)this, 2131297251, 1).show();
            this.finish();
            return;
        }
        this.c = this.a(a);
        this.d.a(bf.b(this.e));
        this.d.b(this.e);
        final be d = this.d;
        if (s == null) {
            s = bf.c(this.e);
        }
        d.a(s);
        this.d.b(this.f);
        final FrameLayout contentView = new FrameLayout((Context)this);
        this.a((ViewGroup)contentView);
        this.setContentView((View)contentView);
    }
    
    protected void b(final ViewGroup viewGroup) {
        this.a = new ar(com.twitter.library.av.playback.p.a()).a(this.d).a(this.getApplicationContext()).a(PlaybackMode.b).a(false).a();
        (this.b = this.a()).setId(2131886087);
        this.b.setOnVideoDockListener(this);
        this.b.setIsFullScreenToggleAllowed(false);
        this.b.setIsDockingAllowed(this.c);
        final Size m = this.a.M();
        if (m != Size.a) {
            this.b.a(m.a(), m.b());
        }
        viewGroup.addView((View)this.b, (ViewGroup$LayoutParams)new FrameLayout$LayoutParams(-1, -1));
        this.a.a((w)this);
    }
    
    @Override
    public void c_() {
        this.onBackPressed();
    }
    
    @Override
    public void d_() {
        this.a.b(false);
    }
    
    @Override
    public void e_() {
    }
    
    @Override
    public void finish() {
        if (this.m) {
            this.overridePendingTransition(0, 2131034144);
        }
        super.finish();
    }
    
    @Override
    public void onBackPressed() {
        if (this.a != null) {
            final AVPlayer a = this.a;
            PlaybackMode playbackMode;
            if (this.m || !t.a()) {
                playbackMode = PlaybackMode.a;
            }
            else {
                playbackMode = PlaybackMode.d;
            }
            a.b(playbackMode);
            this.a.a(this.getResources().getConfiguration().orientation != 2);
        }
        super.onBackPressed();
    }
    
    @Override
    public void onConfigurationChanged(final Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (configuration.orientation == 1 && this.k) {
            if (this.a != null) {
                this.a.c(this.a.u());
                this.a.b(PlaybackMode.a);
            }
            this.l = true;
            this.finish();
        }
    }
    
    @Override
    public Loader onCreateLoader(final int n, final Bundle bundle) {
        return new CursorLoader((Context)this, ae.a(aw.a, this.U().g()), cc.a, "search_id=?", new String[] { String.valueOf(this.p) }, "type_id ASC, _id ASC");
    }
    
    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (this.j != null) {
            this.j.a();
        }
        final List i = this.i();
        for (final AVPlayer avPlayer : i) {
            final boolean equals = TextUtils.equals((CharSequence)avPlayer.e().a(), (CharSequence)this.d.a());
            if (!avPlayer.J()) {
                PlaybackMode playbackMode;
                if (this.m || !t.a()) {
                    playbackMode = PlaybackMode.a;
                }
                else {
                    playbackMode = PlaybackMode.d;
                }
                avPlayer.b(playbackMode);
            }
            if (this.i != null && (bq.a() || !equals)) {
                this.i.a(this.d);
            }
        }
        for (final AVPlayer avPlayer2 : i) {
            com.twitter.library.av.playback.au au;
            if (avPlayer2.e() != null) {
                au = avPlayer2.e();
            }
            else {
                au = this.d;
            }
            final String a = au.a();
            final boolean equals2 = TextUtils.equals((CharSequence)a, (CharSequence)this.d.a());
            int n;
            if (this.n || ((this.l || this.m) && equals2)) {
                n = 1;
            }
            else {
                n = 0;
            }
            if (n == 0) {
                this.i.c(a);
            }
        }
    }
    
    @Override
    public void onLoaderReset(final Loader loader) {
    }
    
    @Override
    protected void onPause() {
        super.onPause();
        final Iterator<AVPlayer> iterator = this.i().iterator();
        while (iterator.hasNext()) {
            iterator.next().j();
        }
    }
    
    @Override
    protected void onResume() {
        super.onResume();
        if (this.a != null) {
            this.a.c(false);
            this.a.H();
        }
    }
    
    @Override
    protected void onSaveInstanceState(final Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putParcelable("tw", (Parcelable)this.e);
    }
}
