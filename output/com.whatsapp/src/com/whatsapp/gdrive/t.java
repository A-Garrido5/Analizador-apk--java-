// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.gdrive;

class t implements v
{
    long a;
    final GoogleDriveService b;
    
    t(final GoogleDriveService b) {
        this.b = b;
        this.a = 0L;
    }
    
    @Override
    public void a(final long n) {
        GoogleDriveService.o(this.b).addAndGet(n);
        if (n > 0L) {
            GoogleDriveService.d(this.b).a(GoogleDriveService.o(this.b).get(), GoogleDriveService.p(this.b).get(), GoogleDriveService.f(this.b));
        }
    }
    
    @Override
    public boolean a() {
        return GoogleDriveService.h(this.b);
    }
}
