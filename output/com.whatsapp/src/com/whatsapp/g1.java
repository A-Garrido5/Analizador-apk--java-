// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.view.animation.Animation;
import android.view.animation.AlphaAnimation;
import android.widget.TextView;

class g1 implements Runnable
{
    final VoipActivity a;
    
    g1(final VoipActivity a) {
        this.a = a;
    }
    
    @Override
    public void run() {
        final TextView textView = (TextView)this.a.findViewById(2131755826);
        final AlphaAnimation animation = new AlphaAnimation(1.0f, 0.0f);
        ((Animation)animation).setDuration(400L);
        textView.setAnimation((Animation)animation);
        textView.setVisibility(4);
    }
}
