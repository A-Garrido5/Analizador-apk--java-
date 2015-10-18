// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.gdrive;

class y implements Runnable
{
    final a1 a;
    
    y(final a1 a) {
        this.a = a;
    }
    
    @Override
    public void run() {
        if (!this.a.a.a.isFinishing()) {
            this.a.a.a.findViewById(2131755196).setVisibility(8);
        }
    }
}
