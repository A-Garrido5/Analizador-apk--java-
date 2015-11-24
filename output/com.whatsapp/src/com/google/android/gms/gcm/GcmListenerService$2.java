// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.gcm;

import android.content.Intent;
import android.os.AsyncTask;

class GcmListenerService$2 extends AsyncTask
{
    final Intent val$intent;
    final GcmListenerService zzavD;
    
    GcmListenerService$2(final GcmListenerService zzavD, final Intent val$intent) {
        this.zzavD = zzavD;
        this.val$intent = val$intent;
    }
    
    protected Object doInBackground(final Object[] array) {
        return this.zzb((Void[])array);
    }
    
    protected Void zzb(final Void[] array) {
        GcmListenerService.zza(this.zzavD, this.val$intent);
        return null;
    }
}
