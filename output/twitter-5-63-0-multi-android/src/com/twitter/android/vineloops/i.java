// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.vineloops;

import android.os.SystemClock;
import android.os.Handler;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;
import java.util.List;
import com.twitter.library.client.as;
import android.content.Context;
import java.util.Arrays;
import java.util.Collections;
import com.twitter.internal.network.HttpOperation$RequestMethod;
import java.util.Collection;

public class i
{
    static final Collection a;
    static final Collection b;
    private static i c;
    private final j d;
    private long e;
    
    static {
        a = Collections.singleton(HttpOperation$RequestMethod.b);
        b = Arrays.asList(0, 502, 511);
    }
    
    private i(final Context context, final as as) {
        this.d = new j(this, context, as);
    }
    
    public static i a(final Context context, final as as) {
        synchronized (i.class) {
            if (i.c == null) {
                i.c = new i(context, as);
            }
            return i.c;
        }
    }
    
    static JSONObject a(final List list) {
        final JSONArray jsonArray = new JSONArray();
        for (final VineLoopAggregator$Record vineLoopAggregator$Record : list) {
            final JSONObject jsonObject = new JSONObject();
            jsonObject.put("url", (Object)vineLoopAggregator$Record.a);
            jsonObject.put("count", vineLoopAggregator$Record.b);
            jsonObject.put("ts", vineLoopAggregator$Record.c / 1000.0);
            jsonArray.put((Object)jsonObject);
        }
        final JSONObject jsonObject2 = new JSONObject();
        jsonObject2.put("loops", (Object)jsonArray);
        return jsonObject2;
    }
    
    public void a() {
        final Handler handler = new Handler();
        handler.removeCallbacks((Runnable)this.d);
        handler.postAtTime((Runnable)this.d, this.e);
    }
    
    void a(final int n) {
        this.e = Math.max(10000, n * 1000) + SystemClock.uptimeMillis();
    }
}
