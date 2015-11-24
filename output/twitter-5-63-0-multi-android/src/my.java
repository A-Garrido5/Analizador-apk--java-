import java.util.List;
import com.twitter.library.api.TwitterUser;
import com.twitter.errorreporter.a;
import com.twitter.library.api.bh;
import com.twitter.library.api.bp;
import java.util.ArrayList;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.JsonParser;
import java.util.HashMap;
import com.twitter.library.api.ad;

// 
// Decompiled by Procyon v0.5.30
// 

public class my extends ad
{
    private static final HashMap a;
    private static final HashMap b;
    
    static {
        (a = new HashMap(6)).put("tweet_story", 1);
        my.a.put("follow_story", 6);
        my.a.put("topic_story", 7);
        my.a.put("url_story", 8);
        my.a.put("classic_trends_story", 9);
        my.a.put("news_story", 10);
        (b = new HashMap(13)).put("favorited_by", 2);
        my.b.put("retweeted_by", 3);
        my.b.put("shared_by", 4);
        my.b.put("followed_by", 5);
        my.b.put("author_followed_by", 13);
        my.b.put("photo_from_who_you_follow", 6);
        my.b.put("vine_from_who_you_follow", 7);
        my.b.put("popular_now", 8);
        my.b.put("happening_now", 9);
        my.b.put("top_photo", 10);
        my.b.put("top_vine", 11);
        my.b.put("top_tweet_in_timeline", 12);
        my.b.put("rare_tweet", 14);
    }
    
    private static mw a(final JsonParser jsonParser, final int n, final HashMap hashMap, final HashMap hashMap2) {
        String s = null;
        bp a = null;
        bp a2 = null;
        TwitterUser twitterUser = null;
        String s2 = null;
        String g = null;
        String g2 = null;
        String s3 = null;
        mx mx = null;
        List<bp> list = null;
        JsonToken a3 = jsonParser.a();
        String s4 = null;
        String s5 = null;
        while (a3 != null && a3 != JsonToken.c) {
            mx a4 = null;
            Label_0096: {
                switch (mz.a[a3.ordinal()]) {
                    case 1: {
                        final String e = jsonParser.e();
                        if ("metadata".equals(e)) {
                            for (JsonToken jsonToken = jsonParser.a(); jsonToken != null && jsonToken != JsonToken.c; jsonToken = jsonParser.a()) {
                                if (jsonToken == JsonToken.h) {
                                    final String e2 = jsonParser.e();
                                    if ("title".equals(e2)) {
                                        s2 = jsonParser.g();
                                    }
                                    else if ("description".equals(e2)) {
                                        g = jsonParser.g();
                                    }
                                    else if ("url".equals(e2)) {
                                        g2 = jsonParser.g();
                                    }
                                    else if ("headerUrl".equals(e2)) {
                                        s3 = jsonParser.g();
                                    }
                                }
                                else {
                                    jsonParser.c();
                                }
                            }
                            break;
                        }
                        if ("header_fallback".equals(e)) {
                            for (JsonToken jsonToken2 = jsonParser.a(); jsonToken2 != null && jsonToken2 != JsonToken.c; jsonToken2 = jsonParser.a()) {
                                if (jsonToken2 == JsonToken.h) {
                                    if ("header_image".equals(jsonParser.e())) {
                                        s3 = jsonParser.g();
                                    }
                                }
                                else {
                                    jsonParser.c();
                                }
                            }
                            break;
                        }
                        final Integer n2 = my.b.get(e);
                        if (n2 != null) {
                            a4 = a(jsonParser, n2, hashMap2);
                            break Label_0096;
                        }
                        jsonParser.c();
                        break;
                    }
                    case 2: {
                        if ("tweets".equals(jsonParser.e())) {
                            JsonToken jsonToken3 = jsonParser.a();
                            list = new ArrayList<bp>();
                            while (jsonToken3 != null && jsonToken3 != JsonToken.e) {
                                if (jsonToken3 == JsonToken.h) {
                                    final bp a5 = bh.a(jsonParser.g(), hashMap, hashMap2, null);
                                    if (a5 != null) {
                                        list.add(a5);
                                    }
                                }
                                else {
                                    jsonParser.c();
                                }
                                jsonToken3 = jsonParser.a();
                            }
                            break;
                        }
                        jsonParser.c();
                        a4 = mx;
                        break Label_0096;
                    }
                    case 3: {
                        final String e3 = jsonParser.e();
                        final String r = jsonParser.r();
                        if ("tweet".equals(e3)) {
                            a = bh.a(jsonParser.g(), hashMap, hashMap2, null);
                            a4 = mx;
                            break Label_0096;
                        }
                        if ("in_reply_to".equals(e3)) {
                            a2 = bh.a(jsonParser.g(), hashMap, hashMap2, null);
                            a4 = mx;
                            break Label_0096;
                        }
                        if ("user".equals(e3)) {
                            twitterUser = hashMap2.get(jsonParser.g());
                            a4 = mx;
                            break Label_0096;
                        }
                        if ("story_id".equals(e3)) {
                            s = r;
                            a4 = mx;
                            break Label_0096;
                        }
                        if ("poptart_impression".equals(e3)) {
                            s4 = r;
                            a4 = mx;
                            break Label_0096;
                        }
                        if ("source".equals(e3)) {
                            s5 = r;
                            a4 = mx;
                            break Label_0096;
                        }
                        if (n == 7 && "name".equals(e3)) {
                            s2 = jsonParser.r();
                            a4 = mx;
                            break Label_0096;
                        }
                        break;
                    }
                }
                a4 = mx;
            }
            final JsonToken a6 = jsonParser.a();
            mx = a4;
            a3 = a6;
        }
        if (mx == null) {
            switch (n) {
                case 9: {
                    final mx mx2 = new mx(15, 0, null);
                    return new mw(s, n, mx2, s2, g, g2, s3, s5, s4, a, a2, twitterUser, list);
                }
                case 10: {
                    final mx mx2 = new mx(16, 0, null);
                    return new mw(s, n, mx2, s2, g, g2, s3, s5, s4, a, a2, twitterUser, list);
                }
            }
        }
        final mx mx2 = mx;
        return new mw(s, n, mx2, s2, g, g2, s3, s5, s4, a, a2, twitterUser, list);
    }
    
    private static mx a(final JsonParser jsonParser, final int n, final HashMap hashMap) {
        List<TwitterUser> list = null;
        int n2 = 0;
        JsonToken a2;
        for (JsonToken a = jsonParser.a(); a != null && a != JsonToken.c; a = a2) {
            int h = 0;
            List<TwitterUser> list2 = null;
            Label_0072: {
                switch (mz.a[a.ordinal()]) {
                    default: {
                        jsonParser.c();
                        break;
                    }
                    case 4: {
                        if ("count".equals(jsonParser.e()) || "days_since_last_tweeted".equals(jsonParser.e())) {
                            h = jsonParser.h();
                            list2 = list;
                            break Label_0072;
                        }
                        break;
                    }
                    case 2: {
                        if ("users".equals(jsonParser.e())) {
                            JsonToken jsonToken = jsonParser.a();
                            list = new ArrayList<TwitterUser>();
                            while (jsonToken != null && jsonToken != JsonToken.e) {
                                if (jsonToken == JsonToken.h) {
                                    final TwitterUser twitterUser = hashMap.get(jsonParser.g());
                                    if (twitterUser != null) {
                                        list.add(twitterUser);
                                    }
                                }
                                else if (jsonToken == JsonToken.d || jsonToken == JsonToken.b) {
                                    jsonParser.c();
                                }
                                jsonToken = jsonParser.a();
                            }
                            break;
                        }
                        jsonParser.c();
                        h = n2;
                        list2 = list;
                        break Label_0072;
                    }
                }
                h = n2;
                list2 = list;
            }
            a2 = jsonParser.a();
            list = list2;
            n2 = h;
        }
        return new mx(n, n2, list);
    }
    
    public static List c(final JsonParser jsonParser) {
        final ArrayList<mw> list = new ArrayList<mw>();
        JsonToken jsonToken = jsonParser.a();
        HashMap hashMap = null;
        HashMap hashMap2 = null;
        while (jsonToken != null && jsonToken != JsonToken.c) {
            if (jsonToken == JsonToken.b) {
                HashMap n;
                HashMap a2;
                if ("twitter_objects".equals(jsonParser.e())) {
                    final JsonToken a = jsonParser.a();
                    n = hashMap;
                    a2 = hashMap2;
                    for (JsonToken a3 = a; a3 != null && a3 != JsonToken.c; a3 = jsonParser.a()) {
                        if (a3 == JsonToken.b) {
                            final String e = jsonParser.e();
                            if ("tweets".equals(e)) {
                                a2 = bh.a(jsonParser, (TwitterUser)null);
                            }
                            else if ("users".equals(e)) {
                                n = bh.N(jsonParser);
                            }
                            else {
                                jsonParser.c();
                            }
                        }
                        else {
                            jsonParser.c();
                        }
                    }
                }
                else {
                    jsonParser.c();
                    n = hashMap;
                    a2 = hashMap2;
                }
                hashMap2 = a2;
                hashMap = n;
            }
            else if (jsonToken == JsonToken.d) {
                if ("stories".equals(jsonParser.e()) && hashMap2 != null && hashMap != null) {
                    for (JsonToken jsonToken2 = jsonParser.a(); jsonToken2 != null && jsonToken2 != JsonToken.e; jsonToken2 = jsonParser.a()) {
                        if (jsonToken2 == JsonToken.b) {
                            final Integer n2 = my.a.get(jsonParser.e());
                            if (n2 != null) {
                                list.add(a(jsonParser, n2, hashMap2, hashMap));
                            }
                        }
                        else {
                            jsonParser.c();
                        }
                    }
                }
                else {
                    jsonParser.c();
                }
            }
            jsonToken = jsonParser.a();
        }
        return list;
    }
    
    protected String b(final JsonParser jsonParser, final int n) {
        return null;
    }
    
    protected List b(final JsonParser jsonParser) {
        return c(jsonParser);
    }
}
