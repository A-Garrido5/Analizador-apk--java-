// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.samsung.single;

import android.content.Context;
import android.preference.Preference;
import android.preference.CheckBoxPreference;
import android.preference.Preference$OnPreferenceClickListener;

class m implements Preference$OnPreferenceClickListener
{
    final /* synthetic */ WidgetPreferencesActivity a;
    
    m(final WidgetPreferencesActivity a) {
        this.a = a;
    }
    
    private void a(final CheckBoxPreference checkBoxPreference) {
        for (int i = 0; i < -1 + this.a.a.getPreferenceCount(); ++i) {
            final CheckBoxPreference checkBoxPreference2 = (CheckBoxPreference)this.a.a.getPreference(i);
            if (!checkBoxPreference2.equals(checkBoxPreference)) {
                checkBoxPreference2.setChecked(false);
            }
        }
    }
    
    public boolean onPreferenceClick(final Preference preference) {
        this.a((CheckBoxPreference)preference);
        i.a((Context)this.a, (String)preference.getSummary().subSequence(1, preference.getSummary().length()), this.a.c);
        ((CheckBoxPreference)preference).setChecked(true);
        return true;
    }
}
