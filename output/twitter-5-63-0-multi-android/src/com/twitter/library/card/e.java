// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.card;

import com.twitter.library.provider.Tweet;
import com.twitter.library.media.manager.ao;
import com.twitter.library.media.manager.h;
import java.lang.ref.WeakReference;
import android.os.AsyncTask;

class e extends AsyncTask
{
    private final WeakReference a;
    private final WeakReference b;
    private final h c;
    private final ao d;
    private final int e;
    
    public e(final Card card, final Tweet tweet, final h c, final ao d, final int e) {
        this.a = new WeakReference((T)tweet);
        this.b = new WeakReference((T)card);
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    protected final Void a(final Void... array) {
        final Tweet tweet = (Tweet)this.a.get();
        final Card card = (Card)this.b.get();
        if (tweet != null && card != null) {
            synchronized (card) {
                if (card.a() == this.e && !card.o()) {
                    card.n();
                    card.a(this.c, this.d);
                }
                card.mToRefresh = false;
            }
        }
        return null;
    }
    
    protected void a(final Void void1) {
        final Card card = (Card)this.b.get();
        if (card != null) {
            synchronized (card) {
                if (card.a() == this.e && !card.o()) {
                    card.i();
                }
            }
        }
    }
}
