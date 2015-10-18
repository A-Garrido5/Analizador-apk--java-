// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.client;

import com.twitter.internal.android.service.a;
import com.twitter.library.api.search.TwitterTypeAheadGroup;
import com.twitter.android.provider.SuggestionsProvider;
import com.twitter.library.service.aa;
import com.twitter.library.service.y;
import java.lang.ref.WeakReference;
import com.twitter.library.service.z;

class ay extends z
{
    private WeakReference a;
    
    public ay(final SearchSuggestionController searchSuggestionController) {
        this.a = new WeakReference((T)searchSuggestionController);
    }
    
    @Override
    public void a(final y y) {
        final com.twitter.library.api.search.z z = (com.twitter.library.api.search.z)y;
        if (((aa)y.l().b()).a() && z.e() == 0) {
            final TwitterTypeAheadGroup g = z.g();
            SuggestionsProvider.a(z.f(), g);
            if (!g.a()) {
                final SearchSuggestionController searchSuggestionController = (SearchSuggestionController)this.a.get();
                if (searchSuggestionController != null) {
                    searchSuggestionController.a();
                }
            }
        }
    }
}
