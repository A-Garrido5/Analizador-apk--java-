// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.client;

import com.twitter.library.platform.DataSyncResult;
import com.twitter.library.api.PromotedContent;
import com.twitter.library.scribe.TwitterScribeLog;
import com.twitter.util.platform.l;
import com.twitter.util.platform.j;
import com.twitter.util.platform.i;
import com.twitter.library.telephony.TelephonyUtil;
import com.twitter.library.client.App;
import android.content.Intent;
import com.twitter.library.client.az;
import com.twitter.library.client.Session;
import android.content.Context;
import com.twitter.android.card.u;
import com.twitter.library.provider.ae;
import com.twitter.library.platform.TwitterDataSyncService;
import java.util.HashMap;
import android.content.BroadcastReceiver;

public class AppBroadcastReceiver extends BroadcastReceiver
{
    private static final HashMap a;
    
    static {
        (a = new HashMap(8)).put(TwitterDataSyncService.a, 1);
        AppBroadcastReceiver.a.put(WidgetControl.a, 2);
        AppBroadcastReceiver.a.put(WidgetControl.b, 3);
        AppBroadcastReceiver.a.put(WidgetControl.c, 4);
        AppBroadcastReceiver.a.put("android.net.conn.CONNECTIVITY_CHANGE", 5);
        AppBroadcastReceiver.a.put(ae.b, 6);
        AppBroadcastReceiver.a.put(u.a, 7);
        AppBroadcastReceiver.a.put(WebsiteDwellMonitor.a, 8);
    }
    
    Session a(final Context context) {
        return az.a(context).b();
    }
    
    public void onReceive(final Context context, final Intent intent) {
        final Integer n = AppBroadcastReceiver.a.get(intent.getAction());
        if (n != null) {
            final int intValue = n;
            final boolean hasExtra = intent.hasExtra("logged_out_notification");
            if (intValue == 5) {
                if (App.b()) {
                    final String b = TelephonyUtil.b(context);
                    if (b != null && b.replaceAll("\"", "").equals("Dodo")) {
                        o.a(context);
                    }
                }
                final boolean c = TelephonyUtil.c();
                TelephonyUtil.d(context);
                i.a().a(new j(context));
                final bh a = bh.a(context);
                if (a.e() && c != TelephonyUtil.c()) {
                    a.a();
                }
            }
            if (this.a(context).d() && !hasExtra) {
                final c a2 = c.a(context);
                switch (intValue) {
                    default: {}
                    case 1: {
                        a2.a(intent);
                    }
                    case 2: {
                        cj.a(context).a(intent);
                    }
                    case 3: {
                        cj.a(context).b(intent);
                    }
                    case 4: {
                        final int intExtra = intent.getIntExtra("widget_provider", 0);
                        if (intExtra > 0) {
                            final Intent putExtra = new Intent(context, (Class)WidgetService.class).putExtra("widget_provider", intExtra);
                            if (az.a(context).b().d()) {
                                cj.a(context).a();
                                putExtra.setAction("on_update");
                            }
                            else {
                                putExtra.setAction("clear_logged_out");
                            }
                            context.startService(putExtra);
                            return;
                        }
                        break;
                    }
                    case 6: {
                        a2.a(intent.getStringArrayExtra("url"), new int[] { -3, -1 });
                    }
                    case 7: {
                        try {
                            a2.a(context, intent.getStringExtra("app_id"), (TwitterScribeLog)intent.getParcelableExtra("scribe_log"), (TwitterScribeLog)intent.getParcelableExtra("scribe_download_log"), (PromotedContent)intent.getSerializableExtra("promoted_content"), intent.getLongExtra("timestamp", 0L), intent.getLongExtra("timeframe", 1800000L), intent.getLongExtra("polling_interval", 600000L));
                        }
                        catch (RuntimeException ex) {}
                    }
                    case 8: {
                        WebsiteDwellMonitor.a(context, intent);
                    }
                }
            }
            else if (hasExtra && intValue == 1) {
                x.a(context).b((DataSyncResult)intent.getParcelableExtra("logged_out_notification"));
            }
        }
    }
}
