// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.widget.Toast;
import android.view.View;
import android.view.View$OnLongClickListener;

class ib implements View$OnLongClickListener
{
    private static final String[] z;
    final LocationPicker2 a;
    
    static {
        final String[] z2 = new String[3];
        String s = "]Wu(VfEx|Aa\u0000Z=VkBs3^";
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
                        c2 = '5';
                        break;
                    }
                    case 0: {
                        c2 = '\u000e';
                        break;
                    }
                    case 1: {
                        c2 = ' ';
                        break;
                    }
                    case 2: {
                        c2 = '\u001c';
                        break;
                    }
                    case 3: {
                        c2 = '\\';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "]Wu(VfEx|Aa\u0000[3ZiLy";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    n2 = 2;
                    array = z2;
                    s = "]Wu(VfEx|Aa\u0000Z3@|Sm)T|E";
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
    
    ib(final LocationPicker2 a) {
        this.a = a;
    }
    
    public boolean onLongClick(final View view) {
        final boolean i = App.I;
        Label_0150: {
            switch (LocationPicker2.w(this.a)) {
                case 1: {
                    LocationPicker2.b(this.a, 2);
                    k_.b(1);
                    k_.b(3);
                    Toast.makeText(this.a.getApplicationContext(), (CharSequence)ib.z[2], 1).show();
                    if (i) {
                        break Label_0150;
                    }
                    break;
                }
                case 2: {
                    LocationPicker2.b(this.a, 3);
                    k_.b(1);
                    k_.b(2);
                    Toast.makeText(this.a.getApplicationContext(), (CharSequence)ib.z[0], 1).show();
                    if (i) {
                        break Label_0150;
                    }
                    break;
                }
                case 3: {
                    LocationPicker2.b(this.a, 1);
                    k_.b(2);
                    k_.b(3);
                    Toast.makeText(this.a.getApplicationContext(), (CharSequence)ib.z[1], 1).show();
                    break;
                }
            }
        }
        LocationPicker2.c(this.a, false);
        LocationPicker2.a(this.a, LocationPicker2.f(this.a), LocationPicker2.r(this.a), null, false);
        return false;
    }
}
