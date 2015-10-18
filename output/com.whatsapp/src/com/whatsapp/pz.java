// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import java.util.Collection;

class pz implements aws
{
    final MediaView a;
    
    pz(final MediaView a) {
        this.a = a;
    }
    
    @Override
    public void a() {
    }
    
    @Override
    public void a(final String s) {
    }
    
    @Override
    public void a(final Collection collection) {
    }
    
    @Override
    public void b(final String s) {
        if (MediaView.p(this.a) != null && MediaView.p(this.a).equals(s)) {
            this.a.removeDialog(1);
            if (!App.I) {
                return;
            }
        }
        final a_d e = App.S.e();
        if (e != null && s.equals(e.u)) {
            this.a.removeDialog(0);
        }
    }
    
    @Override
    public void c(final String s) {
    }
    
    @Override
    public void d(final String s) {
    }
}
