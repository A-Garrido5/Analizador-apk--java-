// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import com.whatsapp.gdrive.GoogleDriveService;
import com.whatsapp.gdrive.bw;
import android.os.IBinder;
import android.content.ComponentName;
import android.os.ConditionVariable;
import android.content.ServiceConnection;

class x5 implements ServiceConnection
{
    final ConditionVariable a;
    final a6o b;
    
    x5(final a6o b, final ConditionVariable a) {
        this.b = b;
        this.a = a;
    }
    
    public void onServiceConnected(final ComponentName componentName, final IBinder binder) {
        ChangeNumber.a(((bw)binder).a());
        this.a.open();
    }
    
    public void onServiceDisconnected(final ComponentName componentName) {
        this.a.close();
        ChangeNumber.a((GoogleDriveService)null);
    }
}
