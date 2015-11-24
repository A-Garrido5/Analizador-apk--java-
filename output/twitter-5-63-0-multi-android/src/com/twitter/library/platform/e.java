// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.platform;

import android.content.SyncStats;
import com.twitter.library.api.bp;
import com.twitter.library.media.manager.j;
import java.util.Iterator;
import com.twitter.library.provider.bg;
import com.twitter.library.media.manager.ResourceRequestType;
import com.twitter.library.media.manager.UserImageRequest;
import com.twitter.library.experiments.b;
import com.twitter.library.media.manager.k;
import com.twitter.library.api.at;
import java.util.HashSet;
import com.twitter.library.telephony.TelephonyUtil;
import com.twitter.library.featureswitch.d;
import android.util.Log;
import com.twitter.library.media.manager.q;
import android.content.SyncResult;
import com.twitter.library.service.aa;
import com.twitter.library.api.timeline.RichTimeline$RequestType;
import com.twitter.library.api.timeline.w;
import com.twitter.library.network.OAuthToken;
import com.twitter.library.api.TwitterUser;
import android.content.Context;

public class e
{
    private final Context a;
    private final TwitterUser b;
    private final String c;
    private final OAuthToken d;
    
    public e(final Context context, final TwitterUser b, final String c, final OAuthToken d) {
        this.a = context.getApplicationContext();
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    protected w a() {
        return (w)new w(this.a, this.b.userId, this.c, this.d, this.b).a(RichTimeline$RequestType.b).j("Home sync requests are never triggered by a user action.");
    }
    
    protected aa a(final w w) {
        return w.S();
    }
    
    public boolean a(final SyncResult syncResult, final DataSyncResult dataSyncResult, final q q) {
        int n = 1;
        if (TwitterDataSyncService.g(this.a, this.c)) {
            return false;
        }
        final w a = this.a();
        final int a2 = this.a(a).f().a;
        if (a2 == 200) {
            final int k = a.K();
            final int l = a.L();
            if (com.twitter.library.platform.a.a) {
                Log.d("TwitterDataSync", "====> Sync home timeline, got " + k);
            }
            if (k > 0) {
                final String[] array = new String[n];
                array[0] = "prefetch_all";
                if (com.twitter.library.featureswitch.d.a("wifi_prefetch_timeline_images", array) && TelephonyUtil.c() && a.D() != null && q != null) {
                    final HashSet<String> set = new HashSet<String>();
                    for (final at at : a.D()) {
                        if (at.e != null) {
                            final j a3 = ((k)((k)((k)UserImageRequest.a(at.e.c().y.profileImageUrl, com.twitter.library.experiments.b.c()).b(false)).c(n != 0)).a(ResourceRequestType.b)).a();
                            final String a4 = a3.a();
                            if (set.contains(a4)) {
                                continue;
                            }
                            q.a(a3);
                            set.add(a4);
                        }
                    }
                }
                final com.twitter.library.platform.d g = new com.twitter.library.platform.d();
                g.c = k;
                if (!dataSyncResult.c) {
                    if ((g.b = l) == n) {
                        final at at2 = a.D().get(0);
                        if (at2.e != null) {
                            g.a(at2.e).a(at2.e.y);
                        }
                        else if (at2.f != null) {
                            final bp a5 = at2.f.a();
                            g.a(a5).a(a5.y);
                        }
                    }
                    g.p = bg.a(this.a, this.b.userId).a(this.c, n, null, g.a(), g.g, g.e, n != 0);
                }
                dataSyncResult.g = g;
            }
        }
        else if (a2 == 401) {
            final SyncStats stats = syncResult.stats;
            ++stats.numAuthExceptions;
        }
        else if (a2 == 0) {
            final SyncStats stats2 = syncResult.stats;
            ++stats2.numParseExceptions;
        }
        if (syncResult.hasError()) {
            n = 0;
        }
        return n != 0;
    }
}
