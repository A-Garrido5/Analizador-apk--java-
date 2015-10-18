// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import com.twitter.library.scribe.ScribeLog;
import com.twitter.android.util.AppEventTrack;
import com.twitter.library.scribe.TwitterScribeLog;
import com.twitter.library.provider.f;
import com.twitter.library.provider.b;
import android.content.Intent;
import com.twitter.library.util.a;
import android.os.Bundle;
import android.content.Context;
import android.accounts.AccountAuthenticatorResponse;
import com.twitter.library.client.az;
import com.twitter.library.client.Session;
import android.app.Activity;
import com.twitter.android.client.c;
import java.util.regex.Pattern;

public class kq
{
    public static final Pattern a;
    public static final Pattern b;
    
    static {
        a = Pattern.compile("[0-9]+");
        b = Pattern.compile("^\\+?[0-9\\-\\.\\(\\)\\s]{7,1000}$");
    }
    
    public static int a(final c c, final long n, final String s) {
        if (s.matches("^[0-9]{7,}$")) {
            c.a(n, "login:form::identifier:invalid");
            return 2131297189;
        }
        if (s.matches("^@?[A-Za-z0-9_]+$")) {
            c.a(n, "login:form::identifier:invalid_username");
            return 2131297192;
        }
        if (kq.b.matcher(s).matches()) {
            c.a(n, "login:form::identifier:invalid_phone");
            return 2131297191;
        }
        if (s.matches("^.+@.+$")) {
            c.a(n, "login:form::identifier:invalid_email");
            return 2131297190;
        }
        c.a(n, "login:form::identifier:invalid");
        return 2131297189;
    }
    
    public static void a(final Activity activity, final Session session, final boolean b, final String s, final az az) {
        final Intent intent = activity.getIntent();
        if (b) {
            final AccountAuthenticatorResponse accountAuthenticatorResponse = (AccountAuthenticatorResponse)intent.getParcelableExtra("accountAuthenticatorResponse");
            kg.b((Context)activity);
            if (accountAuthenticatorResponse != null) {
                final Bundle bundle = new Bundle();
                bundle.putString("authAccount", session.e());
                bundle.putString("accountType", com.twitter.library.util.a.a);
                bundle.putString("account_user_info", s);
                accountAuthenticatorResponse.onResult(bundle);
            }
            az.c(session);
            cm.a();
        }
    }
    
    public static void a(final Activity activity, final boolean b, final long n, final c c) {
        final b b2 = new b(activity.getContentResolver());
        f.a((Context)activity, n).a(b2);
        b2.a();
        final TwitterScribeLog twitterScribeLog = (TwitterScribeLog)new TwitterScribeLog(n).b(new String[] { "login::::success" });
        if (b) {
            twitterScribeLog.g("sso_sdk");
        }
        AppEventTrack.a((Context)activity, twitterScribeLog);
        c.a(twitterScribeLog);
    }
}
