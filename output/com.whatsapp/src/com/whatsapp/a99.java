// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.os.AsyncTask;
import com.whatsapp.util.Log;
import android.view.View;
import android.view.View$OnClickListener;

class a99 implements View$OnClickListener
{
    private static final String[] z;
    final VerifySms a;
    
    static {
        final String[] z2 = new String[3];
        String s = "\u00066H> \t%U>%\u0015|H27\u00056I#i\u00130\u0007";
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
                        c2 = 'F';
                        break;
                    }
                    case 0: {
                        c2 = 'p';
                        break;
                    }
                    case 1: {
                        c2 = 'S';
                        break;
                    }
                    case 2: {
                        c2 = ':';
                        break;
                    }
                    case 3: {
                        c2 = 'W';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "_=O:$\u0015!\u0007";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    n2 = 2;
                    array = z2;
                    s = "\u00066H> \t%U>%\u0015|H22\u0002*L24\u00195C";
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
    
    a99(final VerifySms a) {
        this.a = a;
    }
    
    public void onClick(final View view) {
        final boolean i = App.I;
        if (VerifySms.i() == 11) {
            Log.i(a99.z[2]);
            final String replace = VerifySms.j(this.a).getText().toString().replace(Character.toString(' '), "").replace(Character.toString('-'), "");
            Label_0134: {
                if (VerifySms.c(this.a, replace)) {
                    VerifySms.u(this.a).setText((CharSequence)this.a.getString(2131231890));
                    a8s.a(new asi(this.a), new String[] { replace });
                    if (!i) {
                        break Label_0134;
                    }
                }
                if (!this.a.isFinishing()) {
                    this.a.showDialog(33);
                }
            }
            if (!i) {
                return;
            }
        }
        Log.i(a99.z[0] + VerifySms.e(this.a) + a99.z[1] + VerifySms.y(this.a));
        a8s.a(new hq(this.a), new String[0]);
    }
}
