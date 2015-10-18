// 
// Decompiled by Procyon v0.5.30
// 

package org.whispersystems.jobqueue;

import java.util.List;

class s implements Runnable
{
    final v a;
    private final o b;
    
    public s(final v a, final o b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public void run() {
        List list = null;
        Label_0039: {
            if (this.b == null) {
                list = v.b(this.a).b();
                if (!v.h) {
                    break Label_0039;
                }
            }
            list = v.b(this.a).a(this.b);
        }
        v.c(this.a).a(list);
    }
}
