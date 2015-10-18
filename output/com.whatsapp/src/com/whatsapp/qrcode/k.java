// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.qrcode;

import android.view.animation.Animation;
import android.view.animation.AlphaAnimation;
import android.view.View;
import android.view.View$OnClickListener;

class k implements View$OnClickListener
{
    final QrCodeActivity a;
    
    k(final QrCodeActivity a) {
        this.a = a;
    }
    
    public void onClick(final View view) {
        this.a.findViewById(2131755734).setVisibility(8);
        this.a.findViewById(2131755732).setVisibility(8);
        final AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        ((Animation)alphaAnimation).setDuration((long)this.a.getResources().getInteger(17694721));
        this.a.findViewById(2131755734).startAnimation((Animation)alphaAnimation);
        this.a.findViewById(2131755732).startAnimation((Animation)alphaAnimation);
        this.a.findViewById(2131755733).setVisibility(0);
        QrCodeActivity.a(this.a, false);
        if (QrCodeActivity.a(this.a)) {
            QrCodeActivity.e(this.a).c().setOneShotPreviewCallback(QrCodeActivity.g(this.a));
        }
    }
}
