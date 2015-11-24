// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.api.account;

import com.twitter.library.service.aa;
import com.twitter.library.service.f;
import com.twitter.library.service.m;
import com.twitter.internal.android.service.y;
import com.twitter.library.service.ab;
import com.twitter.library.client.Session;
import java.util.Arrays;
import com.twitter.library.network.a;
import java.util.Collection;
import com.twitter.library.service.c;
import com.twitter.library.network.e;
import com.twitter.internal.network.l;
import com.twitter.internal.network.HttpOperation;
import android.content.Context;
import com.twitter.library.service.q;

class j extends q
{
    final /* synthetic */ i a;
    private final Context e;
    private int f;
    
    public j(final i a, final Context context) {
        this.a = a;
        super(i.a);
        this.e = context.getApplicationContext();
    }
    
    @Override
    protected boolean a(final HttpOperation httpOperation, final l l) {
        if (this.f++ == 0) {
            int n;
            if (l.a == 401) {
                n = 1;
            }
            else if (l.a == 403 && l.j == 239) {
                n = 1;
            }
            else {
                n = 0;
            }
            if (n != 0) {
                com.twitter.library.network.e.b(this.e);
                this.a.g = false;
            }
            return true;
        }
        return false;
    }
}
