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
import com.twitter.library.provider.ae;
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
import android.view.View;
import android.view.View$OnClickListener;
import com.twitter.android.client.c;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import android.widget.TextView;
import android.view.ViewGroup;
import com.twitter.internal.android.service.a;
import com.twitter.library.api.TwitterUser;
import com.twitter.library.client.Session;
import android.preference.ListPreference;
import android.preference.Preference;
import android.preference.PreferenceCategory;
import com.twitter.library.featureswitch.n;
import android.preference.Preference$OnPreferenceClickListener;
import android.preference.Preference$OnPreferenceChangeListener;
import com.twitter.android.client.TwitterPreferenceActivity;
import com.twitter.library.platform.PushService;
import android.content.Intent;
import android.content.Context;
import android.content.BroadcastReceiver;

class mv extends BroadcastReceiver
{
    final /* synthetic */ NotificationSettingsActivity a;
    
    private mv(final NotificationSettingsActivity a) {
        this.a = a;
    }
    
    public void onReceive(final Context context, final Intent intent) {
        this.a.b(PushService.d.equals(intent.getAction()));
        this.a.removeDialog(1);
    }
}
