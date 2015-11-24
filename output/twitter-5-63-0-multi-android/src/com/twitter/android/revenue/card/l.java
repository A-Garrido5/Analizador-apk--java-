// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.revenue.card;

import android.view.View;
import com.twitter.library.provider.Tweet;
import android.os.Bundle;
import com.twitter.android.card.h;
import android.content.Context;
import com.twitter.android.card.v;
import com.twitter.android.card.g;
import com.twitter.android.card.t;
import com.twitter.library.scribe.TwitterScribeAssociation;
import com.twitter.library.widget.tweet.content.DisplayMode;
import android.app.Activity;
import com.twitter.android.nativecards.j;

public class l extends j
{
    private final k a;
    private aj b;
    
    public l(final Activity activity, final DisplayMode displayMode, final TwitterScribeAssociation twitterScribeAssociation, final TwitterScribeAssociation twitterScribeAssociation2, final t t, final g g, final k a) {
        super(activity, displayMode, twitterScribeAssociation, twitterScribeAssociation2, t, g);
        this.a = a;
    }
    
    public l(final Activity activity, final DisplayMode displayMode, final TwitterScribeAssociation twitterScribeAssociation, final TwitterScribeAssociation twitterScribeAssociation2, final k k) {
        this(activity, displayMode, twitterScribeAssociation, twitterScribeAssociation2, new v((Context)activity), new h(activity), k);
    }
    
    @Override
    public void a() {
        this.b.a();
    }
    
    @Override
    public void a(final Bundle bundle) {
        super.a(bundle);
        this.b.a(bundle);
    }
    
    @Override
    public void a(final vq vq, final Bundle bundle) {
        super.a(vq, bundle);
        if (this.b == null) {
            (this.b = this.a.b(this, this.E)).a(this.y, this.F);
        }
        this.b.a(vq, bundle);
    }
    
    public Tweet c() {
        return this.E;
    }
    
    @Override
    public View d() {
        return this.b.h();
    }
    
    public Context e() {
        return this.y;
    }
    
    public t f() {
        return this.B;
    }
    
    public g g() {
        return this.C;
    }
}
