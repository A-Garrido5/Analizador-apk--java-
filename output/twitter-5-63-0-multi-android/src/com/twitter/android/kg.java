// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import com.twitter.ui.dialog.BaseDialogFragment;
import android.os.Handler;
import android.os.Looper;
import android.preference.PreferenceManager;
import android.os.Parcelable;
import com.twitter.library.featureswitch.d;
import com.twitter.library.client.az;
import android.net.Uri;
import android.content.Intent;
import com.twitter.android.dialog.LoggedOutDialogFragment;
import android.support.v4.app.FragmentActivity;
import com.twitter.library.scribe.ScribeLog;
import com.twitter.library.scribe.ScribeService;
import com.twitter.android.util.AppEventTrack;
import com.twitter.library.scribe.TwitterScribeLog;
import com.twitter.util.k;
import android.content.Context;
import android.app.Activity;

public class kg
{
    private static int a(final int n) {
        switch (n) {
            default: {
                return 0;
            }
            case 1: {
                return 2130839081;
            }
            case 2:
            case 8: {
                return 2130839085;
            }
            case 3: {
                return 2130839084;
            }
            case 4: {
                return 2130839082;
            }
            case 5: {
                return 2130839083;
            }
            case 6: {
                return 2130839083;
            }
            case 7:
            case 9: {
                return 2130839081;
            }
        }
    }
    
    private static String a(final Activity activity, final int n) {
        final String c = c((Context)activity);
        String s = null;
        switch (n) {
            default: {
                throw new IllegalArgumentException("Unknown action " + n);
            }
            case 1: {
                s = "favorite";
                break;
            }
            case 2:
            case 8: {
                s = "retweet";
                break;
            }
            case 3: {
                s = "reply";
                break;
            }
            case 4: {
                s = "follow";
                break;
            }
            case 5: {
                s = "following";
                break;
            }
            case 6: {
                s = "followers";
                break;
            }
            case 7:
            case 9: {
                s = "favorites";
                break;
            }
        }
        return c + ":login_signup_dialog:" + s;
    }
    
    private static String a(final Activity activity, final int n, final String s) {
        int n2 = 0;
        switch (n) {
            default: {
                throw new IllegalArgumentException("Unknown action " + n);
            }
            case -1: {
                n2 = 2131297179;
                break;
            }
            case 1: {
                n2 = 2131297174;
                break;
            }
            case 2: {
                n2 = 2131297181;
                break;
            }
            case 3: {
                n2 = 2131297180;
                break;
            }
            case 4: {
                n2 = 2131297176;
                break;
            }
            case 5: {
                n2 = 2131297178;
                break;
            }
            case 6: {
                n2 = 2131297177;
                break;
            }
            case 7: {
                n2 = 2131297175;
                break;
            }
            case 8: {
                n2 = 2131297183;
                break;
            }
            case 9: {
                n2 = 2131297182;
                break;
            }
        }
        return activity.getString(n2, new Object[] { k.a(s) });
    }
    
    public static void a(final Activity activity, final String s) {
        if (a(activity)) {
            final TwitterScribeLog twitterScribeLog = (TwitterScribeLog)new TwitterScribeLog(0L).b(new String[] { s });
            AppEventTrack.a((Context)activity, twitterScribeLog);
            ScribeService.a((Context)activity, twitterScribeLog);
        }
    }
    
    public static void a(final FragmentActivity fragmentActivity, final int n, final String s) {
        final LoggedOutDialogFragment d = d(fragmentActivity, n, s);
        a(fragmentActivity, d.a() + "::impression");
        d.show(fragmentActivity.getSupportFragmentManager(), "logged_out_dialog_fragment");
    }
    
    public static void a(final boolean b, final Context context, final Intent intent) {
        if (a(context)) {
            intent.putExtra("is_landing_page", b);
        }
    }
    
    public static boolean a(final Activity activity) {
        final Intent intent = activity.getIntent();
        final boolean a = a((Context)activity);
        boolean booleanExtra = false;
        if (a) {
            booleanExtra = false;
            if (intent != null) {
                if (intent.hasExtra("is_landing_page")) {
                    booleanExtra = intent.getBooleanExtra("is_landing_page", false);
                }
                else {
                    final Uri data = intent.getData();
                    booleanExtra = false;
                    if (data != null) {
                        return true;
                    }
                }
            }
        }
        return booleanExtra;
    }
    
    public static boolean a(final Context context) {
        return !az.a(context).b().d() && d.a("logged_out_enabled", true);
    }
    
    public static void b(final Activity activity) {
        final Intent intent = new Intent((Context)activity, (Class)SignUpActivity.class);
        final Intent intent2 = activity.getIntent();
        if (intent2 != null) {
            intent.putExtra("android.intent.extra.INTENT", (Parcelable)intent2);
        }
        SignUpFlowController.a((Context)activity).b(intent);
        activity.startActivity(intent);
    }
    
    public static void b(final Activity activity, final String s) {
        if (a(activity)) {
            PreferenceManager.getDefaultSharedPreferences((Context)activity).edit().putString("logged_out_landing", s).apply();
            a(activity, "external:" + s + ":::impression");
        }
    }
    
    public static void b(final Context context) {
        PreferenceManager.getDefaultSharedPreferences(context).edit().remove("logged_out_landing").apply();
    }
    
    public static void b(final FragmentActivity fragmentActivity, final int n, final String s) {
        new Handler(Looper.getMainLooper()).post((Runnable)new kh(fragmentActivity, d(fragmentActivity, n, s)));
    }
    
    public static String c(final Context context) {
        return PreferenceManager.getDefaultSharedPreferences(context).getString("logged_out_landing", "external");
    }
    
    public static void c(final Activity activity) {
        final Intent intent = new Intent((Context)activity, (Class)LoginActivity.class);
        final Intent intent2 = activity.getIntent();
        if (intent2 != null) {
            intent.putExtra("android.intent.extra.INTENT", (Parcelable)intent2);
        }
        activity.startActivity(intent);
    }
    
    public static void c(final FragmentActivity fragmentActivity, final int n, final String s) {
        int n2;
        if (n == 12) {
            n2 = 8;
        }
        else {
            n2 = 0;
            if (n == 11) {
                n2 = 9;
            }
        }
        a(fragmentActivity, n2, s);
    }
    
    private static LoggedOutDialogFragment d(final FragmentActivity fragmentActivity, final int n, final String s) {
        final LoggedOutDialogFragment loggedOutDialogFragment = (LoggedOutDialogFragment)BaseDialogFragment.a(LoggedOutDialogFragment.class, 0);
        loggedOutDialogFragment.a(a(fragmentActivity, n)).b(a((Activity)fragmentActivity, n, s)).b(a(n));
        return loggedOutDialogFragment;
    }
}
