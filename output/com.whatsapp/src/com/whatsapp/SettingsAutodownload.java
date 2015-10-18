// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.content.DialogInterface$OnClickListener;
import android.content.Context;
import android.support.v7.app.AlertDialog$Builder;
import android.app.Dialog;
import android.preference.Preference$OnPreferenceChangeListener;
import com.whatsapp.preference.WaMultiSelectListPreference;
import android.os.Bundle;
import java.util.ArrayList;

public class SettingsAutodownload extends DialogToastPreferenceActivity
{
    private static final String[] z;
    
    static {
        final String[] z2 = new String[3];
        String s = "u\u0001\n\u001bY{\u0003\u0010\u0018Ru\u0010!\u0006Ru\u0019\u0017\u001aZ";
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
                        c2 = '=';
                        break;
                    }
                    case 0: {
                        c2 = '\u0014';
                        break;
                    }
                    case 1: {
                        c2 = 't';
                        break;
                    }
                    case 2: {
                        c2 = '~';
                        break;
                    }
                    case 3: {
                        c2 = 't';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "u\u0001\n\u001bY{\u0003\u0010\u0018Ru\u0010!\u0017Xx\u0018\u000b\u0018\\f";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    n2 = 2;
                    array = z2;
                    s = "u\u0001\n\u001bY{\u0003\u0010\u0018Ru\u0010!\u0003Tr\u001d";
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
    
    private static int a(final CharSequence[] array) {
        int n = 0;
        final boolean i = App.I;
        final int length = array.length;
        int j = 0;
        while (j < length) {
            n |= 1 << Integer.parseInt(array[j].toString());
            ++j;
            if (i) {
                break;
            }
        }
        return n;
    }
    
    private static CharSequence[] a(int i) {
        final boolean j = App.I;
        final ArrayList<String> list = new ArrayList<String>();
        int n = 0;
        while (i != 0) {
            if ((i & 0x1) != 0x0) {
                list.add(Integer.toString(n));
            }
            i >>= 1;
            ++n;
            if (j) {
                break;
            }
        }
        return list.toArray(new CharSequence[0]);
    }
    
    static int b(final CharSequence[] array) {
        return a(array);
    }
    
    @Override
    protected void onCreate(final Bundle bundle) {
        super.onCreate(bundle);
        this.addPreferencesFromResource(2131099655);
        final WaMultiSelectListPreference waMultiSelectListPreference = (WaMultiSelectListPreference)this.findPreference((CharSequence)SettingsAutodownload.z[1]);
        waMultiSelectListPreference.b(this.getString(2131231665));
        waMultiSelectListPreference.c(this.getString(2131231660));
        waMultiSelectListPreference.a(a(App.c(2)));
        waMultiSelectListPreference.setOnPreferenceChangeListener((Preference$OnPreferenceChangeListener)new b(this));
        final WaMultiSelectListPreference waMultiSelectListPreference2 = (WaMultiSelectListPreference)this.findPreference((CharSequence)SettingsAutodownload.z[2]);
        waMultiSelectListPreference2.b(this.getString(2131231665));
        waMultiSelectListPreference2.c(this.getString(2131231660));
        waMultiSelectListPreference2.a(a(App.c(1)));
        waMultiSelectListPreference2.setOnPreferenceChangeListener((Preference$OnPreferenceChangeListener)new jj(this));
        final WaMultiSelectListPreference waMultiSelectListPreference3 = (WaMultiSelectListPreference)this.findPreference((CharSequence)SettingsAutodownload.z[0]);
        waMultiSelectListPreference3.b(this.getString(2131231665));
        waMultiSelectListPreference3.c(this.getString(2131231660));
        waMultiSelectListPreference3.a(a(App.c(3)));
        waMultiSelectListPreference3.setOnPreferenceChangeListener((Preference$OnPreferenceChangeListener)new at6(this));
    }
    
    @Override
    protected Dialog onCreateDialog(final int n) {
        switch (n) {
            default: {
                return super.onCreateDialog(n);
            }
            case 1: {
                return new AlertDialog$Builder((Context)this).setMessage(this.getString(2131231667)).setPositiveButton(2131231435, (DialogInterface$OnClickListener)new r4(this)).create();
            }
        }
    }
}
