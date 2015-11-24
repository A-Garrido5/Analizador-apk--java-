// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import com.whatsapp.protocol.bl;

class tz implements bl
{
    final ChangeNumber a;
    
    tz(final ChangeNumber a) {
        this.a = a;
    }
    
    @Override
    public void a(final String s) {
        if (App.aX.jabber_id.equals(s)) {
            ChangeNumber.a(this.a).sendEmptyMessage(1);
            if (!App.I) {
                return;
            }
        }
        ChangeNumber.a(this.a).sendEmptyMessage(2);
    }
}
