// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.app.Activity;
import java.util.Collection;
import java.util.ArrayList;
import java.util.Iterator;
import com.whatsapp.util.Log;
import com.whatsapp.util.br;
import com.whatsapp.protocol.bi;
import java.util.Stack;
import android.os.Handler;

public class arz
{
    private static arz c;
    private static final String[] z;
    private Handler a;
    private Runnable b;
    private Stack d;
    private u1 e;
    private boolean f;
    
    static {
        final String[] z2 = new String[4];
        String s = "'\u0005\u0000`Z+\u0015\u0010f_%\u0017\neT+\u0004K|K.\u0001\u0010lH>\u0001\u0010l\u001b";
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
                        c2 = ';';
                        break;
                    }
                    case 0: {
                        c2 = 'J';
                        break;
                    }
                    case 1: {
                        c2 = '`';
                        break;
                    }
                    case 2: {
                        c2 = 'd';
                        break;
                    }
                    case 3: {
                        c2 = '\t';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "'\u0005\u0000`Z+\u0015\u0010f_%\u0017\neT+\u0004KjZ$\u0003\u0001e\u001b";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "'\u0005\u0000`Z+\u0015\u0010f_%\u0017\neT+\u0004K|K.\u0001\u0010lJ?\u0005\u0011l\u001b";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    n2 = 3;
                    array = z2;
                    s = "'\u0005\u0000`Z+\u0015\u0010f_%\u0017\neT+\u0004KxN/\u0015\u0001)";
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
    }
    
    private arz() {
        this.e = new u1(this, null);
        this.d = new Stack();
        this.a = new Handler();
        this.b = new ahp(this);
        this.e.setPriority(1);
        this.e.start();
    }
    
    public static arz a() {
        synchronized (arz.class) {
            if (arz.c == null) {
                arz.c = new arz();
            }
            return arz.c;
        }
    }
    
    static Stack a(final arz arz) {
        return arz.d;
    }
    
    public void a(final bi bi) {
        while (true) {
            final boolean i = App.I;
            while (true) {
                Label_0115: {
                    synchronized (this.d) {
                        final Iterator iterator = this.d.iterator();
                        if (iterator.hasNext()) {
                            final bi bi2 = iterator.next();
                            if (!bi.a.equals(bi2.a)) {
                                break Label_0115;
                            }
                            Log.i(arz.z[1] + br.c(bi.d));
                            this.d.remove(bi2);
                            if (i) {
                                break Label_0115;
                            }
                        }
                        return;
                    }
                }
                if (i) {
                    return;
                }
                continue;
            }
        }
    }
    
    public void a(final boolean f) {
        synchronized (this.d) {
            Log.i(arz.z[0] + f);
            Label_0082: {
                if (f) {
                    this.a.removeCallbacks(this.b);
                    this.a.postDelayed(this.b, 15000L);
                    if (!App.I) {
                        break Label_0082;
                    }
                }
                if (this.f) {
                    this.d.notifyAll();
                }
            }
            this.f = f;
        }
    }
    
    public void b() {
        while (true) {
            final boolean i = App.I;
        Label_0108_Outer:
            while (true) {
                while (true) {
                    synchronized (this.d) {
                        Log.i(arz.z[2] + this.d.size());
                        final int j = App.j();
                        final ArrayList<bi> list = new ArrayList<bi>();
                        final Iterator iterator = this.d.iterator();
                        if (!iterator.hasNext()) {
                            this.d.removeAll(list);
                            return;
                        }
                        final bi bi = iterator.next();
                        if (!App.a(j, bi)) {
                            list.add(bi);
                        }
                    }
                    if (i) {
                        continue;
                    }
                    break;
                }
                continue Label_0108_Outer;
            }
        }
    }
    
    public void b(final bi bi) {
        if (bi.I != 0 && ds.a(bi, true, null) == null) {
            return;
        }
        synchronized (this.d) {
            Log.i(arz.z[3] + br.c(bi.d));
            this.d.add(bi);
            if (!this.f) {
                this.d.notifyAll();
            }
        }
    }
}
