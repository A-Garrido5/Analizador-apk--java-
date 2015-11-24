// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import com.whatsapp.util.Log;
import android.content.Intent;
import android.content.Context;
import android.content.BroadcastReceiver;

class VerifySms$1 extends BroadcastReceiver
{
    private static final String[] z;
    final VerifySms a;
    
    static {
        final String[] z2 = new String[15];
        String s = " \u0003\t&#/\u0015\u0016<j#\b\b*+\"";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0407:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = 'E';
                        break;
                    }
                    case 0: {
                        c2 = 'V';
                        break;
                    }
                    case 1: {
                        c2 = 'f';
                        break;
                    }
                    case 2: {
                        c2 = '{';
                        break;
                    }
                    case 3: {
                        c2 = 'O';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "3\u0014\t 7\u0015\t\u001f*";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "%\u0003\u0017)h%\u0003\u0015+h9\u0013\u000fb*0K\u0018= 2\u000f\u000f<";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = " \u0003\t&#/\u0015\u0016<j%\u0003\u0015;h$\u0003\u0018*, \u0003\t`73\u0015\u000e#1v";
                    n2 = 3;
                    array = z2;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    s = " \u0003\t&#/\u0015\u0016<j%\u0003\u0015;h$\u0003\u0018*, \u0003\t` $\u0014\u0014=e";
                    n2 = 4;
                    array = z2;
                    n = 3;
                    continue;
                }
                case 3: {
                    array[n2] = intern;
                    n2 = 5;
                    array = z2;
                    s = "}SI~";
                    n = 4;
                    continue;
                }
                case 4: {
                    array[n2] = intern;
                    n2 = 6;
                    s = " \u0003\t&#/\u0015\u0016<j9\u0013\u000fb*0K\b*7 \u000f\u0018*";
                    n = 5;
                    array = z2;
                    continue;
                }
                case 5: {
                    array[n2] = intern;
                    n2 = 7;
                    s = "%\u0003\u0017)h%\u0003\u0015+h%\u0003\u0015+h0\u0007\u0012#0$\u0003";
                    n = 6;
                    array = z2;
                    continue;
                }
                case 6: {
                    array[n2] = intern;
                    n2 = 8;
                    s = "%\u0003\u0017)h%\u0003\u0015+h9\u0013\u000fb*0K\b*7 \u000f\u0018*";
                    n = 7;
                    array = z2;
                    continue;
                }
                case 7: {
                    array[n2] = intern;
                    n2 = 9;
                    s = " \u0003\t&#/\u0015\u0016<j9\u0013\u000fb*0K\u0018= 2\u000f\u000f<";
                    n = 8;
                    array = z2;
                    continue;
                }
                case 8: {
                    array[n2] = intern;
                    n2 = 10;
                    s = "}SI";
                    n = 9;
                    array = z2;
                    continue;
                }
                case 9: {
                    array[n2] = intern;
                    n2 = 11;
                    s = " \u0003\t&#/\u0015\u0016<j;\u0003\u0003&&9";
                    n = 10;
                    array = z2;
                    continue;
                }
                case 10: {
                    array[n2] = intern;
                    n2 = 12;
                    s = " \u0003\t&#/\u0015\u0016<j$\u0007\u001f&*{\t\u001d)";
                    n = 11;
                    array = z2;
                    continue;
                }
                case 11: {
                    array[n2] = intern;
                    n2 = 13;
                    s = " \u0003\t&#/\u0015\u0016<j%\u0003\u0015;h$\u0003\u0018*, \u0003\t`!3\u0015\u000f=*/\u0003\u001f";
                    n = 12;
                    array = z2;
                    continue;
                }
                case 12: {
                    array[n2] = intern;
                    n2 = 14;
                    s = " \u0003\t&#/\u0015\u0016<j%\u0003\u0015;h$\u0003\u0018*, \u0003\t`,8\u0012\u001e!1";
                    n = 13;
                    array = z2;
                    continue;
                }
                case 13: {
                    break Label_0407;
                }
            }
        }
        array[n2] = intern;
        z = z2;
    }
    
    VerifySms$1(final VerifySms a) {
        this.a = a;
    }
    
    public void onReceive(final Context context, final Intent intent) {
        final boolean i = App.I;
        Log.i(VerifySms$1.z[14]);
        if (!this.a.P) {
            final int resultCode = this.getResultCode();
            Log.i(VerifySms$1.z[3] + resultCode);
            Label_0192: {
                if (resultCode != -1) {
                    final int intExtra = intent.getIntExtra(VerifySms$1.z[1], 0);
                    Log.i(VerifySms$1.z[4] + intExtra);
                    VerifySms.t(this.a);
                    Label_0239: {
                        switch (resultCode) {
                            case 4: {
                                Log.i(VerifySms$1.z[6]);
                                this.a.c(VerifySms$1.z[8]);
                                VerifySms.g(this.a);
                                if (i) {
                                    break Label_0239;
                                }
                                break Label_0192;
                            }
                            case 2: {
                                Log.i(VerifySms$1.z[12]);
                                VerifySms.j(7);
                                VerifySms.k(this.a);
                                this.a.e(7);
                                if (i) {
                                    break;
                                }
                                break Label_0192;
                            }
                        }
                    }
                    Label_0309: {
                        switch (intExtra) {
                            case 16: {
                                Log.i(VerifySms$1.z[9]);
                                this.a.c(VerifySms$1.z[2]);
                                VerifySms.g(this.a);
                                if (i) {
                                    break Label_0309;
                                }
                                break Label_0192;
                            }
                            case 98: {
                                if (!VerifySms.c().startsWith(VerifySms$1.z[10]) || VerifySms.c().startsWith(VerifySms$1.z[5])) {
                                    break;
                                }
                                Log.i(VerifySms$1.z[11]);
                                VerifySms.j(6);
                                VerifySms.k(this.a);
                                this.a.e(4);
                                if (i) {
                                    break;
                                }
                                break Label_0192;
                            }
                        }
                    }
                    Log.w(VerifySms$1.z[0]);
                    this.a.c(VerifySms$1.z[7]);
                    VerifySms.g(this.a);
                }
            }
            if (!i) {
                return;
            }
        }
        Log.i(VerifySms$1.z[13]);
    }
}
