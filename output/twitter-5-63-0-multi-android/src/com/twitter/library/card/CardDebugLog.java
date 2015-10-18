// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.card;

import java.util.Iterator;
import android.util.Log;
import com.twitter.library.client.App;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.ArrayList;

public abstract class CardDebugLog
{
    private static final boolean a;
    private static int b;
    private static int c;
    private static ArrayList d;
    private static CopyOnWriteArraySet e;
    
    static {
        a = (App.l() && Log.isLoggable("CARDS", 3));
        CardDebugLog.d = new ArrayList();
        CardDebugLog.e = new CopyOnWriteArraySet();
    }
    
    public static void a() {
        ++CardDebugLog.b;
    }
    
    public static void a(final CardDebugLog$Severity cardDebugLog$Severity, final String s, final String s2) {
        Label_0096: {
            synchronized (CardDebugLog.class) {
                if (!e()) {
                    break Label_0096;
                }
                while (CardDebugLog.d.size() > 100) {
                    CardDebugLog.d.remove(0);
                }
            }
            final i i = new i(cardDebugLog$Severity, s, s2);
            CardDebugLog.d.add(i);
            final Iterator<h> iterator = CardDebugLog.e.iterator();
            while (iterator.hasNext()) {
                iterator.next().a(i);
            }
        }
        if (CardDebugLog.a && f()) {
            switch (g.a[cardDebugLog$Severity.ordinal()]) {
                default: {
                    Log.d("CARDS", s);
                    break;
                }
                case 1: {
                    Log.d("CARDS", s);
                    break;
                }
                case 2: {
                    Log.i("CARDS", s);
                    break;
                }
                case 3: {
                    Log.w("CARDS", s);
                    break;
                }
                case 4: {
                    Log.w("CARDS", s);
                    break;
                }
            }
        }
    }
    // monitorexit(CardDebugLog.class)
    
    public static void a(final h h) {
        CardDebugLog.e.add(h);
    }
    
    public static void a(final String s, final String s2) {
        a(CardDebugLog$Severity.a, s, s2);
    }
    
    public static void b() {
        --CardDebugLog.b;
    }
    
    public static void b(final h h) {
        CardDebugLog.e.remove(h);
    }
    
    public static void b(final String s, final String s2) {
        a(CardDebugLog$Severity.b, s, s2);
    }
    
    public static void c() {
        ++CardDebugLog.c;
    }
    
    public static void c(final String s, final String s2) {
        a(CardDebugLog$Severity.c, s, s2);
    }
    
    public static void d() {
        --CardDebugLog.c;
    }
    
    public static void d(final String s, final String s2) {
        a(CardDebugLog$Severity.d, s, s2);
    }
    
    public static boolean e() {
        return CardDebugLog.b > 0 && App.l();
    }
    
    public static boolean f() {
        return CardDebugLog.c > 0 && App.l();
    }
    
    public static void g() {
        synchronized (CardDebugLog.class) {
            CardDebugLog.d.clear();
            final Iterator<h> iterator = CardDebugLog.e.iterator();
            while (iterator.hasNext()) {
                iterator.next().a();
            }
        }
    }
    // monitorexit(CardDebugLog.class)
    
    public static ArrayList h() {
        return CardDebugLog.d;
    }
}
