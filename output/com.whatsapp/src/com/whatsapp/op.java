// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

class op implements Runnable
{
    final fv a;
    
    op(final fv a) {
        this.a = a;
    }
    
    @Override
    public void run() {
        this.a.a.aI.setFastScrollEnabled(false);
        this.a.a.aI.setTranscriptMode(2);
        this.a.a.aI.setSelection(0);
    }
}
