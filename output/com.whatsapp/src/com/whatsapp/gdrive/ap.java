// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.gdrive;

import com.whatsapp.util.Log;
import java.io.File;
import java.util.concurrent.CountDownLatch;
import java.util.List;

class ap implements Runnable
{
    private static final String z;
    final List a;
    final GoogleDriveService b;
    final boolean c;
    final CountDownLatch d;
    final File e;
    
    static {
        final char[] charArray = "s%\u0005\u0005uql\u0004\tqb(\u0014\t,s$\u0003Ae}-\u0012\u001f.r.\u0005Avd-\u0018\rg4'\u001e\u0000fA1\u001b\u0003bp\u0011\u0016\u0018k4(\u0004L&gmW\njx$>\b#}2WIp8a\u0011\u0005oq\u0012\u0003\rwa2W\u0005p4d\u0004B".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = '\u0003';
                    break;
                }
                case 0: {
                    c2 = '\u0014';
                    break;
                }
                case 1: {
                    c2 = 'A';
                    break;
                }
                case 2: {
                    c2 = 'w';
                    break;
                }
                case 3: {
                    c2 = 'l';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z = new String(charArray).intern();
    }
    
    ap(final GoogleDriveService b, final File e, final List a, final boolean c, final CountDownLatch d) {
        this.b = b;
        this.e = e;
        this.a = a;
        this.c = c;
        this.d = d;
    }
    
    @Override
    public void run() {
        final String b = a7.b(this.e.getAbsolutePath());
        try {
            final String a = GoogleDriveService.a(this.b, b);
            if (!GoogleDriveService.e(this.b)) {
                return;
            }
            final int a2 = GoogleDriveService.g(this.b).a(this.e.getAbsolutePath(), a);
            if (a2 != 3) {
                Log.i(String.format(ap.z, b, a, a2));
                this.a.add(this.e);
            }
            GoogleDriveService.l(this.b).addAndGet(this.e.length());
            if (GoogleDriveService.O() && this.c) {
                GoogleDriveService.d(this.b).a(GoogleDriveService.l(this.b).get(), GoogleDriveService.m(this.b));
            }
        }
        finally {
            this.d.countDown();
        }
    }
}
