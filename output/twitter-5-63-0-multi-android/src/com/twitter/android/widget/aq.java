// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.widget;

class aq implements Runnable
{
    final /* synthetic */ Runnable a;
    final /* synthetic */ ap b;
    
    aq(final ap b, final Runnable a) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public void run() {
        if (this.a != null) {
            this.a.run();
        }
    }
}
