// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

class vl implements Runnable
{
    final Runnable a;
    final t1 b;
    final int c;
    
    vl(final t1 b, final int c, final Runnable a) {
        this.b = b;
        this.c = c;
        this.a = a;
    }
    
    @Override
    public void run() {
        if (t1.a(this.b).size() == this.c && this.a != null) {
            this.a.run();
        }
    }
}
