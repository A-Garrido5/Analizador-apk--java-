// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.content.Context;
import com.whatsapp.contact.h;
import com.whatsapp.contact.f;
import com.whatsapp.util.Log;
import java.util.concurrent.atomic.AtomicBoolean;

public class aqu
{
    private static final Runnable a;
    private static AtomicBoolean b;
    private static Thread c;
    private static final String[] z;
    
    static {
        final String[] z2 = new String[4];
        String s = "ID\u00162N@L\u0005!\u000fYL\r=NLI\u00106\u000fI\\B!\u001bCK\u000b=\t";
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
                        c2 = 'n';
                        break;
                    }
                    case 0: {
                        c2 = '-';
                        break;
                    }
                    case 1: {
                        c2 = '%';
                        break;
                    }
                    case 2: {
                        c2 = 'b';
                        break;
                    }
                    case 3: {
                        c2 = 'S';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "ID\u00162N@L\u0005!\u000fYL\r=NLI\u00106\u000fI\\B \u001bNF\u0007 \u001dKP\u000e";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "ID\u00162\u0003DB\u00102\u001a\u0002L\f:\u001aIG";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    n2 = 3;
                    array = z2;
                    s = "DK\u000b'*o\n\u0007!\u001cBW";
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
        aqu.b = new AtomicBoolean();
        a = new d9();
    }
    
    static boolean a() {
        return d();
    }
    
    public static void b() {
        aqu.b.set(true);
    }
    
    public static boolean c() {
        return aqu.c != null && aqu.c.isAlive();
    }
    
    private static boolean d() {
        try {
            Log.i(aqu.z[2]);
            if (!f.b()) {}
            App.a1();
            App.S.k();
            final int h = App.S.h();
            f.b((Context)App.aq, com.whatsapp.contact.h.REGISTRATION_FULL);
            App.av.sendEmptyMessage(1);
            if (!f.d()) {}
            App.aL.c(true);
            App.aL.a(h);
            return true;
        }
        catch (Exception ex) {
            Log.b(aqu.z[3], ex);
            return false;
        }
    }
    
    public static void e() {
        aqu.b.set(false);
    }
    
    static AtomicBoolean f() {
        return aqu.b;
    }
    
    public static boolean g() {
        return aqu.b.get();
    }
    
    public static boolean h() {
        if (c()) {
            aqu.c.join();
        }
        return aqu.b.get();
    }
    
    public static void i() {
        final boolean k = a_9.k;
        if (c()) {
            Log.i(aqu.z[0]);
            if (!k) {
                return;
            }
        }
        if (aqu.b.get()) {
            Log.i(aqu.z[1]);
            if (!k) {
                return;
            }
        }
        (aqu.c = new Thread(aqu.a)).start();
    }
}
