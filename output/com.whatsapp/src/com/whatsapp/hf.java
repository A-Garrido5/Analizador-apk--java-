// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import com.whatsapp.fieldstats.a5;
import com.whatsapp.fieldstats.o;
import com.whatsapp.util.bm;
import android.preference.Preference;
import android.preference.Preference$OnPreferenceChangeListener;

class hf implements Preference$OnPreferenceChangeListener
{
    final SettingsPrivacy a;
    
    hf(final SettingsPrivacy a) {
        this.a = a;
    }
    
    public boolean onPreferenceChange(final Preference preference, final Object o) {
        if (Boolean.TRUE.equals(o)) {
            bm.a(new fw(this));
        }
        a5.a(this.a.getApplicationContext(), o.RECEIPTS_ENABLED, Boolean.valueOf(Boolean.TRUE.equals(o)));
        return true;
    }
}
