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
import com.twitter.android.samsung.single.i;
import android.content.Context;

class r extends k
{
    final /* synthetic */ int a;
    final /* synthetic */ WidgetDataUpdateService b;
    
    r(final WidgetDataUpdateService b, final int a) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    void a(final int n, final String s) {
        super.a(n, s);
        switch (n) {
            default: {
                c((Context)this.b, this.a);
            }
            case 239: {
                i.f((Context)this.b);
                this.b.b(this.a);
            }
        }
    }
    
    @Override
    void a(final long n) {
        this.b.a(n);
        c((Context)this.b, this.a);
    }
}
