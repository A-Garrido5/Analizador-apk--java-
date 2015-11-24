// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.gdrive;

import com.whatsapp.util.Log;
import android.content.DialogInterface;
import android.content.DialogInterface$OnClickListener;

class b6 implements DialogInterface$OnClickListener
{
    private static final String z;
    final GoogleDriveActivity a;
    
    static {
        final char[] charArray = "Q\u001abX\u001cSSqR\u001e_\byE\u0013\u0019\u0013cVGD\u001bcE\u0005D\u001b=W\u0003X\u0017cYF\u0016)y\u001c,_^e_\u000b@\u001fy]\u000bT\u0012u\u0011\u000bX\u001a0D\u0019S\f0P\rD\u001buUJB\u00110C\u000fE\n\u007fC\u000f\u0016\u0013uU\u0003W^\u007f_JU\u001b|]\u001fZ\u001fb\u001f".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = 'j';
                    break;
                }
                case 0: {
                    c2 = '6';
                    break;
                }
                case 1: {
                    c2 = '~';
                    break;
                }
                case 2: {
                    c2 = '\u0010';
                    break;
                }
                case 3: {
                    c2 = '1';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z = new String(charArray).intern();
    }
    
    b6(final GoogleDriveActivity a) {
        this.a = a;
    }
    
    public void onClick(final DialogInterface dialogInterface, final int n) {
        Log.i(b6.z);
        GoogleDriveService.a(1);
        GoogleDriveActivity.f(this.a);
        this.a.setResult(3);
        this.a.finish();
    }
}
