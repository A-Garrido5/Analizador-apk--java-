// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.iid;

import android.os.Binder;
import android.os.Message;
import android.os.Handler;

final class MessengerCompat$zza extends zzb$zza
{
    Handler handler;
    final MessengerCompat zzaxc;
    
    MessengerCompat$zza(final MessengerCompat zzaxc, final Handler handler) {
        this.zzaxc = zzaxc;
        this.handler = handler;
    }
    
    public void send(final Message message) {
        message.arg2 = Binder.getCallingUid();
        this.handler.dispatchMessage(message);
    }
}
