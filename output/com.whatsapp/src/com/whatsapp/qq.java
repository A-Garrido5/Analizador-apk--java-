// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

class qq implements Runnable
{
    final VoiceService$VoiceServiceEventCallback a;
    
    qq(final VoiceService$VoiceServiceEventCallback a) {
        this.a = a;
    }
    
    @Override
    public void run() {
        this.a.bufferQueue.a();
    }
}
