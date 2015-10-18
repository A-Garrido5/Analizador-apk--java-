// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import com.twitter.library.util.bq;
import android.content.DialogInterface$OnCancelListener;
import android.app.ProgressDialog;
import android.app.Dialog;
import com.twitter.android.widget.CheckBoxListPreference;
import android.os.Bundle;
import android.widget.Toast;
import com.twitter.library.api.account.p;
import android.os.Handler;
import android.content.BroadcastReceiver;
import com.twitter.library.provider.ae;
import com.twitter.library.platform.PushService;
import android.content.IntentFilter;
import com.google.android.gcm.b;
import com.twitter.android.commerce.util.e;
import com.twitter.library.client.az;
import com.twitter.android.util.bi;
import java.io.Serializable;
import com.twitter.library.featureswitch.d;
import com.twitter.errorreporter.ErrorReporter;
import android.preference.PreferenceGroup;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.widget.TextView;
import android.view.ViewGroup;
import com.twitter.internal.android.service.a;
import android.content.Intent;
import com.twitter.library.api.TwitterUser;
import com.twitter.library.client.Session;
import android.preference.ListPreference;
import android.preference.Preference;
import android.preference.PreferenceCategory;
import com.twitter.library.featureswitch.n;
import android.preference.Preference$OnPreferenceClickListener;
import android.preference.Preference$OnPreferenceChangeListener;
import com.twitter.android.client.TwitterPreferenceActivity;
import android.content.Context;
import android.preference.PreferenceManager;
import android.view.View;
import com.twitter.android.client.c;
import android.view.View$OnClickListener;

final class mt implements View$OnClickListener
{
    final /* synthetic */ String a;
    final /* synthetic */ String b;
    final /* synthetic */ String c;
    final /* synthetic */ c d;
    final /* synthetic */ long e;
    final /* synthetic */ String f;
    
    mt(final String a, final String b, final String c, final c d, final long e, final String f) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }
    
    public void onClick(final View view) {
        final Context context = view.getContext();
        context.startActivity(b(context, this.a, this.b));
        PreferenceManager.getDefaultSharedPreferences(context).edit().putInt(this.c, -1).apply();
        this.d.a(this.e, this.f);
    }
}
