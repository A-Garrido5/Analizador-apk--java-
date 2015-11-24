// 
// Decompiled by Procyon v0.5.30
// 

package org.whispersystems.jobqueue;

import java.util.Iterator;
import android.content.Context;

public class c
{
    public static int a;
    private final j b;
    
    public c(final j b) {
        final int a = c.a;
        this.b = b;
        if (org.whispersystems.jobqueue.a.a) {
            c.a = a + 1;
        }
    }
    
    public void a(final Context context, final a a) {
        final int a2 = c.a;
        if (a instanceof e) {
            ((e)a).a(context);
        }
        for (final org.whispersystems.jobqueue.requirements.e e : a.c()) {
            if (e instanceof e) {
                ((e)e).a(context);
            }
            if (a2 != 0) {
                a.a = !a.a;
                break;
            }
        }
        if (this.b != null) {
            this.b.a(a);
            final Iterator<org.whispersystems.jobqueue.requirements.e> iterator2 = a.c().iterator();
            while (iterator2.hasNext()) {
                this.b.a(iterator2.next());
                if (a2 != 0) {
                    break;
                }
            }
        }
    }
}
