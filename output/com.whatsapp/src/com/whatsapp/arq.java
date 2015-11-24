// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

class arq implements Runnable
{
    final ChatInfoLayout a;
    
    arq(final ChatInfoLayout a) {
        this.a = a;
    }
    
    @Override
    public void run() {
        ChatInfoLayout.c(this.a).setSelectionFromTop(0, 0);
    }
}
