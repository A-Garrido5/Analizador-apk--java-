// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.content.pm.PackageManager$NameNotFoundException;
import com.whatsapp.util.ad;
import java.io.File;

class xf implements Runnable
{
    private static final String z;
    final App a;
    
    static {
        final char[] charArray = "\"A\u0010'\u0004-R\u0012m\n7TOi\u001b3S\u0015f\u000f/T".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = 'k';
                    break;
                }
                case 0: {
                    c2 = 'C';
                    break;
                }
                case 1: {
                    c2 = '1';
                    break;
                }
                case 2: {
                    c2 = '`';
                    break;
                }
                case 3: {
                    c2 = '\b';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z = new String(charArray).intern();
    }
    
    xf(final App a) {
        this.a = a;
    }
    
    @Override
    public void run() {
        try {
            ad.b(3, xf.z, new File(this.a.getPackageManager().getApplicationInfo(this.a.getPackageName(), 0).dataDir));
        }
        catch (PackageManager$NameNotFoundException ex) {
            throw new Error((Throwable)ex);
        }
    }
}
