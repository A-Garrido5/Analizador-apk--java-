// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.card;

import com.twitter.library.card.element.k;
import com.twitter.library.media.manager.ao;
import com.twitter.library.media.manager.h;
import com.twitter.library.media.manager.aj;
import android.view.View;
import com.twitter.library.media.player.InlineVideoView;
import android.media.MediaPlayer$OnCompletionListener;
import android.media.MediaPlayer$OnErrorListener;
import android.media.MediaPlayer$OnPreparedListener;
import com.twitter.library.card.element.BasePlayer;
import android.content.Context;
import com.twitter.library.media.manager.ap;
import com.twitter.library.card.element.j;

public class ak extends j
{
    private ap c;
    private String d;
    
    public ak(final Context context, final BasePlayer basePlayer) {
        super(context, basePlayer);
    }
    
    private void a(final PlayerDelegateVineView playerDelegateVineView) {
        final InlineVideoView a = playerDelegateVineView.a;
        a.setOnPreparedListener((MediaPlayer$OnPreparedListener)new al(this));
        a.setOnErrorListener((MediaPlayer$OnErrorListener)new am(this, a));
        a.setOnCompletionListener((MediaPlayer$OnCompletionListener)new an(this));
    }
    
    private void h() {
        synchronized (this) {
            if (this.d != null) {
                final PlayerDelegateVineView playerDelegateVineView = (PlayerDelegateVineView)this.b.z();
                if (playerDelegateVineView != null) {
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
    public void a(final ap ap, final String d, final boolean b) {
        synchronized (this) {
            if (ap.a(this.c)) {
                this.d = d;
                if (b) {
                    this.h();
                }
            }
        }
    }
    
    @Override
    public boolean a(final h h, final ao ao) {
        synchronized (this) {
            this.c = ap.a(this.b.streamUrl).a();
            this.d = null;
            return new k(ao, this.c, this).a();
        }
    }
    
    @Override
    public boolean b() {
        final InlineVideoView a = ((PlayerDelegateVineView)this.b.z()).a;
        if (!a.b()) {
            a.pause();
        }
        else {
            a.c();
        }
        return true;
    }
    
    @Override
    public void c() {
        synchronized (this) {
            this.c = null;
            this.d = null;
        }
    }
    
    @Override
    public void d() {
        this.h();
    }
    
    @Override
    public boolean e() {
        return false;
    }
}
