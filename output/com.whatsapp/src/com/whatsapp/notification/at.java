// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.notification;

import java.util.Arrays;
import java.util.List;
import com.whatsapp.DialogToastActivity;
import android.content.Intent;

public class at extends ao
{
    private static final String[] z;
    
    static {
        final String[] z2 = new String[6];
        String s = "&U52w\u001bW> |0";
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
                        c2 = '\u0012';
                        break;
                    }
                    case 0: {
                        c2 = 'D';
                        break;
                    }
                    case 1: {
                        c2 = '4';
                        break;
                    }
                    case 2: {
                        c2 = 'Q';
                        break;
                    }
                    case 3: {
                        c2 = 'U';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "&U52w\u001bW> |0k29s7G\u000e;s)Q";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "&U52w\u001bW> |0k!4q/U60M*U<0";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "%Z5'}-P\u007f<|0Q?!<%W%<}*\u001a\u0013\u0014V\u0003q\u000e\u0016]\u0011z\u0005\nG\u0014p\u0010\u0001W";
                    n2 = 3;
                    array = z2;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    s = "'[<{~#Q\u007f9s1Z2=w6\u0006";
                    n2 = 4;
                    array = z2;
                    n = 3;
                    continue;
                }
                case 3: {
                    array[n2] = intern;
                    n2 = 5;
                    array = z2;
                    s = "'[<{~#Q\u007f9s1Z2=w6";
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
        final Intent intent = new Intent(at.z[3]);
        intent.putExtra(at.z[0], n);
        intent.putExtra(at.z[2], this.a());
        intent.putExtra(at.z[1], this.d());
        this.c().sendBroadcast(intent);
        if (DialogToastActivity.h) {
            boolean b2 = false;
            if (!b) {
                b2 = true;
            }
            ao.b = b2;
        }
    }
    
    @Override
    public List b() {
        return Arrays.asList(at.z[5], at.z[4]);
    }
}
