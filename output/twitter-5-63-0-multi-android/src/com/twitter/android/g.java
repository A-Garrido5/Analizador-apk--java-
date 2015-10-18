// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import com.twitter.android.commerce.view.OrderHistoryActivity;
import com.twitter.android.commerce.view.ProfileSummaryActivity;
import com.twitter.library.client.Session;
import com.twitter.library.util.bq;
import android.preference.ListPreference;
import com.twitter.library.client.App;
import com.twitter.library.client.k;
import com.twitter.library.platform.PushService;
import android.os.Bundle;
import android.app.Activity;
import com.twitter.android.dialog.EnterPasswordDialogActivity;
import com.twitter.library.api.account.ab;
import com.twitter.android.client.c;
import com.twitter.android.dialog.RemovePhoneDialogActivity;
import com.twitter.library.client.as;
import com.twitter.library.featureswitch.d;
import android.text.TextUtils;
import android.content.Intent;
import com.twitter.library.api.UserSettings;
import android.preference.PreferenceCategory;
import android.preference.Preference;
import android.preference.CheckBoxPreference;
import android.preference.Preference$OnPreferenceClickListener;
import android.preference.Preference$OnPreferenceChangeListener;
import com.twitter.android.client.TwitterPreferenceActivity;
import com.twitter.internal.android.service.a;
import android.content.Context;
import android.widget.Toast;
import com.twitter.util.collection.CollectionUtils;
import com.twitter.library.service.aa;
import com.twitter.library.service.y;
import java.lang.ref.WeakReference;
import com.twitter.library.service.z;

class g extends z
{
    private WeakReference a;
    
    public g(final AccountSettingsActivity accountSettingsActivity) {
        this.a = new WeakReference((T)accountSettingsActivity);
    }
    
    @Override
    public void a(final y y) {
        final AccountSettingsActivity accountSettingsActivity = (AccountSettingsActivity)this.a.get();
        if (accountSettingsActivity == null) {
            return;
        }
        final px px = (px)y;
        int n;
        if (((aa)px.l().b()).a()) {
            n = 2131297758;
            accountSettingsActivity.a(null);
            accountSettingsActivity.e("remove::success");
        }
        else {
            final int[] b = px.b();
            if (b != null && CollectionUtils.a(b, 114)) {
                n = 2131297759;
                accountSettingsActivity.e("remove:error:wrong_password");
            }
            else {
                n = 2131297757;
                accountSettingsActivity.e("remove:error:generic");
            }
        }
        Toast.makeText((Context)accountSettingsActivity, n, 1).show();
    }
}
