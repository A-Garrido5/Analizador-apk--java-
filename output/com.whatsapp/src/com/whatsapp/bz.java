// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import com.whatsapp.util.Log;
import com.whatsapp.contact.f;
import com.whatsapp.contact.h;
import com.whatsapp.contact.k;
import android.preference.CheckBoxPreference;
import android.os.AsyncTask;

class bz extends AsyncTask
{
    private static final String[] z;
    final SettingsContacts a;
    
    static {
        final String[] z2 = new String[4];
        String s = "u\"a@Xh f\u001bB\u007f)v\u001bBs$vQBuhvVBr&aAB&";
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
                        c2 = '1';
                        break;
                    }
                    case 0: {
                        c2 = '\u0006';
                        break;
                    }
                    case 1: {
                        c2 = 'G';
                        break;
                    }
                    case 2: {
                        c2 = '\u0015';
                        break;
                    }
                    case 3: {
                        c2 = '4';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "u\"a@Xh f\u001bB\u007f)v\u001bWg.yQU)$wGEg3`G\u0011";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "u\"a@Xh f\u001bB\u007f)v\u001bWg.yQU)$wGEg3`G\u0011";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    n2 = 3;
                    array = z2;
                    s = "u\"a@Xh f\u001bB\u007f)v\u001bWg.yQU)$wGEg3`G\u0011";
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
    
    private bz(final SettingsContacts a) {
        this.a = a;
    }
    
    bz(final SettingsContacts settingsContacts, final w w) {
        this(settingsContacts);
    }
    
    private void a(final CheckBoxPreference checkBoxPreference) {
        checkBoxPreference.setChecked(!checkBoxPreference.isChecked());
    }
    
    protected k a(final Void[] array) {
        return f.d(this.a.getApplicationContext(), h.INTERACTIVE_FULL);
    }
    
    protected void a(final k k) {
        final boolean i = App.I;
        this.a.removeDialog(16);
        Label_0243: {
            switch (a2s.a[k.ordinal()]) {
                case 1: {
                    App.aL.c(true);
                    App.aq.a(System.currentTimeMillis());
                    Log.i(bz.z[0] + SettingsContacts.a(this.a).isChecked());
                    this.a.a(2131230943);
                    if (i) {
                        break Label_0243;
                    }
                    break;
                }
                case 2: {
                    this.a(SettingsContacts.a(this.a));
                    Log.i(bz.z[1] + SettingsContacts.a(this.a).isChecked());
                    this.a.a(2131230905);
                    if (i) {
                        break Label_0243;
                    }
                    break;
                }
                case 3:
                case 4: {
                    App.aL.b(true);
                    this.a(SettingsContacts.a(this.a));
                    Log.i(bz.z[3] + SettingsContacts.a(this.a).isChecked());
                    this.a.a(2131230904);
                    if (i) {
                        break Label_0243;
                    }
                    break;
                }
                case 5: {
                    this.a(SettingsContacts.a(this.a));
                    Log.i(bz.z[2] + SettingsContacts.a(this.a).isChecked());
                    this.a.a(2131230906);
                }
            }
        }
    }
    
    protected Object doInBackground(final Object[] array) {
        return this.a((Void[])array);
    }
    
    protected void onPostExecute(final Object o) {
        this.a((k)o);
    }
    
    protected void onPreExecute() {
        this.a.showDialog(16);
    }
}
