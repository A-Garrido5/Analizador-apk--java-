// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.errorreporter;

import java.util.Iterator;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ErrorReporter
{
    public static final yv a;
    private static final Map b;
    private static final List c;
    private static boolean d;
    
    static {
        a = new yv("TestErrorReporter");
        b = new HashMap();
        c = new ArrayList();
        ErrorReporter.d = true;
    }
    
    public static void a(final a a) {
        if (!ErrorReporter.c.isEmpty()) {
            for (final b b : a.a()) {
                if (b.c()) {
                    b.a(ErrorReporter.b);
                    final Iterator<c> iterator2 = ErrorReporter.c.iterator();
                    while (iterator2.hasNext()) {
                        iterator2.next().a(b);
                    }
                }
            }
        }
        else {
            c(a);
        }
    }
    
    public static void a(final c c) {
        ErrorReporter.a.a();
        ErrorReporter.c.add(c);
    }
    
    public static void a(final Throwable t) {
        a(new a(t));
    }
    
    public static void b(final a a) {
        if (!ErrorReporter.c.isEmpty()) {
            for (final b b : a.a()) {
                if (b.c()) {
                    b.a(ErrorReporter.b);
                    final Iterator<c> iterator2 = ErrorReporter.c.iterator();
                    while (iterator2.hasNext()) {
                        iterator2.next().b(b);
                    }
                }
            }
        }
        else {
            c(a);
        }
    }
    
    public static void b(final Throwable t) {
        b(new a(t));
    }
    
    private static void c(final a a) {
        if (yw.b() && ErrorReporter.d) {
            throw new ErrorReporter$ErrorLogException(a);
        }
    }
}
