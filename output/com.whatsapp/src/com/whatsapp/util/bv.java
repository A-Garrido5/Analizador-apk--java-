// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.util;

import android.text.Editable;
import android.content.DialogInterface;
import android.widget.EditText;
import android.widget.CheckBox;
import android.app.Activity;
import android.content.DialogInterface$OnClickListener;

final class bv implements DialogInterface$OnClickListener
{
    private static final String[] z;
    final Activity a;
    final CheckBox b;
    final CheckBox c;
    final EditText d;
    
    static {
        final String[] z2 = new String[2];
        String s = "\u0013%\n-V\"#\f";
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
                        c2 = '$';
                        break;
                    }
                    case 0: {
                        c2 = 'C';
                        break;
                    }
                    case 1: {
                        c2 = 'J';
                        break;
                    }
                    case 2: {
                        c2 = 'x';
                        break;
                    }
                    case 3: {
                        c2 = 'Y';
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
                    s = "\u000f+\u0016=W +\b<";
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
    
    bv(final EditText d, final CheckBox c, final CheckBox b, final Activity a) {
        this.d = d;
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public void onClick(final DialogInterface dialogInterface, final int n) {
        final Editable text = this.d.getText();
        Label_0042: {
            if (this.c.isChecked()) {
                b_.a(bv.z[0]);
                if (!Log.l) {
                    break Label_0042;
                }
            }
            b_.a(bv.z[1]);
        }
        b_.a(this.b.isChecked());
        b_.b((CharSequence)text, this.a);
    }
}
