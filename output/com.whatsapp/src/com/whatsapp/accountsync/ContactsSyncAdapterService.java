// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.accountsync;

import android.os.IBinder;
import android.content.Intent;
import android.content.Context;
import android.content.AbstractThreadedSyncAdapter;
import android.app.Service;

public class ContactsSyncAdapterService extends Service
{
    private final AbstractThreadedSyncAdapter a;
    
    public ContactsSyncAdapterService() {
        this.a = new b(this, (Context)this, true);
    }
    
    public IBinder onBind(final Intent intent) {
        return this.a.getSyncAdapterBinder();
    }
}
