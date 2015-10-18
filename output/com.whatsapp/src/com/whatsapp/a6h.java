// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import com.whatsapp.util.Log;
import com.whatsapp.util.a7;
import android.view.View;
import android.view.View$OnClickListener;

class a6h implements View$OnClickListener
{
    private static final String[] z;
    final ahh a;
    
    static {
        final String[] z2 = new String[2];
        String s = "4{U^\u00072{@Y\u0015+{\u001d^\u001a/j\u001dD\u0000'}Y\u0017";
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
                        c2 = 't';
                        break;
                    }
                    case 0: {
                        c2 = 'F';
                        break;
                    }
                    case 1: {
                        c2 = '\u001e';
                        break;
                    }
                    case 2: {
                        c2 = '2';
                        break;
                    }
                    case 3: {
                        c2 = '7';
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
                    s = "4{UY\u0015+{\u001f^\u001a/j";
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
    
    a6h(final ahh a) {
        this.a = a;
    }
    
    public void onClick(final View view) {
        Log.i(a6h.z[0] + a7.a());
        this.a.c.e(a6h.z[1]);
    }
}
