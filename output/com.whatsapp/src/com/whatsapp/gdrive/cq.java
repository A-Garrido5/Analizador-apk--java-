// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.gdrive;

class cq implements v
{
    long a;
    final GoogleDriveService b;
    final long c;
    
    cq(final GoogleDriveService b, final long c) {
        this.b = b;
        this.c = c;
        this.a = 0L;
    }
    
    @Override
    public void a(final long n) {
        this.a += n;
        if (n > 0L) {
            GoogleDriveService.d(this.b).i(this.a, this.c);
        }
    }
    
    @Override
    public boolean a() {
        return GoogleDriveService.c(this.b);
    }
}
