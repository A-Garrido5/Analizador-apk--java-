// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import com.twitter.android.client.TwitterListFragment;
import android.content.Intent;
import com.twitter.android.client.bn;
import android.os.Bundle;

public class CollectionPermalinkActivity extends TimelineActivity
{
    @Override
    public bn a(final Bundle bundle, final bn bn) {
        final bn a = super.a(bundle, bn);
        a.e(true);
        return a;
    }
    
    @Override
    protected jy a(final Intent intent, final bn bn) {
        final tk tk = (tk)bn;
        final CollectionPermalinkFragment collectionPermalinkFragment = new CollectionPermalinkFragment();
        collectionPermalinkFragment.a(intent).h(tk.a);
        return new jy(collectionPermalinkFragment);
    }
}
