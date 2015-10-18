// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.gdrive;

import com.whatsapp.util.Log;
import android.content.DialogInterface;
import android.content.DialogInterface$OnClickListener;

class bm implements DialogInterface$OnClickListener
{
    private static final String z;
    final g a;
    
    static {
        final char[] charArray = "x\u0006i\rVzOz\u0007Tv\u0014r\u0010Y0\ru\u0001\rk\u000bv\u0001\rl\u0007o\u0011P?\ftDGp\r|\bE?\u0006i\rVzBy\u0005Ct\u0017k\u0017\u0000y\rn\nD?\u0003u\u0000\u0000j\u0011~\u0016\u0000v\u0011;\nOkBr\nTz\u0010~\u0017Tz\u0006;\rN?\u0003\u007f\u0000Iq\u0005;\u0005N?\u0003x\u0007Oj\foDFp\u0010;\u0010H~\u0016;\u0001Ik\n~\u0016\u000e".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = ' ';
                    break;
                }
                case 0: {
                    c2 = '\u001f';
                    break;
                }
                case 1: {
                    c2 = 'b';
                    break;
                }
                case 2: {
                    c2 = '\u001b';
                    break;
                }
                case 3: {
                    c2 = 'd';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z = new String(charArray).intern();
    }
    
    bm(final g a) {
        this.a = a;
    }
    
    public void onClick(final DialogInterface dialogInterface, final int n) {
        Log.i(bm.z);
        GoogleDriveActivity.a(this.a.b);
        this.a.b.setResult(1);
    }
}
