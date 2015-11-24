// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import java.util.TimerTask;
import com.whatsapp.util.Log;
import com.whatsapp.protocol.c_;
import java.util.Vector;
import java.util.Timer;
import com.whatsapp.protocol.bl;
import com.whatsapp.protocol.c2;

public class n9 implements c2, bl, Runnable
{
    private static Timer f;
    private static final String[] z;
    private e a;
    public Vector b;
    public boolean c;
    public String d;
    private boolean e;
    public String g;
    public int h;
    public c_ i;
    
    static {
        final String[] z2 = new String[7];
        String s = "gFE";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0207:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = 'i';
                        break;
                    }
                    case 0: {
                        c2 = 'G';
                        break;
                    }
                    case 1: {
                        c2 = ':';
                        break;
                    }
                    case 2: {
                        c2 = 'e';
                        break;
                    }
                    case 3: {
                        c2 = 'q';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = " H\n\u0004\u0019*]\u0017^\u001b\"K\u0010\u0014\u001a3\u001a\u0003\u0010\u0000+_\u0001QSg";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "gFE";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = " H\n\u0004\u0019*]\u0017^\u001b\"K\u0010\u0014\u001a3\u001a\u0016\u0004\n$_\u0016\u0002F";
                    n2 = 3;
                    array = z2;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    s = "gFE";
                    n2 = 4;
                    array = z2;
                    n = 3;
                    continue;
                }
                case 3: {
                    array[n2] = intern;
                    n2 = 5;
                    array = z2;
                    s = " H\n\u0004\u0019*]\u0017^\u001b\"K\u0010\u0014\u001a3\u001a\u0016\u0004\n$_\u0016\u0002I}\u001a";
                    n = 4;
                    continue;
                }
                case 4: {
                    array[n2] = intern;
                    n2 = 6;
                    s = " H\n\u0004\u0019*]\u0017^\u000e5U\u0010\u000165_\u0014\u0004\f4NJ\u0005\u0000*_\n\u0004\u001dhN\u001c\u0001\f}";
                    n = 5;
                    array = z2;
                    continue;
                }
                case 5: {
                    break Label_0207;
                }
            }
        }
        array[n2] = intern;
        z = z2;
        n9.f = new Timer();
    }
    
    public n9(final String d, final String g, final Vector b, final int h) {
        this.c = false;
        this.e = false;
        boolean b2 = false;
        if (d != null) {
            b2 = true;
        }
        Log.b(b2);
        this.d = d;
        this.g = g;
        this.b = b;
        this.h = h;
        this.a = new e(this);
        n9.f.schedule(this.a, 20000L);
    }
    
    public n9(final String s, final String s2, final Vector vector, final int n, final c_ i) {
        this(s, s2, vector, n);
        this.i = i;
    }
    
    private void a() {
        final boolean i = App.I;
        Log.i(n9.z[6] + this.h);
        this.c = true;
        Label_0252: {
            switch (this.h) {
                case 13: {
                    App.ak.g(adc.a(this.d, this.g, this.b, 3));
                    if (i) {
                        break Label_0252;
                    }
                    break;
                }
                case 14: {
                    adc.a(6, this.d);
                    if (i) {
                        break Label_0252;
                    }
                    break;
                }
                case 29: {
                    adc.a(7, this.d);
                    if (i) {
                        break Label_0252;
                    }
                    break;
                }
                case 90: {
                    adc.a(9, this.d);
                    if (i) {
                        break Label_0252;
                    }
                    break;
                }
                case 91: {
                    adc.a(10, this.d);
                    if (i) {
                        break Label_0252;
                    }
                    break;
                }
                case 15: {
                    adc.a(5, this.d);
                    if (i) {
                        break Label_0252;
                    }
                    break;
                }
                case 92: {
                    adc.a(8, this.d);
                    if (i) {
                        break Label_0252;
                    }
                    break;
                }
                case 16: {
                    adc.a(11, this.d);
                    break;
                }
            }
        }
        if (this.i != null) {
            l7.a(this.i.a, 500);
        }
        App.a(this.d, false);
        this.b();
    }
    
    static boolean a(final n9 n9) {
        return n9.e;
    }
    
    static void b(final n9 n9) {
        n9.a();
    }
    
    @Override
    public void a(final int n) {
        final boolean i = App.I;
        Log.e(n9.z[1] + n + n9.z[2] + this.d + n9.z[0] + this.h);
        this.a.cancel();
        Label_0442: {
            switch (this.h) {
                case 13: {
                    Label_0213: {
                        Label_0464: {
                            switch (n) {
                                case 500: {
                                    adc.a(13, this.g);
                                    if (i) {
                                        break Label_0464;
                                    }
                                    break Label_0213;
                                }
                                case 406: {
                                    adc.a(14, this.g);
                                    if (i) {
                                        break;
                                    }
                                    break Label_0213;
                                }
                            }
                        }
                        adc.a(12, this.g);
                    }
                    App.ak.g(adc.a(this.d, this.g, this.b, 3));
                    if (i) {
                        break Label_0442;
                    }
                    break;
                }
                case 16: {
                    Label_0510: {
                        switch (n) {
                            case 401: {
                                adc.a(16, null);
                                if (i) {
                                    break Label_0510;
                                }
                                break Label_0442;
                            }
                            case 403: {
                                adc.a(17, null);
                                if (i) {
                                    break Label_0510;
                                }
                                break Label_0442;
                            }
                            case 404: {
                                adc.a(18, null);
                                if (i) {
                                    break Label_0510;
                                }
                                break Label_0442;
                            }
                            case 406: {
                                adc.a(19, this.g);
                                if (i) {
                                    break;
                                }
                                break Label_0442;
                            }
                        }
                    }
                    adc.a(15, null);
                    if (i) {
                        break Label_0442;
                    }
                    break;
                }
                case 14: {
                    Label_0546: {
                        switch (n) {
                            case 401: {
                                adc.a(21, null);
                                if (i) {
                                    break Label_0546;
                                }
                                break Label_0442;
                            }
                            case 403: {
                                adc.a(22, null);
                                if (i) {
                                    break Label_0546;
                                }
                                break Label_0442;
                            }
                            case 404: {
                                adc.a(23, null);
                                if (i) {
                                    break;
                                }
                                break Label_0442;
                            }
                        }
                    }
                    adc.a(20, null);
                    if (i) {
                        break Label_0442;
                    }
                    break;
                }
                case 29: {
                    Label_0579: {
                        switch (n) {
                            case 401: {
                                adc.a(25, null);
                                if (i) {
                                    break Label_0579;
                                }
                                break Label_0442;
                            }
                            case 403: {
                                adc.a(26, null);
                                if (i) {
                                    break Label_0579;
                                }
                                break Label_0442;
                            }
                            case 404: {
                                adc.a(27, null);
                                if (i) {
                                    break;
                                }
                                break Label_0442;
                            }
                        }
                    }
                    adc.a(24, null);
                    if (i) {
                        break Label_0442;
                    }
                    break;
                }
                case 90:
                case 91: {
                    Label_0612: {
                        switch (n) {
                            case 401: {
                                adc.a(29, null);
                                if (i) {
                                    break Label_0612;
                                }
                                break Label_0442;
                            }
                            case 403: {
                                adc.a(30, null);
                                if (i) {
                                    break Label_0612;
                                }
                                break Label_0442;
                            }
                            case 404: {
                                adc.a(31, null);
                                if (i) {
                                    break;
                                }
                                break Label_0442;
                            }
                        }
                    }
                    adc.a(28, null);
                    if (i) {
                        break Label_0442;
                    }
                    break;
                }
                case 15: {
                    Label_0635: {
                        switch (n) {
                            case 403: {
                                adc.a(33, null);
                                if (i) {
                                    break Label_0635;
                                }
                                break Label_0442;
                            }
                            case 404: {
                                adc.a(34, null);
                                if (i) {
                                    break;
                                }
                                break Label_0442;
                            }
                        }
                    }
                    adc.a(32, null);
                    if (i) {
                        break Label_0442;
                    }
                    break;
                }
                case 92: {
                    adc.a(35, null);
                    break;
                }
            }
        }
        if (this.i != null) {
            l7.a(this.i.a, n);
        }
        App.a(this.d, false);
        this.b();
    }
    
    @Override
    public void a(final String s) {
        this.a.cancel();
        this.e = true;
        Log.i(n9.z[5] + s + n9.z[4] + this.h);
        if (this.i != null) {
            l7.a(this.i.a, 200);
        }
        App.a(this.d, false);
        this.b();
    }
    
    public void b() {
    }
    
    @Override
    public void run() {
        this.a.cancel();
        Log.i(n9.z[3] + this.h);
        this.b();
    }
}
