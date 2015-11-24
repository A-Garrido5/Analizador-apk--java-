// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.samsung.single;

import com.twitter.android.samsung.data.PollingService;
import android.os.Bundle;
import com.twitter.library.api.TwitterUser;
import android.accounts.Account;
import android.preference.CheckBoxPreference;
import android.accounts.AccountManager;
import android.preference.Preference$OnPreferenceClickListener;
import com.twitter.android.samsung.model.g;
import android.content.Intent;
import android.preference.PreferenceGroup;
import android.preference.PreferenceActivity;
import android.preference.ListPreference;
import android.content.Context;
import android.preference.Preference;
import android.preference.Preference$OnPreferenceChangeListener;

class l implements Preference$OnPreferenceChangeListener
{
    final /* synthetic */ WidgetPreferencesActivity a;
    
    l(final WidgetPreferencesActivity a) {
        this.a = a;
    }
    
    public boolean onPreferenceChange(final Preference preference, final Object o) {
        this.a.f = true;
        i.b((Context)this.a, o.toString(), this.a.c);
        this.a.a((ListPreference)preference, o.toString());
        return true;
    }
}
