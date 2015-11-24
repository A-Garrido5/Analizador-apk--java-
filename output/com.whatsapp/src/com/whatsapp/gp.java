// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.content.DialogInterface;
import android.app.Activity;
import android.widget.CheckBox;
import java.util.Collection;
import android.content.DialogInterface$OnClickListener;

final class gp implements DialogInterface$OnClickListener
{
    private static final String[] z;
    final Collection a;
    final yk b;
    final boolean c;
    final int d;
    final CheckBox e;
    final Activity f;
    
    static {
        final String[] z2 = new String[2];
        String s = "nRi\u001b\u0006e\\pF\u0010}M[E\u0003h[aG\u0014c^aF";
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
                        c2 = 'q';
                        break;
                    }
                    case 0: {
                        c2 = '\r';
                        break;
                    }
                    case 1: {
                        c2 = '=';
                        break;
                    }
                    case 2: {
                        c2 = '\u0004';
                        break;
                    }
                    case 3: {
                        c2 = '5';
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
                    s = "}OaS.iXhP\u0005hbiP\u0015d\\";
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
    
    gp(final Activity f, final int d, final CheckBox e, final boolean c, final Collection a, final yk b) {
        this.f = f;
        this.d = d;
        this.e = e;
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public void onClick(final DialogInterface dialogInterface, final int n) {
        this.f.removeDialog(this.d);
        final boolean b = this.e != null && this.e.isChecked();
        if (b != this.c) {
            App.aq.getSharedPreferences(gp.z[0], 0).edit().putBoolean(gp.z[1], b).commit();
        }
        App.a(this.a, b);
        Label_0175: {
            if (this.a.size() == 1) {
                App.a(this.f.getBaseContext(), 2131231320, 0);
                if (!App.I) {
                    break Label_0175;
                }
            }
            App.a(this.f.getBaseContext(), String.format(App.C.a(2131296277, this.a.size()), this.a.size()), 0);
        }
        this.b.a();
    }
}
