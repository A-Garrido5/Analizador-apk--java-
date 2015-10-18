// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.gdrive;

import android.content.Context;
import android.text.format.Formatter;
import com.whatsapp.util.Log;

class f implements Runnable
{
    private static final String z;
    final long a;
    final int b;
    final long c;
    final a2 d;
    
    static {
        final char[] charArray = "M_z\u0012IO\u0016i\u0018KCMa\u000fF\u0007Tj\bZXMm\t\u0010GHo\bKEImV[ELf\u0017PK_%\u000bME\\z\u001eLY\u0001".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = '?';
                    break;
                }
                case 0: {
                    c2 = '*';
                    break;
                }
                case 1: {
                    c2 = ';';
                    break;
                }
                case 2: {
                    c2 = '\b';
                    break;
                }
                case 3: {
                    c2 = '{';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z = new String(charArray).intern();
    }
    
    f(final a2 d, final int b, final long c, final long a) {
        this.d = d;
        this.b = b;
        this.c = c;
        this.a = a;
    }
    
    @Override
    public void run() {
        GoogleDriveActivity.k(this.d.a).setProgress(this.b);
        Log.i(f.z + this.c + "/" + this.a + " " + this.b + "%");
        GoogleDriveActivity.h(this.d.a).setText((CharSequence)this.d.a.getString(2131232137, new Object[] { Formatter.formatShortFileSize((Context)this.d.a, this.c), Formatter.formatShortFileSize((Context)this.d.a, this.a), this.b }));
    }
}
