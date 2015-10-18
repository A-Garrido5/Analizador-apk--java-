// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.api;

import com.twitter.model.json.core.JsonTwitterUserMetadata;
import com.twitter.android.util.CategoryListItem;
import com.twitter.library.card.instance.CardInstanceData;
import com.twitter.library.api.geo.PlaceAttribution;
import com.twitter.library.api.search.j;
import com.twitter.library.api.conversations.ag;
import com.twitter.model.json.core.JsonPromotedContent;
import com.twitter.library.network.LoginResponse;
import org.json.JSONException;
import org.json.JSONArray;
import org.json.JSONObject;
import com.twitter.library.api.account.LoginVerificationRequest;
import java.util.Set;
import com.twitter.model.json.timeline.wtf.JsonStrings;
import com.twitter.model.json.timeline.wtf.JsonWhoToFollow;
import com.twitter.library.api.account.LvEligibilityResponse;
import com.twitter.model.json.search.JsonSearchSocialProof;
import com.twitter.library.api.geo.Coordinate;
import android.net.Uri;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import com.twitter.library.featureswitch.g;
import com.twitter.library.featureswitch.f;
import com.twitter.library.featureswitch.h;
import java.util.LinkedHashSet;
import com.twitter.errorreporter.ErrorReporter;
import com.twitter.library.util.CarouselInvalidDataException;
import com.twitter.model.timeline.SuggestsInfo;
import com.twitter.model.json.timeline.JsonSuggestsInfo;
import com.twitter.model.json.timeline.JsonSuggestsInfos;
import com.twitter.library.util.aj;
import com.twitter.library.api.search.m;
import com.twitter.library.api.search.l;
import com.twitter.library.api.search.TwitterSearchQuery;
import com.twitter.library.api.search.TwitterTypeAhead;
import android.util.Pair;
import com.twitter.library.card.instance.c;
import com.twitter.library.api.geo.TwitterPlace;
import com.twitter.library.util.NullUserException;
import java.util.regex.Matcher;
import com.twitter.internal.util.Optional;
import com.twitter.model.json.geo.JsonTwitterPlace;
import com.twitter.library.util.bk;
import com.twitter.model.json.timeline.wtf.JsonSocialProof;
import com.twitter.util.k;
import com.twitter.model.json.core.JsonTweetEntities;
import com.twitter.internal.android.util.Size;
import com.twitter.library.util.bq;
import android.text.TextUtils;
import java.io.InputStream;
import com.twitter.library.featureswitch.FeatureSwitchesValue$FeatureSwitchesImpression;
import com.twitter.library.featureswitch.FeatureSwitchesValue;
import com.twitter.library.featureswitch.FeatureSwitchesConfig;
import com.twitter.library.featureswitch.FeatureSwitchesParameter;
import com.twitter.library.featureswitch.e;
import com.twitter.library.featureswitch.SettingVersionDetails;
import java.util.HashSet;
import com.twitter.library.util.InvalidDataException;
import com.twitter.library.featureswitch.FeatureSwitchesManifest;
import java.io.IOException;
import com.twitter.library.api.search.TwitterTypeAheadGroup;
import java.util.Collection;
import com.twitter.util.collection.CollectionUtils;
import com.twitter.model.json.core.JsonTwitterStatusMetadata;
import com.twitter.library.api.search.b;
import java.util.Iterator;
import java.util.ArrayList;
import com.twitter.library.api.conversations.aw;
import com.twitter.library.api.conversations.q;
import java.util.List;
import com.fasterxml.jackson.core.JsonToken;
import com.twitter.errorreporter.a;
import com.fasterxml.jackson.core.JsonParser;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.core.JsonFactory;

public class bh
{
    public static final JsonFactory a;
    static final HashMap b;
    private static final HashMap c;
    private static final Map d;
    private static final Map e;
    
    static {
        a = new JsonFactory();
        (b = new HashMap(19)).put("magicrecs_retweet", new bj(20, 1, 2, 0));
        bh.b.put("magicrecs_follow", new bj(19, 1, 1, 0));
        bh.b.put("magicrecs_favorite", new bj(18, 1, 2, 0));
        bh.b.put("favorite", new bj(1, 1, 2, 0));
        bh.b.put("favorited_retweet", new bj(10, 1, 2, 0));
        bh.b.put("favorited_mention", new bj(12, 1, 2, 0));
        bh.b.put("retweeted_retweet", new bj(9, 1, 2, 0));
        bh.b.put("retweeted_mention", new bj(11, 1, 2, 0));
        bh.b.put("mention", new bj(2, 1, 1, 2));
        bh.b.put("reply", new bj(3, 1, 2, 2));
        bh.b.put("retweet", new bj(4, 1, 2, 2));
        bh.b.put("follow", new bj(5, 1, 1, 0));
        bh.b.put("joined_twitter", new bj(13, 1, 1, 0));
        bh.b.put("quote", new bj(14, 1, 2, 2));
        bh.b.put("list_member_added", new bj(6, 1, 1, 3));
        bh.b.put("list_created", new bj(7, 1, 3, 0));
        bh.b.put("media_tagged", new bj(15, 1, 2, 0));
        bh.b.put("favorited_media_tagged", new bj(16, 1, 2, 0));
        bh.b.put("retweeted_media_tagged", new bj(17, 1, 2, 0));
        (c = new HashMap(11)).put("status", 0);
        bh.c.put("user", 1);
        bh.c.put("news", 4);
        bh.c.put("suggestion", 3);
        bh.c.put("user_gallery", 6);
        bh.c.put("media_gallery", 7);
        bh.c.put("tweet_gallery", 10);
        bh.c.put("event_summary", 11);
        bh.c.put("event_update", 13);
        bh.c.put("summary", 12);
        (d = new HashMap(4)).put("favorite", 36);
        bh.d.put("user", 35);
        bh.d.put("megaphone", 22);
        bh.d.put("bird", 37);
        (e = new HashMap(3)).put("mute", 64);
        bh.e.put("block", 128);
        bh.e.put("report_spam", 256);
    }
    
    private static TwitterTopic$SportsEvent A(final JsonParser jsonParser, final a a) {
        List z = null;
        JsonToken jsonToken = jsonParser.a();
        List z2 = null;
        String r = null;
        String r2 = null;
        String r3 = null;
        String r4 = null;
        String r5 = null;
        while (jsonToken != null && jsonToken != JsonToken.c) {
            final String e = jsonParser.e();
            switch (bi.a[jsonToken.ordinal()]) {
                default: {
                    jsonParser.c();
                    break;
                }
                case 2: {
                    if ("sports_title".equals(e)) {
                        r5 = jsonParser.r();
                        break;
                    }
                    if ("game_type".equals(e)) {
                        r4 = jsonParser.r();
                        break;
                    }
                    if ("channel".equals(e)) {
                        r = jsonParser.r();
                        break;
                    }
                    break;
                }
                case 4: {
                    if ("game_info".equals(e)) {
                        for (JsonToken jsonToken2 = jsonParser.a(); jsonToken2 != null && jsonToken2 != JsonToken.c; jsonToken2 = jsonParser.a()) {
                            switch (bi.a[jsonToken2.ordinal()]) {
                                case 2: {
                                    final String e2 = jsonParser.e();
                                    if ("summary".equals(e2)) {
                                        r3 = jsonParser.r();
                                        break;
                                    }
                                    if ("status".equals(e2)) {
                                        r2 = jsonParser.r();
                                        break;
                                    }
                                    break;
                                }
                                case 1: {
                                    jsonParser.c();
                                    break;
                                }
                                case 4: {
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
                    if ("players".equals(e)) {
                        z2 = z(jsonParser, a);
                        break;
                    }
                    if ("secondary_players".equals(e)) {
                        z = z(jsonParser, a);
                        break;
                    }
                    jsonParser.c();
                    break;
                }
            }
            jsonToken = jsonParser.a();
        }
        return new TwitterTopic$SportsEvent(r5, r4, r3, r2, r, z2, z);
    }
    
    public static q A(final JsonParser jsonParser) {
        if (jsonParser != null) {
            for (JsonToken jsonToken = jsonParser.d(); jsonToken != null && jsonToken != JsonToken.e; jsonToken = jsonParser.a()) {
                if (jsonToken == JsonToken.b) {
                    return q.a(jsonParser);
                }
            }
        }
        return null;
    }
    
    public static aw B(final JsonParser jsonParser) {
        if (jsonParser != null) {
            for (JsonToken jsonToken = jsonParser.d(); jsonToken != null && jsonToken != JsonToken.e; jsonToken = jsonParser.a()) {
                if (jsonToken == JsonToken.b) {
                    return aw.a(jsonParser);
                }
            }
        }
        return null;
    }
    
    private static ArrayList B(final JsonParser jsonParser, final a a) {
        final ArrayList o = o(jsonParser, a);
        if (!o.isEmpty()) {
            final Iterator<bp> iterator = o.iterator();
            while (iterator.hasNext()) {
                if (!a(iterator.next())) {
                    iterator.remove();
                }
            }
            return o;
        }
        return null;
    }
    
    public static d C(final JsonParser jsonParser) {
        boolean l = true;
        final JsonToken d = jsonParser.d();
        final JsonToken b = JsonToken.b;
        String g = null;
        if (d == b) {
            for (JsonToken jsonToken = jsonParser.a(); jsonToken != null && jsonToken != JsonToken.c; jsonToken = jsonParser.a()) {
                switch (bi.a[jsonToken.ordinal()]) {
                    case 1:
                    case 4: {
                        jsonParser.c();
                        break;
                    }
                    case 2: {
                        if ("msg".equals(jsonParser.e())) {
                            g = jsonParser.g();
                            break;
                        }
                        break;
                    }
                    case 6:
                    case 7: {
                        if ("valid".equals(jsonParser.e())) {
                            l = jsonParser.l();
                            break;
                        }
                        break;
                    }
                }
            }
        }
        return new d(l, g);
    }
    
    private static b C(final JsonParser jsonParser, final a a) {
        JsonToken jsonToken = jsonParser.a();
        ArrayList list = null;
        xb f = null;
        int n = 0;
        bp bp = null;
        while (jsonToken != null && jsonToken != JsonToken.c) {
            xb xb = null;
            bp b = null;
            int n2 = 0;
            ArrayList q = null;
            switch (bi.a[jsonToken.ordinal()]) {
                default: {
                    final ArrayList list2 = list;
                    xb = f;
                    b = bp;
                    n2 = n;
                    q = list2;
                    break;
                }
                case 4: {
                    final String e = jsonParser.e();
                    if ("status".equals(e)) {
                        final JsonToken a2 = jsonParser.a();
                        xb xb2 = f;
                        b = bp;
                        for (JsonToken a3 = a2; a3 != null && a3 != JsonToken.c; a3 = jsonParser.a()) {
                            switch (bi.a[a3.ordinal()]) {
                                case 4: {
                                    final String e2 = jsonParser.e();
                                    if ("data".equals(e2)) {
                                        b = b(jsonParser, true, a);
                                        break;
                                    }
                                    if ("metadata".equals(e2)) {
                                        xb2 = (xb)wx.a(jsonParser, JsonTwitterStatusMetadata.class);
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
                        }
                        n2 = 1;
                        final xb xb3 = xb2;
                        q = list;
                        xb = xb3;
                        break;
                    }
                    if ("wtf".equals(e)) {
                        final JsonToken a4 = jsonParser.a();
                        q = list;
                        for (JsonToken a5 = a4; a5 != null && a5 != JsonToken.c; a5 = jsonParser.a()) {
                            switch (bi.a[a5.ordinal()]) {
                                case 4: {
                                    if ("data".equals(jsonParser.e())) {
                                        for (JsonToken jsonToken2 = jsonParser.a(); jsonToken2 != null && jsonToken2 != JsonToken.c; jsonToken2 = jsonParser.a()) {
                                            switch (bi.a[jsonToken2.ordinal()]) {
                                                case 4: {
                                                    jsonParser.c();
                                                    break;
                                                }
                                                case 1: {
                                                    if ("users".equals(jsonParser.e())) {
                                                        q = q(jsonParser, a);
                                                        break;
                                                    }
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
                        }
                        xb = f;
                        b = bp;
                        n2 = 2;
                        break;
                    }
                    jsonParser.c();
                    final ArrayList list3 = list;
                    xb = f;
                    b = bp;
                    n2 = n;
                    q = list3;
                    break;
                }
                case 1: {
                    jsonParser.c();
                    final ArrayList list4 = list;
                    xb = f;
                    b = bp;
                    n2 = n;
                    q = list4;
                    break;
                }
            }
            jsonToken = jsonParser.a();
            final ArrayList list5 = q;
            n = n2;
            bp = b;
            f = xb;
            list = list5;
        }
        switch (n) {
            case 1: {
                if (bp != null) {
                    if (f != null) {
                        bp.F = f;
                    }
                    return new b(n, bp, null);
                }
                break;
            }
            case 2: {
                if (list != null && !list.isEmpty()) {
                    return new b(n, null, list);
                }
                break;
            }
        }
        return null;
    }
    
    private static TimelineScribeContent D(final JsonParser jsonParser, final a a) {
        String g = null;
        JsonToken jsonToken = jsonParser.a();
        String g2 = null;
        String g3 = null;
        while (jsonToken != null && jsonToken != JsonToken.c) {
            switch (bi.a[jsonToken.ordinal()]) {
                case 2: {
                    final String e = jsonParser.e();
                    if ("source".equals(e)) {
                        g2 = jsonParser.g();
                        break;
                    }
                    if ("type".equals(e)) {
                        g3 = jsonParser.g();
                        break;
                    }
                    if ("impression_id".equals(e)) {
                        g = jsonParser.g();
                        break;
                    }
                    break;
                }
            }
            jsonToken = jsonParser.a();
        }
        return new TimelineScribeContent(g2, g, g3);
    }
    
    public static String D(final JsonParser jsonParser) {
        final JsonToken a = jsonParser.a();
        String g = null;
        for (JsonToken a2 = a; a2 != null && a2 != JsonToken.c; a2 = jsonParser.a()) {
            switch (bi.a[a2.ordinal()]) {
                case 2: {
                    if ("suggestion".equals(jsonParser.e())) {
                        g = jsonParser.g();
                        break;
                    }
                    break;
                }
                case 1:
                case 4: {
                    jsonParser.c();
                    break;
                }
            }
        }
        return g;
    }
    
    public static ArrayList E(final JsonParser jsonParser) {
        final ArrayList<String> list = new ArrayList<String>();
        for (JsonToken jsonToken = jsonParser.d(); jsonToken != null && jsonToken != JsonToken.e; jsonToken = jsonParser.a()) {
            if (jsonToken == JsonToken.b) {
                final String d = D(jsonParser);
                if (d != null) {
                    list.add(d);
                }
            }
        }
        return list;
    }
    
    private static wk E(final JsonParser jsonParser, final a a) {
        final wk wk = new wk();
        for (JsonToken jsonToken = jsonParser.a(); jsonToken != null && jsonToken != JsonToken.c; jsonToken = jsonParser.a()) {
            final String e = jsonParser.e();
            switch (bi.a[jsonToken.ordinal()]) {
                default: {
                    jsonParser.c();
                    break;
                }
                case 2: {
                    if ("id".equals(e)) {
                        wk.a = jsonParser.g();
                        break;
                    }
                    if ("title".equals(e)) {
                        wk.b = jsonParser.g();
                        break;
                    }
                    if ("image_url".equals(e)) {
                        wk.c = jsonParser.g();
                        break;
                    }
                    if ("author_name".equals(e)) {
                        wk.d = jsonParser.g();
                        break;
                    }
                    if ("article_description".equals(e)) {
                        wk.e = jsonParser.g();
                        break;
                    }
                    if ("article_url".equals(e)) {
                        wk.f = jsonParser.g();
                        break;
                    }
                    break;
                }
                case 4: {
                    if ("author_account".equals(e)) {
                        wk.h = a(jsonParser, true, a);
                        break;
                    }
                    jsonParser.c();
                    break;
                }
            }
        }
        return wk;
    }
    
    public static ActivitySummary F(final JsonParser jsonParser) {
        long[] c = null;
        long[] c2;
        String g;
        String g2;
        if (jsonParser.d() == JsonToken.b) {
            c2 = null;
            g = null;
            g2 = null;
            JsonToken jsonToken;
            do {
                jsonToken = jsonParser.a();
                switch (bi.a[jsonToken.ordinal()]) {
                    case 2: {
                        final String e = jsonParser.e();
                        if ("favoriters_count".equals(e)) {
                            g2 = jsonParser.g();
                            break;
                        }
                        if ("retweeters_count".equals(e)) {
                            g = jsonParser.g();
                            break;
                        }
                        break;
                    }
                    case 1: {
                        final String e2 = jsonParser.e();
                        if ("favoriters".equals(e2)) {
                            final ArrayList<Long> list = new ArrayList<Long>();
                            while (jsonToken != null && jsonToken != JsonToken.e) {
                                if (jsonToken == JsonToken.i) {
                                    list.add(jsonParser.i());
                                }
                                jsonToken = jsonParser.a();
                            }
                            c2 = CollectionUtils.c(list);
                            break;
                        }
                        if ("retweeters".equals(e2)) {
                            final ArrayList<Long> list2 = new ArrayList<Long>();
                            while (jsonToken != null && jsonToken != JsonToken.e) {
                                if (jsonToken == JsonToken.i) {
                                    list2.add(jsonParser.i());
                                }
                                jsonToken = jsonParser.a();
                            }
                            c = CollectionUtils.c(list2);
                            break;
                        }
                        jsonParser.c();
                        break;
                    }
                    case 4: {
                        jsonParser.c();
                        break;
                    }
                }
            } while (jsonToken != JsonToken.c);
        }
        else {
            c = null;
            c2 = null;
            g = null;
            g2 = null;
        }
        return new ActivitySummary(g2, g, c2, c);
    }
    
    public static ArrayList G(final JsonParser jsonParser) {
        JsonToken jsonToken = jsonParser.d();
        final ArrayList<bd> list = new ArrayList<bd>();
        while (jsonToken != null && jsonToken != JsonToken.c) {
            if (jsonToken == JsonToken.d && "errors".equals(jsonParser.e())) {
                JsonToken jsonToken2 = jsonParser.a();
                while (true) {
                    boolean b;
                    if (jsonToken2 != null) {
                        b = true;
                    }
                    else {
                        b = false;
                    }
                    boolean b2;
                    if (jsonToken2 != JsonToken.e) {
                        b2 = true;
                    }
                    else {
                        b2 = false;
                    }
                    if (!(b & b2)) {
                        break;
                    }
                    if (jsonToken2 == JsonToken.b) {
                        long long1 = 0L;
                        JsonToken jsonToken3 = jsonParser.a();
                        String g = null;
                        int h = 0;
                        String g2 = null;
                        String g3 = null;
                        int h2 = 0;
                        while (jsonToken3 != null && jsonToken3 != JsonToken.c) {
                            switch (bi.a[jsonToken3.ordinal()]) {
                                case 1:
                                case 4: {
                                    jsonParser.c();
                                    break;
                                }
                                case 2: {
                                    final String e = jsonParser.e();
                                    if ("message".equals(e)) {
                                        g3 = jsonParser.g();
                                        break;
                                    }
                                    if ("timestamp".equals(e)) {
                                        long1 = Long.parseLong(jsonParser.g());
                                        break;
                                    }
                                    if ("attribute".equals(e)) {
                                        g2 = jsonParser.g();
                                        break;
                                    }
                                    if ("bounce_location".equals(e)) {
                                        g = jsonParser.g();
                                        break;
                                    }
                                    break;
                                }
                                case 5: {
                                    final String e2 = jsonParser.e();
                                    if ("code".equals(e2)) {
                                        h2 = jsonParser.h();
                                        break;
                                    }
                                    if ("sub_error_code".equals(e2)) {
                                        h = jsonParser.h();
                                        break;
                                    }
                                    break;
                                }
                            }
                            jsonToken3 = jsonParser.a();
                        }
                        if (h2 > 0) {
                            list.add(new bd(h2, g3, long1, g2, h, g));
                        }
                    }
                    else if (jsonToken2 == JsonToken.d) {
                        jsonParser.c();
                    }
                    jsonToken2 = jsonParser.a();
                }
            }
            jsonToken = jsonParser.a();
        }
        return list;
    }
    
    public static ArrayList H(final JsonParser jsonParser) {
        final ArrayList list = new ArrayList();
        for (JsonToken jsonToken = jsonParser.d(); jsonToken != null && jsonToken != JsonToken.c; jsonToken = jsonParser.a()) {
            if (jsonToken == JsonToken.d) {
                final String e = jsonParser.e();
                if ("users".equals(e)) {
                    list.addAll(as(jsonParser));
                }
                else if ("topics".equals(e)) {
                    list.addAll(b(jsonParser, 3));
                }
                else if ("oneclick".equals(e)) {
                    list.addAll(b(jsonParser, 4));
                }
                else {
                    jsonParser.c();
                }
            }
        }
        return list;
    }
    
    public static TwitterTypeAheadGroup I(final JsonParser jsonParser) {
        List au = null;
        JsonToken jsonToken = jsonParser.a();
        List b = null;
        List as = null;
        List b2 = null;
        while (jsonToken != null && jsonToken != JsonToken.c) {
            switch (bi.a[jsonToken.ordinal()]) {
                case 1: {
                    final String e = jsonParser.e();
                    if ("users".equals(e)) {
                        as = as(jsonParser);
                        break;
                    }
                    if ("topics".equals(e)) {
                        b = b(jsonParser, 3);
                        break;
                    }
                    if ("hashtags".equals(e)) {
                        au = au(jsonParser);
                        break;
                    }
                    if ("oneclick".equals(e)) {
                        b2 = b(jsonParser, 4);
                        break;
                    }
                    jsonParser.c();
                    break;
                }
                case 4: {
                    jsonParser.c();
                    break;
                }
            }
            jsonToken = jsonParser.a();
        }
        return new TwitterTypeAheadGroup(as, b, au, b2);
    }
    
    public static bc J(final JsonParser jsonParser) {
        final ArrayList<Long> list = new ArrayList<Long>();
        final JsonToken a = jsonParser.a();
        String g = null;
    Label_0072:
        for (JsonToken a2 = a; a2 != null && a2 != JsonToken.c; a2 = jsonParser.a()) {
            switch (bi.a[a2.ordinal()]) {
                case 1: {
                    if (!"ids".equals(jsonParser.e())) {
                        jsonParser.c();
                        break;
                    }
                    JsonToken jsonToken = jsonParser.a();
                    while (true) {
                        boolean b;
                        if (jsonToken != null) {
                            b = true;
                        }
                        else {
                            b = false;
                        }
                        boolean b2;
                        if (jsonToken != JsonToken.e) {
                            b2 = true;
                        }
                        else {
                            b2 = false;
                        }
                        if (!(b & b2)) {
                            continue Label_0072;
                        }
                        if (jsonToken == JsonToken.i) {
                            list.add(jsonParser.i());
                        }
                        jsonToken = jsonParser.a();
                    }
                    break;
                }
                case 2: {
                    if ("next_cursor_str".equals(jsonParser.e())) {
                        g = jsonParser.g();
                        break;
                    }
                    break;
                }
                case 4: {
                    jsonParser.c();
                    break;
                }
            }
        }
        return new bc(g, list);
    }
    
    public static as K(final JsonParser jsonParser) {
        String g = null;
        JsonToken jsonToken = jsonParser.a();
        String g2 = null;
        String a = null;
        String a2 = null;
        String a3 = null;
        String a4 = null;
        String a5 = null;
        while (jsonToken != null && jsonToken != JsonToken.c) {
            switch (bi.a[jsonToken.ordinal()]) {
                case 1: {
                    final String e = jsonParser.e();
                    for (JsonToken jsonToken2 = jsonParser.a(); jsonToken2 != null && jsonToken2 != JsonToken.e; jsonToken2 = jsonParser.a()) {
                        switch (bi.a[jsonToken2.ordinal()]) {
                            case 1:
                            case 4: {
                                jsonParser.c();
                                break;
                            }
                            case 2: {
                                if ("fullname".equals(e) && a5 == null) {
                                    a5 = yj.a.b(jsonParser.g()).a;
                                    break;
                                }
                                if ("screen_name".equals(e) && a2 == null) {
                                    a2 = yj.a.b(jsonParser.g()).a;
                                    break;
                                }
                                if ("password".equals(e) && a == null) {
                                    a = yj.a.b(jsonParser.g()).a;
                                    break;
                                }
                                if ("email".equals(e) && a4 == null) {
                                    a4 = yj.a.b(jsonParser.g()).a;
                                    break;
                                }
                                if ("phone_number".equals(e) && a3 == null) {
                                    a3 = yj.a.b(jsonParser.g()).a;
                                    break;
                                }
                                break;
                            }
                        }
                    }
                    break;
                }
                case 4: {
                    jsonParser.c();
                    break;
                }
                case 2: {
                    final String e2 = jsonParser.e();
                    if ("captcha_token".equals(e2)) {
                        g2 = jsonParser.g();
                        break;
                    }
                    if ("captcha_image_url".equals(e2)) {
                        g = jsonParser.g();
                        break;
                    }
                    break;
                }
            }
            jsonToken = jsonParser.a();
        }
        return new as(a5, a4, a3, a2, a, g2, g);
    }
    
    public static com.twitter.library.api.q L(final JsonParser jsonParser) {
        final JsonToken a = jsonParser.a();
        String g = null;
        int h = 0;
        for (JsonToken a2 = a; a2 != null && a2 != JsonToken.c; a2 = jsonParser.a()) {
            switch (bi.a[a2.ordinal()]) {
                case 5: {
                    if ("build_number".equals(jsonParser.e())) {
                        h = jsonParser.h();
                        break;
                    }
                    break;
                }
                case 2: {
                    if ("checksum".equals(jsonParser.e())) {
                        g = jsonParser.g();
                        break;
                    }
                    break;
                }
                case 1:
                case 4: {
                    jsonParser.c();
                    break;
                }
            }
        }
        return new com.twitter.library.api.q(h, g);
    }
    
    public static ArrayList M(final JsonParser jsonParser) {
        final ArrayList<TwitterLocation> list = new ArrayList<TwitterLocation>();
        for (JsonToken jsonToken = jsonParser.a(); jsonToken != null && jsonToken != JsonToken.e; jsonToken = jsonParser.a()) {
            if (jsonToken == JsonToken.b) {
                JsonToken jsonToken2 = jsonParser.a();
                String g = null;
                String g2 = null;
                long i = 0L;
                String g3 = null;
                while (jsonToken2 != null && jsonToken2 != JsonToken.c) {
                    switch (bi.a[jsonToken2.ordinal()]) {
                        case 2: {
                            final String e = jsonParser.e();
                            if ("name".equals(e)) {
                                g3 = jsonParser.g();
                                break;
                            }
                            if ("country".equals(e)) {
                                g2 = jsonParser.g();
                                break;
                            }
                            if ("countryCode".equals(e)) {
                                g = jsonParser.g();
                                break;
                            }
                            break;
                        }
                        case 5: {
                            if ("woeid".equals(jsonParser.e())) {
                                i = jsonParser.i();
                                break;
                            }
                            break;
                        }
                        case 1:
                        case 4: {
                            jsonParser.c();
                            break;
                        }
                    }
                    jsonToken2 = jsonParser.a();
                }
                if (g3 != null && i != 0L) {
                    list.add(new TwitterLocation(g3, i, g2, g));
                }
            }
            else if (jsonToken == JsonToken.d) {
                jsonParser.c();
            }
        }
        return list;
    }
    
    public static HashMap N(final JsonParser jsonParser) {
        final HashMap<String, TwitterUser> hashMap = new HashMap<String, TwitterUser>();
        for (JsonToken jsonToken = jsonParser.a(); jsonToken != null && jsonToken != JsonToken.c; jsonToken = jsonParser.a()) {
            if (jsonToken == JsonToken.b) {
                hashMap.put(jsonParser.e(), a(jsonParser, true, null));
            }
            else if (jsonToken == JsonToken.d) {
                jsonParser.c();
            }
        }
        return hashMap;
    }
    
    public static Boolean O(final JsonParser jsonParser) {
        for (JsonToken jsonToken = jsonParser.a(); jsonToken != null && jsonToken != JsonToken.c; jsonToken = jsonParser.a()) {
            switch (bi.a[jsonToken.ordinal()]) {
                case 1: {
                    jsonParser.c();
                    break;
                }
                case 2: {
                    if (jsonParser.e().equals("is_device_follow")) {
                        return Boolean.parseBoolean(jsonParser.g());
                    }
                    break;
                }
            }
        }
        return false;
    }
    
    public static ak P(final JsonParser jsonParser) {
        final ak ak = new ak();
        try {
            for (JsonToken jsonToken = jsonParser.a(); jsonToken != null && jsonToken != JsonToken.c; jsonToken = jsonParser.a()) {
                switch (bi.a[jsonToken.ordinal()]) {
                    case 2: {
                        if ("normalized_phone_number".equals(jsonParser.e())) {
                            ak.c = jsonParser.g();
                            break;
                        }
                        break;
                    }
                    case 7: {
                        if ("valid".equals(jsonParser.e())) {
                            ak.a = true;
                            break;
                        }
                        if ("available".equals(jsonParser.e())) {
                            ak.b = true;
                            break;
                        }
                        break;
                    }
                }
            }
        }
        catch (IOException ex) {}
        return ak;
    }
    
    public static ac Q(final JsonParser jsonParser) {
        final ac ac = new ac();
        try {
            for (JsonToken jsonToken = jsonParser.a(); jsonToken != null && jsonToken != JsonToken.c; jsonToken = jsonParser.a()) {
                switch (bi.a[jsonToken.ordinal()]) {
                    case 2: {
                        if ("campaign".equals(jsonParser.e())) {
                            ac.a.put("campaign", jsonParser.g());
                            break;
                        }
                        if ("content".equals(jsonParser.e())) {
                            ac.a.put("content", jsonParser.g());
                            break;
                        }
                        if ("src".equals(jsonParser.e())) {
                            ac.a.put("src", jsonParser.g());
                            break;
                        }
                        if ("group".equals(jsonParser.e())) {
                            ac.a.put("group", jsonParser.g());
                            break;
                        }
                        if ("term".equals(jsonParser.e())) {
                            ac.a.put("term", jsonParser.g());
                            break;
                        }
                        break;
                    }
                }
            }
        }
        catch (IOException ex) {}
        return ac;
    }
    
    public static FeatureSwitchesManifest R(final JsonParser jsonParser) {
        String g = null;
        JsonToken a = jsonParser.a();
        SettingVersionDetails v = null;
        e s = null;
        HashSet set = null;
        HashSet set2 = null;
        HashSet set3 = null;
        HashMap hashMap = null;
        HashMap aj = null;
        while (a != null && a != JsonToken.c) {
            HashSet ai = null;
            HashSet set4 = null;
            HashMap hashMap2 = null;
            HashSet set6 = null;
            switch (bi.a[a.ordinal()]) {
                default: {
                    ai = set2;
                    set4 = set3;
                    final HashSet set5 = set;
                    hashMap2 = hashMap;
                    set6 = set5;
                    break;
                }
                case 4: {
                    if ("default".equals(jsonParser.e())) {
                        final JsonToken a2 = jsonParser.a();
                        HashMap w = hashMap;
                        HashSet x = set3;
                        for (JsonToken a3 = a2; a3 != null && a3 != JsonToken.c; a3 = jsonParser.a()) {
                            switch (bi.a[a3.ordinal()]) {
                                case 4: {
                                    if ("config".equals(jsonParser.e())) {
                                        w = W(jsonParser);
                                        break;
                                    }
                                    jsonParser.c();
                                    break;
                                }
                                case 1: {
                                    if ("impressions".equals(jsonParser.e())) {
                                        x = X(jsonParser);
                                        break;
                                    }
                                    jsonParser.c();
                                    break;
                                }
                                case 2: {
                                    if ("feature_set_token".equals(jsonParser.e())) {
                                        g = jsonParser.g();
                                        break;
                                    }
                                    break;
                                }
                            }
                        }
                        final HashSet set7 = set;
                        hashMap2 = w;
                        ai = set2;
                        set4 = x;
                        set6 = set7;
                        break;
                    }
                    if ("debug".equals(jsonParser.e())) {
                        s = S(jsonParser);
                        ai = set2;
                        set4 = set3;
                        final HashSet set8 = set;
                        hashMap2 = hashMap;
                        set6 = set8;
                        break;
                    }
                    if ("versions".equals(jsonParser.e())) {
                        v = V(jsonParser);
                        ai = set2;
                        set4 = set3;
                        final HashSet set9 = set;
                        hashMap2 = hashMap;
                        set6 = set9;
                        break;
                    }
                    jsonParser.c();
                    ai = set2;
                    set4 = set3;
                    final HashSet set10 = set;
                    hashMap2 = hashMap;
                    set6 = set10;
                    break;
                }
                case 1: {
                    if ("requires_restart".equals(jsonParser.e())) {
                        ai = aI(jsonParser);
                        set4 = set3;
                        final HashSet set11 = set;
                        hashMap2 = hashMap;
                        set6 = set11;
                        break;
                    }
                    if ("experiment_names".equals(jsonParser.e())) {
                        final HashSet ai2 = aI(jsonParser);
                        hashMap2 = hashMap;
                        set6 = ai2;
                        ai = set2;
                        set4 = set3;
                        break;
                    }
                    if ("embedded_experiments".equals(jsonParser.e())) {
                        aj = aJ(jsonParser);
                        ai = set2;
                        set4 = set3;
                        final HashSet set12 = set;
                        hashMap2 = hashMap;
                        set6 = set12;
                        break;
                    }
                    jsonParser.c();
                    ai = set2;
                    set4 = set3;
                    final HashSet set13 = set;
                    hashMap2 = hashMap;
                    set6 = set13;
                    break;
                }
            }
            final JsonToken a4 = jsonParser.a();
            set3 = set4;
            set2 = ai;
            a = a4;
            final HashSet set14 = set6;
            hashMap = hashMap2;
            set = set14;
        }
        if (hashMap == null) {
            throw new InvalidDataException("'default' does not exist in the manifest.");
        }
        HashSet set15;
        if (set3 == null) {
            set15 = new HashSet();
        }
        else {
            set15 = set3;
        }
        if (set2 == null) {
            set2 = new HashSet();
        }
        if (set == null) {
            set = new HashSet();
        }
        HashMap hashMap3;
        if (aj == null) {
            hashMap3 = new HashMap();
        }
        else {
            hashMap3 = aj;
        }
        return new FeatureSwitchesManifest(hashMap, set15, s, set2, set, hashMap3, v, g);
    }
    
    public static e S(final JsonParser jsonParser) {
        final JsonToken a = jsonParser.a();
        HashMap ad = null;
        for (JsonToken a2 = a; a2 != null && a2 != JsonToken.c; a2 = jsonParser.a()) {
            switch (bi.a[a2.ordinal()]) {
                case 1: {
                    if ("facets".equals(jsonParser.e())) {
                        ad = aD(jsonParser);
                        break;
                    }
                    jsonParser.c();
                    break;
                }
                case 4: {
                    jsonParser.c();
                    break;
                }
            }
        }
        if (ad == null) {
            ad = new HashMap();
        }
        return new e(ad);
    }
    
    public static FeatureSwitchesParameter T(final JsonParser jsonParser) {
        String g = null;
        final ArrayList<Object> list = new ArrayList<Object>();
        JsonToken jsonToken = jsonParser.a();
        Object o = null;
        while (jsonToken != null && jsonToken != JsonToken.c) {
            switch (bi.a[jsonToken.ordinal()]) {
                case 2: {
                    if ("name".equals(jsonParser.e())) {
                        g = jsonParser.g();
                        break;
                    }
                    break;
                }
                case 4: {
                    if ("default".equals(jsonParser.e())) {
                        for (JsonToken jsonToken2 = jsonParser.a(); jsonToken2 != null && jsonToken2 != JsonToken.c; jsonToken2 = jsonParser.a()) {
                            if (jsonToken2.e() && "value".equals(jsonParser.e())) {
                                o = aG(jsonParser);
                            }
                            else if (jsonToken2 == JsonToken.d) {
                                o = aH(jsonParser);
                            }
                        }
                        break;
                    }
                    break;
                }
                case 1: {
                    if ("enumeration_values".equals(jsonParser.e())) {
                        for (JsonToken jsonToken3 = jsonParser.a(); jsonToken3 != null && jsonToken3 != JsonToken.e; jsonToken3 = jsonParser.a()) {
                            switch (bi.a[jsonToken3.ordinal()]) {
                                default: {
                                    final Object ag = aG(jsonParser);
                                    if (ag != null) {
                                        list.add(ag);
                                        break;
                                    }
                                    break;
                                }
                                case 1:
                                case 4: {
                                    jsonParser.c();
                                    break;
                                }
                            }
                        }
                        break;
                    }
                    break;
                }
            }
            jsonToken = jsonParser.a();
        }
        return new FeatureSwitchesParameter(g, o, list);
    }
    
    public static FeatureSwitchesConfig U(final JsonParser jsonParser) {
        HashSet ai = null;
        JsonToken jsonToken = jsonParser.a();
        HashSet x = null;
        HashMap w = null;
        SettingVersionDetails v = null;
        while (jsonToken != null && jsonToken != JsonToken.c) {
            switch (bi.a[jsonToken.ordinal()]) {
                case 4: {
                    if ("config".equals(jsonParser.e())) {
                        w = W(jsonParser);
                        break;
                    }
                    if ("versions".equals(jsonParser.e())) {
                        v = V(jsonParser);
                        break;
                    }
                    jsonParser.c();
                    break;
                }
                case 1: {
                    if ("impressions".equals(jsonParser.e())) {
                        x = X(jsonParser);
                        break;
                    }
                    if ("embedded_darkmoded".equals(jsonParser.e())) {
                        ai = aI(jsonParser);
                        break;
                    }
                    jsonParser.c();
                    break;
                }
            }
            jsonToken = jsonParser.a();
        }
        if (w == null) {
            throw new InvalidDataException("Invalid feature switch Configs");
        }
        if (ai == null) {
            ai = new HashSet();
        }
        return new FeatureSwitchesConfig(w, x, ai, v);
    }
    
    public static SettingVersionDetails V(final JsonParser jsonParser) {
        String g = null;
        JsonToken jsonToken = jsonParser.a();
        String g2 = null;
        while (jsonToken != null && jsonToken != JsonToken.c) {
            if (jsonToken == JsonToken.h) {
                if ("experiments".equals(jsonParser.e())) {
                    g = jsonParser.g();
                }
                else if ("feature_switches".equals(jsonParser.e())) {
                    g2 = jsonParser.g();
                }
            }
            else if (jsonToken == JsonToken.d || jsonToken == JsonToken.b) {
                jsonParser.c();
            }
            jsonToken = jsonParser.a();
        }
        if (g == null || g2 == null) {
            throw new InvalidDataException("Invalid version information");
        }
        return new SettingVersionDetails(g, g2);
    }
    
    public static HashMap W(final JsonParser jsonParser) {
        final HashMap<String, FeatureSwitchesValue> hashMap = new HashMap<String, FeatureSwitchesValue>();
        for (JsonToken jsonToken = jsonParser.a(); jsonToken != null && jsonToken != JsonToken.c; jsonToken = jsonParser.a()) {
            if (jsonToken == JsonToken.b) {
                hashMap.put(jsonParser.e(), aF(jsonParser));
            }
            else if (jsonToken == JsonToken.d) {
                jsonParser.c();
            }
        }
        return hashMap;
    }
    
    public static HashSet X(final JsonParser jsonParser) {
        final HashSet<FeatureSwitchesValue$FeatureSwitchesImpression> set = new HashSet<FeatureSwitchesValue$FeatureSwitchesImpression>();
        for (JsonToken jsonToken = jsonParser.a(); jsonToken != null && jsonToken != JsonToken.e; jsonToken = jsonParser.a()) {
            final JsonToken a = jsonParser.a();
            String g = null;
            String g2 = null;
            JsonToken a2 = a;
            Integer value = null;
            while (a2 != null && a2 != JsonToken.c) {
                switch (bi.a[a2.ordinal()]) {
                    case 2: {
                        if ("key".equals(jsonParser.e())) {
                            g2 = jsonParser.g();
                            break;
                        }
                        if ("bucket".equals(jsonParser.e())) {
                            g = jsonParser.g();
                            break;
                        }
                        break;
                    }
                    case 5: {
                        if ("version".equals(jsonParser.e())) {
                            value = jsonParser.h();
                            break;
                        }
                        break;
                    }
                }
                a2 = jsonParser.a();
            }
            if (g2 == null || g == null || value == null) {
                throw new InvalidDataException("Invalid data found for FeatureSwitchesParam");
            }
            set.add(new FeatureSwitchesValue$FeatureSwitchesImpression(g2, value, g));
        }
        return set;
    }
    
    public static String Y(final JsonParser jsonParser) {
        final JsonToken a = jsonParser.a();
        String g = null;
        for (JsonToken a2 = a; a2 != null && a2 != JsonToken.c; a2 = jsonParser.a()) {
            switch (bi.a[a2.ordinal()]) {
                case 1:
                case 4: {
                    jsonParser.c();
                    break;
                }
                case 2: {
                    if ("access_token".equals(jsonParser.e())) {
                        g = jsonParser.g();
                        break;
                    }
                    break;
                }
            }
        }
        return g;
    }
    
    public static String Z(final JsonParser jsonParser) {
        final JsonToken a = jsonParser.a();
        String g = null;
        for (JsonToken a2 = a; a2 != null && a2 != JsonToken.c; a2 = jsonParser.a()) {
            switch (bi.a[a2.ordinal()]) {
                case 1:
                case 4: {
                    jsonParser.c();
                    break;
                }
                case 2: {
                    if ("guest_token".equals(jsonParser.e())) {
                        g = jsonParser.g();
                        break;
                    }
                    break;
                }
            }
        }
        return g;
    }
    
    private static int a(final JsonParser jsonParser, final ArrayList list) {
        JsonToken jsonToken = jsonParser.a();
        int n = -1;
        while (jsonToken != null && jsonToken != JsonToken.c) {
            switch (bi.a[jsonToken.ordinal()]) {
                case 2: {
                    if (!"suggestion_type".equals(jsonParser.e())) {
                        break;
                    }
                    final String g = jsonParser.g();
                    if ("spelling".equals(g)) {
                        n = 2;
                        break;
                    }
                    if ("related".equals(g)) {
                        n = 3;
                        break;
                    }
                    break;
                }
                case 1: {
                    if ("suggestions".equals(jsonParser.e())) {
                        b(jsonParser, list);
                        break;
                    }
                    jsonParser.c();
                    break;
                }
                case 4: {
                    jsonParser.c();
                    break;
                }
            }
            jsonToken = jsonParser.a();
        }
        if (list == null || list.isEmpty()) {
            n = -1;
        }
        return n;
    }
    
    private static int a(final JsonParser jsonParser, final ArrayList list, final a a) {
        JsonToken jsonToken = jsonParser.a();
        int a2 = -1;
        while (jsonToken != null && jsonToken != JsonToken.c) {
            switch (bi.a[jsonToken.ordinal()]) {
                case 2: {
                    if ("context_type".equals(jsonParser.e())) {
                        a2 = TwitterSearchSummary.a(jsonParser.g());
                        break;
                    }
                    break;
                }
                case 4: {
                    jsonParser.c();
                    break;
                }
                case 1: {
                    list.addAll(d(jsonParser, a));
                    break;
                }
            }
            jsonToken = jsonParser.a();
        }
        if (list.isEmpty()) {
            a2 = -1;
        }
        return a2;
    }
    
    public static JsonParser a(final InputStream inputStream) {
        final JsonParser b = bh.a.b(inputStream);
        b.a();
        return b;
    }
    
    private static Conversation$Metadata a(final JsonParser jsonParser, final HashMap hashMap, final a a) {
        JsonToken a2 = jsonParser.a();
        TwitterUser twitterUser = null;
        ArrayList<Conversation$Participant> list = new ArrayList<Conversation$Participant>();
        int h = 0;
        long long1 = 0L;
        int h2 = 0;
        while (a2 != null && a2 != JsonToken.c) {
            ArrayList<Conversation$Participant> b = null;
            Label_0084: {
                switch (bi.a[a2.ordinal()]) {
                    case 5: {
                        final String e = jsonParser.e();
                        if ("participants_count".equals(e)) {
                            h = jsonParser.h();
                            b = list;
                            break Label_0084;
                        }
                        if ("target_count".equals(e)) {
                            h2 = jsonParser.h();
                            b = list;
                            break Label_0084;
                        }
                        break;
                    }
                    case 2: {
                        final String e2 = jsonParser.e();
                        if ("root_user_id".equals(e2)) {
                            final String g = jsonParser.g();
                            final TwitterUser twitterUser2 = hashMap.get(jsonParser.g());
                            if (twitterUser2 == null && a != null) {
                                a.a(new InvalidDataException("Root user " + g + " not in users map"));
                            }
                            twitterUser = twitterUser2;
                            b = list;
                            break Label_0084;
                        }
                        if ("target_tweet_id".equals(e2)) {
                            long1 = Long.parseLong(jsonParser.g());
                            b = list;
                            break Label_0084;
                        }
                        break;
                    }
                    case 1: {
                        if ("participant_ids".equals(jsonParser.e())) {
                            b = (ArrayList<Conversation$Participant>)b(jsonParser, hashMap, a);
                            break Label_0084;
                        }
                        jsonParser.c();
                        b = list;
                        break Label_0084;
                    }
                    case 4: {
                        jsonParser.c();
                        b = list;
                        break Label_0084;
                    }
                }
                b = list;
            }
            final JsonToken a3 = jsonParser.a();
            final ArrayList<Conversation$Participant> list2 = b;
            a2 = a3;
            list = list2;
        }
        if (twitterUser != null) {
            final Iterator<Conversation$Participant> iterator = list.iterator();
            while (true) {
                while (iterator.hasNext()) {
                    if (iterator.next().id == twitterUser.userId) {
                        final int n = 1;
                        if (n == 0) {
                            list.add(0, new Conversation$Participant(twitterUser));
                            return new Conversation$Metadata(long1, h2, list.toArray(new Conversation$Participant[list.size()]), h);
                        }
                        return new Conversation$Metadata(long1, h2, list.toArray(new Conversation$Participant[list.size()]), h);
                    }
                }
                final int n = 0;
                continue;
            }
        }
        return new Conversation$Metadata(long1, h2, list.toArray(new Conversation$Participant[list.size()]), h);
    }
    
    private static TweetClassicCard a(final JsonParser jsonParser, final int n) {
        String g = null;
        String g2 = null;
        String g3 = null;
        String s = null;
        String s2 = null;
        int n2 = 0;
        int n3 = 0;
        int n4 = 0;
        String s3 = null;
        String s4 = null;
        TwitterUser a = null;
        TwitterUser a2 = null;
        JsonToken a6;
        for (JsonToken a3 = jsonParser.a(); a3 != null && a3 != JsonToken.c; a3 = a6) {
            int h = 0;
            int h2 = 0;
            Label_0100: {
                switch (bi.a[a3.ordinal()]) {
                    case 1: {
                        if ("players".equals(jsonParser.e())) {
                            for (JsonToken jsonToken = jsonParser.a(); jsonToken != null && jsonToken != JsonToken.e; jsonToken = jsonParser.a()) {
                                if (jsonToken == JsonToken.b) {
                                    JsonToken jsonToken2 = jsonParser.a();
                                    String g4 = null;
                                    String g5 = null;
                                    while (jsonToken2 != null && jsonToken2 != JsonToken.c) {
                                        final String e = jsonParser.e();
                                        if ("source_url".equals(e)) {
                                            g4 = jsonParser.g();
                                        }
                                        else if ("source_type".equals(e)) {
                                            g5 = jsonParser.g();
                                        }
                                        jsonToken2 = jsonParser.a();
                                    }
                                    if ("text/html".equals(g5) && TextUtils.isEmpty((CharSequence)s3) && !TextUtils.isEmpty((CharSequence)g4)) {
                                        s3 = g4;
                                    }
                                    else if (g5 != null && TextUtils.isEmpty((CharSequence)s4) && !TextUtils.isEmpty((CharSequence)g4)) {
                                        if (bq.c(g5)) {
                                            n4 = 1;
                                            s4 = g4;
                                        }
                                        else if (g5.startsWith("audio/mp3") || g5.startsWith("audio/aac")) {
                                            n4 = 2;
                                            s4 = g4;
                                        }
                                        else if (g5.startsWith("audio/mp4") && g5.contains("mp4a.40.2")) {
                                            n4 = 2;
                                            s4 = g4;
                                        }
                                        else if (g5.startsWith("audio/ogg") && g5.contains("vorbis")) {
                                            n4 = 2;
                                            s4 = g4;
                                        }
                                    }
                                }
                                else if (jsonToken == JsonToken.d) {
                                    jsonParser.c();
                                }
                            }
                            break;
                        }
                        jsonParser.c();
                        h = n3;
                        h2 = n2;
                        break Label_0100;
                    }
                    case 4: {
                        final String e2 = jsonParser.e();
                        if ("site_user".equals(e2)) {
                            a = a(jsonParser, true, null);
                            h = n3;
                            h2 = n2;
                            break Label_0100;
                        }
                        if ("author_user".equals(e2)) {
                            a2 = a(jsonParser, true, null);
                            h = n3;
                            h2 = n2;
                            break Label_0100;
                        }
                        if ("images".equals(e2)) {
                            final JsonToken a4 = jsonParser.a();
                            h = n3;
                            h2 = n2;
                            for (JsonToken a5 = a4; a5 != null && a5 != JsonToken.c; a5 = jsonParser.a()) {
                                switch (bi.a[a5.ordinal()]) {
                                    case 1: {
                                        jsonParser.c();
                                        break;
                                    }
                                    case 4: {
                                        if ("mobile".equals(jsonParser.e())) {
                                            JsonToken jsonToken3 = jsonParser.a();
                                            final String s5 = s2;
                                            String g6 = s;
                                            String g7 = s5;
                                            while (jsonToken3 != null && jsonToken3 != JsonToken.c) {
                                                final String e3 = jsonParser.e();
                                                switch (bi.a[jsonToken3.ordinal()]) {
                                                    case 5: {
                                                        if ("width".equals(e3)) {
                                                            h2 = jsonParser.h();
                                                            break;
                                                        }
                                                        if ("height".equals(e3)) {
                                                            h = jsonParser.h();
                                                            break;
                                                        }
                                                        break;
                                                    }
                                                    case 2: {
                                                        if ("image_url".equals(e3)) {
                                                            g6 = jsonParser.g();
                                                            break;
                                                        }
                                                        if ("image_url_2x".equals(e3)) {
                                                            g7 = jsonParser.g();
                                                            break;
                                                        }
                                                        break;
                                                    }
                                                    case 1:
                                                    case 4: {
                                                        jsonParser.c();
                                                        break;
                                                    }
                                                }
                                                jsonToken3 = jsonParser.a();
                                            }
                                            final String s6 = g7;
                                            s = g6;
                                            s2 = s6;
                                            break;
                                        }
                                        jsonParser.c();
                                        break;
                                    }
                                }
                            }
                            break Label_0100;
                        }
                        jsonParser.c();
                        h = n3;
                        h2 = n2;
                        break Label_0100;
                    }
                    case 2: {
                        final String e4 = jsonParser.e();
                        if ("url".equals(e4)) {
                            g = jsonParser.g();
                            h = n3;
                            h2 = n2;
                            break Label_0100;
                        }
                        if ("title".equals(e4)) {
                            g2 = jsonParser.g();
                            h = n3;
                            h2 = n2;
                            break Label_0100;
                        }
                        if ("description".equals(e4)) {
                            g3 = jsonParser.g();
                            h = n3;
                            h2 = n2;
                            break Label_0100;
                        }
                        break;
                    }
                }
                h = n3;
                h2 = n2;
            }
            a6 = jsonParser.a();
            n2 = h2;
            n3 = h;
        }
        switch (n) {
            case 1: {
                if (TextUtils.isEmpty((CharSequence)s) && TextUtils.isEmpty((CharSequence)s2)) {
                    return null;
                }
                break;
            }
            case 2: {
                if (TextUtils.isEmpty((CharSequence)s4) && TextUtils.isEmpty((CharSequence)s3)) {
                    return null;
                }
                break;
            }
        }
        return new TweetClassicCard(n, g2, g3, g, s, s2, Size.a(n2, n3), n4, s3, s4, a, a2);
    }
    
    public static TweetEntities a(final JsonParser jsonParser) {
        return (TweetEntities)k.a(wx.a(jsonParser, JsonTweetEntities.class), TweetEntities.a);
    }
    
    private static TwitterSocialProof a(final JsonParser jsonParser, final HashMap hashMap) {
        final ArrayList<TwitterUser> list = new ArrayList<TwitterUser>();
        JsonToken a = jsonParser.a();
        int int1 = 0;
        String s = null;
        String s2 = null;
        while (a != null && a != JsonToken.c) {
            String s3 = null;
            String s4 = null;
            int n2 = 0;
            Label_0084: {
                switch (bi.a[a.ordinal()]) {
                    case 2: {
                        if ("type".equals(jsonParser.e())) {
                            final String g = jsonParser.g();
                            final int n = int1;
                            s3 = s;
                            s4 = g;
                            n2 = n;
                            break Label_0084;
                        }
                        if ("text".equals(jsonParser.e())) {
                            final String g2 = jsonParser.g();
                            s4 = s2;
                            n2 = int1;
                            s3 = g2;
                            break Label_0084;
                        }
                        break;
                    }
                    case 4: {
                        if ("users".equals(jsonParser.e())) {
                            for (JsonToken jsonToken = jsonParser.a(); jsonToken != null && jsonToken != JsonToken.c; jsonToken = jsonParser.a()) {
                                switch (bi.a[jsonToken.ordinal()]) {
                                    case 2: {
                                        if ("count".equals(jsonParser.e())) {
                                            int1 = Integer.parseInt(jsonParser.g());
                                            break;
                                        }
                                        break;
                                    }
                                    case 1: {
                                        if ("ids".equals(jsonParser.e())) {
                                            for (JsonToken jsonToken2 = jsonParser.a(); jsonToken2 != null && jsonToken2 != JsonToken.e; jsonToken2 = jsonParser.a()) {
                                                if (jsonToken2 == JsonToken.h) {
                                                    final TwitterUser twitterUser = hashMap.get(jsonParser.g());
                                                    if (twitterUser != null) {
                                                        list.add(twitterUser);
                                                    }
                                                }
                                                else {
                                                    jsonParser.c();
                                                }
                                            }
                                            break;
                                        }
                                        jsonParser.c();
                                        break;
                                    }
                                    case 4: {
                                        jsonParser.c();
                                        break;
                                    }
                                }
                            }
                            break;
                        }
                        jsonParser.c();
                        n2 = int1;
                        s3 = s;
                        s4 = s2;
                        break Label_0084;
                    }
                    case 1: {
                        jsonParser.c();
                        n2 = int1;
                        s3 = s;
                        s4 = s2;
                        break Label_0084;
                    }
                }
                n2 = int1;
                s3 = s;
                s4 = s2;
            }
            final JsonToken a2 = jsonParser.a();
            s2 = s4;
            s = s3;
            int1 = n2;
            a = a2;
        }
        String s5;
        int n3;
        int n4;
        String s6;
        if (s != null) {
            int intValue;
            if (bh.d.containsKey(s2)) {
                intValue = bh.d.get(s2);
            }
            else {
                intValue = 28;
            }
            s5 = s;
            n3 = int1;
            n4 = intValue;
            s6 = null;
        }
        else if ("favorite".equals(s2)) {
            if (list.isEmpty()) {
                n3 = int1;
                n4 = 17;
                s6 = null;
                s5 = null;
            }
            else {
                final int size = list.size();
                final int n5 = int1 - size;
                final String c = list.get(0).c();
                String c2;
                if (size > 1) {
                    c2 = list.get(1).c();
                }
                else {
                    c2 = null;
                }
                int n6;
                if (n5 == 0) {
                    n6 = 16;
                }
                else {
                    n6 = 33;
                }
                s5 = c;
                n3 = n5;
                final int n7 = n6;
                s6 = c2;
                n4 = n7;
            }
        }
        else {
            n3 = int1;
            n4 = -1;
            s6 = null;
            s5 = null;
        }
        return (TwitterSocialProof)new bo().a(n4).a(s5).b(n3).b(s6).f();
    }
    
    private static TwitterSocialProof a(final JsonSocialProof jsonSocialProof, final HashMap hashMap) {
        if (jsonSocialProof != null && "followed_by".equals(jsonSocialProof.a)) {
            final ArrayList<TwitterUser> list = new ArrayList<TwitterUser>(jsonSocialProof.b.length);
            final String[] b = jsonSocialProof.b;
            for (int length = b.length, i = 0; i < length; ++i) {
                final TwitterUser twitterUser = hashMap.get(b[i]);
                if (twitterUser != null) {
                    list.add(twitterUser);
                }
            }
            if (!list.isEmpty()) {
                final int size = list.size();
                final String name = list.get(0).name;
                String name2 = null;
                if (size > 1) {
                    name2 = list.get(1).name;
                }
                int n;
                if (size > 2) {
                    n = size - 2;
                }
                else {
                    n = 0;
                }
                return (TwitterSocialProof)new bo().a(3).a(name).b(name2).g(n).f();
            }
        }
        return null;
    }
    
    public static TwitterUser a(final JsonParser jsonParser, final boolean b, final a a) {
        final TwitterUser y = new TwitterUser();
        y.hasEmptyExtendedProfile = false;
        String s = null;
        String s2 = null;
        TweetEntities tweetEntities = null;
        int n = 128;
        JsonToken a5;
        for (JsonToken a2 = jsonParser.a(); a2 != null && a2 != JsonToken.c; a2 = a5) {
            int n2 = 0;
            TweetEntities tweetEntities2 = null;
            String s3 = null;
            String s4 = null;
            Label_0116: {
                switch (bi.a[a2.ordinal()]) {
                    case 2: {
                        final String e = jsonParser.e();
                        if ("name".equals(e)) {
                            y.a(jsonParser.g());
                            n2 = n;
                            tweetEntities2 = tweetEntities;
                            s3 = s2;
                            s4 = s;
                            break Label_0116;
                        }
                        if ("screen_name".equals(e)) {
                            y.e(jsonParser.g());
                            n2 = n;
                            tweetEntities2 = tweetEntities;
                            s3 = s2;
                            s4 = s;
                            break Label_0116;
                        }
                        if ("profile_image_url_https".equals(e)) {
                            y.b(jsonParser.g());
                            n2 = n;
                            tweetEntities2 = tweetEntities;
                            s3 = s2;
                            s4 = s;
                            break Label_0116;
                        }
                        if ("profile_banner_url".equals(e)) {
                            y.g(jsonParser.g());
                            n2 = n;
                            tweetEntities2 = tweetEntities;
                            s3 = s2;
                            s4 = s;
                            break Label_0116;
                        }
                        if ("description".equals(e)) {
                            final String g = jsonParser.g();
                            s4 = s;
                            final TweetEntities tweetEntities3 = tweetEntities;
                            s3 = g;
                            n2 = n;
                            tweetEntities2 = tweetEntities3;
                            break Label_0116;
                        }
                        if ("url_https".equals(e)) {
                            y.d(jsonParser.g());
                            n2 = n;
                            tweetEntities2 = tweetEntities;
                            s3 = s2;
                            s4 = s;
                            break Label_0116;
                        }
                        if ("url".equals(e)) {
                            if (y.profileUrl == null) {
                                y.d(jsonParser.g());
                                n2 = n;
                                tweetEntities2 = tweetEntities;
                                s3 = s2;
                                s4 = s;
                                break Label_0116;
                            }
                            break;
                        }
                        else {
                            if ("location".equals(e)) {
                                y.f(jsonParser.g());
                                n2 = n;
                                tweetEntities2 = tweetEntities;
                                s3 = s2;
                                s4 = s;
                                break Label_0116;
                            }
                            if ("created_at".equals(e)) {
                                final String g2 = jsonParser.g();
                                while (true) {
                                    try {
                                        y.b(Long.parseLong(g2));
                                        n2 = n;
                                        tweetEntities2 = tweetEntities;
                                        s3 = s2;
                                        s4 = s;
                                        break Label_0116;
                                    }
                                    catch (NumberFormatException ex) {
                                        y.b(bk.a(com.twitter.util.platform.k.f().a().b(), g2));
                                        continue;
                                    }
                                    break;
                                }
                            }
                            if ("profile_background_color".equals(e)) {
                                try {
                                    y.a(0xFF000000 | Integer.parseInt(jsonParser.g(), 16));
                                    n2 = n;
                                    tweetEntities2 = tweetEntities;
                                    s3 = s2;
                                    s4 = s;
                                }
                                catch (NumberFormatException ex2) {
                                    n2 = n;
                                    tweetEntities2 = tweetEntities;
                                    s3 = s2;
                                    s4 = s;
                                }
                                break Label_0116;
                            }
                            if ("profile_link_color".equals(e)) {
                                try {
                                    y.b(0xFF000000 | Integer.parseInt(jsonParser.g(), 16));
                                    n2 = n;
                                    tweetEntities2 = tweetEntities;
                                    s3 = s2;
                                    s4 = s;
                                }
                                catch (NumberFormatException ex3) {
                                    n2 = n;
                                    tweetEntities2 = tweetEntities;
                                    s3 = s2;
                                    s4 = s;
                                }
                                break Label_0116;
                            }
                            if ("advertiser_account_type".equals(e)) {
                                y.j("promotable_user".equalsIgnoreCase(jsonParser.g()));
                                n2 = n;
                                tweetEntities2 = tweetEntities;
                                s3 = s2;
                                s4 = s;
                                break Label_0116;
                            }
                            break;
                        }
                        break;
                    }
                    case 5: {
                        final String e2 = jsonParser.e();
                        if ("id".equals(e2)) {
                            y.a(jsonParser.i());
                            n2 = n;
                            tweetEntities2 = tweetEntities;
                            s3 = s2;
                            s4 = s;
                            break Label_0116;
                        }
                        if ("followers_count".equals(e2)) {
                            y.c(jsonParser.h());
                            n2 = n;
                            tweetEntities2 = tweetEntities;
                            s3 = s2;
                            s4 = s;
                            break Label_0116;
                        }
                        if ("fast_followers_count".equals(e2)) {
                            y.d(jsonParser.h());
                            n2 = n;
                            tweetEntities2 = tweetEntities;
                            s3 = s2;
                            s4 = s;
                            break Label_0116;
                        }
                        if ("friends_count".equals(e2)) {
                            y.e(jsonParser.h());
                            n2 = n;
                            tweetEntities2 = tweetEntities;
                            s3 = s2;
                            s4 = s;
                            break Label_0116;
                        }
                        if ("statuses_count".equals(e2)) {
                            y.f(jsonParser.h());
                            n2 = n;
                            tweetEntities2 = tweetEntities;
                            s3 = s2;
                            s4 = s;
                            break Label_0116;
                        }
                        if ("media_count".equals(e2)) {
                            y.g(jsonParser.h());
                            n2 = n;
                            tweetEntities2 = tweetEntities;
                            s3 = s2;
                            s4 = s;
                            break Label_0116;
                        }
                        if ("favourites_count".equals(e2)) {
                            y.h(jsonParser.h());
                            n2 = n;
                            tweetEntities2 = tweetEntities;
                            s3 = s2;
                            s4 = s;
                            break Label_0116;
                        }
                        break;
                    }
                    case 6: {
                        final String e3 = jsonParser.e();
                        if ("protected".equals(e3)) {
                            y.b(false);
                            n2 = n;
                            tweetEntities2 = tweetEntities;
                            s3 = s2;
                            s4 = s;
                            break Label_0116;
                        }
                        if ("geo_enabled".equals(e3)) {
                            y.g(false);
                            n2 = n;
                            tweetEntities2 = tweetEntities;
                            s3 = s2;
                            s4 = s;
                            break Label_0116;
                        }
                        if ("following".equals(e3)) {
                            n2 = z.b(n, 1);
                            tweetEntities2 = tweetEntities;
                            s3 = s2;
                            s4 = s;
                            break Label_0116;
                        }
                        if ("has_extended_profile".equals(e3)) {
                            y.f(true);
                            n2 = n;
                            tweetEntities2 = tweetEntities;
                            s3 = s2;
                            s4 = s;
                            break Label_0116;
                        }
                        if ("followed_by".equals(e3)) {
                            n2 = z.b(n, 2);
                            tweetEntities2 = tweetEntities;
                            s3 = s2;
                            s4 = s;
                            break Label_0116;
                        }
                        if ("follow_request_sent".equals(e3)) {
                            n2 = z.b(n, 16384);
                            tweetEntities2 = tweetEntities;
                            s3 = s2;
                            s4 = s;
                            break Label_0116;
                        }
                        break;
                    }
                    case 7: {
                        final String e4 = jsonParser.e();
                        if ("protected".equals(e4)) {
                            y.b(true);
                            n2 = n;
                            tweetEntities2 = tweetEntities;
                            s3 = s2;
                            s4 = s;
                            break Label_0116;
                        }
                        if ("verified".equals(e4)) {
                            y.c(true);
                            n2 = n;
                            tweetEntities2 = tweetEntities;
                            s3 = s2;
                            s4 = s;
                            break Label_0116;
                        }
                        if ("is_translator".equals(e4)) {
                            y.d(true);
                            n2 = n;
                            tweetEntities2 = tweetEntities;
                            s3 = s2;
                            s4 = s;
                            break Label_0116;
                        }
                        if ("is_lifeline_institution".equals(e4)) {
                            y.e(true);
                            n2 = n;
                            tweetEntities2 = tweetEntities;
                            s3 = s2;
                            s4 = s;
                            break Label_0116;
                        }
                        if ("suspended".equals(e4)) {
                            y.a(true);
                            n2 = n;
                            tweetEntities2 = tweetEntities;
                            s3 = s2;
                            s4 = s;
                            break Label_0116;
                        }
                        if ("geo_enabled".equals(e4)) {
                            y.g(true);
                            n2 = n;
                            tweetEntities2 = tweetEntities;
                            s3 = s2;
                            s4 = s;
                            break Label_0116;
                        }
                        if ("has_extended_profile".equals(e4)) {
                            y.f(false);
                            n2 = n;
                            tweetEntities2 = tweetEntities;
                            s3 = s2;
                            s4 = s;
                            break Label_0116;
                        }
                        if ("following".equals(e4)) {
                            n2 = z.a(n, 1);
                            tweetEntities2 = tweetEntities;
                            s3 = s2;
                            s4 = s;
                            break Label_0116;
                        }
                        if ("follow_request_sent".equals(e4)) {
                            n2 = z.a(n, 16384);
                            tweetEntities2 = tweetEntities;
                            s3 = s2;
                            s4 = s;
                            break Label_0116;
                        }
                        if ("followed_by".equals(e4)) {
                            n2 = z.a(n, 2);
                            tweetEntities2 = tweetEntities;
                            s3 = s2;
                            s4 = s;
                            break Label_0116;
                        }
                        if ("blocking".equals(e4)) {
                            n2 = z.a(n, 4);
                            tweetEntities2 = tweetEntities;
                            s3 = s2;
                            s4 = s;
                            break Label_0116;
                        }
                        if ("can_dm".equals(e4)) {
                            n2 = z.a(n, 8);
                            tweetEntities2 = tweetEntities;
                            s3 = s2;
                            s4 = s;
                            break Label_0116;
                        }
                        if ("notifications".equals(e4)) {
                            n2 = z.a(n, 16);
                            tweetEntities2 = tweetEntities;
                            s3 = s2;
                            s4 = s;
                            break Label_0116;
                        }
                        if ("lifeline_following".equals(e4)) {
                            n2 = z.a(n, 256);
                            tweetEntities2 = tweetEntities;
                            s3 = s2;
                            s4 = s;
                            break Label_0116;
                        }
                        if ("want_retweets".equals(e4)) {
                            n2 = z.a(n, 512);
                            tweetEntities2 = tweetEntities;
                            s3 = s2;
                            s4 = s;
                            break Label_0116;
                        }
                        if ("email_following".equals(e4)) {
                            n2 = z.a(n, 4096);
                            tweetEntities2 = tweetEntities;
                            s3 = s2;
                            s4 = s;
                            break Label_0116;
                        }
                        if ("needs_phone_verification".equals(e4)) {
                            y.h(true);
                            n2 = n;
                            tweetEntities2 = tweetEntities;
                            s3 = s2;
                            s4 = s;
                            break Label_0116;
                        }
                        if ("can_media_tag".equals(e4)) {
                            n2 = z.a(n, 1024);
                            tweetEntities2 = tweetEntities;
                            s3 = s2;
                            s4 = s;
                            break Label_0116;
                        }
                        if ("muting".equals(e4)) {
                            n2 = z.a(n, 8192);
                            tweetEntities2 = tweetEntities;
                            s3 = s2;
                            s4 = s;
                            break Label_0116;
                        }
                        if ("has_custom_timelines".equals(e4)) {
                            y.i(true);
                            n2 = n;
                            tweetEntities2 = tweetEntities;
                            s3 = s2;
                            s4 = s;
                            break Label_0116;
                        }
                        if ("blocked_by".equals(e4)) {
                            n2 = z.a(n, 32768);
                            tweetEntities2 = tweetEntities;
                            s3 = s2;
                            s4 = s;
                            break Label_0116;
                        }
                        break;
                    }
                    case 4: {
                        if ("status".equals(s)) {
                            final bp a3 = a(jsonParser, false);
                            if (a3 != null) {
                                a3.y = y;
                            }
                            y.a(a3);
                            n2 = n;
                            tweetEntities2 = tweetEntities;
                            s3 = s2;
                            s4 = s;
                            break Label_0116;
                        }
                        if ("promoted_content".equals(s)) {
                            y.a(i(jsonParser));
                            n2 = n;
                            tweetEntities2 = tweetEntities;
                            s3 = s2;
                            s4 = s;
                            break Label_0116;
                        }
                        if ("entities".equals(s)) {
                            final bw ag = ag(jsonParser);
                            final TweetEntities a4 = ag.a;
                            y.b(ag.b);
                            s3 = s2;
                            s4 = s;
                            final int n3 = n;
                            tweetEntities2 = a4;
                            n2 = n3;
                            break Label_0116;
                        }
                        if ("actions".equals(s)) {
                            y.j(ah(jsonParser) | y.flags);
                            n2 = n;
                            tweetEntities2 = tweetEntities;
                            s3 = s2;
                            s4 = s;
                            break Label_0116;
                        }
                        if ("profile_location".equals(s)) {
                            y.a(Optional.b(wx.a(jsonParser, JsonTwitterPlace.class)));
                            n2 = n;
                            tweetEntities2 = tweetEntities;
                            s3 = s2;
                            s4 = s;
                            break Label_0116;
                        }
                        jsonParser.c();
                        n2 = n;
                        tweetEntities2 = tweetEntities;
                        s3 = s2;
                        s4 = s;
                        break Label_0116;
                    }
                    case 1: {
                        jsonParser.c();
                        n2 = n;
                        tweetEntities2 = tweetEntities;
                        s3 = s2;
                        s4 = s;
                        break Label_0116;
                    }
                    case 3: {
                        final String g3 = jsonParser.g();
                        final int n4 = n;
                        tweetEntities2 = tweetEntities;
                        s3 = s2;
                        s4 = g3;
                        n2 = n4;
                        break Label_0116;
                    }
                    case 8: {
                        if ("profile_location".equals(s)) {
                            y.a(Optional.a());
                            n2 = n;
                            tweetEntities2 = tweetEntities;
                            s3 = s2;
                            s4 = s;
                            break Label_0116;
                        }
                        break;
                    }
                }
                n2 = n;
                tweetEntities2 = tweetEntities;
                s3 = s2;
                s4 = s;
            }
            a5 = jsonParser.a();
            s = s4;
            s2 = s3;
            tweetEntities = tweetEntities2;
            n = n2;
        }
        if ((y.userId > 0L && !TextUtils.isEmpty((CharSequence)y.username)) || !b) {
            if (tweetEntities != null && !TextUtils.isEmpty((CharSequence)s2)) {
                final w w = new w();
                final Matcher matcher = com.twitter.library.util.text.d.c.matcher(s2);
                while (matcher.find()) {
                    w.a((Entity)((ah)((ah)new ah().a(matcher.start())).b(matcher.end())).a(matcher.group()).f());
                }
                if (!w.a()) {
                    tweetEntities = (TweetEntities)new ax(tweetEntities).a((EntityList)w.f()).f();
                }
            }
            return y.c(a(s2, tweetEntities, null)).a(tweetEntities).i(n);
        }
        if (a != null) {
            a.a(new InvalidDataException("Received null user."));
        }
        return null;
    }
    
    public static as a(final List list) {
        final Iterator<bd> iterator = list.iterator();
        String s = null;
        String s2 = null;
        String s3 = null;
        String s4 = null;
        String s5 = null;
        while (iterator.hasNext()) {
            final bd bd = iterator.next();
            String s6 = bd.b;
            if (s6 != null && s6.startsWith("The user failed validation: ")) {
                s6 = s6.substring("The user failed validation: ".length());
            }
            if ("name".equals(bd.d) && s5 == null) {
                s5 = s6;
            }
            else if ("screen_name".equals(bd.d) && s2 == null) {
                s2 = s6;
            }
            else if ("password".equals(bd.d) && s == null) {
                s = s6;
            }
            else if ("email".equals(bd.d) && s4 == null) {
                s4 = s6;
            }
            else {
                if (!"devices".equals(bd.d) || s3 != null) {
                    continue;
                }
                s3 = s6;
            }
        }
        return new as(s5, s4, s3, s2, s, null, null);
    }
    
    public static bc a(final JsonParser jsonParser, final int n, final a a) {
        JsonToken jsonToken = jsonParser.d();
        Object g = null;
        ArrayList c = null;
        String g2 = null;
        while (jsonToken != null && jsonToken != JsonToken.c) {
            switch (bi.a[jsonToken.ordinal()]) {
                case 1: {
                    if ("lists".equals(g)) {
                        c = c(jsonParser, n, a);
                        break;
                    }
                    while (jsonToken != null && jsonToken != JsonToken.e) {
                        jsonToken = jsonParser.a();
                    }
                    break;
                }
                case 2: {
                    if ("next_cursor_str".equals(jsonParser.e())) {
                        g2 = jsonParser.g();
                        break;
                    }
                    break;
                }
                case 3: {
                    g = jsonParser.g();
                    break;
                }
            }
            jsonToken = jsonParser.a();
        }
        if (c == null) {
            return null;
        }
        return new bc(g2, c);
    }
    
    public static bc a(final JsonParser jsonParser, final a a) {
        JsonToken jsonToken = jsonParser.d();
        Object g = null;
        ArrayList b = null;
        String g2 = null;
        while (jsonToken != null && jsonToken != JsonToken.c) {
            switch (bi.a[jsonToken.ordinal()]) {
                case 1: {
                    if ("users".equals(g)) {
                        b = b(jsonParser, a);
                        break;
                    }
                    while (jsonToken != null && jsonToken != JsonToken.e) {
                        jsonToken = jsonParser.a();
                    }
                    break;
                }
                case 2: {
                    if ("next_cursor_str".equals(jsonParser.e())) {
                        g2 = jsonParser.g();
                        break;
                    }
                    break;
                }
                case 3: {
                    g = jsonParser.g();
                    break;
                }
            }
            jsonToken = jsonParser.a();
        }
        if (b == null) {
            return null;
        }
        return new bc(g2, b);
    }
    
    public static bp a(final JsonParser jsonParser, final boolean b) {
        try {
            return a(jsonParser, null, null, true, b, null).f();
        }
        catch (NullUserException ex) {
            return null;
        }
    }
    
    public static bp a(final String s, final HashMap hashMap, final HashMap hashMap2, final a a) {
        bp bp = hashMap.get(s);
        if (bp != null && bp.y != null) {
            final TwitterUser y = hashMap2.get(String.valueOf(bp.y.userId));
            if (y != null) {
                bp.y = y;
            }
            else if (a != null) {
                a.a("Missing user tweetId", bp.a);
                a.a("Missing user usersMap size", hashMap2.size());
                a.a("Missing user tweetsMap size", hashMap.size());
                a.a(new InvalidDataException("Missing user " + bp.y.userId));
                return null;
            }
            if (!a(bp, hashMap2, a)) {
                bp = null;
            }
            else if (bp.l != null && bp.l.y != null) {
                final TwitterUser y2 = hashMap2.get(String.valueOf(bp.l.y.userId));
                if (y2 != null) {
                    bp.l.y = y2;
                }
                else if (a != null) {
                    a.a(new InvalidDataException("Missing original user " + bp.l.y.userId));
                    return null;
                }
                if (!a(bp.l, hashMap2, a)) {
                    return null;
                }
            }
        }
        return bp;
    }
    
    private static com.twitter.library.api.bq a(final JsonParser jsonParser, final TwitterUser twitterUser, final xb xb, final boolean b, final boolean b2, final a a) {
        final com.twitter.library.api.bq a2 = new com.twitter.library.api.bq().a(twitterUser).a(xb);
        String s = null;
        ArrayList<TweetClassicCard> list = null;
        ax ax = null;
        TweetEntities tweetEntities = null;
        JsonToken a5;
        for (JsonToken a3 = jsonParser.a(); a3 != null && a3 != JsonToken.c; a3 = a5) {
            TweetEntities a4 = null;
            ax ax2 = null;
            ArrayList<TweetClassicCard> list2 = null;
            String s2 = null;
            Label_0112: {
                switch (bi.a[a3.ordinal()]) {
                    case 2: {
                        final String e = jsonParser.e();
                        if ("created_at".equals(e)) {
                            a2.b(bk.a(com.twitter.util.platform.k.f().a().b(), jsonParser.g()));
                            a4 = tweetEntities;
                            ax2 = ax;
                            list2 = list;
                            s2 = s;
                            break Label_0112;
                        }
                        if ("source".equals(e)) {
                            final Pair e2 = e(jsonParser.g());
                            a2.b((String)e2.first).c((String)e2.second);
                            a4 = tweetEntities;
                            ax2 = ax;
                            list2 = list;
                            s2 = s;
                            break Label_0112;
                        }
                        if ("text".equals(e)) {
                            final String g = jsonParser.g();
                            final TweetEntities tweetEntities2 = tweetEntities;
                            ax2 = ax;
                            list2 = list;
                            s2 = g;
                            a4 = tweetEntities2;
                            break Label_0112;
                        }
                        if ("retweet_count".equals(e)) {
                            if ("100+".equals(jsonParser.g())) {
                                a2.a(100);
                                a4 = tweetEntities;
                                ax2 = ax;
                                list2 = list;
                                s2 = s;
                                break Label_0112;
                            }
                            break;
                        }
                        else {
                            if ("lang".equals(e)) {
                                a2.d(jsonParser.g());
                                a4 = tweetEntities;
                                ax2 = ax;
                                list2 = list;
                                s2 = s;
                                break Label_0112;
                            }
                            break;
                        }
                        break;
                    }
                    case 5: {
                        final String e3 = jsonParser.e();
                        if ("id".equals(e3)) {
                            a2.a(jsonParser.i());
                            a4 = tweetEntities;
                            ax2 = ax;
                            list2 = list;
                            s2 = s;
                            break Label_0112;
                        }
                        if ("in_reply_to_user_id".equals(e3)) {
                            a2.c(jsonParser.i());
                            a4 = tweetEntities;
                            ax2 = ax;
                            list2 = list;
                            s2 = s;
                            break Label_0112;
                        }
                        if ("in_reply_to_status_id".equals(e3)) {
                            a2.d(jsonParser.i());
                            a4 = tweetEntities;
                            ax2 = ax;
                            list2 = list;
                            s2 = s;
                            break Label_0112;
                        }
                        if ("retweet_count".equals(e3)) {
                            a2.a(jsonParser.h());
                            a4 = tweetEntities;
                            ax2 = ax;
                            list2 = list;
                            s2 = s;
                            break Label_0112;
                        }
                        if ("favorite_count".equals(e3)) {
                            a2.b(jsonParser.h());
                            a4 = tweetEntities;
                            ax2 = ax;
                            list2 = list;
                            s2 = s;
                            break Label_0112;
                        }
                        if ("view_count".equals(e3)) {
                            a2.c(jsonParser.h());
                            a4 = tweetEntities;
                            ax2 = ax;
                            list2 = list;
                            s2 = s;
                            break Label_0112;
                        }
                        if ("quoted_status_id".equals(e3)) {
                            a2.f(jsonParser.i());
                            a4 = tweetEntities;
                            ax2 = ax;
                            list2 = list;
                            s2 = s;
                            break Label_0112;
                        }
                        break;
                    }
                    case 6:
                    case 7: {
                        final String e4 = jsonParser.e();
                        if ("retweeted".equals(e4)) {
                            a2.a(jsonParser.l());
                            a4 = tweetEntities;
                            ax2 = ax;
                            list2 = list;
                            s2 = s;
                            break Label_0112;
                        }
                        if ("favorited".equals(e4)) {
                            a2.b(jsonParser.l());
                            a4 = tweetEntities;
                            ax2 = ax;
                            list2 = list;
                            s2 = s;
                            break Label_0112;
                        }
                        if ("possibly_sensitive".equals(e4)) {
                            a2.c(jsonParser.l());
                            a4 = tweetEntities;
                            ax2 = ax;
                            list2 = list;
                            s2 = s;
                            break Label_0112;
                        }
                        if ("possibly_sensitive_appealable".equals(e4)) {
                            a2.d(jsonParser.l());
                            a4 = tweetEntities;
                            ax2 = ax;
                            list2 = list;
                            s2 = s;
                            break Label_0112;
                        }
                        if ("is_emergency".equals(e4)) {
                            a2.e(jsonParser.l());
                            a4 = tweetEntities;
                            ax2 = ax;
                            list2 = list;
                            s2 = s;
                            break Label_0112;
                        }
                        if ("is_quote_status".equals(e4)) {
                            a2.f(jsonParser.l());
                            a4 = tweetEntities;
                            ax2 = ax;
                            list2 = list;
                            s2 = s;
                            break Label_0112;
                        }
                        break;
                    }
                    case 4: {
                        final String e5 = jsonParser.e();
                        if ("current_user_retweet".equals(e5)) {
                            for (JsonToken jsonToken = jsonParser.a(); jsonToken != null && jsonToken != JsonToken.c; jsonToken = jsonParser.a()) {
                                if (jsonToken == JsonToken.i && "id".equals(jsonParser.e())) {
                                    a2.e(jsonParser.i());
                                }
                            }
                            break;
                        }
                        if (b2 && "user".equals(e5)) {
                            a2.b(a(jsonParser, b, null));
                            a4 = tweetEntities;
                            ax2 = ax;
                            list2 = list;
                            s2 = s;
                            break Label_0112;
                        }
                        if ("coordinates".equals(e5)) {
                            JsonToken jsonToken2 = jsonParser.a();
                            Object g2 = null;
                            while (jsonToken2 != null && jsonToken2 != JsonToken.c) {
                                switch (bi.a[jsonToken2.ordinal()]) {
                                    case 1: {
                                        if ("coordinates".equals(g2)) {
                                            a2.a(an(jsonParser));
                                            break;
                                        }
                                        jsonParser.c();
                                        break;
                                    }
                                    case 3: {
                                        g2 = jsonParser.g();
                                        break;
                                    }
                                    case 4: {
                                        jsonParser.c();
                                        break;
                                    }
                                }
                                jsonToken2 = jsonParser.a();
                            }
                            a4 = tweetEntities;
                            ax2 = ax;
                            list2 = list;
                            s2 = s;
                            break Label_0112;
                        }
                        if ("place".equals(e5)) {
                            a2.a((TwitterPlace)wx.a(jsonParser, JsonTwitterPlace.class));
                            a4 = tweetEntities;
                            ax2 = ax;
                            list2 = list;
                            s2 = s;
                            break Label_0112;
                        }
                        if ("retweeted_status".equals(e5)) {
                            try {
                                a2.a(b(jsonParser, b, a));
                                a4 = tweetEntities;
                                ax2 = ax;
                                list2 = list;
                                s2 = s;
                            }
                            catch (NullUserException ex) {
                                if (a != null) {
                                    a.a(new InvalidDataException(String.format("Received null user for status = %d", ex.statusId)));
                                }
                                a4 = tweetEntities;
                                ax2 = ax;
                                list2 = list;
                                s2 = s;
                            }
                            break Label_0112;
                        }
                        if ("quoted_status".equals(e5)) {
                            try {
                                a2.b(b(jsonParser, b, a).c());
                                a4 = tweetEntities;
                                ax2 = ax;
                                list2 = list;
                                s2 = s;
                            }
                            catch (NullUserException ex2) {
                                if (a != null) {
                                    a.a(new InvalidDataException(String.format("Received null user for status = %d", ex2.statusId)));
                                }
                                a4 = tweetEntities;
                                ax2 = ax;
                                list2 = list;
                                s2 = s;
                            }
                            break Label_0112;
                        }
                        if ("entities".equals(e5)) {
                            final ax ax3 = (ax)wx.b(jsonParser, JsonTweetEntities.class);
                            list2 = list;
                            s2 = s;
                            final TweetEntities tweetEntities3 = tweetEntities;
                            ax2 = ax3;
                            a4 = tweetEntities3;
                            break Label_0112;
                        }
                        if ("extended_entities".equals(e5)) {
                            a4 = a(jsonParser);
                            ax2 = ax;
                            list2 = list;
                            s2 = s;
                            break Label_0112;
                        }
                        if (a2.e() == null && "metadata".equals(e5)) {
                            a2.a((xb)wx.a(jsonParser, JsonTwitterStatusMetadata.class));
                            a4 = tweetEntities;
                            ax2 = ax;
                            list2 = list;
                            s2 = s;
                            break Label_0112;
                        }
                        if ("promoted_content".equals(e5)) {
                            a2.a(i(jsonParser));
                            a4 = tweetEntities;
                            ax2 = ax;
                            list2 = list;
                            s2 = s;
                            break Label_0112;
                        }
                        if ("cards".equals(e5)) {
                            final ArrayList ai = ai(jsonParser);
                            s2 = s;
                            final ax ax4 = ax;
                            list2 = (ArrayList<TweetClassicCard>)ai;
                            a4 = tweetEntities;
                            ax2 = ax4;
                            break Label_0112;
                        }
                        if ("card".equals(e5)) {
                            final c c = new c();
                            if (c.a(jsonParser, a)) {
                                a2.a(new TwitterStatusCard(c.a()));
                            }
                            a4 = tweetEntities;
                            ax2 = ax;
                            list2 = list;
                            s2 = s;
                            break Label_0112;
                        }
                        jsonParser.c();
                        a4 = tweetEntities;
                        ax2 = ax;
                        list2 = list;
                        s2 = s;
                        break Label_0112;
                    }
                }
                a4 = tweetEntities;
                ax2 = ax;
                list2 = list;
                s2 = s;
            }
            a5 = jsonParser.a();
            s = s2;
            list = list2;
            ax = ax2;
            tweetEntities = a4;
        }
        if (b2 && a2.b() == null) {
            throw new NullUserException(a2.a());
        }
        if (a2.d() == null && !CollectionUtils.a((Collection)list)) {
            a2.a(new TwitterStatusCard(list.get(0)));
        }
        TweetEntities a6;
        if (ax != null) {
            if (tweetEntities != null && !tweetEntities.media.c()) {
                ax.a(tweetEntities.media);
            }
            a6 = (TweetEntities)ax.f();
        }
        else {
            a6 = TweetEntities.a;
        }
        a2.a(a6);
        final xb e6 = a2.e();
        a2.a(a(s, a6, e6));
        if (e6 != null && e6.a != null) {
            final w w = new w(a6.urls.b() + a6.media.b());
            w.a((Iterable)a6.urls);
            w.a((Iterable)a6.media);
            a(e6.a, (EntityList)w.f());
        }
        return a2;
    }
    
    public static bs a(final JsonParser jsonParser, final a a, final TwitterUser twitterUser) {
        HashMap a2 = null;
        final HashMap hashMap = new HashMap();
        JsonToken jsonToken = jsonParser.a();
        String s = null;
        String s2 = null;
        ArrayList list = null;
        HashMap n = null;
        String s3 = null;
    Label_0502_Outer:
        while (jsonToken != null && jsonToken != JsonToken.c) {
            while (true) {
                Label_0547: {
                    ArrayList list2;
                    HashMap hashMap2;
                    String s8;
                    HashMap hashMap3;
                    String s9;
                    if (jsonToken == JsonToken.b) {
                        final String e = jsonParser.e();
                        if ("twitter_objects".equals(e)) {
                            for (JsonToken jsonToken2 = jsonParser.a(); jsonToken2 != null && jsonToken2 != JsonToken.c; jsonToken2 = jsonParser.a()) {
                                if (jsonToken2 == JsonToken.b) {
                                    final String e2 = jsonParser.e();
                                    if ("tweets".equals(e2)) {
                                        a2 = a(jsonParser, twitterUser);
                                    }
                                    else if ("users".equals(e2)) {
                                        n = N(jsonParser);
                                    }
                                    else if ("event_summaries".equals(e2)) {
                                        hashMap.putAll(a(a2, n, jsonParser));
                                    }
                                    else if ("custom_timelines".equals(e2)) {
                                        hashMap.putAll(aB(jsonParser));
                                    }
                                    else {
                                        jsonParser.c();
                                    }
                                }
                                else if (jsonToken2 == JsonToken.d) {
                                    jsonParser.c();
                                }
                            }
                            break Label_0547;
                        }
                        if ("response".equals(e)) {
                            final JsonToken a3 = jsonParser.a();
                            String s4 = s2;
                            final String s5 = s3;
                            ArrayList a4 = list;
                            String s6 = s5;
                            String s7 = s;
                            for (JsonToken a5 = a3; a5 != null && a5 != JsonToken.c; a5 = jsonParser.a()) {
                                if (a5 == JsonToken.d) {
                                    if ("timeline".equals(jsonParser.e())) {
                                        a4 = a(jsonParser, a2, n, hashMap, false, a);
                                    }
                                    else {
                                        jsonParser.c();
                                    }
                                }
                                else if (a5 == JsonToken.b) {
                                    if ("cursor".equals(jsonParser.e())) {
                                        final JsonToken a6 = jsonParser.a();
                                        String g = s7;
                                        JsonToken a7 = a6;
                                        String az = s6;
                                        String g2 = s4;
                                        while (a7 != null && a7 != JsonToken.c) {
                                            if (a7 == JsonToken.h) {
                                                if ("top".equals(jsonParser.e())) {
                                                    g2 = jsonParser.g();
                                                }
                                                else if ("bottom".equals(jsonParser.e())) {
                                                    g = jsonParser.g();
                                                }
                                            }
                                            else if (a7 == JsonToken.d) {
                                                az = az(jsonParser);
                                            }
                                            else {
                                                jsonParser.c();
                                            }
                                            a7 = jsonParser.a();
                                        }
                                        s7 = g;
                                        s4 = g2;
                                        s6 = az;
                                    }
                                    else {
                                        jsonParser.c();
                                    }
                                }
                            }
                            list2 = a4;
                            hashMap2 = a2;
                            s3 = s6;
                            s8 = s7;
                            hashMap3 = n;
                            s9 = s4;
                        }
                        else {
                            jsonParser.c();
                            final String s10 = s;
                            list2 = list;
                            hashMap3 = n;
                            s9 = s2;
                            hashMap2 = a2;
                            s8 = s10;
                        }
                    }
                    else {
                        if (jsonToken == JsonToken.d) {
                            jsonParser.c();
                        }
                        break Label_0547;
                    }
                    jsonToken = jsonParser.a();
                    final String s11 = s8;
                    a2 = hashMap2;
                    s2 = s9;
                    n = hashMap3;
                    list = list2;
                    s = s11;
                    continue Label_0502_Outer;
                }
                final String s12 = s;
                ArrayList list2 = list;
                HashMap hashMap3 = n;
                String s9 = s2;
                HashMap hashMap2 = a2;
                String s8 = s12;
                continue;
            }
        }
        return new bs(list, s2, s, s3);
    }
    
    private static TwitterTypeAhead a(final JsonParser jsonParser, final long n, final int n2) {
        String g = null;
        String g2 = null;
        String g3 = null;
        int n3 = 0;
        boolean b = false;
        final JsonToken a = jsonParser.a();
        ArrayList aw = null;
        JsonToken a2;
        for (JsonToken jsonToken = a; jsonToken != null && jsonToken != JsonToken.c; jsonToken = a2) {
            int h = 0;
            Label_0096: {
                switch (bi.a[jsonToken.ordinal()]) {
                    case 2: {
                        final String e = jsonParser.e();
                        if ("topic".equals(e)) {
                            g = jsonParser.g();
                            h = n3;
                            break Label_0096;
                        }
                        if ("filter".equals(e)) {
                            g2 = jsonParser.g();
                            h = n3;
                            break Label_0096;
                        }
                        if ("location".equals(e)) {
                            g3 = jsonParser.g();
                            h = n3;
                            break Label_0096;
                        }
                        break;
                    }
                    case 5: {
                        if ("rounded_score".equals(jsonParser.e())) {
                            h = jsonParser.h();
                            break Label_0096;
                        }
                        break;
                    }
                    case 7: {
                        if ("follow".equals(jsonParser.e())) {
                            b = true;
                            h = n3;
                            break Label_0096;
                        }
                        break;
                    }
                    case 1: {
                        if ("tokens".equals(jsonParser.e())) {
                            aw = aw(jsonParser);
                            h = n3;
                            break Label_0096;
                        }
                        jsonParser.c();
                        h = n3;
                        break Label_0096;
                    }
                    case 4: {
                        jsonParser.c();
                        h = n3;
                        break Label_0096;
                    }
                }
                h = n3;
            }
            a2 = jsonParser.a();
            n3 = h;
        }
        if ((g == null || aw == null) && n2 != 4) {
            return null;
        }
        return new TwitterTypeAhead(n2, n3, 0, aw, null, new TwitterSearchQuery(g, g, n, 0L, null, CollectionUtils.a(), g3, b, g2), null);
    }
    
    public static l a(final JsonParser jsonParser, final TwitterUser twitterUser, final a a) {
        int n = 0;
        String g = null;
        int n2 = -1;
        JsonToken jsonToken = jsonParser.a();
        boolean b = false;
        boolean equals = false;
        String g2 = null;
        String g3 = null;
        String g4 = null;
        ArrayList<m> c = null;
        while (jsonToken != null && jsonToken != JsonToken.c) {
            switch (bi.a[jsonToken.ordinal()]) {
                case 1: {
                    if ("modules".equals(jsonParser.e())) {
                        c = (ArrayList<m>)c(jsonParser, twitterUser, a);
                        break;
                    }
                    jsonParser.c();
                    break;
                }
                case 4: {
                    if ("metadata".equals(jsonParser.e())) {
                        for (JsonToken jsonToken2 = jsonParser.a(); jsonToken2 != null && jsonToken2 != JsonToken.c; jsonToken2 = jsonParser.a()) {
                            switch (bi.a[jsonToken2.ordinal()]) {
                                case 2: {
                                    if ("cursor".equals(jsonParser.e())) {
                                        g = jsonParser.g();
                                        break;
                                    }
                                    if ("takeover_type".equals(jsonParser.e())) {
                                        g4 = jsonParser.g();
                                        break;
                                    }
                                    if ("can_subscribe".equals(jsonParser.e())) {
                                        equals = "true".equals(jsonParser.g());
                                        break;
                                    }
                                    if ("event_id".equals(jsonParser.e())) {
                                        g2 = jsonParser.g();
                                        break;
                                    }
                                    if ("event_page_type".equals(jsonParser.e())) {
                                        g3 = jsonParser.g();
                                        break;
                                    }
                                    break;
                                }
                                case 5: {
                                    if ("refresh_interval_in_sec".equals(jsonParser.e())) {
                                        n2 = jsonParser.n();
                                        break;
                                    }
                                    break;
                                }
                                case 7: {
                                    if ("has_events_response".equals(jsonParser.e())) {
                                        b = true;
                                        break;
                                    }
                                    if ("can_subscribe".equals(jsonParser.e())) {
                                        equals = true;
                                        break;
                                    }
                                    break;
                                }
                                case 1:
                                case 4: {
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
            }
            jsonToken = jsonParser.a();
        }
        final ArrayList list = new ArrayList();
        if (c == null) {
            throw new InvalidDataException("Search did not return results module");
        }
        for (final m m : c) {
            if (m.k) {
                ++n;
            }
            if (m.m && m.l != null && m.l.size() > 0) {
                list.addAll(m.l);
            }
        }
        return new l(c, g, n2, b, n, list, g4, g3, g2, equals);
    }
    
    public static String a(final TwitterUser p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: new             Ljava/io/StringWriter;
        //     3: dup            
        //     4: sipush          512
        //     7: invokespecial   java/io/StringWriter.<init>:(I)V
        //    10: astore_1       
        //    11: getstatic       com/twitter/library/api/bh.a:Lcom/fasterxml/jackson/core/JsonFactory;
        //    14: aload_1        
        //    15: invokevirtual   com/fasterxml/jackson/core/JsonFactory.b:(Ljava/io/Writer;)Lcom/fasterxml/jackson/core/JsonGenerator;
        //    18: astore          6
        //    20: aload           6
        //    22: astore_3       
        //    23: aload_3        
        //    24: invokevirtual   com/fasterxml/jackson/core/JsonGenerator.c:()V
        //    27: aload_3        
        //    28: ldc_w           "id"
        //    31: aload_0        
        //    32: getfield        com/twitter/library/api/TwitterUser.userId:J
        //    35: invokevirtual   com/fasterxml/jackson/core/JsonGenerator.a:(Ljava/lang/String;J)V
        //    38: aload_3        
        //    39: ldc_w           "screen_name"
        //    42: aload_0        
        //    43: getfield        com/twitter/library/api/TwitterUser.username:Ljava/lang/String;
        //    46: invokevirtual   com/fasterxml/jackson/core/JsonGenerator.a:(Ljava/lang/String;Ljava/lang/String;)V
        //    49: aload_0        
        //    50: getfield        com/twitter/library/api/TwitterUser.name:Ljava/lang/String;
        //    53: ifnull          67
        //    56: aload_3        
        //    57: ldc_w           "name"
        //    60: aload_0        
        //    61: getfield        com/twitter/library/api/TwitterUser.name:Ljava/lang/String;
        //    64: invokevirtual   com/fasterxml/jackson/core/JsonGenerator.a:(Ljava/lang/String;Ljava/lang/String;)V
        //    67: aload_0        
        //    68: getfield        com/twitter/library/api/TwitterUser.profileImageUrl:Ljava/lang/String;
        //    71: ifnull          85
        //    74: aload_3        
        //    75: ldc_w           "profile_image_url_https"
        //    78: aload_0        
        //    79: getfield        com/twitter/library/api/TwitterUser.profileImageUrl:Ljava/lang/String;
        //    82: invokevirtual   com/fasterxml/jackson/core/JsonGenerator.a:(Ljava/lang/String;Ljava/lang/String;)V
        //    85: aload_0        
        //    86: getfield        com/twitter/library/api/TwitterUser.profileHeaderImageUrl:Ljava/lang/String;
        //    89: ifnull          103
        //    92: aload_3        
        //    93: ldc_w           "profile_banner_url"
        //    96: aload_0        
        //    97: getfield        com/twitter/library/api/TwitterUser.profileHeaderImageUrl:Ljava/lang/String;
        //   100: invokevirtual   com/fasterxml/jackson/core/JsonGenerator.a:(Ljava/lang/String;Ljava/lang/String;)V
        //   103: aload_0        
        //   104: getfield        com/twitter/library/api/TwitterUser.profileDescription:Ljava/lang/String;
        //   107: ifnull          121
        //   110: aload_3        
        //   111: ldc_w           "description"
        //   114: aload_0        
        //   115: getfield        com/twitter/library/api/TwitterUser.profileDescription:Ljava/lang/String;
        //   118: invokevirtual   com/fasterxml/jackson/core/JsonGenerator.a:(Ljava/lang/String;Ljava/lang/String;)V
        //   121: aload_0        
        //   122: getfield        com/twitter/library/api/TwitterUser.profileUrl:Ljava/lang/String;
        //   125: ifnull          139
        //   128: aload_3        
        //   129: ldc_w           "url_https"
        //   132: aload_0        
        //   133: getfield        com/twitter/library/api/TwitterUser.profileUrl:Ljava/lang/String;
        //   136: invokevirtual   com/fasterxml/jackson/core/JsonGenerator.a:(Ljava/lang/String;Ljava/lang/String;)V
        //   139: aload_0        
        //   140: getfield        com/twitter/library/api/TwitterUser.location:Ljava/lang/String;
        //   143: ifnull          157
        //   146: aload_3        
        //   147: ldc_w           "location"
        //   150: aload_0        
        //   151: getfield        com/twitter/library/api/TwitterUser.location:Ljava/lang/String;
        //   154: invokevirtual   com/fasterxml/jackson/core/JsonGenerator.a:(Ljava/lang/String;Ljava/lang/String;)V
        //   157: aload_0        
        //   158: getfield        com/twitter/library/api/TwitterUser.createdAt:J
        //   161: lconst_0       
        //   162: lcmp           
        //   163: ifeq            180
        //   166: aload_3        
        //   167: ldc_w           "created_at"
        //   170: aload_0        
        //   171: getfield        com/twitter/library/api/TwitterUser.createdAt:J
        //   174: invokestatic    java/lang/Long.toString:(J)Ljava/lang/String;
        //   177: invokevirtual   com/fasterxml/jackson/core/JsonGenerator.a:(Ljava/lang/String;Ljava/lang/String;)V
        //   180: aload_3        
        //   181: ldc_w           "friends_count"
        //   184: aload_0        
        //   185: getfield        com/twitter/library/api/TwitterUser.friendsCount:I
        //   188: invokevirtual   com/fasterxml/jackson/core/JsonGenerator.a:(Ljava/lang/String;I)V
        //   191: aload_3        
        //   192: ldc_w           "followers_count"
        //   195: aload_0        
        //   196: getfield        com/twitter/library/api/TwitterUser.followersCount:I
        //   199: invokevirtual   com/fasterxml/jackson/core/JsonGenerator.a:(Ljava/lang/String;I)V
        //   202: aload_3        
        //   203: ldc_w           "fast_followers_count"
        //   206: aload_0        
        //   207: getfield        com/twitter/library/api/TwitterUser.fastfollowersCount:I
        //   210: invokevirtual   com/fasterxml/jackson/core/JsonGenerator.a:(Ljava/lang/String;I)V
        //   213: aload_3        
        //   214: ldc_w           "statuses_count"
        //   217: aload_0        
        //   218: getfield        com/twitter/library/api/TwitterUser.statusesCount:I
        //   221: invokevirtual   com/fasterxml/jackson/core/JsonGenerator.a:(Ljava/lang/String;I)V
        //   224: aload_3        
        //   225: ldc_w           "media_count"
        //   228: aload_0        
        //   229: getfield        com/twitter/library/api/TwitterUser.mediaCount:I
        //   232: invokevirtual   com/fasterxml/jackson/core/JsonGenerator.a:(Ljava/lang/String;I)V
        //   235: aload_3        
        //   236: ldc_w           "geo_enabled"
        //   239: aload_0        
        //   240: getfield        com/twitter/library/api/TwitterUser.isGeoEnabled:Z
        //   243: invokevirtual   com/fasterxml/jackson/core/JsonGenerator.a:(Ljava/lang/String;Z)V
        //   246: aload_3        
        //   247: ldc_w           "protected"
        //   250: aload_0        
        //   251: getfield        com/twitter/library/api/TwitterUser.isProtected:Z
        //   254: invokevirtual   com/fasterxml/jackson/core/JsonGenerator.a:(Ljava/lang/String;Z)V
        //   257: aload_3        
        //   258: ldc_w           "is_lifeline_institution"
        //   261: aload_0        
        //   262: getfield        com/twitter/library/api/TwitterUser.isLifelineInstitution:Z
        //   265: invokevirtual   com/fasterxml/jackson/core/JsonGenerator.a:(Ljava/lang/String;Z)V
        //   268: aload_3        
        //   269: ldc_w           "verified"
        //   272: aload_0        
        //   273: getfield        com/twitter/library/api/TwitterUser.verified:Z
        //   276: invokevirtual   com/fasterxml/jackson/core/JsonGenerator.a:(Ljava/lang/String;Z)V
        //   279: aload_3        
        //   280: ldc_w           "is_translator"
        //   283: aload_0        
        //   284: getfield        com/twitter/library/api/TwitterUser.isTranslator:Z
        //   287: invokevirtual   com/fasterxml/jackson/core/JsonGenerator.a:(Ljava/lang/String;Z)V
        //   290: aload_3        
        //   291: ldc_w           "suspended"
        //   294: aload_0        
        //   295: getfield        com/twitter/library/api/TwitterUser.suspended:Z
        //   298: invokevirtual   com/fasterxml/jackson/core/JsonGenerator.a:(Ljava/lang/String;Z)V
        //   301: aload_3        
        //   302: ldc_w           "needs_phone_verification"
        //   305: aload_0        
        //   306: getfield        com/twitter/library/api/TwitterUser.needsPhoneVerification:Z
        //   309: invokevirtual   com/fasterxml/jackson/core/JsonGenerator.a:(Ljava/lang/String;Z)V
        //   312: aload_3        
        //   313: invokevirtual   com/fasterxml/jackson/core/JsonGenerator.d:()V
        //   316: aload_3        
        //   317: invokevirtual   com/fasterxml/jackson/core/JsonGenerator.flush:()V
        //   320: aload_1        
        //   321: invokevirtual   java/io/StringWriter.getBuffer:()Ljava/lang/StringBuffer;
        //   324: invokevirtual   java/lang/StringBuffer.toString:()Ljava/lang/String;
        //   327: astore          8
        //   329: aload_3        
        //   330: invokestatic    yp.a:(Ljava/io/Closeable;)V
        //   333: aload           8
        //   335: areturn        
        //   336: astore          5
        //   338: aconst_null    
        //   339: astore_3       
        //   340: aload_3        
        //   341: invokestatic    yp.a:(Ljava/io/Closeable;)V
        //   344: ldc_w           ""
        //   347: areturn        
        //   348: astore_2       
        //   349: aconst_null    
        //   350: astore_3       
        //   351: aload_2        
        //   352: astore          4
        //   354: aload_3        
        //   355: invokestatic    yp.a:(Ljava/io/Closeable;)V
        //   358: aload           4
        //   360: athrow         
        //   361: astore          4
        //   363: goto            354
        //   366: astore          7
        //   368: goto            340
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  0      20     336    340    Ljava/io/IOException;
        //  0      20     348    354    Any
        //  23     67     366    371    Ljava/io/IOException;
        //  23     67     361    366    Any
        //  67     85     366    371    Ljava/io/IOException;
        //  67     85     361    366    Any
        //  85     103    366    371    Ljava/io/IOException;
        //  85     103    361    366    Any
        //  103    121    366    371    Ljava/io/IOException;
        //  103    121    361    366    Any
        //  121    139    366    371    Ljava/io/IOException;
        //  121    139    361    366    Any
        //  139    157    366    371    Ljava/io/IOException;
        //  139    157    361    366    Any
        //  157    180    366    371    Ljava/io/IOException;
        //  157    180    361    366    Any
        //  180    329    366    371    Ljava/io/IOException;
        //  180    329    361    366    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0067:
        //     at com.strobel.decompiler.ast.Error.expressionLinkedFromMultipleLocations(Error.java:27)
        //     at com.strobel.decompiler.ast.AstOptimizer.mergeDisparateObjectInitializations(AstOptimizer.java:2592)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:235)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:42)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:214)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:99)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:757)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:655)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:532)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:499)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:141)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:130)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:105)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:317)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:238)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:123)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public static String a(final String s) {
        if (s != null && s.startsWith("@")) {
            final String[] split = s.split("[^a-zA-Z0-9_]");
            if (split != null && split.length != 0) {
                return split[1];
            }
        }
        return null;
    }
    
    public static String a(final String s, final TweetEntities tweetEntities, final xb xb) {
        if (s == null) {
            return null;
        }
        final yn b = yj.a.b(s);
        final StringBuilder sb = new StringBuilder(b.a);
        if (tweetEntities != null && b.b != null) {
            a(b.b, tweetEntities, xb);
        }
        aj.b(sb, tweetEntities, xb);
        if (aj.a(sb, tweetEntities)) {
            aj.a(sb, tweetEntities, xb);
        }
        return sb.toString();
    }
    
    public static ArrayList a(final JsonParser jsonParser, final a a, final TwitterUser twitterUser, final boolean b, final boolean b2) {
        final ArrayList<bp> list = new ArrayList<bp>();
    Label_0137:
        while (true) {
            bp bp = null;
        Label_0236_Outer:
            while (true) {
                JsonToken d = null;
                while (true) {
                    Label_0034: {
                        if (jsonParser != null) {
                            final ArrayList<bp> list2 = new ArrayList<bp>();
                            final long n = 0L;
                            d = jsonParser.d();
                            bp = null;
                            break Label_0034;
                        }
                        return list;
                        while (true) {
                            while (true) {
                                long n = 0L;
                            Block_11_Outer:
                                while (true) {
                                    try {
                                        final bp f = a(jsonParser, twitterUser, null, true, true, a).f();
                                        if (b && f.f() && bp != null) {
                                            f.G = bp.G;
                                        }
                                        list.add(f);
                                        if (!b2) {
                                            break Block_11_Outer;
                                        }
                                        while (true) {
                                            NullUserException ex;
                                            try {
                                                long max;
                                                if (f.d()) {
                                                    final ArrayList<bp> list2;
                                                    list2.add(f);
                                                    max = n;
                                                }
                                                else {
                                                    if (f.f()) {
                                                        break Block_11_Outer;
                                                    }
                                                    max = Math.max(n, f.G);
                                                }
                                                n = max;
                                                final bp bp2 = f;
                                                final JsonToken a2 = jsonParser.a();
                                                bp = bp2;
                                                d = a2;
                                                break Label_0034;
                                            }
                                            catch (NullUserException ex2) {
                                                ex = ex2;
                                                final bp bp2 = f;
                                            }
                                            if (a != null) {
                                                a.a(new InvalidDataException(String.format("Received null user for status = %d", ex.statusId)));
                                                continue Label_0137;
                                            }
                                            continue Label_0137;
                                        }
                                        Label_0282: {
                                            return list;
                                        }
                                        // iftrue(Label_0282:, !iterator.hasNext())
                                        while (true) {
                                            while (true) {
                                                final Iterator<bp> iterator;
                                                final long g;
                                                iterator.next().G = g;
                                                continue Block_11_Outer;
                                                g = n + 1L;
                                                final ArrayList<bp> list2;
                                                iterator = list2.iterator();
                                                continue Block_11_Outer;
                                            }
                                            continue Label_0236_Outer;
                                        }
                                    }
                                    // iftrue(Label_0282:, !b2)
                                    catch (NullUserException ex3) {
                                        final NullUserException ex = ex3;
                                        final bp bp2 = bp;
                                        continue Label_0236_Outer;
                                    }
                                    break;
                                }
                                long max = n;
                                continue Label_0236_Outer;
                            }
                        }
                    }
                    if (d == null || d == JsonToken.e) {
                        continue;
                    }
                    break;
                }
                if (d == JsonToken.b) {
                    continue Label_0236_Outer;
                }
                break;
            }
            final bp bp2 = bp;
            continue Label_0137;
        }
    }
    
    public static ArrayList a(final JsonParser jsonParser, final HashMap hashMap, final HashMap hashMap2, final a a) {
        final ArrayList<bp> list = new ArrayList<bp>();
        if (jsonParser != null) {
            for (JsonToken jsonToken = jsonParser.a(); jsonToken != null && jsonToken != JsonToken.e; jsonToken = jsonParser.a()) {
                switch (bi.a[jsonToken.ordinal()]) {
                    case 2: {
                        final bp a2 = a(jsonParser.g(), hashMap, hashMap2, a);
                        if (a2 != null) {
                            list.add(a2);
                            break;
                        }
                        break;
                    }
                    case 1:
                    case 4: {
                        jsonParser.c();
                        break;
                    }
                }
            }
        }
        return list;
    }
    
    private static ArrayList a(final JsonParser jsonParser, final HashMap hashMap, final HashMap hashMap2, final HashMap hashMap3, final boolean b, final a a) {
        if ((hashMap == null || hashMap2 == null) && (hashMap3 == null || hashMap3.isEmpty())) {
            if (a != null) {
                a.a(new InvalidDataException("Missing tweets map or users map"));
            }
            return CollectionUtils.a();
        }
        final ArrayList<at> list = new ArrayList<at>();
        at at = null;
        for (JsonToken jsonToken = jsonParser.a(); jsonToken != null && jsonToken != JsonToken.e; jsonToken = jsonParser.a()) {
            if (jsonToken == JsonToken.b) {
                at b2 = b(jsonParser, hashMap, hashMap2, hashMap3, b, a);
                if (b2 != null) {
                    if (b2.j != null || b2.k() != null) {
                        long o;
                        if (at != null) {
                            o = at.o;
                        }
                        else {
                            o = bk.a();
                        }
                        b2.o = o;
                    }
                    else if (b2.c() != null && at != null) {
                        b2.o = at.o;
                    }
                    else if (b2.c != 0) {
                        long o2;
                        if (at != null) {
                            o2 = at.o;
                        }
                        else {
                            o2 = -1L;
                        }
                        b2.o = o2;
                    }
                    list.add(b2);
                }
                else {
                    b2 = at;
                }
                at = b2;
            }
            else if (jsonToken == JsonToken.d) {
                jsonParser.c();
            }
        }
        return list;
    }
    
    public static HashMap a(final JsonParser jsonParser, final TwitterUser twitterUser) {
        final HashMap<String, bp> hashMap = new HashMap<String, bp>();
        for (JsonToken jsonToken = jsonParser.a(); jsonToken != null && jsonToken != JsonToken.c; jsonToken = jsonParser.a()) {
            if (jsonToken == JsonToken.b) {
                hashMap.put(jsonParser.e(), a(jsonParser, twitterUser, null, false, true, null).f());
            }
            else if (jsonToken == JsonToken.d) {
                jsonParser.c();
            }
        }
        return hashMap;
    }
    
    private static HashMap a(final HashMap hashMap, final HashMap hashMap2, final JsonParser jsonParser) {
        final HashMap<String, TwitterTopic> hashMap3 = new HashMap<String, TwitterTopic>();
        for (JsonToken jsonToken = jsonParser.a(); jsonToken != null && jsonToken != JsonToken.c; jsonToken = jsonParser.a()) {
            if (jsonToken == JsonToken.b) {
                final TwitterTopic b = b(jsonParser, hashMap, hashMap2, null);
                if (b != null) {
                    hashMap3.put(jsonParser.e(), b);
                }
            }
            else if (jsonToken == JsonToken.d) {
                jsonParser.c();
            }
        }
        return hashMap3;
    }
    
    private static void a(final JsonParser jsonParser, final Recap$Metadata recap$Metadata) {
        for (JsonToken jsonToken = jsonParser.a(); jsonToken != null && jsonToken != JsonToken.c; jsonToken = jsonParser.a()) {
            final String e = jsonParser.e();
            switch (bi.a[jsonToken.ordinal()]) {
                case 2: {
                    if ("header".equals(e)) {
                        recap$Metadata.header = jsonParser.r();
                        break;
                    }
                    if ("dismiss".equals(e)) {
                        recap$Metadata.dismiss = jsonParser.r();
                        break;
                    }
                    if ("feedback".equals(e)) {
                        recap$Metadata.feedback = jsonParser.r();
                        break;
                    }
                    if ("yes".equals(e)) {
                        recap$Metadata.confirm = jsonParser.r();
                        break;
                    }
                    if ("no".equals(e)) {
                        recap$Metadata.cancel = jsonParser.r();
                        break;
                    }
                    break;
                }
                case 6:
                case 7: {
                    if ("jump".equals(e)) {
                        recap$Metadata.jump = jsonParser.q();
                        break;
                    }
                    if ("display".equals(e)) {
                        recap$Metadata.display = jsonParser.q();
                        break;
                    }
                    break;
                }
                case 1:
                case 4: {
                    jsonParser.c();
                    break;
                }
            }
        }
    }
    
    private static void a(final JsonParser jsonParser, final av av) {
        String s = null;
        String s2 = null;
        String s3 = null;
        String s4 = null;
        String s5 = null;
        final JsonToken a = jsonParser.a();
        String s6 = null;
        String r = null;
        String r2 = null;
        String s11;
        for (JsonToken a2 = a; a2 != null && a2 != JsonToken.c; a2 = jsonParser.a(), s11 = r2, s = r, s2 = s11) {
            final String e = jsonParser.e();
            switch (bi.a[a2.ordinal()]) {
                default: {
                    final String s7 = s2;
                    r = s;
                    r2 = s7;
                    break;
                }
                case 1: {
                    jsonParser.c();
                    final String s8 = s2;
                    r = s;
                    r2 = s8;
                    break;
                }
                case 4: {
                    if (TwitterTopic.d(e.toUpperCase()) != -1) {
                        final JsonToken a3 = jsonParser.a();
                        String r3 = s4;
                        String r4 = s3;
                        JsonToken a4 = a3;
                        String r5 = s5;
                        final String s9 = s2;
                        r = s;
                        r2 = s9;
                        while (a4 != null && a4 != JsonToken.c) {
                            final String e2 = jsonParser.e();
                            switch (bi.a[a4.ordinal()]) {
                                case 1:
                                case 4: {
                                    jsonParser.c();
                                    break;
                                }
                                case 2: {
                                    if ("name".equals(e2)) {
                                        r = jsonParser.r();
                                        break;
                                    }
                                    if ("query".equals(e2)) {
                                        r4 = jsonParser.r();
                                        break;
                                    }
                                    if ("seed_hashtag".equals(e2)) {
                                        r5 = jsonParser.r();
                                        break;
                                    }
                                    if ("id".equals(e2)) {
                                        r2 = jsonParser.r();
                                        break;
                                    }
                                    if ("event_status".equals(e2)) {
                                        r3 = jsonParser.r();
                                        break;
                                    }
                                    break;
                                }
                            }
                            a4 = jsonParser.a();
                        }
                        s5 = r5;
                        s4 = r3;
                        s3 = r4;
                        s6 = e;
                        break;
                    }
                    jsonParser.c();
                    final String s10 = s2;
                    r = s;
                    r2 = s10;
                    break;
                }
            }
        }
        if (s6 != null) {
            av.a(new TwitterTopic(new TwitterTopic$Metadata(TwitterTopic.d(s6.toUpperCase()), s2, false), s, null, s3, s5, null, null, null, 1L, 0L, 0L, null, null, null, null, s4));
        }
    }
    
    private static void a(final JsonParser jsonParser, final av av, final HashMap hashMap) {
        final JsonSuggestsInfos jsonSuggestsInfos = (JsonSuggestsInfos)wx.d(jsonParser, JsonSuggestsInfos.class);
        if (jsonSuggestsInfos != null) {
            a(jsonSuggestsInfos.a, av);
            for (final Map.Entry<String, V> entry : jsonSuggestsInfos.b.entrySet()) {
                final String s = entry.getKey();
                av av2 = hashMap.get(s);
                if (av2 == null) {
                    av2 = new av();
                    hashMap.put(s, av2);
                }
                a((JsonSuggestsInfo)entry.getValue(), av2);
            }
        }
    }
    
    private static void a(final JsonParser jsonParser, final HashMap hashMap, final HashMap hashMap2, final av av, final a a) {
        final ArrayList<bp> list = new ArrayList<bp>();
        final Recap$Metadata recap$Metadata = new Recap$Metadata();
        final HashMap<Object, av> hashMap3 = new HashMap<Object, av>();
        for (JsonToken jsonToken = jsonParser.a(); jsonToken != null && jsonToken != JsonToken.c; jsonToken = jsonParser.a()) {
            final String e = jsonParser.e();
            switch (bi.a[jsonToken.ordinal()]) {
                case 1: {
                    if ("tweets".equals(e)) {
                        final Iterator iterator = aC(jsonParser).iterator();
                        while (iterator.hasNext()) {
                            final bp a2 = a(iterator.next(), hashMap, hashMap2, a);
                            if (a2 != null) {
                                list.add(a2);
                            }
                        }
                        break;
                    }
                    jsonParser.c();
                    break;
                }
                case 4: {
                    if ("behavior".equals(e) || "strings".equals(e)) {
                        a(jsonParser, recap$Metadata);
                    }
                    else if ("suggests_info".equals(e)) {
                        a(jsonParser, av, hashMap3);
                    }
                    jsonParser.c();
                    break;
                }
            }
        }
        if (!list.isEmpty()) {
            recap$Metadata.tweetId = list.get(0).a();
        }
        final HashMap<Object, EntityScribeContent> hashMap4 = new HashMap<Object, EntityScribeContent>();
        for (final Map.Entry<K, av> entry : hashMap3.entrySet()) {
            final av av2 = entry.getValue();
            hashMap4.put(entry.getKey(), new EntityScribeContent(av2.b(), av2.d()));
        }
        av.a(new Recap(list, hashMap4, recap$Metadata));
    }
    
    private static void a(final JsonParser jsonParser, final HashMap hashMap, final HashMap hashMap2, final HashMap hashMap3, final av av, final a a) {
        bp bp = null;
        TwitterTopic twitterTopic = null;
        String s = null;
        long n = 0L;
        TwitterTopic twitterTopic2 = null;
        JsonToken a5;
        long n4;
        for (JsonToken a2 = jsonParser.a(); a2 != null && a2 != JsonToken.c; a2 = a5, twitterTopic = twitterTopic2, n = n4) {
            String s2 = null;
            bp bp2 = null;
            long a4 = 0L;
            Label_0088: {
                switch (bi.a[a2.ordinal()]) {
                    case 2: {
                        final String e = jsonParser.e();
                        if ("tweet_id".equals(e)) {
                            final bp a3 = a(jsonParser.g(), hashMap, hashMap2, a);
                            final long n2 = n;
                            s2 = s;
                            twitterTopic2 = twitterTopic;
                            bp2 = a3;
                            a4 = n2;
                            break Label_0088;
                        }
                        if ("sort_index".equals(e)) {
                            final String g = jsonParser.g();
                            bp2 = bp;
                            a4 = n;
                            twitterTopic2 = twitterTopic;
                            s2 = g;
                            break Label_0088;
                        }
                        if ("timeline_id".equals(e)) {
                            final TwitterTopic twitterTopic3 = hashMap3.get(jsonParser.g());
                            final long n3 = n;
                            s2 = s;
                            twitterTopic2 = twitterTopic3;
                            a4 = n3;
                            bp2 = bp;
                            break Label_0088;
                        }
                        if ("curated_at".equals(e)) {
                            a4 = bk.a(com.twitter.util.platform.k.f().a().b(), jsonParser.g());
                            s2 = s;
                            twitterTopic2 = twitterTopic;
                            bp2 = bp;
                            break Label_0088;
                        }
                        break;
                    }
                    case 1:
                    case 4: {
                        jsonParser.c();
                        a4 = n;
                        s2 = s;
                        twitterTopic2 = twitterTopic;
                        bp2 = bp;
                        break Label_0088;
                    }
                }
                a4 = n;
                s2 = s;
                twitterTopic2 = twitterTopic;
                bp2 = bp;
            }
            a5 = jsonParser.a();
            bp = bp2;
            s = s2;
            n4 = a4;
        }
        if (bp != null && twitterTopic != null) {
            av.b("curated_tweet");
            av.a(bp);
            if (n > 0L) {
                av.a(n);
            }
            if (s != null) {
                av.b(Long.parseLong(s));
            }
            av.a((TwitterSocialProof)new bo().a(34).a(twitterTopic.e()).f());
            av.b(4);
            av.a(twitterTopic);
        }
    }
    
    private static void a(final JsonSuggestsInfo jsonSuggestsInfo, final av av) {
        if (jsonSuggestsInfo != null) {
            final SuggestsInfo suggestsInfo = (SuggestsInfo)jsonSuggestsInfo.b();
            if (suggestsInfo.suggestionType != null) {
                av.a("suggestion_type", suggestsInfo.suggestionType);
            }
            if (suggestsInfo.controllerData != null) {
                av.a("controller_data", suggestsInfo.controllerData);
            }
            if (suggestsInfo.sourceData != null) {
                av.a("source_data", suggestsInfo.sourceData);
            }
            if (suggestsInfo.typeId != null) {
                av.a("type_id", suggestsInfo.typeId);
            }
            av.b(suggestsInfo.scribeComponent);
            av.c(suggestsInfo.suggestionType);
        }
    }
    
    private static void a(final Iterable iterable, final List list) {
        if (!list.isEmpty()) {
            final int size = list.size();
            final Iterator<Entity> iterator = iterable.iterator();
            int n = 0;
            int n2 = 0;
            while (iterator.hasNext()) {
                final Entity entity = iterator.next();
                int i = n2;
                int n3 = 0;
                int n4 = n2;
                int n5 = n;
                while (i < size) {
                    final int[] array = list.get(i);
                    final int n6 = array[0];
                    final int n7 = array[1];
                    final int n8 = n7 - n6;
                    int n9;
                    if (n7 < entity.start) {
                        n5 += n8;
                        ++n4;
                        n9 = n3;
                    }
                    else if (n7 < entity.end) {
                        n9 = n3 + n8;
                    }
                    else {
                        n9 = n3;
                    }
                    ++i;
                    n3 = n9;
                }
                entity.start -= n5;
                entity.end -= n3 + n5;
                n = n5;
                n2 = n4;
            }
        }
    }
    
    public static void a(final ArrayList list, final TweetEntities tweetEntities, final xb xb) {
        a(tweetEntities.urls, list);
        a(tweetEntities.media, list);
        a(tweetEntities.mentions, list);
        a(tweetEntities.hashtags, list);
        a(tweetEntities.cashtags, list);
        if (xb != null && xb.a != null) {
            a(xb.a, list);
        }
    }
    
    public static void a(final List list, final EntityList list2) {
        final int b = list2.b();
        final Iterator<Entity> iterator = list.iterator();
        int n = 0;
        int n2 = 0;
        while (iterator.hasNext()) {
            final Entity entity = iterator.next();
            final int start = entity.start;
            int i = n;
            int n3 = n2;
            int n4 = n;
            while (i < b) {
                final UrlEntity urlEntity = (UrlEntity)list2.a(i);
                if (urlEntity.start < start) {
                    ++n4;
                    n3 += urlEntity.displayUrl.length() - urlEntity.url.length();
                }
                ++i;
            }
            entity.start += n3;
            entity.end += n3;
            n = n4;
            n2 = n3;
        }
    }
    
    private static boolean a(final bp bp) {
        return (bp.v != null && ((bp.v.classicCard != null && bp.v.classicCard.type == 1) || (bp.v.cardInstanceData != null && vu.a().d(bp.v.cardInstanceData) && ("photo".equalsIgnoreCase(bp.v.cardInstanceData.name) || "gallery".equalsIgnoreCase(bp.v.cardInstanceData.name))))) || !bp.c.media.c();
    }
    
    private static boolean a(final bp bp, final a a) {
        boolean b = true;
        String impressionId;
        if (bp.f()) {
            impressionId = bp.s.impressionId;
        }
        else {
            impressionId = null;
        }
        if (impressionId == null) {
            a.a(new CarouselInvalidDataException("Tweet " + bp.a() + " does not have an impressionId."));
            ErrorReporter.a(a);
            return false;
        }
        if (bp.v == null || bp.v.cardInstanceData == null || !"forward:forward_promo_image_app".equals(bp.v.cardInstanceData.forwardName) || !b) {
            a.a(new CarouselInvalidDataException("Tweet with impression id " + impressionId + " has invalid MAP card."));
            ErrorReporter.a(a);
            b = false;
        }
        if (bp.s.isPAcInTimeline) {
            a.a(new CarouselInvalidDataException("Tweet with impression id " + impressionId + " is PAc in timeline."));
            ErrorReporter.a(a);
            b = false;
        }
        if (bp.s.isSuppressMediaForward) {
            a.a(new CarouselInvalidDataException("Tweet with impression id " + impressionId + "  has mediaForward suppressed."));
            ErrorReporter.a(a);
            return false;
        }
        return b;
    }
    
    private static boolean a(final bp bp, final HashMap hashMap, final a a) {
        final bp c = bp.C;
        if (c != null && c.y != null) {
            final TwitterUser y = hashMap.get(String.valueOf(c.y.userId));
            if (y != null) {
                c.y = y;
            }
            else if (a != null) {
                a.a(new InvalidDataException("Missing user " + c.y.userId));
                return false;
            }
        }
        return true;
    }
    
    private static TwitterTopic aA(final JsonParser jsonParser) {
        final String e = jsonParser.e();
        String s = null;
        String s2 = null;
        String s3 = null;
        String s4 = null;
        int n = -1;
        int n2 = -1;
        long n3 = 0L;
        int n4 = 0;
        TwitterUser a = null;
        final JsonToken a2 = jsonParser.a();
        int n5 = 4;
        String s5 = null;
        int n6 = 0;
        long n7 = 0L;
        String s9 = null;
        JsonToken a3;
        int n9;
        String s24;
        for (JsonToken jsonToken = a2; jsonToken != null && jsonToken != JsonToken.c; jsonToken = a3, s24 = s9, n3 = n7, n = n9, n2 = n6, s5 = s24) {
            String s6 = null;
            String s7 = null;
            int h = 0;
            String s10 = null;
            Label_0142: {
                switch (bi.a[jsonToken.ordinal()]) {
                    case 2: {
                        final String e2 = jsonParser.e();
                        if ("name".equals(e2)) {
                            final String g = jsonParser.g();
                            s6 = s;
                            s7 = g;
                            h = n;
                            final String s8 = s5;
                            n6 = n2;
                            n7 = n3;
                            s9 = s8;
                            s10 = s3;
                            break Label_0142;
                        }
                        if ("description".equals(e2)) {
                            final String g2 = jsonParser.g();
                            s6 = s;
                            s7 = s2;
                            final int n8 = n;
                            final String s11 = s5;
                            n6 = n2;
                            n7 = n3;
                            s10 = g2;
                            s9 = s11;
                            h = n8;
                            break Label_0142;
                        }
                        if ("user_id".equals(e2)) {
                            final String g3 = jsonParser.g();
                            h = n;
                            s6 = s;
                            s7 = s2;
                            n6 = n2;
                            n7 = n3;
                            s10 = s3;
                            s9 = g3;
                            break Label_0142;
                        }
                        if ("custom_timeline_url".equals(e2) || "url".equals(e2)) {
                            final String g4 = jsonParser.g();
                            if (!TextUtils.isEmpty((CharSequence)g4)) {
                                s4 = g4;
                            }
                            h = n;
                            s6 = s;
                            s7 = s2;
                            final String s12 = s5;
                            n6 = n2;
                            n7 = n3;
                            s10 = s3;
                            s9 = s12;
                            break Label_0142;
                        }
                        if ("id".equals(e2)) {
                            final String g5 = jsonParser.g();
                            s7 = s2;
                            s6 = g5;
                            h = n;
                            final String s13 = s5;
                            n6 = n2;
                            n7 = n3;
                            s10 = s3;
                            s9 = s13;
                            break Label_0142;
                        }
                        if ("type".equals(e2)) {
                            final String g6 = jsonParser.g();
                            if ("list".equals(g6)) {
                                n5 = 5;
                            }
                            else if ("curated".equals(g6)) {
                                n5 = 4;
                            }
                            h = n;
                            s6 = s;
                            s7 = s2;
                            final String s14 = s5;
                            n6 = n2;
                            n7 = n3;
                            s10 = s3;
                            s9 = s14;
                            break Label_0142;
                        }
                        break;
                    }
                    case 5: {
                        final String e3 = jsonParser.e();
                        if ("members".equals(e3)) {
                            h = jsonParser.h();
                            s6 = s;
                            s7 = s2;
                            final String s15 = s5;
                            n6 = n2;
                            n7 = n3;
                            s10 = s3;
                            s9 = s15;
                            break Label_0142;
                        }
                        if ("subscribers".equals(e3)) {
                            final int h2 = jsonParser.h();
                            h = n;
                            s6 = s;
                            s7 = s2;
                            final String s16 = s5;
                            n6 = h2;
                            n7 = n3;
                            s10 = s3;
                            s9 = s16;
                            break Label_0142;
                        }
                        if ("most_recent_tweet_timestamp".equals(e3)) {
                            final long i = jsonParser.i();
                            h = n;
                            s6 = s;
                            s7 = s2;
                            final String s17 = s5;
                            n6 = n2;
                            n7 = i;
                            s10 = s3;
                            s9 = s17;
                            break Label_0142;
                        }
                        if ("id".equals(e3)) {
                            final String g7 = jsonParser.g();
                            s7 = s2;
                            s6 = g7;
                            h = n;
                            final String s18 = s5;
                            n6 = n2;
                            n7 = n3;
                            s10 = s3;
                            s9 = s18;
                            break Label_0142;
                        }
                        break;
                    }
                    case 6:
                    case 7: {
                        if ("following".equals(jsonParser.e())) {
                            if (jsonParser.l()) {
                                n4 = 1;
                            }
                            else {
                                n4 = 2;
                            }
                            h = n;
                            s6 = s;
                            s7 = s2;
                            final String s19 = s5;
                            n6 = n2;
                            n7 = n3;
                            s10 = s3;
                            s9 = s19;
                            break Label_0142;
                        }
                        break;
                    }
                    case 1: {
                        jsonParser.c();
                        h = n;
                        s6 = s;
                        s7 = s2;
                        final String s20 = s5;
                        n6 = n2;
                        n7 = n3;
                        s10 = s3;
                        s9 = s20;
                        break Label_0142;
                    }
                    case 4: {
                        if ("owner".equals(jsonParser.e())) {
                            a = a(jsonParser, true, null);
                            h = n;
                            s6 = s;
                            s7 = s2;
                            final String s21 = s5;
                            n6 = n2;
                            n7 = n3;
                            s10 = s3;
                            s9 = s21;
                            break Label_0142;
                        }
                        jsonParser.c();
                        h = n;
                        s6 = s;
                        s7 = s2;
                        final String s22 = s5;
                        n6 = n2;
                        n7 = n3;
                        s10 = s3;
                        s9 = s22;
                        break Label_0142;
                    }
                }
                h = n;
                s6 = s;
                s7 = s2;
                final String s23 = s5;
                n6 = n2;
                n7 = n3;
                s10 = s3;
                s9 = s23;
            }
            a3 = jsonParser.a();
            s3 = s10;
            s2 = s7;
            s = s6;
            n9 = h;
        }
        long n10;
        if (a != null) {
            n10 = a.a();
        }
        else {
            n10 = Long.parseLong(s5);
        }
        final TwitterTopic$TwitterList list = new TwitterTopic$TwitterList(n, n2, 0, n4, n3 * 1000L);
        String s25;
        if (s == null) {
            s25 = e;
        }
        else {
            s25 = s;
        }
        return new TwitterTopic(new TwitterTopic$Metadata(n5, s25, false), s2, s3, s25, null, s4, null, null, 0L, 0L, n10, null, null, list, a, null);
    }
    
    private static HashMap aB(final JsonParser jsonParser) {
        final HashMap<String, TwitterTopic> hashMap = new HashMap<String, TwitterTopic>();
        for (JsonToken jsonToken = jsonParser.a(); jsonToken != null && jsonToken != JsonToken.c; jsonToken = jsonParser.a()) {
            if (jsonToken == JsonToken.b) {
                final TwitterTopic aa = aA(jsonParser);
                if (aa != null) {
                    hashMap.put(jsonParser.e(), aa);
                }
            }
            else if (jsonToken == JsonToken.d) {
                jsonParser.c();
            }
        }
        return hashMap;
    }
    
    private static LinkedHashSet aC(final JsonParser jsonParser) {
        final LinkedHashSet<String> set = new LinkedHashSet<String>();
        for (JsonToken jsonToken = jsonParser.a(); jsonToken != null && jsonToken != JsonToken.e; jsonToken = jsonParser.a()) {
            switch (bi.a[jsonToken.ordinal()]) {
                case 2: {
                    set.add(jsonParser.g());
                    break;
                }
                case 1:
                case 4: {
                    jsonParser.c();
                    break;
                }
            }
        }
        return set;
    }
    
    private static HashMap aD(final JsonParser jsonParser) {
        final HashMap<String, h> hashMap = new HashMap<String, h>();
        for (JsonToken jsonToken = jsonParser.a(); jsonToken != null && jsonToken != JsonToken.e; jsonToken = jsonParser.a()) {
            switch (bi.a[jsonToken.ordinal()]) {
                case 4: {
                    final h ae = aE(jsonParser);
                    if (ae != null) {
                        hashMap.put(ae.a(), ae);
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
        return hashMap;
    }
    
    private static h aE(final JsonParser jsonParser) {
        String g = null;
        boolean l = false;
        final HashMap<String, FeatureSwitchesParameter> hashMap = new HashMap<String, FeatureSwitchesParameter>();
        JsonToken jsonToken = jsonParser.a();
        String g2 = null;
        String g3 = null;
        while (jsonToken != null && jsonToken != JsonToken.c) {
            switch (bi.a[jsonToken.ordinal()]) {
                case 2: {
                    if ("name".equals(jsonParser.e())) {
                        g3 = jsonParser.g();
                        break;
                    }
                    if ("description".equals(jsonParser.e())) {
                        g2 = jsonParser.g();
                        break;
                    }
                    if ("owner".equals(jsonParser.e())) {
                        g = jsonParser.g();
                        break;
                    }
                    break;
                }
                case 6:
                case 7: {
                    if ("requires_restart".equals(jsonParser.e())) {
                        l = jsonParser.l();
                        break;
                    }
                    break;
                }
                case 1: {
                    if ("parameters".equals(jsonParser.e())) {
                        while (jsonToken != null && jsonToken != JsonToken.e) {
                            if (jsonToken == JsonToken.b) {
                                final FeatureSwitchesParameter t = T(jsonParser);
                                if (t != null) {
                                    hashMap.put(t.a(), t);
                                }
                            }
                            jsonToken = jsonParser.a();
                        }
                        break;
                    }
                    jsonParser.c();
                    break;
                }
                case 4: {
                    jsonParser.c();
                    break;
                }
            }
            jsonToken = jsonParser.a();
        }
        return new h(g3, g2, g, l, hashMap);
    }
    
    private static FeatureSwitchesValue aF(final JsonParser jsonParser) {
        final String e = jsonParser.e();
        JsonToken jsonToken = jsonParser.a();
        FeatureSwitchesValue featureSwitchesValue = null;
        while (jsonToken != null && jsonToken != JsonToken.c) {
            if ("value".equals(jsonParser.e())) {
                switch (bi.a[jsonParser.a().ordinal()]) {
                    default: {
                        featureSwitchesValue = new FeatureSwitchesValue(e, aG(jsonParser));
                        break;
                    }
                    case 1: {
                        featureSwitchesValue = new FeatureSwitchesValue(e, aH(jsonParser));
                        break;
                    }
                }
            }
            jsonToken = jsonParser.a();
        }
        if (featureSwitchesValue == null) {
            throw new InvalidDataException("Default value not found for FeatureSwitchesConfig");
        }
        return featureSwitchesValue;
    }
    
    private static Object aG(final JsonParser jsonParser) {
        switch (bi.a[jsonParser.d().ordinal()]) {
            default: {
                throw new InvalidDataException("Value not found.");
            }
            case 6:
            case 7: {
                return jsonParser.l();
            }
            case 5: {
                return jsonParser.h();
            }
            case 9: {
                return jsonParser.j();
            }
            case 2: {
                return jsonParser.g();
            }
            case 8: {
                return null;
            }
        }
    }
    
    private static ArrayList aH(final JsonParser jsonParser) {
        final ArrayList<Object> list = new ArrayList<Object>();
        for (JsonToken jsonToken = jsonParser.a(); jsonToken != null && jsonToken != JsonToken.e; jsonToken = jsonParser.a()) {
            if (!jsonToken.e()) {
                throw new InvalidDataException("Invalid feature switch array value. token : " + jsonToken);
            }
            list.add(aG(jsonParser));
        }
        return list;
    }
    
    private static HashSet aI(final JsonParser jsonParser) {
        final HashSet<String> set = new HashSet<String>();
        JsonToken jsonToken = jsonParser.a();
        while (jsonToken != null && jsonToken != JsonToken.e) {
            switch (bi.a[jsonToken.ordinal()]) {
                default: {
                    throw new InvalidDataException("Invalid feature switches string array token: " + jsonToken);
                }
                case 2: {
                    set.add(jsonParser.g());
                    jsonToken = jsonParser.a();
                    continue;
                }
            }
        }
        return set;
    }
    
    private static HashMap aJ(final JsonParser jsonParser) {
        final HashMap<String, f> hashMap = new HashMap<String, f>();
        for (JsonToken jsonToken = jsonParser.a(); jsonToken != null && jsonToken != JsonToken.e; jsonToken = jsonParser.a()) {
            switch (bi.a[jsonToken.ordinal()]) {
                default: {
                    throw new InvalidDataException("Invalid feature switches string array token: " + jsonToken);
                }
                case 4: {
                    final f ak = aK(jsonParser);
                    if (ak != null) {
                        hashMap.put(ak.a, ak);
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
        return hashMap;
    }
    
    private static f aK(final JsonParser jsonParser) {
        final ArrayList<g> list = new ArrayList<g>();
        final SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss ZZZZ", Locale.US);
        JsonToken a = jsonParser.a();
        Date parse = null;
        Date parse2 = null;
        Integer n = null;
        String g = null;
        while (a != null && a != JsonToken.c) {
            Integer value = null;
            Label_0096: {
                Label_0529: {
                    switch (bi.a[a.ordinal()]) {
                        case 4: {
                            jsonParser.c();
                            value = n;
                            break Label_0096;
                        }
                        case 1: {
                            if ("buckets".equals(jsonParser.e())) {
                                for (JsonToken jsonToken = jsonParser.a(); jsonToken != null && jsonToken != JsonToken.e; jsonToken = jsonParser.a()) {
                                    switch (bi.a[jsonToken.ordinal()]) {
                                        case 4: {
                                            final JsonToken a2 = jsonParser.a();
                                            String g2 = null;
                                            JsonToken a3 = a2;
                                            Integer value2 = null;
                                            while (a3 != null && a3 != JsonToken.c) {
                                                switch (bi.a[a3.ordinal()]) {
                                                    case 2: {
                                                        if ("name".equals(jsonParser.e())) {
                                                            g2 = jsonParser.g();
                                                            break;
                                                        }
                                                        break;
                                                    }
                                                    case 5: {
                                                        if ("offset".equals(jsonParser.e())) {
                                                            value2 = jsonParser.h();
                                                            break;
                                                        }
                                                        break;
                                                    }
                                                    case 1: {
                                                        jsonParser.c();
                                                        break;
                                                    }
                                                    case 4: {
                                                        jsonParser.c();
                                                        break;
                                                    }
                                                }
                                                a3 = jsonParser.a();
                                            }
                                            if (g2 == null || value2 == null) {
                                                throw new InvalidDataException("Invalid embedded bucket");
                                            }
                                            list.add(new g(g2, value2));
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
                            jsonParser.c();
                            value = n;
                            break Label_0096;
                        }
                        case 2: {
                            if ("name".equals(jsonParser.e())) {
                                g = jsonParser.g();
                                value = n;
                                break Label_0096;
                            }
                            if ("start_time".equals(jsonParser.e())) {
                                final String g3 = jsonParser.g();
                                while (true) {
                                    try {
                                        parse2 = simpleDateFormat.parse(g3);
                                        value = n;
                                        break Label_0096;
                                    }
                                    catch (ParseException ex) {
                                        parse2 = null;
                                        continue;
                                    }
                                    break;
                                }
                            }
                            if ("end_time".equals(jsonParser.e())) {
                                final String g4 = jsonParser.g();
                                while (true) {
                                    try {
                                        parse = simpleDateFormat.parse(g4);
                                        value = n;
                                        break Label_0096;
                                    }
                                    catch (ParseException ex2) {
                                        parse = null;
                                        continue;
                                    }
                                    break;
                                }
                                break Label_0529;
                            }
                            break;
                        }
                        case 5: {
                            if ("version".equals(jsonParser.e())) {
                                value = jsonParser.h();
                                break Label_0096;
                            }
                            break;
                        }
                    }
                }
                value = n;
            }
            final JsonToken a4 = jsonParser.a();
            n = value;
            a = a4;
        }
        if (g == null || n == null || list == null || parse2 == null || parse == null) {
            throw new InvalidDataException("Invalid embedded experiment.");
        }
        return new f(g, n, list, parse2, parse);
    }
    
    private static ArrayList aL(final JsonParser jsonParser) {
        final ArrayList<ReferralCampaign> list = new ArrayList<ReferralCampaign>();
        for (JsonToken jsonToken = jsonParser.a(); jsonToken != null && jsonToken != JsonToken.e; jsonToken = jsonParser.a()) {
            switch (bi.a[jsonToken.ordinal()]) {
                case 4: {
                    list.add(aM(jsonParser));
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
    
    private static ReferralCampaign aM(final JsonParser jsonParser) {
        final ReferralCampaign referralCampaign = new ReferralCampaign();
        for (JsonToken jsonToken = jsonParser.a(); jsonToken != null && jsonToken != JsonToken.c; jsonToken = jsonParser.a()) {
            switch (bi.a[jsonToken.ordinal()]) {
                case 2: {
                    final String e = jsonParser.e();
                    if ("campaign_id".equals(e)) {
                        referralCampaign.a(jsonParser.g());
                        break;
                    }
                    if ("protocol_handling_flow".equals(e)) {
                        referralCampaign.b(jsonParser.g());
                        break;
                    }
                    if ("world_cup_selected_country_override".equals(e)) {
                        referralCampaign.c(jsonParser.g());
                        break;
                    }
                    break;
                }
                case 5: {
                    final String e2 = jsonParser.e();
                    if ("promoted_account_id".equals(e2)) {
                        referralCampaign.a(jsonParser.i());
                        break;
                    }
                    if ("list_id".equals(e2)) {
                        referralCampaign.b(jsonParser.i());
                        break;
                    }
                    break;
                }
                case 1:
                case 4: {
                    jsonParser.c();
                    break;
                }
            }
        }
        return referralCampaign;
    }
    
    private static o aN(final JsonParser jsonParser) {
        String g = null;
        JsonToken jsonToken = jsonParser.a();
        String g2 = null;
        String g3 = null;
        while (jsonToken != null && jsonToken != JsonToken.c) {
            switch (bi.a[jsonToken.ordinal()]) {
                case 2: {
                    final String e = jsonParser.e();
                    if ("id".equals(e)) {
                        g2 = jsonParser.g();
                        break;
                    }
                    if ("url".equals(e)) {
                        g = jsonParser.g();
                        break;
                    }
                    if ("name".equals(e)) {
                        g3 = jsonParser.g();
                        break;
                    }
                    break;
                }
                case 1:
                case 4: {
                    jsonParser.c();
                    break;
                }
            }
            jsonToken = jsonParser.a();
        }
        return new o(g2, Uri.parse(g), g3);
    }
    
    public static ArrayList aa(final JsonParser jsonParser) {
        final JsonToken a = jsonParser.a();
        ArrayList al = null;
        for (JsonToken a2 = a; a2 != null && a2 != JsonToken.c; a2 = jsonParser.a()) {
            switch (bi.a[a2.ordinal()]) {
                case 1: {
                    if ("campaigns".equals(jsonParser.e())) {
                        al = aL(jsonParser);
                        break;
                    }
                    jsonParser.c();
                    break;
                }
            }
        }
        return al;
    }
    
    public static ArrayList ab(final JsonParser jsonParser) {
        final ArrayList<o> list = new ArrayList<o>();
        for (JsonToken jsonToken = jsonParser.a(); jsonToken != null && jsonToken != JsonToken.e; jsonToken = jsonParser.a()) {
            switch (bi.a[jsonToken.ordinal()]) {
                case 4: {
                    list.add(aN(jsonParser));
                    break;
                }
            }
        }
        return list;
    }
    
    public static boolean ac(final JsonParser jsonParser) {
        final JsonToken a = jsonParser.a();
        boolean b = false;
        for (JsonToken a2 = a; a2 != null && a2 != JsonToken.c; a2 = jsonParser.a()) {
            switch (bi.a[a2.ordinal()]) {
                default: {
                    jsonParser.c();
                    break;
                }
                case 7: {
                    if ("is_numeric".equals(jsonParser.e())) {
                        b = true;
                        break;
                    }
                    break;
                }
            }
        }
        return b;
    }
    
    public static boolean ad(final JsonParser jsonParser) {
        final JsonToken a = jsonParser.a();
        boolean b = false;
        for (JsonToken a2 = a; a2 != null && a2 != JsonToken.c; a2 = jsonParser.a()) {
            switch (bi.a[a2.ordinal()]) {
                default: {
                    jsonParser.c();
                    break;
                }
                case 7: {
                    if ("is_valid".equals(jsonParser.e())) {
                        b = true;
                        break;
                    }
                    break;
                }
            }
        }
        return b;
    }
    
    public static ai ae(final JsonParser jsonParser) {
        final JsonToken a = jsonParser.a();
        String g = null;
        boolean l = false;
        for (JsonToken a2 = a; a2 != null && a2 != JsonToken.c; a2 = jsonParser.a()) {
            final String e = jsonParser.e();
            switch (bi.a[a2.ordinal()]) {
                default: {
                    jsonParser.c();
                    break;
                }
                case 6:
                case 7: {
                    if ("pass".equals(e)) {
                        l = jsonParser.l();
                        break;
                    }
                    break;
                }
                case 2: {
                    if ("message".equals(e)) {
                        g = jsonParser.g();
                        break;
                    }
                    break;
                }
            }
        }
        return new ai(l, g);
    }
    
    public static qa af(final JsonParser jsonParser) {
        JsonToken jsonToken = jsonParser.d();
        final ArrayList<pz> list = new ArrayList<pz>();
        final ArrayList<qc> list2 = new ArrayList<qc>();
        while (jsonToken != null && jsonToken != JsonToken.c) {
            if (jsonToken == JsonToken.d && "emails".equals(jsonParser.e())) {
                JsonToken jsonToken2 = jsonParser.a();
                while (true) {
                    boolean b;
                    if (jsonToken2 != null) {
                        b = true;
                    }
                    else {
                        b = false;
                    }
                    boolean b2;
                    if (jsonToken2 != JsonToken.e) {
                        b2 = true;
                    }
                    else {
                        b2 = false;
                    }
                    if (!(b & b2)) {
                        break;
                    }
                    if (jsonToken2 == JsonToken.b) {
                        Boolean b3 = false;
                        JsonToken jsonToken3 = jsonParser.a();
                        String g = null;
                        while (jsonToken3 != null && jsonToken3 != JsonToken.c) {
                            switch (bi.a[jsonToken3.ordinal()]) {
                                case 2: {
                                    if ("email".equals(jsonParser.e())) {
                                        g = jsonParser.g();
                                        break;
                                    }
                                    break;
                                }
                                case 7: {
                                    if ("email_verified".equals(jsonParser.e())) {
                                        b3 = jsonParser.l();
                                        break;
                                    }
                                    break;
                                }
                                case 1:
                                case 4: {
                                    jsonParser.c();
                                    break;
                                }
                            }
                            jsonToken3 = jsonParser.a();
                        }
                        if (g != null) {
                            list.add(new pz(g, b3));
                        }
                    }
                    else if (jsonToken2 == JsonToken.d) {
                        jsonParser.c();
                    }
                    jsonToken2 = jsonParser.a();
                }
            }
            else if (jsonToken == JsonToken.d && "phone_numbers".equals(jsonParser.e())) {
                JsonToken jsonToken4 = jsonParser.a();
                while (true) {
                    boolean b4;
                    if (jsonToken4 != null) {
                        b4 = true;
                    }
                    else {
                        b4 = false;
                    }
                    boolean b5;
                    if (jsonToken4 != JsonToken.e) {
                        b5 = true;
                    }
                    else {
                        b5 = false;
                    }
                    if (!(b4 & b5)) {
                        break;
                    }
                    if (jsonToken4 == JsonToken.b) {
                        Boolean b6 = false;
                        JsonToken jsonToken5 = jsonParser.a();
                        String g2 = null;
                        while (jsonToken5 != null && jsonToken5 != JsonToken.c) {
                            switch (bi.a[jsonToken5.ordinal()]) {
                                case 2: {
                                    if ("phone_number".equals(jsonParser.e())) {
                                        g2 = jsonParser.g();
                                        break;
                                    }
                                    break;
                                }
                                case 7: {
                                    if ("phone_number_verified".equals(jsonParser.e())) {
                                        b6 = true;
                                        break;
                                    }
                                    break;
                                }
                                case 1:
                                case 4: {
                                    jsonParser.c();
                                    break;
                                }
                            }
                            jsonToken5 = jsonParser.a();
                        }
                        if (g2 != null) {
                            list2.add(new qc(g2, b6));
                        }
                    }
                    else if (jsonToken4 == JsonToken.d) {
                        jsonParser.c();
                    }
                    jsonToken4 = jsonParser.a();
                }
            }
            jsonToken = jsonParser.a();
        }
        return new qa(list, list2);
    }
    
    private static bw ag(final JsonParser jsonParser) {
        final TweetEntities a = TweetEntities.a;
        final TweetEntities a2 = TweetEntities.a;
        final JsonToken a3 = jsonParser.a();
        TweetEntities a4 = a2;
        TweetEntities a5 = a;
        for (JsonToken a6 = a3; a6 != null && a6 != JsonToken.c; a6 = jsonParser.a()) {
            switch (bi.a[a6.ordinal()]) {
                case 4: {
                    final String e = jsonParser.e();
                    if ("description".equals(e)) {
                        a5 = a(jsonParser);
                        break;
                    }
                    if ("url".equals(e)) {
                        a4 = a(jsonParser);
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
        }
        return new bw(a5, a4);
    }
    
    private static int ah(final JsonParser jsonParser) {
        int n = 0;
        for (JsonToken jsonToken = jsonParser.a(); jsonToken != null && jsonToken != JsonToken.c; jsonToken = jsonParser.a()) {
            if (JsonToken.d == jsonToken && "disallow".equals(jsonParser.e())) {
                JsonToken a2;
                for (JsonToken a = jsonParser.a(); a != null && a != JsonToken.e; a = a2) {
                    int n3 = 0;
                    Label_0099: {
                        switch (bi.a[a.ordinal()]) {
                            case 2: {
                                final Integer n2 = bh.e.get(jsonParser.g());
                                if (n2 != null) {
                                    n3 = (n | n2);
                                    break Label_0099;
                                }
                                break;
                            }
                            case 1:
                            case 4: {
                                jsonParser.c();
                                n3 = n;
                                break Label_0099;
                            }
                        }
                        n3 = n;
                    }
                    a2 = jsonParser.a();
                    n = n3;
                }
            }
            else if (JsonToken.b == jsonToken) {
                jsonParser.c();
            }
        }
        return n;
    }
    
    private static ArrayList ai(final JsonParser jsonParser) {
        if (jsonParser != null) {
            final ArrayList<TweetClassicCard> list = new ArrayList<TweetClassicCard>();
            for (JsonToken jsonToken = jsonParser.a(); jsonToken != null && jsonToken != JsonToken.c; jsonToken = jsonParser.a()) {
                switch (bi.a[jsonToken.ordinal()]) {
                    case 4: {
                        jsonParser.c();
                        break;
                    }
                    case 1: {
                        final String e = jsonParser.e();
                        final boolean equals = "summaries".equals(e);
                        final boolean equals2 = "promotions".equals(e);
                        if (equals || equals2) {
                            jsonParser.c();
                            break;
                        }
                        final boolean equals3 = "photos".equals(e);
                        if (equals3 || "players".equals(e)) {
                            int n;
                            if (equals3) {
                                n = 1;
                            }
                            else {
                                n = 2;
                            }
                            for (JsonToken jsonToken2 = jsonParser.a(); jsonToken2 != null && jsonToken2 != JsonToken.e; jsonToken2 = jsonParser.a()) {
                                final TweetClassicCard a = a(jsonParser, n);
                                if (a != null) {
                                    list.add(a);
                                }
                            }
                            break;
                        }
                        break;
                    }
                }
            }
            return list;
        }
        return null;
    }
    
    private static UrlConfiguration aj(final JsonParser jsonParser) {
        ArrayList k = null;
        final JsonToken a = jsonParser.a();
        int h = 0;
        JsonToken a2 = a;
        String g = null;
        while (a2 != null && a2 != JsonToken.c) {
            final String e = jsonParser.e();
            switch (bi.a[a2.ordinal()]) {
                case 5: {
                    if ("short_url_length".equals(e)) {
                        h = jsonParser.h();
                        break;
                    }
                    break;
                }
                case 2: {
                    if ("client_event_url".equals(e)) {
                        g = jsonParser.g();
                        break;
                    }
                    break;
                }
                case 1: {
                    if ("non_username_paths".equals(e)) {
                        k = k(jsonParser);
                        break;
                    }
                    break;
                }
                case 4: {
                    jsonParser.c();
                    break;
                }
            }
            a2 = jsonParser.a();
        }
        return new UrlConfiguration(h, g, k);
    }
    
    private static int ak(final JsonParser jsonParser) {
        final JsonToken d = jsonParser.d();
        final JsonToken d2 = JsonToken.d;
        int n = 0;
        if (d == d2) {
            for (JsonToken jsonToken = jsonParser.a(); jsonToken != null && jsonToken != JsonToken.e; jsonToken = jsonParser.a()) {
                switch (bi.a[jsonToken.ordinal()]) {
                    case 1:
                    case 4: {
                        jsonParser.c();
                        break;
                    }
                    case 2: {
                        final String g = jsonParser.g();
                        if (g.equals("following")) {
                            n |= 0x1;
                            break;
                        }
                        if (g.equals("followed_by")) {
                            n |= 0x2;
                            break;
                        }
                        break;
                    }
                }
            }
        }
        return n;
    }
    
    private static TwitterUser al(final JsonParser jsonParser) {
        final TwitterUser twitterUser = new TwitterUser();
        if (jsonParser.d() == JsonToken.b) {
            JsonToken jsonToken = jsonParser.a();
            Object g = null;
            while (jsonToken != null && jsonToken != JsonToken.c) {
                switch (bi.a[jsonToken.ordinal()]) {
                    case 4: {
                        jsonParser.c();
                        break;
                    }
                    case 1: {
                        if ("connections".equals(g)) {
                            twitterUser.friendship = ak(jsonParser);
                            break;
                        }
                        jsonParser.c();
                        break;
                    }
                    case 5: {
                        if ("id".equals(g)) {
                            twitterUser.userId = jsonParser.i();
                            break;
                        }
                        break;
                    }
                    case 2: {
                        if ("name".equals(g)) {
                            twitterUser.name = jsonParser.g();
                        }
                        if ("screen_name".equals(g)) {
                            twitterUser.username = jsonParser.g();
                            break;
                        }
                        break;
                    }
                    case 3: {
                        g = jsonParser.g();
                        break;
                    }
                }
                jsonToken = jsonParser.a();
            }
        }
        return twitterUser;
    }
    
    private static int am(final JsonParser jsonParser) {
        final JsonToken a = jsonParser.a();
        int n = 0;
        for (JsonToken a2 = a; a2 != null && a2 != JsonToken.c; a2 = jsonParser.a()) {
            switch (bi.a[a2.ordinal()]) {
                case 7: {
                    final String e = jsonParser.e();
                    if ("following".equals(e)) {
                        n = z.a(n, 1);
                        break;
                    }
                    if ("followed_by".equals(e)) {
                        n = z.a(n, 2);
                        break;
                    }
                    if ("blocking".equals(e)) {
                        n = z.a(n, 4);
                        break;
                    }
                    if ("can_dm".equals(e)) {
                        n = z.a(n, 8);
                        break;
                    }
                    if ("notifications_enabled".equals(e)) {
                        n = z.a(n, 16);
                        break;
                    }
                    if ("lifeline_following".equals(e)) {
                        n = z.a(n, 256);
                        break;
                    }
                    if ("email_following".equals(e)) {
                        n = z.a(n, 4096);
                        break;
                    }
                    if ("want_retweets".equals(e)) {
                        n = z.a(n, 512);
                        break;
                    }
                    if ("can_media_tag".equals(e)) {
                        n = z.a(n, 1024);
                        break;
                    }
                    if ("muting".equals(e)) {
                        n = z.a(n, 8192);
                        break;
                    }
                    if ("following_requested".equals(e)) {
                        n = z.a(n, 16384);
                        break;
                    }
                    if ("blocked_by".equals(e)) {
                        n = z.a(n, 32768);
                        break;
                    }
                    break;
                }
                case 4: {
                    jsonParser.c();
                    break;
                }
            }
        }
        return n;
    }
    
    private static Coordinate an(final JsonParser jsonParser) {
        final JsonToken a = jsonParser.a();
        int n = 0;
        Double value = null;
        JsonToken a2 = a;
        Double value2 = null;
        while (a2 != null && a2 != JsonToken.e) {
            if (a2 == JsonToken.j || a2 == JsonToken.i) {
                switch (n) {
                    case 0: {
                        value2 = jsonParser.k();
                        break;
                    }
                    case 1: {
                        value = jsonParser.k();
                        break;
                    }
                }
                ++n;
            }
            a2 = jsonParser.a();
        }
        if (value != null && value2 != null) {
            return new Coordinate(value, value2);
        }
        return null;
    }
    
    private static Prompt ao(final JsonParser jsonParser) {
        String g = "";
        String g2 = "";
        String g3 = "";
        String g4 = "";
        String g5 = "";
        String g6 = "";
        String g7 = "";
        String g8 = "";
        String g9 = "";
        String s = "";
        String s2 = "";
        TweetEntities a = null;
        TweetEntities a2 = null;
        int h = 180;
        int h2 = 0;
        int intValue = 0;
        long n = 0L;
        boolean booleanValue = false;
        for (JsonToken jsonToken = jsonParser.a(); jsonToken != null && jsonToken != JsonToken.c; jsonToken = jsonParser.a()) {
            final String e = jsonParser.e();
            switch (bi.a[jsonToken.ordinal()]) {
                case 2: {
                    if ("text".equals(e)) {
                        g = jsonParser.g();
                        break;
                    }
                    if ("header".equals(e)) {
                        g2 = jsonParser.g();
                        break;
                    }
                    if ("action_text".equals(e)) {
                        g4 = jsonParser.g();
                        break;
                    }
                    if ("action_url".equals(e)) {
                        g3 = jsonParser.g();
                        break;
                    }
                    if ("trigger".equals(e)) {
                        g5 = jsonParser.g();
                        break;
                    }
                    if ("icon".equals(e)) {
                        g6 = jsonParser.g();
                        break;
                    }
                    if ("format".equals(e)) {
                        g7 = jsonParser.g();
                        break;
                    }
                    if ("background_image_url".equals(e)) {
                        g9 = jsonParser.g();
                        break;
                    }
                    if ("template".equals(e)) {
                        g8 = jsonParser.g();
                        break;
                    }
                    break;
                }
                case 5: {
                    if ("prompt_id".equals(e)) {
                        h2 = jsonParser.h();
                        break;
                    }
                    if ("persistence".equals(e)) {
                        h = jsonParser.h();
                        break;
                    }
                    break;
                }
                case 4: {
                    if ("entities".equals(e)) {
                        a = a(jsonParser);
                        break;
                    }
                    if ("header_entities".equals(e)) {
                        a2 = a(jsonParser);
                        break;
                    }
                    if (!"data".equals(e)) {
                        break;
                    }
                    final HashMap ap = ap(jsonParser);
                    if (ap.containsKey("tweetId")) {
                        final long longValue = ap.get("tweetId");
                        if (longValue > 0L) {
                            n = longValue;
                        }
                    }
                    if (ap.containsKey("insertionIndex")) {
                        intValue = (Integer)(Object)ap.get("insertionIndex");
                    }
                    if (ap.containsKey("tooltipTarget")) {
                        s = (String)ap.get("tooltipTarget");
                    }
                    if (ap.containsKey("tweetSelection")) {
                        s2 = (String)ap.get("tweetSelection");
                    }
                    if (ap.containsKey("isAppGraphPrompt")) {
                        booleanValue = (Boolean)(Object)ap.get("isAppGraphPrompt");
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
        return new Prompt(g, g2, g4, g3, g5, g6, g7, g9, h, h2, a, a2, g8, n, intValue, s, booleanValue, s2);
    }
    
    private static HashMap ap(final JsonParser jsonParser) {
        final HashMap<String, Long> hashMap = new HashMap<String, Long>();
        for (JsonToken jsonToken = jsonParser.a(); jsonToken != null && jsonToken != JsonToken.c; jsonToken = jsonParser.a()) {
            switch (bi.a[jsonToken.ordinal()]) {
                case 2: {
                    if ("tooltip_tweet_id".equals(jsonParser.e())) {
                        hashMap.put("tweetId", jsonParser.o());
                        break;
                    }
                    if ("tooltip_target".equals(jsonParser.e())) {
                        hashMap.put("tooltipTarget", (Long)jsonParser.r());
                        break;
                    }
                    if ("insertion_index".equals(jsonParser.e())) {
                        hashMap.put("insertionIndex", (Long)jsonParser.n());
                        break;
                    }
                    if ("app_graph_optin".equals(jsonParser.e())) {
                        hashMap.put("isAppGraphPrompt", (Long)(Object)jsonParser.a(false));
                        break;
                    }
                    if ("tweet_selection".equals(jsonParser.e())) {
                        hashMap.put("tweetSelection", (Long)jsonParser.r());
                        break;
                    }
                    break;
                }
                case 1:
                case 4: {
                    jsonParser.c();
                    break;
                }
            }
        }
        return hashMap;
    }
    
    private static String aq(final JsonParser jsonParser) {
        final JsonToken a = jsonParser.a();
        String g = null;
        for (JsonToken a2 = a; a2 != null && a2 != JsonToken.c; a2 = jsonParser.a()) {
            switch (bi.a[a2.ordinal()]) {
                case 2: {
                    if ("text".equals(jsonParser.e())) {
                        g = jsonParser.g();
                        break;
                    }
                    break;
                }
                case 1:
                case 4: {
                    jsonParser.c();
                    break;
                }
            }
        }
        return g;
    }
    
    private static TwitterSearchFilter ar(final JsonParser jsonParser) {
        boolean b = false;
        JsonToken jsonToken = jsonParser.a();
        boolean b2 = false;
        while (jsonToken != null && jsonToken != JsonToken.c) {
            switch (bi.a[jsonToken.ordinal()]) {
                case 7: {
                    final String e = jsonParser.e();
                    if ("follow".equals(e)) {
                        b = true;
                        break;
                    }
                    if ("nearby".equals(e)) {
                        b2 = true;
                        break;
                    }
                    break;
                }
                case 1:
                case 4: {
                    jsonParser.c();
                    break;
                }
            }
            jsonToken = jsonParser.a();
        }
        return new TwitterSearchFilter(b, b2);
    }
    
    private static ArrayList as(final JsonParser jsonParser) {
        final ArrayList<TwitterTypeAhead> list = new ArrayList<TwitterTypeAhead>();
        for (JsonToken jsonToken = jsonParser.a(); jsonToken != null && jsonToken != JsonToken.e; jsonToken = jsonParser.a()) {
            switch (bi.a[jsonToken.ordinal()]) {
                case 4: {
                    final TwitterTypeAhead at = at(jsonParser);
                    if (at != null) {
                        list.add(at);
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
        return list;
    }
    
    private static TwitterTypeAhead at(final JsonParser jsonParser) {
        final TwitterUser twitterUser = new TwitterUser();
        JsonToken a = jsonParser.a();
        int n = 1024;
        ArrayList aw = null;
        int h = 0;
        int h2 = 0;
        while (a != null && a != JsonToken.c) {
            int n2 = 0;
            Label_0091: {
                switch (bi.a[a.ordinal()]) {
                    case 2: {
                        final String e = jsonParser.e();
                        if ("name".equals(e)) {
                            twitterUser.a(jsonParser.g());
                            n2 = n;
                            break Label_0091;
                        }
                        if ("screen_name".equals(e)) {
                            twitterUser.e(jsonParser.g());
                            n2 = n;
                            break Label_0091;
                        }
                        if ("profile_image_url_https".equals(e)) {
                            twitterUser.b(jsonParser.g());
                            n2 = n;
                            break Label_0091;
                        }
                        if ("location".equals(e)) {
                            twitterUser.f(jsonParser.g());
                            n2 = n;
                            break Label_0091;
                        }
                        break;
                    }
                    case 7: {
                        if ("verified".equals(jsonParser.e())) {
                            twitterUser.c(true);
                            n2 = n;
                            break Label_0091;
                        }
                        if ("is_translator".equals(jsonParser.e())) {
                            twitterUser.d(true);
                            n2 = n;
                            break Label_0091;
                        }
                        if ("is_lifeline_institution".equals(jsonParser.e())) {
                            twitterUser.e(true);
                            n2 = n;
                            break Label_0091;
                        }
                        if ("is_dm_able".equals(jsonParser.e())) {
                            n2 = (n | 0x8);
                            break Label_0091;
                        }
                        break;
                    }
                    case 6: {
                        if ("can_media_tag".equals(jsonParser.e())) {
                            n2 = (n & 0xFFFFFBFF);
                            break Label_0091;
                        }
                        break;
                    }
                    case 5: {
                        final String e2 = jsonParser.e();
                        if ("id".equals(e2)) {
                            twitterUser.a(jsonParser.i());
                            n2 = n;
                            break Label_0091;
                        }
                        if ("rounded_score".equals(e2)) {
                            h2 = jsonParser.h();
                            n2 = n;
                            break Label_0091;
                        }
                        if ("rounded_graph_weight".equals(e2)) {
                            h = jsonParser.h();
                            n2 = n;
                            break Label_0091;
                        }
                        break;
                    }
                    case 1: {
                        if ("tokens".equals(jsonParser.e())) {
                            aw = aw(jsonParser);
                            n2 = n;
                            break Label_0091;
                        }
                        jsonParser.c();
                        n2 = n;
                        break Label_0091;
                    }
                    case 4: {
                        if (!"social_context".equals(jsonParser.e())) {
                            jsonParser.c();
                            n2 = n;
                            break Label_0091;
                        }
                        final TwitterSocialProof twitterSocialProof = (TwitterSocialProof)wx.a(jsonParser, JsonSearchSocialProof.class);
                        if (twitterSocialProof != null) {
                            twitterUser.a(new TwitterUserMetadata(twitterSocialProof, null, null, false));
                            n2 = (n | twitterSocialProof.friendship);
                            break Label_0091;
                        }
                        break;
                    }
                }
                n2 = n;
            }
            final JsonToken a2 = jsonParser.a();
            final int n3 = n2;
            a = a2;
            n = n3;
        }
        if (aw == null) {
            return null;
        }
        twitterUser.i(n);
        return new TwitterTypeAhead(1, h2, h, aw, twitterUser, null, null);
    }
    
    private static ArrayList au(final JsonParser jsonParser) {
        final ArrayList<TwitterTypeAhead> list = new ArrayList<TwitterTypeAhead>();
        for (JsonToken jsonToken = jsonParser.a(); jsonToken != null && jsonToken != JsonToken.e; jsonToken = jsonParser.a()) {
            switch (bi.a[jsonToken.ordinal()]) {
                case 4: {
                    final TwitterTypeAhead av = av(jsonParser);
                    if (av != null) {
                        list.add(av);
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
        return list;
    }
    
    private static TwitterTypeAhead av(final JsonParser jsonParser) {
        JsonToken jsonToken = jsonParser.a();
        int h = 0;
        String g = null;
        while (jsonToken != null && jsonToken != JsonToken.c) {
            switch (bi.a[jsonToken.ordinal()]) {
                case 2: {
                    if ("hashtag".equals(jsonParser.e())) {
                        g = jsonParser.g();
                        break;
                    }
                    break;
                }
                case 5: {
                    if ("rounded_score".equals(jsonParser.e())) {
                        h = jsonParser.h();
                        break;
                    }
                    break;
                }
                case 1:
                case 4: {
                    jsonParser.c();
                    break;
                }
            }
            jsonToken = jsonParser.a();
        }
        if (g == null) {
            return null;
        }
        return new TwitterTypeAhead(2, h, 0, null, null, null, g);
    }
    
    private static ArrayList aw(final JsonParser jsonParser) {
        final ArrayList<String> list = new ArrayList<String>();
        for (JsonToken jsonToken = jsonParser.a(); jsonToken != null && jsonToken != JsonToken.e; jsonToken = jsonParser.a()) {
            if (jsonToken == JsonToken.b) {
                for (JsonToken jsonToken2 = jsonParser.a(); jsonToken2 != null && jsonToken2 != JsonToken.c; jsonToken2 = jsonParser.a()) {
                    if (jsonToken2 == JsonToken.h && "token".equals(jsonParser.e())) {
                        list.add(jsonParser.g());
                    }
                }
            }
        }
        return list;
    }
    
    private static ay ax(final JsonParser jsonParser) {
        String g = null;
        String g2 = null;
        String g3 = null;
        boolean b = false;
        boolean b2 = false;
        boolean b3 = false;
        boolean b4 = false;
        boolean b5 = false;
        boolean b6 = true;
        Map ay = null;
        String g4 = null;
        long i = 86400L;
        for (JsonToken jsonToken = jsonParser.a(); jsonToken != null && jsonToken != JsonToken.c; jsonToken = jsonParser.a()) {
            switch (bi.a[jsonToken.ordinal()]) {
                case 2: {
                    final String e = jsonParser.e();
                    if ("name".equals(e)) {
                        g = jsonParser.g();
                        break;
                    }
                    if ("key".equals(e)) {
                        g2 = jsonParser.g();
                        break;
                    }
                    if ("banner".equals(e)) {
                        g3 = jsonParser.g();
                        break;
                    }
                    break;
                }
                case 7: {
                    if ("zero_rate".equals(jsonParser.e())) {
                        b = true;
                        break;
                    }
                    break;
                }
                case 5: {
                    if ("expire_seconds".equals(jsonParser.e())) {
                        i = jsonParser.i();
                        break;
                    }
                    break;
                }
                case 4: {
                    final String e2 = jsonParser.e();
                    if ("host_map".equals(e2)) {
                        ay = ay(jsonParser);
                        break;
                    }
                    if ("display_flags".equals(e2)) {
                        for (JsonToken jsonToken2 = jsonParser.a(); jsonToken2 != null && jsonToken2 != JsonToken.c; jsonToken2 = jsonParser.a()) {
                            switch (bi.a[jsonToken2.ordinal()]) {
                                case 7: {
                                    final String e3 = jsonParser.e();
                                    if ("inline_media_interstitial".equals(e3)) {
                                        b2 = true;
                                        break;
                                    }
                                    if ("external_links_interstitial".equals(e3)) {
                                        b3 = true;
                                        break;
                                    }
                                    if ("footer_text".equals(e3)) {
                                        b4 = true;
                                        break;
                                    }
                                    if ("banner_message".equals(e3)) {
                                        b5 = true;
                                        break;
                                    }
                                    break;
                                }
                                case 6: {
                                    if ("zero_rate_videos".equals(jsonParser.e())) {
                                        b6 = false;
                                        break;
                                    }
                                    break;
                                }
                                case 1:
                                case 4: {
                                    jsonParser.c();
                                    break;
                                }
                            }
                        }
                        break;
                    }
                    if ("interstitial".equals(e2)) {
                        for (JsonToken jsonToken3 = jsonParser.a(); jsonToken3 != null && jsonToken3 != JsonToken.c; jsonToken3 = jsonParser.a()) {
                            switch (bi.a[jsonToken3.ordinal()]) {
                                case 2: {
                                    if ("text".equals(jsonParser.e())) {
                                        g4 = jsonParser.g();
                                        break;
                                    }
                                    break;
                                }
                                case 1:
                                case 4: {
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
        }
        if (g != null && g2 != null) {
            return new ay(g, g2, g3, b, b2, b3, b4, b5, ay, g4, i, b6);
        }
        return null;
    }
    
    private static HashMap ay(final JsonParser jsonParser) {
        final HashMap<String, String> hashMap = new HashMap<String, String>();
        for (JsonToken jsonToken = jsonParser.a(); jsonToken != null && jsonToken != JsonToken.c; jsonToken = jsonParser.a()) {
            switch (bi.a[jsonToken.ordinal()]) {
                case 4: {
                    final String e = jsonParser.e();
                    for (JsonToken jsonToken2 = jsonParser.a(); jsonToken2 != null && jsonToken2 != JsonToken.c; jsonToken2 = jsonParser.a()) {
                        switch (bi.a[jsonToken2.ordinal()]) {
                            case 2: {
                                if ("host".equals(jsonParser.e())) {
                                    hashMap.put(e, jsonParser.g());
                                    break;
                                }
                                break;
                            }
                            case 1:
                            case 4: {
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
        return hashMap;
    }
    
    private static String az(final JsonParser jsonParser) {
        final JsonToken a = jsonParser.a();
        String g = null;
        for (JsonToken a2 = a; a2 != null && a2 != JsonToken.e; a2 = jsonParser.a()) {
            if (a2 == JsonToken.h) {
                if (g == null) {
                    g = jsonParser.g();
                }
            }
            else {
                jsonParser.c();
            }
        }
        return g;
    }
    
    static TwitterTopic b(final JsonParser jsonParser, final HashMap hashMap, final HashMap hashMap2, final a a) {
        int n = -1;
        long i = 0L;
        String r = null;
        long j = 0L;
        String r2 = null;
        String r3 = null;
        String r4 = null;
        String r5 = null;
        String r6 = null;
        String r7 = null;
        String r8 = null;
        TwitterTopic$Data a2 = null;
        PromotedContent k = null;
        ArrayList list = null;
        final JsonToken a3 = jsonParser.a();
        boolean b = false;
        String r9 = null;
        JsonToken a6;
        for (JsonToken jsonToken = a3; jsonToken != null && jsonToken != JsonToken.c; jsonToken = a6) {
            final String e = jsonParser.e();
            int d = 0;
            Label_0132: {
                switch (bi.a[jsonToken.ordinal()]) {
                    case 2: {
                        if ("seed_hashtag".equals(e)) {
                            r3 = jsonParser.r();
                            d = n;
                            break Label_0132;
                        }
                        if ("image_url".equals(e)) {
                            r5 = jsonParser.r();
                            d = n;
                            break Label_0132;
                        }
                        if ("title".equals(e)) {
                            r6 = jsonParser.r();
                            d = n;
                            break Label_0132;
                        }
                        if ("subtitle".equals(e)) {
                            r7 = jsonParser.r();
                            d = n;
                            break Label_0132;
                        }
                        if ("query".equals(e)) {
                            r2 = jsonParser.r();
                            d = n;
                            break Label_0132;
                        }
                        if ("reason".equals(e)) {
                            r = jsonParser.r();
                            d = n;
                            break Label_0132;
                        }
                        if ("view_url".equals(e)) {
                            r4 = jsonParser.r();
                            d = n;
                            break Label_0132;
                        }
                        if ("event_status".equals(e)) {
                            r8 = jsonParser.r();
                            d = n;
                            break Label_0132;
                        }
                        break;
                    }
                    case 5: {
                        if ("tweet_count".equals(e)) {
                            j = jsonParser.i();
                            d = n;
                            break Label_0132;
                        }
                        if ("start_time".equals(e)) {
                            i = jsonParser.i();
                            d = n;
                            break Label_0132;
                        }
                        break;
                    }
                    case 4: {
                        if ("metadata".equals(e)) {
                            final JsonToken a4 = jsonParser.a();
                            d = n;
                            for (JsonToken a5 = a4; a5 != null && a5 != JsonToken.c; a5 = jsonParser.a()) {
                                switch (bi.a[a5.ordinal()]) {
                                    case 2: {
                                        final String e2 = jsonParser.e();
                                        if ("id".equals(e2)) {
                                            r9 = jsonParser.r();
                                            break;
                                        }
                                        if ("type".equals(e2)) {
                                            d = TwitterTopic.d(jsonParser.r());
                                            break;
                                        }
                                        break;
                                    }
                                    case 1:
                                    case 4: {
                                        jsonParser.c();
                                        break;
                                    }
                                }
                            }
                            break Label_0132;
                        }
                        if ("sports_data".equals(e)) {
                            a2 = A(jsonParser, a);
                            d = n;
                            break Label_0132;
                        }
                        if ("promoted_content".equals(e)) {
                            k = i(jsonParser);
                            d = n;
                            break Label_0132;
                        }
                        jsonParser.c();
                        d = n;
                        break Label_0132;
                    }
                    case 1: {
                        if (!"tweets".equals(e)) {
                            jsonParser.c();
                            d = n;
                            break Label_0132;
                        }
                        if (hashMap == null) {
                            list = d(jsonParser, a);
                            d = n;
                            break Label_0132;
                        }
                        list = a(jsonParser, hashMap, hashMap2, a);
                        d = n;
                        break Label_0132;
                    }
                    case 7: {
                        if ("spiking".equals(e)) {
                            b = true;
                            d = n;
                            break Label_0132;
                        }
                        break;
                    }
                }
                d = n;
            }
            a6 = jsonParser.a();
            n = d;
        }
        String a7;
        if ((n == 1 || n == 3) && r9 == null) {
            a7 = TwitterTopic.a(r2);
        }
        else {
            a7 = r9;
        }
        if (n == -1 || TextUtils.isEmpty((CharSequence)a7) || TextUtils.isEmpty((CharSequence)r2)) {
            if (a != null) {
                a.a(new InvalidDataException("Failed parsing event; missing required data"));
            }
            return null;
        }
        return new TwitterTopic(new TwitterTopic$Metadata(n, a7, b), r6, r7, r2, r3, r4, r5, r, j, i, 0L, k, list, a2, null, r8);
    }
    
    public static TwitterUser b(final String s) {
        final JsonParser b = bh.a.b(s);
        b.a();
        return a(b, true, null);
    }
    
    public static LvEligibilityResponse b(final JsonParser jsonParser) {
        boolean l = false;
        JsonToken jsonToken = jsonParser.a();
        boolean i = false;
        while (jsonToken != null && jsonToken != JsonToken.c) {
            switch (bi.a[jsonToken.ordinal()]) {
                default: {
                    jsonParser.c();
                    break;
                }
                case 6:
                case 7: {
                    final String e = jsonParser.e();
                    if ("enrolled".equals(e)) {
                        l = jsonParser.l();
                        break;
                    }
                    if ("enrolled_elsewhere".equals(e)) {
                        i = jsonParser.l();
                        break;
                    }
                    break;
                }
            }
            jsonToken = jsonParser.a();
        }
        return new LvEligibilityResponse(l, i);
    }
    
    private static at b(final JsonParser jsonParser, final HashMap hashMap, final HashMap hashMap2, final HashMap hashMap3, final boolean b, final a a) {
        String b2 = null;
        final av av = new av();
        JsonToken a3;
        for (JsonToken a2 = jsonParser.a(); a2 != null && a2 != JsonToken.c; a2 = a3) {
            String string = null;
            Label_0072: {
                switch (bi.a[a2.ordinal()]) {
                    case 4: {
                        final String e = jsonParser.e();
                        if ("tweet".equals(e)) {
                            d(jsonParser, hashMap, hashMap2, av, a);
                            string = b2;
                            break Label_0072;
                        }
                        if ("conversation".equals(e)) {
                            final Conversation c = c(jsonParser, hashMap, hashMap2, a);
                            if (c != null) {
                                av.a(2).a(c).a(c.a().G);
                            }
                            string = b2;
                            break Label_0072;
                        }
                        if ("recap".equals(e)) {
                            av.a(4);
                            a(jsonParser, hashMap, hashMap2, av, a);
                            string = b2;
                            break Label_0072;
                        }
                        if ("carousel".equals(e)) {
                            av.a(6);
                            c(jsonParser, hashMap, hashMap2, av, a);
                            string = b2;
                            break Label_0072;
                        }
                        if ("who_to_follow".equals(e)) {
                            av.a(7);
                            b(jsonParser, hashMap, hashMap2, av, a);
                            string = b2;
                            break Label_0072;
                        }
                        if ("topic".equals(e)) {
                            a(jsonParser, av);
                            string = b2;
                            break Label_0072;
                        }
                        if ("entity_id".equals(e)) {
                            final StringBuilder sb = new StringBuilder();
                            for (JsonToken jsonToken = jsonParser.a(); jsonToken != null && jsonToken != JsonToken.c; jsonToken = jsonParser.a()) {
                                if (jsonToken == JsonToken.h) {
                                    if ("type".equals(jsonParser.e())) {
                                        sb.append(jsonParser.g());
                                    }
                                }
                                else if (jsonToken == JsonToken.d) {
                                    if ("ids".equals(jsonParser.e())) {
                                        final Iterator iterator = aC(jsonParser).iterator();
                                        while (iterator.hasNext()) {
                                            sb.append(iterator.next());
                                        }
                                    }
                                    else {
                                        jsonParser.c();
                                    }
                                }
                                else if (jsonToken == JsonToken.b) {
                                    jsonParser.c();
                                }
                            }
                            string = sb.toString();
                            break Label_0072;
                        }
                        if ("banner".equals(e)) {
                            av.a(a(jsonParser, hashMap2));
                            if (!av.c()) {
                                av.b(3);
                                string = b2;
                                break Label_0072;
                            }
                            break;
                        }
                        else {
                            if ("curated_tweet".equals(e)) {
                                a(jsonParser, hashMap, hashMap2, hashMap3, av, a);
                                string = b2;
                                break Label_0072;
                            }
                            if ("suggests_info".equals(e)) {
                                a((JsonSuggestsInfo)wx.d(jsonParser, JsonSuggestsInfo.class), av);
                                string = b2;
                                break Label_0072;
                            }
                            jsonParser.c();
                            string = b2;
                            break Label_0072;
                        }
                        break;
                    }
                    case 2: {
                        if ("sort_index".equals(jsonParser.e())) {
                            av.b(Long.parseLong(jsonParser.g()));
                            string = b2;
                            break Label_0072;
                        }
                        break;
                    }
                }
                string = b2;
            }
            a3 = jsonParser.a();
            b2 = string;
        }
        if (b && av.a() != null) {
            b2 = av.a().b();
        }
        if (!TextUtils.isEmpty((CharSequence)b2)) {
            av.a(b2);
        }
        return av.e();
    }
    
    public static bb b(final JsonParser jsonParser, final a a, final TwitterUser twitterUser) {
        ArrayList a2 = CollectionUtils.a();
        JsonToken a3 = jsonParser.a();
        Pair pair = null;
        HashMap<Object, TwitterTopic> hashMap = null;
        HashMap hashMap2 = null;
        HashMap<Object, TwitterUser> hashMap3 = null;
        String s = null;
        while (a3 != null && a3 != JsonToken.c) {
            HashMap hashMap4;
            ArrayList list;
            HashMap<Object, TwitterUser> hashMap5;
            HashMap<Object, TwitterTopic> hashMap6;
            Pair pair3;
            if (a3 == JsonToken.b) {
                final String e = jsonParser.e();
                if ("objects".equals(e)) {
                    JsonToken jsonToken = jsonParser.a();
                    HashMap<Object, TwitterUser> n = hashMap3;
                    HashMap a4 = hashMap2;
                    HashMap<Object, TwitterTopic> ab = hashMap;
                    while (jsonToken != null && jsonToken != JsonToken.c) {
                        if (jsonToken == JsonToken.b) {
                            final String e2 = jsonParser.e();
                            if ("tweets".equals(e2)) {
                                a4 = a(jsonParser, twitterUser);
                            }
                            else if ("users".equals(e2)) {
                                n = (HashMap<Object, TwitterUser>)N(jsonParser);
                            }
                            else if ("timelines".equals(e2)) {
                                ab = (HashMap<Object, TwitterTopic>)aB(jsonParser);
                            }
                            else {
                                jsonParser.c();
                            }
                        }
                        else if (jsonToken == JsonToken.d) {
                            jsonParser.c();
                        }
                        jsonToken = jsonParser.a();
                    }
                    final Pair pair2 = pair;
                    hashMap4 = a4;
                    list = a2;
                    hashMap5 = n;
                    hashMap6 = ab;
                    pair3 = pair2;
                }
                else if ("response".equals(e)) {
                    JsonToken jsonToken2 = jsonParser.a();
                    Pair r = pair;
                    final String s2 = s;
                    ArrayList a5 = a2;
                    String g = s2;
                    while (jsonToken2 != null && jsonToken2 != JsonToken.c) {
                        switch (bi.a[jsonToken2.ordinal()]) {
                            case 2: {
                                if ("timeline_id".equals(jsonParser.e())) {
                                    g = jsonParser.g();
                                    break;
                                }
                                break;
                            }
                            case 1: {
                                if ("timeline".equals(jsonParser.e())) {
                                    a5 = a(jsonParser, hashMap2, hashMap3, null, true, a);
                                    break;
                                }
                                jsonParser.c();
                                break;
                            }
                            case 4: {
                                if ("position".equals(jsonParser.e())) {
                                    r = r(jsonParser, a);
                                    break;
                                }
                                jsonParser.c();
                                break;
                            }
                        }
                        jsonToken2 = jsonParser.a();
                    }
                    hashMap6 = hashMap;
                    hashMap4 = hashMap2;
                    pair3 = r;
                    final String s3 = g;
                    hashMap5 = hashMap3;
                    list = a5;
                    s = s3;
                }
                else {
                    jsonParser.c();
                    hashMap6 = hashMap;
                    final ArrayList list2 = a2;
                    hashMap5 = hashMap3;
                    list = list2;
                    final HashMap hashMap7 = hashMap2;
                    pair3 = pair;
                    hashMap4 = hashMap7;
                }
            }
            else {
                if (a3 == JsonToken.d) {
                    jsonParser.c();
                }
                hashMap6 = hashMap;
                final ArrayList list3 = a2;
                hashMap5 = hashMap3;
                list = list3;
                final HashMap hashMap8 = hashMap2;
                pair3 = pair;
                hashMap4 = hashMap8;
            }
            final JsonToken a6 = jsonParser.a();
            hashMap = hashMap6;
            a3 = a6;
            final ArrayList list4 = list;
            hashMap3 = hashMap5;
            a2 = list4;
            final HashMap hashMap9 = hashMap4;
            pair = pair3;
            hashMap2 = hashMap9;
        }
        TwitterUser twitterUser2;
        TwitterTopic twitterTopic2;
        if (hashMap != null && hashMap3 != null) {
            final TwitterTopic twitterTopic = hashMap.get(s);
            if (twitterTopic != null) {
                twitterUser2 = hashMap3.get(String.valueOf(twitterTopic.o()));
                twitterTopic2 = twitterTopic;
            }
            else {
                twitterTopic2 = twitterTopic;
                twitterUser2 = null;
            }
        }
        else {
            twitterTopic2 = null;
            twitterUser2 = null;
        }
        return new bb(twitterTopic2, twitterUser2, a2, (String)pair.first, (String)pair.second);
    }
    
    public static be b(final JsonParser jsonParser, final int n, final a a) {
        long i = -1L;
        String g = null;
        String g2 = null;
        String g3 = null;
        String g4 = null;
        int h = 0;
        int h2 = 0;
        boolean b = false;
        TwitterUser a2 = null;
        final JsonToken a3 = jsonParser.a();
        Object g5 = null;
        for (JsonToken a4 = a3; a4 != null && a4 != JsonToken.c; a4 = jsonParser.a()) {
            switch (bi.a[a4.ordinal()]) {
                case 2: {
                    final String e = jsonParser.e();
                    if ("name".equals(e)) {
                        g = jsonParser.g();
                        break;
                    }
                    if ("full_name".equals(e)) {
                        g2 = jsonParser.g();
                        break;
                    }
                    if ("description".equals(e)) {
                        g3 = jsonParser.g();
                        break;
                    }
                    if ("mode".equals(e)) {
                        if ("public".equals(jsonParser.g())) {
                            b = false;
                            break;
                        }
                        b = true;
                        break;
                    }
                    else {
                        if ("slug".equals(e)) {
                            g4 = jsonParser.g();
                            break;
                        }
                        break;
                    }
                    break;
                }
                case 5: {
                    final String e2 = jsonParser.e();
                    if ("member_count".equals(e2)) {
                        h = jsonParser.h();
                        break;
                    }
                    if ("subscriber_count".equals(e2)) {
                        h2 = jsonParser.h();
                        break;
                    }
                    if ("id".equals(e2)) {
                        i = jsonParser.i();
                        break;
                    }
                    break;
                }
                case 4: {
                    if ("user".equals(g5)) {
                        a2 = a(jsonParser, true, a);
                        break;
                    }
                    jsonParser.c();
                    break;
                }
                case 3: {
                    g5 = jsonParser.g();
                    break;
                }
            }
        }
        return new be(i, g, g2, g3, g4, h, h2, b ? 1 : 0, a2, n);
    }
    
    public static bp b(final JsonParser jsonParser, final boolean b, final a a) {
        return c(jsonParser, b, a).f();
    }
    
    private static m b(final JsonParser p0, final TwitterUser p1, final a p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aconst_null    
        //     1: astore_3       
        //     2: aconst_null    
        //     3: astore          4
        //     5: aconst_null    
        //     6: astore          5
        //     8: aconst_null    
        //     9: astore          6
        //    11: aconst_null    
        //    12: astore          7
        //    14: aconst_null    
        //    15: astore          8
        //    17: aconst_null    
        //    18: astore          9
        //    20: aconst_null    
        //    21: astore          10
        //    23: aconst_null    
        //    24: astore          11
        //    26: aconst_null    
        //    27: astore          12
        //    29: aconst_null    
        //    30: astore          13
        //    32: new             Ljava/util/ArrayList;
        //    35: dup            
        //    36: invokespecial   java/util/ArrayList.<init>:()V
        //    39: astore          14
        //    41: iconst_0       
        //    42: istore          15
        //    44: aload_0        
        //    45: invokevirtual   com/fasterxml/jackson/core/JsonParser.e:()Ljava/lang/String;
        //    48: astore          16
        //    50: getstatic       com/twitter/library/api/bh.c:Ljava/util/HashMap;
        //    53: aload           16
        //    55: invokevirtual   java/util/HashMap.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //    58: checkcast       Ljava/lang/Integer;
        //    61: astore          17
        //    63: aload           17
        //    65: ifnull          199
        //    68: aload           17
        //    70: invokevirtual   java/lang/Integer.intValue:()I
        //    73: istore          19
        //    75: aload_0        
        //    76: invokevirtual   com/fasterxml/jackson/core/JsonParser.a:()Lcom/fasterxml/jackson/core/JsonToken;
        //    79: astore          20
        //    81: aload           20
        //    83: ifnull          1426
        //    86: aload           20
        //    88: getstatic       com/fasterxml/jackson/core/JsonToken.c:Lcom/fasterxml/jackson/core/JsonToken;
        //    91: if_acmpeq       1426
        //    94: getstatic       com/twitter/library/api/bi.a:[I
        //    97: aload           20
        //    99: invokevirtual   com/fasterxml/jackson/core/JsonToken.ordinal:()I
        //   102: iaload         
        //   103: tableswitch {
        //                2: 1256
        //                3: 132
        //                4: 132
        //                5: 206
        //          default: 132
        //        }
        //   132: iload           19
        //   134: istore          30
        //   136: aload           11
        //   138: astore          31
        //   140: aload           6
        //   142: astore          32
        //   144: aload           5
        //   146: astore          33
        //   148: aload           4
        //   150: astore          34
        //   152: aload_3        
        //   153: astore          35
        //   155: aload           7
        //   157: astore          36
        //   159: aload_0        
        //   160: invokevirtual   com/fasterxml/jackson/core/JsonParser.a:()Lcom/fasterxml/jackson/core/JsonToken;
        //   163: astore          37
        //   165: aload           36
        //   167: astore          7
        //   169: aload           32
        //   171: astore          6
        //   173: aload           33
        //   175: astore          5
        //   177: aload           34
        //   179: astore          4
        //   181: aload           35
        //   183: astore_3       
        //   184: aload           31
        //   186: astore          11
        //   188: iload           30
        //   190: istore          19
        //   192: aload           37
        //   194: astore          20
        //   196: goto            81
        //   199: aload_0        
        //   200: invokevirtual   com/fasterxml/jackson/core/JsonParser.c:()Lcom/fasterxml/jackson/core/JsonParser;
        //   203: pop            
        //   204: aconst_null    
        //   205: areturn        
        //   206: aload_0        
        //   207: invokevirtual   com/fasterxml/jackson/core/JsonParser.e:()Ljava/lang/String;
        //   210: astore          40
        //   212: ldc             "metadata"
        //   214: aload           40
        //   216: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   219: ifeq            427
        //   222: iload           19
        //   224: tableswitch {
        //                0: 319
        //                1: 395
        //                2: 284
        //                3: 284
        //                4: 319
        //                5: 284
        //                6: 319
        //                7: 319
        //                8: 284
        //                9: 284
        //               10: 319
        //          default: 284
        //        }
        //   284: aload_0        
        //   285: invokevirtual   com/fasterxml/jackson/core/JsonParser.c:()Lcom/fasterxml/jackson/core/JsonParser;
        //   288: pop            
        //   289: iload           19
        //   291: istore          30
        //   293: aload           11
        //   295: astore          31
        //   297: aload           6
        //   299: astore          32
        //   301: aload           5
        //   303: astore          33
        //   305: aload           4
        //   307: astore          34
        //   309: aload_3        
        //   310: astore          35
        //   312: aload           7
        //   314: astore          36
        //   316: goto            159
        //   319: aload_0        
        //   320: ldc             Lcom/twitter/model/json/core/JsonTwitterStatusMetadata;.class
        //   322: invokestatic    wx.a:(Lcom/fasterxml/jackson/core/JsonParser;Ljava/lang/Class;)Ljava/lang/Object;
        //   325: checkcast       Lxb;
        //   328: astore          62
        //   330: aload           62
        //   332: ifnull          357
        //   335: ldc_w           "top"
        //   338: aload           62
        //   340: getfield        xb.e:Ljava/lang/String;
        //   343: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   346: ifeq            357
        //   349: aload           62
        //   351: ldc_w           "popular"
        //   354: putfield        xb.e:Ljava/lang/String;
        //   357: aload           62
        //   359: getfield        xb.g:Lxa;
        //   362: astore          10
        //   364: aload           11
        //   366: astore          31
        //   368: aload           7
        //   370: astore          36
        //   372: aload           6
        //   374: astore          32
        //   376: aload           5
        //   378: astore          33
        //   380: aload           4
        //   382: astore          34
        //   384: aload           62
        //   386: astore          35
        //   388: iload           19
        //   390: istore          30
        //   392: goto            159
        //   395: aload_0        
        //   396: invokestatic    com/twitter/library/api/bh.z:(Lcom/fasterxml/jackson/core/JsonParser;)Lcom/twitter/library/api/TwitterUserMetadata;
        //   399: astore          31
        //   401: aload           6
        //   403: astore          32
        //   405: aload           5
        //   407: astore          33
        //   409: aload           4
        //   411: astore          34
        //   413: aload_3        
        //   414: astore          35
        //   416: iload           19
        //   418: istore          30
        //   420: aload           7
        //   422: astore          36
        //   424: goto            159
        //   427: ldc             "data"
        //   429: aload           40
        //   431: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   434: ifeq            1132
        //   437: iload           19
        //   439: tableswitch {
        //                0: 543
        //                1: 722
        //                2: 508
        //                3: 760
        //                4: 543
        //                5: 508
        //                6: 508
        //                7: 1012
        //                8: 508
        //                9: 508
        //               10: 508
        //               11: 1049
        //               12: 963
        //               13: 1049
        //          default: 508
        //        }
        //   508: aload_0        
        //   509: invokevirtual   com/fasterxml/jackson/core/JsonParser.c:()Lcom/fasterxml/jackson/core/JsonParser;
        //   512: pop            
        //   513: iload           19
        //   515: istore          30
        //   517: aload           11
        //   519: astore          31
        //   521: aload           6
        //   523: astore          32
        //   525: aload           5
        //   527: astore          33
        //   529: aload           4
        //   531: astore          34
        //   533: aload_3        
        //   534: astore          35
        //   536: aload           7
        //   538: astore          36
        //   540: goto            159
        //   543: aload_0        
        //   544: aload_1        
        //   545: aload_3        
        //   546: iconst_1       
        //   547: iconst_1       
        //   548: aload_2        
        //   549: invokestatic    com/twitter/library/api/bh.a:(Lcom/fasterxml/jackson/core/JsonParser;Lcom/twitter/library/api/TwitterUser;Lxb;ZZLcom/twitter/errorreporter/a;)Lcom/twitter/library/api/bq;
        //   552: invokevirtual   com/twitter/library/api/bq.f:()Lcom/twitter/library/api/bp;
        //   555: astore          59
        //   557: aload           59
        //   559: astore          56
        //   561: aload           56
        //   563: getfield        com/twitter/library/api/bp.F:Lxb;
        //   566: ifnull          633
        //   569: iload           19
        //   571: iconst_4       
        //   572: if_icmpne       592
        //   575: aload           56
        //   577: getfield        com/twitter/library/api/bp.F:Lxb;
        //   580: ldc             "news"
        //   582: putfield        xb.e:Ljava/lang/String;
        //   585: iload           19
        //   587: istore          30
        //   589: goto            1823
        //   592: aload           56
        //   594: getfield        com/twitter/library/api/bp.F:Lxb;
        //   597: getfield        xb.d:Lcom/twitter/library/api/TwitterSearchHighlight;
        //   600: ifnull          633
        //   603: bipush          9
        //   605: istore          19
        //   607: aload           56
        //   609: getfield        com/twitter/library/api/bp.F:Lxb;
        //   612: new             Lcom/twitter/library/api/bo;
        //   615: dup            
        //   616: invokespecial   com/twitter/library/api/bo.<init>:()V
        //   619: bipush          23
        //   621: invokevirtual   com/twitter/library/api/bo.a:(I)Lcom/twitter/library/api/bo;
        //   624: invokevirtual   com/twitter/library/api/bo.f:()Ljava/lang/Object;
        //   627: checkcast       Lcom/twitter/library/api/TwitterSocialProof;
        //   630: putfield        xb.f:Lcom/twitter/library/api/TwitterSocialProof;
        //   633: iload           19
        //   635: istore          30
        //   637: goto            1823
        //   640: astore          54
        //   642: aload           54
        //   644: astore          55
        //   646: aload           4
        //   648: astore          56
        //   650: iload           19
        //   652: istore          30
        //   654: aload_2        
        //   655: ifnull          696
        //   658: iconst_1       
        //   659: anewarray       Ljava/lang/Object;
        //   662: astore          57
        //   664: aload           57
        //   666: iconst_0       
        //   667: aload           55
        //   669: getfield        com/twitter/library/util/NullUserException.statusId:J
        //   672: invokestatic    java/lang/Long.valueOf:(J)Ljava/lang/Long;
        //   675: aastore        
        //   676: aload_2        
        //   677: new             Lcom/twitter/library/util/InvalidDataException;
        //   680: dup            
        //   681: ldc_w           "Received null user for status = %d"
        //   684: aload           57
        //   686: invokestatic    java/lang/String.format:(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
        //   689: invokespecial   com/twitter/library/util/InvalidDataException.<init>:(Ljava/lang/String;)V
        //   692: invokevirtual   com/twitter/errorreporter/a.a:(Ljava/lang/Throwable;)Lcom/twitter/errorreporter/a;
        //   695: pop            
        //   696: aload           6
        //   698: astore          32
        //   700: aload           5
        //   702: astore          33
        //   704: aload           56
        //   706: astore          34
        //   708: aload           11
        //   710: astore          31
        //   712: aload_3        
        //   713: astore          35
        //   715: aload           7
        //   717: astore          36
        //   719: goto            159
        //   722: aload_0        
        //   723: iconst_1       
        //   724: aload_2        
        //   725: invokestatic    com/twitter/library/api/bh.a:(Lcom/fasterxml/jackson/core/JsonParser;ZLcom/twitter/errorreporter/a;)Lcom/twitter/library/api/TwitterUser;
        //   728: astore          53
        //   730: aload           11
        //   732: astore          31
        //   734: aload           6
        //   736: astore          32
        //   738: aload           53
        //   740: astore          33
        //   742: aload           4
        //   744: astore          34
        //   746: iload           19
        //   748: istore          30
        //   750: aload_3        
        //   751: astore          35
        //   753: aload           7
        //   755: astore          36
        //   757: goto            159
        //   760: new             Ljava/util/ArrayList;
        //   763: dup            
        //   764: invokespecial   java/util/ArrayList.<init>:()V
        //   767: astore          48
        //   769: aload_0        
        //   770: aload           48
        //   772: invokestatic    com/twitter/library/api/bh.a:(Lcom/fasterxml/jackson/core/JsonParser;Ljava/util/ArrayList;)I
        //   775: istore          49
        //   777: iload           49
        //   779: iconst_m1      
        //   780: if_icmpeq       132
        //   783: iload           49
        //   785: tableswitch {
        //                4: 922
        //                5: 838
        //          default: 808
        //        }
        //   808: iload           49
        //   810: istore          30
        //   812: aload           6
        //   814: astore          32
        //   816: aload           5
        //   818: astore          33
        //   820: aload           4
        //   822: astore          34
        //   824: aload           11
        //   826: astore          31
        //   828: aload_3        
        //   829: astore          35
        //   831: aload           7
        //   833: astore          36
        //   835: goto            159
        //   838: aload           48
        //   840: invokevirtual   java/util/ArrayList.size:()I
        //   843: anewarray       Ljava/lang/String;
        //   846: astore          8
        //   848: aload           48
        //   850: invokevirtual   java/util/ArrayList.iterator:()Ljava/util/Iterator;
        //   853: astore          51
        //   855: iconst_0       
        //   856: istore          52
        //   858: aload           51
        //   860: invokeinterface java/util/Iterator.hasNext:()Z
        //   865: ifeq            892
        //   868: aload           8
        //   870: iload           52
        //   872: aload           51
        //   874: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   879: checkcast       Lcom/twitter/library/api/TwitterSearchSuggestion;
        //   882: getfield        com/twitter/library/api/TwitterSearchSuggestion.query:Ljava/lang/String;
        //   885: aastore        
        //   886: iinc            52, 1
        //   889: goto            858
        //   892: iload           49
        //   894: istore          30
        //   896: aload           6
        //   898: astore          32
        //   900: aload           5
        //   902: astore          33
        //   904: aload           4
        //   906: astore          34
        //   908: aload           11
        //   910: astore          31
        //   912: aload_3        
        //   913: astore          35
        //   915: aload           7
        //   917: astore          36
        //   919: goto            159
        //   922: aload           48
        //   924: iconst_0       
        //   925: invokevirtual   java/util/ArrayList.get:(I)Ljava/lang/Object;
        //   928: checkcast       Lcom/twitter/library/api/TwitterSearchSuggestion;
        //   931: astore          50
        //   933: aload           6
        //   935: astore          32
        //   937: aload           5
        //   939: astore          33
        //   941: aload           4
        //   943: astore          34
        //   945: aload           11
        //   947: astore          31
        //   949: aload_3        
        //   950: astore          35
        //   952: aload           50
        //   954: astore          36
        //   956: iload           49
        //   958: istore          30
        //   960: goto            159
        //   963: aload_0        
        //   964: aload_2        
        //   965: invokestatic    com/twitter/library/api/bh.k:(Lcom/fasterxml/jackson/core/JsonParser;Lcom/twitter/errorreporter/a;)Lcom/twitter/library/api/TwitterSearchSummary;
        //   968: astore          13
        //   970: aload           13
        //   972: ifnull          132
        //   975: aload           13
        //   977: getfield        com/twitter/library/api/TwitterSearchSummary.tweets:Ljava/util/ArrayList;
        //   980: astore          47
        //   982: aload           11
        //   984: astore          31
        //   986: aload           47
        //   988: astore          32
        //   990: aload           5
        //   992: astore          33
        //   994: aload           4
        //   996: astore          34
        //   998: iload           19
        //  1000: istore          30
        //  1002: aload_3        
        //  1003: astore          35
        //  1005: aload           7
        //  1007: astore          36
        //  1009: goto            159
        //  1012: aload_0        
        //  1013: aload_2        
        //  1014: invokestatic    com/twitter/library/api/bh.B:(Lcom/fasterxml/jackson/core/JsonParser;Lcom/twitter/errorreporter/a;)Ljava/util/ArrayList;
        //  1017: astore          46
        //  1019: aload           11
        //  1021: astore          31
        //  1023: aload           46
        //  1025: astore          32
        //  1027: aload           5
        //  1029: astore          33
        //  1031: aload           4
        //  1033: astore          34
        //  1035: iload           19
        //  1037: istore          30
        //  1039: aload_3        
        //  1040: astore          35
        //  1042: aload           7
        //  1044: astore          36
        //  1046: goto            159
        //  1049: aload_0        
        //  1050: aconst_null    
        //  1051: aconst_null    
        //  1052: aload_2        
        //  1053: invokestatic    com/twitter/library/api/bh.b:(Lcom/fasterxml/jackson/core/JsonParser;Ljava/util/HashMap;Ljava/util/HashMap;Lcom/twitter/errorreporter/a;)Lcom/twitter/library/api/TwitterTopic;
        //  1056: astore          43
        //  1058: aload           43
        //  1060: ifnonnull       1084
        //  1063: aload_2        
        //  1064: ifnull          1082
        //  1067: aload_2        
        //  1068: new             Lcom/twitter/library/util/InvalidDataException;
        //  1071: dup            
        //  1072: ldc_w           "Search with null or empty event"
        //  1075: invokespecial   com/twitter/library/util/InvalidDataException.<init>:(Ljava/lang/String;)V
        //  1078: invokevirtual   com/twitter/errorreporter/a.a:(Ljava/lang/Throwable;)Lcom/twitter/errorreporter/a;
        //  1081: pop            
        //  1082: aconst_null    
        //  1083: areturn        
        //  1084: aload           14
        //  1086: aload           43
        //  1088: invokevirtual   java/util/ArrayList.add:(Ljava/lang/Object;)Z
        //  1091: pop            
        //  1092: iload           19
        //  1094: bipush          13
        //  1096: if_icmpne       132
        //  1099: iconst_1       
        //  1100: istore          15
        //  1102: iload           19
        //  1104: istore          30
        //  1106: aload           11
        //  1108: astore          31
        //  1110: aload           6
        //  1112: astore          32
        //  1114: aload           5
        //  1116: astore          33
        //  1118: aload           4
        //  1120: astore          34
        //  1122: aload_3        
        //  1123: astore          35
        //  1125: aload           7
        //  1127: astore          36
        //  1129: goto            159
        //  1132: ldc_w           "filter"
        //  1135: aload           40
        //  1137: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //  1140: ifeq            1221
        //  1143: iload           19
        //  1145: bipush          10
        //  1147: if_icmpne       1186
        //  1150: aload_0        
        //  1151: invokestatic    com/twitter/library/api/bh.ar:(Lcom/fasterxml/jackson/core/JsonParser;)Lcom/twitter/library/api/TwitterSearchFilter;
        //  1154: astore          12
        //  1156: iload           19
        //  1158: istore          30
        //  1160: aload           11
        //  1162: astore          31
        //  1164: aload           6
        //  1166: astore          32
        //  1168: aload           5
        //  1170: astore          33
        //  1172: aload           4
        //  1174: astore          34
        //  1176: aload_3        
        //  1177: astore          35
        //  1179: aload           7
        //  1181: astore          36
        //  1183: goto            159
        //  1186: aload_0        
        //  1187: invokevirtual   com/fasterxml/jackson/core/JsonParser.c:()Lcom/fasterxml/jackson/core/JsonParser;
        //  1190: pop            
        //  1191: iload           19
        //  1193: istore          30
        //  1195: aload           11
        //  1197: astore          31
        //  1199: aload           6
        //  1201: astore          32
        //  1203: aload           5
        //  1205: astore          33
        //  1207: aload           4
        //  1209: astore          34
        //  1211: aload_3        
        //  1212: astore          35
        //  1214: aload           7
        //  1216: astore          36
        //  1218: goto            159
        //  1221: aload_0        
        //  1222: invokevirtual   com/fasterxml/jackson/core/JsonParser.c:()Lcom/fasterxml/jackson/core/JsonParser;
        //  1225: pop            
        //  1226: iload           19
        //  1228: istore          30
        //  1230: aload           11
        //  1232: astore          31
        //  1234: aload           6
        //  1236: astore          32
        //  1238: aload           5
        //  1240: astore          33
        //  1242: aload           4
        //  1244: astore          34
        //  1246: aload_3        
        //  1247: astore          35
        //  1249: aload           7
        //  1251: astore          36
        //  1253: goto            159
        //  1256: ldc             "data"
        //  1258: aload_0        
        //  1259: invokevirtual   com/fasterxml/jackson/core/JsonParser.e:()Ljava/lang/String;
        //  1262: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //  1265: ifeq            1391
        //  1268: iload           19
        //  1270: bipush          6
        //  1272: if_icmpne       1312
        //  1275: aload_0        
        //  1276: aconst_null    
        //  1277: invokestatic    com/twitter/library/api/bh.l:(Lcom/fasterxml/jackson/core/JsonParser;Lcom/twitter/errorreporter/a;)Ljava/util/ArrayList;
        //  1280: astore          9
        //  1282: iload           19
        //  1284: istore          30
        //  1286: aload           11
        //  1288: astore          31
        //  1290: aload           6
        //  1292: astore          32
        //  1294: aload           5
        //  1296: astore          33
        //  1298: aload           4
        //  1300: astore          34
        //  1302: aload_3        
        //  1303: astore          35
        //  1305: aload           7
        //  1307: astore          36
        //  1309: goto            159
        //  1312: iload           19
        //  1314: bipush          10
        //  1316: if_icmpne       1356
        //  1319: aload_0        
        //  1320: aload_2        
        //  1321: invokestatic    com/twitter/library/api/bh.d:(Lcom/fasterxml/jackson/core/JsonParser;Lcom/twitter/errorreporter/a;)Ljava/util/ArrayList;
        //  1324: astore          39
        //  1326: aload           11
        //  1328: astore          31
        //  1330: aload           39
        //  1332: astore          32
        //  1334: aload           5
        //  1336: astore          33
        //  1338: aload           4
        //  1340: astore          34
        //  1342: iload           19
        //  1344: istore          30
        //  1346: aload_3        
        //  1347: astore          35
        //  1349: aload           7
        //  1351: astore          36
        //  1353: goto            159
        //  1356: aload_0        
        //  1357: invokevirtual   com/fasterxml/jackson/core/JsonParser.c:()Lcom/fasterxml/jackson/core/JsonParser;
        //  1360: pop            
        //  1361: iload           19
        //  1363: istore          30
        //  1365: aload           11
        //  1367: astore          31
        //  1369: aload           6
        //  1371: astore          32
        //  1373: aload           5
        //  1375: astore          33
        //  1377: aload           4
        //  1379: astore          34
        //  1381: aload_3        
        //  1382: astore          35
        //  1384: aload           7
        //  1386: astore          36
        //  1388: goto            159
        //  1391: aload_0        
        //  1392: invokevirtual   com/fasterxml/jackson/core/JsonParser.c:()Lcom/fasterxml/jackson/core/JsonParser;
        //  1395: pop            
        //  1396: iload           19
        //  1398: istore          30
        //  1400: aload           11
        //  1402: astore          31
        //  1404: aload           6
        //  1406: astore          32
        //  1408: aload           5
        //  1410: astore          33
        //  1412: aload           4
        //  1414: astore          34
        //  1416: aload_3        
        //  1417: astore          35
        //  1419: aload           7
        //  1421: astore          36
        //  1423: goto            159
        //  1426: iload           19
        //  1428: tableswitch {
        //                0: 1533
        //                1: 1550
        //                2: 1608
        //                3: 1634
        //                4: 1533
        //                5: 1496
        //                6: 1692
        //                7: 1718
        //                8: 1496
        //                9: 1533
        //               10: 1718
        //               11: 1496
        //               12: 1666
        //          default: 1496
        //        }
        //  1496: iconst_0       
        //  1497: istore          23
        //  1499: new             Lcom/twitter/library/api/search/m;
        //  1502: dup            
        //  1503: iload           19
        //  1505: aload           4
        //  1507: aload           5
        //  1509: aload           6
        //  1511: aload           7
        //  1513: aload           8
        //  1515: aload           9
        //  1517: aload           10
        //  1519: aload           12
        //  1521: aload           13
        //  1523: iload           23
        //  1525: aload           14
        //  1527: iload           15
        //  1529: invokespecial   com/twitter/library/api/search/m.<init>:(ILcom/twitter/library/api/bp;Lcom/twitter/library/api/TwitterUser;Ljava/util/ArrayList;Lcom/twitter/library/api/TwitterSearchSuggestion;[Ljava/lang/String;Ljava/util/ArrayList;Lxa;Lcom/twitter/library/api/TwitterSearchFilter;Lcom/twitter/library/api/TwitterSearchSummary;ZLjava/util/ArrayList;Z)V
        //  1532: areturn        
        //  1533: aload           4
        //  1535: ifnonnull       1540
        //  1538: aconst_null    
        //  1539: areturn        
        //  1540: aload           4
        //  1542: invokevirtual   com/twitter/library/api/bp.f:()Z
        //  1545: istore          23
        //  1547: goto            1499
        //  1550: aload           5
        //  1552: ifnonnull       1557
        //  1555: aconst_null    
        //  1556: areturn        
        //  1557: aload           11
        //  1559: ifnull          1496
        //  1562: aload           5
        //  1564: aload           11
        //  1566: putfield        com/twitter/library/api/TwitterUser.metadata:Lcom/twitter/library/api/TwitterUserMetadata;
        //  1569: aload           11
        //  1571: getfield        com/twitter/library/api/TwitterUserMetadata.a:Lcom/twitter/library/api/TwitterSocialProof;
        //  1574: ifnull          1496
        //  1577: aload           5
        //  1579: getfield        com/twitter/library/api/TwitterUser.friendship:I
        //  1582: aload           11
        //  1584: getfield        com/twitter/library/api/TwitterUserMetadata.a:Lcom/twitter/library/api/TwitterSocialProof;
        //  1587: getfield        com/twitter/library/api/TwitterSocialProof.friendship:I
        //  1590: invokestatic    com/twitter/library/api/z.a:(II)I
        //  1593: istore          28
        //  1595: aload           5
        //  1597: iload           28
        //  1599: putfield        com/twitter/library/api/TwitterUser.friendship:I
        //  1602: iconst_0       
        //  1603: istore          23
        //  1605: goto            1499
        //  1608: aload           7
        //  1610: ifnonnull       1496
        //  1613: aload_2        
        //  1614: ifnull          1632
        //  1617: aload_2        
        //  1618: new             Lcom/twitter/library/util/InvalidDataException;
        //  1621: dup            
        //  1622: ldc_w           "Search with null spelling suggestions."
        //  1625: invokespecial   com/twitter/library/util/InvalidDataException.<init>:(Ljava/lang/String;)V
        //  1628: invokevirtual   com/twitter/errorreporter/a.a:(Ljava/lang/Throwable;)Lcom/twitter/errorreporter/a;
        //  1631: pop            
        //  1632: aconst_null    
        //  1633: areturn        
        //  1634: aload           8
        //  1636: ifnull          1645
        //  1639: aload           8
        //  1641: arraylength    
        //  1642: ifne            1496
        //  1645: aload_2        
        //  1646: ifnull          1664
        //  1649: aload_2        
        //  1650: new             Lcom/twitter/library/util/InvalidDataException;
        //  1653: dup            
        //  1654: ldc_w           "Search with null or empty related."
        //  1657: invokespecial   com/twitter/library/util/InvalidDataException.<init>:(Ljava/lang/String;)V
        //  1660: invokevirtual   com/twitter/errorreporter/a.a:(Ljava/lang/Throwable;)Lcom/twitter/errorreporter/a;
        //  1663: pop            
        //  1664: aconst_null    
        //  1665: areturn        
        //  1666: aload           13
        //  1668: ifnonnull       1496
        //  1671: aload_2        
        //  1672: ifnull          1690
        //  1675: aload_2        
        //  1676: new             Lcom/twitter/library/util/InvalidDataException;
        //  1679: dup            
        //  1680: ldc_w           "Search with null or empty summary."
        //  1683: invokespecial   com/twitter/library/util/InvalidDataException.<init>:(Ljava/lang/String;)V
        //  1686: invokevirtual   com/twitter/errorreporter/a.a:(Ljava/lang/Throwable;)Lcom/twitter/errorreporter/a;
        //  1689: pop            
        //  1690: aconst_null    
        //  1691: areturn        
        //  1692: aload           9
        //  1694: ifnonnull       1496
        //  1697: aload_2        
        //  1698: ifnull          1716
        //  1701: aload_2        
        //  1702: new             Lcom/twitter/library/util/InvalidDataException;
        //  1705: dup            
        //  1706: ldc_w           "Search with null or empty user gallery."
        //  1709: invokespecial   com/twitter/library/util/InvalidDataException.<init>:(Ljava/lang/String;)V
        //  1712: invokevirtual   com/twitter/errorreporter/a.a:(Ljava/lang/Throwable;)Lcom/twitter/errorreporter/a;
        //  1715: pop            
        //  1716: aconst_null    
        //  1717: areturn        
        //  1718: aload           6
        //  1720: ifnull          1731
        //  1723: aload           6
        //  1725: invokevirtual   java/util/ArrayList.isEmpty:()Z
        //  1728: ifeq            1752
        //  1731: aload_2        
        //  1732: ifnull          1750
        //  1735: aload_2        
        //  1736: new             Lcom/twitter/library/util/InvalidDataException;
        //  1739: dup            
        //  1740: ldc_w           "Search with null or empty tweet/media gallery."
        //  1743: invokespecial   com/twitter/library/util/InvalidDataException.<init>:(Ljava/lang/String;)V
        //  1746: invokevirtual   com/twitter/errorreporter/a.a:(Ljava/lang/Throwable;)Lcom/twitter/errorreporter/a;
        //  1749: pop            
        //  1750: aconst_null    
        //  1751: areturn        
        //  1752: aload           6
        //  1754: iconst_0       
        //  1755: invokevirtual   java/util/ArrayList.get:(I)Ljava/lang/Object;
        //  1758: checkcast       Lcom/twitter/library/api/bp;
        //  1761: astore          22
        //  1763: aload           22
        //  1765: ifnull          1496
        //  1768: aload           22
        //  1770: getfield        com/twitter/library/api/bp.F:Lxb;
        //  1773: ifnull          1496
        //  1776: aload_3        
        //  1777: ifnull          1496
        //  1780: aload           22
        //  1782: getfield        com/twitter/library/api/bp.F:Lxb;
        //  1785: aload_3        
        //  1786: getfield        xb.i:Ljava/lang/String;
        //  1789: putfield        xb.i:Ljava/lang/String;
        //  1792: aload           22
        //  1794: getfield        com/twitter/library/api/bp.F:Lxb;
        //  1797: aload_3        
        //  1798: getfield        xb.j:Ljava/lang/String;
        //  1801: putfield        xb.j:Ljava/lang/String;
        //  1804: iconst_0       
        //  1805: istore          23
        //  1807: goto            1499
        //  1810: astore          60
        //  1812: aload           60
        //  1814: astore          55
        //  1816: iload           19
        //  1818: istore          30
        //  1820: goto            654
        //  1823: aload           6
        //  1825: astore          32
        //  1827: aload           5
        //  1829: astore          33
        //  1831: aload           56
        //  1833: astore          34
        //  1835: aload           11
        //  1837: astore          31
        //  1839: aload_3        
        //  1840: astore          35
        //  1842: aload           7
        //  1844: astore          36
        //  1846: goto            159
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                        
        //  -----  -----  -----  -----  --------------------------------------------
        //  543    557    640    654    Lcom/twitter/library/util/NullUserException;
        //  561    569    1810   1823   Lcom/twitter/library/util/NullUserException;
        //  575    585    1810   1823   Lcom/twitter/library/util/NullUserException;
        //  592    603    1810   1823   Lcom/twitter/library/util/NullUserException;
        //  607    633    1810   1823   Lcom/twitter/library/util/NullUserException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0592:
        //     at com.strobel.decompiler.ast.Error.expressionLinkedFromMultipleLocations(Error.java:27)
        //     at com.strobel.decompiler.ast.AstOptimizer.mergeDisparateObjectInitializations(AstOptimizer.java:2592)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:235)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:42)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:214)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:99)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:757)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:655)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:532)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:499)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:141)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:130)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:105)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:317)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:238)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:123)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    private static ArrayList b(final JsonParser jsonParser, final int n) {
        final long currentTimeMillis = System.currentTimeMillis();
        final ArrayList<TwitterTypeAhead> list = new ArrayList<TwitterTypeAhead>();
        for (JsonToken jsonToken = jsonParser.a(); jsonToken != null && jsonToken != JsonToken.e; jsonToken = jsonParser.a()) {
            switch (bi.a[jsonToken.ordinal()]) {
                case 4: {
                    final TwitterTypeAhead a = a(jsonParser, currentTimeMillis, n);
                    if (a != null) {
                        list.add(a);
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
        return list;
    }
    
    public static ArrayList b(final JsonParser jsonParser, final a a) {
        final ArrayList<TwitterUser> list = new ArrayList<TwitterUser>();
        if (jsonParser != null) {
            for (JsonToken jsonToken = jsonParser.d(); jsonToken != null && jsonToken != JsonToken.e; jsonToken = jsonParser.a()) {
                if (jsonToken == JsonToken.b) {
                    final TwitterUser a2 = a(jsonParser, true, a);
                    if (a2 != null) {
                        list.add(a2);
                    }
                }
            }
        }
        return list;
    }
    
    private static ArrayList b(final JsonParser jsonParser, final HashMap hashMap, final a a) {
        final ArrayList<Conversation$Participant> list = new ArrayList<Conversation$Participant>();
        for (JsonToken jsonToken = jsonParser.a(); jsonToken != null && jsonToken != JsonToken.e; jsonToken = jsonParser.a()) {
            switch (bi.a[jsonToken.ordinal()]) {
                case 2: {
                    final String g = jsonParser.g();
                    final TwitterUser twitterUser = hashMap.get(g);
                    if (twitterUser != null) {
                        list.add(new Conversation$Participant(twitterUser));
                        break;
                    }
                    if (a != null) {
                        a.a(new InvalidDataException("Participant " + g + " not in users map"));
                        break;
                    }
                    break;
                }
                case 1:
                case 4: {
                    jsonParser.c();
                    break;
                }
            }
        }
        return list;
    }
    
    private static void b(final JsonParser jsonParser, final ArrayList list) {
        final ArrayList<int[]> list2 = new ArrayList<int[]>();
        final JsonToken a = jsonParser.a();
        String g = null;
        for (JsonToken a2 = a; a2 != null && a2 != JsonToken.e; a2 = jsonParser.a()) {
            if (a2 == JsonToken.b) {
                for (JsonToken jsonToken = jsonParser.a(); jsonToken != null && jsonToken != JsonToken.c; jsonToken = jsonParser.a()) {
                    switch (bi.a[jsonToken.ordinal()]) {
                        case 2: {
                            if ("query".equals(jsonParser.e())) {
                                g = jsonParser.g();
                                break;
                            }
                            break;
                        }
                        case 1: {
                            if ("indices".equals(jsonParser.e())) {
                                for (JsonToken jsonToken2 = jsonParser.a(); jsonToken2 != null && jsonToken2 != JsonToken.e; jsonToken2 = jsonParser.a()) {
                                    int h = 0;
                                    int h2 = 0;
                                    switch (bi.a[jsonToken2.ordinal()]) {
                                        default: {
                                            h = -1;
                                            h2 = -1;
                                            break;
                                        }
                                        case 4: {
                                            jsonParser.c();
                                            h = -1;
                                            h2 = -1;
                                            break;
                                        }
                                        case 1: {
                                            h2 = -1;
                                            JsonToken a3 = jsonToken2;
                                            h = -1;
                                            while (a3 != null && a3 != JsonToken.e) {
                                                if (a3 == JsonToken.i) {
                                                    if (h2 == -1) {
                                                        h2 = jsonParser.h();
                                                    }
                                                    else {
                                                        h = jsonParser.h();
                                                    }
                                                }
                                                a3 = jsonParser.a();
                                            }
                                            break;
                                        }
                                    }
                                    if (h2 > -1 && h2 < h && (g == null || h <= g.length())) {
                                        list2.add(new int[] { h2, h });
                                    }
                                }
                                break;
                            }
                            break;
                        }
                        case 4: {
                            jsonParser.c();
                            break;
                        }
                    }
                }
                list.add(new TwitterSearchSuggestion(g, list2));
            }
        }
    }
    
    private static void b(final JsonParser jsonParser, final HashMap hashMap, final HashMap hashMap2, final av av, final a a) {
        final JsonWhoToFollow jsonWhoToFollow = (JsonWhoToFollow)wx.d(jsonParser, JsonWhoToFollow.class);
        if (jsonWhoToFollow != null) {
            final JsonStrings e = jsonWhoToFollow.e;
            final int f = f(jsonWhoToFollow.c);
            final JsonSuggestsInfos f2 = jsonWhoToFollow.f;
            final HashMap<Object, av> hashMap3 = new HashMap<Object, av>();
            if (f != -1) {
                final int length = jsonWhoToFollow.a.length;
                final ArrayList list = new ArrayList<TwitterUser>(length);
                final ArrayList list2 = new ArrayList<bp>(length);
                final HashMap hashMap4 = new HashMap<Object, TwitterSocialProof>(jsonWhoToFollow.d.size());
                final Set entrySet = jsonWhoToFollow.d.entrySet();
                final Collection values = jsonWhoToFollow.b.values();
                for (final Map.Entry<K, JsonSocialProof> entry : entrySet) {
                    final TwitterSocialProof a2 = a(entry.getValue(), hashMap2);
                    if (a2 != null) {
                        hashMap4.put((K)entry.getKey(), a2);
                    }
                }
                final String[] a3 = jsonWhoToFollow.a;
                for (int length2 = a3.length, i = 0; i < length2; ++i) {
                    final TwitterUser twitterUser = hashMap2.get(a3[i]);
                    if (twitterUser != null) {
                        list.add(twitterUser);
                    }
                }
                final Iterator<String> iterator2 = values.iterator();
                while (iterator2.hasNext()) {
                    final bp a4 = a(iterator2.next(), hashMap, hashMap2, a);
                    if (a4 != null) {
                        list2.add(a4);
                    }
                }
                EntityScribeContent entityScribeContent;
                if (f2 == null) {
                    entityScribeContent = null;
                }
                else {
                    a(f2.a, av);
                    final EntityScribeContent entityScribeContent2 = new EntityScribeContent(av.b(), av.d());
                    if (f2.c != null) {
                        for (final Map.Entry<K, JsonSuggestsInfo> entry2 : f2.c.entrySet()) {
                            final String s = (String)entry2.getKey();
                            av av2 = hashMap3.get(s);
                            if (av2 == null) {
                                av2 = new av();
                                hashMap3.put(s, av2);
                            }
                            a(entry2.getValue(), av2);
                        }
                    }
                    entityScribeContent = entityScribeContent2;
                }
                final HashMap<String, EntityScribeContent> hashMap5 = new HashMap<String, EntityScribeContent>();
                for (final Map.Entry<String, av> entry3 : hashMap3.entrySet()) {
                    final av av3 = entry3.getValue();
                    hashMap5.put(entry3.getKey(), new EntityScribeContent(av3.b(), av3.d()));
                }
                av.a(new WhoToFollow(list, list2, (WhoToFollow$Metadata)new cf().a(f).a(e).a(hashMap4).a(entityScribeContent).b(hashMap5).f()));
            }
        }
    }
    
    public static Pair c(final JsonParser jsonParser, final a a) {
        final ArrayList<TwitterUser> list = new ArrayList<TwitterUser>();
        final ArrayList<String> list2 = new ArrayList<String>();
        for (JsonToken jsonToken = jsonParser.a(); jsonToken != null && jsonToken != JsonToken.c; jsonToken = jsonParser.a()) {
            if (jsonToken == JsonToken.b) {
                final String e = jsonParser.e();
                if ("email".equals(e) || "phone".equals(e) || "screen_name".equals(e)) {
                    for (JsonToken jsonToken2 = jsonParser.a(); jsonToken2 != null && jsonToken2 != JsonToken.c; jsonToken2 = jsonParser.a()) {
                        if (jsonToken2 == JsonToken.b) {
                            final TwitterUser a2 = a(jsonParser, true, a);
                            if (a2 != null) {
                                list.add(a2);
                            }
                        }
                        else if (jsonToken2 == JsonToken.m) {
                            if ("email".equals(e)) {
                                list2.add(jsonParser.e());
                            }
                        }
                        else if (jsonToken2 == JsonToken.d) {
                            jsonParser.c();
                        }
                    }
                }
                else {
                    jsonParser.c();
                }
            }
        }
        return new Pair((Object)list, (Object)list2);
    }
    
    private static Conversation c(final JsonParser jsonParser, final HashMap hashMap, final HashMap hashMap2, final a a) {
        final ArrayList<bp> list = new ArrayList<bp>();
        JsonToken a2 = jsonParser.a();
        Conversation$Metadata conversation$Metadata = null;
        while (a2 != null && a2 != JsonToken.c) {
            Conversation$Metadata a3 = null;
            switch (bi.a[a2.ordinal()]) {
                default: {
                    a3 = conversation$Metadata;
                    break;
                }
                case 4: {
                    if ("context".equals(jsonParser.e())) {
                        a3 = a(jsonParser, hashMap2, a);
                        break;
                    }
                    jsonParser.c();
                    a3 = conversation$Metadata;
                    break;
                }
                case 1: {
                    if ("ids".equals(jsonParser.e())) {
                        final Iterator iterator = aC(jsonParser).iterator();
                        while (iterator.hasNext()) {
                            final bp a4 = a(iterator.next(), hashMap, hashMap2, a);
                            if (a4 != null) {
                                list.add(a4);
                            }
                        }
                        a3 = conversation$Metadata;
                        break;
                    }
                    jsonParser.c();
                    a3 = conversation$Metadata;
                    break;
                }
            }
            final JsonToken a5 = jsonParser.a();
            conversation$Metadata = a3;
            a2 = a5;
        }
        if (!list.isEmpty()) {
            return new Conversation(conversation$Metadata, list.toArray(new bp[list.size()]));
        }
        return null;
    }
    
    public static LoginVerificationRequest c(final JsonParser jsonParser) {
        String g = "";
        String g2 = "";
        String g3 = "";
        String g4 = "";
        long i = 0L;
        for (JsonToken jsonToken = jsonParser.a(); jsonToken != JsonToken.c; jsonToken = jsonParser.a()) {
            switch (bi.a[jsonToken.ordinal()]) {
                default: {
                    jsonParser.c();
                    break;
                }
                case 2: {
                    if ("id".equals(jsonParser.e())) {
                        g = jsonParser.g();
                        break;
                    }
                    if ("challenge".equals(jsonParser.e())) {
                        g2 = jsonParser.g();
                        break;
                    }
                    if ("geo".equals(jsonParser.e())) {
                        g3 = jsonParser.g();
                        break;
                    }
                    if ("browser".equals(jsonParser.e())) {
                        g4 = jsonParser.g();
                        break;
                    }
                    break;
                }
                case 5: {
                    if ("createdAt".equals(jsonParser.e())) {
                        i = jsonParser.i();
                        break;
                    }
                    break;
                }
            }
        }
        return new LoginVerificationRequest(g, g2, g3, g4, i);
    }
    
    public static com.twitter.library.api.bq c(final JsonParser jsonParser, final boolean b, final a a) {
        return a(jsonParser, null, null, b, true, a);
    }
    
    public static String c(final String s) {
        return a(s, null, null);
    }
    
    private static ArrayList c(final JsonParser jsonParser, final int n, final a a) {
        final ArrayList<be> list = new ArrayList<be>();
        if (jsonParser != null) {
            for (JsonToken jsonToken = jsonParser.d(); jsonToken != null && jsonToken != JsonToken.e; jsonToken = jsonParser.a()) {
                if (jsonToken == JsonToken.b) {
                    list.add(b(jsonParser, n, a));
                }
            }
        }
        return list;
    }
    
    private static ArrayList c(final JsonParser jsonParser, final TwitterUser twitterUser, final a a) {
        final ArrayList<m> list = new ArrayList<m>();
        for (JsonToken jsonToken = jsonParser.a(); jsonToken != null && jsonToken != JsonToken.e; jsonToken = jsonParser.a()) {
            switch (bi.a[jsonToken.ordinal()]) {
                case 4: {
                    for (JsonToken jsonToken2 = jsonParser.a(); jsonToken2 != null && jsonToken2 != JsonToken.c; jsonToken2 = jsonParser.a()) {
                        switch (bi.a[jsonToken2.ordinal()]) {
                            case 4: {
                                final m b = b(jsonParser, twitterUser, a);
                                if (b != null) {
                                    list.add(b);
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
    
    private static void c(final JsonParser jsonParser, final HashMap hashMap, final HashMap hashMap2, final av av, final a a) {
        final ArrayList<bp> list = new ArrayList<bp>();
        String s = null;
        final JsonToken a2 = jsonParser.a();
        int n = 1;
        JsonToken a4;
        for (JsonToken jsonToken = a2; jsonToken != null && jsonToken != JsonToken.c; jsonToken = a4) {
            final String e = jsonParser.e();
            String g;
            if (jsonToken == JsonToken.h && "id".equals(e)) {
                g = jsonParser.g();
            }
            else if (jsonToken == JsonToken.d && "tweets".equals(e)) {
                final Iterator iterator = aC(jsonParser).iterator();
                int n2 = n;
                while (iterator.hasNext()) {
                    final bp a3 = a(iterator.next(), hashMap, hashMap2, a);
                    if (a3 != null) {
                        if (a(a3, a)) {
                            list.add(a3);
                        }
                        else {
                            n2 = 0;
                        }
                    }
                }
                n = n2;
                g = s;
            }
            else {
                jsonParser.c();
                g = s;
            }
            a4 = jsonParser.a();
            s = g;
        }
        if (n != 0 && s != null && !list.isEmpty() && com.twitter.library.api.h.d()) {
            av.a(new com.twitter.library.api.h(s, list));
        }
    }
    
    public static ArrayList d(final JsonParser jsonParser) {
        final ArrayList<LoginVerificationRequest> list = new ArrayList<LoginVerificationRequest>();
        for (JsonToken jsonToken = jsonParser.a(); jsonToken != null && jsonToken != JsonToken.e; jsonToken = jsonParser.a()) {
            list.add(c(jsonParser));
        }
        return list;
    }
    
    public static ArrayList d(final JsonParser jsonParser, final a a) {
        return a(jsonParser, a, null, false, false);
    }
    
    public static ArrayList d(final String s) {
        ArrayList<Pair> list = null;
    Label_0197_Outer:
        while (true) {
            list = new ArrayList<Pair>();
            while (true) {
                String s2 = null;
                int n = 0;
                Label_0409: {
                    try {
                        final JSONObject jsonObject = new JSONObject(s);
                        final Iterator keys = jsonObject.keys();
                        s2 = null;
                        JSONArray jsonArray2 = null;
                        Block_7: {
                            while (keys.hasNext()) {
                                final String s3 = keys.next();
                                if ("errors".equals(s3) || "warnings".equals(s3)) {
                                    final JSONArray jsonArray = (JSONArray)jsonObject.get(s3);
                                    for (int i = 0; i < jsonArray.length(); ++i) {
                                        final JSONObject jsonObject2 = (JSONObject)jsonArray.get(i);
                                        s2 = jsonObject2.getString("eventName");
                                        list.add(new Pair((Object)(s2 + " [" + s3 + "]"), (Object)jsonObject2.toString(2)));
                                    }
                                }
                                else {
                                    if (!"logs".equals(s3)) {
                                        continue Label_0197_Outer;
                                    }
                                    jsonArray2 = (JSONArray)jsonObject.get(s3);
                                    n = 0;
                                    if (n < jsonArray2.length()) {
                                        break Block_7;
                                    }
                                    continue Label_0197_Outer;
                                }
                            }
                            break;
                        }
                        final JSONArray jsonArray3 = (JSONArray)jsonArray2.get(n);
                        if (jsonArray3.length() >= 2) {
                            final JSONObject jsonObject3 = (JSONObject)jsonArray3.get(0);
                            final String s4 = (String)jsonArray3.get(1);
                            if ("client_event".equals(s4)) {
                                s2 = jsonObject3.getString("eventName");
                            }
                            else if ("perftown".equals(s4)) {
                                s2 = jsonObject3.getString("product") + ":" + jsonObject3.getString("description");
                            }
                            else if ("client_watch_error".equals(s4)) {
                                s2 = jsonObject3.getString("error");
                            }
                            list.add(new Pair((Object)(s2 + " [" + s4 + "]"), (Object)jsonObject3.toString(2)));
                        }
                        break Label_0409;
                    }
                    catch (JSONException ex) {}
                    break;
                }
                final String s5 = s2;
                ++n;
                s2 = s5;
                continue;
            }
        }
        return list;
    }
    
    private static void d(final JsonParser jsonParser, final HashMap hashMap, final HashMap hashMap2, final av av, final a a) {
        JsonToken jsonToken = jsonParser.a();
        bp a2 = null;
        TimelineScribeContent d = null;
        boolean b = false;
        String g = null;
        while (jsonToken != null && jsonToken != JsonToken.c) {
            switch (bi.a[jsonToken.ordinal()]) {
                case 2: {
                    final String e = jsonParser.e();
                    if ("id".equals(e)) {
                        a2 = a(jsonParser.g(), hashMap, hashMap2, a);
                        break;
                    }
                    if ("sort_index".equals(e)) {
                        g = jsonParser.g();
                        break;
                    }
                    break;
                }
                case 7: {
                    if ("is_suggestion".equals(jsonParser.e())) {
                        b = true;
                        break;
                    }
                    break;
                }
                case 4: {
                    if ("highlight".equals(jsonParser.e())) {
                        d = D(jsonParser, a);
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
        if (a2 != null) {
            av.a(a2).a(a2.G).a(d);
            if (g != null) {
                av.b(Long.parseLong(g));
            }
            if (b) {
                av.b(2);
            }
        }
    }
    
    private static Pair e(String s) {
        if (s != null) {
            final boolean startsWith = s.startsWith("<a");
            Object substring = null;
            if (startsWith) {
                final int index = s.indexOf(62);
                substring = null;
                if (index != -1) {
                    final int index2 = s.indexOf(60, index);
                    substring = null;
                    if (index2 != -1) {
                        final String substring2 = s.substring(index + 1, index2);
                        final int index3 = s.indexOf("href=\"");
                        if (index3 != -1) {
                            final int n = index3 + 6;
                            final int index4 = s.indexOf(34, n);
                            if (index4 != -1) {
                                substring = s.substring(n, index4);
                                s = substring2;
                            }
                            else {
                                s = substring2;
                                substring = null;
                            }
                        }
                        else {
                            s = substring2;
                            substring = null;
                        }
                    }
                }
            }
            return new Pair((Object)s, substring);
        }
        return new Pair((Object)null, (Object)null);
    }
    
    public static Translation e(final JsonParser jsonParser, final a a) {
        JsonToken jsonToken = jsonParser.a();
        String g = null;
        String g2 = null;
        TweetEntities a2 = null;
        String g3 = null;
        long i = -1L;
        while (jsonToken != null && jsonToken != JsonToken.c) {
            switch (bi.a[jsonToken.ordinal()]) {
                case 2: {
                    final String e = jsonParser.e();
                    if ("text".equals(e)) {
                        g3 = jsonParser.g();
                        break;
                    }
                    if ("lang".equals(e)) {
                        g = jsonParser.g();
                        break;
                    }
                    if ("translated_lang".equals(e)) {
                        g2 = jsonParser.g();
                        break;
                    }
                    break;
                }
                case 5: {
                    if ("id".equals(jsonParser.e())) {
                        i = jsonParser.i();
                        break;
                    }
                    break;
                }
                case 4: {
                    if ("entities".equals(jsonParser.e())) {
                        a2 = a(jsonParser);
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
        if (i == -1L) {
            if (a != null) {
                a.a(new InvalidDataException("Received null status while attempting translation."));
            }
        }
        else {
            if (g2 != null && g != null) {
                return new Translation(i, g2, g, g3, a2);
            }
            if (a != null) {
                a.a(new InvalidDataException("No language info received about status"));
                return null;
            }
        }
        return null;
    }
    
    public static boolean e(final JsonParser jsonParser) {
        for (JsonToken jsonToken = jsonParser.a(); jsonToken != null && jsonToken != JsonToken.c; jsonToken = jsonParser.a()) {
            switch (bi.a[jsonToken.ordinal()]) {
                case 4: {
                    if ("phone".equals(jsonParser.e())) {
                        for (JsonToken jsonToken2 = jsonParser.a(); jsonToken2 != null && jsonToken2 != JsonToken.c; jsonToken2 = jsonParser.a()) {
                            switch (bi.a[jsonToken2.ordinal()]) {
                                case 7: {
                                    if ("verified".equals(jsonParser.e())) {
                                        return true;
                                    }
                                    break;
                                }
                                case 1:
                                case 4: {
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
        }
        return false;
    }
    
    private static int f(final String s) {
        if (s == null) {
            return -1;
        }
        int n = 0;
        Label_0038: {
            switch (s.hashCode()) {
                case 1499234039: {
                    if (s.equals("tweet_forward")) {
                        n = 0;
                        break Label_0038;
                    }
                    break;
                }
                case 851840698: {
                    if (s.equals("follow_module")) {
                        n = 1;
                        break Label_0038;
                    }
                    break;
                }
            }
            n = -1;
        }
        switch (n) {
            default: {
                return -1;
            }
            case 0: {
                return 1;
            }
            case 1: {
                return 2;
            }
        }
    }
    
    public static com.twitter.library.api.aj f(final JsonParser jsonParser) {
        final JsonToken a = jsonParser.a();
        boolean b = false;
        String g = null;
        for (JsonToken a2 = a; a2 != null && a2 != JsonToken.c; a2 = jsonParser.a()) {
            switch (bi.a[a2.ordinal()]) {
                case 2: {
                    if ("phone_number".equals(jsonParser.e())) {
                        g = jsonParser.g();
                        break;
                    }
                    break;
                }
                case 7: {
                    if ("is_verizon".equals(jsonParser.e())) {
                        b = true;
                        break;
                    }
                    break;
                }
                case 1:
                case 4: {
                    jsonParser.c();
                    break;
                }
            }
        }
        return new com.twitter.library.api.aj(g, b);
    }
    
    public static ArrayList f(final JsonParser jsonParser, final a a) {
        final ArrayList<TwitterTopic> list = new ArrayList<TwitterTopic>();
        for (JsonToken jsonToken = jsonParser.a(); jsonToken != null && jsonToken != JsonToken.e; jsonToken = jsonParser.a()) {
            switch (bi.a[jsonToken.ordinal()]) {
                case 4: {
                    final TwitterTopic b = b(jsonParser, null, null, a);
                    if (b != null) {
                        list.add(b);
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
        if (list.isEmpty()) {
            return null;
        }
        return list;
    }
    
    public static Long g(final JsonParser jsonParser) {
        final Long value = 0L;
        final JsonToken a = jsonParser.a();
        Long value2 = value;
        for (JsonToken a2 = a; a2 != null && a2 != JsonToken.c; a2 = jsonParser.a()) {
            switch (bi.a[a2.ordinal()]) {
                case 2: {
                    if ("media_id_string".equals(jsonParser.e())) {
                        value2 = Long.parseLong(jsonParser.g());
                        break;
                    }
                    break;
                }
                case 1:
                case 4: {
                    jsonParser.c();
                    break;
                }
            }
        }
        return value2;
    }
    
    public static ArrayList g(final JsonParser jsonParser, final a a) {
        final ArrayList<TwitterSearchQuery> list = new ArrayList<TwitterSearchQuery>();
        JsonToken jsonToken = jsonParser.d();
        if (jsonToken == JsonToken.d) {
            String g = null;
            String g2 = null;
            while (jsonToken != null && jsonToken != JsonToken.e) {
                if (jsonToken == JsonToken.b) {
                    JsonToken jsonToken2 = jsonParser.a();
                    ArrayList b = null;
                    while (jsonToken2 != null && jsonToken2 != JsonToken.c) {
                        switch (bi.a[jsonToken2.ordinal()]) {
                            case 2: {
                                final String e = jsonParser.e();
                                if ("name".equals(e)) {
                                    g2 = jsonParser.g();
                                    break;
                                }
                                if ("slug".equals(e)) {
                                    g = jsonParser.g();
                                    break;
                                }
                                break;
                            }
                            case 1: {
                                if ("users".equals(jsonParser.e())) {
                                    b = b(jsonParser, a);
                                    break;
                                }
                                jsonParser.c();
                                break;
                            }
                            case 4: {
                                jsonParser.c();
                                break;
                            }
                        }
                        jsonToken2 = jsonParser.a();
                    }
                    if (g2 != null && g != null) {
                        list.add(new TwitterSearchQuery(g2, g, g.hashCode(), b));
                    }
                }
                jsonToken = jsonParser.a();
            }
        }
        return list;
    }
    
    public static Pair h(final JsonParser jsonParser, final a a) {
        Object g = null;
        JsonToken jsonToken = jsonParser.d();
        Object b = null;
        Object b2 = null;
        while (jsonToken != null && jsonToken != JsonToken.c) {
            switch (bi.a[jsonToken.ordinal()]) {
                case 1: {
                    if ("users".equals(g)) {
                        b2 = b(jsonParser, a);
                        break;
                    }
                    while (jsonToken != null && jsonToken != JsonToken.e) {
                        jsonToken = jsonParser.a();
                    }
                    break;
                }
                case 3: {
                    g = jsonParser.g();
                    if ("name".equals(g)) {
                        b = jsonParser.b();
                        break;
                    }
                    break;
                }
            }
            jsonToken = jsonParser.a();
        }
        return new Pair(b, b2);
    }
    
    public static LoginResponse h(final JsonParser jsonParser) {
        int h = 0;
        String g = "";
        String g2 = "";
        String g3 = "";
        long i = 0L;
        JsonToken jsonToken = jsonParser.a();
        String g4 = "";
        String g5 = "";
        int h2 = 0;
        while (jsonToken != JsonToken.c) {
            final String e = jsonParser.e();
            switch (bi.a[jsonToken.ordinal()]) {
                default: {
                    jsonParser.c();
                    break;
                }
                case 2: {
                    if ("oauth_token".equals(e)) {
                        g = jsonParser.g();
                        break;
                    }
                    if ("oauth_token_secret".equals(e)) {
                        g5 = jsonParser.g();
                        break;
                    }
                    if ("login_verification_request_id".equals(e)) {
                        g2 = jsonParser.g();
                        break;
                    }
                    if ("login_verification_request_url".equals(e)) {
                        g3 = jsonParser.g();
                        break;
                    }
                    if ("kdt".equals(e)) {
                        g4 = jsonParser.g();
                        break;
                    }
                    break;
                }
                case 5: {
                    if ("login_verification_user_id".equals(e)) {
                        i = jsonParser.i();
                        break;
                    }
                    if ("login_verification_request_type".equals(e)) {
                        h2 = jsonParser.h();
                        break;
                    }
                    if ("login_verification_request_cause".equals(e)) {
                        h = jsonParser.h();
                        break;
                    }
                    break;
                }
            }
            jsonToken = jsonParser.a();
        }
        if (!TextUtils.isEmpty((CharSequence)g)) {
            return new LoginResponse(1, g, g5, g4);
        }
        return new LoginResponse(2, i, g2, h2, g3, h);
    }
    
    public static PromotedContent i(final JsonParser jsonParser) {
        final PromotedContent promotedContent = (PromotedContent)wx.a(jsonParser, JsonPromotedContent.class);
        if (promotedContent != null) {
            return promotedContent;
        }
        return new PromotedContent();
    }
    
    public static ArrayList i(final JsonParser jsonParser, final a a) {
        final ArrayList<az> list = new ArrayList<az>();
        for (JsonToken jsonToken = jsonParser.d(); jsonToken != null && jsonToken != JsonToken.e; jsonToken = jsonParser.a()) {
            if (jsonToken == JsonToken.b) {
                jsonParser.a();
                final az j = j(jsonParser, a);
                if (j != null) {
                    list.add(j);
                }
            }
        }
        return list;
    }
    
    public static RateLimit j(final JsonParser jsonParser) {
        JsonToken jsonToken = jsonParser.a();
        int h = 0;
        int h2 = 0;
        long i = 0L;
        while (jsonToken != null && jsonToken != JsonToken.c) {
            switch (bi.a[jsonToken.ordinal()]) {
                case 5: {
                    final String e = jsonParser.e();
                    if ("remaining_hits".equals(e)) {
                        h2 = jsonParser.h();
                        break;
                    }
                    if ("hourly_limit".equals(e)) {
                        h = jsonParser.h();
                        break;
                    }
                    if ("reset_time_in_seconds".equals(e)) {
                        i = jsonParser.i();
                        break;
                    }
                    break;
                }
                case 4: {
                    jsonParser.c();
                    break;
                }
            }
            jsonToken = jsonParser.a();
        }
        return new RateLimit(h2, h, i * 1000L);
    }
    
    public static az j(final JsonParser jsonParser, final a a) {
        int a2 = 0;
        long a3 = 0L;
        long long1 = 0L;
        long long2 = 0L;
        int h = 0;
        int b = 0;
        ArrayList b2 = null;
        int h2 = 0;
        int c = 0;
        ArrayList b3 = null;
        ArrayList d = null;
        ArrayList c2 = null;
        int h3 = 0;
        int d2 = 0;
        ArrayList d3 = null;
        ArrayList c3 = null;
        long i = -1L;
        for (JsonToken jsonToken = jsonParser.d(); jsonToken != null && jsonToken != JsonToken.c; jsonToken = jsonParser.a()) {
            switch (bi.a[jsonToken.ordinal()]) {
                case 2: {
                    final String e = jsonParser.e();
                    if ("action".equals(e) || "event".equals(e)) {
                        final bj bj = bh.b.get(jsonParser.g());
                        if (bj != null) {
                            a2 = bj.a;
                            b = bj.b;
                            c = bj.c;
                            d2 = bj.d;
                            break;
                        }
                        break;
                    }
                    else {
                        if ("created_at".equals(e)) {
                            a3 = bk.a(com.twitter.util.platform.k.f().a().b(), jsonParser.g());
                            break;
                        }
                        if ("max_position".equals(e)) {
                            long1 = Long.parseLong(jsonParser.g());
                            break;
                        }
                        if ("min_position".equals(e)) {
                            long2 = Long.parseLong(jsonParser.g());
                            break;
                        }
                        break;
                    }
                    break;
                }
                case 1: {
                    final String e2 = jsonParser.e();
                    if ("sources".equals(e2)) {
                        if (b != 0) {
                            b2 = b(jsonParser, a);
                            break;
                        }
                        jsonParser.c();
                        break;
                    }
                    else if ("targets".equals(e2)) {
                        switch (c) {
                            default: {
                                jsonParser.c();
                                continue;
                            }
                            case 1: {
                                b3 = b(jsonParser, a);
                                continue;
                            }
                            case 2: {
                                d = d(jsonParser, a);
                                continue;
                            }
                            case 3: {
                                c2 = c(jsonParser, 0, a);
                                continue;
                            }
                        }
                    }
                    else {
                        if (!"target_objects".equals(e2)) {
                            jsonParser.c();
                            break;
                        }
                        switch (d2) {
                            default: {
                                jsonParser.c();
                                continue;
                            }
                            case 2: {
                                d3 = d(jsonParser, a);
                                continue;
                            }
                            case 3: {
                                c3 = c(jsonParser, 0, a);
                                continue;
                            }
                        }
                    }
                    break;
                }
                case 5: {
                    final String e3 = jsonParser.e();
                    if ("sources_size".equals(e3)) {
                        h = jsonParser.h();
                        break;
                    }
                    if ("targets_size".equals(e3)) {
                        h2 = jsonParser.h();
                        break;
                    }
                    if ("target_objects_size".equals(e3)) {
                        h3 = jsonParser.h();
                        break;
                    }
                    if ("magic_rec_id".equals(e3)) {
                        i = jsonParser.i();
                        break;
                    }
                    break;
                }
                case 4: {
                    jsonParser.c();
                    break;
                }
            }
        }
        if (b2 == null || (c == 1 && b3 == null) || (c == 2 && d == null) || (c == 3 && c2 == null) || (d2 == 2 && d3 == null) || (d2 == 3 && c3 == null)) {
            return null;
        }
        if (b2.size() != h) {
            final a a4 = new a();
            a4.a("size of sources array: ", b2.size());
            a4.a("sources_size: ", h);
            a4.a("eventType: ", a2);
            a4.a(new InvalidDataException("TLNA-1110: Size of sources array is not equal to sources_size."));
            ErrorReporter.a(a4);
        }
        return new az(a2, a3, long1, long2, h, b, b2, h2, c, b3, d, c2, h3, d2, d3, c3, i);
    }
    
    public static TwitterSearchSummary k(final JsonParser jsonParser, final a a) {
        JsonToken jsonToken = jsonParser.a();
        String aq = null;
        String aq2 = null;
        int n = -1;
        ArrayList list = null;
        while (jsonToken != null && jsonToken != JsonToken.c) {
            switch (bi.a[jsonToken.ordinal()]) {
                case 2: {
                    if ("summary_type".equals(jsonParser.e())) {
                        n = TwitterSearchSummary.a(jsonParser.g());
                        break;
                    }
                    break;
                }
                case 4: {
                    final String e = jsonParser.e();
                    if ("summary_query".equals(e)) {
                        aq2 = aq(jsonParser);
                        break;
                    }
                    if ("title".equals(e)) {
                        aq = aq(jsonParser);
                        break;
                    }
                    if ("tweets".equals(jsonParser.e())) {
                        list = new ArrayList();
                        n = a(jsonParser, list, a);
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
        if (n == -1) {
            return null;
        }
        if ((n == 0 || n == 1) && (aq == null || aq2 == null)) {
            return null;
        }
        return new TwitterSearchSummary(n, aq2, aq, list);
    }
    
    public static ArrayList k(final JsonParser jsonParser) {
        final ArrayList<String> list = new ArrayList<String>();
        for (JsonToken jsonToken = jsonParser.d(); jsonToken != null && jsonToken != JsonToken.e; jsonToken = jsonParser.a()) {
            if (jsonToken == JsonToken.h) {
                list.add(jsonParser.g());
            }
        }
        return list;
    }
    
    public static ClientConfiguration l(final JsonParser jsonParser) {
        ay ax = null;
        JsonToken jsonToken = jsonParser.a();
        UrlConfiguration aj = null;
        while (jsonToken != null && jsonToken != JsonToken.c) {
            switch (bi.a[jsonToken.ordinal()]) {
                case 4: {
                    final String e = jsonParser.e();
                    if ("access".equals(e)) {
                        ax = ax(jsonParser);
                        break;
                    }
                    if ("twitter".equals(e)) {
                        aj = aj(jsonParser);
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
        return new ClientConfiguration(aj, ax);
    }
    
    public static ArrayList l(final JsonParser jsonParser, final a a) {
        final ArrayList<TwitterUser> list = new ArrayList<TwitterUser>();
        for (JsonToken jsonToken = jsonParser.a(); jsonToken != null && jsonToken != JsonToken.e; jsonToken = jsonParser.a()) {
            switch (bi.a[jsonToken.ordinal()]) {
                case 4: {
                    final JsonToken a2 = jsonParser.a();
                    TwitterUser a3 = null;
                    JsonToken a4 = a2;
                    TwitterUserMetadata z = null;
                    while (a4 != null && a4 != JsonToken.c) {
                        switch (bi.a[a4.ordinal()]) {
                            case 4: {
                                final String e = jsonParser.e();
                                if ("data".equals(e)) {
                                    a3 = a(jsonParser, true, a);
                                    break;
                                }
                                if ("metadata".equals(e)) {
                                    z = z(jsonParser);
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
                        a4 = jsonParser.a();
                    }
                    if (a3 != null) {
                        if (z != null) {
                            a3.metadata = z;
                            if (z.a != null) {
                                a3.friendship = com.twitter.library.api.z.a(a3.friendship, z.a.friendship);
                            }
                        }
                        list.add(a3);
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
        return list;
    }
    
    public static ag m(final JsonParser jsonParser) {
        if (jsonParser != null) {
            for (JsonToken jsonToken = jsonParser.d(); jsonToken != null && jsonToken != JsonToken.e; jsonToken = jsonParser.a()) {
                if (jsonToken == JsonToken.b) {
                    return ag.a(jsonParser);
                }
            }
        }
        return null;
    }
    
    public static ArrayList m(final JsonParser jsonParser, final a a) {
        final JsonToken a2 = jsonParser.a();
        ArrayList d = null;
        for (JsonToken a3 = a2; a3 != null && a3 != JsonToken.c; a3 = jsonParser.a()) {
            switch (bi.a[a3.ordinal()]) {
                case 1: {
                    if ("statuses".equals(jsonParser.e())) {
                        d = d(jsonParser, a);
                        break;
                    }
                    jsonParser.c();
                    break;
                }
                case 4: {
                    jsonParser.c();
                    break;
                }
            }
        }
        if (d == null) {
            throw new InvalidDataException("Search did not return results module");
        }
        return d;
    }
    
    public static j n(final JsonParser jsonParser, final a a) {
        String g = null;
        final ArrayList<b> list = new ArrayList<b>();
        JsonToken jsonToken = jsonParser.a();
        String g2 = null;
        while (jsonToken != null && jsonToken != JsonToken.c) {
            switch (bi.a[jsonToken.ordinal()]) {
                case 1: {
                    if ("modules".equals(jsonParser.e())) {
                        for (JsonToken jsonToken2 = jsonParser.a(); jsonToken2 != null && jsonToken2 != JsonToken.e; jsonToken2 = jsonParser.a()) {
                            switch (bi.a[jsonToken2.ordinal()]) {
                                case 4: {
                                    final b c = C(jsonParser, a);
                                    if (c != null) {
                                        list.add(c);
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
                    jsonParser.c();
                    break;
                }
                case 4: {
                    if ("metadata".equals(jsonParser.e())) {
                        for (JsonToken jsonToken3 = jsonParser.a(); jsonToken3 != null && jsonToken3 != JsonToken.c; jsonToken3 = jsonParser.a()) {
                            switch (bi.a[jsonToken3.ordinal()]) {
                                case 1:
                                case 4: {
                                    jsonParser.c();
                                    break;
                                }
                                case 2: {
                                    final String e = jsonParser.e();
                                    if ("prev_cursor".equals(e)) {
                                        g = jsonParser.g();
                                        break;
                                    }
                                    if ("next_cursor".equals(e)) {
                                        g2 = jsonParser.g();
                                        break;
                                    }
                                    break;
                                }
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
        return new j(list, g, g2);
    }
    
    public static ArrayList n(final JsonParser jsonParser) {
        final ArrayList<TwitterUser> list = new ArrayList<TwitterUser>();
        if (jsonParser.d() == JsonToken.d) {
            for (JsonToken jsonToken = jsonParser.a(); jsonToken != null && jsonToken != JsonToken.e; jsonToken = jsonParser.a()) {
                switch (bi.a[jsonToken.ordinal()]) {
                    case 1: {
                        jsonParser.c();
                        break;
                    }
                    case 4: {
                        list.add(al(jsonParser));
                        break;
                    }
                }
            }
        }
        return list;
    }
    
    public static int o(final JsonParser jsonParser) {
        final JsonToken a = jsonParser.a();
        Object o = null;
        int am = 0;
        for (JsonToken a2 = a; a2 != null && a2 != JsonToken.c; a2 = jsonParser.a()) {
            switch (bi.a[a2.ordinal()]) {
                case 4: {
                    if ("relationship".equals(o)) {
                        for (JsonToken jsonToken = jsonParser.a(); jsonToken != null && jsonToken != JsonToken.c; jsonToken = jsonParser.a()) {
                            switch (bi.a[jsonToken.ordinal()]) {
                                case 4: {
                                    if ("source".equals(o)) {
                                        am = am(jsonParser);
                                        break;
                                    }
                                    jsonParser.c();
                                    break;
                                }
                                case 3: {
                                    o = jsonParser.g();
                                    break;
                                }
                            }
                        }
                        break;
                    }
                    jsonParser.c();
                    break;
                }
                case 3: {
                    o = jsonParser.g();
                    break;
                }
            }
        }
        return am;
    }
    
    public static ArrayList o(final JsonParser jsonParser, final a a) {
        final ArrayList<bp> list = new ArrayList<bp>();
        for (JsonToken jsonToken = jsonParser.a(); jsonToken != null && jsonToken != JsonToken.c; jsonToken = jsonParser.a()) {
            switch (bi.a[jsonToken.ordinal()]) {
                case 1: {
                    if ("media_items".equals(jsonParser.e())) {
                        for (JsonToken jsonToken2 = jsonParser.a(); jsonToken2 != null && jsonToken2 != JsonToken.e; jsonToken2 = jsonParser.a()) {
                            if (jsonToken2 == JsonToken.b) {
                                JsonToken jsonToken3 = jsonParser.a();
                            Label_0162_Outer:
                                while (jsonToken3 != null && jsonToken3 != JsonToken.c) {
                                    while (true) {
                                        Label_0218: {
                                            if (jsonToken3 == JsonToken.b) {
                                                if (!"status".equals(jsonParser.e())) {
                                                    break Label_0218;
                                                }
                                            }
                                            else {
                                                if (jsonToken3 == JsonToken.e) {
                                                    jsonParser.c();
                                                    break Label_0162;
                                                }
                                                break Label_0162;
                                            }
                                            try {
                                                list.add(b(jsonParser, true, a));
                                                jsonToken3 = jsonParser.a();
                                                continue Label_0162_Outer;
                                            }
                                            catch (NullUserException ex) {
                                                if (a != null) {
                                                    a.a(new InvalidDataException(String.format("Received null user for status = %d", ex.statusId)));
                                                }
                                                continue;
                                            }
                                        }
                                        jsonParser.c();
                                        continue;
                                    }
                                }
                            }
                            else if (jsonToken2 == JsonToken.d) {
                                jsonParser.c();
                            }
                        }
                        break;
                    }
                    jsonParser.c();
                    break;
                }
                case 4: {
                    jsonParser.c();
                    break;
                }
            }
        }
        return list;
    }
    
    public static TwitterUser p(final JsonParser jsonParser, final a a) {
        JsonToken d = jsonParser.d();
        String s = null;
        ArrayList<TwitterUser> list = null;
        TwitterUser twitterUser = null;
        while (d != null && d != JsonToken.c) {
            ArrayList<TwitterUser> list2 = null;
            TwitterUser twitterUser2 = null;
            String g = null;
            Label_0075: {
                switch (bi.a[d.ordinal()]) {
                    case 4: {
                        if ("user".equals(jsonParser.e())) {
                            final TwitterUser a2 = a(jsonParser, true, a);
                            final String s2 = s;
                            list2 = list;
                            twitterUser2 = a2;
                            g = s2;
                            break Label_0075;
                        }
                        jsonParser.c();
                        g = s;
                        list2 = list;
                        twitterUser2 = twitterUser;
                        break Label_0075;
                    }
                    case 1: {
                        if ("connections".equals(jsonParser.e())) {
                            final ArrayList b = b(jsonParser, a);
                            twitterUser2 = twitterUser;
                            g = s;
                            list2 = (ArrayList<TwitterUser>)b;
                            break Label_0075;
                        }
                        jsonParser.c();
                        g = s;
                        list2 = list;
                        twitterUser2 = twitterUser;
                        break Label_0075;
                    }
                    case 2: {
                        if ("token".equals(jsonParser.e())) {
                            g = jsonParser.g();
                            list2 = list;
                            twitterUser2 = twitterUser;
                            break Label_0075;
                        }
                        break;
                    }
                }
                g = s;
                list2 = list;
                twitterUser2 = twitterUser;
            }
            final JsonToken a3 = jsonParser.a();
            twitterUser = twitterUser2;
            list = list2;
            s = g;
            d = a3;
        }
        if (twitterUser != null) {
            if (list != null && !list.isEmpty()) {
                twitterUser.metadata = new TwitterUserMetadata((TwitterSocialProof)new bo().a(1).a(list.get(0).name).d(-1 + list.size()).f(), null, s, false);
            }
            else if (s != null) {
                twitterUser.metadata = new TwitterUserMetadata(null, null, s, false);
                return twitterUser;
            }
        }
        return twitterUser;
    }
    
    public static boolean p(final JsonParser jsonParser) {
        for (JsonToken jsonToken = jsonParser.a(); jsonToken != null && jsonToken != JsonToken.c; jsonToken = jsonParser.a()) {
            switch (bi.a[jsonToken.ordinal()]) {
                case 6:
                case 7: {
                    if ("saved".equals(jsonParser.e())) {
                        return jsonParser.l();
                    }
                    break;
                }
            }
        }
        return false;
    }
    
    public static String q(final JsonParser jsonParser) {
        for (JsonToken jsonToken = jsonParser.a(); jsonToken != null && jsonToken != JsonToken.c; jsonToken = jsonParser.a()) {
            switch (bi.a[jsonToken.ordinal()]) {
                case 2: {
                    if ("status".equals(jsonParser.e())) {
                        return jsonParser.g();
                    }
                    break;
                }
            }
        }
        return null;
    }
    
    public static ArrayList q(final JsonParser jsonParser, final a a) {
        final ArrayList<TwitterUser> list = new ArrayList<TwitterUser>();
        for (JsonToken jsonToken = jsonParser.d(); jsonToken != null && jsonToken != JsonToken.e; jsonToken = jsonParser.a()) {
            if (jsonToken == JsonToken.b) {
                jsonParser.a();
                final TwitterUser p2 = p(jsonParser, a);
                if (p2 != null) {
                    list.add(p2);
                }
            }
        }
        return list;
    }
    
    public static Pair r(final JsonParser jsonParser, final a a) {
        Object g = null;
        JsonToken jsonToken = jsonParser.a();
        Object g2 = null;
        while (jsonToken != null && jsonToken != JsonToken.c) {
            switch (bi.a[jsonToken.ordinal()]) {
                case 2: {
                    final String e = jsonParser.e();
                    if ("min_position".equals(e)) {
                        g = jsonParser.g();
                        break;
                    }
                    if ("max_position".equals(e)) {
                        g2 = jsonParser.g();
                        break;
                    }
                    break;
                }
                case 1:
                case 4: {
                    jsonParser.c();
                    break;
                }
            }
            jsonToken = jsonParser.a();
        }
        return new Pair(g, g2);
    }
    
    public static String r(final JsonParser jsonParser) {
        JsonToken jsonToken = jsonParser.a();
        Object o = null;
        while (jsonToken != null && jsonToken != JsonToken.c) {
            switch (bi.a[jsonToken.ordinal()]) {
                case 3: {
                    o = jsonParser.e();
                    break;
                }
                case 4: {
                    if ("promotion_destination_url".equals(o)) {
                        for (JsonToken jsonToken2 = jsonParser.a(); jsonToken2 != null && jsonToken2 != JsonToken.c; jsonToken2 = jsonParser.a()) {
                            o = jsonParser.e();
                            switch (bi.a[jsonToken2.ordinal()]) {
                                case 2: {
                                    if ("string_value".equals(o)) {
                                        return jsonParser.g();
                                    }
                                    break;
                                }
                                case 1:
                                case 4: {
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
        return null;
    }
    
    public static ba s(final JsonParser jsonParser, final a a) {
        final ArrayList<TwitterTopic> list = new ArrayList<TwitterTopic>();
        HashMap hashMap = new HashMap();
        final JsonToken a2 = jsonParser.a();
        HashMap<Object, TwitterTopic> hashMap2 = null;
        JsonToken a3 = a2;
        String s = null;
        while (a3 != null && a3 != JsonToken.c) {
            if (a3 == JsonToken.b) {
                final String e = jsonParser.e();
                HashMap<Object, TwitterTopic> ab;
                HashMap n;
                if ("objects".equals(e)) {
                    final JsonToken a4 = jsonParser.a();
                    ab = hashMap2;
                    n = hashMap;
                    for (JsonToken a5 = a4; a5 != null && a5 != JsonToken.c; a5 = jsonParser.a()) {
                        if (a5 == JsonToken.b) {
                            final String e2 = jsonParser.e();
                            if ("users".equals(e2)) {
                                n = N(jsonParser);
                            }
                            else if ("timelines".equals(e2)) {
                                ab = (HashMap<Object, TwitterTopic>)aB(jsonParser);
                            }
                            else {
                                jsonParser.c();
                            }
                        }
                        else if (a5 == JsonToken.d) {
                            jsonParser.c();
                        }
                    }
                }
                else if ("response".equals(e)) {
                    final JsonToken a6 = jsonParser.a();
                    String s2 = s;
                    for (JsonToken a7 = a6; a7 != null && a7 != JsonToken.c; a7 = jsonParser.a()) {
                        if (a7 == JsonToken.b) {
                            String g;
                            if ("cursors".equals(jsonParser.e())) {
                                final JsonToken a8 = jsonParser.a();
                                g = s2;
                                for (JsonToken a9 = a8; a9 != null && a9 != JsonToken.c; a9 = jsonParser.a()) {
                                    switch (bi.a[a9.ordinal()]) {
                                        case 2: {
                                            if ("next_cursor".equals(jsonParser.e())) {
                                                g = jsonParser.g();
                                                break;
                                            }
                                            break;
                                        }
                                        case 1:
                                        case 4: {
                                            jsonParser.c();
                                            break;
                                        }
                                    }
                                }
                            }
                            else {
                                jsonParser.c();
                                g = s2;
                            }
                            s2 = g;
                        }
                        else if (a7 == JsonToken.d) {
                            if ("results".equals(jsonParser.e())) {
                                for (JsonToken jsonToken = jsonParser.a(); jsonToken != null && jsonToken != JsonToken.e; jsonToken = jsonParser.a()) {
                                    switch (bi.a[jsonToken.ordinal()]) {
                                        case 4: {
                                            for (JsonToken jsonToken2 = jsonParser.a(); jsonToken2 != null && jsonToken2 != JsonToken.c; jsonToken2 = jsonParser.a()) {
                                                switch (bi.a[jsonToken2.ordinal()]) {
                                                    case 2: {
                                                        if (!"timeline_id".equals(jsonParser.e())) {
                                                            break;
                                                        }
                                                        final TwitterTopic twitterTopic = hashMap2.get(jsonParser.g());
                                                        if (twitterTopic != null) {
                                                            list.add(twitterTopic);
                                                            break;
                                                        }
                                                        break;
                                                    }
                                                    case 1:
                                                    case 4: {
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
                            }
                            else {
                                jsonParser.c();
                            }
                        }
                    }
                    s = s2;
                    ab = hashMap2;
                    n = hashMap;
                }
                else {
                    jsonParser.c();
                    ab = hashMap2;
                    n = hashMap;
                }
                hashMap = n;
                hashMap2 = ab;
            }
            else if (a3 == JsonToken.d) {
                jsonParser.c();
            }
            a3 = jsonParser.a();
        }
        return new ba(list, hashMap.values(), s);
    }
    
    public static com.twitter.library.api.geo.e s(final JsonParser jsonParser) {
        Object g = null;
        final ArrayList<Object> list = new ArrayList<Object>();
        final ArrayList<PlaceAttribution> list2 = new ArrayList<PlaceAttribution>();
        JsonToken jsonToken = jsonParser.a();
        String g2 = null;
        String g3 = null;
        while (jsonToken != null && jsonToken != JsonToken.c) {
            switch (bi.a[jsonToken.ordinal()]) {
                case 1: {
                    if ("places".equals(g)) {
                        while (jsonToken != null && jsonToken != JsonToken.e) {
                            jsonToken = jsonParser.a();
                            if (jsonToken == JsonToken.b) {
                                jsonToken = jsonParser.a();
                                if (jsonToken != JsonToken.f || !"place".equals(jsonParser.g())) {
                                    continue;
                                }
                                jsonToken = jsonParser.a();
                                list.add(wx.a(jsonParser, JsonTwitterPlace.class));
                            }
                        }
                        break;
                    }
                    if ("attributions".equals(g)) {
                        while (jsonToken != null && jsonToken != JsonToken.e) {
                            jsonToken = jsonParser.a();
                            if (jsonToken == JsonToken.b) {
                                jsonToken = jsonParser.a();
                                if (jsonToken != JsonToken.f) {
                                    continue;
                                }
                                final PlaceAttribution a = PlaceAttribution.a(jsonParser.g());
                                if (a == null) {
                                    continue;
                                }
                                list2.add(a);
                            }
                        }
                        break;
                    }
                    jsonParser.c();
                    break;
                }
                case 3: {
                    g = jsonParser.g();
                    break;
                }
                case 2: {
                    if ("autotag_place_id".equals(g)) {
                        g3 = jsonParser.g();
                    }
                    if ("geo_search_request_id".equals(g)) {
                        g2 = jsonParser.g();
                        break;
                    }
                    break;
                }
            }
            jsonToken = jsonParser.a();
        }
        return new com.twitter.library.api.geo.e(g3, list, g2, list2);
    }
    
    public static TwitterTopic t(final JsonParser jsonParser, final a a) {
        HashMap<Object, TwitterTopic> hashMap = null;
        JsonToken jsonToken = jsonParser.a();
        TwitterTopic twitterTopic = null;
        while (jsonToken != null && jsonToken != JsonToken.c) {
            if (jsonToken == JsonToken.b) {
                final String e = jsonParser.e();
                HashMap<Object, TwitterTopic> ab;
                TwitterTopic twitterTopic2;
                if ("objects".equals(e)) {
                    final JsonToken a2 = jsonParser.a();
                    ab = hashMap;
                    for (JsonToken a3 = a2; a3 != null && a3 != JsonToken.c; a3 = jsonParser.a()) {
                        if (a3 == JsonToken.b) {
                            if ("timelines".equals(jsonParser.e())) {
                                ab = (HashMap<Object, TwitterTopic>)aB(jsonParser);
                            }
                            else {
                                jsonParser.c();
                            }
                        }
                        else if (a3 == JsonToken.d) {
                            jsonParser.c();
                        }
                    }
                    twitterTopic2 = twitterTopic;
                }
                else if ("response".equals(e)) {
                    final JsonToken a4 = jsonParser.a();
                    TwitterTopic twitterTopic3 = twitterTopic;
                    for (JsonToken a5 = a4; a5 != null && a5 != JsonToken.c; a5 = jsonParser.a()) {
                        switch (bi.a[a5.ordinal()]) {
                            case 2: {
                                if ("timeline_id".equals(jsonParser.e())) {
                                    twitterTopic3 = hashMap.get(jsonParser.g());
                                    break;
                                }
                                break;
                            }
                            case 1:
                            case 4: {
                                jsonParser.c();
                                break;
                            }
                        }
                    }
                    final HashMap<Object, TwitterTopic> hashMap2 = hashMap;
                    twitterTopic2 = twitterTopic3;
                    ab = hashMap2;
                }
                else {
                    jsonParser.c();
                    ab = hashMap;
                    twitterTopic2 = twitterTopic;
                }
                twitterTopic = twitterTopic2;
                hashMap = ab;
            }
            else if (jsonToken == JsonToken.d) {
                jsonParser.c();
            }
            jsonToken = jsonParser.a();
        }
        return twitterTopic;
    }
    
    public static ArrayList t(final JsonParser jsonParser) {
        final ArrayList<TwitterSearchQuery> list = new ArrayList<TwitterSearchQuery>();
        if (jsonParser != null) {
            JsonToken jsonToken = jsonParser.d();
            if (jsonToken == JsonToken.d) {
                while (jsonToken != null && jsonToken != JsonToken.e) {
                    if (jsonToken == JsonToken.b) {
                        list.add(u(jsonParser));
                    }
                    jsonToken = jsonParser.a();
                }
            }
        }
        return list;
    }
    
    public static long u(final JsonParser jsonParser, final a a) {
        JsonToken jsonToken = jsonParser.a();
        long i = -1L;
        while (jsonToken != null && jsonToken != JsonToken.c) {
            switch (bi.a[jsonToken.ordinal()]) {
                case 1:
                case 4: {
                    jsonParser.c();
                    break;
                }
                case 5: {
                    i = jsonParser.i();
                    break;
                }
            }
            jsonToken = jsonParser.a();
        }
        if (i < 0L && a != null) {
            a.a(new InvalidDataException("Could not parse timestamp"));
        }
        return i;
    }
    
    public static TwitterSearchQuery u(final JsonParser jsonParser) {
        long a = 0L;
        JsonToken jsonToken = jsonParser.a();
        String g = null;
        String g2 = null;
        long i = a;
        while (jsonToken != null && jsonToken != JsonToken.c) {
            final String e = jsonParser.e();
            switch (bi.a[jsonToken.ordinal()]) {
                case 5: {
                    if ("id".equals(e)) {
                        i = jsonParser.i();
                        break;
                    }
                    break;
                }
                case 2: {
                    if ("name".equals(e)) {
                        g2 = jsonParser.g();
                        break;
                    }
                    if ("query".equals(e)) {
                        g = jsonParser.g();
                        break;
                    }
                    if ("created_at".equals(e)) {
                        a = bk.a(com.twitter.util.platform.k.f().a().b(), jsonParser.g());
                        break;
                    }
                    break;
                }
                case 1:
                case 4: {
                    jsonParser.c();
                    break;
                }
            }
            jsonToken = jsonParser.a();
        }
        return new TwitterSearchQuery(g2, g, a, i, null, CollectionUtils.a());
    }
    
    public static CardInstanceData v(final JsonParser jsonParser, final a a) {
        final JsonToken a2 = jsonParser.a();
        CardInstanceData a3 = null;
        for (JsonToken a4 = a2; a4 != null && a4 != JsonToken.c; a4 = jsonParser.a()) {
            final String e = jsonParser.e();
            switch (bi.a[a4.ordinal()]) {
                default: {
                    jsonParser.c();
                    break;
                }
                case 4: {
                    if (!"card".equals(e)) {
                        break;
                    }
                    final c c = new c();
                    if (c.a(jsonParser, a)) {
                        a3 = c.a();
                        break;
                    }
                    break;
                }
            }
        }
        return a3;
    }
    
    public static ArrayList v(final JsonParser jsonParser) {
        String g = null;
        final ArrayList<CategoryListItem> list = new ArrayList<CategoryListItem>();
        final JsonToken d = jsonParser.d();
        if (d == JsonToken.d) {
            JsonToken a = d;
            String g2 = null;
            while (a != null && a != JsonToken.e) {
                if (a == JsonToken.b) {
                    for (JsonToken jsonToken = jsonParser.a(); jsonToken != null && jsonToken != JsonToken.c; jsonToken = jsonParser.a()) {
                        switch (bi.a[jsonToken.ordinal()]) {
                            case 2: {
                                final String e = jsonParser.e();
                                if ("name".equals(e)) {
                                    g = jsonParser.g();
                                    break;
                                }
                                if ("slug".equals(e)) {
                                    g2 = jsonParser.g();
                                    break;
                                }
                                break;
                            }
                            case 1:
                            case 4: {
                                jsonParser.c();
                                break;
                            }
                        }
                    }
                    if (g != null && g2 != null) {
                        list.add(new CategoryListItem(g, g2));
                    }
                }
                a = jsonParser.a();
            }
        }
        return list;
    }
    
    public static ArrayList w(final JsonParser jsonParser) {
        final ArrayList<Long> list = new ArrayList<Long>();
        if (jsonParser != null) {
            final JsonToken a = jsonParser.a();
            Object g = null;
            for (JsonToken a2 = a; a2 != null && a2 != JsonToken.e; a2 = jsonParser.a()) {
                switch (bi.a[a2.ordinal()]) {
                    case 4: {
                        for (JsonToken jsonToken = jsonParser.a(); jsonToken != null && jsonToken != JsonToken.c; jsonToken = jsonParser.a()) {
                            switch (bi.a[jsonToken.ordinal()]) {
                                case 5: {
                                    if ("id".equals(g)) {
                                        list.add(jsonParser.i());
                                        break;
                                    }
                                    break;
                                }
                                case 3: {
                                    g = jsonParser.g();
                                    break;
                                }
                                case 1:
                                case 4: {
                                    jsonParser.c();
                                    break;
                                }
                            }
                        }
                        break;
                    }
                }
            }
        }
        return list;
    }
    
    public static ArrayList w(final JsonParser jsonParser, final a a) {
        final ArrayList<wk> list = new ArrayList<wk>();
        for (JsonToken jsonToken = jsonParser.a(); jsonToken != null && jsonToken != JsonToken.c; jsonToken = jsonParser.a()) {
            switch (bi.a[jsonToken.ordinal()]) {
                default: {
                    jsonParser.c();
                    break;
                }
                case 1: {
                    if ("news_events".equals(jsonParser.e())) {
                        for (JsonToken jsonToken2 = jsonParser.a(); jsonToken2 != null && jsonToken2 != JsonToken.e; jsonToken2 = jsonParser.a()) {
                            switch (bi.a[jsonToken2.ordinal()]) {
                                default: {
                                    jsonParser.c();
                                    break;
                                }
                                case 4: {
                                    list.add(E(jsonParser, a));
                                    break;
                                }
                            }
                        }
                        break;
                    }
                    jsonParser.c();
                    break;
                }
            }
        }
        return list;
    }
    
    public static String x(final JsonParser jsonParser) {
        final JsonToken a = jsonParser.a();
        String g = null;
        for (JsonToken a2 = a; a2 != null && a2 != JsonToken.c; a2 = jsonParser.a()) {
            switch (bi.a[a2.ordinal()]) {
                case 2: {
                    if (jsonParser.e().equals("error")) {
                        g = jsonParser.g();
                        break;
                    }
                    break;
                }
                case 1:
                case 4: {
                    jsonParser.c();
                    break;
                }
            }
        }
        return g;
    }
    
    public static wk x(final JsonParser jsonParser, final a a) {
        JsonToken jsonToken = jsonParser.a();
        wk e = null;
        List d = null;
        while (jsonToken != null && jsonToken != JsonToken.c) {
            switch (bi.a[jsonToken.ordinal()]) {
                default: {
                    jsonParser.c();
                    break;
                }
                case 4: {
                    if ("news_event".equals(jsonParser.e())) {
                        e = E(jsonParser, a);
                        break;
                    }
                    jsonParser.c();
                    break;
                }
                case 1: {
                    if ("tweets".equals(jsonParser.e())) {
                        d = d(jsonParser, a);
                        break;
                    }
                    jsonParser.c();
                    break;
                }
            }
            jsonToken = jsonParser.a();
        }
        if (e != null) {
            e.g = d;
            return e;
        }
        return null;
    }
    
    public static Prompt y(final JsonParser jsonParser) {
        for (JsonToken jsonToken = jsonParser.a(); jsonToken != null && jsonToken != JsonToken.c; jsonToken = jsonParser.a()) {
            if (jsonToken == JsonToken.b) {
                if ("prompt".equals(jsonParser.e())) {
                    return ao(jsonParser);
                }
                jsonParser.c();
            }
            else if (jsonToken == JsonToken.d) {
                jsonParser.c();
            }
        }
        return null;
    }
    
    private static TwitterTopic$SportsEvent$Player y(final JsonParser jsonParser, final a a) {
        String r = null;
        long o = -1L;
        JsonToken jsonToken = jsonParser.a();
        String r2 = null;
        String r3 = null;
        String r4 = null;
        String r5 = null;
        String r6 = null;
        while (jsonToken != null && jsonToken != JsonToken.c) {
            switch (bi.a[jsonToken.ordinal()]) {
                default: {
                    jsonParser.c();
                    break;
                }
                case 2: {
                    final String e = jsonParser.e();
                    if ("location".equals(e)) {
                        r6 = jsonParser.r();
                        break;
                    }
                    if ("name".equals(e)) {
                        r5 = jsonParser.r();
                        break;
                    }
                    if ("score".equals(e)) {
                        r4 = jsonParser.r();
                        break;
                    }
                    if ("logo_url".equals(e)) {
                        r3 = jsonParser.r();
                        break;
                    }
                    if ("abbreviation".equals(e)) {
                        r2 = jsonParser.r();
                        break;
                    }
                    if ("player_type".equals(e)) {
                        r = jsonParser.r();
                        break;
                    }
                    break;
                }
                case 5: {
                    if ("user_id".equals(jsonParser.e())) {
                        o = jsonParser.o();
                        break;
                    }
                    break;
                }
            }
            jsonToken = jsonParser.a();
        }
        return new TwitterTopic$SportsEvent$Player(r6, r5, r4, r3, r2, r, o);
    }
    
    public static TwitterUserMetadata z(final JsonParser jsonParser) {
        final JsonTwitterUserMetadata jsonTwitterUserMetadata = (JsonTwitterUserMetadata)wx.d(jsonParser, JsonTwitterUserMetadata.class);
        boolean b;
        TwitterSocialProof twitterSocialProof2;
        String s;
        if (jsonTwitterUserMetadata != null) {
            final boolean equals = "top".equals(jsonTwitterUserMetadata.b);
            final String a = jsonTwitterUserMetadata.a;
            TwitterSocialProof twitterSocialProof;
            if (jsonTwitterUserMetadata.c != null) {
                twitterSocialProof = (TwitterSocialProof)jsonTwitterUserMetadata.c.b();
            }
            else {
                twitterSocialProof = null;
            }
            b = equals;
            twitterSocialProof2 = twitterSocialProof;
            s = a;
        }
        else {
            s = null;
            b = false;
            twitterSocialProof2 = null;
        }
        return new TwitterUserMetadata(twitterSocialProof2, s, null, b);
    }
    
    private static ArrayList z(final JsonParser jsonParser, final a a) {
        final ArrayList<TwitterTopic$SportsEvent$Player> list = new ArrayList<TwitterTopic$SportsEvent$Player>();
        for (JsonToken jsonToken = jsonParser.a(); jsonToken != null && jsonToken != JsonToken.e; jsonToken = jsonParser.a()) {
            if (jsonToken == JsonToken.b) {
                list.add(y(jsonParser, a));
            }
            else {
                jsonParser.c();
            }
        }
        return list;
    }
}
