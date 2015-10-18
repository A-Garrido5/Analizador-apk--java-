// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.composer;

import android.view.View;
import android.view.View$OnClickListener;

class ar implements View$OnClickListener
{
    final /* synthetic */ ComposerDockLayout a;
    
    ar(final ComposerDockLayout a) {
        this.a = a;
    }
    
    public void onClick(final View view) {
        if (this.a.a != null) {
            int n = 0;
            switch (view.getId()) {
                default: {
                    n = 0;
                    break;
                }
                case 2131886755: {
                    n = 1;
                    break;
                }
                case 2131886749: {
                    n = 3;
                    break;
                }
                case 2131886752: {
                    n = 2;
                    break;
                }
            }
            this.a.a.a(n);
        }
    }
}
