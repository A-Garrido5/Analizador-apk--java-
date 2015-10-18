// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.widget;

class b implements Runnable
{
    final /* synthetic */ Runnable a;
    final /* synthetic */ a b;
    
    b(final a b, final Runnable a) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public void run() {
        if (this.b.a != null) {
            this.b.e.a(this.b.a);
            if (this.b.c) {
                this.b.e.c(this.b.a.a());
            }
        }
        if (this.a != null) {
            this.a.run();
        }
    }
}
