// 
// Decompiled by Procyon v0.5.30
// 

package de.greenrobot.event;

class n extends ThreadLocal
{
    final m a;
    
    n(final m a) {
        this.a = a;
    }
    
    protected k a() {
        return new k();
    }
    
    @Override
    protected Object initialValue() {
        return this.a();
    }
}
