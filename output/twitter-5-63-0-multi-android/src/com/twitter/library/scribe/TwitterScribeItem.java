// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.scribe;

import android.os.Parcelable;
import com.fasterxml.jackson.core.JsonGenerator;
import java.util.Iterator;
import com.twitter.library.card.property.ImageSpec;
import com.twitter.library.card.instance.UserValue;
import java.util.Map;
import com.twitter.library.card.instance.BindingValue;
import com.twitter.library.network.ae;
import com.twitter.library.card.instance.CardInstanceData;
import com.twitter.library.api.TwitterTopic;
import com.twitter.library.api.TimelineScribeContent;
import com.twitter.library.api.DiscoverStoryMetadata;
import com.twitter.util.c;
import android.text.TextUtils;
import com.twitter.library.api.TwitterStatusCard;
import com.twitter.library.provider.Tweet;
import com.twitter.library.media.util.q;
import com.twitter.internal.android.util.Size;
import com.twitter.library.api.QuotedTweetData;
import android.content.Context;
import com.twitter.library.api.PromotedContent;
import com.twitter.library.provider.af;
import com.twitter.util.h;
import android.os.Parcel;
import com.twitter.util.collection.CollectionUtils;
import java.util.HashMap;
import java.util.Set;
import android.os.Parcelable$Creator;

public class TwitterScribeItem extends ScribeItem
{
    public static final Parcelable$Creator CREATOR;
    private static final Set an;
    public String A;
    public String B;
    public String C;
    public HashMap D;
    public long E;
    public long F;
    public String G;
    public long H;
    public String I;
    public int J;
    public int K;
    public String L;
    public String M;
    public String N;
    public long O;
    public Boolean P;
    public String Q;
    public long R;
    public String S;
    public String T;
    public String U;
    public String V;
    public String W;
    public String X;
    public String Y;
    public int Z;
    public long a;
    public String aa;
    public String ab;
    public String ac;
    public long ad;
    public int ae;
    public int af;
    public int ag;
    public String ah;
    public long ai;
    public g aj;
    public ScribeGeoDetails ak;
    public HashMap al;
    public NativeCardEvent am;
    public String b;
    public int c;
    public long d;
    public String e;
    public String f;
    public int g;
    public int h;
    public int i;
    public boolean j;
    public String k;
    public String l;
    public int m;
    public String n;
    public String o;
    public String p;
    public String q;
    public String r;
    public boolean s;
    public String t;
    public String u;
    public String v;
    public String w;
    public String x;
    public String y;
    public int z;
    
    static {
        CREATOR = (Parcelable$Creator)new w();
        an = CollectionUtils.a("suggestion_type", "controller_data", "source_data");
    }
    
    public TwitterScribeItem() {
        this.a = -1L;
        this.c = -1;
        this.d = -1L;
        this.g = -1;
        this.h = -1;
        this.i = -1;
        this.m = -1;
        this.z = -1;
        this.D = new HashMap();
        this.E = -1L;
        this.F = -1L;
        this.H = -1L;
        this.J = -1;
        this.K = -1;
        this.O = -1L;
        this.R = -1L;
        this.Z = -1;
        this.ad = -1L;
        this.ae = -1;
        this.af = -1;
        this.ag = -1;
        this.ai = -1L;
        this.al = new HashMap();
    }
    
    public TwitterScribeItem(final Parcel parcel) {
        super(parcel);
        this.a = -1L;
        this.c = -1;
        this.d = -1L;
        this.g = -1;
        this.h = -1;
        this.i = -1;
        this.m = -1;
        this.z = -1;
        this.D = new HashMap();
        this.E = -1L;
        this.F = -1L;
        this.H = -1L;
        this.J = -1;
        this.K = -1;
        this.O = -1L;
        this.R = -1L;
        this.Z = -1;
        this.ad = -1L;
        this.ae = -1;
        this.af = -1;
        this.ag = -1;
        this.ai = -1L;
        this.al = new HashMap();
        this.a = parcel.readLong();
        this.b = parcel.readString();
        this.c = parcel.readInt();
        this.d = parcel.readLong();
        this.e = parcel.readString();
        this.f = parcel.readString();
        this.g = parcel.readInt();
        this.h = parcel.readInt();
        this.i = parcel.readInt();
        this.j = (parcel.readInt() == 1);
        this.k = parcel.readString();
        this.l = parcel.readString();
        this.m = parcel.readInt();
        this.n = parcel.readString();
        this.o = parcel.readString();
        this.p = parcel.readString();
        this.q = parcel.readString();
        this.r = parcel.readString();
        this.s = (parcel.readInt() == 1);
        this.t = parcel.readString();
        this.u = parcel.readString();
        this.v = parcel.readString();
        this.w = parcel.readString();
        this.x = parcel.readString();
        this.y = parcel.readString();
        this.z = parcel.readInt();
        this.B = parcel.readString();
        this.C = parcel.readString();
        this.A = parcel.readString();
        for (int int1 = parcel.readInt(), i = 0; i < int1; ++i) {
            this.D.put(parcel.readString(), parcel.readString());
        }
        this.E = parcel.readLong();
        this.F = parcel.readLong();
        this.J = parcel.readInt();
        this.G = parcel.readString();
        this.I = parcel.readString();
        this.H = parcel.readLong();
        this.K = parcel.readInt();
        this.L = parcel.readString();
        this.M = parcel.readString();
        this.N = parcel.readString();
        this.O = parcel.readLong();
        if (parcel.readByte() != 0) {
            this.aj = new g(parcel);
        }
        switch (parcel.readByte()) {
            default: {
                this.P = null;
                break;
            }
            case 0: {
                this.P = false;
                break;
            }
            case 1: {
                this.P = true;
                break;
            }
        }
        this.R = parcel.readLong();
        this.Q = parcel.readString();
        this.ak = (ScribeGeoDetails)parcel.readParcelable(ScribeGeoDetails.class.getClassLoader());
        this.S = parcel.readString();
        this.T = parcel.readString();
        this.U = parcel.readString();
        this.V = parcel.readString();
        this.W = parcel.readString();
        this.X = parcel.readString();
        this.Y = parcel.readString();
        this.Z = parcel.readInt();
        this.al = com.twitter.util.h.a(String.class, String.class, parcel);
        this.aa = parcel.readString();
        this.ab = parcel.readString();
        this.ac = parcel.readString();
        this.ad = parcel.readLong();
        this.am = (NativeCardEvent)parcel.readParcelable(NativeCardEvent.class.getClassLoader());
        this.ag = parcel.readInt();
        this.ah = parcel.readString();
        this.ai = parcel.readLong();
        this.ae = parcel.readInt();
        this.af = parcel.readInt();
    }
    
    public static TwitterScribeItem a() {
        final TwitterScribeItem twitterScribeItem = new TwitterScribeItem();
        twitterScribeItem.c = 16;
        twitterScribeItem.h = 0;
        twitterScribeItem.w = "single";
        return twitterScribeItem;
    }
    
    public static TwitterScribeItem a(final int n, final long n2, final long a) {
        final TwitterScribeItem twitterScribeItem = new TwitterScribeItem();
        String b = null;
        int c = 0;
        switch (n) {
            default: {
                b = null;
                c = -1;
                break;
            }
            case 18: {
                b = "magic_rec_tweet";
                c = 0;
                break;
            }
            case 20: {
                b = "magic_rec_tweet";
                c = 0;
                break;
            }
            case 19: {
                b = "magic_rec_user";
                c = 3;
                break;
            }
        }
        if (b != null) {
            twitterScribeItem.b = b;
        }
        if (n2 > 0L) {
            twitterScribeItem.A = Long.toString(n2);
        }
        if (a > 0L) {
            twitterScribeItem.a = a;
        }
        if (c > 0) {
            twitterScribeItem.c = c;
        }
        twitterScribeItem.y = af.b.get(n);
        return twitterScribeItem;
    }
    
    public static TwitterScribeItem a(final long a) {
        final TwitterScribeItem twitterScribeItem = new TwitterScribeItem();
        twitterScribeItem.c = 17;
        twitterScribeItem.a = a;
        twitterScribeItem.k = "commerce_collection";
        return twitterScribeItem;
    }
    
    public static TwitterScribeItem a(final long n, final PromotedContent promotedContent, final String s, final String s2) {
        return a(n, promotedContent, s, s2, -1);
    }
    
    public static TwitterScribeItem a(final long a, final PromotedContent promotedContent, final String k, final String w, final int g) {
        final TwitterScribeItem twitterScribeItem = new TwitterScribeItem();
        twitterScribeItem.a = a;
        twitterScribeItem.c = 3;
        twitterScribeItem.w = w;
        twitterScribeItem.g = g;
        if (promotedContent != null) {
            twitterScribeItem.e = promotedContent.impressionId;
            twitterScribeItem.f = promotedContent.disclosureType;
        }
        twitterScribeItem.k = k;
        return twitterScribeItem;
    }
    
    public static TwitterScribeItem a(final long a, final String b) {
        final TwitterScribeItem twitterScribeItem = new TwitterScribeItem();
        twitterScribeItem.a = a;
        twitterScribeItem.b = b;
        return twitterScribeItem;
    }
    
    public static TwitterScribeItem a(final long a, final String s, final int c, final int g) {
        final TwitterScribeItem twitterScribeItem = new TwitterScribeItem();
        twitterScribeItem.a = a;
        twitterScribeItem.b = s;
        twitterScribeItem.x = s;
        twitterScribeItem.c = c;
        twitterScribeItem.g = g;
        return twitterScribeItem;
    }
    
    public static TwitterScribeItem a(final Context context, final QuotedTweetData quotedTweetData) {
        final TwitterScribeItem twitterScribeItem = new TwitterScribeItem();
        twitterScribeItem.a = quotedTweetData.statusId;
        twitterScribeItem.c = 23;
        twitterScribeItem.w = "quoted_tweet";
        twitterScribeItem.aj = new g(q.d(quotedTweetData.entities.media, Size.a).size());
        if (quotedTweetData.cardInstanceData != null && vu.a().e(quotedTweetData.cardInstanceData)) {
            twitterScribeItem.a(quotedTweetData.cardInstanceData, context);
        }
        else if (q.c(quotedTweetData.entities.media, Size.a)) {
            twitterScribeItem.i = 2;
        }
        else if (q.d(quotedTweetData.entities.media)) {
            twitterScribeItem.i = 3;
        }
        else {
            twitterScribeItem.i = -1;
        }
        if (quotedTweetData.promotedContent != null) {
            final PromotedContent promotedContent = quotedTweetData.promotedContent;
            twitterScribeItem.e = promotedContent.impressionId;
            twitterScribeItem.f = promotedContent.disclosureType;
        }
        return twitterScribeItem;
    }
    
    public static TwitterScribeItem a(final Context context, final Tweet tweet, final TwitterScribeAssociation twitterScribeAssociation, final String w) {
        final TwitterScribeItem twitterScribeItem = new TwitterScribeItem();
        twitterScribeItem.a = tweet.D;
        twitterScribeItem.c = 0;
        twitterScribeItem.w = w;
        twitterScribeItem.aj = new g(q.d(tweet.R(), Size.a).size());
        final TwitterStatusCard l = tweet.l;
        if (l != null && l.cardInstanceData != null && vu.a().e(l.cardInstanceData)) {
            twitterScribeItem.a(l.cardInstanceData, context);
        }
        else if (tweet.d()) {
            twitterScribeItem.i = 2;
        }
        else if (tweet.e() || tweet.H()) {
            twitterScribeItem.i = 3;
        }
        else {
            twitterScribeItem.i = -1;
        }
        boolean j = false;
        Label_0148: {
            if (!tweet.n()) {
                final int i = twitterScribeItem.i;
                j = false;
                if (i == -1) {
                    break Label_0148;
                }
                j = false;
                if (twitterScribeAssociation == null) {
                    break Label_0148;
                }
                final boolean f = twitterScribeAssociation.f();
                j = false;
                if (!f) {
                    break Label_0148;
                }
            }
            j = true;
        }
        twitterScribeItem.j = j;
        if (tweet.g) {
            twitterScribeItem.d = tweet.E;
        }
        if (tweet.m()) {
            final PromotedContent k = tweet.j;
            twitterScribeItem.e = k.impressionId;
            twitterScribeItem.f = k.disclosureType;
        }
        twitterScribeItem.al = tweet.ao;
        return twitterScribeItem;
    }
    
    public static TwitterScribeItem a(final Context context, final Tweet tweet, final TwitterScribeAssociation twitterScribeAssociation, final String s, final int j, final String g, final String i, final long h, final boolean b, final Boolean p11, final Long n) {
        TwitterScribeItem a;
        if (tweet != null) {
            a = a(context, tweet, twitterScribeAssociation, s);
        }
        else {
            a = new TwitterScribeItem();
        }
        a.J = j;
        a.G = g;
        a.I = i;
        a.H = h;
        int k;
        if (b) {
            k = 1;
        }
        else {
            k = 0;
        }
        a.K = k;
        a.P = p11;
        long longValue;
        if (n != null) {
            longValue = n;
        }
        else {
            longValue = -1L;
        }
        a.R = longValue;
        TwitterScribeLog.a(tweet, a);
        return a;
    }
    
    public static TwitterScribeItem a(final Context context, final String l, final vc vc) {
        final TwitterScribeItem twitterScribeItem = new TwitterScribeItem();
        twitterScribeItem.c = 3;
        twitterScribeItem.l = l;
        twitterScribeItem.n = (String)vc.a("app_id", String.class);
        if (!TextUtils.isEmpty((CharSequence)twitterScribeItem.n) && context != null) {
            if (!c.a(context, twitterScribeItem.n)) {
                twitterScribeItem.m = 1;
                return twitterScribeItem;
            }
            twitterScribeItem.m = 2;
        }
        return twitterScribeItem;
    }
    
    public static TwitterScribeItem a(final DiscoverStoryMetadata discoverStoryMetadata) {
        final TwitterScribeItem twitterScribeItem = new TwitterScribeItem();
        if (discoverStoryMetadata != null) {
            twitterScribeItem.C = discoverStoryMetadata.a();
            twitterScribeItem.B = discoverStoryMetadata.b();
        }
        return twitterScribeItem;
    }
    
    public static TwitterScribeItem a(final TimelineScribeContent timelineScribeContent, final String y, final long a, final int c, final String b) {
        final TwitterScribeItem twitterScribeItem = new TwitterScribeItem();
        if (timelineScribeContent != null) {
            twitterScribeItem.A = timelineScribeContent.b();
            twitterScribeItem.C = timelineScribeContent.a();
            twitterScribeItem.B = timelineScribeContent.c();
        }
        if (y != null) {
            twitterScribeItem.y = y;
        }
        twitterScribeItem.c = c;
        if (b != null) {
            twitterScribeItem.b = b;
        }
        if (a > 0L) {
            twitterScribeItem.a = a;
        }
        return twitterScribeItem;
    }
    
    public static TwitterScribeItem a(final String b) {
        final TwitterScribeItem twitterScribeItem = new TwitterScribeItem();
        twitterScribeItem.b = b;
        twitterScribeItem.c = 3;
        return twitterScribeItem;
    }
    
    public static TwitterScribeItem a(final String b, final int n) {
        final TwitterScribeItem a = a();
        a.b = b;
        a.y = TwitterTopic.e(n);
        return a;
    }
    
    public static TwitterScribeItem a(final String s, final int n, final int n2) {
        return a(-1L, s, n, n2);
    }
    
    public static TwitterScribeItem a(final String b, final String w) {
        final TwitterScribeItem twitterScribeItem = new TwitterScribeItem();
        twitterScribeItem.b = b;
        twitterScribeItem.c = 12;
        twitterScribeItem.w = w;
        return twitterScribeItem;
    }
    
    public static TwitterScribeItem a(final String b, final String y, final int n) {
        final TwitterScribeItem twitterScribeItem = new TwitterScribeItem();
        if (y != null) {
            twitterScribeItem.y = y;
        }
        if (b != null) {
            twitterScribeItem.b = b;
            twitterScribeItem.c = 16;
        }
        if (n != -1) {
            twitterScribeItem.w = TwitterTopic.b(n);
        }
        return twitterScribeItem;
    }
    
    public static TwitterScribeItem a(final xa xa) {
        if (xa == null) {
            return null;
        }
        return c(xa.d);
    }
    
    private void a(final CardInstanceData cardInstanceData, final Context context) {
        this.i = 6;
        this.o = com.twitter.library.network.ae.a(context).a();
        this.l = cardInstanceData.name;
        this.p = cardInstanceData.audienceName;
        this.q = cardInstanceData.audienceBucket;
        this.r = cardInstanceData.forwardName;
        this.t = cardInstanceData.forwardAudienceName;
        this.u = cardInstanceData.url;
        this.v = cardInstanceData.forwardAudienceBucket;
        this.s = vu.a().a(cardInstanceData);
        final HashMap e = cardInstanceData.e();
        if (e != null) {
            final String n = (String)BindingValue.a(e.get("app_id"));
            this.n = n;
            if (!TextUtils.isEmpty((CharSequence)n) && context != null) {
                if (com.twitter.util.c.a(context, n)) {
                    this.m = 2;
                }
                else {
                    this.m = 1;
                }
            }
            final Iterator<Map.Entry<K, BindingValue>> iterator = e.entrySet().iterator();
            while (iterator.hasNext()) {
                final BindingValue bindingValue = iterator.next().getValue();
                if (bindingValue.scribeKey != null) {
                    if (bindingValue.value instanceof String) {
                        this.D.put(bindingValue.scribeKey, bindingValue.value);
                    }
                    else if (bindingValue.value instanceof UserValue) {
                        final String id = ((UserValue)bindingValue.value).id;
                        if (id == null) {
                            continue;
                        }
                        this.D.put(bindingValue.scribeKey, id);
                    }
                    else {
                        if (!(bindingValue.value instanceof ImageSpec)) {
                            continue;
                        }
                        final String url = ((ImageSpec)bindingValue.value).url;
                        if (url == null) {
                            continue;
                        }
                        this.D.put(bindingValue.scribeKey, url);
                    }
                }
            }
            final String u = (String)BindingValue.a(e.get("card_url"));
            if (!TextUtils.isEmpty((CharSequence)u)) {
                this.u = u;
            }
        }
    }
    
    public static TwitterScribeItem b() {
        final TwitterScribeItem twitterScribeItem = new TwitterScribeItem();
        twitterScribeItem.c = 19;
        twitterScribeItem.ak = new ScribeGeoDetails();
        return twitterScribeItem;
    }
    
    public static TwitterScribeItem b(final String b) {
        final TwitterScribeItem twitterScribeItem = new TwitterScribeItem();
        twitterScribeItem.b = b;
        return twitterScribeItem;
    }
    
    public static TwitterScribeItem b(final String b, final int n) {
        final TwitterScribeItem twitterScribeItem = new TwitterScribeItem();
        twitterScribeItem.c = 17;
        twitterScribeItem.b = b;
        if (n != -1) {
            twitterScribeItem.g = n + 1;
        }
        return twitterScribeItem;
    }
    
    public static TwitterScribeItem c(final String b) {
        if (b == null) {
            return null;
        }
        final TwitterScribeItem twitterScribeItem = new TwitterScribeItem();
        twitterScribeItem.b = b;
        return twitterScribeItem;
    }
    
    public static TwitterScribeItem d(final String b) {
        final TwitterScribeItem twitterScribeItem = new TwitterScribeItem();
        twitterScribeItem.b = b;
        return twitterScribeItem;
    }
    
    public void a(final int m) {
        if (this.m != -1) {
            this.m = m;
            if (this.am != null) {
                this.am.a(m);
            }
        }
    }
    
    public void a(final JsonGenerator jsonGenerator) {
        if (this.a != -1L) {
            jsonGenerator.a("id", this.a);
        }
        if (this.b != null) {
            jsonGenerator.a("name", this.b);
        }
        if (this.c != -1) {
            jsonGenerator.a("item_type", this.c);
        }
        if (this.e != null) {
            jsonGenerator.a("promoted_id", this.e);
        }
        if (this.f != null) {
            jsonGenerator.a("disclosure_type", this.f);
        }
        if (this.d != -1L) {
            jsonGenerator.a("retweeting_tweet_id", this.d);
        }
        if (this.g != -1) {
            jsonGenerator.a("position", this.g);
        }
        if (this.h != -1) {
            jsonGenerator.a("cursor", this.h);
        }
        if (this.i != -1) {
            jsonGenerator.a("card_type", this.i);
            jsonGenerator.a("pre_expanded", this.j);
            jsonGenerator.a("forward_card_pre_expanded", this.s);
        }
        if (this.k != null) {
            jsonGenerator.a("token", this.k);
        }
        if (this.l != null) {
            jsonGenerator.a("card_name", this.l);
        }
        if (this.m != -1) {
            jsonGenerator.a("publisher_app_install_status", this.m);
        }
        if (this.n != null) {
            jsonGenerator.a("publisher_app_id", this.n);
        }
        if (this.o != null) {
            jsonGenerator.a("card_platform_key", this.o);
        }
        if (this.p != null) {
            jsonGenerator.a("audience_name", this.p);
            if (this.q != null) {
                jsonGenerator.a("audience_bucket", this.q);
            }
        }
        if (this.r != null) {
            jsonGenerator.a("forward_card_name", this.r);
        }
        if (this.t != null) {
            jsonGenerator.a("forward_card_audience_name", this.t);
            if (this.v != null) {
                jsonGenerator.a("forward_card_audience_bucket", this.v);
            }
        }
        if (this.u != null) {
            jsonGenerator.a("card_url", this.u);
        }
        if (this.w != null) {
            jsonGenerator.a("description", this.w);
        }
        if (this.x != null) {
            jsonGenerator.a("item_query", this.x);
        }
        if (this.y != null) {
            jsonGenerator.a("entity_type", this.y);
        }
        if (this.z != -1) {
            jsonGenerator.a("tweet_count", this.z);
        }
        if (this.C != null) {
            jsonGenerator.a("story_source", this.C);
        }
        if (this.B != null) {
            jsonGenerator.a("story_type", this.B);
        }
        if (this.A != null) {
            jsonGenerator.a("impression_id", this.A);
        }
        for (final Map.Entry<String, V> entry : this.D.entrySet()) {
            jsonGenerator.a(entry.getKey(), (String)entry.getValue());
        }
        if (this.E != -1L) {
            jsonGenerator.a("visibility_start", this.E);
        }
        if (this.F != -1L) {
            jsonGenerator.a("visibility_end", this.F);
        }
        if (this.J != -1) {
            jsonGenerator.a("video_index", this.J);
        }
        if (this.G != null) {
            jsonGenerator.a("video_uuid", this.G);
        }
        if (this.I != null) {
            jsonGenerator.a("video_type", this.I);
        }
        if (this.H != -1L) {
            jsonGenerator.a("video_owner_id", this.H);
        }
        if (this.K != -1) {
            jsonGenerator.a("video_is_muted", this.K == 1);
        }
        if (this.L != null) {
            jsonGenerator.a("error_message", this.L);
        }
        if (this.M != null) {
            jsonGenerator.a("content_id", this.M);
        }
        if (this.N != null) {
            jsonGenerator.a("playlist_url", this.N);
        }
        if (this.O != -1L) {
            jsonGenerator.a("playback_lapse_ms", this.O);
        }
        if (this.P != null) {
            jsonGenerator.a("is_replay", this.P);
        }
        if (this.Q != null) {
            jsonGenerator.a("connection_type", this.Q);
        }
        if (this.R != -1L) {
            jsonGenerator.a("latency", this.R);
        }
        if (this.aj != null) {
            jsonGenerator.a("media_details");
            this.aj.a(jsonGenerator);
        }
        if (this.ak != null) {
            jsonGenerator.a("geo_details");
            this.ak.a(jsonGenerator);
        }
        if (this.S != null) {
            jsonGenerator.a("artist_name", this.S);
        }
        if (this.T != null) {
            jsonGenerator.a("integration_partner", this.T);
        }
        if (this.U != null) {
            jsonGenerator.a("card_title", this.U);
        }
        if (this.V != null) {
            jsonGenerator.a("image_url", this.V);
        }
        if (this.W != null) {
            jsonGenerator.a("artist_handle", this.W);
        }
        if (this.X != null) {
            jsonGenerator.a("playlist_uuid", this.X);
        }
        if (this.Y != null) {
            jsonGenerator.a("track_uuid", this.Y);
        }
        if (this.Z != -1) {
            jsonGenerator.a("track_index", this.Z);
        }
        if (this.aa != null) {
            jsonGenerator.a("cta_url", this.aa);
        }
        if (this.ab != null) {
            jsonGenerator.a("play_store_id", this.ab);
        }
        if (this.ac != null) {
            jsonGenerator.a("play_store_name", this.ac);
        }
        if (this.ad != -1L) {
            jsonGenerator.a("publisher_id", this.ad);
        }
        if (this.ag != -1) {
            jsonGenerator.a("dynamic_preroll_type", this.ag);
        }
        if (this.ah != null) {
            jsonGenerator.a("preroll_uuid", this.ah);
        }
        if (this.ai != -1L) {
            jsonGenerator.a("preroll_owner_id", this.ai);
        }
        if (this.ae != -1) {
            jsonGenerator.a("player_mode", this.ae);
        }
        if (this.af != -1) {
            jsonGenerator.a("ad_position", this.af);
        }
        if (this.al != null) {
            final HashMap<String, Object> hashMap = new HashMap<String, Object>();
            for (final Map.Entry<Object, V> entry2 : this.al.entrySet()) {
                if (TwitterScribeItem.an.contains(entry2.getKey())) {
                    hashMap.put(entry2.getKey(), entry2.getValue());
                }
                else {
                    jsonGenerator.a(entry2.getKey(), (String)entry2.getValue());
                }
            }
            if (!hashMap.isEmpty()) {
                jsonGenerator.a("suggestion_details");
                jsonGenerator.c();
                for (final Map.Entry<String, V> entry3 : hashMap.entrySet()) {
                    jsonGenerator.a(entry3.getKey(), (String)entry3.getValue());
                }
                jsonGenerator.d();
            }
        }
        if (this.am != null) {
            jsonGenerator.a("card_event");
            this.am.a(jsonGenerator);
        }
    }
    
    public int describeContents() {
        return 0;
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        if (this.a != -1L) {
            sb.append(this.a);
        }
        sb.append(",");
        if (this.b != null) {
            sb.append(this.b);
        }
        sb.append(",");
        if (this.c != -1) {
            sb.append(this.c);
        }
        sb.append(",");
        if (this.g != -1) {
            sb.append(this.g);
        }
        return sb.toString();
    }
    
    @Override
    public void writeToParcel(final Parcel parcel, final int n) {
        byte b = 1;
        super.writeToParcel(parcel, n);
        parcel.writeLong(this.a);
        parcel.writeString(this.b);
        parcel.writeInt(this.c);
        parcel.writeLong(this.d);
        parcel.writeString(this.e);
        parcel.writeString(this.f);
        parcel.writeInt(this.g);
        parcel.writeInt(this.h);
        parcel.writeInt(this.i);
        int n2;
        if (this.j) {
            n2 = b;
        }
        else {
            n2 = 0;
        }
        parcel.writeInt(n2);
        parcel.writeString(this.k);
        parcel.writeString(this.l);
        parcel.writeInt(this.m);
        parcel.writeString(this.n);
        parcel.writeString(this.o);
        parcel.writeString(this.p);
        parcel.writeString(this.q);
        parcel.writeString(this.r);
        int n3;
        if (this.s) {
            n3 = b;
        }
        else {
            n3 = 0;
        }
        parcel.writeInt(n3);
        parcel.writeString(this.t);
        parcel.writeString(this.u);
        parcel.writeString(this.v);
        parcel.writeString(this.w);
        parcel.writeString(this.x);
        parcel.writeString(this.y);
        parcel.writeInt(this.z);
        parcel.writeString(this.B);
        parcel.writeString(this.C);
        parcel.writeString(this.A);
        parcel.writeInt(this.D.size());
        for (final Map.Entry<String, V> entry : this.D.entrySet()) {
            parcel.writeString((String)entry.getKey());
            parcel.writeString((String)entry.getValue());
        }
        parcel.writeLong(this.E);
        parcel.writeLong(this.F);
        parcel.writeInt(this.J);
        parcel.writeString(this.G);
        parcel.writeString(this.I);
        parcel.writeLong(this.H);
        parcel.writeInt(this.K);
        parcel.writeString(this.L);
        parcel.writeString(this.M);
        parcel.writeString(this.N);
        parcel.writeLong(this.O);
        if (this.aj != null) {
            parcel.writeByte(b);
            this.aj.a(parcel);
        }
        else {
            parcel.writeByte((byte)0);
        }
        if (this.P != null) {
            if (!this.P) {
                b = 0;
            }
        }
        else {
            b = 2;
        }
        parcel.writeByte(b);
        parcel.writeLong(this.R);
        parcel.writeString(this.Q);
        parcel.writeParcelable((Parcelable)this.ak, n);
        parcel.writeString(this.S);
        parcel.writeString(this.T);
        parcel.writeString(this.U);
        parcel.writeString(this.V);
        parcel.writeString(this.W);
        parcel.writeString(this.X);
        parcel.writeString(this.Y);
        parcel.writeInt(this.Z);
        com.twitter.util.h.a(this.al, parcel);
        parcel.writeString(this.aa);
        parcel.writeString(this.ab);
        parcel.writeString(this.ac);
        parcel.writeLong(this.ad);
        parcel.writeParcelable((Parcelable)this.am, n);
        parcel.writeInt(this.ag);
        parcel.writeString(this.ah);
        parcel.writeLong(this.ai);
        parcel.writeInt(this.ae);
        parcel.writeInt(this.af);
    }
}
