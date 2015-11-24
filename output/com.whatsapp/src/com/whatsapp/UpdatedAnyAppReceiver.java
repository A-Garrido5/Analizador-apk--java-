// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.content.Intent;
import com.whatsapp.c2dm.C2DMRegistrar;
import com.whatsapp.util.Log;
import android.content.Context;
import com.whatsapp.c2dm.a;
import android.content.BroadcastReceiver;

public class UpdatedAnyAppReceiver extends BroadcastReceiver
{
    private static final String[] z;
    
    static {
        final String[] z2 = new String[5];
        String s = "qC@GTaWEVPvVGCIrVV\tRaPAOVa";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0156:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = ' ';
                        break;
                    }
                    case 0: {
                        c2 = '\u0004';
                        break;
                    }
                    case 1: {
                        c2 = '3';
                        break;
                    }
                    case 2: {
                        c2 = '$';
                        break;
                    }
                    case 3: {
                        c2 = '&';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "qC@GTaWEVPvVGCIrVV\tAtC\u000b@Oq]@";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "qC@GTaWEVPvVGCIrVV\tAtC\u000bHOp\u001eKSRw";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "qC@GTaRTVRaPAOVaA\u000bUKmC\tTEbAAUH";
                    n2 = 3;
                    array = z2;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    s = "qC@GTaWEVPvVGCIrVV\tRaBQCSp\u001eVCFvVWN";
                    n2 = 4;
                    array = z2;
                    n = 3;
                    continue;
                }
                case 3: {
                    break Label_0156;
                }
            }
        }
        array[n2] = intern;
        z = z2;
    }
    
    public static void a() {
        final a a = new a((Context)App.aq);
        a.a();
        a.i();
        if (App.aX != null) {
            Log.i(UpdatedAnyAppReceiver.z[4]);
            C2DMRegistrar.a((Context)App.aq);
            if (!App.I) {
                return;
            }
        }
        Log.i(UpdatedAnyAppReceiver.z[3]);
    }
    
    public void onReceive(final Context context, final Intent intent) {
        Log.i(UpdatedAnyAppReceiver.z[0]);
        if (intent.getData().getSchemeSpecificPart().equals(context.getPackageName())) {
            Log.i(UpdatedAnyAppReceiver.z[1]);
            a();
            if (!App.I) {
                return;
            }
        }
        Log.i(UpdatedAnyAppReceiver.z[2]);
    }
}
