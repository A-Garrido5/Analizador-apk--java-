// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.notification;

import java.util.Arrays;
import java.util.List;
import com.whatsapp.DialogToastActivity;
import android.content.Intent;

class aa extends ao
{
    private static final String[] z;
    
    static {
        final String[] z2 = new String[6];
        String s = "}C\u0005MAqB\u0011\u0006@wO\u001b\u0010]p\u0002\u0000\f_{";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0183:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = '2';
                        break;
                    }
                    case 0: {
                        c2 = '\u001e';
                        break;
                    }
                    case 1: {
                        c2 = ',';
                        break;
                    }
                    case 2: {
                        c2 = 'h';
                        break;
                    }
                    case 3: {
                        c2 = 'c';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "}C\u0005MAqB\u0011\u0006@wO\u001b\u0010]p\u0002\u0000\f_{\u0002\u0001\rF{B\u001cMWfX\u001a\u0002\u001c|M\f\u0004W0\u007f ,eAa-0a_k-";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "}C\u0005MAqB\u0011\u0006@wO\u001b\u0010]p\u0002\u0000\f_{\u0002\u0001\rF{B\u001cMWfX\u001a\u0002\u001c|M\f\u0004W0m+7{He<:mPm%&";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "}C\u0005MAqB\u0011\u0006@wO\u001b\u0010]p\u0002\u0000\f_{\u0002\t\u0000FwC\u0006MgNh)7wAn)'u[";
                    n2 = 3;
                    array = z2;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    s = "}C\u0005MAqB\u0011\u0006@wO\u001b\u0010]p\u0002\u0000\f_{\u0002\u0001\rF{B\u001cMWfX\u001a\u0002\u001c|M\f\u0004W0|) y_k-<|_a-";
                    n2 = 4;
                    array = z2;
                    n = 3;
                    continue;
                }
                case 3: {
                    array[n2] = intern;
                    n2 = 5;
                    array = z2;
                    s = "}C\u0005MAqB\u0011\u0006@wO\u001b\u0010]p\u0002\u0000\f_{\u0002\u0001\rF{B\u001cMWfX\u001a\u0002\u001c|M\f\u0004W0a-0a_k-";
                    n = 4;
                    continue;
                }
                case 4: {
                    break Label_0183;
                }
            }
        }
        array[n2] = intern;
        z = z2;
    }
    
    @Override
    public void a(final int n) {
        final boolean b = ao.b;
        final Intent intent = new Intent(aa.z[3]);
        intent.putExtra(aa.z[4], this.a());
        intent.putExtra(aa.z[2], this.d());
        intent.putExtra(aa.z[1], n > 0);
        intent.putExtra(aa.z[5], String.valueOf(n));
        this.c().sendBroadcast(intent);
        if (b) {
            final boolean h = DialogToastActivity.h;
            boolean h2 = false;
            if (!h) {
                h2 = true;
            }
            DialogToastActivity.h = h2;
        }
    }
    
    @Override
    public List b() {
        return Arrays.asList(aa.z[0]);
    }
}
