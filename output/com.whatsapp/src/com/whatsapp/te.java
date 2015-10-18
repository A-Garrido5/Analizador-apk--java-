// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import com.whatsapp.protocol.bi;

class te implements Runnable
{
    final bi a;
    final si b;
    
    te(final si b, final bi a) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public void run() {
        if (this.a != null && this.a.a.c.equals(MessageDetailsActivity.e(this.b.a).a.c) && this.a.a.b) {
            MessageDetailsActivity.d(this.b.a);
            MessageDetailsActivity.h(this.b.a).d();
        }
    }
}
