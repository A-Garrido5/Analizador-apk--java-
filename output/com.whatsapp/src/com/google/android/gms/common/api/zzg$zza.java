// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.common.api;

import android.util.Log;
import android.os.Message;
import android.os.Looper;
import android.os.Handler;

final class zzg$zza extends Handler
{
    final zzg zzXE;
    
    zzg$zza(final zzg zzXE, final Looper looper) {
        this.zzXE = zzXE;
        super(looper);
    }
    
    public void handleMessage(final Message message) {
        final boolean a = Api.a;
        Label_0072: {
            switch (message.what) {
                case 1: {
                    zzg.zzd(this.zzXE);
                    if (a) {
                        break Label_0072;
                    }
                    return;
                }
                case 2: {
                    zzg.zzc(this.zzXE);
                    if (a) {
                        break;
                    }
                    return;
                }
            }
        }
        Log.w("GoogleApiClientImpl", "Unknown message id: " + message.what);
    }
}
