// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.gdrive;

class b1 implements bn
{
    final GoogleDriveService a;
    final boolean b;
    
    b1(final GoogleDriveService a, final boolean b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public void a(final long n) {
        if (this.b) {
            final long addAndGet = GoogleDriveService.i(this.a).addAndGet(n);
            if (n > 0L && (addAndGet & 0x2800L) == 0x2800L) {
                GoogleDriveService.d(this.a).l(GoogleDriveService.i(this.a).get(), GoogleDriveService.k(this.a));
            }
        }
    }
    
    @Override
    public boolean a() {
        return GoogleDriveService.e(this.a);
    }
}
