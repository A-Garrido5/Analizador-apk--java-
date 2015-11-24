// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.commerce.widget.creditcard;

class b implements Runnable
{
    final /* synthetic */ CardEntryBase a;
    final /* synthetic */ int b;
    final /* synthetic */ CardEntryContainer c;
    
    b(final CardEntryContainer c, final CardEntryBase a, final int b) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    @Override
    public void run() {
        this.a.setTextColor(this.b);
    }
}
