// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.api;

import android.util.Pair;
import com.twitter.library.service.d;
import com.twitter.library.service.aa;
import com.twitter.internal.network.HttpOperation;
import com.twitter.library.service.ab;
import android.content.Context;
import java.util.ArrayList;
import com.twitter.library.api.account.i;

abstract class f extends i
{
    protected final String a;
    protected String e;
    protected ArrayList f;
    
    public f(final Context context, final String s, final ab ab, final String a) {
        super(context, s, ab);
        this.a = a;
    }
    
    protected void a(final HttpOperation httpOperation, final aa aa, final bg bg) {
        super.a(httpOperation, aa, bg);
        if (httpOperation.j()) {
            final Pair pair = (Pair)bg.a();
            this.e = (String)pair.first;
            this.f = (ArrayList)pair.second;
        }
    }
    
    @Override
    protected com.twitter.library.service.f b() {
        return this.M().b(new Object[] { "users" }).b(new Object[] { "suggestions" }).a(new Object[] { this.a });
    }
    
    protected bg e() {
        return bg.a(89);
    }
}
