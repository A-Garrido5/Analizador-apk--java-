// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.widget;

class ex implements Runnable
{
    final /* synthetic */ ScrollingHeaderListFragment a;
    
    ex(final ScrollingHeaderListFragment a) {
        this.a = a;
    }
    
    @Override
    public void run() {
        this.a.a(this.a.ah, this.a.ak);
    }
}
