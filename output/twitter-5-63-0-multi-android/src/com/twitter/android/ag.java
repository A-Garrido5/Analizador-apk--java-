// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import android.view.View;
import android.view.View$OnClickListener;

class ag implements View$OnClickListener
{
    final /* synthetic */ AdsCompanionWebViewActivity a;
    
    ag(final AdsCompanionWebViewActivity a) {
        this.a = a;
    }
    
    public void onClick(final View view) {
        this.a.finish();
    }
}
