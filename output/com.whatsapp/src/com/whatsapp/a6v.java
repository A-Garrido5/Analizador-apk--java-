// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.content.Intent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView$OnItemClickListener;

class a6v implements AdapterView$OnItemClickListener
{
    private static final String[] z;
    final CountryPicker a;
    
    static {
        final String[] z2 = new String[3];
        String s = "i\u0014";
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
                        c2 = '\u0014';
                        break;
                    }
                    case 0: {
                        c2 = '\n';
                        break;
                    }
                    case 1: {
                        c2 = 'w';
                        break;
                    }
                    case 2: {
                        c2 = '\u001c';
                        break;
                    }
                    case 3: {
                        c2 = '\"';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "c\u0004s";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    n2 = 2;
                    array = z2;
                    s = "i\u0018iL`x\u000eCLug\u0012";
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
    
    a6v(final CountryPicker a) {
        this.a = a;
    }
    
    public void onItemClick(final AdapterView adapterView, final View view, final int n, final long n2) {
        try {
            final t6 t6 = (t6)adapterView.getItemAtPosition(n);
            final Intent intent = new Intent();
            intent.putExtra(a6v.z[2], t6.b);
            intent.putExtra(a6v.z[0], t6.a);
            intent.putExtra(a6v.z[1], t6.d);
            this.a.setResult(-1, intent);
            this.a.finish();
        }
        catch (IndexOutOfBoundsException ex) {}
    }
}
