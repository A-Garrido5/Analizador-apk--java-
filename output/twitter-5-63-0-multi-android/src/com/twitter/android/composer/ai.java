// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.composer;

import android.view.animation.Animation;
import android.content.res.Resources;
import android.widget.ImageButton;
import com.twitter.library.util.f;

class ai extends f
{
    final /* synthetic */ ImageButton a;
    final /* synthetic */ Resources b;
    final /* synthetic */ Animation c;
    final /* synthetic */ ComposerActivity d;
    
    ai(final ComposerActivity d, final ImageButton a, final Resources b, final Animation c) {
        this.d = d;
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public void onAnimationEnd(final Animation animation) {
        this.a.setImageDrawable(this.b.getDrawable(2130837686));
        this.a.startAnimation(this.c);
    }
}
