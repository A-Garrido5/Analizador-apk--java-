// 
// Decompiled by Procyon v0.5.30
// 

package org.whispersystems.jobqueue;

import org.whispersystems.jobqueue.requirements.e;
import java.util.LinkedList;
import java.util.List;

public class g
{
    private long a;
    private int b;
    private List c;
    private o d;
    private boolean e;
    private boolean f;
    private String g;
    
    public g() {
        final boolean h = v.h;
        this.c = new LinkedList();
        this.e = false;
        this.d = null;
        this.b = 100;
        this.g = null;
        this.f = false;
        this.a = 0L;
        if (h) {
            final boolean a = org.whispersystems.jobqueue.a.a;
            boolean a2 = false;
            if (!a) {
                a2 = true;
            }
            org.whispersystems.jobqueue.a.a = a2;
        }
    }
    
    public g a(final String g) {
        this.g = g;
        return this;
    }
    
    public g a(final e e) {
        this.c.add(e);
        return this;
    }
    
    public p a() {
        return new p(this.c, this.e, this.g, this.d, this.b, this.f, this.a, null);
    }
    
    public g b() {
        this.e = true;
        return this;
    }
}
