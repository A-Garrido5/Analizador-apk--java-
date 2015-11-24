// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.client;

import com.twitter.internal.android.service.a;
import com.twitter.library.service.aa;
import com.twitter.library.service.y;
import java.lang.ref.WeakReference;
import com.twitter.library.service.z;

class az extends z
{
    private WeakReference a;
    
    public az(final SearchSuggestionController searchSuggestionController) {
        this.a = new WeakReference((T)searchSuggestionController);
    }
    
    @Override
    public void a(final y y) {
        if (((aa)y.l().b()).a()) {
            final SearchSuggestionController searchSuggestionController = (SearchSuggestionController)this.a.get();
            if (searchSuggestionController != null) {
                searchSuggestionController.a();
            }
        }
    }
}
