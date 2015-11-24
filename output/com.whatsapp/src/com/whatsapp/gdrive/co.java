// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.gdrive;

import android.content.Context;
import android.content.Intent;

class co implements Runnable
{
    private static final String z;
    final GoogleDriveActivity a;
    
    static {
        final char[] charArray = "GT<P/Hh:\\3RX:\\".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = '@';
                    break;
                }
                case 0: {
                    c2 = '&';
                    break;
                }
                case 1: {
                    c2 = '7';
                    break;
                }
                case 2: {
                    c2 = 'H';
                    break;
                }
                case 3: {
                    c2 = '9';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z = new String(charArray).intern();
    }
    
    co(final GoogleDriveActivity a) {
        this.a = a;
    }
    
    @Override
    public void run() {
        GoogleDriveActivity.g(this.a).block();
        final Intent intent = new Intent((Context)this.a, (Class)GoogleDriveService.class);
        intent.setAction(co.z);
        this.a.startService(intent);
    }
}
