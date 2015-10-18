// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.browser;

import com.twitter.library.scribe.TwitterScribeAssociation;
import com.twitter.library.scribe.ScribeLog;
import com.twitter.library.scribe.WebsiteAssetsLog;
import com.twitter.library.api.PromotedEvent;
import com.twitter.android.client.WebsiteDwellMonitor$Dwell;
import com.twitter.library.scribe.NativeCardUserAction;
import com.twitter.library.card.instance.CardInstanceData;
import com.twitter.library.scribe.TwitterScribeLog;
import com.twitter.library.provider.Tweet;
import com.twitter.android.client.c;
import android.content.Context;

public class i
{
    private final Context a;
    private final c b;
    private final long c;
    private final Tweet d;
    private final boolean e;
    private final wp f;
    private String g;
    private String h;
    private TwitterScribeLog i;
    
    public i(final Context a, final c b, final long c, final Tweet d, final wp f) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = (this.d != null && this.d.m());
        this.f = f;
        if (this.d != null) {
            final CardInstanceData w = this.d.W();
            if (w != null) {
                final vc u = w.u();
                if (u != null) {
                    this.g = wb.a("website_url", u);
                    this.h = wb.a("website_dest_url", u);
                }
            }
        }
    }
    
    private void a(final TwitterScribeLog twitterScribeLog, final boolean b, final boolean b2) {
        final CardInstanceData w = this.d.W();
        if (w != null) {
            final String a = w.a("_card_data");
            if (a != null) {
                twitterScribeLog.a(a, null, null).a(b, b2);
            }
        }
    }
    
    void a() {
        this.i = this.b("load_started");
    }
    
    void a(final long n) {
        if (this.e && n > 0L) {
            for (WebsiteDwellMonitor$Dwell websiteDwellMonitor$Dwell = WebsiteDwellMonitor$Dwell.a; websiteDwellMonitor$Dwell != null && 1000L * websiteDwellMonitor$Dwell.d() < n; websiteDwellMonitor$Dwell = websiteDwellMonitor$Dwell.c()) {
                this.a(websiteDwellMonitor$Dwell.b());
            }
        }
    }
    
    void a(final PromotedEvent promotedEvent) {
        if (!this.e) {
            return;
        }
        this.f.a(wm.a(promotedEvent, this.d.j).a());
    }
    
    void a(final WebsiteAssetsLog websiteAssetsLog) {
        this.b.a(((TwitterScribeLog)((TwitterScribeLog)((TwitterScribeLog)new TwitterScribeLog(this.c).f("asset_prefetching_event")).b(new String[] { "web_view::::assets_loaded" })).a(this.a)).a(websiteAssetsLog));
    }
    
    void a(final String s) {
        if (this.d == null) {
            return;
        }
        this.b.a(this.b(s));
    }
    
    void a(final String s, final boolean b, final boolean b2) {
        if (this.d == null) {
            return;
        }
        final TwitterScribeLog b3 = this.b(s);
        this.a(b3, b, b2);
        this.b.a(b3);
    }
    
    void a(final boolean b, final boolean b2) {
        if (this.d == null) {
            return;
        }
        final TwitterScribeLog b3 = this.b("load_finished");
        this.a(this.i, b, b2);
        this.a(b3, b, b2);
        this.b.a(this.i);
        this.b.a(b3);
    }
    
    TwitterScribeLog b(final String s) {
        return ((TwitterScribeLog)((TwitterScribeLog)((TwitterScribeLog)new TwitterScribeLog(this.c).b(new String[] { "web_view::::" + s })).c(this.g)).j(this.h)).a(this.a, this.d, null, null);
    }
}
