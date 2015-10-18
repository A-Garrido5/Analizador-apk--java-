// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.notification;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import com.whatsapp.App;

class c implements Runnable
{
    final PopupNotification a;
    
    c(final PopupNotification a) {
        this.a = a;
    }
    
    @Override
    public void run() {
        final View child = PopupNotification.t(this.a).getChildAt(PopupNotification.a(this.a, 0));
        int n;
        if (App.ak()) {
            n = 1;
        }
        else {
            n = -1;
        }
        final TranslateAnimation translateAnimation = new TranslateAnimation((float)(n * -child.getWidth() / 2), 0.0f, 0.0f, 0.0f);
        ((Animation)translateAnimation).setDuration((long)PopupNotification.g());
        ((Animation)translateAnimation).setFillAfter(true);
        child.startAnimation((Animation)translateAnimation);
    }
}
