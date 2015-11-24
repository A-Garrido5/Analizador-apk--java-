// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.common.internal;

import android.util.Log;
import android.os.IInterface;
import android.app.PendingIntent;
import com.google.android.gms.common.ConnectionResult;
import android.os.Message;
import android.os.Looper;
import android.os.Handler;

final class zzi$zzb extends Handler
{
    final zzi zzaax;
    
    public zzi$zzb(final zzi zzaax, final Looper looper) {
        this.zzaax = zzaax;
        super(looper);
    }
    
    private void zza(final Message message) {
        final zzi$zzc zzi$zzc = (zzi$zzc)message.obj;
        zzi$zzc.zznP();
        zzi$zzc.unregister();
    }
    
    private boolean zzb(final Message message) {
        return message.what == 2 || message.what == 1 || message.what == 5 || message.what == 6;
    }
    
    public void handleMessage(final Message message) {
        if (this.zzaax.zzaau.get() != message.arg1) {
            if (this.zzb(message)) {
                this.zza(message);
            }
            return;
        }
        if ((message.what == 1 || message.what == 5 || message.what == 6) && !this.zzaax.isConnecting()) {
            this.zza(message);
            return;
        }
        if (message.what == 3) {
            final ConnectionResult connectionResult = new ConnectionResult(message.arg2, null);
            zzi.zza(this.zzaax).onReportServiceBinding(connectionResult);
            this.zzaax.onConnectionFailed(connectionResult);
            return;
        }
        if (message.what == 4) {
            zzi.zza(this.zzaax, 4, null);
            if (zzi.zzb(this.zzaax) != null) {
                zzi.zzb(this.zzaax).onConnectionSuspended(message.arg2);
            }
            this.zzaax.onConnectionSuspended(message.arg2);
            zzi.zza(this.zzaax, 4, 1, null);
            return;
        }
        if (message.what == 2 && !this.zzaax.isConnected()) {
            this.zza(message);
            return;
        }
        if (this.zzb(message)) {
            ((zzi$zzc)message.obj).zznQ();
            return;
        }
        Log.wtf("GmsClient", "Don't know how to handle this message.");
    }
}
