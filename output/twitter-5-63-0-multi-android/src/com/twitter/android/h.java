// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import com.twitter.android.commerce.view.OrderHistoryActivity;
import com.twitter.android.commerce.view.ProfileSummaryActivity;
import com.twitter.library.client.Session;
import com.twitter.library.util.bq;
import com.twitter.library.client.App;
import com.twitter.library.platform.PushService;
import android.os.Bundle;
import android.app.Activity;
import com.twitter.library.service.aa;
import com.twitter.android.dialog.EnterPasswordDialogActivity;
import com.twitter.library.api.account.ab;
import com.twitter.android.client.c;
import com.twitter.android.dialog.RemovePhoneDialogActivity;
import com.twitter.library.service.z;
import com.twitter.library.service.y;
import com.twitter.library.client.as;
import com.twitter.library.featureswitch.d;
import android.widget.Toast;
import android.text.TextUtils;
import android.content.Intent;
import com.twitter.library.api.UserSettings;
import android.preference.PreferenceCategory;
import android.preference.Preference;
import android.preference.CheckBoxPreference;
import android.preference.Preference$OnPreferenceClickListener;
import android.preference.Preference$OnPreferenceChangeListener;
import com.twitter.android.client.TwitterPreferenceActivity;
import android.accounts.Account;
import android.content.Context;
import com.twitter.library.platform.TwitterDataSyncService;
import com.twitter.library.provider.k;
import com.twitter.library.provider.b;
import android.content.ContentValues;
import com.twitter.library.provider.ae;
import android.preference.ListPreference;
import com.twitter.library.util.a;
import android.os.AsyncTask;

class h extends AsyncTask
{
    final /* synthetic */ AccountSettingsActivity a;
    private final String b;
    private boolean c;
    private boolean d;
    
    public h(final AccountSettingsActivity a, final String b) {
        this.a = a;
        this.b = b;
    }
    
    protected Void a(final Void... array) {
        final Context applicationContext = this.a.getApplicationContext();
        final String b = this.b;
        final Account a = com.twitter.library.util.a.a(applicationContext, b);
        if (a == null) {
            return null;
        }
        final boolean c = this.c;
        final boolean d = this.d;
        final int int1 = Integer.parseInt(((ListPreference)this.a.findPreference((CharSequence)"polling_interval")).getValue());
        boolean b2;
        if (this.a.c != int1) {
            b2 = true;
        }
        else {
            b2 = false;
        }
        if (d) {
            com.twitter.library.util.a.a(a, ae.c, c);
            String s;
            if (c) {
                s = "settings::::enable_sync";
            }
            else {
                s = "settings::::disable_sync";
            }
            this.a.Y.a(this.a.i, s);
        }
        final boolean d2 = this.a.d;
        final ContentValues contentValues = new ContentValues(4);
        contentValues.put("interval", int1);
        final b b3 = new b(applicationContext.getContentResolver());
        k.a(applicationContext).a(b, contentValues, d2, b3);
        b3.a();
        if ((b2 || d) && c) {
            TwitterDataSyncService.a(applicationContext);
        }
        this.a.a = c;
        this.a.c = int1;
        return null;
    }
    
    protected void onPreExecute() {
        super.onPreExecute();
        this.c = this.a.e.isChecked();
        this.d = (this.a.a != this.c);
    }
}
