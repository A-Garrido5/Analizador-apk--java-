// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;

class a25 implements Runnable
{
    final Conversation a;
    
    a25(final Conversation a) {
        this.a = a;
    }
    
    @Override
    public void run() {
        if (Conversation.I(this.a) != null) {
            Conversation.I(this.a).setVisibility(8);
        }
        if (Conversation.F(this.a) != null) {
            Conversation.F(this.a).setVisibility(8);
        }
        if (Conversation.n(this.a) != null && Conversation.n(this.a).getVisibility() != 8) {
            Conversation.n(this.a).setVisibility(8);
            final TranslateAnimation translateAnimation = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 0.0f, 1, -1.0f);
            ((Animation)translateAnimation).setDuration(200L);
            Conversation.n(this.a).startAnimation((Animation)translateAnimation);
        }
    }
}
