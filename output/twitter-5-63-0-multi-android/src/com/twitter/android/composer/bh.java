// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.composer;

import com.twitter.library.client.App;
import com.twitter.library.provider.b;
import com.twitter.library.provider.f;
import com.twitter.library.provider.DraftTweet;
import com.twitter.library.client.Session;
import android.content.Context;
import com.twitter.internal.android.service.a;

public class bh extends a
{
    private final Context a;
    private final Session e;
    private final DraftTweet f;
    private final boolean g;
    
    public bh(final Context a, final Session e, final DraftTweet f, final boolean g) {
        super(bh.class.getName());
        this.a = a;
        this.e = e;
        this.f = f;
        this.g = g;
    }
    
    protected Long a() {
        final f a = com.twitter.library.provider.f.a(this.a, this.e.g());
        final b b = new b(this.a.getContentResolver());
        final DraftTweet f = this.f;
        int n;
        if (this.g) {
            n = 1;
        }
        else {
            n = 0;
        }
        final long a2 = a.a(f, n, b);
        b.a();
        return a2;
    }
    
    protected Long b() {
        if (App.a()) {
            throw new UnsupportedOperationException("SaveDraftOperation.cancel is not supported!");
        }
        return null;
    }
}
