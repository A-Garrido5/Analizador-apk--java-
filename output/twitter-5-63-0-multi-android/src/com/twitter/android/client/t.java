// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.client;

import com.twitter.library.client.Session;
import com.twitter.library.client.az;
import java.util.HashMap;
import android.content.Context;

public class t
{
    private static Context a;
    private static HashMap b;
    private static q c;
    
    public static q a() {
        if (t.c != null) {
            return t.c;
        }
        return a(az.a(t.a).b().c());
    }
    
    public static q a(final Session session) {
        if (t.c != null) {
            return t.c;
        }
        return a(session.c());
    }
    
    public static q a(final String s) {
        q c;
        if (t.c != null) {
            c = t.c;
        }
        else {
            c = t.b.get(s);
            if (c == null) {
                final q q = new q();
                t.b.put(s, q);
                return q;
            }
        }
        return c;
    }
    
    public static void a(final Context a) {
        q.a(t.a = a);
        t.b = new HashMap();
    }
}
