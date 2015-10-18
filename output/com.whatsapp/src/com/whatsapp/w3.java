// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import java.net.MalformedURLException;
import java.net.URL;
import com.whatsapp.util.br;
import com.whatsapp.protocol.cb;
import com.whatsapp.util.Log;
import com.whatsapp.protocol.bb;

public class w3 implements bb
{
    private static final String[] z;
    public String a;
    final a9 b;
    public String c;
    public long d;
    public String e;
    public String f;
    
    static {
        final String[] z2 = new String[8];
        String s = "Z!$^rB4,XrSk/YwB4,^pV0%\u0017";
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
                        c2 = '\u0013';
                        break;
                    }
                    case 0: {
                        c2 = '7';
                        break;
                    }
                    case 1: {
                        c2 = 'D';
                        break;
                    }
                    case 2: {
                        c2 = '@';
                        break;
                    }
                    case 3: {
                        c2 = '7';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "Z!$^rB4,XrSk/YwB4,^pV0%\u0017}B(,\u0017";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "Z!$^rB4,XrSk/YvE6/E3";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "Q6/Z";
                    n2 = 3;
                    array = z2;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    s = "Z!$^rB4,XrSk/YfG(/Vw\u0017";
                    n2 = 4;
                    array = z2;
                    n = 3;
                    continue;
                }
                case 3: {
                    array[n2] = intern;
                    n2 = 5;
                    array = z2;
                    s = "Z!$^rB4,XrSk-V\u007fQ+2ZvS12[vO'%Gg^+.\u0017";
                    n = 4;
                    continue;
                }
                case 4: {
                    array[n2] = intern;
                    n2 = 6;
                    s = "w7n@{V03VcGj.Rg";
                    n = 5;
                    array = z2;
                    continue;
                }
                case 5: {
                    array[n2] = intern;
                    n2 = 7;
                    s = "C+";
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
    
    public w3(final a9 b) {
        this.b = b;
    }
    
    private void a() {
        App.aq.a5().post((Runnable)new k2(this));
    }
    
    private void b() {
        App.aq.a5().post((Runnable)new as5(this));
    }
    
    @Override
    public void a(final int n) {
        Log.w(w3.z[2] + n + " " + this.b.h.a);
        a9.a(this.b).cancel();
        this.a();
    }
    
    @Override
    public void a(final cb o) {
        int n = 1;
        Label_0119: {
            if (o != null) {
                Log.i(w3.z[0] + br.c(o.a) + " " + o.b + " " + o.d + " " + this.b.h.a);
                if (!App.I) {
                    break Label_0119;
                }
            }
            Log.i(w3.z[n] + this.b.h.a);
        }
        a9.a(this.b).cancel();
        this.b.o = o;
        a9.a(this.b, n != 0);
        final a9 b = this.b;
        if (o == null) {
            n = 0;
        }
        b.n = (n != 0);
        this.b();
    }
    
    @Override
    public void a(final String s, final String s2, final int n) {
        Log.i(w3.z[4] + br.c(s) + " " + s2 + " " + n + " " + this.b.h.a);
        a9.a(this.b).cancel();
        final String l = App.l(s);
        try {
            a9.a(this.b, new alp(new URL(l), this.b.k(), n, this.b.d(), new aqe(this)));
            a9.b(this.b).a(w3.z[3], App.aX.jabber_id + w3.z[6]);
            a9.b(this.b).a(w3.z[7], this.b.h.a.a);
            this.b();
        }
        catch (MalformedURLException ex) {
            Log.e(w3.z[5] + ex.toString());
            this.a();
        }
    }
}
