// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.widget;

import android.view.View;
import android.view.View$OnClickListener;

class ae implements View$OnClickListener
{
    final /* synthetic */ ComposerSelectionFragment a;
    
    ae(final ComposerSelectionFragment a) {
        this.a = a;
    }
    
    public void onClick(final View view) {
        if (this.a.k != null) {
            this.a.k.a();
        }
    }
}
