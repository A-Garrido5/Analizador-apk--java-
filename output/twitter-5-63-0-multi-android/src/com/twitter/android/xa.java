// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import com.twitter.library.scribe.ScribeLog;
import com.twitter.library.widget.ag;
import com.twitter.library.view.TweetActionType;
import com.twitter.library.api.UrlEntity;
import com.twitter.library.media.util.l;
import com.twitter.library.api.TweetClassicCard;
import java.util.List;
import com.twitter.library.api.MediaTag;
import android.content.ActivityNotFoundException;
import android.widget.Toast;
import android.net.Uri;
import com.twitter.android.client.bh;
import com.twitter.library.api.PromotedEvent;
import com.twitter.library.scribe.ScribeItem;
import com.twitter.library.api.MediaEntity;
import com.twitter.library.api.PromotedContent;
import com.twitter.android.util.aa;
import com.twitter.library.util.bo;
import com.twitter.library.featureswitch.d;
import com.twitter.library.scribe.TwitterScribeItem;
import com.twitter.library.widget.TweetView;
import android.net.Uri$Builder;
import android.os.Parcelable;
import java.io.Serializable;
import android.content.Intent;
import com.twitter.library.media.model.MediaDescriptor;
import java.util.ArrayList;
import com.twitter.android.card.w;
import com.twitter.library.scribe.ScribeAssociation;
import com.twitter.library.scribe.TwitterScribeLog;
import com.twitter.library.api.TwitterStatusCard;
import com.twitter.library.provider.Tweet;
import com.twitter.library.client.as;
import android.support.v4.app.FragmentActivity;
import android.app.Activity;
import android.support.v4.app.Fragment;
import com.twitter.library.client.Session;
import com.twitter.library.scribe.TwitterScribeAssociation;
import com.twitter.library.client.az;
import com.twitter.android.client.c;
import android.content.Context;
import java.lang.ref.WeakReference;
import com.twitter.library.view.b;

public class xa extends b
{
    private boolean a;
    protected final WeakReference b;
    protected final Context c;
    protected final c d;
    protected final az e;
    protected final TwitterScribeAssociation f;
    protected final String g;
    protected final String h;
    protected final String i;
    protected final String j;
    protected final oy k;
    protected final ul l;
    protected Session m;
    protected TwitterScribeAssociation n;
    private String o;
    private final gq p;
    private final wl q;
    
    public xa(final Context context, final Fragment fragment, final c d, final az e, final wl q, final ul l, final TwitterScribeAssociation f, final String o, final String g, final String h, final String i, final String j, final oy k) {
        this.o = null;
        final FragmentActivity activity = fragment.getActivity();
        this.b = new WeakReference((T)fragment);
        this.d = d;
        this.e = e;
        this.f = f;
        this.a = true;
        this.o = o;
        this.g = g;
        this.h = h;
        this.i = i;
        this.j = j;
        this.k = k;
        this.m = this.e.b();
        this.l = l;
        this.c = context.getApplicationContext();
        this.p = new gq(activity, this.d, this.m, this.o, h, this.f);
        this.q = q;
    }
    
    public xa(final Fragment fragment, final TwitterScribeAssociation twitterScribeAssociation, final String s, final String s2) {
        this(fragment, twitterScribeAssociation, null, s, s2, "tweet:::platform_photo_card:click", "tweet:::platform_player_card:click");
    }
    
    public xa(final Fragment fragment, final TwitterScribeAssociation twitterScribeAssociation, final String s, final String s2, final String s3, final String s4, final String s5) {
        this(fragment, twitterScribeAssociation, s, s2, s3, s4, s5, null, new ul(fragment, twitterScribeAssociation));
    }
    
    public xa(final Fragment fragment, final TwitterScribeAssociation twitterScribeAssociation, final String s, final String s2, final String s3, final String s4, final String s5, final oy oy) {
        this(fragment, twitterScribeAssociation, s, s2, s3, s4, s5, oy, new ul(fragment, twitterScribeAssociation));
    }
    
    public xa(final Fragment fragment, final TwitterScribeAssociation twitterScribeAssociation, final String s, final String s2, final String s3, final String s4, final String s5, final oy oy, final ul ul) {
        this((Context)fragment.getActivity(), fragment, com.twitter.android.client.c.a((Context)fragment.getActivity()), az.a((Context)fragment.getActivity()), new wp(fragment.getActivity().getApplicationContext(), as.a((Context)fragment.getActivity()), az.a((Context)fragment.getActivity())), ul, twitterScribeAssociation, s, s2, s3, s4, s5, oy);
    }
    
    public xa(final Fragment fragment, final TwitterScribeAssociation twitterScribeAssociation, final String s, final String s2, final String s3, final String s4, final String s5, final ul ul) {
        this(fragment, twitterScribeAssociation, s, s2, s3, s4, s5, null, ul);
    }
    
    public static String a(final Tweet tweet) {
        final TwitterStatusCard l = tweet.l;
        String g = null;
        if (l != null) {
            g = tweet.l.cardInstanceData.g();
        }
        return g;
    }
    
    private String a(final Tweet tweet, final String s, final String s2) {
        return TwitterScribeLog.a(this.f, Tweet.b(tweet), s, s2);
    }
    
    private void a(final Fragment fragment, final Tweet tweet, final String s, final String s2, final String s3) {
        if (this.m != null) {
            this.d.a(((TwitterScribeLog)((TwitterScribeLog)new TwitterScribeLog(this.m.g()).a(this.c, tweet, this.f, null).b(new String[] { this.a(tweet, "platform_animated_gif_card", "click") })).a(this.f)).e(this.o));
        }
        if (!w.c()) {
            final FragmentActivity activity = fragment.getActivity();
            final ArrayList<MediaDescriptor> list = new ArrayList<MediaDescriptor>();
            if (s3 != null) {
                list.add(new MediaDescriptor(s3, true));
            }
            final Intent intent = new Intent((Context)activity, (Class)MediaPlayerActivity.class);
            intent.putExtra("image_url", s2).putExtra("aud", false).putExtra("is_looping", true).putExtra("simple_controls", true).putExtra("player_url", s).putExtra("player_stream_urls", (Serializable)list).putExtra("tweet", (Parcelable)tweet).putExtra("video_position", 0).putExtra("video_index", 0);
            activity.startActivity(intent);
            return;
        }
        fragment.startActivityForResult(new Intent((Context)fragment.getActivity(), (Class)TweetActivity.class).setData(new Uri$Builder().scheme("twitter").authority("tweet").appendQueryParameter("status_id", String.valueOf(tweet.Q)).build()).putExtra("association", (Parcelable)this.f), 3);
    }
    
    private void a(final Tweet tweet, final Intent intent) {
        if (tweet.G.b()) {
            intent.putExtra("photo_impression", "photo_with_link:impression");
        }
    }
    
    protected TwitterScribeItem a(final TweetView tweetView) {
        if (tweetView != null) {
            return tweetView.getScribeItem();
        }
        return null;
    }
    
    String a(final String s) {
        return com.twitter.library.featureswitch.d.a(s);
    }
    
    protected void a(final int n) {
        final Fragment fragment = (Fragment)this.b.get();
        if (fragment != null) {
            final FragmentActivity activity = fragment.getActivity();
            if (activity != null && bo.b) {
                aa.a((Context)activity).a(n);
            }
        }
    }
    
    public void a(final long n, final long n2, final String s, final PromotedContent promotedContent, final Tweet tweet, final boolean b) {
        final Fragment fragment = (Fragment)this.b.get();
        if (fragment != null) {
            final FragmentActivity activity = fragment.getActivity();
            if (activity != null) {
                String s2;
                if (this.g != null) {
                    s2 = this.g;
                }
                else {
                    String s3;
                    if (b) {
                        s3 = "avatar";
                    }
                    else {
                        s3 = "screen_name";
                    }
                    s2 = this.a(tweet, s3, "profile_click");
                }
                this.d.a(((TwitterScribeLog)((TwitterScribeLog)new TwitterScribeLog(this.m.g()).a(this.c, tweet, this.f, null).a(n2, promotedContent, null).b(new String[] { s2 })).a(this.f)).e(this.o));
                TwitterScribeAssociation twitterScribeAssociation;
                if (this.n != null) {
                    twitterScribeAssociation = (TwitterScribeAssociation)((TwitterScribeAssociation)new TwitterScribeAssociation(this.n).a(1)).a(n);
                }
                else if (this.f != null) {
                    twitterScribeAssociation = (TwitterScribeAssociation)((TwitterScribeAssociation)new TwitterScribeAssociation(this.f).a(1)).a(n);
                }
                else {
                    twitterScribeAssociation = null;
                }
                ProfileActivity.a((Context)activity, n2, s, promotedContent, twitterScribeAssociation);
            }
        }
    }
    
    @Override
    public void a(final long n, final long n2, final String s, final PromotedContent promotedContent, final TweetView tweetView, final boolean b) {
        this.a(n, n2, s, promotedContent, tweetView.getTweet(), b);
    }
    
    public void a(final Fragment fragment, final Tweet tweet, final MediaEntity mediaEntity) {
        this.a(fragment, tweet, mediaEntity, false);
    }
    
    public void a(final Fragment fragment, final Tweet tweet, final MediaEntity mediaEntity, final TwitterScribeItem twitterScribeItem) {
        if (this.m != null) {
            String s;
            if (this.i != null) {
                s = this.i;
            }
            else {
                s = this.a(tweet, "platform_photo_card", "click");
            }
            this.d.a(((TwitterScribeLog)((TwitterScribeLog)((TwitterScribeLog)new TwitterScribeLog(this.m.g()).a(this.c, tweet, this.f, null).b(new String[] { s })).a(this.f)).a(twitterScribeItem)).e(this.o));
        }
        if (tweet != null && tweet.j != null) {
            this.q.a(wm.a(PromotedEvent.p, tweet.j).a());
        }
        this.a(fragment, tweet, mediaEntity);
    }
    
    public void a(final Fragment fragment, final Tweet tweet, final MediaEntity mediaEntity, final boolean b) {
        final Intent putExtra = new Intent((Context)fragment.getActivity(), (Class)GalleryActivity.class).putExtra("etc", this.a).putExtra("association", (Parcelable)this.f);
        if (this.f != null) {
            final String a = this.f.a();
            if ("home".equals(a)) {
                putExtra.putExtra("context", 4);
            }
            else if ("tweet".equals(a)) {
                putExtra.putExtra("context", 5);
            }
            else if ("profile_tweets".equals(a)) {
                putExtra.putExtra("context", 6);
            }
            else if ("list".equals(a)) {
                putExtra.putExtra("context", 7);
            }
            else if ("favorites".equals(a)) {
                putExtra.putExtra("context", 8);
            }
            else if ("network_activity".equals(a)) {
                putExtra.putExtra("context", 9);
            }
            else if ("profile".equals(a) || "me".equals(a)) {
                putExtra.putExtra("context", 11);
                putExtra.putExtra("association", (Parcelable)this.f);
            }
        }
        if (this.k != null) {
            putExtra.setData(this.k.a).putExtra("prj", this.k.b).putExtra("sel", this.k.c).putExtra("selArgs", this.k.d).putExtra("orderBy", this.k.e).putExtra("id", tweet.Q).putExtra("controls", false);
        }
        else {
            final String a2 = this.a("pic_plus_link_3106");
            putExtra.putExtra("tw", (Parcelable)tweet);
            switch (a2) {
                default: {
                    putExtra.putExtra("show_tw", false);
                    break;
                }
                case "pic_plus_link_variation_1": {
                    putExtra.putExtra("tw_link", 1);
                    this.a(tweet, putExtra);
                    break;
                }
                case "pic_plus_link_variation_2": {
                    putExtra.putExtra("tw_link", 3);
                    this.a(tweet, putExtra);
                    break;
                }
                case "pic_plus_link_variation_3": {
                    putExtra.putExtra("tw_link", 5);
                    this.a(tweet, putExtra);
                    break;
                }
                case "pic_plus_link_variation_4": {
                    putExtra.putExtra("show_tw", false);
                    putExtra.putExtra("tw_link", 4);
                    this.a(tweet, putExtra);
                    break;
                }
            }
            if (mediaEntity != null) {
                putExtra.putExtra("media", (Serializable)mediaEntity);
            }
            if (b) {
                putExtra.putExtra("tagged_user_list", true);
            }
        }
        fragment.startActivityForResult(putExtra, 1);
    }
    
    public void a(final Fragment fragment, final Tweet tweet, final String s, final String s2, final String s3, final boolean b, final boolean b2, final boolean b3, final boolean b4) {
        final ArrayList<MediaDescriptor> list = new ArrayList<MediaDescriptor>();
        if (s2 != null) {
            list.add(new MediaDescriptor(s2, true));
        }
        this.a(fragment, tweet, s, list, s3, b, b2, b3, 0, 0, b4);
    }
    
    public void a(final Fragment fragment, final Tweet tweet, final String s, final ArrayList list, final String s2, final boolean b, final boolean b2, final boolean b3, final int n, final int n2, final boolean b4) {
        if (this.m != null) {
            String s3;
            if (b4) {
                s3 = "platform_forward_player_card";
            }
            else {
                s3 = "platform_player_card";
            }
            String s4;
            if (this.j != null) {
                s4 = this.j;
            }
            else {
                s4 = this.a(tweet, s3, "click");
            }
            this.d.a(((TwitterScribeLog)((TwitterScribeLog)new TwitterScribeLog(this.m.g()).a(this.c, tweet, this.f, null).b(new String[] { s4 })).a(this.f)).e(this.o));
        }
        if (tweet != null && tweet.j != null) {
            this.d.a(PromotedEvent.p, tweet.j);
        }
        if (list != null && list.size() > 0) {
            if (tweet.H()) {
                new a().a(this.f).a(s).a(tweet).a(5).d(bh.a((Context)fragment.getActivity()).i()).a((Context)fragment.getActivity());
                return;
            }
            final Intent intent = new Intent((Context)fragment.getActivity(), (Class)MediaPlayerActivity.class);
            intent.putExtra("image_url", s2).putExtra("aud", b).putExtra("is_looping", b2).putExtra("simple_controls", b3).putExtra("player_url", s).putExtra("player_stream_urls", (Serializable)list).putExtra("tweet", (Parcelable)tweet).putExtra("video_position", n2).putExtra("video_index", n).putExtra("association", (Parcelable)this.f).putExtra("amplify", tweet.H());
            fragment.startActivityForResult(intent, 5);
        }
        else {
            try {
                fragment.startActivity(new Intent("android.intent.action.VIEW").setData(Uri.parse(s)));
            }
            catch (ActivityNotFoundException ex) {
                Toast.makeText((Context)fragment.getActivity(), 2131298033, 0).show();
            }
        }
    }
    
    public void a(final Fragment fragment, final Tweet tweet, final boolean b) {
        this.p.a(fragment.getActivity(), tweet, b, this.f);
    }
    
    public void a(final Session m) {
        this.m = m;
    }
    
    @Override
    public void a(final Tweet tweet, final long n, final TweetView tweetView) {
        final Fragment fragment = (Fragment)this.b.get();
        if (fragment != null) {
            final FragmentActivity activity = fragment.getActivity();
            if (activity != null) {
                final TwitterScribeItem a = this.a(tweetView);
                if (this.m != null) {
                    this.d.a(((TwitterScribeLog)((TwitterScribeLog)((TwitterScribeLog)new TwitterScribeLog(this.m.g()).a(this.c, tweet, this.f, null).b(new String[] { this.a(tweet, "media_tag_summary", "click") })).a(this.f)).a(a)).e(this.o));
                }
                final MediaEntity a2 = tweet.G.media.a(n);
                if (a2 != null) {
                    final List tags = a2.tags;
                    if (tags.size() == 1 && tweetView == null) {
                        if (tweet.j != null) {
                            this.d.a(PromotedEvent.f, tweet.j);
                        }
                        fragment.startActivity(new Intent((Context)activity, (Class)ProfileActivity.class).putExtra("screen_name", tags.get(0).screenName));
                        return;
                    }
                    this.a(fragment, tweet, a2, tweetView == null);
                }
            }
        }
    }
    
    @Override
    public void a(final Tweet tweet, final MediaEntity mediaEntity, final TweetView tweetView) {
        final Fragment fragment = (Fragment)this.b.get();
        if (fragment != null && fragment.getActivity() != null) {
            this.a(fragment, tweet, mediaEntity, this.a(tweetView));
        }
    }
    
    @Override
    public void a(final Tweet tweet, final TweetClassicCard tweetClassicCard, final TweetView tweetView) {
        final Fragment fragment = (Fragment)this.b.get();
        if (fragment == null || fragment.getActivity() == null) {
            return;
        }
        switch (tweetClassicCard.type) {
            default: {}
            case 1: {
                this.a(fragment, tweet, null, this.a(tweetView));
            }
            case 2: {
                if (tweet.H()) {
                    this.a(fragment, tweet, true);
                    return;
                }
                if (tweet.L()) {
                    this.a(fragment, tweet, tweetClassicCard.playerUrl, tweetClassicCard.imageUrl, tweetClassicCard.playerStreamUrl);
                    return;
                }
                this.a(fragment, tweet, tweetClassicCard.playerUrl, tweetClassicCard.playerStreamUrl, com.twitter.library.media.util.l.a(tweetClassicCard).a().a(), tweetClassicCard.playerType == 2, false, false, true);
            }
        }
    }
    
    @Override
    public void a(final Tweet tweet, final UrlEntity urlEntity) {
        this.p.a(tweet, urlEntity, this.h, this.f);
    }
    
    public void a(final Tweet tweet, final UrlEntity urlEntity, final String s) {
        this.p.a(tweet, urlEntity, s, this.f);
    }
    
    public void a(final TwitterScribeAssociation n) {
        this.n = n;
    }
    
    @Override
    public void a(final TweetActionType tweetActionType, final TweetView tweetView) {
        if (this.l != null) {
            this.l.a(tweetActionType, tweetView.getTweet(), tweetView.getFriendshipCache(), this.a(tweetView), tweetView);
        }
    }
    
    public void a(final boolean a) {
        this.a = a;
    }
    
    public boolean a() {
        return this.k != null && this.k.c != null;
    }
    
    @Override
    public void b(final Tweet tweet, final UrlEntity urlEntity) {
        final TwitterScribeAssociation f = this.f;
        this.d.a(((TwitterScribeLog)new TwitterScribeLog(this.m.g()).a(this.c, tweet, f, null).b(new String[] { ScribeLog.a(f.a(), f.b(), ":attribution:open_link") })).a(f));
        this.a(tweet, urlEntity);
    }
    
    @Override
    public void b(final Tweet tweet, final TweetView tweetView) {
        final Fragment fragment = (Fragment)this.b.get();
        if (fragment != null) {
            this.a(fragment, tweet, true);
        }
    }
    
    @Override
    public void b(final TweetActionType tweetActionType, final TweetView tweetView) {
        if (this.l != null) {
            if (tweetActionType == TweetActionType.c) {
                this.a(2);
            }
            else {
                if (tweetActionType == TweetActionType.d) {
                    this.a(0);
                    return;
                }
                this.a(2);
            }
        }
    }
    
    @Override
    public boolean b(final Tweet tweet) {
        return this.l != null && tweet != null && tweet.I != null && this.l.b(tweet);
    }
    
    @Override
    public void c(final Tweet tweet, final TweetView tweetView) {
        final Fragment fragment = (Fragment)this.b.get();
        if (fragment != null && tweet != null && this.l != null) {
            final FragmentActivity activity = fragment.getActivity();
            if (activity != null) {
                long g;
                if (this.m == null) {
                    g = 0L;
                }
                else {
                    g = this.m.g();
                }
                this.d.a(((TwitterScribeLog)((TwitterScribeLog)((TwitterScribeLog)new TwitterScribeLog(g).a(null, tweet, this.f, null).b(new String[] { this.a(tweet, "quoted_tweet", "click") })).a(this.f)).a(this.a(tweetView))).e(this.o));
                this.l.a(tweet.J, activity);
            }
        }
    }
}
