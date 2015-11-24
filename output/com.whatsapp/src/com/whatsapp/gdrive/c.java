// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.gdrive;

class c implements Runnable
{
    final ak a;
    
    c(final ak a) {
        this.a = a;
    }
    
    @Override
    public void run() {
        GoogleDriveService.i();
    }
}
