// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.highlights;

import com.twitter.android.client.bh;
import com.twitter.library.network.forecaster.NetworkQuality;
import android.content.Context;
import com.twitter.library.media.manager.aj;
import com.twitter.library.media.manager.ao;
import android.media.MediaPlayer$OnPreparedListener;
import com.twitter.library.media.manager.al;
import android.view.View;
import com.twitter.library.media.manager.j;
import com.twitter.library.media.manager.ap;
import com.twitter.library.provider.Tweet;
import com.twitter.library.media.manager.k;
import com.twitter.library.media.manager.aq;

public class l extends aw
{
    private final aq a;
    private final k c;
    private m d;
    
    public l(final String s, final long n, final mx mx, final boolean b, final String s2, final String s3, final Tweet tweet) {
        super(s, n, mx, b, s2, s3, tweet, true);
        this.a = ap.a(this.b.l.classicCard.playerStreamUrl);
        this.c = com.twitter.library.media.manager.j.a(this.b.l.classicCard.imageUrl);
    }
    
    @Override
    public int a() {
        if (this.b.F()) {
            return 11;
        }
        return 4;
    }
    
    @Override
    public ag a(final View view) {
        return new n(this.a(), view);
    }
    
    public void a(final ag ag) {
        final n n = (n)ag;
        n.a.setMute(true);
        n.e.setVisibility(8);
        if (this.b.L()) {
            n.f.setVisibility(8);
        }
        else {
            n.f.setVisibility(0);
        }
        n.a.setVisibility(0);
        n.b.setVisibility(8);
        n.c.setVisibility(8);
        n.b.a((k)null, true);
        if (this.d == null) {
            this.d = new m(n.a);
            this.a.a(this.d);
        }
        else {
            this.d.a(n.a);
        }
        n.a.setOnPreparedListener((MediaPlayer$OnPreparedListener)this.d);
    }
    
    public void a(final ag ag, final boolean mute) {
        final n n = (n)ag;
        n.a.setMute(mute);
        if (mute) {
            n.e.setVisibility(8);
            n.f.setVisibility(0);
            return;
        }
        n.f.setVisibility(8);
        n.e.setVisibility(0);
    }
    
    public void a(final n n) {
        n.a.setVisibility(8);
        n.b.setVisibility(0);
        n.c.setVisibility(0);
        n.e.setVisibility(8);
        n.f.setVisibility(8);
        n.b.a(this.c, true);
    }
    
    public void a(final ao ao) {
        ao.b(this.a.a());
    }
    
    public void a(final boolean b) {
        if (this.d != null) {
            this.d.a(b);
        }
    }
    
    public boolean a(final Context context, final NetworkQuality networkQuality) {
        return networkQuality.compareTo(NetworkQuality.c) >= 0 && !bh.a(context).c();
    }
    
    @Override
    public String b() {
        if (this.a() == 11) {
            return "TYPE_VINE";
        }
        return "TYPE_PLAYER";
    }
    
    public boolean b(final ag ag) {
        final n n = (n)ag;
        if (n.a.b()) {
            n.a.start();
            return true;
        }
        n.a.pause();
        return false;
    }
}
