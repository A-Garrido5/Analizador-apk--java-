// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.util;

import java.util.Collection;
import com.twitter.util.collection.CollectionUtils;
import com.twitter.library.provider.cn;
import com.twitter.library.api.Prompt;
import java.util.Iterator;
import java.util.Map;
import com.twitter.library.api.z;
import java.util.LinkedHashMap;
import android.text.TextUtils;
import com.twitter.library.provider.Tweet;
import com.twitter.library.provider.ad;
import android.database.Cursor;
import com.twitter.android.client.t;
import com.twitter.library.client.az;
import com.twitter.android.oy;
import java.lang.ref.WeakReference;
import android.content.Context;
import android.os.AsyncTask;

public class c extends AsyncTask
{
    private final Context a;
    private final WeakReference b;
    private final oy c;
    
    public c(final Context context, final b b, final oy c) {
        this.a = context.getApplicationContext();
        this.b = new WeakReference((T)b);
        this.c = c;
    }
    
    protected int a(final long n) {
        return t.a(az.a(this.a).b()).b(n);
    }
    
    protected long a(final Cursor cursor, final int n, final String s) {
        if (cursor.moveToPosition(n - 1) && this.a(cursor)) {
            final Tweet a = new ad(cursor).a();
            if (this.a(a) && !this.a(a, s)) {
                return a.Q;
            }
        }
        return 0L;
    }
    
    protected long a(final Cursor cursor, final String s, final String s2) {
        final boolean equals = TextUtils.equals((CharSequence)s, (CharSequence)"mutual_follow");
        final boolean equals2 = TextUtils.equals((CharSequence)s, (CharSequence)"not_following");
        final boolean equals3 = TextUtils.equals((CharSequence)s, (CharSequence)"most_favorited");
        final LinkedHashMap<Long, Tweet> linkedHashMap = new LinkedHashMap<Long, Tweet>();
        if (!cursor.moveToFirst()) {
            return 0L;
        }
        int n = 0;
        int n2 = 0;
        Tweet tweet = null;
        while (true) {
            final int n3 = n + 1;
            if (n >= 20) {
                break;
            }
            int t = 0;
            Label_0100: {
                if (!this.a(cursor)) {
                    t = n2;
                }
                else {
                    final Tweet a = new ad(cursor).a();
                    if (this.a(a)) {
                        if (this.a(a, s2)) {
                            t = n2;
                            break Label_0100;
                        }
                        if (equals) {
                            if (z.c(a.r) && z.b(a.r)) {
                                return a.Q;
                            }
                            if (z.b(a.r) && !linkedHashMap.containsKey(a.C)) {
                                linkedHashMap.put(a.C, a);
                                t = n2;
                                break Label_0100;
                            }
                        }
                        else if (equals2) {
                            if (!z.b(a.r)) {
                                return a.Q;
                            }
                        }
                        else {
                            if (!equals3) {
                                return a.Q;
                            }
                            if (n3 == 1 || a.t > n2) {
                                t = a.t;
                                tweet = a;
                                break Label_0100;
                            }
                        }
                    }
                    t = n2;
                }
            }
            if (!cursor.moveToNext()) {
                break;
            }
            n2 = t;
            n = n3;
        }
        if (equals && !linkedHashMap.isEmpty()) {
            return this.a(linkedHashMap);
        }
        if (!equals3) {
            return 0L;
        }
        if (tweet != null) {
            return tweet.Q;
        }
        return 0L;
    }
    
    protected long a(final Map map) {
        final Map b = this.b(map);
        if (b == null) {
            return 0L;
        }
        for (final long longValue : map.keySet()) {
            int intValue;
            if (b.containsKey(longValue)) {
                intValue = b.get(longValue);
            }
            else {
                intValue = 0;
            }
            if (z.c(intValue) && z.b(intValue)) {
                return ((Tweet)map.get(longValue)).Q;
            }
        }
        return 0L;
    }
    
    protected Prompt a(final Prompt... array) {
        if (array == null || array.length != 1) {
            return null;
        }
        final Cursor query = this.a.getContentResolver().query(this.c.a, this.c.b, this.c.c, this.c.d, this.c.e);
        if (query == null) {
            return null;
        }
        final Prompt prompt = array[0];
        try {
            if (prompt.o > 0) {
                prompt.n = this.a(query, prompt.o, prompt.q);
            }
            if (prompt.n <= 0L) {
                prompt.n = this.a(query, prompt.s, prompt.q);
            }
            return prompt;
        }
        finally {
            query.close();
        }
    }
    
    protected void a(final Prompt prompt) {
        final b b = (b)this.b.get();
        if (b != null && prompt != null) {
            b.b(prompt);
        }
    }
    
    protected boolean a(final Cursor cursor) {
        return cursor.getColumnIndex("t_data_type") != -1 && cursor.getInt(cn.f) == 1;
    }
    
    protected boolean a(final Tweet tweet) {
        final b b = (b)this.b.get();
        if (b != null) {
            final Prompt a = b.a(tweet.Q);
            if (a == null || a.c()) {
                return !tweet.s() && !tweet.m() && !tweet.ad() && !tweet.A() && !tweet.o() && tweet.C != az.a(this.a).b().g();
            }
        }
        return false;
    }
    
    public boolean a(final Tweet tweet, final String s) {
        if (!TextUtils.isEmpty((CharSequence)s)) {
            switch (s) {
                default: {
                    return false;
                }
                case "favorite_action": {
                    if (tweet.e) {
                        return true;
                    }
                    break;
                }
                case "follow_action": {
                    if (z.b(this.a(tweet.C) | tweet.r)) {
                        return true;
                    }
                    break;
                }
                case "retweet_action": {
                    if (tweet.h) {
                        return true;
                    }
                    break;
                }
            }
        }
        return false;
    }
    
    protected Map b(final Map map) {
        final pp pp = new pp(this.a, az.a(this.a).b(), CollectionUtils.c(map.keySet()));
        pp.S();
        return pp.e();
    }
}
