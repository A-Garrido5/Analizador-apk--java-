// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.samsung.data;

import android.os.IBinder;
import java.util.Iterator;
import com.twitter.library.util.bq;
import android.accounts.Account;
import android.widget.Toast;
import android.accounts.AccountManager;
import com.twitter.library.network.OAuthToken;
import android.content.Intent;
import com.twitter.android.samsung.single.TwitterWidgetProvider;
import java.util.Locale;
import java.util.HashMap;
import java.util.Map;
import android.app.Service;
import com.twitter.library.api.search.j;
import android.content.Context;
import com.twitter.android.samsung.single.i;

class q implements g
{
    final /* synthetic */ f a;
    final /* synthetic */ int b;
    final /* synthetic */ WidgetDataUpdateService c;
    
    q(final WidgetDataUpdateService c, final f a, final int b) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    @Override
    public void a(final int n, final String s, final Exception ex) {
        this.c.b.get(this.a).a(n, s, ex);
        this.c.b.remove(this.a);
    }
    
    @Override
    public void a(final long n) {
        i.a((Context)this.c, WidgetDataUpdateService$RequestType.b, n);
        this.c.b.remove(this.a);
        c((Context)this.c, this.b);
    }
    
    public void a(final j j) {
        this.c.b.get(this.a).a(j);
        this.c.b.remove(this.a);
    }
}
