// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.highlights;

import com.twitter.library.api.timeline.a;
import com.twitter.library.service.z;
import com.twitter.library.service.y;
import com.twitter.library.api.timeline.l;
import com.twitter.library.api.timeline.f;
import com.twitter.library.client.as;
import com.twitter.library.scribe.ScribeLog;
import com.twitter.library.scribe.TwitterScribeAssociation;
import com.twitter.library.scribe.TwitterScribeLog;
import com.twitter.android.client.c;
import android.support.v4.app.Fragment;
import com.twitter.android.qd;
import android.support.v4.app.FragmentActivity;
import com.twitter.library.util.aj;
import com.twitter.library.scribe.ScribeItem;
import android.content.Context;
import com.twitter.library.widget.CompoundDrawableAnimButton;
import android.widget.Toast;
import com.twitter.library.provider.Tweet;
import com.twitter.library.client.Session;
import com.twitter.android.qg;

class ad implements qg
{
    final /* synthetic */ ac a;
    private Session b;
    
    ad(final ac a) {
        this.a = a;
    }
    
    @Override
    public void a() {
        this.a(this.b, "retweet_dialog", "tweet", "share_via_dm");
    }
    
    @Override
    public void a(final long n, final Tweet tweet, final boolean b) {
        final Session b2 = this.b;
        String s;
        if (b) {
            s = "unretweet";
        }
        else {
            s = "retweet";
        }
        this.a(b2, "story", "tweet", s);
        this.a.a(b);
        this.a.c = true;
    }
    
    @Override
    public void a(final long n, final boolean b, final boolean b2, final boolean b3) {
        if (!b && !b3) {
            this.a.a(!b2);
            this.a.c = false;
            int n2;
            if (b2) {
                n2 = 2131297995;
            }
            else {
                n2 = 2131298005;
            }
            Toast.makeText(this.a.d, n2, 1).show();
        }
    }
    
    public void a(final Session b) {
        this.b = b;
    }
    
    protected void a(final Session session, final String s, final String s2, final String s3) {
        this.a.a(session, s, s2, s3);
    }
    
    @Override
    public void b(final long n, final Tweet tweet, final boolean b) {
        this.a(this.b, "story", "tweet", "quote");
    }
    
    @Override
    public void c(final long n, final Tweet tweet, final boolean b) {
        this.a(this.b, "retweet_dialog", null, "dismiss");
    }
    
    @Override
    public void d(final long n, final Tweet tweet, final boolean b) {
        this.a(this.b, "retweet_dialog", null, "impression");
    }
}
