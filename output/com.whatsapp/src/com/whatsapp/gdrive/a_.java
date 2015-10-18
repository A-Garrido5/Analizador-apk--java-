// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.gdrive;

import android.os.IBinder;
import android.content.ComponentName;
import android.content.ServiceConnection;

class a_ implements ServiceConnection
{
    final GoogleDriveActivity a;
    
    a_(final GoogleDriveActivity a) {
        this.a = a;
    }
    
    public void onServiceConnected(final ComponentName componentName, final IBinder binder) {
        GoogleDriveActivity.a(this.a, ((bw)binder).a());
        GoogleDriveActivity.g(this.a).open();
        GoogleDriveActivity.e(this.a).a(GoogleDriveActivity.i(this.a));
    }
    
    public void onServiceDisconnected(final ComponentName componentName) {
        GoogleDriveActivity.e(this.a).b(GoogleDriveActivity.i(this.a));
        GoogleDriveActivity.a(this.a, (GoogleDriveService)null);
        GoogleDriveActivity.g(this.a).close();
    }
}
