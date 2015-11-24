// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.gdrive;

class ab implements Runnable
{
    final boolean a;
    final a2 b;
    
    ab(final a2 b, final boolean a) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public void run() {
        GoogleDriveActivity.k(this.b.a).setProgress(100);
        GoogleDriveActivity.a(this.b.a, this.a);
    }
}
