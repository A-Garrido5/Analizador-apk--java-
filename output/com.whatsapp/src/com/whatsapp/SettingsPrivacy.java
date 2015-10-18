// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.preference.Preference;
import android.preference.Preference$OnPreferenceClickListener;
import android.os.Bundle;
import java.util.Enumeration;
import android.content.SharedPreferences$Editor;
import com.whatsapp.util.Log;
import java.util.Hashtable;
import android.content.SharedPreferences;
import com.whatsapp.preference.WaPrivacyPreference;
import android.os.Looper;
import android.preference.Preference$OnPreferenceChangeListener;
import android.os.Handler;
import java.util.HashMap;

public class SettingsPrivacy extends DialogToastPreferenceActivity
{
    private static SettingsPrivacy h;
    private static Runnable i;
    private static HashMap j;
    private static Handler k;
    private static final String[] z;
    private Preference$OnPreferenceChangeListener g;
    
    static {
        final String[] z2 = new String[34];
        String s = "-2\u0004\u001c\u001f00\u0003\u0018\u00047!\u0011\u000b\u000fq3\u0015\u001b\u0002,8\t";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0882:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = 'v';
                        break;
                    }
                    case 0: {
                        c2 = '^';
                        break;
                    }
                    case 1: {
                        c2 = 'W';
                        break;
                    }
                    case 2: {
                        c2 = 'p';
                        break;
                    }
                    case 3: {
                        c2 = 'h';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "=8\u001dF\u000166\u0004\u001b\u0017.'/\u0018\u0004;1\u0015\u001a\u001304\u0015\u001b";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "26\u0003\u001c";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = ".%\u0019\u001e\u0017=./\u0018\u000411\u0019\u0004\u0013\u0001'\u0018\u0007\u00021";
                    n2 = 3;
                    array = z2;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    s = ".%\u0019\u001e\u0017=./\u0004\u0017-#/\u001b\u0013;9";
                    n2 = 4;
                    array = z2;
                    n = 3;
                    continue;
                }
                case 3: {
                    array[n2] = intern;
                    n2 = 5;
                    array = z2;
                    s = ".%\u0019\u001e\u0017=./\u001b\u0002?#\u0005\u001b";
                    n = 4;
                    continue;
                }
                case 4: {
                    array[n2] = intern;
                    n2 = 6;
                    s = "-#\u0011\u001c\u0003-";
                    n = 5;
                    array = z2;
                    continue;
                }
                case 5: {
                    array[n2] = intern;
                    n2 = 7;
                    s = ".%\u0019\u001e\u0017=./\u0004\u0017-#/\u001b\u0013;9";
                    n = 6;
                    array = z2;
                    continue;
                }
                case 6: {
                    array[n2] = intern;
                    n2 = 8;
                    s = ".%\u0019\u001e\u0017=./\u0018\u000411\u0019\u0004\u0013\u0001'\u0018\u0007\u00021";
                    n = 7;
                    array = z2;
                    continue;
                }
                case 7: {
                    array[n2] = intern;
                    n2 = 9;
                    s = ".%\u001f\u000e\u001f22";
                    n = 8;
                    array = z2;
                    continue;
                }
                case 8: {
                    array[n2] = intern;
                    n2 = 10;
                    s = ".%\u0019\u001e\u0017=./\u001b\u0002?#\u0005\u001b";
                    n = 9;
                    array = z2;
                    continue;
                }
                case 9: {
                    array[n2] = intern;
                    n2 = 11;
                    s = ".%\u0019\u001e\u0017=./\u0004\u0017-#/\u001b\u0013;9";
                    n = 10;
                    array = z2;
                    continue;
                }
                case 10: {
                    array[n2] = intern;
                    n2 = 12;
                    s = ".%\u001f\u000e\u001f22";
                    n = 11;
                    array = z2;
                    continue;
                }
                case 11: {
                    array[n2] = intern;
                    n2 = 13;
                    s = "=8\u001dF\u000166\u0004\u001b\u0017.'/\u0018\u0004;1\u0015\u001a\u001304\u0015\u001b";
                    n = 12;
                    array = z2;
                    continue;
                }
                case 12: {
                    array[n2] = intern;
                    n2 = 14;
                    s = "-2\u0004\u001c\u001f00\u0003\u0018\u00047!\u0011\u000b\u000fq%\u0015\u000b\u00137!\u0015\fV";
                    n = 13;
                    array = z2;
                    continue;
                }
                case 13: {
                    array[n2] = intern;
                    n2 = 15;
                    s = ".%\u0019\u001e\u0017=./\u0018\u000411\u0019\u0004\u0013\u0001'\u0018\u0007\u00021";
                    n = 14;
                    array = z2;
                    continue;
                }
                case 14: {
                    array[n2] = intern;
                    n2 = 16;
                    s = "-#\u0011\u001c\u0003-";
                    n = 15;
                    array = z2;
                    continue;
                }
                case 15: {
                    array[n2] = intern;
                    n2 = 17;
                    s = ".%\u0019\u001e\u0017=./\u001b\u0002?#\u0005\u001b";
                    n = 16;
                    array = z2;
                    continue;
                }
                case 16: {
                    array[n2] = intern;
                    n2 = 18;
                    s = "26\u0003\u001c";
                    n = 17;
                    array = z2;
                    continue;
                }
                case 17: {
                    array[n2] = intern;
                    n2 = 19;
                    s = ".%\u0019\u001e\u0017=./\u0004\u0017-#/\u001b\u0013;9";
                    n = 18;
                    array = z2;
                    continue;
                }
                case 18: {
                    array[n2] = intern;
                    n2 = 20;
                    s = "<;\u001f\u000b\u001d\u0001;\u0019\u001b\u0002";
                    n = 19;
                    array = z2;
                    continue;
                }
                case 19: {
                    array[n2] = intern;
                    n2 = 21;
                    s = "<;\u001f\u000b\u001d\u0001;\u0019\u001b\u0002";
                    n = 20;
                    array = z2;
                    continue;
                }
                case 20: {
                    array[n2] = intern;
                    n2 = 22;
                    s = ".%\u0019\u001e\u0017=./\u0018\u000411\u0019\u0004\u0013\u0001'\u0018\u0007\u00021";
                    n = 21;
                    array = z2;
                    continue;
                }
                case 21: {
                    array[n2] = intern;
                    n2 = 23;
                    s = "-2\u0004\u001c\u001f00\u0003\u0018\u00047!\u0011\u000b\u000fq4\u0002\r\u0017*2";
                    n = 22;
                    array = z2;
                    continue;
                }
                case 22: {
                    array[n2] = intern;
                    n2 = 24;
                    s = ".%\u0019\u001e\u0017=./\u001b\u0002?#\u0005\u001b";
                    n = 23;
                    array = z2;
                    continue;
                }
                case 23: {
                    array[n2] = intern;
                    n2 = 25;
                    s = ",2\u0011\f),2\u0013\r\u001f.#\u00037\u001306\u0012\u0004\u0013:";
                    n = 24;
                    array = z2;
                    continue;
                }
                case 24: {
                    array[n2] = intern;
                    n2 = 26;
                    s = ".%\u0019\u001e\u0017=./\u0004\u0017-#/\u001b\u0013;9";
                    n = 25;
                    array = z2;
                    continue;
                }
                case 25: {
                    array[n2] = intern;
                    n2 = 27;
                    s = "=8\u001e\u001c\u0017=#\u0003";
                    n = 26;
                    array = z2;
                    continue;
                }
                case 26: {
                    array[n2] = intern;
                    n2 = 28;
                    s = "?;\u001c";
                    n = 27;
                    array = z2;
                    continue;
                }
                case 27: {
                    array[n2] = intern;
                    n2 = 29;
                    s = "08\u001e\r";
                    n = 28;
                    array = z2;
                    continue;
                }
                case 28: {
                    array[n2] = intern;
                    n2 = 30;
                    s = "?;\u001c";
                    n = 29;
                    array = z2;
                    continue;
                }
                case 29: {
                    array[n2] = intern;
                    n2 = 31;
                    s = "08\u001e\r";
                    n = 30;
                    array = z2;
                    continue;
                }
                case 30: {
                    array[n2] = intern;
                    n2 = 32;
                    s = "?;\u001c";
                    n = 31;
                    array = z2;
                    continue;
                }
                case 31: {
                    array[n2] = intern;
                    n2 = 33;
                    s = "=8\u001e\u001c\u0017=#\u0003";
                    n = 32;
                    array = z2;
                    continue;
                }
                case 32: {
                    break Label_0882;
                }
            }
        }
        array[n2] = intern;
        z = z2;
        SettingsPrivacy.j = new HashMap();
        SettingsPrivacy.k = new Handler(Looper.getMainLooper());
        SettingsPrivacy.i = new a22();
    }
    
    public SettingsPrivacy() {
        this.g = (Preference$OnPreferenceChangeListener)new aq2(this);
    }
    
    private static int a(final String s) {
        if (SettingsPrivacy.z[32].equals(s)) {
            return 0;
        }
        if (SettingsPrivacy.z[33].equals(s)) {
            return 1;
        }
        if (SettingsPrivacy.z[31].equals(s)) {
            return 2;
        }
        return -1;
    }
    
    protected static String a(final int n) {
        switch (n) {
            default: {
                return SettingsPrivacy.z[30];
            }
            case 0: {
                return SettingsPrivacy.z[28];
            }
            case 1: {
                return SettingsPrivacy.z[27];
            }
            case 2: {
                return SettingsPrivacy.z[29];
            }
        }
    }
    
    private void a() {
        int n = 1;
        final SharedPreferences sharedPreferences = this.getSharedPreferences(SettingsPrivacy.z[n], 0);
        final String[] stringArray = this.getResources().getStringArray(2131689494);
        final WaPrivacyPreference waPrivacyPreference = (WaPrivacyPreference)this.findPreference((CharSequence)SettingsPrivacy.z[7]);
        final db db = SettingsPrivacy.j.get(SettingsPrivacy.z[2]);
        boolean enabled;
        if (db == null) {
            enabled = (n != 0);
        }
        else {
            enabled = false;
        }
        waPrivacyPreference.setEnabled(enabled);
        boolean b;
        if (db != null) {
            b = (n != 0);
        }
        else {
            b = false;
        }
        waPrivacyPreference.a(b);
        int n2;
        if (db == null) {
            n2 = sharedPreferences.getInt(SettingsPrivacy.z[4], 0);
        }
        else {
            n2 = a(db.c);
        }
        final int max = Math.max(0, n2);
        waPrivacyPreference.setValueIndex(max);
        waPrivacyPreference.setSummary((CharSequence)stringArray[max]);
        final WaPrivacyPreference waPrivacyPreference2 = (WaPrivacyPreference)this.findPreference((CharSequence)SettingsPrivacy.z[3]);
        final db db2 = SettingsPrivacy.j.get(SettingsPrivacy.z[9]);
        boolean enabled2;
        if (db2 == null) {
            enabled2 = (n != 0);
        }
        else {
            enabled2 = false;
        }
        waPrivacyPreference2.setEnabled(enabled2);
        boolean b2;
        if (db2 != null) {
            b2 = (n != 0);
        }
        else {
            b2 = false;
        }
        waPrivacyPreference2.a(b2);
        int n3;
        if (db2 == null) {
            n3 = sharedPreferences.getInt(SettingsPrivacy.z[8], 0);
        }
        else {
            n3 = a(db2.c);
        }
        final int max2 = Math.max(0, n3);
        waPrivacyPreference2.setValueIndex(max2);
        waPrivacyPreference2.setSummary((CharSequence)stringArray[max2]);
        final WaPrivacyPreference waPrivacyPreference3 = (WaPrivacyPreference)this.findPreference((CharSequence)SettingsPrivacy.z[10]);
        final db db3 = SettingsPrivacy.j.get(SettingsPrivacy.z[6]);
        waPrivacyPreference3.setEnabled(db3 == null && n);
        if (db3 == null) {
            n = 0;
        }
        waPrivacyPreference3.a(n != 0);
        int n4;
        if (db3 == null) {
            n4 = sharedPreferences.getInt(SettingsPrivacy.z[5], 0);
        }
        else {
            n4 = a(db3.c);
        }
        final int max3 = Math.max(0, n4);
        waPrivacyPreference3.setValueIndex(max3);
        waPrivacyPreference3.setSummary((CharSequence)stringArray[max3]);
    }
    
    static void a(final SettingsPrivacy settingsPrivacy) {
        settingsPrivacy.a();
    }
    
    public static void a(final Hashtable hashtable) {
        final boolean i = App.I;
        final SharedPreferences sharedPreferences = App.aq.getSharedPreferences(SettingsPrivacy.z[13], 0);
        final SharedPreferences$Editor edit = sharedPreferences.edit();
        final Enumeration<String> keys = hashtable.keys();
        int n = 0;
        while (true) {
            while (keys.hasMoreElements()) {
                final String s = keys.nextElement();
                final String s2 = (String)hashtable.get(s);
                Log.i(SettingsPrivacy.z[14] + s + ":" + s2);
                final int a = a(s2);
                int n2 = 0;
                Label_0290: {
                    int n3;
                    if (a < 0) {
                        if (!i) {
                            n2 = 1;
                            break Label_0290;
                        }
                        n3 = 1;
                    }
                    else {
                        n3 = n;
                    }
                    final db db = SettingsPrivacy.j.get(s);
                    Label_0286: {
                        if (db == null || db.c.equals(s2)) {
                            SettingsPrivacy.j.remove(s);
                            if (SettingsPrivacy.z[18].equals(s)) {
                                final int int1 = sharedPreferences.getInt(SettingsPrivacy.z[11], 0);
                                edit.putInt(SettingsPrivacy.z[19], a);
                                if (int1 != a) {
                                    App.s.a();
                                }
                                if (!i) {
                                    break Label_0286;
                                }
                            }
                            if (SettingsPrivacy.z[12].equals(s)) {
                                edit.putInt(SettingsPrivacy.z[15], a);
                                if (!i) {
                                    break Label_0286;
                                }
                            }
                            if (SettingsPrivacy.z[16].equals(s)) {
                                edit.putInt(SettingsPrivacy.z[17], a);
                            }
                        }
                    }
                    n2 = n3;
                }
                if (i) {
                    edit.commit();
                    if (n2 != 0) {
                        App.a(App.aq.getApplicationContext(), 2131231119, 1);
                    }
                    if (SettingsPrivacy.h != null) {
                        SettingsPrivacy.h.a();
                    }
                    return;
                }
                n = n2;
            }
            int n2 = n;
            continue;
        }
    }
    
    static Handler b() {
        return SettingsPrivacy.k;
    }
    
    static SettingsPrivacy c() {
        return SettingsPrivacy.h;
    }
    
    static Runnable d() {
        return SettingsPrivacy.i;
    }
    
    static HashMap e() {
        return SettingsPrivacy.j;
    }
    
    @Override
    protected void onCreate(final Bundle bundle) {
        super.onCreate(bundle);
        Log.i(SettingsPrivacy.z[23]);
        (SettingsPrivacy.h = this).addPreferencesFromResource(2131099662);
        ((WaPrivacyPreference)this.findPreference((CharSequence)SettingsPrivacy.z[26])).setOnPreferenceChangeListener(this.g);
        ((WaPrivacyPreference)this.findPreference((CharSequence)SettingsPrivacy.z[22])).setOnPreferenceChangeListener(this.g);
        ((WaPrivacyPreference)this.findPreference((CharSequence)SettingsPrivacy.z[24])).setOnPreferenceChangeListener(this.g);
        this.findPreference((CharSequence)SettingsPrivacy.z[25]).setOnPreferenceChangeListener((Preference$OnPreferenceChangeListener)new hf(this));
        this.findPreference((CharSequence)SettingsPrivacy.z[21]).setOnPreferenceClickListener((Preference$OnPreferenceClickListener)new h1(this));
        this.a();
        App.aS();
    }
    
    public void onDestroy() {
        Log.i(SettingsPrivacy.z[0]);
        super.onDestroy();
        SettingsPrivacy.h = null;
    }
    
    @Override
    protected void onResume() {
        super.onResume();
        final Preference preference = this.findPreference((CharSequence)SettingsPrivacy.z[20]);
        final int size = App.as.size();
        String title = null;
        Label_0082: {
            if (size > 0) {
                title = this.getString(2131231673, new Object[] { size });
                if (!App.I) {
                    break Label_0082;
                }
            }
            title = this.getString(2131231673, new Object[] { this.getString(2131231674) });
        }
        preference.setTitle((CharSequence)title);
    }
}
