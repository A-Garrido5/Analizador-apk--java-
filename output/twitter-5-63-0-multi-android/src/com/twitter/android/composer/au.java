// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.composer;

import java.io.ObjectInputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import com.twitter.library.provider.e;
import android.support.v4.app.Fragment;
import android.app.Activity;
import com.twitter.util.collection.CollectionUtils;
import java.util.List;
import com.twitter.library.provider.Tweet;
import com.twitter.library.provider.DraftTweet;
import com.twitter.library.api.geo.GeoTag;
import com.twitter.library.api.QuotedTweetData;
import java.io.Serializable;
import com.twitter.library.api.PromotedContent;
import android.net.Uri;
import android.os.Parcelable;
import android.text.TextUtils;
import android.content.Context;
import android.content.Intent;

public class au
{
    private Intent a;
    
    public au(final Intent a) {
        this.a = a;
    }
    
    public static au a(final Context context) {
        return new au(new Intent(context, (Class)ComposerActivity.class));
    }
    
    public static au a(final ComposerActivity composerActivity) {
        return new au(composerActivity.getIntent());
    }
    
    private static void a(final StringBuilder sb, final String s) {
        if (!TextUtils.isEmpty((CharSequence)s)) {
            if (sb.length() > 0) {
                sb.append(' ');
            }
            sb.append(s);
        }
    }
    
    public int a() {
        return this.a.getIntExtra("composer_mode", 0);
    }
    
    public au a(final int n) {
        this.a.putExtra("composer_mode", n);
        return this;
    }
    
    public au a(final long n) {
        this.a.putExtra("replied_tweet_id", n);
        return this;
    }
    
    public au a(final Intent intent) {
        this.a.putExtra("android.intent.extra.INTENT", (Parcelable)intent);
        return this;
    }
    
    public au a(final Uri data) {
        this.a.setData(data);
        return this;
    }
    
    public au a(final PromotedContent promotedContent) {
        if (promotedContent != null) {
            this.a.putExtra("pc", (Serializable)promotedContent);
            return this;
        }
        this.a.removeExtra("pc");
        return this;
    }
    
    public au a(final QuotedTweetData quotedTweetData) {
        if (quotedTweetData != null) {
            this.a.putExtra("quoted_tweet", (Serializable)quotedTweetData);
            return this;
        }
        this.a.removeExtra("quoted_tweet");
        return this;
    }
    
    public au a(final GeoTag geoTag) {
        this.a.putExtra("geo_tag", (Serializable)geoTag);
        return this;
    }
    
    public au a(final DraftTweet draftTweet) {
        return this.b(draftTweet.draftId).a(draftTweet.repliedTweetId).a(draftTweet.statusText, null).a(draftTweet.media).a(draftTweet.promotedContent).a(draftTweet.geoTag).a(draftTweet.quotedData).c(draftTweet.cardUrl);
    }
    
    public au a(final Tweet tweet) {
        this.a.putExtra("replied_tweet", (Parcelable)tweet);
        return this;
    }
    
    public au a(final String s) {
        this.a.putExtra("AbsFragmentActivity_account_name", s);
        return this;
    }
    
    public au a(final String s, final int[] array) {
        if (!TextUtils.isEmpty((CharSequence)s)) {
            this.a.putExtra("android.intent.extra.TEXT", s);
            this.a(array);
            return this;
        }
        this.a.removeExtra("android.intent.extra.TEXT");
        this.a((int[])null);
        return this;
    }
    
    public au a(final List list) {
        this.a.putExtra("media", CollectionUtils.b(list));
        return this;
    }
    
    public au a(final int[] array) {
        if (array != null && array.length == 2) {
            this.a.putExtra("selection", array);
            return this;
        }
        this.a.removeExtra("selection");
        return this;
    }
    
    public String a(final Context context, final boolean b) {
        if ("twitter".equals(this.a.getScheme())) {
            final Uri data = this.a.getData();
            String s = data.getQueryParameter("text");
            if (s == null) {
                s = data.getQueryParameter("message");
            }
            final String host = data.getHost();
            if ("post".equals(host)) {
                StringBuilder sb;
                if (s != null) {
                    sb = new StringBuilder(s);
                }
                else {
                    sb = new StringBuilder();
                }
                a(sb, data.getQueryParameter("url"));
                final String queryParameter = data.getQueryParameter("hashtags");
                if (queryParameter != null) {
                    final String[] split = queryParameter.split(",");
                    for (int length = split.length, i = 0; i < length; ++i) {
                        a(sb, "#" + split[i]);
                    }
                }
                final String queryParameter2 = data.getQueryParameter("via");
                if (queryParameter2 != null) {
                    a(sb, context.getString(2131297988, new Object[] { queryParameter2 }));
                }
                return sb.toString();
            }
            if ("quote".equals(host)) {
                return context.getString(2131298241, new Object[] { data.getQueryParameter("screen_name"), s });
            }
        }
        else {
            if (this.a.hasExtra("android.intent.extra.TEXT")) {
                return this.a.getStringExtra("android.intent.extra.TEXT");
            }
            if (!b) {
                final QuotedTweetData j = this.i();
                if (j != null) {
                    return context.getString(2131298241, new Object[] { j.userHandle, j.text });
                }
            }
        }
        return null;
    }
    
    public void a(final Activity activity, final int n) {
        activity.startActivityForResult(this.a, n);
    }
    
    public void a(final Fragment fragment) {
        fragment.startActivity(this.a);
    }
    
    public int b(final int n) {
        return this.a.getIntExtra("camera_mode", n);
    }
    
    public au b(final long n) {
        this.a.putExtra("draft_id", n);
        return this;
    }
    
    public au b(final Tweet tweet) {
        this.a(new QuotedTweetData(tweet));
        return this;
    }
    
    public au b(final String s) {
        this.a.putExtra("ref_event", s);
        return this;
    }
    
    public bb b() {
        final Class clazz = (Class)this.a.getSerializableExtra("tweet_uploader_class");
        if (clazz == null) {
            goto Label_0031;
        }
        try {
            return clazz.newInstance();
        }
        catch (IllegalAccessException ex) {}
        catch (InstantiationException ex2) {
            goto Label_0031;
        }
    }
    
    public DraftTweet b(final Context context, final boolean b) {
        final Tweet h = this.h();
        final e a = new e().a(this.j());
        long n;
        if (h != null) {
            n = h.D;
        }
        else {
            n = this.g();
        }
        final e a2 = a.b(n).a(this.a(context, b)).a(this.k());
        PromotedContent promotedContent;
        if (h != null) {
            promotedContent = h.j;
        }
        else {
            promotedContent = this.d();
        }
        return (DraftTweet)a2.a(promotedContent).a(this.e()).a(this.i()).b(this.n()).f();
    }
    
    public void b(final Context context) {
        context.startActivity(this.a);
    }
    
    public au c(final int flags) {
        this.a.setFlags(flags);
        return this;
    }
    
    public au c(final long n) {
        this.a.putExtra("card_host_id", n);
        return this;
    }
    
    public au c(final String s) {
        this.a.putExtra("card_url", s);
        return this;
    }
    
    public int[] c() {
        return this.a.getIntArrayExtra("selection");
    }
    
    public PromotedContent d() {
        return (PromotedContent)this.a.getSerializableExtra("pc");
    }
    
    public GeoTag e() {
        return (GeoTag)this.a.getSerializableExtra("geo_tag");
    }
    
    public String f() {
        return this.a.getStringExtra("AbsFragmentActivity_account_name");
    }
    
    public long g() {
        if ("twitter".equals(this.a.getScheme())) {
            final Uri data = this.a.getData();
            if ("post".equals(data.getHost())) {
                try {
                    return Long.parseLong(data.getQueryParameter("in_reply_to_status_id"));
                }
                catch (NumberFormatException ex) {}
            }
        }
        return this.a.getLongExtra("replied_tweet_id", 0L);
    }
    
    public Tweet h() {
        return (Tweet)this.a.getParcelableExtra("replied_tweet");
    }
    
    public QuotedTweetData i() {
        return (QuotedTweetData)this.a.getSerializableExtra("quoted_tweet");
    }
    
    public long j() {
        return this.a.getLongExtra("draft_id", 0L);
    }
    
    public List k() {
        return (List)this.a.getSerializableExtra("media");
    }
    
    public Uri l() {
        return (Uri)this.a.getParcelableExtra("android.intent.extra.STREAM");
    }
    
    public String m() {
        return this.a.getStringExtra("ref_event");
    }
    
    public String n() {
        return this.a.getStringExtra("card_url");
    }
    
    public long o() {
        return this.a.getLongExtra("card_host_id", 0L);
    }
    
    public Intent p() {
        final Intent a = this.a;
        this.a = null;
        return a;
    }
}
