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
import org.json.JSONException;
import org.json.JSONObject;
import android.content.Context;
import com.twitter.android.samsung.single.i;

class m implements g
{
    final /* synthetic */ f a;
    final /* synthetic */ int b;
    final /* synthetic */ WidgetDataUpdateService c;
    
    m(final WidgetDataUpdateService c, final f a, final int b) {
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
        i.a((Context)this.c, WidgetDataUpdateService$RequestType.d, n);
        this.c.b.remove(this.a);
        c((Context)this.c, this.b);
    }
    
    public void a(final String s) {
        while (true) {
            try {
                final String string = new JSONObject(s).getString("guest_token");
                if (string != null) {
                    this.c.b.get(this.a).a(string);
                }
                this.c.b.remove(this.a);
            }
            catch (JSONException ex) {
                continue;
            }
            break;
        }
    }
}
