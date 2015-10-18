// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.card;

import com.twitter.internal.network.HttpOperation;
import java.net.URI;
import com.twitter.library.card.m;
import com.twitter.library.media.manager.ao;
import com.twitter.library.media.manager.h;
import com.twitter.library.provider.Tweet;
import com.twitter.library.client.Session;
import com.twitter.library.card.instance.CardInstanceData;
import com.twitter.library.network.g;
import com.twitter.library.network.t;
import com.twitter.library.util.bn;
import com.twitter.library.client.az;
import android.content.Context;
import com.fasterxml.jackson.core.JsonParser;
import java.io.Closeable;
import com.twitter.library.card.k;
import com.twitter.library.api.bh;
import android.os.AsyncTask;
import com.twitter.internal.network.l;
import java.io.IOException;
import java.io.InputStream;
import com.twitter.library.card.Card;
import com.twitter.internal.network.j;

public class r implements j
{
    public Card a;
    public String b;
    
    @Override
    public void a(final int n, final InputStream inputStream, final int n2, final String s, final String s2) {
        if (n == 200) {
            try {
                this.a = b(inputStream);
                return;
            }
            catch (IOException ex) {
                this.b = ex.toString();
                return;
            }
        }
        this.a = null;
    }
    
    @Override
    public void a(final l l) {
        this.b = l.a + " - " + l.b;
        this.a = null;
    }
}
