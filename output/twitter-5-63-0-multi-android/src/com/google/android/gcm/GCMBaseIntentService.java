// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gcm;

import android.app.PendingIntent;
import android.os.SystemClock;
import android.app.AlarmManager;
import java.io.IOException;
import android.os.PowerManager;
import android.content.Intent;
import android.content.Context;
import java.util.concurrent.TimeUnit;
import android.util.Log;
import java.util.Random;
import android.os.PowerManager$WakeLock;
import android.app.IntentService;

public abstract class GCMBaseIntentService extends IntentService
{
    private static final boolean a;
    private static PowerManager$WakeLock b;
    private static final Object c;
    private static int e;
    private static final Random f;
    private static final int g;
    private static final String h;
    private final String[] d;
    
    static {
        a = Log.isLoggable("GCMBaseIntentService", 3);
        c = GCMBaseIntentService.class;
        GCMBaseIntentService.e = 0;
        f = new Random();
        g = (int)TimeUnit.SECONDS.toMillis(3600L);
        h = Long.toBinaryString(GCMBaseIntentService.f.nextLong());
    }
    
    protected GCMBaseIntentService() {
        this(a("DynamicSenderIds"), null);
    }
    
    private GCMBaseIntentService(final String s, final String[] d) {
        super(s);
        this.d = d;
    }
    
    protected GCMBaseIntentService(final String... array) {
        this(a(array), array);
    }
    
    private static String a(final String s) {
        final String string = "GCMIntentService-" + s + "-" + ++GCMBaseIntentService.e;
        if (GCMBaseIntentService.a) {
            Log.v("GCMBaseIntentService", "Intent service name: " + string);
        }
        return string;
    }
    
    private static String a(final String[] array) {
        return a(com.google.android.gcm.b.a(array));
    }
    
    static void a(final Context context, final Intent intent, final String s) {
        synchronized (GCMBaseIntentService.c) {
            if (GCMBaseIntentService.b == null) {
                GCMBaseIntentService.b = ((PowerManager)context.getSystemService("power")).newWakeLock(1, "GCM_LIB");
            }
            // monitorexit(GCMBaseIntentService.c)
            if (GCMBaseIntentService.a) {
                Log.v("GCMBaseIntentService", "Acquiring wakelock");
            }
            GCMBaseIntentService.b.acquire();
            intent.setClassName(context, s);
            context.startService(intent);
        }
    }
    
    private void c(final Context context, final Intent intent) {
        while (true) {
            String s = null;
            final String stringExtra = intent.getStringExtra("unregistered");
        Label_0135:
            while (true) {
                try {
                    final ar a = ar.a(context);
                    String a2;
                    if (stringExtra == null) {
                        a2 = a.a(this.d);
                    }
                    else {
                        a.a();
                        a2 = null;
                        s = null;
                    }
                    if (GCMBaseIntentService.a) {
                        Log.d("GCMBaseIntentService", "handleRegistration: registrationId = " + a2 + ", error = " + s + ", unregistered = " + stringExtra);
                    }
                    if (a2 != null) {
                        com.google.android.gcm.b.k(context);
                        com.google.android.gcm.b.a(context, a2);
                        this.c(context, a2);
                        return;
                    }
                    break Label_0135;
                }
                catch (IOException ex) {
                    s = "SERVICE_NOT_AVAILABLE";
                    final String a2 = null;
                    continue;
                }
                continue;
            }
            if (stringExtra != null) {
                com.google.android.gcm.b.k(context);
                this.d(context, com.google.android.gcm.b.h(context));
                return;
            }
            if (GCMBaseIntentService.a) {
                Log.d("GCMBaseIntentService", "Registration error: " + s);
            }
            if (!"SERVICE_NOT_AVAILABLE".equals(s)) {
                this.b(context, s);
                return;
            }
            if (this.a(context, s)) {
                final int l = com.google.android.gcm.b.l(context);
                final int n = l / 2 + GCMBaseIntentService.f.nextInt(l);
                if (GCMBaseIntentService.a) {
                    Log.d("GCMBaseIntentService", "Scheduling registration retry, backoff = " + n + " (" + l + ")");
                }
                final Intent intent2 = new Intent("com.google.android.gcm.intent.RETRY");
                intent2.setClass(context, com.google.android.gcm.a.a);
                intent2.putExtra("unregistered", stringExtra);
                intent2.putExtra("token", GCMBaseIntentService.h);
                ((AlarmManager)context.getSystemService("alarm")).set(3, SystemClock.elapsedRealtime() + n, PendingIntent.getBroadcast(context, 0, intent2, 0));
                if (l < GCMBaseIntentService.g) {
                    com.google.android.gcm.b.a(context, l * 2);
                }
            }
            else if (GCMBaseIntentService.a) {
                Log.d("GCMBaseIntentService", "Not retrying failed operation");
            }
        }
    }
    
    protected void a(final Context context, final int n) {
    }
    
    protected abstract void a(final Context p0, final Intent p1);
    
    protected boolean a(final Context context, final String s) {
        return true;
    }
    
    protected String[] a(final Context context) {
        if (this.d == null) {
            throw new IllegalStateException("sender id not set on constructor");
        }
        return this.d;
    }
    
    protected void b(final Context context, final Intent intent) {
    }
    
    protected abstract void b(final Context p0, final String p1);
    
    protected abstract void c(final Context p0, final String p1);
    
    protected void d(final Context context, final String s) {
    }
    
    public final void onHandleIntent(final Intent intent) {
        if (intent == null || intent.getAction() == null) {
            this.b(this.getApplicationContext(), intent);
            return;
        }
        Context applicationContext;
        String action;
        String stringExtra;
        String stringExtra2;
        int int1;
        String stringExtra3;
        Block_24_Outer:Block_26_Outer:
        while (true) {
            Label_0280: {
                try {
                    applicationContext = this.getApplicationContext();
                    action = intent.getAction();
                    Label_0103: {
                        if (!action.equals("com.google.android.c2dm.intent.REGISTRATION")) {
                            break Label_0103;
                        }
                        com.google.android.gcm.b.e(applicationContext);
                        this.c(applicationContext, intent);
                        synchronized (GCMBaseIntentService.c) {
                            if (GCMBaseIntentService.b != null) {
                                if (GCMBaseIntentService.a) {
                                    Log.v("GCMBaseIntentService", "Releasing wakelock");
                                }
                                GCMBaseIntentService.b.release();
                                Label_0091: {
                                    return;
                                }
                            }
                            break Label_0280;
                        }
                    }
                    if (!action.equals("com.google.android.c2dm.intent.RECEIVE")) {
                        break Label_0280;
                    }
                    stringExtra = intent.getStringExtra("message_type");
                    if (stringExtra == null) {
                        break Label_0280;
                    }
                    if (!stringExtra.equals("deleted_messages")) {
                        break Label_0280;
                    }
                    stringExtra2 = intent.getStringExtra("total_deleted");
                    if (stringExtra2 != null) {
                        try {
                            int1 = Integer.parseInt(stringExtra2);
                            if (GCMBaseIntentService.a) {
                                Log.v("GCMBaseIntentService", "Received deleted messages notification: " + int1);
                            }
                            this.a(applicationContext, int1);
                        }
                        catch (NumberFormatException ex) {
                            if (GCMBaseIntentService.a) {
                                Log.e("GCMBaseIntentService", "GCM returned invalid number of deleted messages: " + stringExtra2);
                            }
                        }
                    }
                    continue;
                }
                finally {
                    EndFinally_3: {
                        synchronized (GCMBaseIntentService.c) {
                            if (GCMBaseIntentService.b != null) {
                                if (GCMBaseIntentService.a) {
                                    Log.v("GCMBaseIntentService", "Releasing wakelock");
                                }
                                GCMBaseIntentService.b.release();
                            }
                            else if (GCMBaseIntentService.a) {
                                Log.e("GCMBaseIntentService", "Wakelock reference is null");
                            }
                            // monitorexit(GCMBaseIntentService.c)
                            break EndFinally_3;
                            // iftrue(Label_0056:, !GCMBaseIntentService.a)
                            // iftrue(Label_0453:, GCMBaseIntentService.h.equals((Object)stringExtra3))
                            // iftrue(Label_0423:, !GCMBaseIntentService.a)
                            // iftrue(Label_0056:, !action.equals((Object)"com.google.android.gcm.intent.RETRY"))
                            // iftrue(Label_0091:, !GCMBaseIntentService.a)
                            // iftrue(Label_0388:, !GCMBaseIntentService.a)
                            while (true) {
                                Block_25: {
                                Block_28:
                                    while (true) {
                                        while (true) {
                                            Label_0388: {
                                                Block_23: {
                                                    break Block_23;
                                                    stringExtra3 = intent.getStringExtra("token");
                                                    break Block_25;
                                                    Log.e("GCMBaseIntentService", "Received invalid token: " + stringExtra3);
                                                    break Label_0388;
                                                }
                                                Log.e("GCMBaseIntentService", "Received unknown special message: " + stringExtra);
                                                continue Block_24_Outer;
                                                break Block_28;
                                            }
                                            synchronized (GCMBaseIntentService.c) {
                                                if (GCMBaseIntentService.b != null) {
                                                    if (GCMBaseIntentService.a) {
                                                        Log.v("GCMBaseIntentService", "Releasing wakelock");
                                                    }
                                                    GCMBaseIntentService.b.release();
                                                    Label_0423: {
                                                        return;
                                                    }
                                                }
                                            }
                                            continue;
                                        }
                                        continue Block_26_Outer;
                                    }
                                    Log.e("GCMBaseIntentService", "Wakelock reference is null");
                                    return;
                                    com.google.android.gcm.b.d(applicationContext);
                                    continue Block_24_Outer;
                                    Label_0469: {
                                        com.google.android.gcm.b.b(applicationContext, this.a(applicationContext));
                                    }
                                    continue Block_24_Outer;
                                    Log.e("GCMBaseIntentService", "Wakelock reference is null");
                                    return;
                                    this.a(applicationContext, intent);
                                    continue Block_24_Outer;
                                }
                                continue;
                            }
                            Label_0453:;
                        }
                        // iftrue(Label_0469:, !b.g(applicationContext))
                    }
                }
            }
            break;
        }
    }
}
