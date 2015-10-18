// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.card;

import com.twitter.library.card.instance.CardInstanceData;
import com.twitter.library.card.Card;
import android.os.AsyncTask;

public class ad extends AsyncTask
{
    private o a;
    private a b;
    private Card c;
    
    public ad(final o a, final a b, final Card c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    protected Void a(final Void... array) {
        this.c.h();
        if (this.a != null && this.b != null && this.b.c()) {
            final CardInstanceData p = this.b.p();
            String s;
            if (this.b.b()) {
                s = p.forwardCardTypeURL;
            }
            else {
                s = p.cardTypeURL;
            }
            this.a.a(s, this.c);
        }
        this.c = null;
        return null;
    }
}
