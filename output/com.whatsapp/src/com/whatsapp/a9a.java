// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import com.whatsapp.util.Log;
import android.content.Context;

final class a9a implements Runnable
{
    private static final String[] z;
    final Context a;
    final String b;
    
    static {
        final String[] z2 = new String[3];
        String s = "Tu\u0005UoMd\u0011SQ\\q)BX]w\u001d";
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
                        c2 = '0';
                        break;
                    }
                    case 0: {
                        c2 = '8';
                        break;
                    }
                    case 1: {
                        c2 = '\u0014';
                        break;
                    }
                    case 2: {
                        c2 = 'v';
                        break;
                    }
                    case 3: {
                        c2 = '!';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "[{\u001b\u000fGPu\u0002RQHd)QB]r\u0013SUVw\u0013R";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    n2 = 2;
                    array = z2;
                    s = "Mz\u0017C\\]4\u0002N\u0010Jq\u0002SY]b\u0013\u0001B]y\u0019UU\u0018b\u0013SCQ{\u0018";
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
    
    a9a(final String b, final Context a) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public void run() {
        final boolean i = App.I;
        final String f = aah.f();
        Label_0112: {
            if (f.length() > 0) {
                final y a = y.a(this.b);
                if (a != null) {
                    final y a2 = y.a(f);
                    if (a2 != null) {
                        this.a.getSharedPreferences(a9a.z[1], 0).edit().putLong(a9a.z[0], System.currentTimeMillis()).commit();
                        Label_0128: {
                            switch (a.a(a2)) {
                                case -1: {
                                    aah.k();
                                    if (i) {
                                        break Label_0128;
                                    }
                                    break;
                                }
                                case 0:
                                case 1: {
                                    aah.g();
                                    break;
                                }
                            }
                        }
                        if (i) {
                            break Label_0112;
                        }
                    }
                }
                return;
            }
        }
        Log.e(a9a.z[2]);
    }
}
