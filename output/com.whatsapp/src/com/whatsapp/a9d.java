// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

class a9d implements Runnable
{
    final Conversation a;
    
    a9d(final Conversation a) {
        this.a = a;
    }
    
    @Override
    public void run() {
        this.a.aI.setFastScrollEnabled(false);
        this.a.aI.setTranscriptMode(2);
        this.a.u.notifyDataSetChanged();
    }
}
