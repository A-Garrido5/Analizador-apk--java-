// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.api.timeline;

import com.twitter.library.service.d;
import com.twitter.library.service.f;
import com.twitter.internal.network.HttpOperation$RequestMethod;
import com.twitter.library.service.e;
import java.util.HashMap;
import com.twitter.library.service.ab;
import android.content.Context;
import java.util.Map;
import com.twitter.library.service.c;

public abstract class q extends c
{
    private final long a;
    private final Map e;
    
    protected q(final Context context, final String s, final ab ab, final long a, final Map map) {
        super(context, s, ab);
        this.e = new HashMap();
        this.a = a;
        if (map != null) {
            this.e.putAll(map);
        }
    }
    
    @Override
    protected e a() {
        final f a = this.M().a(HttpOperation$RequestMethod.b).a(new Object[] { "timelines", "dismiss" }).a("tweet_id", String.valueOf(this.a));
        final Map e = this.e;
        final String s = e.get("suggestion_type");
        if (s != null) {
            a.a("suggestion_type", s);
        }
        final String s2 = e.get("controller_data");
        if (s2 != null) {
            a.a("controller_data", s2);
        }
        final String s3 = e.get("source_data");
        if (s3 != null) {
            a.a("source_data", s3);
        }
        return a.a();
    }
    
    @Override
    protected d h() {
        return null;
    }
}
