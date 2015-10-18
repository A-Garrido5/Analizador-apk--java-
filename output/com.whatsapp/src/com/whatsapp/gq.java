// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import java.io.IOException;
import com.whatsapp.util.Log;
import android.os.Handler;

final class gq implements Runnable
{
    private static final String z;
    final Handler a;
    
    static {
        final char[] charArray = "(\u001aV`\u000em\u001bEy\u0015#\u000f\u0004|\b,\u001cM|\b$\u000bW/\u001a$\u0004A".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = '|';
                    break;
                }
                case 0: {
                    c2 = 'M';
                    break;
                }
                case 1: {
                    c2 = 'h';
                    break;
                }
                case 2: {
                    c2 = '$';
                    break;
                }
                case 3: {
                    c2 = '\u000f';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z = new String(charArray).intern();
    }
    
    gq(final Handler a) {
        this.a = a;
    }
    
    @Override
    public void run() {
        while (true) {
            try {
                atd.c();
                this.a.postDelayed((Runnable)this, 900000L);
            }
            catch (IOException ex) {
                Log.b(gq.z, ex);
                continue;
            }
            break;
        }
    }
}
