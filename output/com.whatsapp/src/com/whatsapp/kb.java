// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import java.util.Collection;

class kb implements aws
{
    final MessageDetailsActivity a;
    
    kb(final MessageDetailsActivity a) {
        this.a = a;
    }
    
    @Override
    public void a() {
        MessageDetailsActivity.b(this.a).notifyDataSetChanged();
    }
    
    @Override
    public void a(final String s) {
    }
    
    @Override
    public void a(final Collection collection) {
    }
    
    @Override
    public void b(final String s) {
        if (MessageDetailsActivity.a(this.a, s)) {
            MessageDetailsActivity.b(this.a).notifyDataSetChanged();
        }
    }
    
    @Override
    public void c(final String s) {
    }
    
    @Override
    public void d(final String s) {
    }
}
