// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.util;

import org.json.JSONObject;
import com.twitter.library.service.z;
import com.twitter.library.service.y;
import com.twitter.library.client.az;
import com.twitter.library.api.c;
import com.twitter.library.client.as;
import com.twitter.library.scribe.ScribeService;
import com.twitter.library.scribe.TwitterScribeLog;
import com.twitter.library.scribe.ScribeLog;
import android.content.Context;
import android.os.AsyncTask;

class f extends AsyncTask
{
    private final Context a;
    private final AppEventTrack$EventType b;
    
    public f(final Context context, final AppEventTrack$EventType b) {
        this.a = context.getApplicationContext();
        this.b = b;
    }
    
    protected ScribeLog a(final long n, final String... array) {
        switch (e.a[this.b.ordinal()]) {
            default: {
                return null;
            }
            case 1: {
                final h h = new h(AppEventTrack.a(array[0]));
                return ((TwitterScribeLog)new TwitterScribeLog(n).b(new String[] { "external:referred:::launch" })).a(h.c, h.d, h.a, h.e, h.b, h.f, array[0]);
            }
            case 2: {
                final h h2 = new h(AppEventTrack.a(array[0]));
                final ScribeLog a = ((TwitterScribeLog)new TwitterScribeLog(n).b(new String[] { "external:referred:::open" })).a(h2.c, h2.d, h2.a, h2.e, h2.b, h2.f, array[2] + "&" + "mat_click_id" + "=" + array[1]);
                ScribeService.a(this.a, a);
                return a;
            }
            case 3: {
                return new TwitterScribeLog(n).b(new String[] { "app:launch:::update_new_version" });
            }
        }
    }
    
    protected Void a(final String... array) {
        final JSONObject b = AppEventTrack.b(this.a, this.b, array);
        if (b != null) {
            as.a(this.a).a(new c(this.a, az.a(this.a).b()).g(1).b("data", "[" + b.toString() + "]"), new g(this));
            final ScribeLog a = this.a((long)Long.valueOf(az.a(this.a).b().g()), array);
            if (a != null) {
                ScribeService.a(this.a, a);
            }
        }
        return null;
    }
}
