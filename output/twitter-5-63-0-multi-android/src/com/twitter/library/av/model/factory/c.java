// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.av.model.factory;

import android.net.Uri$Builder;
import java.util.Map;
import com.twitter.internal.network.HttpOperation;
import com.twitter.internal.network.j;
import com.twitter.library.network.g;
import com.twitter.library.featureswitch.d;
import com.twitter.library.av.model.f;
import com.twitter.library.telephony.TelephonyUtil;
import com.twitter.library.av.model.b;
import com.twitter.library.av.playback.au;
import android.content.Context;
import com.twitter.library.api.MediaEntity;

public class c extends a
{
    private final MediaEntity a;
    
    public c(final MediaEntity a) {
        this.a = a;
    }
    
    @Override
    public b a(final Context context, final au au) {
        TelephonyUtil.d(context);
        final f f = new f(this.a, TelephonyUtil.e());
        if (!d.f("video_consumption_prefetch_enabled")) {
            return f;
        }
        try {
            final HttpOperation a = new g(context, f.a(0).a()).a(new e(null)).a(15000).a();
            a.a("Range", "bytes=0-1");
            a.c();
            return f;
        }
        catch (Exception ex) {
            return f;
        }
    }
    
    @Override
    protected b a(final au au, final j j, final HttpOperation httpOperation, final Map map, final mc mc) {
        return null;
    }
    
    @Override
    protected void a(final Context context, final Map map, final com.twitter.library.telephony.d d) {
    }
    
    @Override
    protected void a(final Uri$Builder uri$Builder, final Map map, final mc mc) {
    }
    
    @Override
    protected j b(final Context context, final au au) {
        return null;
    }
}
