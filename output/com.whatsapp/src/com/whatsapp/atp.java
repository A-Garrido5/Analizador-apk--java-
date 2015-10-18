// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

class atp implements og
{
    final WebSessionsActivity a;
    
    atp(final WebSessionsActivity a) {
        this.a = a;
    }
    
    @Override
    public void a() {
        if (!this.a.isFinishing()) {
            this.a.runOnUiThread((Runnable)new aaq(this));
        }
    }
    
    @Override
    public void a(final int n) {
    }
}
