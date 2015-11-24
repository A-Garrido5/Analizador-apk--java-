// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.gcm;

import android.os.Parcelable;
import android.util.Log;
import android.os.IBinder;
import android.content.Intent;
import java.util.HashSet;
import java.util.Set;
import android.app.Service;

public abstract class GcmTaskService extends Service
{
    private final Set zzavL;
    private int zzavM;
    
    public GcmTaskService() {
        this.zzavL = new HashSet();
    }
    
    static void zza(final GcmTaskService gcmTaskService, final String s) {
        gcmTaskService.zzdc(s);
    }
    
    private void zzdc(final String s) {
        synchronized (this.zzavL) {
            this.zzavL.remove(s);
            if (this.zzavL.size() == 0) {
                this.stopSelf(this.zzavM);
            }
        }
    }
    
    public IBinder onBind(final Intent intent) {
        return null;
    }
    
    public void onInitializeTasks() {
    }
    
    public abstract int onRunTask(final TaskParams p0);
    
    public int onStartCommand(final Intent intent, final int n, final int n2) {
        Label_0145: {
            if (!"com.google.android.gms.gcm.ACTION_TASK_READY".equals(intent.getAction())) {
                break Label_0145;
            }
            final String stringExtra = intent.getStringExtra("tag");
            final Parcelable parcelableExtra = intent.getParcelableExtra("callback");
            Label_0081: {
                if (parcelableExtra != null && parcelableExtra instanceof PendingCallback) {
                    break Label_0081;
                }
                Log.e("GcmTaskService", this.getPackageName() + " " + stringExtra + ": Could not process request, invalid callback.");
                return 2;
            }
            synchronized (this.zzavL) {
                this.zzavL.add(stringExtra);
                this.stopSelf(this.zzavM);
                this.zzavM = n2;
                // monitorexit(this.zzavL)
                new GcmTaskService$zza(this, stringExtra, ((PendingCallback)parcelableExtra).getIBinder()).start();
                if (!zzb$zza.a) {
                    return 2;
                }
                if (!"com.google.android.gms.gcm.SERVICE_ACTION_INITIALIZE".equals(intent.getAction())) {
                    return 2;
                }
                this.onInitializeTasks();
                synchronized (this.zzavL) {
                    this.zzavM = n2;
                    if (this.zzavL.size() == 0) {
                        this.stopSelf(this.zzavM);
                    }
                    return 2;
                }
            }
        }
    }
}
