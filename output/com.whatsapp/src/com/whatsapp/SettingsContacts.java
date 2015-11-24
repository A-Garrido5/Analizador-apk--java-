// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.content.Context;
import android.app.ProgressDialog;
import android.app.Dialog;
import android.preference.Preference$OnPreferenceClickListener;
import android.os.Bundle;
import android.preference.CheckBoxPreference;

public class SettingsContacts extends DialogToastPreferenceActivity
{
    private static final String[] z;
    private CheckBoxPreference g;
    
    static {
        final String[] z2 = new String[3];
        String s = "\u00190d>]\f\nn k\b;l";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0110:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = '\u0002';
                        break;
                    }
                    case 0: {
                        c2 = 'm';
                        break;
                    }
                    case 1: {
                        c2 = 'U';
                        break;
                    }
                    case 2: {
                        c2 = '\b';
                        break;
                    }
                    case 3: {
                        c2 = 'R';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "\u001e=g%]\f9d\ra\u0002;|3a\u0019&";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "\u001d4q\rd\u0002'W3]\u000b'a7l\t";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    break Label_0110;
                }
            }
        }
        array[n2] = intern;
        z = z2;
    }
    
    static CheckBoxPreference a(final SettingsContacts settingsContacts) {
        return settingsContacts.g;
    }
    
    @Override
    protected void onCreate(final Bundle bundle) {
        super.onCreate(bundle);
        this.addPreferencesFromResource(2131099657);
        this.findPreference((CharSequence)SettingsContacts.z[0]).setOnPreferenceClickListener((Preference$OnPreferenceClickListener)new w(this));
        this.findPreference((CharSequence)SettingsContacts.z[2]).setOnPreferenceClickListener((Preference$OnPreferenceClickListener)new gx(this));
        (this.g = (CheckBoxPreference)this.findPreference((CharSequence)SettingsContacts.z[1])).setOnPreferenceClickListener((Preference$OnPreferenceClickListener)new xe(this));
    }
    
    @Override
    protected Dialog onCreateDialog(final int n) {
        switch (n) {
            default: {
                return super.onCreateDialog(n);
            }
            case 16: {
                final ProgressDialog progressDialog = new ProgressDialog((Context)this);
                progressDialog.setMessage((CharSequence)this.getString(2131231591));
                progressDialog.setIndeterminate(true);
                progressDialog.setCancelable(false);
                return (Dialog)progressDialog;
            }
        }
    }
}
