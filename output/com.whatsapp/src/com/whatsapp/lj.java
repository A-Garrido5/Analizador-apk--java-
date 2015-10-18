// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import com.whatsapp.gdrive.GoogleDriveService;
import com.whatsapp.gdrive.bw;
import android.os.IBinder;
import android.content.ComponentName;
import android.os.ConditionVariable;
import com.whatsapp.gdrive.cs;
import android.content.ServiceConnection;

final class lj implements ServiceConnection
{
    final cs a;
    final ConditionVariable b;
    
    lj(final ConditionVariable b, final cs a) {
        this.b = b;
        this.a = a;
    }
    
    public void onServiceConnected(final ComponentName componentName, final IBinder binder) {
        DeleteAccountConfirmation.a(((bw)binder).a());
        this.b.open();
        DeleteAccountConfirmation.b().a(this.a);
        DeleteAccountConfirmation.b().ad();
    }
    
    public void onServiceDisconnected(final ComponentName componentName) {
        this.b.close();
        DeleteAccountConfirmation.a((GoogleDriveService)null);
    }
}
