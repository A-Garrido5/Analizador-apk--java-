// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.gdrive;

import com.whatsapp.vp;
import de.greenrobot.event.m;

final class w
{
    w() {
        m.b().a(this);
    }
    
    public void onEventBackgroundThread(final vp vp) {
        if (GoogleDriveService.am()) {
            GoogleDriveService.M();
            GoogleDriveService.i();
        }
    }
}
