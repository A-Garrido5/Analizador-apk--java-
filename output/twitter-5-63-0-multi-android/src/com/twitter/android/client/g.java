// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.client;

import com.twitter.android.provider.SuggestionsProvider;
import android.app.SearchManager$OnDismissListener;

class g implements SearchManager$OnDismissListener
{
    final /* synthetic */ c a;
    
    g(final c a) {
        this.a = a;
    }
    
    public void onDismiss() {
        SuggestionsProvider.a();
    }
}
