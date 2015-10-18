// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.gdrive;

import android.os.Binder;

public final class bw extends Binder
{
    final GoogleDriveService a;
    
    public bw(final GoogleDriveService a) {
        this.a = a;
    }
    
    public final GoogleDriveService a() {
        return this.a;
    }
}
