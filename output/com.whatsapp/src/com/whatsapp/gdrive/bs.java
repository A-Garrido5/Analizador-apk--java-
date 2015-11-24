// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.gdrive;

import android.content.Context;
import android.content.Intent;

class bs implements Runnable
{
    private static final String z;
    final k a;
    
    static {
        final char[] charArray = "[N%2\u0010Tr#>\fNB#>".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = '\u007f';
                    break;
                }
                case 0: {
                    c2 = ':';
                    break;
                }
                case 1: {
                    c2 = '-';
                    break;
                }
                case 2: {
                    c2 = 'Q';
                    break;
                }
                case 3: {
                    c2 = '[';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z = new String(charArray).intern();
    }
    
    bs(final k a) {
        this.a = a;
    }
    
    @Override
    public void run() {
        GoogleDriveActivity.g(this.a.a).block();
        GoogleDriveService.h(this.a.d);
        GoogleDriveService.b(this.a.d, this.a.c.d().h());
        GoogleDriveService.a(this.a.d, this.a.c.b());
        GoogleDriveActivity.e(this.a.a).a(this.a.e);
        GoogleDriveActivity.e(this.a.a).a(this.a.c);
        GoogleDriveActivity.e(this.a.a).c(this.a.b.c);
        GoogleDriveActivity.a(this.a.a, this.a.c);
        final Intent intent = new Intent((Context)this.a.a, (Class)GoogleDriveService.class);
        intent.setAction(bs.z);
        this.a.a.startService(intent);
    }
}
