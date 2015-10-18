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
import com.twitter.android.samsung.single.i;
import java.util.Locale;
import java.util.HashMap;
import java.util.Map;
import android.app.Service;
import com.twitter.library.api.search.j;
import android.content.Context;

class p extends k
{
    final /* synthetic */ int a;
    final /* synthetic */ int b;
    final /* synthetic */ WidgetDataUpdateService c;
    
    p(final WidgetDataUpdateService c, final int a, final int b) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    @Override
    void a(final int n, final String s) {
        super.a(n, s);
        c((Context)this.c, this.b);
    }
    
    @Override
    void a(final j j) {
        this.c.e(this.a);
        c((Context)this.c, this.b);
    }
}
