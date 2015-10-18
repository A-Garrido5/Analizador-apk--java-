// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.content.DialogInterface$OnClickListener;
import android.content.Context;
import android.support.v7.app.AlertDialog$Builder;
import android.app.Dialog;
import android.preference.Preference;
import android.preference.PreferenceCategory;
import android.os.Build;
import android.preference.ListPreference;
import android.os.Bundle;
import android.preference.Preference$OnPreferenceChangeListener;

public class SettingsNotifications extends DialogToastPreferenceActivity
{
    private static final String[] z;
    private Preference$OnPreferenceChangeListener g;
    private Preference$OnPreferenceChangeListener h;
    private Preference$OnPreferenceChangeListener i;
    
    static {
        final String[] z2 = new String[10];
        String s = "6\u0010VL[\u000e\fVMB7\u001bfID!\u0017IfF>\u0006\\";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0282:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = '+';
                        break;
                    }
                    case 0: {
                        c2 = 'Q';
                        break;
                    }
                    case 1: {
                        c2 = 'b';
                        break;
                    }
                    case 2: {
                        c2 = '9';
                        break;
                    }
                    case 3: {
                        c2 = '9';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "?\rMPM(=UPL9\u0016fZD=\rK";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "2\u0003UUt'\u000b[KJ%\u0007fUN?\u0005MQ";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "?\rMPM8\u0001XMB>\f";
                    n2 = 3;
                    array = z2;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    s = "6\u0010VL[\u000e\fVMB7\u001bfOB3\u0010XMN\u000e\u000e\\WL%\n";
                    n2 = 4;
                    array = z2;
                    n = 3;
                    continue;
                }
                case 3: {
                    array[n2] = intern;
                    n2 = 5;
                    array = z2;
                    s = "6\u0010VL[\u000e\fVMB7\u000bZX_8\rW";
                    n = 4;
                    continue;
                }
                case 4: {
                    array[n2] = intern;
                    n2 = 6;
                    s = "6\u0010VL[\u000e\fVMB7\u001bfUB6\nMfH>\u000eVK";
                    n = 5;
                    array = z2;
                    continue;
                }
                case 5: {
                    array[n2] = intern;
                    n2 = 7;
                    s = "?\rMPM(=IV[$\u0012fTD5\u0007";
                    n = 6;
                    array = z2;
                    continue;
                }
                case 6: {
                    array[n2] = intern;
                    n2 = 8;
                    s = "?\rMPM(=OPI#\u0003M\\t=\u0007W^_9";
                    n = 7;
                    array = z2;
                    continue;
                }
                case 7: {
                    array[n2] = intern;
                    n2 = 9;
                    s = ")\u001aAAS)\u001a";
                    n = 8;
                    array = z2;
                    continue;
                }
                case 8: {
                    break Label_0282;
                }
            }
        }
        array[n2] = intern;
        z = z2;
    }
    
    public SettingsNotifications() {
        this.i = (Preference$OnPreferenceChangeListener)new m4(this);
        this.g = (Preference$OnPreferenceChangeListener)new a2n(this);
        this.h = (Preference$OnPreferenceChangeListener)new a6x(this);
    }
    
    @Override
    protected void onCreate(final Bundle bundle) {
        super.onCreate(bundle);
        this.addPreferencesFromResource(2131099661);
        final ListPreference listPreference = (ListPreference)this.findPreference((CharSequence)SettingsNotifications.z[1]);
        listPreference.setTitle((CharSequence)this.getString(2131231711, new Object[] { listPreference.getEntry() }));
        listPreference.setOnPreferenceChangeListener(this.i);
        final ListPreference listPreference2 = (ListPreference)this.findPreference((CharSequence)SettingsNotifications.z[6]);
        listPreference2.setTitle((CharSequence)this.getString(2131231711, new Object[] { listPreference2.getEntry() }));
        listPreference2.setOnPreferenceChangeListener(this.i);
        final ListPreference listPreference3 = (ListPreference)this.findPreference((CharSequence)SettingsNotifications.z[8]);
        listPreference3.setTitle((CharSequence)this.getString(2131231717, new Object[] { listPreference3.getEntry() }));
        listPreference3.setOnPreferenceChangeListener(this.g);
        final ListPreference listPreference4 = (ListPreference)this.findPreference((CharSequence)SettingsNotifications.z[4]);
        listPreference4.setTitle((CharSequence)this.getString(2131231717, new Object[] { listPreference4.getEntry() }));
        listPreference4.setOnPreferenceChangeListener(this.g);
        final ListPreference listPreference5 = (ListPreference)this.findPreference((CharSequence)SettingsNotifications.z[2]);
        listPreference5.setTitle((CharSequence)this.getString(2131231717, new Object[] { listPreference5.getEntry() }));
        listPreference5.setOnPreferenceChangeListener(this.g);
        final ListPreference listPreference6 = (ListPreference)this.findPreference((CharSequence)SettingsNotifications.z[7]);
        listPreference6.setSummary(listPreference6.getEntry());
        listPreference6.setOnPreferenceChangeListener(this.h);
        final ListPreference listPreference7 = (ListPreference)this.findPreference((CharSequence)SettingsNotifications.z[0]);
        listPreference7.setSummary(listPreference7.getEntry());
        listPreference7.setOnPreferenceChangeListener(this.h);
        if (Build.MANUFACTURER.replace(' ', '_').equalsIgnoreCase(SettingsNotifications.z[9]) && this.getPreferenceScreen() != null) {
            final PreferenceCategory preferenceCategory = (PreferenceCategory)this.findPreference((CharSequence)SettingsNotifications.z[3]);
            if (preferenceCategory != null) {
                preferenceCategory.removePreference((Preference)listPreference);
            }
            final PreferenceCategory preferenceCategory2 = (PreferenceCategory)this.findPreference((CharSequence)SettingsNotifications.z[5]);
            if (preferenceCategory2 != null) {
                preferenceCategory2.removePreference((Preference)listPreference2);
            }
        }
    }
    
    @Override
    protected Dialog onCreateDialog(final int n) {
        switch (n) {
            default: {
                return super.onCreateDialog(n);
            }
            case 7: {
                return new AlertDialog$Builder((Context)this).setMessage(this.getString(2131231265)).setPositiveButton(2131231435, (DialogInterface$OnClickListener)new gf(this)).create();
            }
        }
    }
}
