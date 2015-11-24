// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.resilient;

import android.content.Context;
import android.util.Log;
import com.twitter.library.service.v;
import android.os.IBinder;
import android.content.Intent;
import android.app.Service;

public class PersistentJobsStickyService extends Service
{
    public IBinder onBind(final Intent intent) {
        return null;
    }
    
    public int onStartCommand(final Intent intent, final int n, final int n2) {
        int intExtra = -1;
        super.onStartCommand(intent, n, n2);
        final Context applicationContext = this.getApplicationContext();
        v.a(applicationContext);
        if (intent != null) {
            intExtra = intent.getIntExtra("startCondition", intExtra);
        }
        Log.d("CentralizerService", "Starting centralizer service for type: " + intExtra);
        final int b = d.a(applicationContext).b();
        switch (intExtra) {
            case -1: {
                if (b > 0) {
                    g.a(applicationContext).a();
                    break;
                }
                break;
            }
        }
        if (b > 0) {
            return 1;
        }
        this.stopSelf();
        return 2;
    }
}
