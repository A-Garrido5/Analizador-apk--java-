// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.widget.tweet.content;

import com.twitter.library.media.widget.TweetMediaView;
import android.view.View;
import com.twitter.library.media.widget.s;
import android.os.Bundle;
import android.content.res.Configuration;
import android.content.Context;
import com.twitter.library.media.widget.r;
import android.app.Activity;
import com.twitter.library.media.widget.AdaptiveTweetMediaView;
import com.twitter.library.provider.Tweet;

public class l implements d
{
    private Tweet a;
    private AdaptiveTweetMediaView b;
    private final Activity c;
    private final k d;
    private final r e;
    
    public l(final Activity c, final k d, final r e) {
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    protected AdaptiveTweetMediaView a(final Activity activity, final n n) {
        return new AdaptiveTweetMediaView((Context)activity);
    }
    
    @Override
    public void a() {
        if (this.b != null) {
            this.b.setFromMemoryOnly(false);
        }
    }
    
    @Override
    public void a(final Configuration configuration) {
    }
    
    @Override
    public void a(final Bundle bundle) {
        if (this.b != null) {
            this.b.b();
        }
    }
    
    public void a(final n n, final Bundle bundle) {
        this.a = n.a;
        final boolean b = this.a.K != null;
        final Activity c = this.c;
        if (this.b == null && c != null) {
            this.b = this.a(c, n);
            if (this.d != null) {
                this.b.setOnMediaClickListener(new m(this));
            }
        }
        com.twitter.library.widget.tweet.content.c.a(b, this.b, this.e, this.a, n.b, n.c);
    }
    
    @Override
    public void a(final boolean b) {
        if (this.b != null) {
            this.b.d(b);
        }
    }
    
    @Override
    public void ar_() {
    }
    
    @Override
    public void b() {
        if (this.b != null) {
            this.b.g();
        }
    }
    
    @Override
    public void b(final boolean b) {
        if (this.b != null) {
            this.b.e(b);
        }
    }
    
    @Override
    public View d() {
        return (View)this.b;
    }
    
    public TweetMediaView g() {
        return this.b;
    }
}
