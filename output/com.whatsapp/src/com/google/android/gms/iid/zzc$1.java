// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.iid;

import android.os.Message;
import android.os.Looper;
import android.os.Handler;

class zzc$1 extends Handler
{
    final zzc zzaxp;
    
    zzc$1(final zzc zzaxp, final Looper looper) {
        this.zzaxp = zzaxp;
        super(looper);
    }
    
    public void handleMessage(final Message message) {
        this.zzaxp.zze(message);
    }
}
