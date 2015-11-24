// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

class bl implements Runnable
{
    final MessageDetailsActivity a;
    
    bl(final MessageDetailsActivity a) {
        this.a = a;
    }
    
    @Override
    public void run() {
        MessageDetailsActivity.b(this.a).notifyDataSetChanged();
        MessageDetailsActivity.g(this.a);
    }
}
