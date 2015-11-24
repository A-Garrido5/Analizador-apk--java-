// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.provider;

import java.io.Serializable;
import com.twitter.util.collection.CollectionUtils;
import com.twitter.library.api.CardUser;
import java.util.Collection;
import java.util.ArrayList;
import java.util.Set;
import com.twitter.library.api.MediaTag;
import com.twitter.library.media.util.ag;
import com.twitter.library.api.MentionEntity;
import com.twitter.library.api.RepliedUser;
import java.util.LinkedHashSet;
import com.twitter.library.api.UrlEntity;
import com.twitter.library.api.HashtagEntity;
import com.twitter.library.view.e;
import java.util.LinkedList;
import com.twitter.library.card.Card;
import com.twitter.util.l;
import java.util.Map;
import com.twitter.library.api.EntityScribeContent;
import java.util.Iterator;
import com.twitter.util.collection.g;
import com.twitter.internal.android.util.Size;
import com.twitter.library.api.MediaEntity;
import com.twitter.library.featureswitch.d;
import com.twitter.library.api.TweetClassicCard;
import com.twitter.library.media.util.q;
import com.twitter.library.card.instance.CardInstanceData;
import com.twitter.util.k;
import com.twitter.util.h;
import android.os.Parcel;
import com.twitter.library.api.ActivitySummary;
import com.twitter.library.api.TwitterStatusCard;
import com.twitter.library.api.PromotedContent;
import java.util.HashMap;
import java.util.List;
import com.twitter.library.api.Entity;
import com.twitter.library.api.geo.TwitterPlace;
import com.twitter.library.api.QuotedTweetData;
import com.twitter.library.api.TweetEntities;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

public class Tweet implements Parcelable
{
    public static final Parcelable$Creator CREATOR;
    public static final String[] a;
    public static final String[] b;
    public static final String[] c;
    public static final String[] d;
    public final long A;
    public final String B;
    public final long C;
    public final long D;
    public final long E;
    public final String F;
    public final TweetEntities G;
    public final long H;
    public final QuotedTweetData I;
    public final long J;
    public final Long K;
    public final String L;
    public final String M;
    public final String N;
    public final long O;
    public final boolean P;
    public final long Q;
    public final boolean R;
    public final double S;
    public final double T;
    public final boolean U;
    public final boolean V;
    public final TwitterPlace W;
    public final String X;
    public final int Y;
    public final long Z;
    public final int aa;
    public final int ab;
    public final String ac;
    public final String ad;
    public final boolean ae;
    public final Entity[] af;
    public final List ag;
    public final int ah;
    public final int ai;
    public final int aj;
    public final String ak;
    public final int al;
    public final boolean am;
    public final int an;
    public final HashMap ao;
    private boolean ap;
    private long aq;
    private transient List ar;
    public boolean e;
    public long f;
    public boolean g;
    public boolean h;
    public int i;
    public PromotedContent j;
    public boolean k;
    public TwitterStatusCard l;
    public int m;
    public String n;
    public ActivitySummary o;
    public int p;
    public String q;
    public int r;
    public long s;
    public int t;
    public String u;
    public long v;
    public boolean w;
    public long x;
    public final String y;
    public final String z;
    
    static {
        CREATOR = (Parcelable$Creator)new ac();
        a = new String[] { "_id", "g_status_id", "content", "username", "name", "author_id", "updated_at", "source", "in_r_status_id", "image_url", "user_flags", "favorited", "latitude", "longitude", "is_last", "timeline", "entities", "type", "tweet_type", "sender_id", "s_username", "ref_id", "s_name", "created", "r_content", "flags", "pc", "g_flags", "is_read", "cards", "friendship", "friendship_time", "retweet_count", "favorite_count", "lang", "view_count", "place_data", "scribe_component", "scribe_data", "quoted_tweet_data", "quoted_tweet_id", "preview_draft_id", "retweeted", "preview_media" };
        b = new String[3 + Tweet.a.length];
        System.arraycopy(Tweet.a, 0, Tweet.b, 0, Tweet.a.length);
        Tweet.b[Tweet.a.length] = "rt_orig_ref_id";
        Tweet.b[1 + Tweet.a.length] = "soc_type";
        Tweet.b[2 + Tweet.a.length] = "soc_name";
        d = new String[4 + Tweet.a.length];
        System.arraycopy(Tweet.a, 0, Tweet.d, 0, Tweet.a.length);
        Tweet.d[Tweet.a.length] = "soc_type";
        Tweet.d[1 + Tweet.a.length] = "soc_name";
        Tweet.d[2 + Tweet.a.length] = "highlights";
        Tweet.d[3 + Tweet.a.length] = "retweet_count";
        c = new String[1 + Tweet.a.length];
        System.arraycopy(Tweet.a, 0, Tweet.c, 0, Tweet.a.length);
        Tweet.c[Tweet.a.length] = "cat_timestamp";
    }
    
    public Tweet(final Parcel parcel) {
        boolean k = true;
        this.aq = -1L;
        final ClassLoader classLoader = this.getClass().getClassLoader();
        this.Q = parcel.readLong();
        this.D = parcel.readLong();
        this.E = parcel.readLong();
        this.f = parcel.readLong();
        this.z = parcel.readString();
        this.L = parcel.readString();
        this.C = parcel.readLong();
        this.F = parcel.readString();
        this.M = parcel.readString();
        this.y = parcel.readString();
        this.X = parcel.readString();
        this.G = (TweetEntities)parcel.readSerializable();
        this.A = parcel.readLong();
        this.N = parcel.readString();
        this.O = parcel.readLong();
        this.B = parcel.readString();
        this.g = (parcel.readInt() == (k ? 1 : 0) && k);
        this.h = (parcel.readInt() == (k ? 1 : 0) && k);
        this.H = parcel.readLong();
        this.U = (parcel.readInt() == (k ? 1 : 0) && k);
        this.am = (parcel.readInt() == (k ? 1 : 0) && k);
        this.e = (parcel.readInt() == (k ? 1 : 0) && k);
        this.t = parcel.readInt();
        this.p = parcel.readInt();
        this.an = parcel.readInt();
        this.r = parcel.readInt();
        this.s = parcel.readLong();
        this.ac = parcel.readString();
        this.Y = parcel.readInt();
        this.i = parcel.readInt();
        this.aa = parcel.readInt();
        this.ab = parcel.readInt();
        this.P = (parcel.readInt() == (k ? 1 : 0) && k);
        this.V = (parcel.readInt() == (k ? 1 : 0) && k);
        this.j = (PromotedContent)parcel.readSerializable();
        this.R = (parcel.readInt() == (k ? 1 : 0) && k);
        this.S = parcel.readDouble();
        this.T = parcel.readDouble();
        this.W = (TwitterPlace)parcel.readParcelable(classLoader);
        this.ae = (parcel.readInt() == (k ? 1 : 0) && k);
        this.I = (QuotedTweetData)parcel.readSerializable();
        this.J = parcel.readLong();
        this.l = (TwitterStatusCard)parcel.readSerializable();
        final long long1 = parcel.readLong();
        Long value;
        if (long1 == 0L) {
            value = null;
        }
        else {
            value = long1;
        }
        this.K = value;
        this.ag = parcel.readArrayList(classLoader);
        this.u = parcel.readString();
        this.ao = com.twitter.util.h.a(String.class, String.class, parcel);
        this.Z = parcel.readLong();
        if (parcel.readInt() != (k ? 1 : 0)) {
            k = false;
        }
        this.k = k;
        this.m = parcel.readInt();
        this.n = parcel.readString();
        this.ah = parcel.readInt();
        this.aj = parcel.readInt();
        this.ak = parcel.readString();
        this.ai = parcel.readInt();
        this.af = (Entity[])(Object)parcel.readSerializable();
        this.ad = parcel.readString();
        this.q = parcel.readString();
        this.al = parcel.readInt();
        this.o = (ActivitySummary)parcel.readParcelable(classLoader);
        this.v = parcel.readLong();
        this.x = parcel.readLong();
    }
    
    private Tweet(final ad ad) {
        this.aq = -1L;
        this.Q = ad.q;
        this.D = ad.l;
        this.E = ad.w;
        this.f = ad.n;
        this.z = ad.b;
        this.L = ad.c;
        this.C = ad.k;
        this.F = ad.m;
        this.M = ad.d;
        this.y = com.twitter.util.k.a(ad.a);
        this.X = ad.A;
        this.G = (TweetEntities)com.twitter.util.k.a(ad.u, TweetEntities.a);
        this.A = ad.e;
        this.N = ad.f;
        this.O = ad.g;
        this.B = ad.h;
        this.g = ad.o;
        this.h = ad.p;
        this.H = ad.z;
        this.U = ad.v;
        this.am = ad.ag;
        this.e = ad.i;
        this.t = ad.M;
        this.p = ad.I;
        this.an = ad.ah;
        this.r = ad.K;
        this.s = ad.L;
        this.ac = ad.N;
        this.Y = ad.B;
        this.i = ad.C;
        this.aa = ad.G;
        this.ab = ad.J;
        this.P = ad.j;
        this.V = ad.x;
        this.j = ad.D;
        this.R = ad.r;
        this.S = ad.s;
        this.T = ad.t;
        this.W = ad.y;
        this.ae = (this.W != null && this.W.placeId != null);
        this.I = ad.Q;
        this.J = ad.R;
        this.l = ad.H;
        this.K = ad.W;
        this.ag = com.twitter.util.k.a(ad.Y);
        this.u = ad.O;
        HashMap p;
        if (ad.P != null) {
            p = ad.P;
        }
        else {
            p = new HashMap();
        }
        this.ao = p;
        this.Z = ad.E;
        this.k = ad.F;
        this.m = ad.Z;
        this.n = ad.aa;
        this.ah = ad.ab;
        this.aj = ad.ad;
        this.ak = ad.ae;
        this.ai = ad.ac;
        this.af = ad.X;
        this.ad = ad.U;
        this.q = ad.V;
        this.al = ad.af;
        this.o = ad.ai;
        this.v = ad.S;
        this.x = ad.T;
    }
    
    public static String a(final long n, final String s) {
        return String.format("https://twitter.com/%1$s/status/%2$s", s, n);
    }
    
    private boolean aj() {
        final CardInstanceData w = this.W();
        return w != null && (w.a() || w.p());
    }
    
    public static String b(final Tweet tweet) {
        if (tweet != null) {
            return tweet.af();
        }
        return null;
    }
    
    public boolean A() {
        return bb.c(this.al);
    }
    
    public boolean B() {
        return bb.d(this.al);
    }
    
    public boolean C() {
        return (0x10000 & this.al) != 0x0;
    }
    
    public boolean D() {
        return (0x2000 & this.Y) != 0x0;
    }
    
    public boolean E() {
        return this.D() && this.I != null;
    }
    
    public boolean F() {
        final CardInstanceData w = this.W();
        return w != null && w.q();
    }
    
    public boolean G() {
        final CardInstanceData w = this.W();
        return w != null && w.r();
    }
    
    public boolean H() {
        return this.I() || this.J();
    }
    
    public boolean I() {
        return com.twitter.library.media.util.q.d(this.G.media);
    }
    
    public boolean J() {
        return this.V() && this.aj();
    }
    
    public boolean K() {
        final TweetClassicCard s = this.S();
        return this.F() || this.H() || (s != null && s.type == 2);
    }
    
    public boolean L() {
        return this.V() && this.l.cardInstanceData.n();
    }
    
    public boolean M() {
        final CardInstanceData w = this.W();
        return w != null && w.i();
    }
    
    public boolean N() {
        int n;
        if (this.T() && this.l.cardInstanceData.b()) {
            n = 1;
        }
        else {
            n = 0;
        }
        int n2;
        if (this.V() && this.l.cardInstanceData.name.contains("world_cup")) {
            n2 = 1;
        }
        else {
            n2 = 0;
        }
        if (n == 0) {
            final boolean b = false;
            if (n2 == 0) {
                return b;
            }
        }
        return true;
    }
    
    public boolean O() {
        return this.D() && (this.l == null || (this.l.cardInstanceData == null && this.l.classicCard == null)) && this.Q() == null && com.twitter.library.featureswitch.d.f("quote_tweet_consume_enabled");
    }
    
    public boolean P() {
        final MediaEntity q = this.Q();
        return q != null && !q.tags.isEmpty();
    }
    
    public MediaEntity Q() {
        return com.twitter.library.media.util.q.b(this.G.media, Size.a);
    }
    
    public Iterable R() {
        return this.G.media;
    }
    
    public TweetClassicCard S() {
        if (this.l != null) {
            return this.l.classicCard;
        }
        return null;
    }
    
    public boolean T() {
        return this.l != null && this.l.cardInstanceData != null && vu.a().e(this.l.cardInstanceData);
    }
    
    public boolean U() {
        return this.l != null && this.l.cardInstanceData != null && vu.a().c(this.l.cardInstanceData);
    }
    
    public boolean V() {
        return this.l != null && this.l.cardInstanceData != null && vu.a().d(this.l.cardInstanceData);
    }
    
    public CardInstanceData W() {
        if (this.l != null) {
            return this.l.cardInstanceData;
        }
        return null;
    }
    
    public boolean X() {
        return this.Z() || this.Y() || this.aa() || this.ab();
    }
    
    public boolean Y() {
        final CardInstanceData w = this.W();
        return w != null && w.s();
    }
    
    public boolean Z() {
        final CardInstanceData w = this.W();
        return w != null && w.t();
    }
    
    public String a() {
        if (com.twitter.util.q.a(this.M)) {
            return this.F;
        }
        return this.M;
    }
    
    public List a(final long n) {
        final g a = com.twitter.util.collection.g.a();
        for (final MediaEntity mediaEntity : this.G.media) {
            if (mediaEntity.sourceTweetId == n) {
                a.a(mediaEntity);
            }
        }
        return a.d();
    }
    
    public void a(final EntityScribeContent entityScribeContent) {
        if (entityScribeContent != null) {
            if (entityScribeContent.scribeComponent != null) {
                this.u = entityScribeContent.scribeComponent;
            }
            if (entityScribeContent.scribeItemExtras != null) {
                this.ao.putAll(entityScribeContent.scribeItemExtras);
            }
        }
    }
    
    public boolean a(final Tweet tweet) {
        boolean b;
        if (this == tweet) {
            b = true;
        }
        else {
            b = false;
            if (tweet != null) {
                final long n = lcmp(this.Q, tweet.Q);
                b = false;
                if (n == 0) {
                    if (this.L != null && tweet.L != null) {
                        final boolean equals = this.L.equals(tweet.L);
                        b = false;
                        if (!equals) {
                            return b;
                        }
                    }
                    if (this.B != null && tweet.B != null) {
                        final boolean equals2 = this.B.equals(tweet.B);
                        b = false;
                        if (!equals2) {
                            return b;
                        }
                    }
                    final boolean e = this.e;
                    final boolean e2 = tweet.e;
                    b = false;
                    if (e == e2) {
                        final boolean h = this.h;
                        final boolean h2 = tweet.h;
                        b = false;
                        if (h == h2) {
                            final boolean g = this.g;
                            final boolean g2 = tweet.g;
                            b = false;
                            if (g == g2) {
                                final int ah = this.ah;
                                final int ah2 = tweet.ah;
                                b = false;
                                if (ah == ah2) {
                                    final int aj = this.aj;
                                    final int aj2 = tweet.aj;
                                    b = false;
                                    if (aj == aj2) {
                                        final int p = this.p;
                                        final int p2 = tweet.p;
                                        b = false;
                                        if (p == p2) {
                                            final int t = this.t;
                                            final int t2 = tweet.t;
                                            b = false;
                                            if (t == t2) {
                                                final int an = this.an;
                                                final int an2 = tweet.an;
                                                b = false;
                                                if (an == an2) {
                                                    final int al = this.al;
                                                    final int al2 = tweet.al;
                                                    b = false;
                                                    if (al == al2) {
                                                        final boolean a = com.twitter.util.l.a(this.K, tweet.K);
                                                        b = false;
                                                        if (a) {
                                                            int n2;
                                                            if (this.I == null) {
                                                                n2 = 1;
                                                            }
                                                            else {
                                                                n2 = 0;
                                                            }
                                                            int n3;
                                                            if (tweet.I == null) {
                                                                n3 = 1;
                                                            }
                                                            else {
                                                                n3 = 0;
                                                            }
                                                            b = false;
                                                            if (n2 == n3) {
                                                                final MediaEntity q = this.Q();
                                                                final MediaEntity q2 = tweet.Q();
                                                                if (q != null && q2 != null) {
                                                                    final int size = q.tags.size();
                                                                    final int size2 = q2.tags.size();
                                                                    b = false;
                                                                    if (size != size2) {
                                                                        return b;
                                                                    }
                                                                }
                                                                return true;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return b;
    }
    
    public boolean a(final String s) {
        final CardInstanceData w = this.W();
        return this.H() && (w == null || com.twitter.util.l.a(this.l.cardInstanceData.url, s));
    }
    
    public boolean a(final boolean b, final boolean b2) {
        return (!this.x() || b) && (!b2 || com.twitter.library.featureswitch.d.f("twitter_access_android_media_forward_enabled")) && this.l != null && this.l.cardInstanceData != null;
    }
    
    public boolean aa() {
        final CardInstanceData w = this.W();
        return w != null && (TwitterStatusCard.a(w.name) || TwitterStatusCard.b(w.name));
    }
    
    public boolean ab() {
        final CardInstanceData w = this.W();
        return w != null && (Card.a(w.name) || Card.b(w.name));
    }
    
    public String ac() {
        final CardInstanceData w = this.W();
        if (w != null) {
            return w.a("app_id");
        }
        return null;
    }
    
    public boolean ad() {
        return !this.g && this.j != null && this.j.isPAcInTimeline && !this.j.b();
    }
    
    public boolean ae() {
        return !this.g && this.j != null && this.j.isSuppressMediaForward;
    }
    
    public String af() {
        if (!com.twitter.util.q.a(this.u)) {
            return this.u;
        }
        return "tweet";
    }
    
    public List ag() {
        final LinkedList<e> list = new LinkedList<e>();
        if (this.j()) {
            for (final HashtagEntity hashtagEntity : this.G.hashtags) {
                if (com.twitter.library.view.e.a(hashtagEntity.text)) {
                    list.add(new e(hashtagEntity.text, hashtagEntity.end));
                }
            }
        }
        return list;
    }
    
    public List ah() {
        final List ag = this.ag();
        if (this.G.b()) {
            for (final e e : ag) {
                for (final UrlEntity urlEntity : this.G.c()) {
                    if (urlEntity.start < e.b) {
                        e.b -= urlEntity.url.length() - urlEntity.displayUrl.length();
                    }
                }
            }
        }
        return ag;
    }
    
    public String ai() {
        return a(this.D, this.z);
    }
    
    public String b() {
        if (com.twitter.util.q.a(this.L)) {
            return this.z;
        }
        return this.L;
    }
    
    public List b(final long aq) {
        if (this.aq == aq) {
            return this.ar;
        }
        final LinkedHashSet<RepliedUser> set = new LinkedHashSet<RepliedUser>();
        RepliedUser a = RepliedUser.a(this);
        long n;
        if (this.g) {
            n = this.C;
        }
        else {
            n = this.f;
        }
        if (aq != n) {
            set.add(a);
            if (this.g && this.f != aq && this.f != this.C) {
                set.add(RepliedUser.b(this));
                a = null;
            }
            else {
                a = null;
            }
        }
        for (final MentionEntity mentionEntity : this.G.mentions) {
            if (mentionEntity.userId != aq) {
                set.add(RepliedUser.a(mentionEntity));
            }
        }
        final TweetClassicCard s = this.S();
        if (s != null) {
            final CardUser authorUser = s.authorUser;
            if (authorUser != null && aq != authorUser.userId) {
                set.add(new RepliedUser(authorUser.screenName, authorUser.userId, authorUser.fullName));
            }
        }
        for (final MediaTag mediaTag : com.twitter.library.media.util.ag.a(this.G.media)) {
            if (aq != mediaTag.userId) {
                set.add(RepliedUser.a(mediaTag));
            }
        }
        if (this.E() && this.O()) {
            this.I.a(aq, set);
        }
        if (set.isEmpty()) {
            set.add(a);
        }
        this.ar = new ArrayList(set);
        this.aq = aq;
        return this.ar;
    }
    
    public String c() {
        if (this.X != null) {
            return this.X;
        }
        return this.y;
    }
    
    public boolean d() {
        return (0x1 & this.Y) != 0x0;
    }
    
    public int describeContents() {
        return 0;
    }
    
    public boolean e() {
        return (0x4 & this.Y) != 0x0;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this != o) {
            if (o == null || this.getClass() != o.getClass()) {
                return false;
            }
            if (this.Q != ((Tweet)o).Q) {
                return false;
            }
        }
        return true;
    }
    
    public boolean f() {
        return !CollectionUtils.a((Collection)this.ag);
    }
    
    public boolean g() {
        return (0x8 & this.Y) != 0x0;
    }
    
    public boolean h() {
        return (0x20 & this.Y) != 0x0;
    }
    
    @Override
    public int hashCode() {
        return (int)(this.Q ^ this.Q >>> 32);
    }
    
    public boolean i() {
        return this.d() || this.e() || this.g();
    }
    
    public boolean j() {
        return !this.G.hashtags.c();
    }
    
    public boolean k() {
        return (0x10 & this.Y) != 0x0;
    }
    
    public boolean l() {
        return this.O != -1L;
    }
    
    public boolean m() {
        return (0x1 & this.i) != 0x0;
    }
    
    public boolean n() {
        return (0x8 & this.i) != 0x0;
    }
    
    public boolean o() {
        return (0x2 & this.i) != 0x0;
    }
    
    public boolean p() {
        return (0x4 & this.i) != 0x0;
    }
    
    public boolean q() {
        return (this.m() && !this.p()) || this.t() || this.v();
    }
    
    public boolean r() {
        return bb.h(this.al);
    }
    
    public boolean s() {
        return bb.i(this.al);
    }
    
    public boolean t() {
        return bb.j(this.al);
    }
    
    public boolean u() {
        return bb.r(this.al);
    }
    
    public boolean v() {
        return bb.o(this.al);
    }
    
    public boolean w() {
        return this.ap || this.C() || this.r() || this.s() || this.v() || (this.m() && !this.p() && (this.aa == 0 || this.aa == 13));
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        int n2 = 1;
        parcel.writeLong(this.Q);
        parcel.writeLong(this.D);
        parcel.writeLong(this.E);
        parcel.writeLong(this.f);
        parcel.writeString(this.z);
        parcel.writeString(this.L);
        parcel.writeLong(this.C);
        parcel.writeString(this.F);
        parcel.writeString(this.M);
        parcel.writeString(this.y);
        parcel.writeString(this.X);
        parcel.writeSerializable((Serializable)this.G);
        parcel.writeLong(this.A);
        parcel.writeString(this.N);
        parcel.writeLong(this.O);
        parcel.writeString(this.B);
        int n3;
        if (this.g) {
            n3 = n2;
        }
        else {
            n3 = 0;
        }
        parcel.writeInt(n3);
        int n4;
        if (this.h) {
            n4 = n2;
        }
        else {
            n4 = 0;
        }
        parcel.writeInt(n4);
        parcel.writeLong(this.H);
        int n5;
        if (this.U) {
            n5 = n2;
        }
        else {
            n5 = 0;
        }
        parcel.writeInt(n5);
        int n6;
        if (this.am) {
            n6 = n2;
        }
        else {
            n6 = 0;
        }
        parcel.writeInt(n6);
        int n7;
        if (this.e) {
            n7 = n2;
        }
        else {
            n7 = 0;
        }
        parcel.writeInt(n7);
        parcel.writeInt(this.t);
        parcel.writeInt(this.p);
        parcel.writeInt(this.an);
        parcel.writeInt(this.r);
        parcel.writeLong(this.s);
        parcel.writeString(this.ac);
        parcel.writeInt(this.Y);
        parcel.writeInt(this.i);
        parcel.writeInt(this.aa);
        parcel.writeInt(this.ab);
        int n8;
        if (this.P) {
            n8 = n2;
        }
        else {
            n8 = 0;
        }
        parcel.writeInt(n8);
        int n9;
        if (this.V) {
            n9 = n2;
        }
        else {
            n9 = 0;
        }
        parcel.writeInt(n9);
        parcel.writeSerializable((Serializable)this.j);
        int n10;
        if (this.R) {
            n10 = n2;
        }
        else {
            n10 = 0;
        }
        parcel.writeInt(n10);
        parcel.writeDouble(this.S);
        parcel.writeDouble(this.T);
        parcel.writeParcelable((Parcelable)this.W, n);
        int n11;
        if (this.ae) {
            n11 = n2;
        }
        else {
            n11 = 0;
        }
        parcel.writeInt(n11);
        parcel.writeSerializable((Serializable)this.I);
        parcel.writeLong(this.J);
        parcel.writeSerializable((Serializable)this.l);
        long longValue;
        if (this.K != null) {
            longValue = this.K;
        }
        else {
            longValue = 0L;
        }
        parcel.writeLong(longValue);
        parcel.writeList(this.ag);
        parcel.writeString(this.u);
        com.twitter.util.h.a(this.ao, parcel);
        parcel.writeLong(this.Z);
        if (!this.k) {
            n2 = 0;
        }
        parcel.writeInt(n2);
        parcel.writeInt(this.m);
        parcel.writeString(this.n);
        parcel.writeInt(this.ah);
        parcel.writeInt(this.aj);
        parcel.writeString(this.ak);
        parcel.writeInt(this.ai);
        parcel.writeSerializable((Serializable)this.af);
        parcel.writeString(this.ad);
        parcel.writeString(this.q);
        parcel.writeInt(this.al);
        parcel.writeParcelable((Parcelable)this.o, n);
        parcel.writeLong(this.v);
        parcel.writeLong(this.x);
    }
    
    public boolean x() {
        return (0x40 & this.Y) != 0x0;
    }
    
    public boolean y() {
        return (0x800 & this.Y) != 0x0;
    }
    
    public boolean z() {
        return (0x80 & this.Y) != 0x0;
    }
}
