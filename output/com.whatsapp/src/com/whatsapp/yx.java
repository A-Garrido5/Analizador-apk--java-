// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import java.util.Iterator;
import android.content.Context;
import java.util.Hashtable;
import com.whatsapp.protocol.bi;
import com.whatsapp.util.Log;
import android.os.Message;
import android.os.Looper;
import android.os.Handler;

final class yx extends Handler
{
    private static final String[] z;
    
    static {
        final String[] z2 = new String[8];
        String s = "\u0012*\u0016[g\u0018?\u000b\u0001\u007f\u00146\u001dBr*?\u000bAb\u0005;\u0011Oc*+\fL}\u0010;\rqt\u001d9\u0017Ir";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0232:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = '\u0017';
                        break;
                    }
                    case 0: {
                        c2 = 'u';
                        break;
                    }
                    case 1: {
                        c2 = 'X';
                        break;
                    }
                    case 2: {
                        c2 = 'y';
                        break;
                    }
                    case 3: {
                        c2 = '.';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "\u0012*\u0016[g\u0018?\u000b\u0001e\u00105\u0016XrX9\u001dC~\u001b+VKe\u00077\u000b\u0001";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "\u0012*\u0016[g\u0018?\u000b\u0001e\u00105\u0016XrX(\u0018\\c\u001c;\u0010^v\u001b,VKe\u00077\u000b\u0001";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "\u0012*\u0016[g\u0018?\u000b\u0001v\u0011<T^v\u0007,\u0010M~\u00059\u0017Z8\u0010*\u000bAeZ";
                    n2 = 3;
                    array = z2;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    s = "\u0012*\u0016[g\u0018?\u000b\u0001\u007f\u00146\u001dBrX1\u0017GcX?\u000bAb\u0005u\u001aFv\u0001";
                    n2 = 4;
                    array = z2;
                    n = 3;
                    continue;
                }
                case 3: {
                    array[n2] = intern;
                    n2 = 5;
                    array = z2;
                    s = "\u0012*\u0016[g\u0018?\u000b\u0001v\u0011<TOs\u00181\u0017]8\u0010*\u000bAeZ";
                    n = 4;
                    continue;
                }
                case 4: {
                    array[n2] = intern;
                    n2 = 6;
                    s = "\u0012*\u0016[g\u0018?\u000b\u0001\u007f\u00146\u001dBr*9\u001dJH\u0012*\u0016[g\u00160\u0018ZH\u0018+\u001e";
                    n = 5;
                    array = z2;
                    continue;
                }
                case 5: {
                    array[n2] = intern;
                    n2 = 7;
                    s = "\u0012*\u0016[g\u0018?\u000b\u0001t\u001a6\u000fKe\u00069\rGx\u001b+VBr\u0014.\u001c\u000ep\u00077\f^";
                    n = 6;
                    array = z2;
                    continue;
                }
                case 6: {
                    break Label_0232;
                }
            }
        }
        array[n2] = intern;
        z = z2;
    }
    
    yx(final Looper looper) {
        super(looper);
    }
    
    public void handleMessage(final Message message) {
        final boolean i = App.I;
        Label_1939: {
            switch (message.what) {
                case 0: {
                    Log.i(yx.z[4]);
                    App.ak.g((bi)message.obj);
                    if (i) {
                        break Label_1939;
                    }
                    break;
                }
                case 1: {
                    Log.i(yx.z[6]);
                    final bi bi = (bi)message.obj;
                    App.ak.g(bi);
                    GroupChatInfo.k(bi.a.a);
                    if (i) {
                        break Label_1939;
                    }
                    break;
                }
                case 2: {
                    GroupChatInfo.k((String)message.obj);
                    Log.i(yx.z[7]);
                    if (i) {
                        break Label_1939;
                    }
                    break;
                }
                case 3: {
                    Log.i(yx.z[0]);
                    final bi bi2 = (bi)message.obj;
                    App.ak.g(bi2);
                    GroupChatInfo.k(bi2.a.a);
                    if (i) {
                        break Label_1939;
                    }
                    break;
                }
                case 4: {
                    GroupChatInfo.k((String)message.obj);
                    if (i) {
                        break Label_1939;
                    }
                    break;
                }
                case 5: {
                    App.a(App.aq.getApplicationContext(), App.aq.getString(2131231116, new Object[] { App.S.c((String)message.obj).t }), 0);
                    if (i) {
                        break Label_1939;
                    }
                    break;
                }
                case 8: {
                    App.a(App.aq.getApplicationContext(), App.aq.getString(2131231116, new Object[] { App.S.c((String)message.obj).t }), 0);
                    if (i) {
                        break Label_1939;
                    }
                    break;
                }
                case 6: {
                    GroupChatInfo.k((String)message.obj);
                    App.a(App.aq.getApplicationContext(), App.aq.getString(2131231113), 0);
                    if (i) {
                        break Label_1939;
                    }
                    break;
                }
                case 7: {
                    GroupChatInfo.k((String)message.obj);
                    App.a(App.aq.getApplicationContext(), App.aq.getString(2131231118), 0);
                    if (i) {
                        break Label_1939;
                    }
                    break;
                }
                case 9: {
                    GroupChatInfo.k((String)message.obj);
                    App.a(App.aq.getApplicationContext(), App.aq.getString(2131231113), 0);
                    if (i) {
                        break Label_1939;
                    }
                    break;
                }
                case 10: {
                    GroupChatInfo.k((String)message.obj);
                    App.a(App.aq.getApplicationContext(), App.aq.getString(2131231118), 0);
                    if (i) {
                        break Label_1939;
                    }
                    break;
                }
                case 11: {
                    GroupChatInfo.k((String)message.obj);
                    App.a(App.aq.getApplicationContext(), App.aq.getString(2131231790), 0);
                    if (i) {
                        break Label_1939;
                    }
                    break;
                }
                case 12: {
                    App.b(App.aq.getApplicationContext(), App.aq.getResources().getString(2131231187, new Object[] { (String)message.obj }), 0);
                    if (i) {
                        break Label_1939;
                    }
                    break;
                }
                case 13: {
                    App.b(App.aq.getApplicationContext(), App.aq.getResources().getString(2131231189, new Object[] { (String)message.obj }), 0);
                    if (i) {
                        break Label_1939;
                    }
                    break;
                }
                case 14: {
                    App.b(App.aq.getApplicationContext(), App.aq.getResources().getString(2131231188, new Object[] { (String)message.obj }), 0);
                    if (i) {
                        break Label_1939;
                    }
                    break;
                }
                case 15: {
                    App.b(App.aq.getApplicationContext(), App.aq.getResources().getString(2131231198), 0);
                    if (i) {
                        break Label_1939;
                    }
                    break;
                }
                case 16: {
                    App.b(App.aq.getApplicationContext(), App.aq.getResources().getString(2131231200), 0);
                    if (i) {
                        break Label_1939;
                    }
                    break;
                }
                case 17: {
                    App.b(App.aq.getApplicationContext(), App.aq.getResources().getString(2131231201), 0);
                    if (i) {
                        break Label_1939;
                    }
                    break;
                }
                case 18: {
                    App.b(App.aq.getApplicationContext(), App.aq.getResources().getString(2131231199), 0);
                    if (i) {
                        break Label_1939;
                    }
                    break;
                }
                case 19: {
                    App.b(App.aq.getApplicationContext(), App.aq.getResources().getString(2131231202, new Object[] { (String)message.obj }), 0);
                    if (i) {
                        break Label_1939;
                    }
                    break;
                }
                case 20: {
                    App.b(App.aq.getApplicationContext(), App.aq.getResources().getString(2131231179), 0);
                    if (i) {
                        break Label_1939;
                    }
                    break;
                }
                case 21: {
                    App.b(App.aq.getApplicationContext(), App.aq.getResources().getString(2131231181), 0);
                    if (i) {
                        break Label_1939;
                    }
                    break;
                }
                case 22: {
                    App.b(App.aq.getApplicationContext(), App.aq.getResources().getString(2131231182), 0);
                    if (i) {
                        break Label_1939;
                    }
                    break;
                }
                case 23: {
                    App.b(App.aq.getApplicationContext(), App.aq.getResources().getString(2131231180), 0);
                    if (i) {
                        break Label_1939;
                    }
                    break;
                }
                case 24: {
                    App.b(App.aq.getApplicationContext(), App.aq.getResources().getString(2131231194), 0);
                    if (i) {
                        break Label_1939;
                    }
                    break;
                }
                case 25: {
                    App.b(App.aq.getApplicationContext(), App.aq.getResources().getString(2131231196), 0);
                    if (i) {
                        break Label_1939;
                    }
                    break;
                }
                case 26: {
                    App.b(App.aq.getApplicationContext(), App.aq.getResources().getString(2131231197), 0);
                    if (i) {
                        break Label_1939;
                    }
                    break;
                }
                case 27: {
                    App.b(App.aq.getApplicationContext(), App.aq.getResources().getString(2131231195), 0);
                    if (i) {
                        break Label_1939;
                    }
                    break;
                }
                case 28: {
                    App.b(App.aq.getApplicationContext(), App.aq.getResources().getString(2131231183), 0);
                    if (i) {
                        break Label_1939;
                    }
                    break;
                }
                case 29: {
                    App.b(App.aq.getApplicationContext(), App.aq.getResources().getString(2131231185), 0);
                    if (i) {
                        break Label_1939;
                    }
                    break;
                }
                case 30: {
                    App.b(App.aq.getApplicationContext(), App.aq.getResources().getString(2131231186), 0);
                    if (i) {
                        break Label_1939;
                    }
                    break;
                }
                case 31: {
                    App.b(App.aq.getApplicationContext(), App.aq.getResources().getString(2131231184), 0);
                    if (i) {
                        break Label_1939;
                    }
                    break;
                }
                case 32: {
                    App.b(App.aq.getApplicationContext(), App.aq.getResources().getString(2131231191), 0);
                    if (i) {
                        break Label_1939;
                    }
                    break;
                }
                case 33: {
                    App.b(App.aq.getApplicationContext(), App.aq.getResources().getString(2131231193), 0);
                    if (i) {
                        break Label_1939;
                    }
                    break;
                }
                case 34: {
                    App.b(App.aq.getApplicationContext(), App.aq.getResources().getString(2131231192), 0);
                    if (i) {
                        break Label_1939;
                    }
                    break;
                }
                case 35: {
                    App.b(App.aq.getApplicationContext(), App.aq.getResources().getString(2131231190), 0);
                    if (i) {
                        break Label_1939;
                    }
                    break;
                }
                case 36: {
                    final StringBuilder sb = new StringBuilder();
                    final Hashtable hashtable = (Hashtable)message.obj;
                    for (final Object next : hashtable.keySet()) {
                        Log.e(yx.z[3] + next + "/" + hashtable.get(next));
                        final int int1 = Integer.parseInt(hashtable.get(next).toString());
                        final a_9 e = App.S.e(next.toString());
                        Label_1519: {
                            Label_2185: {
                                switch (int1) {
                                    case 401: {
                                        sb.append(App.aq.getString(2131231065, new Object[] { e.a((Context)App.aq) })).append("\n");
                                        if (i) {
                                            break Label_2185;
                                        }
                                        break Label_1519;
                                    }
                                    case 409: {
                                        if (i) {
                                            break Label_2185;
                                        }
                                        break Label_1519;
                                    }
                                    case 500: {
                                        sb.append(App.aq.getString(2131231066, new Object[] { e.a((Context)App.aq) })).append("\n");
                                        if (i) {
                                            break;
                                        }
                                        break Label_1519;
                                    }
                                }
                            }
                            sb.append(App.aq.getString(2131231064, new Object[] { e.a((Context)App.aq) })).append("\n");
                        }
                        if (i) {
                            break;
                        }
                    }
                    App.b((Context)App.aq, sb.toString(), 0);
                    if (i) {
                        break Label_1939;
                    }
                    break;
                }
                case 37: {
                    final StringBuilder sb2 = new StringBuilder();
                    final Hashtable hashtable2 = (Hashtable)message.obj;
                    for (final Object next2 : hashtable2.keySet()) {
                        Log.e(yx.z[2] + next2 + "/" + hashtable2.get(next2));
                        final int int2 = Integer.parseInt(hashtable2.get(next2).toString());
                        final a_9 e2 = App.S.e(next2.toString());
                        Label_1719: {
                            switch (int2) {
                                case 404: {
                                    if (i) {
                                        break;
                                    }
                                    break Label_1719;
                                }
                            }
                            sb2.append(App.aq.getString(2131231086, new Object[] { e2.a((Context)App.aq) })).append("\n");
                        }
                        if (i) {
                            break;
                        }
                    }
                    App.b((Context)App.aq, sb2.toString(), 0);
                    if (i) {
                        break Label_1939;
                    }
                    break;
                }
                case 38: {
                    final StringBuilder sb3 = new StringBuilder();
                    final Hashtable hashtable3 = (Hashtable)message.obj;
                    for (final Object next3 : hashtable3.keySet()) {
                        Log.e(yx.z[5] + next3 + "/" + hashtable3.get(next3));
                        final int int3 = Integer.parseInt(hashtable3.get(next3).toString());
                        final a_9 e3 = App.S.e(next3.toString());
                        Label_1919: {
                            switch (int3) {
                                case 404: {
                                    sb3.append(App.aq.getString(2131231064, new Object[] { e3.a((Context)App.aq) })).append("\n");
                                    if (i) {
                                        break;
                                    }
                                    break Label_1919;
                                }
                            }
                            sb3.append(App.aq.getString(2131231064, new Object[] { e3.a((Context)App.aq) })).append("\n");
                        }
                        if (i) {
                            break;
                        }
                    }
                    App.b((Context)App.aq, sb3.toString(), 0);
                    if (i) {
                        break Label_1939;
                    }
                    break;
                }
                case 39: {
                    final StringBuilder sb4 = new StringBuilder();
                    final Hashtable hashtable4 = (Hashtable)message.obj;
                    for (final Object next4 : hashtable4.keySet()) {
                        Log.e(yx.z[1] + next4 + "/" + hashtable4.get(next4));
                        final int int4 = Integer.parseInt(hashtable4.get(next4).toString());
                        final a_9 e4 = App.S.e(next4.toString());
                        Label_2118: {
                            switch (int4) {
                                case 404: {
                                    sb4.append(App.aq.getString(2131231086, new Object[] { e4.a((Context)App.aq) })).append("\n");
                                    if (i) {
                                        break;
                                    }
                                    break Label_2118;
                                }
                            }
                            sb4.append(App.aq.getString(2131231086, new Object[] { e4.a((Context)App.aq) })).append("\n");
                        }
                        if (i) {
                            break;
                        }
                    }
                    App.b((Context)App.aq, sb4.toString(), 0);
                }
            }
        }
    }
}
