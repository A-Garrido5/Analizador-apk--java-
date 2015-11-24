// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import java.util.Collection;

class a83 implements aws
{
    final CallsFragment a;
    
    a83(final CallsFragment a) {
        this.a = a;
    }
    
    @Override
    public void a() {
        CallsFragment.c(this.a).getFilter().filter(CallsFragment.e(this.a));
    }
    
    @Override
    public void a(final String s) {
    }
    
    @Override
    public void a(final Collection collection) {
    }
    
    @Override
    public void b(final String s) {
        CallsFragment.c(this.a).notifyDataSetChanged();
    }
    
    @Override
    public void c(final String s) {
    }
    
    @Override
    public void d(final String s) {
    }
}
