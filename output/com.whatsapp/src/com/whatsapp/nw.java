// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import com.whatsapp.util.b4;

class nw implements b4
{
    final VoiceService a;
    
    nw(final VoiceService a) {
        this.a = a;
    }
    
    @Override
    public void a(final boolean b) {
        if (b) {
            VoiceService.w(this.a);
            if (!App.I) {
                return;
            }
        }
        VoiceService.b(this.a);
    }
}
