// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.os.Environment;
import android.content.DialogInterface;
import android.content.DialogInterface$OnClickListener;

class aqa implements DialogInterface$OnClickListener
{
    private static final String[] z;
    final pr a;
    
    static {
        final String[] z2 = new String[2];
        String s = "d|\r\",lw";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0087:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = 'X';
                        break;
                    }
                    case 0: {
                        c2 = '\t';
                        break;
                    }
                    case 1: {
                        c2 = '\u0013';
                        break;
                    }
                    case 2: {
                        c2 = 'x';
                        break;
                    }
                    case 3: {
                        c2 = 'L';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    n2 = 1;
                    array = z2;
                    s = "d|\r\",lw'>7";
                    n = 0;
                    continue;
                }
                case 0: {
                    break Label_0087;
                }
            }
        }
        array[n2] = intern;
        z = z2;
    }
    
    aqa(final pr a) {
        this.a = a;
    }
    
    public void onClick(final DialogInterface dialogInterface, final int n) {
        pr.a(this.a).removeDialog(107);
        final String externalStorageState = Environment.getExternalStorageState();
        if (!externalStorageState.equals(aqa.z[0]) && !externalStorageState.equals(aqa.z[1])) {
            pr.a(this.a).showDialog(107);
            if (!App.I) {
                return;
            }
        }
        this.a.a();
    }
}
