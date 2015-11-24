// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

class l0 implements Runnable
{
    final int a;
    final Conversation b;
    
    l0(final Conversation b, final int a) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public void run() {
        this.b.aI.setTranscriptMode(0);
        int a = nm.a(this.b.u);
        if (Conversation.e(this.b) != null) {
            ++a;
        }
        this.b.aI.setSelectionFromTop(a, this.a);
        Conversation.f(this.b, false);
        Conversation.a(this.b, false);
    }
}
