// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.samsung.single;

import android.content.Context;
import android.content.Intent;
import com.twitter.android.LoginActivity;
import android.preference.Preference;
import android.preference.Preference$OnPreferenceClickListener;

class k implements Preference$OnPreferenceClickListener
{
    final /* synthetic */ WidgetPreferencesActivity a;
    
    k(final WidgetPreferencesActivity a) {
        this.a = a;
    }
    
    public boolean onPreferenceClick(final Preference preference) {
        this.a.startActivityForResult(new Intent((Context)this.a, (Class)LoginActivity.class).putExtra("add_account", true), 2);
        return true;
    }
}
