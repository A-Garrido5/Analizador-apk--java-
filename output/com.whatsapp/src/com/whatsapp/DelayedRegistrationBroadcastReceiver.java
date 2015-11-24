// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.content.SharedPreferences;
import java.util.EnumSet;
import java.util.Calendar;
import android.content.SharedPreferences$Editor;
import com.whatsapp.util.Log;
import android.os.Build$VERSION;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.Context;
import android.content.BroadcastReceiver;

final class DelayedRegistrationBroadcastReceiver extends BroadcastReceiver
{
    private static final String[] z;
    
    static {
        final String[] z2 = new String[26];
        String s = "R\u0000&\u0011\u0016Y\u000e?L\u0000A\u001f\u0014O\u0013T\t.M\u0004_\f.L";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0682:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = 'a';
                        break;
                    }
                    case 0: {
                        c2 = '1';
                        break;
                    }
                    case 1: {
                        c2 = 'o';
                        break;
                    }
                    case 2: {
                        c2 = 'K';
                        break;
                    }
                    case 3: {
                        c2 = '?';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "R\u0000&\u0011\u0016Y\u000e?L\u0000A\u001f";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "P\u0003*M\f";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "P\u001f;\u0010\u0000]\u000e9RNC\n,K\u000e^\u0003$Q\u0006\u001e\f*Q\u0002T\u0003dM\u0004\\\u0000=ZLE\u0006&ZNT\u001d9P\u0013";
                    n2 = 3;
                    array = z2;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    s = "C\n,V\u0012E\u001d*K\b^\u0001\u0014L\u0015P\u001d?`\u0015X\u0002.";
                    n2 = 4;
                    array = z2;
                    n = 3;
                    continue;
                }
                case 3: {
                    array[n2] = intern;
                    n2 = 5;
                    array = z2;
                    s = "R\u0000&\u0011\u0016Y\u000e?L\u0000A\u001fe^\rP\u001d&\u00113t(\u0002l5c.\u001fv.\u007f0\u001f~*x!\f`5~ \u0014s.\u007f(\u0014k(|*\u0004j5";
                    n = 4;
                    continue;
                }
                case 4: {
                    array[n2] = intern;
                    n2 = 6;
                    s = "R\u0000&\u0011\u0016Y\u000e?L\u0000A\u001fe^\rP\u001d&\u00113t(\u0002l5c.\u001fv.\u007f0\u001f~*x!\f`5~ \u0014s.\u007f(\u0014k(|*\u0004j5";
                    n = 5;
                    array = z2;
                    continue;
                }
                case 5: {
                    array[n2] = intern;
                    n2 = 7;
                    s = "R\u0000&\u0011\u0016Y\u000e?L\u0000A\u001f";
                    n = 6;
                    array = z2;
                    continue;
                }
                case 6: {
                    array[n2] = intern;
                    n2 = 8;
                    s = "P\u0003*M\f";
                    n = 7;
                    array = z2;
                    continue;
                }
                case 7: {
                    array[n2] = intern;
                    n2 = 9;
                    s = "R\u0000&\u0011\u0016Y\u000e?L\u0000A\u001f\u0014O\u0013T\t.M\u0004_\f.L";
                    n = 8;
                    array = z2;
                    continue;
                }
                case 8: {
                    array[n2] = intern;
                    n2 = 10;
                    s = "P\u001f;\u0010\u0000]\u000e9RNC\n,K\u000e^\u0003$Q\u0006\u001e\u001c.KNP\u00039Z\u0000U\u0016fZ\u0019X\u001c?LNB\u0004\"O";
                    n = 9;
                    array = z2;
                    continue;
                }
                case 9: {
                    array[n2] = intern;
                    n2 = 11;
                    s = "R\u0000&\u0011\u0016Y\u000e?L\u0000A\u001fe^\rP\u001d&\u00113t(\u0002l5c.\u001fv.\u007f0\u001f~*x!\f`5~ \u0014s.\u007f(\u0014k(|*\u0004j5";
                    n = 10;
                    array = z2;
                    continue;
                }
                case 10: {
                    array[n2] = intern;
                    n2 = 12;
                    s = "R\u0000&\u0011\u0016Y\u000e?L\u0000A\u001f";
                    n = 11;
                    array = z2;
                    continue;
                }
                case 11: {
                    array[n2] = intern;
                    n2 = 13;
                    s = "C\n,V\u0012E\u001d*K\b^\u0001\u0014L\u0015P\u001d?`\u0015X\u0002.";
                    n = 12;
                    array = z2;
                    continue;
                }
                case 12: {
                    array[n2] = intern;
                    n2 = 14;
                    s = "P\u001f;\u0010\u0012T\u001b9Z\u0006X\u001c?M\u0000E\u0006$Q\u0012E\u000e9K\u0015X\u0002.\u0010\u0004C\u001d$M";
                    n = 13;
                    array = z2;
                    continue;
                }
                case 13: {
                    array[n2] = intern;
                    n2 = 15;
                    s = "C\n,V\u0012E\u001d*K\b^\u0001\u0014L\u0015P\u001d?`\u0015X\u0002.";
                    n = 14;
                    array = z2;
                    continue;
                }
                case 14: {
                    array[n2] = intern;
                    n2 = 16;
                    s = "R\u0000&\u0011\u0016Y\u000e?L\u0000A\u001f\u0014O\u0013T\t.M\u0004_\f.L";
                    n = 15;
                    array = z2;
                    continue;
                }
                case 15: {
                    array[n2] = intern;
                    n2 = 17;
                    s = "R\u0000&\u0011\u0016Y\u000e?L\u0000A\u001f\u0014O\u0013T\t.M\u0004_\f.L";
                    n = 16;
                    array = z2;
                    continue;
                }
                case 16: {
                    array[n2] = intern;
                    n2 = 18;
                    s = "C\n,V\u0012E\u001d*K\b^\u0001k\u0001\\\u0011^y\u001f\tC\u001c";
                    n = 17;
                    array = z2;
                    continue;
                }
                case 17: {
                    array[n2] = intern;
                    n2 = 19;
                    s = "P\u001f;\u0010\u0013T\b\"L\u0015C\u000e?V\u000e_\u001b*T\b_\b?P\u000e]\u0000%XNR\fk";
                    n = 18;
                    array = z2;
                    continue;
                }
                case 18: {
                    array[n2] = intern;
                    n2 = 20;
                    s = "\u0011\u001c\"R\\";
                    n = 19;
                    array = z2;
                    continue;
                }
                case 19: {
                    array[n2] = intern;
                    n2 = 21;
                    s = "R\f";
                    n = 20;
                    array = z2;
                    continue;
                }
                case 20: {
                    array[n2] = intern;
                    n2 = 22;
                    s = "A\u0007";
                    n = 21;
                    array = z2;
                    continue;
                }
                case 21: {
                    array[n2] = intern;
                    n2 = 23;
                    s = "C\n,V\u0012E\u001d*K\b^\u0001\u0014L\u0015P\u001d?`\u0015X\u0002.";
                    n = 22;
                    array = z2;
                    continue;
                }
                case 22: {
                    array[n2] = intern;
                    n2 = 24;
                    s = "\u0011\u0001>R\\";
                    n = 23;
                    array = z2;
                    continue;
                }
                case 23: {
                    array[n2] = intern;
                    n2 = 25;
                    s = "P\u001f;\u0010\u0013T\b\"L\u0015C\u000e?V\u000e_\u001b*T\b_\b?P\u000e]\u0000%XNE\u0006&Z\u000eD\u001b";
                    n = 24;
                    array = z2;
                    continue;
                }
                case 24: {
                    break Label_0682;
                }
            }
        }
        array[n2] = intern;
        z = z2;
    }
    
    private void a(final Context context, final long n) {
        final PendingIntent broadcast = PendingIntent.getBroadcast(context, 0, new Intent(DelayedRegistrationBroadcastReceiver.z[6]).setPackage(DelayedRegistrationBroadcastReceiver.z[7]), 134217728);
        final AlarmManager alarmManager = (AlarmManager)context.getSystemService(DelayedRegistrationBroadcastReceiver.z[8]);
        if (Build$VERSION.SDK_INT >= 19) {
            alarmManager.setExact(0, n, broadcast);
            if (!App.I) {
                return;
            }
        }
        alarmManager.set(0, n, broadcast);
    }
    
    private void b(final Context context, final long n) {
        final SharedPreferences$Editor edit = context.getSharedPreferences(DelayedRegistrationBroadcastReceiver.z[16], 0).edit();
        edit.putLong(DelayedRegistrationBroadcastReceiver.z[15], n);
        if (!edit.commit()) {
            Log.w(DelayedRegistrationBroadcastReceiver.z[14]);
        }
    }
    
    public void a(final Context context) {
        final PendingIntent broadcast = PendingIntent.getBroadcast(context, 0, new Intent(DelayedRegistrationBroadcastReceiver.z[5]).setPackage(DelayedRegistrationBroadcastReceiver.z[1]), 536870912);
        if (broadcast != null) {
            ((AlarmManager)context.getSystemService(DelayedRegistrationBroadcastReceiver.z[2])).cancel(broadcast);
            final SharedPreferences$Editor edit = context.getSharedPreferences(DelayedRegistrationBroadcastReceiver.z[0], 0).edit();
            edit.remove(DelayedRegistrationBroadcastReceiver.z[4]);
            if (!edit.commit()) {
                Log.w(DelayedRegistrationBroadcastReceiver.z[3]);
            }
        }
    }
    
    public void b(final Context context) {
        final boolean i = App.I;
        final long long1 = context.getSharedPreferences(DelayedRegistrationBroadcastReceiver.z[9], 0).getLong(DelayedRegistrationBroadcastReceiver.z[13], -1L);
        if (long1 != -2L) {
            final long currentTimeMillis = System.currentTimeMillis();
            final Calendar instance = Calendar.getInstance();
            instance.setTimeInMillis(currentTimeMillis);
            instance.add(12, 720);
            final PendingIntent broadcast = PendingIntent.getBroadcast(context, 0, new Intent(DelayedRegistrationBroadcastReceiver.z[11]).setPackage(DelayedRegistrationBroadcastReceiver.z[12]), 536870912);
            if (broadcast != null && long1 == -1L) {
                this.b(context, currentTimeMillis);
                this.a(context, instance.getTimeInMillis());
                if (!i) {
                    return;
                }
            }
            if (broadcast != null) {
                Log.i(DelayedRegistrationBroadcastReceiver.z[10]);
                if (!i) {
                    return;
                }
            }
            this.b(context, currentTimeMillis);
            this.a(context, instance.getTimeInMillis());
        }
    }
    
    public void onReceive(final Context context, final Intent intent) {
        Log.i(DelayedRegistrationBroadcastReceiver.z[25]);
        final SharedPreferences sharedPreferences = context.getSharedPreferences(DelayedRegistrationBroadcastReceiver.z[17], 0);
        final long long1 = sharedPreferences.getLong(DelayedRegistrationBroadcastReceiver.z[23], -1L);
        if (long1 > 0L && System.currentTimeMillis() - long1 > 43200000L) {
            this.a(context);
            if (App.aS == 1 && App.c((Context)App.aq) != 3) {
                Log.i(DelayedRegistrationBroadcastReceiver.z[19] + sharedPreferences.getString(DelayedRegistrationBroadcastReceiver.z[21], "") + DelayedRegistrationBroadcastReceiver.z[24] + sharedPreferences.getString(DelayedRegistrationBroadcastReceiver.z[22], "") + DelayedRegistrationBroadcastReceiver.z[20] + App.h.getSimState() + " " + App.h.getLine1Number());
                App.a(DelayedRegistrationBroadcastReceiver.z[18], false, f8.CRASH, null);
            }
            this.b(context, -2L);
            if (!App.I) {
                return;
            }
        }
        this.a(context, long1 + 43200000L);
    }
}
