// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.platform;

import java.util.List;
import android.content.Intent;
import java.nio.charset.Charset;
import java.io.File;
import android.text.TextUtils;
import com.twitter.android.util.AppEventTrack;
import android.content.Context;
import android.content.BroadcastReceiver;

public class OemIntentReceiver extends BroadcastReceiver
{
    private static String a;
    private static boolean b;
    
    static {
        OemIntentReceiver.b = false;
    }
    
    public static void a(final Context context) {
        if (AppEventTrack.b(context)) {
            return;
        }
        String a;
        if (OemIntentReceiver.b) {
            a = OemIntentReceiver.a;
        }
        else {
            a = "";
        }
        if (!TextUtils.isEmpty((CharSequence)a)) {
            InstallReferralReceiver.a(context, a);
            AppEventTrack.b(context, a);
            return;
        }
        final File file = new File(context.getFilesDir(), "oem");
        if (file.exists()) {
            final List a2 = yh.a(file, Charset.forName("UTF-8"));
            if (a2.size() > 0) {
                final String s = a2.get(0);
                InstallReferralReceiver.a(context, s);
                AppEventTrack.b(context, s);
                return;
            }
        }
        final Intent intent = new Intent();
        intent.setAction("com.twitter.intent.action.GET_OEM");
        intent.setClassName("com.twitter.twitteroemhelper", "com.twitter.twitteroemhelper.OemHelperService");
        context.startService(intent);
    }
    
    public void onReceive(final Context context, final Intent intent) {
        if (!AppEventTrack.b(context)) {
            final String stringExtra = intent.getStringExtra("OEM");
            if (!TextUtils.isEmpty((CharSequence)stringExtra)) {
                InstallReferralReceiver.a(context, stringExtra);
                AppEventTrack.b(context, stringExtra);
            }
        }
    }
}
