// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.content.DialogInterface$OnClickListener;
import android.support.v7.app.AlertDialog$Builder;
import android.content.Context;
import android.app.ProgressDialog;
import android.app.Dialog;
import android.preference.Preference$OnPreferenceClickListener;
import android.os.Bundle;

public class SettingsHelp extends DialogToastPreferenceActivity
{
    private static final String[] z;
    
    static {
        final String[] z2 = new String[4];
        String s = "X5\u007fh2F\u0013\u007fh6_9\u007f";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0133:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = 'W';
                        break;
                    }
                    case 0: {
                        c2 = '+';
                        break;
                    }
                    case 1: {
                        c2 = 'L';
                        break;
                    }
                    case 2: {
                        c2 = '\f';
                        break;
                    }
                    case 3: {
                        c2 = '\u001c';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "J.ci#";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "C)`l";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    n2 = 3;
                    array = z2;
                    s = "H#bh6H8Si$";
                    n = 2;
                    continue;
                }
                case 2: {
                    break Label_0133;
                }
            }
        }
        array[n2] = intern;
        z = z2;
    }
    
    @Override
    protected void onCreate(final Bundle bundle) {
        super.onCreate(bundle);
        this.addPreferencesFromResource(2131099659);
        this.findPreference((CharSequence)SettingsHelp.z[1]).setOnPreferenceClickListener((Preference$OnPreferenceClickListener)new j_(this));
        this.findPreference((CharSequence)SettingsHelp.z[2]).setOnPreferenceClickListener((Preference$OnPreferenceClickListener)new nk(this));
        this.findPreference((CharSequence)SettingsHelp.z[0]).setOnPreferenceClickListener((Preference$OnPreferenceClickListener)new sq(this));
        this.findPreference((CharSequence)SettingsHelp.z[3]).setOnPreferenceClickListener((Preference$OnPreferenceClickListener)new ci(this));
    }
    
    @Override
    protected Dialog onCreateDialog(final int n) {
        switch (n) {
            default: {
                return super.onCreateDialog(n);
            }
            case 122: {
                final ProgressDialog progressDialog = new ProgressDialog((Context)this);
                progressDialog.setMessage((CharSequence)this.getString(2131231535));
                progressDialog.setIndeterminate(true);
                progressDialog.setCancelable(false);
                return (Dialog)progressDialog;
            }
            case 123: {
                return new AlertDialog$Builder((Context)this).setMessage(2131231705).setPositiveButton(2131231977, (DialogInterface$OnClickListener)new arr(this)).setNegativeButton(2131230874, (DialogInterface$OnClickListener)new rk(this)).create();
            }
            case 101: {
                final ay ay = new ay((Context)this);
                ay.setTitle((CharSequence)this.getString(2131231592));
                ay.setMessage((CharSequence)this.getString(2131231591));
                ay.setIndeterminate(true);
                ay.setCancelable(false);
                return (Dialog)ay;
            }
            case 102: {
                return new AlertDialog$Builder((Context)this).setTitle(2131231418).setMessage(this.getString(2131231546, new Object[] { this.getString(2131230921) })).setPositiveButton(2131231435, (DialogInterface$OnClickListener)new a2y(this)).create();
            }
        }
    }
}
