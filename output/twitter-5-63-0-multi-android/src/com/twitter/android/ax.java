// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import com.twitter.library.client.k;
import com.twitter.library.platform.TwitterDataSyncService;
import com.twitter.library.service.z;
import com.twitter.library.service.y;
import com.twitter.library.api.account.ab;
import com.twitter.library.client.as;
import com.twitter.android.util.AppEventTrack;
import com.twitter.android.util.AppEventTrack$EventType;
import com.twitter.library.client.Session;
import android.content.Context;
import com.twitter.library.client.bj;

public abstract class ax implements bj
{
    protected Context a;
    
    public ax(final Context a) {
        this.a = a;
    }
    
    @Override
    public void a(final Session session, final String s) {
        AppEventTrack.a(this.a, AppEventTrack$EventType.d, new String[0]);
        kg.b(this.a);
        as.a(this.a).a(ab.a(this.a, session), (z)null);
        TwitterDataSyncService.e(this.a, session.e());
        new k(this.a, session.e()).a().a("auto_device_follow_candidate", true).apply();
    }
}
