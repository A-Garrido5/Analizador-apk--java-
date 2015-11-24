// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import java.util.Collection;

class a2c implements aws
{
    final Broadcasts a;
    
    a2c(final Broadcasts a) {
        this.a = a;
    }
    
    @Override
    public void a() {
        Broadcasts.a(this.a).notifyDataSetChanged();
    }
    
    @Override
    public void a(final String s) {
        Broadcasts.a(this.a).notifyDataSetChanged();
    }
    
    @Override
    public void a(final Collection collection) {
    }
    
    @Override
    public void b(final String s) {
        Broadcasts.a(this.a).notifyDataSetChanged();
    }
    
    @Override
    public void c(final String s) {
        Broadcasts.a(this.a).notifyDataSetChanged();
    }
    
    @Override
    public void d(final String s) {
        Broadcasts.a(this.a).notifyDataSetChanged();
    }
}
