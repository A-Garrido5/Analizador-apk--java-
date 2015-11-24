// 
// Decompiled by Procyon v0.5.30
// 

package de.greenrobot.event.util;

public class k implements m
{
    protected final Throwable a;
    private Object b;
    protected final boolean c;
    
    public k(final Throwable a) {
        this.a = a;
        this.c = false;
    }
    
    public k(final Throwable a, final boolean c) {
        this.a = a;
        this.c = c;
    }
    
    @Override
    public Object a() {
        return this.b;
    }
    
    @Override
    public Throwable a() {
        return this.a;
    }
    
    @Override
    public void a(final Object b) {
        this.b = b;
    }
    
    public boolean b() {
        return this.c;
    }
}
