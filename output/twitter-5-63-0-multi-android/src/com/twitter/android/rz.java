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
import android.content.BroadcastReceiver;
import com.twitter.library.platform.PushService;
import android.content.IntentFilter;
import android.os.Bundle;
import com.twitter.library.api.account.LvEligibilityResponse;
import android.content.Intent;
import com.twitter.library.network.ae;
import com.twitter.library.service.aa;
import com.twitter.android.client.c;
import android.content.DialogInterface$OnClickListener;
import com.twitter.library.api.account.d;
import com.twitter.library.scribe.ScribeLog;
import com.twitter.library.scribe.TwitterScribeLog;
import android.widget.Toast;
import com.twitter.library.client.Session;
import android.preference.Preference$OnPreferenceClickListener;
import android.preference.Preference$OnPreferenceChangeListener;
import com.twitter.android.client.TwitterPreferenceActivity;
import com.twitter.library.service.y;
import com.twitter.library.api.account.g;
import android.preference.CheckBoxPreference;
import com.twitter.library.api.account.p;
import com.twitter.library.api.account.r;
import android.content.Context;
import android.os.AsyncTask;

public class rz extends AsyncTask
{
    final /* synthetic */ SecuritySettingsActivity a;
    private final Context b;
    private final String c;
    
    rz(final SecuritySettingsActivity a, final Context b, final String c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public r a(final Void... array) {
        return p.a(this.b, this.c);
    }
    
    public void a(final r r) {
        if (r == null) {
            this.a.b();
            ((CheckBoxPreference)this.a.findPreference((CharSequence)"login_verification")).setChecked(false);
            this.a.showDialog(3);
        }
        else if (this.a.d) {
            this.a.a(new g(this.b, this.a.l().b(this.c), r), 1);
        }
    }
    
    protected void onPreExecute() {
        this.a.a(this.a.getString(2131297218));
    }
}
