// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import com.whatsapp.util.Log;
import java.util.TimerTask;
import com.whatsapp.protocol.c_;
import android.app.Activity;
import java.util.Hashtable;
import java.util.HashMap;
import java.util.Timer;
import com.whatsapp.protocol.c2;

public class a0p implements c2, Runnable
{
    private static Timer c;
    public static HashMap l;
    private static final String[] z;
    public boolean a;
    public boolean b;
    public int d;
    public String e;
    private Runnable f;
    public boolean g;
    private Runnable h;
    public Long i;
    public Hashtable j;
    public Activity k;
    public c_ m;
    public boolean n;
    private r6 o;
    
    static {
        final String[] z2 = new String[4];
        String s = "p]Q#1vT`4&fMZ57HKJ% rKLi";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0133:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = 'C';
                        break;
                    }
                    case 0: {
                        c2 = '\u0017';
                        break;
                    }
                    case 1: {
                        c2 = '8';
                        break;
                    }
                    case 2: {
                        c2 = '?';
                        break;
                    }
                    case 3: {
                        c2 = 'F';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "7D\u001f";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "7D\u001f";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    n2 = 3;
                    array = z2;
                    s = "p]Q#1vT`4&fMZ57H^^//r\\\u001f|c";
                    n = 2;
                    continue;
                }
                case 2: {
                    break Label_0133;
                }
            }
        }
        array[n2] = intern;
        z = z2;
        a0p.l = new HashMap();
        a0p.c = new Timer();
    }
    
    public a0p(final Activity k, final String e, final int d, final Hashtable j, final boolean a, final boolean b, final c_ m) {
        this.a = false;
        this.b = false;
        this.g = false;
        this.n = false;
        this.f = new a66(this);
        this.h = new a_h(this);
        this.e = e;
        this.k = k;
        this.d = d;
        this.a = a;
        this.b = b;
        this.j = j;
        this.m = m;
        Label_0146: {
            if (e == null) {
                this.i = System.currentTimeMillis();
                a0p.l.put("" + this.i, this);
                if (!App.I) {
                    break Label_0146;
                }
            }
            a0p.l.put(e, this);
        }
        if (d == 2) {
            this.o = new r6(this);
            a0p.c.schedule(this.o, 20000L);
        }
    }
    
    static Runnable a(final a0p a0p) {
        return a0p.f;
    }
    
    private void a() {
        a0p a0p;
        if (this.e == null) {
            a0p = com.whatsapp.a0p.l.remove(this.i);
        }
        else {
            a0p = com.whatsapp.a0p.l.remove(this.e);
        }
        if (a0p != null) {
            a0p.o.cancel();
        }
    }
    
    @Override
    public void a(final int n) {
        Log.i(a0p.z[3] + n + a0p.z[1] + this.e + a0p.z[2] + this.d);
        switch (this.d) {
            default: {
                this.a();
                App.aq.a5().post(this.h);
                if (this.m != null) {
                    l7.a(this.m.a, n);
                }
            }
        }
    }
    
    @Override
    public void run() {
        Log.i(a0p.z[0] + this.d);
        this.n = true;
        Label_0080: {
            if (this.d == 2) {
                if (this.a) {
                    App.as.put(this.e, this.e);
                    if (!App.I) {
                        break Label_0080;
                    }
                }
                App.as.remove(this.e);
            }
        }
        this.a();
        App.aq.a5().post(this.h);
        if (this.m != null) {
            l7.a(this.m.a, 200);
        }
    }
}
