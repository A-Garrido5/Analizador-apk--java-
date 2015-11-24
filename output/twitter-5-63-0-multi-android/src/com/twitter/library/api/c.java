// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.api;

import com.twitter.library.featureswitch.d;
import com.twitter.library.client.App;
import com.twitter.library.service.f;
import com.twitter.library.client.Session;
import android.content.Context;

public class c extends ae
{
    public c(final Context context, final Session session) {
        super(context, c.class.getName(), session);
    }
    
    @Override
    protected void a(final f f) {
        super.a(f);
        if (!App.b() && !App.a()) {
            f.b("twitter.com");
            return;
        }
        if (com.twitter.library.featureswitch.d.f("app_event_track_production_server_enabled")) {
            f.b("twitter.com");
            return;
        }
        f.b("macaw-nymizer.staging37.macaw-nymizer.service.smf1.twitter.com");
        f.c("http");
    }
    
    @Override
    protected com.twitter.library.service.d h() {
        return null;
    }
}
