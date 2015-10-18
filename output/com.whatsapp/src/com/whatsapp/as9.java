// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

class as9 implements Runnable
{
    final RegisterPhone a;
    
    as9(final RegisterPhone a) {
        this.a = a;
    }
    
    @Override
    public void run() {
        if (!this.a.q && !this.a.isFinishing()) {
            this.a.showDialog(21);
        }
    }
}
