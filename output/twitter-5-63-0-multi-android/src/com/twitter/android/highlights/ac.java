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
import com.twitter.android.qg;
import android.support.v4.app.Fragment;
import com.twitter.android.qd;
import com.twitter.library.client.Session;
import android.support.v4.app.FragmentActivity;
import com.twitter.library.util.aj;
import com.twitter.library.provider.Tweet;
import com.twitter.library.scribe.ScribeItem;
import android.content.Context;
import com.twitter.library.widget.CompoundDrawableAnimButton;

public class ac
{
    public final CompoundDrawableAnimButton a;
    public final CompoundDrawableAnimButton b;
    public boolean c;
    private final Context d;
    private final ScribeItem e;
    private Tweet f;
    private ad g;
    
    public ac(final Context context, final Tweet tweet, final CompoundDrawableAnimButton a, final CompoundDrawableAnimButton b, final ScribeItem e) {
        this.d = context.getApplicationContext();
        this.e = e;
        this.a = a;
        this.b = b;
        this.a(tweet);
        this.g = new ad(this);
    }
    
    private void a(final CompoundDrawableAnimButton compoundDrawableAnimButton, final int n) {
        if (n > 0) {
            compoundDrawableAnimButton.setText((CharSequence)aj.a(this.d.getResources(), n, true));
            return;
        }
        compoundDrawableAnimButton.setText((CharSequence)null);
    }
    
    private void a(final boolean b) {
        int h = 1;
        final Tweet f = this.f;
        final int p = this.f.p;
        int n;
        if (b) {
            n = -1;
        }
        else {
            n = h;
        }
        f.p = n + p;
        final Tweet f2 = this.f;
        if (b) {
            h = 0;
        }
        f2.h = (h != 0);
        this.a(this.b, this.f.p);
        this.b.setChecked(this.f.h);
    }
    
    public void a(final FragmentActivity fragmentActivity, final Session session) {
        this.g.a(session);
        qd.a(12, this.f, false, null, this.g, fragmentActivity);
    }
    
    void a(final Session session, final String s, final String s2, final String s3) {
        com.twitter.android.client.c.a(this.d).a(((TwitterScribeLog)StoriesActivity.a(session.g(), s, s2, s3).a(this.e)).a(this.d, this.f, null, null));
    }
    
    public void a(final as as, final Session session) {
        final boolean e = !this.f.e;
        this.a.toggle();
        this.a(as, session, e);
        String s;
        if (e) {
            s = "favorite";
        }
        else {
            s = "unfavorite";
        }
        this.a(session, "story", "tweet", s);
        final Tweet f = this.f;
        final int t = this.f.t;
        int n;
        if (e) {
            n = 1;
        }
        else {
            n = -1;
        }
        f.t = n + t;
        this.f.e = e;
        this.a(this.a, this.f.t);
        this.c = true;
    }
    
    protected void a(final as as, final Session session, final boolean b) {
        a a;
        if (b) {
            a = new f(this.d, session, this.f.Q, this.f.E).a(this.f.j);
        }
        else {
            a = new l(this.d, session, this.f.Q).a(this.f.j);
        }
        as.a(a, (z)null);
    }
    
    public void a(final Tweet f) {
        this.f = f;
        this.a.setChecked(this.f.e);
        this.a(this.a, this.f.t);
        this.b.setChecked(this.f.h);
        this.a(this.b, this.f.p);
    }
}
