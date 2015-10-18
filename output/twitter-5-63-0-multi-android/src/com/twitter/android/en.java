// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import android.content.Intent;
import android.preference.Preference;
import android.preference.Preference$OnPreferenceClickListener;

class en implements Preference$OnPreferenceClickListener
{
    final /* synthetic */ DebugSettingsActivity a;
    
    en(final DebugSettingsActivity a) {
        this.a = a;
    }
    
    public boolean onPreferenceClick(final Preference preference) {
        this.a.startActivity(new Intent(this.a.getApplicationContext(), (Class)PtrDebugSettingsActivity.class));
        return false;
    }
}
