// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.view.animation.Animation;
import android.view.animation.AlphaAnimation;
import android.widget.TextView;

class a8u implements ad2
{
    final VoipActivity a;
    
    a8u(final VoipActivity a) {
        this.a = a;
    }
    
    @Override
    public void a() {
        VoipActivity.g(this.a);
    }
    
    @Override
    public void a(final boolean b) {
        final TextView textView = (TextView)this.a.findViewById(2131755826);
        textView.clearAnimation();
        int text;
        if (b) {
            text = 2131231740;
        }
        else {
            text = 2131231741;
        }
        textView.setText(text);
        textView.setVisibility(0);
        final AlphaAnimation animation = new AlphaAnimation(0.0f, 1.0f);
        ((Animation)animation).setDuration(200L);
        textView.setAnimation((Animation)animation);
        textView.removeCallbacks(VoipActivity.e(this.a));
        textView.postDelayed(VoipActivity.e(this.a), 3000L);
    }
    
    @Override
    public void b() {
        VoipActivity.d(this.a);
    }
}
