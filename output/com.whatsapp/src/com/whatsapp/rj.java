// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import com.whatsapp.protocol.bl;

class rj implements bl
{
    final DeleteAccount a;
    
    rj(final DeleteAccount a) {
        this.a = a;
    }
    
    @Override
    public void a(final String s) {
        if (App.aX.jabber_id.equals(s)) {
            DeleteAccount.a(this.a).sendEmptyMessage(1);
            if (!App.I) {
                return;
            }
        }
        DeleteAccount.a(this.a).sendEmptyMessage(2);
    }
}
