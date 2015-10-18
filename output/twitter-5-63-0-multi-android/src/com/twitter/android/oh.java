// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import android.preference.Preference$OnPreferenceChangeListener;
import android.preference.Preference;
import android.preference.PreferenceScreen;
import com.twitter.library.api.UserSettings;
import android.preference.CheckBoxPreference;
import com.twitter.android.util.am;

class oh implements am
{
    final /* synthetic */ CheckBoxPreference a;
    final /* synthetic */ UserSettings b;
    final /* synthetic */ PreferenceScreen c;
    final /* synthetic */ PrivacySettingsActivity d;
    
    oh(final PrivacySettingsActivity d, final CheckBoxPreference a, final UserSettings b, final PreferenceScreen c) {
        this.d = d;
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public void a(final boolean b) {
        boolean b2 = true;
        if (this.a != null) {
            if (!b) {
                this.c.removePreference((Preference)this.a);
                return;
            }
            this.a.setEnabled(b2);
            this.a.setOnPreferenceChangeListener((Preference$OnPreferenceChangeListener)this.d);
            final CheckBoxPreference a = this.a;
            if (this.b == null || !this.b.l) {
                b2 = false;
            }
            a.setChecked(b2);
        }
    }
}
