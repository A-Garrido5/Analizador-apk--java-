// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;

class a6z implements Runnable
{
    final Conversation a;
    
    private a6z(final Conversation a) {
        this.a = a;
    }
    
    a6z(final Conversation conversation, final st st) {
        this(conversation);
    }
    
    @Override
    public void run() {
        final int width = Conversation.w(this.a).getWidth();
        float n;
        if (App.ak()) {
            n = -width;
        }
        else {
            n = width;
        }
        final TranslateAnimation translateAnimation = new TranslateAnimation(0, 0.0f, 0, n, 0, 0.0f, 0, 0.0f);
        ((Animation)translateAnimation).setFillAfter(true);
        ((Animation)translateAnimation).setDuration(800L);
        Conversation.w(this.a).startAnimation((Animation)translateAnimation);
        Conversation.w(this.a).setVisibility(8);
        float n2;
        if (App.ak()) {
            n2 = width;
        }
        else {
            n2 = -width;
        }
        final TranslateAnimation translateAnimation2 = new TranslateAnimation(0, n2, 0, 0.0f, 0, 0.0f, 0, 0.0f);
        ((Animation)translateAnimation2).setFillAfter(true);
        ((Animation)translateAnimation2).setDuration(800L);
        Conversation.U(this.a).startAnimation((Animation)translateAnimation2);
    }
}
