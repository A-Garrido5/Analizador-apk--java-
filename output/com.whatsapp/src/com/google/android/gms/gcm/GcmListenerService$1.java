// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.gcm;

import android.content.Intent;

class GcmListenerService$1 implements Runnable
{
    final Intent val$intent;
    final GcmListenerService zzavD;
    
    GcmListenerService$1(final GcmListenerService zzavD, final Intent val$intent) {
        this.zzavD = zzavD;
        this.val$intent = val$intent;
    }
    
    @Override
    public void run() {
        GcmListenerService.zza(this.zzavD, this.val$intent);
    }
}
