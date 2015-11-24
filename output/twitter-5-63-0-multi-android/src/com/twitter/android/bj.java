// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import com.twitter.library.card.CardDebugLog;
import android.view.View;
import android.view.View$OnClickListener;

class bj implements View$OnClickListener
{
    final /* synthetic */ CardDebugFragment a;
    
    bj(final CardDebugFragment a) {
        this.a = a;
    }
    
    public void onClick(final View view) {
        CardDebugLog.g();
    }
}
