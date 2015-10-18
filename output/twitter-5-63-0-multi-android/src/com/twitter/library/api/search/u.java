// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.api.search;

import java.util.Collection;
import com.twitter.library.service.b;
import com.twitter.library.api.bd;
import com.twitter.internal.network.l;
import com.twitter.library.api.TwitterTopic$TrendsPlus$ContextInfo$TrendVelocity;
import com.twitter.library.api.TwitterTopic$TrendsPlus$ContextInfo$TweetCount;
import com.twitter.library.api.bh;
import java.util.Iterator;
import com.twitter.errorreporter.a;
import com.twitter.library.api.TwitterTopic$TrendsPlus$Disclosure;
import com.twitter.library.api.TwitterTopic$TrendsPlus$DebugInfo;
import com.twitter.library.api.TwitterTopic$TrendsPlus$TargetInfo;
import com.twitter.library.api.TwitterTopic$TrendsPlus$ContextInfo;
import com.twitter.library.api.TwitterUser;
import com.twitter.library.api.TwitterTopic$Data;
import com.twitter.library.api.TwitterTopic$Metadata;
import com.twitter.library.api.TwitterTopic;
import java.util.List;
import com.twitter.library.api.TwitterTopic$TrendsPlus;
import com.twitter.library.api.bp;
import com.twitter.library.api.TweetEntities;
import java.util.ArrayList;
import com.twitter.library.util.InvalidDataException;
import android.text.TextUtils;
import com.twitter.library.api.PromotedContent;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.JsonParser;
import java.util.HashMap;
import com.twitter.library.api.ad;

public class u extends ad
{
    private static final HashMap a;
    
    static {
        (a = new HashMap(5)).put("trend", 0);
        u.a.put("promoted_trend", 4);
        u.a.put("user_gallery", 1);
        u.a.put("photo_gallery", 2);
        u.a.put("video_gallery", 3);
    }
    
    private r c(final JsonParser jsonParser, final int n) {
        String s = null;
        String s2 = null;
        String advertiserName = null;
        long o = 0L;
        int n2 = 0;
        TwitterTopic$TrendsPlus$ContextInfo i = null;
        TwitterTopic$TrendsPlus$TargetInfo h = null;
        TwitterTopic$TrendsPlus$DebugInfo l = null;
        final JsonToken a = jsonParser.a();
        TwitterTopic$TrendsPlus$Disclosure m = null;
        ArrayList<bp> f = null;
        String s3 = null;
        String s5 = null;
        String s6 = null;
        JsonToken a2;
        String s19;
        for (JsonToken jsonToken = a; jsonToken != null && jsonToken != JsonToken.c; jsonToken = a2, s19 = s6, advertiserName = s5, s3 = s19) {
            final String e = jsonParser.e();
            String r = null;
            String r2 = null;
            Label_0119: {
                switch (v.a[jsonToken.ordinal()]) {
                    case 3: {
                        if ("name".equals(e)) {
                            r = jsonParser.r();
                            r2 = s2;
                            final String s4 = s3;
                            s5 = advertiserName;
                            s6 = s4;
                            break Label_0119;
                        }
                        if ("description".equals(e)) {
                            r2 = jsonParser.r();
                            r = s;
                            final String s7 = s3;
                            s5 = advertiserName;
                            s6 = s7;
                            break Label_0119;
                        }
                        if ("meta_description".equals(e)) {
                            final String r3 = jsonParser.r();
                            r2 = s2;
                            r = s;
                            final String s8 = advertiserName;
                            s6 = r3;
                            s5 = s8;
                            break Label_0119;
                        }
                        if ("advertiser_name".equals(e)) {
                            final String r4 = jsonParser.r();
                            r2 = s2;
                            r = s;
                            s6 = s3;
                            s5 = r4;
                            break Label_0119;
                        }
                        break;
                    }
                    case 4: {
                        if ("id".equals(e)) {
                            o = jsonParser.o();
                            r2 = s2;
                            r = s;
                            final String s9 = advertiserName;
                            s6 = s3;
                            s5 = s9;
                            break Label_0119;
                        }
                        if ("rank".equals(e)) {
                            n2 = jsonParser.n();
                            r2 = s2;
                            r = s;
                            final String s10 = advertiserName;
                            s6 = s3;
                            s5 = s10;
                            break Label_0119;
                        }
                        break;
                    }
                    case 2: {
                        if ("context".equals(e)) {
                            i = i(jsonParser);
                            r2 = s2;
                            r = s;
                            final String s11 = advertiserName;
                            s6 = s3;
                            s5 = s11;
                            break Label_0119;
                        }
                        if ("target".equals(e)) {
                            h = h(jsonParser);
                            r2 = s2;
                            r = s;
                            final String s12 = advertiserName;
                            s6 = s3;
                            s5 = s12;
                            break Label_0119;
                        }
                        if ("debug".equals(e)) {
                            l = l(jsonParser);
                            r2 = s2;
                            r = s;
                            final String s13 = advertiserName;
                            s6 = s3;
                            s5 = s13;
                            break Label_0119;
                        }
                        if ("disclosure".equals(e)) {
                            m = m(jsonParser);
                            r2 = s2;
                            r = s;
                            final String s14 = advertiserName;
                            s6 = s3;
                            s5 = s14;
                            break Label_0119;
                        }
                        jsonParser.c();
                        r2 = s2;
                        r = s;
                        final String s15 = advertiserName;
                        s6 = s3;
                        s5 = s15;
                        break Label_0119;
                    }
                    case 1: {
                        if ("images".equals(e)) {
                            f = (ArrayList<bp>)this.f(jsonParser);
                            r2 = s2;
                            r = s;
                            final String s16 = advertiserName;
                            s6 = s3;
                            s5 = s16;
                            break Label_0119;
                        }
                        jsonParser.c();
                        r2 = s2;
                        r = s;
                        final String s17 = advertiserName;
                        s6 = s3;
                        s5 = s17;
                        break Label_0119;
                    }
                }
                r2 = s2;
                r = s;
                final String s18 = advertiserName;
                s6 = s3;
                s5 = s18;
            }
            a2 = jsonParser.a();
            s2 = r2;
            s = r;
        }
        final long n3 = lcmp(o, 0L);
        PromotedContent promotedContent = null;
        if (n3 != 0) {
            promotedContent = new PromotedContent();
            promotedContent.advertiserName = advertiserName;
            promotedContent.isPromotedTrend = true;
            promotedContent.promotedTrendId = o;
            promotedContent.disclosureType = m.disclosureType;
        }
        if (h == null || TextUtils.isEmpty((CharSequence)h.query) || TextUtils.isEmpty((CharSequence)s)) {
            final a d = this.d();
            if (d != null) {
                d.a(new InvalidDataException("Failed parsing trendsplus module; missing required data"));
            }
            return null;
        }
        List<TweetEntities> list2;
        if (f != null) {
            final ArrayList<TweetEntities> list = new ArrayList<TweetEntities>();
            for (final bp bp : f) {
                if (!bp.c.media.c()) {
                    list.add(bp.c);
                }
            }
            list2 = list;
        }
        else {
            list2 = null;
        }
        final TwitterTopic$TrendsPlus twitterTopic$TrendsPlus = new TwitterTopic$TrendsPlus(list2, i, h, l, s3, n2);
        final TwitterTopic$Metadata twitterTopic$Metadata = new TwitterTopic$Metadata(3, TwitterTopic.a(h.query), false);
        final String query = h.query;
        long count;
        if (i != null && i.tweetCount != null) {
            count = i.tweetCount.count;
        }
        else {
            count = 0L;
        }
        return new r(n, new TwitterTopic(twitterTopic$Metadata, s, s2, query, null, null, null, null, count, 0L, 0L, promotedContent, null, twitterTopic$TrendsPlus, null, null), null, null);
    }
    
    private t c(final JsonParser jsonParser) {
        String r = null;
        long i = 0L;
        boolean equals = false;
        JsonToken jsonToken = jsonParser.a();
        long j = i;
        String r2 = null;
        long k = i;
        while (jsonToken != null && jsonToken != JsonToken.c) {
            final String e = jsonParser.e();
            switch (v.a[jsonToken.ordinal()]) {
                case 4: {
                    if ("timestamp".equals(e)) {
                        k = jsonParser.i();
                        break;
                    }
                    if ("refresh_interval_millis".equals(e)) {
                        i = jsonParser.i();
                        break;
                    }
                    break;
                }
                case 3: {
                    if ("context_mode".equals(e)) {
                        equals = "minimal".equals(jsonParser.r());
                        break;
                    }
                    break;
                }
                case 2: {
                    if ("woeid".equals(e)) {
                        for (JsonToken jsonToken2 = jsonParser.a(); jsonToken2 != null && jsonToken2 != JsonToken.c; jsonToken2 = jsonParser.a()) {
                            switch (v.a[jsonToken2.ordinal()]) {
                                case 3: {
                                    if ("name".equals(jsonParser.e())) {
                                        r2 = jsonParser.r();
                                        break;
                                    }
                                    break;
                                }
                                case 4: {
                                    if ("id".equals(jsonParser.e())) {
                                        j = jsonParser.i();
                                        break;
                                    }
                                    break;
                                }
                                case 1:
                                case 2: {
                                    jsonParser.c();
                                    break;
                                }
                            }
                        }
                        break;
                    }
                    if ("debug".equals(e)) {
                        for (JsonToken jsonToken3 = jsonParser.a(); jsonToken3 != null && jsonToken3 != JsonToken.c; jsonToken3 = jsonParser.a()) {
                            switch (v.a[jsonToken3.ordinal()]) {
                                case 3: {
                                    if ("string".equals(jsonParser.e())) {
                                        r = jsonParser.r();
                                        break;
                                    }
                                    break;
                                }
                                case 1:
                                case 2: {
                                    jsonParser.c();
                                    break;
                                }
                            }
                        }
                        break;
                    }
                    jsonParser.c();
                    break;
                }
                case 1: {
                    jsonParser.c();
                    break;
                }
            }
            jsonToken = jsonParser.a();
        }
        return new t(k, r2, j, r, i, equals);
    }
    
    private ArrayList d(final JsonParser jsonParser) {
        final ArrayList<r> list = new ArrayList<r>();
        for (JsonToken jsonToken = jsonParser.a(); jsonToken != null && jsonToken != JsonToken.e; jsonToken = jsonParser.a()) {
            switch (v.a[jsonToken.ordinal()]) {
                case 2: {
                    for (JsonToken jsonToken2 = jsonParser.a(); jsonToken2 != null && jsonToken2 != JsonToken.c; jsonToken2 = jsonParser.a()) {
                        switch (v.a[jsonToken2.ordinal()]) {
                            case 2: {
                                final r e = this.e(jsonParser);
                                if (e != null) {
                                    list.add(e);
                                    break;
                                }
                                break;
                            }
                            case 1: {
                                jsonParser.c();
                                break;
                            }
                        }
                    }
                    break;
                }
                case 1: {
                    jsonParser.c();
                    break;
                }
            }
        }
        return list;
    }
    
    private r e(final JsonParser jsonParser) {
        final Integer n = u.a.get(jsonParser.e());
        if (n == null) {
            jsonParser.c();
            return null;
        }
        final int intValue = n;
        switch (intValue) {
            default: {
                return null;
            }
            case 0:
            case 4: {
                return this.c(jsonParser, intValue);
            }
        }
    }
    
    private ArrayList f(final JsonParser jsonParser) {
        ArrayList<bp> list = new ArrayList<bp>();
        for (JsonToken jsonToken = jsonParser.a(); jsonToken != null && jsonToken != JsonToken.e; jsonToken = jsonParser.a()) {
            switch (v.a[jsonToken.ordinal()]) {
                case 2: {
                    for (JsonToken jsonToken2 = jsonParser.a(); jsonToken2 != null && jsonToken2 != JsonToken.c; jsonToken2 = jsonParser.a()) {
                        switch (v.a[jsonToken2.ordinal()]) {
                            case 2: {
                                final bp g = this.g(jsonParser);
                                if (g != null) {
                                    list.add(g);
                                    break;
                                }
                                break;
                            }
                            case 1: {
                                jsonParser.c();
                                break;
                            }
                        }
                    }
                    break;
                }
                case 1: {
                    jsonParser.c();
                    break;
                }
            }
        }
        if (list.isEmpty()) {
            list = null;
        }
        return list;
    }
    
    private bp g(final JsonParser jsonParser) {
        final boolean equals = "status".equals(jsonParser.e());
        bp b = null;
        if (equals) {
            b = bh.b(jsonParser, false, this.d());
        }
        return b;
    }
    
    private static TwitterTopic$TrendsPlus$TargetInfo h(final JsonParser jsonParser) {
        final ArrayList<Long> list = new ArrayList<Long>();
        final JsonToken a = jsonParser.a();
        String r = null;
        for (JsonToken a2 = a; a2 != null && a2 != JsonToken.c; a2 = jsonParser.a()) {
            final String e = jsonParser.e();
            switch (v.a[a2.ordinal()]) {
                case 3: {
                    if ("query".equals(e)) {
                        r = jsonParser.r();
                        break;
                    }
                    break;
                }
                case 1: {
                    if ("pinned_tweets".equals(e)) {
                        for (JsonToken jsonToken = jsonParser.d(); jsonToken != null && jsonToken != JsonToken.e; jsonToken = jsonParser.a()) {
                            if (jsonToken == JsonToken.i) {
                                list.add(jsonParser.i());
                            }
                        }
                        break;
                    }
                    jsonParser.c();
                    break;
                }
                case 2: {
                    jsonParser.c();
                    break;
                }
            }
        }
        return new TwitterTopic$TrendsPlus$TargetInfo(r, list);
    }
    
    private static TwitterTopic$TrendsPlus$ContextInfo i(final JsonParser jsonParser) {
        ArrayList<String> list = null;
        long i = 0L;
        JsonToken jsonToken = jsonParser.a();
        TwitterTopic$TrendsPlus$ContextInfo$TweetCount k = null;
        TwitterTopic$TrendsPlus$ContextInfo$TrendVelocity j = null;
        while (jsonToken != null && jsonToken != JsonToken.c) {
            final String e = jsonParser.e();
            switch (v.a[jsonToken.ordinal()]) {
                case 4: {
                    if ("trend_start_millis".equals(e)) {
                        i = jsonParser.i();
                        break;
                    }
                    break;
                }
                case 2: {
                    if ("trend_velocity".equals(e)) {
                        j = j(jsonParser);
                        break;
                    }
                    if ("tweet_count".equals(e)) {
                        k = k(jsonParser);
                        break;
                    }
                    jsonParser.c();
                    break;
                }
                case 1: {
                    if ("related_queries".equals(e)) {
                        list = new ArrayList<String>();
                        for (JsonToken jsonToken2 = jsonParser.d(); jsonToken2 != null && jsonToken2 != JsonToken.e; jsonToken2 = jsonParser.a()) {
                            if (jsonToken2 == JsonToken.h) {
                                list.add(jsonParser.g());
                            }
                        }
                        break;
                    }
                    jsonParser.c();
                    break;
                }
            }
            jsonToken = jsonParser.a();
        }
        return new TwitterTopic$TrendsPlus$ContextInfo(list, i, j, k);
    }
    
    private static TwitterTopic$TrendsPlus$ContextInfo$TrendVelocity j(final JsonParser jsonParser) {
        final JsonToken a = jsonParser.a();
        int h = 0;
        String r = null;
        for (JsonToken a2 = a; a2 != null && a2 != JsonToken.c; a2 = jsonParser.a()) {
            final String e = jsonParser.e();
            switch (v.a[a2.ordinal()]) {
                case 3: {
                    if ("direction".equals(e)) {
                        r = jsonParser.r();
                        break;
                    }
                    break;
                }
                case 4: {
                    if ("magnitude".equals(e)) {
                        h = jsonParser.h();
                        break;
                    }
                    break;
                }
                case 1:
                case 2: {
                    jsonParser.c();
                    break;
                }
            }
        }
        return new TwitterTopic$TrendsPlus$ContextInfo$TrendVelocity(r, h);
    }
    
    private static TwitterTopic$TrendsPlus$ContextInfo$TweetCount k(final JsonParser jsonParser) {
        JsonToken jsonToken = jsonParser.a();
        int h = 0;
        long i = 0L;
        while (jsonToken != null && jsonToken != JsonToken.c) {
            final String e = jsonParser.e();
            switch (v.a[jsonToken.ordinal()]) {
                case 4: {
                    if ("duration_minutes".equals(e)) {
                        h = jsonParser.h();
                        break;
                    }
                    if ("count".equals(e)) {
                        i = jsonParser.i();
                        break;
                    }
                    break;
                }
                case 1:
                case 2: {
                    jsonParser.c();
                    break;
                }
            }
            jsonToken = jsonParser.a();
        }
        return new TwitterTopic$TrendsPlus$ContextInfo$TweetCount(h, i);
    }
    
    private static TwitterTopic$TrendsPlus$DebugInfo l(final JsonParser jsonParser) {
        final JsonToken a = jsonParser.a();
        boolean l = true;
        String r = null;
        for (JsonToken a2 = a; a2 != null && a2 != JsonToken.c; a2 = jsonParser.a()) {
            final String e = jsonParser.e();
            switch (v.a[a2.ordinal()]) {
                case 3: {
                    if ("string".equals(e)) {
                        r = jsonParser.r();
                        break;
                    }
                    break;
                }
                case 5:
                case 6: {
                    if ("it_should_be_ignored".equals(e)) {
                        l = jsonParser.l();
                        break;
                    }
                    break;
                }
                case 1:
                case 2: {
                    jsonParser.c();
                    break;
                }
            }
        }
        return new TwitterTopic$TrendsPlus$DebugInfo(r, l);
    }
    
    private static TwitterTopic$TrendsPlus$Disclosure m(final JsonParser jsonParser) {
        String r = null;
        JsonToken jsonToken = jsonParser.a();
        String r2 = null;
        while (jsonToken != null && jsonToken != JsonToken.c) {
            final String e = jsonParser.e();
            switch (v.a[jsonToken.ordinal()]) {
                case 3: {
                    if ("text".equals(e)) {
                        r = jsonParser.r();
                        break;
                    }
                    if ("type".equals(e)) {
                        r2 = jsonParser.r();
                        break;
                    }
                    break;
                }
                case 1:
                case 2: {
                    jsonParser.c();
                    break;
                }
            }
            jsonToken = jsonParser.a();
        }
        return new TwitterTopic$TrendsPlus$Disclosure(r, r2);
    }
    
    @Override
    public void a(final l l) {
        final ArrayList list = (ArrayList)this.b();
        if (list != null && !list.isEmpty()) {
            l.j = list.get(0).a;
        }
    }
    
    @Override
    public b ax_() {
        return new b((List)this.b());
    }
    
    protected s b(final JsonParser jsonParser) {
        final ArrayList list = new ArrayList();
        final JsonToken a = jsonParser.a();
        t c = null;
        for (JsonToken a2 = a; a2 != null && a2 != JsonToken.c; a2 = jsonParser.a()) {
            final String e = jsonParser.e();
            switch (v.a[a2.ordinal()]) {
                case 1: {
                    if ("modules".equals(e)) {
                        list.addAll(this.d(jsonParser));
                        break;
                    }
                    jsonParser.c();
                    break;
                }
                case 2: {
                    if ("metadata".equals(e)) {
                        c = this.c(jsonParser);
                        break;
                    }
                    jsonParser.c();
                    break;
                }
            }
        }
        return new s(c, list);
    }
    
    protected ArrayList b(final JsonParser jsonParser, final int n) {
        return bh.G(jsonParser);
    }
}
