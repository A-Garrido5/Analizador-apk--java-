// 
// Decompiled by Procyon v0.5.30
// 

package org;

import java.util.EventObject;

public class L extends EventObject
{
    private static final long serialVersionUID = 403743538418947240L;
    private final boolean a;
    private final int b;
    private final String c;
    private final String d;
    
    public L(final Object o, final int b, final String c) {
        final boolean c2 = M.c;
        super(o);
        this.b = b;
        this.c = c;
        this.a = false;
        this.d = null;
        if (l.a != 0) {
            boolean c3 = false;
            if (!c2) {
                c3 = true;
            }
            M.c = c3;
        }
    }
    
    public L(final Object o, final String d, final String c) {
        super(o);
        this.b = 0;
        this.c = c;
        this.a = true;
        this.d = d;
    }
    
    public int a() {
        return this.b;
    }
    
    public String b() {
        return this.d;
    }
    
    public String c() {
        return this.c;
    }
    
    public boolean d() {
        return !this.e();
    }
    
    public boolean e() {
        return this.a;
    }
}
