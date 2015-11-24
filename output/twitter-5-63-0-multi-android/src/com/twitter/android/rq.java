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
import android.content.IntentFilter;
import android.os.Bundle;
import com.twitter.library.api.account.LvEligibilityResponse;
import android.content.Intent;
import android.preference.CheckBoxPreference;
import com.twitter.library.network.ae;
import com.twitter.library.service.aa;
import com.twitter.android.client.c;
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
import android.accounts.Account;
import com.twitter.library.platform.PushService;
import android.content.Context;
import com.google.android.gcm.b;
import com.twitter.library.platform.f;
import com.twitter.library.util.a;
import android.content.DialogInterface;
import android.content.DialogInterface$OnClickListener;

class rq implements DialogInterface$OnClickListener
{
    final /* synthetic */ String a;
    final /* synthetic */ SecuritySettingsActivity b;
    
    rq(final SecuritySettingsActivity b, final String a) {
        this.b = b;
        this.a = a;
    }
    
    public void onClick(final DialogInterface dialogInterface, final int n) {
        this.b.Y.a(this.b.m().g(), this.a);
        final Account a = com.twitter.library.util.a.a(this.b.getApplicationContext(), this.b.a);
        if (!f.a(this.b.getApplicationContext())) {
            this.b.c();
            return;
        }
        if (!com.google.android.gcm.b.g((Context)this.b)) {
            this.b.c = true;
            PushService.e((Context)this.b);
            return;
        }
        if (!PushService.d((Context)this.b, a)) {
            PushService.a((Context)this.b, a, true);
            this.b.c();
            return;
        }
        this.b.c();
    }
}
