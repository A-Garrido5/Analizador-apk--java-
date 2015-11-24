// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.gcm;

import android.os.AsyncTask;
import android.os.Build$VERSION;
import android.os.IBinder;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.content.WakefulBroadcastReceiver;
import android.util.Log;
import android.content.Intent;
import android.app.Service;

public abstract class GcmListenerService extends Service
{
    private int zzavB;
    private int zzavC;
    private final Object zzqt;
    
    public GcmListenerService() {
        this.zzqt = new Object();
        this.zzavC = 0;
    }
    
    static void zza(final GcmListenerService gcmListenerService, final Intent intent) {
        gcmListenerService.zzk(intent);
    }
    
    private final void zzk(final Intent intent) {
    Label_0263_Outer:
        while (true) {
            final boolean a = zzb$zza.a;
        Label_0263:
            while (true) {
            Label_0249_Outer:
                while (true) {
                    String stringExtra;
                    String s;
                    int n = 0;
                    Label_0249:Label_0229_Outer:
                    while (true) {
                        while (true) {
                        Label_0309:
                            while (true) {
                                try {
                                    if (!"com.google.android.c2dm.intent.RECEIVE".equals(intent.getAction())) {
                                        return;
                                    }
                                    stringExtra = intent.getStringExtra("message_type");
                                    if (stringExtra == null) {
                                        s = "gcm";
                                        n = -1;
                                        Label_0196:Label_0213_Outer:
                                        while (true) {
                                        Label_0213:
                                            while (true) {
                                                switch (s.hashCode()) {
                                                    case 102161: {
                                                        break Label_0196;
                                                    }
                                                    case -2062414158: {
                                                        Label_0179: {
                                                            break Label_0179;
                                                        Label_0118:
                                                            while (true) {
                                                                Label_0092: {
                                                                    synchronized (this.zzqt) {
                                                                        --this.zzavC;
                                                                        if (this.zzavC == 0) {
                                                                            this.zzgf(this.zzavB);
                                                                        }
                                                                        return;
                                                                        // iftrue(Label_0118:, !a)
                                                                        // iftrue(Label_0118:, !a)
                                                                        // iftrue(Label_0309:, !s.equals((Object)"send_event"))
                                                                        // iftrue(Label_0309:, !a)
                                                                        // iftrue(Label_0309:, !s.equals((Object)"gcm"))
                                                                        // iftrue(Label_0309:, !a)
                                                                        // iftrue(Label_0309:, !s.equals((Object)"send_error"))
                                                                        while (true) {
                                                                            n = 3;
                                                                            break Label_0309;
                                                                            this.onSendError(intent.getStringExtra("google.message_id"), intent.getStringExtra("error"));
                                                                            Block_12: {
                                                                                break Block_12;
                                                                                this.onDeletedMessages();
                                                                                break Label_0249;
                                                                                Block_10: {
                                                                                    break Block_10;
                                                                                    while (true) {
                                                                                        n = 0;
                                                                                        break Label_0179;
                                                                                        continue Label_0213_Outer;
                                                                                    }
                                                                                }
                                                                                n = 2;
                                                                                break Label_0213;
                                                                            }
                                                                            break Label_0092;
                                                                            continue Label_0263_Outer;
                                                                        }
                                                                        // iftrue(Label_0309:, !a)
                                                                        // iftrue(Label_0309:, !s.equals((Object)"deleted_messages"))
                                                                        while (true) {
                                                                            n = 1;
                                                                            continue Label_0196;
                                                                            continue Label_0229_Outer;
                                                                        }
                                                                        this.onMessageSent(intent.getStringExtra("google.message_id"));
                                                                        // iftrue(Label_0118:, !a)
                                                                        continue Label_0263;
                                                                        this.zzs(intent.getExtras());
                                                                    }
                                                                    // iftrue(Label_0118:, !a)
                                                                }
                                                                Log.w("GcmListenerService", "Received message with unknown type: " + s);
                                                            }
                                                        }
                                                        break;
                                                    }
                                                    case 814800675: {
                                                        continue Label_0196;
                                                    }
                                                    case 814694033: {
                                                        continue Label_0213;
                                                    }
                                                    default: {
                                                        break Label_0309;
                                                    }
                                                }
                                                break;
                                            }
                                            break;
                                        }
                                    }
                                }
                                finally {
                                    WakefulBroadcastReceiver.completeWakefulIntent(intent);
                                }
                                s = stringExtra;
                                continue Label_0263_Outer;
                            }
                            switch (n) {
                                case 0: {
                                    continue;
                                }
                                case 1: {
                                    continue Label_0249_Outer;
                                }
                                case 2: {
                                    continue Label_0249;
                                }
                                case 3: {
                                    continue Label_0263;
                                }
                            }
                            break;
                        }
                        break;
                    }
                    break;
                }
                break;
            }
        }
    }
    
    private void zzs(final Bundle bundle) {
        bundle.remove("message_type");
        bundle.remove("android.support.content.wakelockid");
        if (zza.zzt(bundle)) {
            zza.zzar((Context)this).zzu(bundle);
            return;
        }
        final String string = bundle.getString("from");
        bundle.remove("from");
        this.onMessageReceived(string, bundle);
    }
    
    public final IBinder onBind(final Intent intent) {
        return null;
    }
    
    public void onDeletedMessages() {
    }
    
    public void onMessageReceived(final String s, final Bundle bundle) {
    }
    
    public void onMessageSent(final String s) {
    }
    
    public void onSendError(final String s, final String s2) {
    }
    
    public final int onStartCommand(final Intent intent, final int n, final int zzavB) {
        while (true) {
            final boolean a = zzb$zza.a;
            while (true) {
                Label_0108: {
                    synchronized (this.zzqt) {
                        this.zzavB = zzavB;
                        ++this.zzavC;
                        // monitorexit(this.zzqt)
                        Label_0079: {
                            if (Build$VERSION.SDK_INT >= 11) {
                                AsyncTask.THREAD_POOL_EXECUTOR.execute(new GcmListenerService$1(this, intent));
                                if (!a) {
                                    break Label_0079;
                                }
                            }
                            new GcmListenerService$2(this, intent).execute((Object[])new Void[0]);
                        }
                        if (com.google.android.gms.iid.zzb$zza.a) {
                            final boolean a2 = false;
                            if (!a) {
                                break Label_0108;
                            }
                            zzb$zza.a = a2;
                        }
                        return 3;
                    }
                }
                final boolean a2 = true;
                continue;
            }
        }
    }
    
    boolean zzgf(final int n) {
        return this.stopSelfResult(n);
    }
}
