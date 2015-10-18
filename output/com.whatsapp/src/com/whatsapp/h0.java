// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.widget.Toast;
import android.view.View;
import android.view.View$OnLongClickListener;

class h0 implements View$OnLongClickListener
{
    private static final String[] z;
    final LocationPicker a;
    
    static {
        final String[] z2 = new String[2];
        String s = "\u001dCS\u001c\u0001&Q^H\u0016!\u0014|\u0007\u0017<GK\u001d\u0003<Q";
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
                        c2 = 'b';
                        break;
                    }
                    case 0: {
                        c2 = 'N';
                        break;
                    }
                    case 1: {
                        c2 = '4';
                        break;
                    }
                    case 2: {
                        c2 = ':';
                        break;
                    }
                    case 3: {
                        c2 = 'h';
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
                    s = "\u001dCS\u001c\u0001&Q^H\u0016!\u0014}\u0007\r)X_";
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
    
    h0(final LocationPicker a) {
        this.a = a;
    }
    
    public boolean onLongClick(final View view) {
        LocationPicker.a(!LocationPicker.c());
        if (LocationPicker.c() || !App.aM()) {
            k_.b(1);
            Toast.makeText(this.a.getApplicationContext(), (CharSequence)h0.z[0], 1).show();
            if (!App.I) {
                return false;
            }
        }
        k_.b(2);
        Toast.makeText(this.a.getApplicationContext(), (CharSequence)h0.z[1], 1).show();
        return false;
    }
}
