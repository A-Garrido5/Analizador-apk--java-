// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.content.DialogInterface$OnClickListener;
import com.whatsapp.preference.WaDialogPreference;
import android.os.Bundle;
import android.preference.Preference;
import android.preference.PreferenceScreen;
import java.util.Date;
import com.whatsapp.gdrive.GoogleDriveService;
import java.text.SimpleDateFormat;

public class SettingsNetworkUsage extends DialogToastPreferenceActivity
{
    private static final SimpleDateFormat g;
    private static final String[] z;
    
    static {
        final String[] z2 = new String[20];
        String s = "}$ /K\u007f\u0014+:Nl.\u0010<Hn*#\u0017Ec?*;xh.,-Nl.+";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0532:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = '\'';
                        break;
                    }
                    case 0: {
                        c2 = '\u001a';
                        break;
                    }
                    case 1: {
                        c2 = 'K';
                        break;
                    }
                    case 2: {
                        c2 = 'O';
                        break;
                    }
                    case 3: {
                        c2 = 'H';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "}$ /K\u007f\u0014+:Nl.\u0010<Hn*#\u0017Ec?*;xi.!<";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "t.;?Hh \u0010=T{,*\u0017Qu\"?\u0017D{'#;xi.!<";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "}$ /K\u007f\u0014+:Nl.\u0010<Hn*#\u0017Ec?*;xh.,-Nl.+";
                    n2 = 3;
                    array = z2;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    s = "t.;?Hh \u0010=T{,*\u0017J\u007f/&)xx2;-TE8*&S";
                    n2 = 4;
                    array = z2;
                    n = 3;
                    continue;
                }
                case 3: {
                    array[n2] = intern;
                    n2 = 5;
                    array = z2;
                    s = "t.;?Hh \u0010=T{,*\u0017Qu\"?\u0017D{'#\u0017Ec?*;xi.!<";
                    n = 4;
                    continue;
                }
                case 4: {
                    array[n2] = intern;
                    n2 = 6;
                    s = "t.;?Hh \u0010=T{,*\u0017J\u007f8<)@\u007f8\u0010:By.&>B~";
                    n = 5;
                    array = z2;
                    continue;
                }
                case 5: {
                    array[n2] = intern;
                    n2 = 7;
                    s = "t.;?Hh \u0010=T{,*\u0017J\u007f8<)@\u007f8\u0010;Bt?";
                    n = 6;
                    array = z2;
                    continue;
                }
                case 6: {
                    array[n2] = intern;
                    n2 = 8;
                    s = "t.;?Hh \u0010=T{,*\u0017U\u007f8*<";
                    n = 7;
                    array = z2;
                    continue;
                }
                case 7: {
                    array[n2] = intern;
                    n2 = 9;
                    s = "}$ /K\u007f\u0014+:Nl.\u0010<Hn*#\u0017Ec?*;xi.!<";
                    n = 8;
                    array = z2;
                    continue;
                }
                case 8: {
                    array[n2] = intern;
                    n2 = 10;
                    s = "t.;?Hh \u0010=T{,*\u0017Qu\"?\u0017D{'#;xh.,-Nl.+";
                    n = 9;
                    array = z2;
                    continue;
                }
                case 9: {
                    array[n2] = intern;
                    n2 = 11;
                    s = "t.;?Hh \u0010=T{,*\u0017Qu\"?\u0017D{'#\u0017Ec?*;xh.,-Nl.+";
                    n = 10;
                    array = z2;
                    continue;
                }
                case 10: {
                    array[n2] = intern;
                    n2 = 12;
                    s = "t.;?Hh \u0010=T{,*\u0017Su?.$xx2;-TE9*+Bs=*,";
                    n = 11;
                    array = z2;
                    continue;
                }
                case 11: {
                    array[n2] = intern;
                    n2 = 13;
                    s = "t.;?Hh \u0010=T{,*\u0017U\u007f8*<";
                    n = 12;
                    array = z2;
                    continue;
                }
                case 12: {
                    array[n2] = intern;
                    n2 = 14;
                    s = "t.;?Hh \u0010=T{,*\u0017J\u007f8<)@\u007f\u0014-1S\u007f8\u0010:By.&>B~";
                    n = 13;
                    array = z2;
                    continue;
                }
                case 13: {
                    array[n2] = intern;
                    n2 = 15;
                    s = "t.;?Hh \u0010=T{,*\u0017Su?.$xx2;-TE8*&S";
                    n = 14;
                    array = z2;
                    continue;
                }
                case 14: {
                    array[n2] = intern;
                    n2 = 16;
                    s = "t.;?Hh \u0010=T{,*\u0017J\u007f8<)@\u007f\u0014-1S\u007f8\u0010;Bt?";
                    n = 15;
                    array = z2;
                    continue;
                }
                case 15: {
                    array[n2] = intern;
                    n2 = 17;
                    s = "t.;?Hh \u0010=T{,*\u0017J\u007f/&)xx2;-TE9*+Bs=*,";
                    n = 16;
                    array = z2;
                    continue;
                }
                case 16: {
                    array[n2] = intern;
                    n2 = 18;
                    s = "t.;?Hh \u0010=T{,*\u0017U\u007f8*<";
                    n = 17;
                    array = z2;
                    continue;
                }
                case 17: {
                    array[n2] = intern;
                    n2 = 19;
                    s = "c261\nW\u0006\u0002eC~k\u0007\u0000\u001dw&u;T";
                    n = 18;
                    array = z2;
                    continue;
                }
                case 18: {
                    break Label_0532;
                }
            }
        }
        array[n2] = intern;
        z = z2;
        g = new SimpleDateFormat(SettingsNetworkUsage.z[19]);
    }
    
    private void a() {
        final boolean i = App.I;
        final Statistics$Data a = atd.a;
        if (a != null) {
            this.a(SettingsNetworkUsage.z[7], 2131296289, a.getTotalMessagesSent());
            this.a(SettingsNetworkUsage.z[6], 2131296289, a.getTotalMessagesReceived());
            this.a(SettingsNetworkUsage.z[4], a.getMediaBytesSent());
            this.a(SettingsNetworkUsage.z[17], a.getMediaBytesReceived());
            this.a(SettingsNetworkUsage.z[16], a.getMessageBytesSent());
            this.a(SettingsNetworkUsage.z[14], a.getMessageBytesReceived());
            this.a(SettingsNetworkUsage.z[2], 2131296290, a.getOutgoingVoipCalls());
            this.a(SettingsNetworkUsage.z[10], 2131296290, a.getIncomingVoipCalls());
            this.a(SettingsNetworkUsage.z[5], a.getVoipBytesSent());
            this.a(SettingsNetworkUsage.z[11], a.getVoipBytesReceived());
            Label_0220: {
                if (GoogleDriveService.am()) {
                    this.a(SettingsNetworkUsage.z[1], a.getTotalBytesSentToGoogleDrive());
                    this.a(SettingsNetworkUsage.z[3], a.getTotalBytesReceivedFromGoogleDrive());
                    if (!i) {
                        break Label_0220;
                    }
                }
                this.a(this.getPreferenceScreen(), SettingsNetworkUsage.z[9]);
                this.a(this.getPreferenceScreen(), SettingsNetworkUsage.z[0]);
            }
            this.a(SettingsNetworkUsage.z[15], a.getTotalBytesSent());
            this.a(SettingsNetworkUsage.z[12], a.getTotalBytesReceived());
            final long lastReset = a.getLastReset();
            if (lastReset != Long.MIN_VALUE) {
                this.a(SettingsNetworkUsage.z[13], 2131231390, new Object[] { SettingsNetworkUsage.g.format(new Date(lastReset)) });
                if (!i) {
                    return;
                }
            }
            this.a(SettingsNetworkUsage.z[8], 2131231390, new Object[] { this.getString(2131231404) });
        }
    }
    
    private void a(final PreferenceScreen preferenceScreen, final String s) {
        if (preferenceScreen != null && s != null) {
            final Preference preference = this.findPreference((CharSequence)s);
            if (preference != null) {
                preferenceScreen.removePreference(preference);
            }
        }
    }
    
    static void a(final SettingsNetworkUsage settingsNetworkUsage) {
        settingsNetworkUsage.a();
    }
    
    private void a(final String s, final int n, final long n2) {
        final Preference preference = this.findPreference((CharSequence)s);
        if (preference != null) {
            preference.setSummary((CharSequence)String.format(App.C.a(n, (int)n2), n2));
        }
    }
    
    private void a(final String s, final int n, final Object[] array) {
        final Preference preference = this.findPreference((CharSequence)s);
        if (preference != null) {
            preference.setSummary((CharSequence)String.format(this.getString(n), array));
        }
    }
    
    private void a(final String s, final long n) {
        final boolean i = App.I;
        double n2 = n;
        int n3 = 0;
        while (n3 < 3 && n2 > 1024.0) {
            n2 /= 1024.0;
            ++n3;
            if (i) {
                break;
            }
        }
        int n4 = 0;
        Label_0131: {
            switch (n3) {
                default: {
                    n4 = 0;
                    break;
                }
                case 0: {
                    this.a(s, 2131296288, n);
                    return;
                }
                case 1: {
                    n4 = 2131231388;
                    if (i) {
                        break Label_0131;
                    }
                    break;
                }
                case 2: {
                    n4 = 2131231389;
                    if (i) {
                        break Label_0131;
                    }
                    break;
                }
                case 3: {
                    n4 = 2131231387;
                    break;
                }
            }
        }
        this.a(s, n4, new Object[] { n2 });
    }
    
    @Override
    protected void onCreate(final Bundle bundle) {
        super.onCreate(bundle);
        this.addPreferencesFromResource(2131099660);
        ((WaDialogPreference)this.findPreference((CharSequence)SettingsNetworkUsage.z[18])).a((DialogInterface$OnClickListener)new aod(this));
    }
    
    @Override
    protected void onResume() {
        super.onResume();
        this.a();
    }
}
