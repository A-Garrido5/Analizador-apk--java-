// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import android.content.Intent;
import android.preference.Preference;
import android.preference.Preference$OnPreferenceClickListener;

class em implements Preference$OnPreferenceClickListener
{
    final /* synthetic */ DebugSettingsActivity a;
    
    em(final DebugSettingsActivity a) {
        this.a = a;
    }
    
    public boolean onPreferenceClick(final Preference preference) {
        this.a.startActivity(new Intent(this.a.getApplicationContext(), (Class)FeatureSwitchesSettingsActivity.class));
        return false;
    }
}
