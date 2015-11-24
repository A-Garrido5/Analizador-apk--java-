// 
// Decompiled by Procyon v0.5.30
// 

package org.whispersystems.jobqueue;

class x implements Runnable
{
    final v a;
    
    x(final v a) {
        this.a = a;
    }
    
    @Override
    public void run() {
        v.c(this.a).b();
    }
}
