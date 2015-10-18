// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.content.pm.ActivityInfo;
import java.util.List;
import android.os.Parcelable;
import android.content.ComponentName;
import com.whatsapp.util.Log;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.content.Intent;
import android.preference.Preference;
import android.preference.Preference$OnPreferenceClickListener;

class awe implements Preference$OnPreferenceClickListener
{
    private static final String[] z;
    final SettingsChat a;
    
    static {
        final String[] z2 = new String[12];
        String s = "p8F\u001c\u001d{6_A\u000bc'\u0005[\u0004g2EFDr4_[\u0005}yow,R\u0002gf5D\u0016g~:R\u0007n`";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0332:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = 'j';
                        break;
                    }
                    case 0: {
                        c2 = '\u0013';
                        break;
                    }
                    case 1: {
                        c2 = 'W';
                        break;
                    }
                    case 2: {
                        c2 = '+';
                        break;
                    }
                    case 3: {
                        c2 = '2';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "|%BW\u0004g6_[\u0005}";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "r9O@\u0005z3\u0005[\u0004g2EFDr4_[\u0005}ylw>L\u0014d|>V\u0019\u007f";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "z:JU\u000f<}";
                    n2 = 3;
                    array = z2;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    s = "p8F\u001c\u001d{6_A\u000bc'\u0005[\u0004g2EFDr4_[\u0005}yxw>L\u0000j~&C\u0016{w8";
                    n2 = 4;
                    array = z2;
                    n = 3;
                    continue;
                }
                case 3: {
                    array[n2] = intern;
                    n2 = 5;
                    array = z2;
                    s = "p8F\u001c\u001d{6_A\u000bc'\u0005[\u0004g2EFDr4_[\u0005}yyw9V\u0003te+_\u001b{s:V\u0005";
                    n = 4;
                    continue;
                }
                case 4: {
                    array[n2] = intern;
                    n2 = 6;
                    s = "p8D^\u0003a>X";
                    n = 5;
                    array = z2;
                    continue;
                }
                case 5: {
                    array[n2] = intern;
                    n2 = 7;
                    s = "p8F\u001c\u0002g4\u0005S\u0006q\"F";
                    n = 6;
                    array = z2;
                    continue;
                }
                case 6: {
                    array[n2] = intern;
                    n2 = 8;
                    s = "|%BW\u0004g6_[\u0005}";
                    n = 7;
                    array = z2;
                    continue;
                }
                case 7: {
                    array[n2] = intern;
                    n2 = 9;
                    s = "r9O@\u0005z3\u0005[\u0004g2EFDv/_@\u000b=\u001ee{>Z\u0016gm#]\u0003n|>@";
                    n = 8;
                    array = z2;
                    continue;
                }
                case 8: {
                    array[n2] = intern;
                    n2 = 10;
                    s = "3+\u000b";
                    n = 9;
                    array = z2;
                    continue;
                }
                case 9: {
                    array[n2] = intern;
                    n2 = 11;
                    s = "T6G^\u000fa.";
                    n = 10;
                    array = z2;
                    continue;
                }
                case 10: {
                    break Label_0332;
                }
            }
        }
        array[n2] = intern;
        z = z2;
    }
    
    awe(final SettingsChat a) {
        this.a = a;
    }
    
    public boolean onPreferenceClick(final Preference preference) {
        final boolean i = App.I;
        final Intent intent = new Intent(awe.z[2], (Uri)null);
        intent.setType(awe.z[3]);
        final List queryIntentActivities = this.a.getPackageManager().queryIntentActivities(intent, 0);
        int n;
        for (int size = queryIntentActivities.size(), j = 0; j < size; j = n) {
            final ActivityInfo activityInfo = queryIntentActivities.get(j).activityInfo;
            Log.i(activityInfo.applicationInfo.packageName + awe.z[10] + activityInfo.name);
            if ((activityInfo.name.contains(awe.z[6]) && activityInfo.name.contains(awe.z[11])) || activityInfo.name.contains(awe.z[7])) {
                intent.setComponent(new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name));
                intent.putExtra(awe.z[1], this.a.getResources().getConfiguration().orientation);
                if (!i) {
                    break;
                }
            }
            n = j + 1;
            if (i) {
                break;
            }
        }
        final Intent intent2 = new Intent(awe.z[4], (Uri)null);
        intent2.putExtra(awe.z[8], this.a.getResources().getConfiguration().orientation);
        final Parcelable[] array = { intent, intent2, new Intent(awe.z[0], (Uri)null) };
        final Intent chooser = Intent.createChooser(new Intent(awe.z[5], (Uri)null), (CharSequence)this.a.getString(2131231479));
        chooser.putExtra(awe.z[9], array);
        this.a.startActivityForResult(chooser, 17);
        return true;
    }
}
