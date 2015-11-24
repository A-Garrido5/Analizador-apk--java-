// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.card;

import android.net.Uri;
import com.twitter.library.util.an;
import com.twitter.android.GalleryActivity;
import java.util.ArrayList;
import com.twitter.android.composer.au;
import com.twitter.library.api.cb;
import com.twitter.library.api.UrlEntity;
import com.twitter.android.client.c;
import com.twitter.android.TweetActivity;
import com.twitter.android.client.bh;
import com.twitter.library.client.Session;
import android.os.Parcelable;
import java.io.Serializable;
import android.content.Intent;
import com.twitter.android.ProfileActivity;
import com.twitter.library.scribe.TwitterScribeAssociation;
import com.twitter.library.provider.Tweet;
import com.twitter.android.client.am;
import android.text.TextUtils;
import com.twitter.library.client.az;
import android.app.Activity;
import android.content.Context;
import java.lang.ref.WeakReference;

public class h implements g
{
    WeakReference a;
    private Context b;
    private final long c;
    
    public h(final Activity activity) {
        this.a = new WeakReference((T)activity);
        this.b = activity.getApplicationContext();
        this.c = az.a(this.b).b().g();
    }
    
    private boolean f(final String s) {
        if (TextUtils.isEmpty((CharSequence)s)) {
            return false;
        }
        final Activity activity = (Activity)this.a.get();
        if (activity == null) {
            return false;
        }
        am.a((Context)activity, s, this.c);
        return true;
    }
    
    @Override
    public void a(final long n, final Tweet tweet, final TwitterScribeAssociation twitterScribeAssociation) {
        final Activity activity = (Activity)this.a.get();
        if (activity == null) {
            return;
        }
        final Intent putExtra = new Intent((Context)activity, (Class)ProfileActivity.class).putExtra("user_id", n).putExtra("pc", (Serializable)tweet.j);
        if (twitterScribeAssociation != null) {
            putExtra.putExtra("association", (Parcelable)((TwitterScribeAssociation)new TwitterScribeAssociation(twitterScribeAssociation).a(1)).a(tweet.D));
        }
        activity.startActivity(putExtra);
    }
    
    @Override
    public void a(final Session session, final Tweet tweet, final String s, final boolean b) {
        final Activity activity = (Activity)this.a.get();
        if (activity == null) {
            return;
        }
        bh.a(this.b).a(activity, new j(this, session, b, tweet, s, activity));
    }
    
    @Override
    public void a(final Tweet tweet, final TwitterScribeAssociation twitterScribeAssociation) {
        final Activity activity = (Activity)this.a.get();
        if (activity == null) {
            return;
        }
        activity.startActivity(new Intent((Context)activity, (Class)TweetActivity.class).putExtra("tw", (Parcelable)tweet).putExtra("association", (Parcelable)twitterScribeAssociation));
    }
    
    @Override
    public void a(final TwitterScribeAssociation twitterScribeAssociation, final Tweet tweet, final String s) {
        final Activity activity = (Activity)this.a.get();
        if (activity == null) {
            return;
        }
        final long g = az.a(this.b).b().g();
        final c a = com.twitter.android.client.c.a(this.b);
        if (a != null && a.l()) {
            am.a((Context)activity, tweet, (UrlEntity)((cb)new cb().b(s)).f(), g, null, null, twitterScribeAssociation, null);
            return;
        }
        am.a((Context)activity, tweet, s, g, null, null, twitterScribeAssociation);
    }
    
    @Override
    public void a(final String s) {
        final Activity activity = (Activity)this.a.get();
        if (activity == null) {
            return;
        }
        au.a((Context)activity).a(s, null).a(az.a(this.b).b().e()).b((Context)activity);
    }
    
    @Override
    public void a(final String s, final Tweet tweet) {
        final Activity activity = (Activity)this.a.get();
        if (activity == null) {
            return;
        }
        am.a((Context)activity, s, this.c, tweet);
    }
    
    @Override
    public void a(final String s, final String s2) {
        final Activity activity = (Activity)this.a.get();
        if (activity == null) {
            return;
        }
        activity.startActivity(Intent.createChooser(new Intent("android.intent.action.SEND").setType("text/plain").putExtra("android.intent.extra.TEXT", s), (CharSequence)s2));
    }
    
    @Override
    public void a(final String s, final String s2, final String s3, final boolean b, final boolean b2, final Tweet tweet) {
        final Activity activity = (Activity)this.a.get();
        if (activity == null) {
            return;
        }
        bh.a(this.b).a(activity, new i(this, s2, activity, s3, b, b2, s, tweet));
    }
    
    @Override
    public void a(final ArrayList list, final int n, final TwitterScribeAssociation twitterScribeAssociation) {
        final Activity activity = (Activity)this.a.get();
        if (activity == null) {
            return;
        }
        activity.startActivityForResult(new Intent((Context)activity, (Class)GalleryActivity.class).putExtra("association", (Parcelable)twitterScribeAssociation).putExtra("li", (Serializable)list).putExtra("list_starting_index", n), 1);
    }
    
    @Override
    public boolean a(final um um, final String s) {
        String s2;
        if (um.c()) {
            s2 = um.b();
        }
        else {
            s2 = um.a();
        }
        return this.b(s2, s);
    }
    
    @Override
    public boolean b(final String s) {
        final String a = an.a(this.b, s);
        final boolean empty = this.b.getPackageManager().queryIntentActivities(new Intent("android.intent.action.VIEW", Uri.parse(a)), 0).isEmpty();
        boolean b = false;
        if (!empty) {
            final boolean f = this.f(a);
            b = false;
            if (f) {
                b = true;
            }
        }
        return b;
    }
    
    @Override
    public boolean b(final String s, final String s2) {
        final Activity activity = (Activity)this.a.get();
        if (activity == null) {
            return false;
        }
        if (this.c(s, s2) && this.f(s)) {
            return true;
        }
        if (!TextUtils.isEmpty((CharSequence)s2)) {
            final Intent launchIntentForPackage = this.b.getPackageManager().getLaunchIntentForPackage(s2);
            if (launchIntentForPackage != null) {
                activity.startActivity(launchIntentForPackage);
            }
        }
        return false;
    }
    
    @Override
    public boolean c(final String s) {
        return !TextUtils.isEmpty((CharSequence)s) && com.twitter.util.c.a(this.b, s);
    }
    
    @Override
    public boolean c(final String s, final String s2) {
        return !TextUtils.isEmpty((CharSequence)s2) && (TextUtils.isEmpty((CharSequence)s) || !this.b.getPackageManager().queryIntentActivities(new Intent("android.intent.action.VIEW", Uri.parse(s)), 0).isEmpty()) && com.twitter.util.c.a(this.b, s2);
    }
    
    public boolean d(final String s) {
        return !TextUtils.isEmpty((CharSequence)s) && this.f("tel:" + s);
    }
    
    public void e(final String s) {
        this.a(s, (Tweet)null);
    }
}
