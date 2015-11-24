// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.gdrive;

import com.whatsapp.util.Log;
import android.content.DialogInterface;
import android.content.DialogInterface$OnClickListener;

class bv implements DialogInterface$OnClickListener
{
    private static final String z;
    final ai a;
    
    static {
        final char[] charArray = "\u000b\u007f,[\u001a\t6?Q\u0018\u0005m7F\u0015Ch6]\u001bAi;A\u0018\u0003i;\u0012\u0019\u001f~,\u0012\b\tx2[\u0002\t\u007f~F\u0003Li;A\u0018\u0003i;\u0012\u000e\rx5G\u001cL},]\u0001L".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = 'l';
                    break;
                }
                case 0: {
                    c2 = 'l';
                    break;
                }
                case 1: {
                    c2 = '\u001b';
                    break;
                }
                case 2: {
                    c2 = '^';
                    break;
                }
                case 3: {
                    c2 = '2';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z = new String(charArray).intern();
    }
    
    bv(final ai a) {
        this.a = a;
    }
    
    public void onClick(final DialogInterface dialogInterface, final int n) {
        Log.i(bv.z + a7.a(this.a.a));
        this.a.b.setResult(2);
        GoogleDriveActivity.a(this.a.b);
    }
}
