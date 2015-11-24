// 
// Decompiled by Procyon v0.5.30
// 

package com.tonicartos.widget.stickygridheaders;

class d
{
    final m a;
    private int b;
    private int c;
    
    public d(final m a, final int c) {
        this.a = a;
        this.c = c;
        this.b = 0;
    }
    
    public int a() {
        return this.c;
    }
    
    public int b() {
        return this.b;
    }
    
    public void c() {
        ++this.b;
    }
}
