// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.gdrive;

import com.whatsapp.util.Log;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.io.File;
import java.util.concurrent.CountDownLatch;

class aj implements Runnable
{
    private static final String z;
    final CountDownLatch a;
    final File b;
    final String c;
    final AtomicBoolean d;
    final boolean e;
    final GoogleDriveService f;
    final List g;
    final String h;
    
    static {
        final char[] charArray = "\u007f?E\u0004B}vD\bFn2T\b\u001b\u007f>C@Rq7R\u001e\u0019l4\u001a\u000fQ5?X\u001aZt4V\tQ|{E\bW}2A\bP8s\u0012\u001e\u00188~DD\u0014~)X\u0000\u0014\u007f?E\u0004B}{Q\u0004X}{Z\fD8,_\u0004Wp{S\u0002Qk{Y\u0002@8>O\u0004Glu".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = '4';
                    break;
                }
                case 0: {
                    c2 = '\u0018';
                    break;
                }
                case 1: {
                    c2 = '[';
                    break;
                }
                case 2: {
                    c2 = '7';
                    break;
                }
                case 3: {
                    c2 = 'm';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z = new String(charArray).intern();
    }
    
    aj(final GoogleDriveService f, final AtomicBoolean d, final boolean e, final File b, final String h, final String c, final List g, final CountDownLatch a) {
        this.f = f;
        this.d = d;
        this.e = e;
        this.b = b;
        this.h = h;
        this.c = c;
        this.g = g;
        this.a = a;
    }
    
    @Override
    public void run() {
        final int f = GoogleDriveService.F;
        try {
            if (!GoogleDriveService.h(this.f)) {
                this.d.set(false);
                return;
            }
            if (!this.e && this.b.exists() && this.b.length() > 0L) {
                return;
            }
            Label_0191: {
                switch (GoogleDriveService.g(this.f).a(this.b.getAbsolutePath(), this.h)) {
                    case 3: {
                        GoogleDriveService.j(this.f).f = 0.0;
                        if (f != 0) {
                            break Label_0191;
                        }
                        break;
                    }
                    case 2: {
                        Log.e(String.format(aj.z, this.c, this.h));
                        if (f != 0) {
                            break Label_0191;
                        }
                        break;
                    }
                    case 1:
                    case 4: {
                        this.g.add(this.c);
                        break;
                    }
                }
            }
        }
        finally {
            this.a.countDown();
        }
    }
}
