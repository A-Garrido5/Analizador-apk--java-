// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.client;

import java.util.Iterator;
import com.twitter.library.provider.k;
import com.twitter.library.util.a;
import android.database.Cursor;
import android.net.Uri$Builder;
import com.twitter.library.provider.ad;
import com.twitter.library.provider.Tweet;
import android.content.ContentUris;
import com.twitter.library.provider.az;
import java.util.ArrayList;
import android.content.Intent;
import android.content.Context;
import java.util.HashMap;
import android.app.IntentService;

public class WidgetService extends IntentService
{
    private static final HashMap a;
    
    static {
        (a = new HashMap()).put("open", 1);
        WidgetService.a.put("close", 2);
        WidgetService.a.put("refresh", 3);
        WidgetService.a.put("clear_logged_out", 4);
        WidgetService.a.put("on_update", 5);
        WidgetService.a.put("on_delete", 6);
    }
    
    public WidgetService() {
        super("WidgetService");
    }
    
    private static WidgetControl a(final Context context, final Intent intent) {
        return cj.a(context).a(intent.getLongExtra("owner_id", 0L));
    }
    
    private static ArrayList a(final Context context, final long n, final int n2, final long n3) {
        final String value = String.valueOf(n);
        while (true) {
            Label_0179: {
                if (n2 != 5) {
                    break Label_0179;
                }
                final Uri$Builder uri$Builder = ContentUris.withAppendedId(az.g, n).buildUpon();
                uri$Builder.appendQueryParameter("limit", Integer.toString(20)).appendQueryParameter("ownerId", value);
                if (n3 > 0L) {
                    uri$Builder.appendQueryParameter("newer", Long.toString(n3));
                }
                final Cursor query = context.getContentResolver().query(uri$Builder.build(), Tweet.a, "type=?", new String[] { String.valueOf(n2) }, "preview_draft_id DESC, updated_at DESC, _id ASC");
                final ArrayList<Tweet> list = new ArrayList<Tweet>();
                if (query != null) {
                    Label_0194: {
                        try {
                            if (query.moveToFirst()) {
                                while (query.moveToNext()) {
                                    list.add(new ad(query).a());
                                }
                            }
                            break Label_0194;
                        }
                        finally {
                            query.close();
                        }
                        break Label_0179;
                    }
                    query.close();
                }
                return list;
            }
            final Uri$Builder uri$Builder = ContentUris.withAppendedId(az.i, n).buildUpon();
            continue;
        }
    }
    
    private static void a(final Context context, final WidgetControl widgetControl, final long n, final long n2) {
        final long e = widgetControl.e;
        widgetControl.a(0, n, a(context, e, 0, n));
        widgetControl.a(5, n2, a(context, e, 5, n2));
    }
    
    protected void onHandleIntent(final Intent intent) {
        if (intent != null) {
            final Integer n = WidgetService.a.get(intent.getAction());
            int intValue;
            if (n == null) {
                intValue = 0;
            }
            else {
                intValue = n;
            }
            switch (intValue) {
                default: {}
                case 1: {
                    final Context applicationContext = this.getApplicationContext();
                    final WidgetControl a = a(applicationContext, intent);
                    if (a != null) {
                        final String d = a.d;
                        if (com.twitter.library.util.a.a(applicationContext).length < 2) {
                            k.a(applicationContext).c("", d);
                        }
                        a.a();
                        a.d(2);
                        a(applicationContext, a, 0L, 0L);
                        return;
                    }
                    break;
                }
                case 2: {
                    final Context applicationContext2 = this.getApplicationContext();
                    final WidgetControl a2 = a(applicationContext2, intent);
                    if (a2 != null) {
                        k.a(applicationContext2).c(a2.d, "");
                        final int intExtra = intent.getIntExtra("widget_state", 1);
                        a2.a();
                        a2.d(intExtra);
                        return;
                    }
                    break;
                }
                case 3: {
                    final Context applicationContext3 = this.getApplicationContext();
                    final WidgetControl a3 = a(applicationContext3, intent);
                    if (a3 != null) {
                        a3.a();
                        a(applicationContext3, a3, intent.getLongExtra("latest_time_tweets", 0L), intent.getLongExtra("latest_time_mentions", 0L));
                        return;
                    }
                    break;
                }
                case 4: {
                    final Context applicationContext4 = this.getApplicationContext();
                    final int intExtra2 = intent.getIntExtra("widget_provider", 2131165189);
                    int n2;
                    int n3;
                    if (intExtra2 == 2131165189) {
                        n2 = 2130969212;
                        n3 = 2130969207;
                    }
                    else {
                        n2 = 2130969223;
                        n3 = 2130969208;
                    }
                    final ck ck = new ck(intExtra2, n2, n3, "");
                    ck.a(applicationContext4, ck.a(applicationContext4));
                    WidgetControl.a(applicationContext4, ck, 0, "", 0);
                }
                case 5: {
                    final Context applicationContext5 = this.getApplicationContext();
                    final int intExtra3 = intent.getIntExtra("widget_provider", 2131165189);
                    for (final WidgetControl widgetControl : cj.a(applicationContext5).b()) {
                        widgetControl.a();
                        widgetControl.c(intExtra3);
                    }
                    break;
                }
                case 6: {
                    k.a((Context)this).a(intent.getIntArrayExtra("widget_ids"));
                }
            }
        }
    }
}
