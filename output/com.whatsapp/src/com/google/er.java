// 
// Decompiled by Procyon v0.5.30
// 

package com.google;

class er implements hb
{
    int a;
    private hb b;
    final hu c;
    private final w d;
    
    private er(final hu c) {
        this.c = c;
        this.d = new w(c, null);
        this.b = this.d.a().f();
        this.a = c.c();
    }
    
    er(final hu hu, final gv gv) {
        this(hu);
    }
    
    @Override
    public byte a() {
        try {
            if (!this.b.hasNext()) {
                this.b = this.d.a().f();
            }
            --this.a;
            return this.b.a();
        }
        catch (UnsupportedOperationException ex) {
            throw ex;
        }
    }
    
    @Override
    public Byte a() {
        return this.a();
    }
    
    @Override
    public boolean hasNext() {
        try {
            if (this.a > 0) {
                return true;
            }
        }
        catch (UnsupportedOperationException ex) {
            throw ex;
        }
        return false;
    }
    
    @Override
    public Object next() {
        return this.a();
    }
    
    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }
}
