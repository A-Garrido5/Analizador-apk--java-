// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.content.Intent;
import android.view.View;
import android.view.View$OnClickListener;

class ato implements View$OnClickListener
{
    private static final String[] z;
    final ViewSharedContactActivity a;
    
    static {
        final String[] z2 = new String[3];
        String s = "AB,M\u0005\u001eZ(\\\u001f";
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
                        c2 = 'k';
                        break;
                    }
                    case 0: {
                        c2 = '1';
                        break;
                    }
                    case 1: {
                        c2 = '.';
                        break;
                    }
                    case 2: {
                        c2 = 'M';
                        break;
                    }
                    case 3: {
                        c2 = '$';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "P@)V\u0004XJcM\u0005EK#PEPM9M\u0004_\u0000\u001ea%u";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    n2 = 2;
                    array = z2;
                    s = "P@)V\u0004XJcM\u0005EK#PETV9V\n\u001fk\u0000e\"}";
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
    
    ato(final ViewSharedContactActivity a) {
        this.a = a;
    }
    
    public void onClick(final View view) {
        if (ViewSharedContactActivity.c(this.a)) {
            ViewSharedContactActivity.a(this.a, view);
            if (!App.I) {
                return;
            }
        }
        final String e = ((m)view.getTag()).e;
        final Intent intent = new Intent(ato.z[1]);
        intent.setType(ato.z[0]);
        intent.putExtra(ato.z[2], new String[] { e });
        this.a.startActivity(intent);
    }
}
