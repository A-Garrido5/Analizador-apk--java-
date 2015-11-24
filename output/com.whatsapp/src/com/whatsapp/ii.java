// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

class ii implements Runnable
{
    final MultipleContactPicker a;
    
    ii(final MultipleContactPicker a) {
        this.a = a;
    }
    
    @Override
    public void run() {
        this.a.c().setSelection(0);
    }
}
