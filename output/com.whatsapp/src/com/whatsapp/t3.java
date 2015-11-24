// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.os.Environment;
import android.content.DialogInterface;
import android.content.DialogInterface$OnClickListener;

class t3 implements DialogInterface$OnClickListener
{
    private static final String[] z;
    final pr a;
    
    static {
        final String[] z2 = new String[2];
        String s = "JxwElBs]Yw";
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
                        c2 = '\u0018';
                        break;
                    }
                    case 0: {
                        c2 = '\'';
                        break;
                    }
                    case 1: {
                        c2 = '\u0017';
                        break;
                    }
                    case 2: {
                        c2 = '\u0002';
                        break;
                    }
                    case 3: {
                        c2 = '+';
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
                    s = "JxwElBs";
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
    
    t3(final pr a) {
        this.a = a;
    }
    
    public void onClick(final DialogInterface dialogInterface, final int n) {
        pr.a(this.a).removeDialog(102);
        final String externalStorageState = Environment.getExternalStorageState();
        if (!externalStorageState.equals(t3.z[1]) && !externalStorageState.equals(t3.z[0])) {
            pr.a(this.a).showDialog(102);
            if (!App.I) {
                return;
            }
        }
        this.a.a();
    }
}
