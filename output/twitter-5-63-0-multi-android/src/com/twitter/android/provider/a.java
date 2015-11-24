// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.provider;

import com.twitter.library.api.z;
import com.twitter.library.api.search.TwitterTypeAhead;

public class a implements yg
{
    public boolean a(final TwitterTypeAhead twitterTypeAhead) {
        return twitterTypeAhead != null && twitterTypeAhead.e != null && z.h(twitterTypeAhead.e.friendship);
    }
}
