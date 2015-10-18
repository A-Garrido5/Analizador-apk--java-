// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.content.Intent;
import android.content.DialogInterface;
import android.content.DialogInterface$OnClickListener;

class al2 implements DialogInterface$OnClickListener
{
    private static final String[] z;
    final Main a;
    
    static {
        final String[] z2 = new String[2];
        String s = "\u0014\u0013Edh\u0016\u0002Aan\u001bLCfe[\u0002[ls\u001a\nQ&q\u0014\u0000^if\u0010NTzb\u001d\nCm";
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
                        c2 = '\u0001';
                        break;
                    }
                    case 0: {
                        c2 = 'u';
                        break;
                    }
                    case 1: {
                        c2 = 'c';
                        break;
                    }
                    case 2: {
                        c2 = '5';
                        break;
                    }
                    case 3: {
                        c2 = '\b';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "\u0014\rQzn\u001c\u0007\u001bao\u0001\u0006[|/\u0014\u0000Aan\u001bMcAD\"";
                    n2 = 1;
                    array = z2;
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
    
    al2(final Main a) {
        this.a = a;
    }
    
    public void onClick(final DialogInterface dialogInterface, final int n) {
        final Intent intent = new Intent(al2.z[1]);
        intent.setDataAndType(Main.a(this.a), al2.z[0]);
        this.a.startActivity(intent);
        this.a.removeDialog(0);
        this.a.finish();
    }
}
