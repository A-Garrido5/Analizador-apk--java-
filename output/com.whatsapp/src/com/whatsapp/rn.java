// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.content.Intent;
import android.net.Uri;
import com.whatsapp.util.Log;
import android.content.DialogInterface;
import android.content.DialogInterface$OnClickListener;

class rn implements DialogInterface$OnClickListener
{
    private static final String[] z;
    final RegisterName a;
    
    static {
        final String[] z2 = new String[3];
        String s = "A,q=)I&;&(T'{;hA!a&)NlC\u0006\u0003w";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0110:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = 'F';
                        break;
                    }
                    case 0: {
                        c2 = ' ';
                        break;
                    }
                    case 1: {
                        c2 = 'B';
                        break;
                    }
                    case 2: {
                        c2 = '\u0015';
                        break;
                    }
                    case 3: {
                        c2 = 'O';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "H6a?5\u001am:\")B+y*hT5|;2E0;,)Mmb.\u0019S6t;3S";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    n2 = 2;
                    array = z2;
                    s = "R'r&5T'g!'M':+/A.z(iC#{;kC-{!#C6:-3T6z!iC*p,-S6t;3S";
                    n = 1;
                    continue;
                }
                case 1: {
                    break Label_0110;
                }
            }
        }
        array[n2] = intern;
        z = z2;
    }
    
    rn(final RegisterName a) {
        this.a = a;
    }
    
    public void onClick(final DialogInterface dialogInterface, final int n) {
        Log.i(rn.z[2]);
        this.a.removeDialog(109);
        this.a.startActivity(new Intent(rn.z[0], Uri.parse(rn.z[1])));
    }
}
