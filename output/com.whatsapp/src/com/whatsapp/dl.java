// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.content.Context;
import com.whatsapp.util.Log;

final class dl implements Runnable
{
    private static final String[] z;
    
    static {
        final String[] z2 = new String[3];
        String s = ":\n$\u0005o<\f0\u0006j<\u0010j\u0019m*\u0012*\u0005{<M*\u0000(8\u000e7\u000ei=\u001be\b`8\f\"\u000elf";
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
                        c2 = '\b';
                        break;
                    }
                    case 0: {
                        c2 = 'Y';
                        break;
                    }
                    case 1: {
                        c2 = 'b';
                        break;
                    }
                    case 2: {
                        c2 = 'E';
                        break;
                    }
                    case 3: {
                        c2 = 'k';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = ":\n$\u0005o<\f0\u0006j<\u0010j\u0019m*\u0012*\u0005{<M*\u0000(6\u000e!V";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    n2 = 2;
                    array = z2;
                    s = "y\f \u001c5";
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
    
    @Override
    public void run() {
        final App$Me f = App.F();
        if (f != null) {
            ChangeNumber.e(f.jabber_id);
            Log.i(dl.z[1] + ChangeNumber.c() + dl.z[2] + App.aX.jabber_id);
            ChangeNumber.c(VerifyNumber.b(f.cc, f.number));
            ChangeNumber.e().sendEmptyMessage(7);
            al5.p();
            App.aX();
            ChangeNumber.c((Context)App.aq);
            if (!App.I) {
                return;
            }
        }
        Log.w(dl.z[0]);
        al5.p();
    }
}
