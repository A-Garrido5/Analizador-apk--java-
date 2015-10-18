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
import android.preference.CheckBoxPreference;
import com.twitter.library.network.ae;
import com.twitter.library.service.aa;
import com.twitter.android.client.c;
import com.twitter.library.api.account.d;
import com.twitter.library.api.account.p;
import com.twitter.library.scribe.ScribeLog;
import com.twitter.library.scribe.TwitterScribeLog;
import android.widget.Toast;
import com.twitter.library.client.Session;
import android.preference.Preference$OnPreferenceClickListener;
import android.preference.Preference$OnPreferenceChangeListener;
import com.twitter.android.client.TwitterPreferenceActivity;
import com.twitter.library.service.y;
import android.content.Context;
import com.twitter.library.api.account.z;
import android.content.DialogInterface;
import android.content.DialogInterface$OnClickListener;

class rr implements DialogInterface$OnClickListener
{
    final /* synthetic */ String a;
    final /* synthetic */ SecuritySettingsActivity b;
    
    rr(final SecuritySettingsActivity b, final String a) {
        this.b = b;
        this.a = a;
    }
    
    public void onClick(final DialogInterface dialogInterface, final int n) {
        this.b.Y.a(this.b.m().g(), this.a);
        this.b.a(this.b.getString(2131297231));
        this.b.a(new z((Context)this.b, this.b.l().b(this.b.a), this.b.d()), 2);
    }
}
