// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.commerce.view;

import android.view.View;
import android.view.View$OnClickListener;

class m implements View$OnClickListener
{
    final /* synthetic */ OfferSinglePageNUXActivity a;
    
    m(final OfferSinglePageNUXActivity a) {
        this.a = a;
    }
    
    public void onClick(final View view) {
        this.a.finish();
    }
}
