// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.client;

import com.twitter.library.client.Session;
import com.twitter.library.service.z;
import com.twitter.library.service.y;
import com.twitter.library.client.as;
import com.twitter.library.client.az;
import com.twitter.errorreporter.ErrorReporter;
import android.os.IBinder;
import android.content.Intent;
import android.content.Context;
import java.util.HashMap;
import android.app.Service;

public class AppService extends Service
{
    private static final HashMap a;
    
    static {
        (a = new HashMap(2)).put("RESEND", 1);
        AppService.a.put("ABORT", 2);
    }
    
    public static Intent a(final Context context, final long n, final long n2, final String s) {
        return c(context, n, n2, s).setAction("com.twitter.android.abort." + n).putExtra("action_type", "ABORT");
    }
    
    public static Intent b(final Context context, final long n, final long n2, final String s) {
        return c(context, n, n2, s).setAction("com.twitter.android.resend." + n).putExtra("action_type", "RESEND");
    }
    
    private static Intent c(final Context context, final long n, final long n2, final String s) {
        return new Intent(context, (Class)AppService.class).putExtra("owner_id", n2).putExtra("android.intent.extra.TEXT", s).putExtra("status_id", n);
    }
    
    public IBinder onBind(final Intent intent) {
        return null;
    }
    
    public int onStartCommand(final Intent intent, final int n, final int n2) {
        final Integer n3 = AppService.a.get(intent.getStringExtra("action_type"));
        if (n3 == null) {
            ErrorReporter.a(new IllegalStateException("PHOTO-818: " + intent.toUri(0)));
            this.stopSelf(n2);
            return 2;
        }
        final Session b = az.a((Context)this).b(intent.getLongExtra("owner_id", 0L));
        intent.getStringExtra("android.intent.extra.TEXT");
        switch (n3) {
            case 1: {
                final long longExtra = intent.getLongExtra("status_id", 0L);
                if (b.d()) {
                    final Context applicationContext = this.getApplicationContext();
                    final ej ej = new ej(applicationContext, b, longExtra);
                    ej.g(4);
                    as.a(applicationContext).a(ej, (z)null);
                    break;
                }
                break;
            }
            case 2: {
                ob.a(this.getApplicationContext(), intent.getLongExtra("status_id", 0L));
                break;
            }
        }
        this.stopSelf(n2);
        return 3;
    }
}
