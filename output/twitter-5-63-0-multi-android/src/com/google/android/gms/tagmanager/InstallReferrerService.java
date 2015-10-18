// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.tagmanager;

import android.content.Intent;
import android.content.Context;
import com.google.android.gms.analytics.CampaignTrackingService;
import android.app.IntentService;

public final class InstallReferrerService extends IntentService
{
    CampaignTrackingService a;
    Context b;
    
    public InstallReferrerService() {
        super("InstallReferrerService");
    }
    
    private void a(final Context context, final Intent intent) {
        if (this.a == null) {
            this.a = new CampaignTrackingService();
        }
        this.a.a(context, intent);
    }
    
    protected void onHandleIntent(final Intent intent) {
        final String stringExtra = intent.getStringExtra("referrer");
        Context context;
        if (this.b != null) {
            context = this.b;
        }
        else {
            context = this.getApplicationContext();
        }
        y.a(context, stringExtra);
        this.a(context, intent);
    }
}
