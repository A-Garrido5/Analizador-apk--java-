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
import android.content.Context;
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
import com.twitter.internal.android.service.a;
import java.util.Iterator;
import java.util.ArrayList;
import com.twitter.util.collection.CollectionUtils;
import com.twitter.library.service.aa;
import com.twitter.library.service.y;
import java.lang.ref.WeakReference;
import com.twitter.library.service.z;

class e extends z
{
    private WeakReference a;
    
    public e(final AccountSettingsActivity accountSettingsActivity) {
        this.a = new WeakReference((T)accountSettingsActivity);
    }
    
    @Override
    public void a(final y y) {
        final AccountSettingsActivity accountSettingsActivity = (AccountSettingsActivity)this.a.get();
        if (accountSettingsActivity == null) {
            return;
        }
        final ph ph = (ph)y;
        if (((aa)ph.l().b()).a()) {
            final ArrayList a = ph.e().a();
            if (!a.isEmpty()) {
                for (final qc qc : a) {
                    if (qc.b()) {
                        accountSettingsActivity.a(qc.a());
                        return;
                    }
                }
            }
            else {
                accountSettingsActivity.a(null);
            }
            accountSettingsActivity.e("email_phone_info::success");
            return;
        }
        final int[] b = ph.b();
        if (b != null && CollectionUtils.a(b, 88)) {
            accountSettingsActivity.e("email_phone_info::rate_limit");
            return;
        }
        accountSettingsActivity.e("email_phone_info::generic");
    }
}
