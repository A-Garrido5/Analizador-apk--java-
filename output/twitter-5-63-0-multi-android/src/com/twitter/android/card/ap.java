// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.card;

import com.twitter.library.card.element.k;
import com.twitter.library.media.manager.ao;
import com.twitter.library.media.manager.h;
import com.twitter.android.vineloops.i;
import com.twitter.library.client.as;
import com.twitter.android.vineloops.VineLoopAggregator;
import android.view.View;
import com.twitter.library.media.player.InlineVideoView;
import com.twitter.library.card.element.BasePlayer;
import android.content.Context;
import com.twitter.library.av.playback.p;
import com.twitter.android.vineloops.b;
import com.twitter.android.vineloops.a;
import com.twitter.library.card.element.j;

public class ap extends j implements a
{
    private com.twitter.library.media.manager.ap c;
    private String d;
    private b e;
    private final p f;
    
    public ap(final Context context, final BasePlayer basePlayer) {
        super(context, basePlayer);
        this.f = p.a();
    }
    
    private void a(final PlayerDelegateVineView playerDelegateVineView) {
        (this.e = new b(this)).a(playerDelegateVineView.a);
    }
    
    private void i() {
        synchronized (this) {
            if (this.d != null) {
                final PlayerDelegateVineView playerDelegateVineView = (PlayerDelegateVineView)this.b.z();
                if (playerDelegateVineView != null) {
                    this.f.b();
                    final InlineVideoView a = playerDelegateVineView.a;
                    playerDelegateVineView.a();
                    a.setVideoPath(this.d);
                    a.start();
                    this.d = null;
                }
            }
        }
    }
    
    @Override
    public View a() {
        final PlayerDelegateVineView playerDelegateVineView = new PlayerDelegateVineView(this.a, this.b);
        this.a(playerDelegateVineView);
        return (View)playerDelegateVineView;
    }
    
    @Override
    public void a(final com.twitter.library.media.manager.ap ap, final String d, final boolean b) {
        synchronized (this) {
            if (ap == this.c) {
                this.d = d;
                if (b) {
                    this.i();
                }
            }
        }
    }
    
    @Override
    public void a(final boolean b) {
        super.a(b);
        if (this.e != null) {
            final int a = this.e.a();
            if (a > 0) {
                VineLoopAggregator.a(this.a).a(this.b.htmlUrl, a);
                final Context applicationContext = this.a.getApplicationContext();
                i.a(applicationContext, as.a(applicationContext)).a();
            }
        }
    }
    
    @Override
    public boolean a(final h h, final ao ao) {
        synchronized (this) {
            this.c = com.twitter.library.media.manager.ap.a(this.b.streamUrl).a();
            this.d = null;
            return new k(ao, this.c, this).a();
        }
    }
    
    @Override
    public boolean b() {
        return false;
    }
    
    @Override
    public void c() {
        synchronized (this) {
            this.c = null;
            this.d = null;
            this.e = null;
        }
    }
    
    @Override
    public void d() {
        this.i();
    }
    
    @Override
    public boolean e() {
        return false;
    }
    
    @Override
    public void h() {
        this.b.h();
    }
}
