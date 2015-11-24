// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import android.app.Activity;
import com.twitter.util.k;
import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.DialogInterface$OnDismissListener;
import android.content.DialogInterface$OnCancelListener;
import android.app.AlertDialog$Builder;
import android.app.Dialog;
import android.preference.Preference;
import android.os.Handler;
import com.twitter.library.platform.PushService;
import android.content.IntentFilter;
import android.os.Bundle;
import com.twitter.library.api.account.LvEligibilityResponse;
import android.preference.CheckBoxPreference;
import com.twitter.library.network.ae;
import com.twitter.library.service.aa;
import com.twitter.android.client.c;
import android.content.DialogInterface$OnClickListener;
import com.twitter.library.service.y;
import com.twitter.library.api.account.d;
import com.twitter.library.api.account.p;
import com.twitter.library.scribe.ScribeLog;
import com.twitter.library.scribe.TwitterScribeLog;
import android.widget.Toast;
import com.twitter.library.client.Session;
import android.preference.Preference$OnPreferenceClickListener;
import android.preference.Preference$OnPreferenceChangeListener;
import com.twitter.android.client.TwitterPreferenceActivity;
import android.content.Intent;
import android.content.Context;
import android.content.BroadcastReceiver;

class sa extends BroadcastReceiver
{
    final /* synthetic */ SecuritySettingsActivity a;
    
    public sa(final SecuritySettingsActivity a) {
        this.a = a;
    }
    
    public void onReceive(final Context context, final Intent intent) {
        if (this.a.c) {
            this.a.c();
            this.a.c = false;
        }
    }
}
