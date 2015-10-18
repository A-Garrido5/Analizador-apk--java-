// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import com.twitter.errorreporter.ErrorReporter;
import com.twitter.library.service.ab;
import com.twitter.internal.network.l;
import com.twitter.android.util.ap;
import com.twitter.library.scribe.TwitterScribeLog;
import com.twitter.library.client.az;
import com.twitter.library.client.as;
import android.content.Intent;
import android.content.Context;
import android.support.v4.content.LocalBroadcastManager;
import com.twitter.library.service.aa;
import com.twitter.library.service.y;
import android.os.Bundle;
import android.util.Log;
import com.twitter.library.client.App;
import android.os.Handler;
import com.twitter.android.client.c;
import com.twitter.library.client.au;
import com.twitter.android.client.bg;
import android.app.IntentService;

public class DeviceRegistrationService extends IntentService implements bg, au
{
    private static final boolean a;
    private c b;
    private String c;
    private String d;
    private boolean e;
    private Handler f;
    
    static {
        a = (App.l() && Log.isLoggable("phone_registration", 3));
    }
    
    public DeviceRegistrationService() {
        super("device_registration_service");
    }
    
    public void a(final int n, final Bundle bundle, final y y) {
    }
    
    public void a(final int n, final y y) {
        if (n == 1) {
            final l f = ((aa)y.l().b()).f();
            if (f != null) {
                final int a = f.a;
                switch (a) {
                    default: {
                        if (DeviceRegistrationService.a) {
                            Log.d("phone_registration", "Device registration failed with error code " + a);
                            break;
                        }
                        break;
                    }
                    case 200: {
                        if (DeviceRegistrationService.a) {
                            Log.d("phone_registration", "Device registration successful.");
                        }
                        LocalBroadcastManager.getInstance((Context)this).sendBroadcast(new Intent("registration_success_broadcast"));
                        final ab p2 = y.P();
                        as.a((Context)this).a(new qd((Context)this, p2, p2.c, p2.e));
                        break;
                    }
                    case 404: {
                        if (DeviceRegistrationService.a) {
                            Log.d("phone_registration", "Device registration endpoint not found.");
                            break;
                        }
                        break;
                    }
                    case 400: {
                        if (DeviceRegistrationService.a) {
                            Log.d("phone_registration", "Device registration failed: bad request.");
                            break;
                        }
                        break;
                    }
                }
                String s;
                if (a == 200) {
                    s = "success";
                }
                else {
                    s = "failure";
                }
                this.b.a(new TwitterScribeLog(az.a((Context)this).b().g()).b(this.c, "", "phone_number", ap.a((Context)this).h(), s));
            }
            this.f.removeCallbacksAndMessages((Object)null);
        }
    }
    
    public void a(final String s) {
        final mq a = mq.a((Context)this, this.b.a().b(), this.d, s, false);
        if (!this.e) {
            a.f();
        }
        as.a((Context)this).a(a, 1, 0, this);
        this.b.g();
    }
    
    public void b(final int n, final y y) {
    }
    
    protected void onHandleIntent(final Intent intent) {
        if (intent == null) {
            ErrorReporter.a(new NullPointerException("DeviceRegistrationService intent is null"));
            return;
        }
        this.d = intent.getStringExtra("phone_number");
        this.e = intent.getBooleanExtra("disable_sms_notifications", true);
        this.c = intent.getStringExtra("scribe_page_term");
        this.b = com.twitter.android.client.c.a((Context)this);
        if (DeviceRegistrationService.a) {
            Log.d("phone_registration", "Starting Device Register..");
        }
        this.b.a(this);
        final mp a = mp.a((Context)this, this.b.a().b(), this.d);
        if (!this.e) {
            a.f();
        }
        (this.f = new Handler()).postDelayed((Runnable)new eq(this), 120000L);
        a.S();
    }
}
