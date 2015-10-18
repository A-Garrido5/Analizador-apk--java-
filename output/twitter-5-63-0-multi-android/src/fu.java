import android.os.Handler;
import com.twitter.library.provider.ae;
import com.twitter.android.GCMChangeReceiver;
import com.twitter.android.samsung.single.TwitterWidgetProvider;
import android.content.BroadcastReceiver;
import android.content.IntentFilter;
import com.twitter.android.client.AppBroadcastReceiver;
import android.content.Context;

// 
// Decompiled by Procyon v0.5.30
// 

public class fu extends ts
{
    protected void a(final Context context, final Void void1) {
        context.registerReceiver((BroadcastReceiver)new AppBroadcastReceiver(), new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        final IntentFilter intentFilter = new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE");
        intentFilter.addAction("android.net.wifi.WIFI_STATE_CHANGED");
        context.registerReceiver((BroadcastReceiver)new TwitterWidgetProvider(), intentFilter);
        context.registerReceiver((BroadcastReceiver)new GCMChangeReceiver(), GCMChangeReceiver.a, ae.a, (Handler)null);
    }
}
