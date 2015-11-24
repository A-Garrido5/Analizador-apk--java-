// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.eventreporter;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.List;

public class EventReporter
{
    public static final yv a;
    private static final List b;
    private static boolean c;
    
    static {
        a = new yv("TestEventReporter");
        b = new CopyOnWriteArrayList();
        EventReporter.c = true;
    }
    
    public static void a(final a a) {
        EventReporter.a.a();
        EventReporter.b.add(a);
    }
    
    public static void a(final b b) {
        final Iterator<a> iterator = (Iterator<a>)EventReporter.b.iterator();
        int n = 0;
        while (iterator.hasNext()) {
            final a a = iterator.next();
            int n2;
            if (a.a(b)) {
                a.b(b);
                n2 = 1;
            }
            else {
                n2 = n;
            }
            n = n2;
        }
        if (n == 0) {
            b(b);
        }
    }
    
    private static void b(final b b) {
        if (yw.b() && EventReporter.c) {
            throw new EventReporter$EventSubscriberException(b);
        }
    }
}
