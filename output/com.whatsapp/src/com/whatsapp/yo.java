// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.os.Bundle;
import com.whatsapp.util.Log;
import android.app.Activity;
import android.app.Application$ActivityLifecycleCallbacks;

class yo implements Application$ActivityLifecycleCallbacks
{
    private static final String[] z;
    final App a;
    
    static {
        final String[] z2 = new String[7];
        String s = "\u000432\u001c\b_/9";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0207:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = 'i';
                        break;
                    }
                    case 0: {
                        c2 = '*';
                        break;
                    }
                    case 1: {
                        c2 = '\\';
                        break;
                    }
                    case 2: {
                        c2 = '\\';
                        break;
                    }
                    case 3: {
                        c2 = 'L';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "\u000432\u001f\b\\9\u0015\"\u001a^=2/\fy(=8\f";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "\u000432\u001e\fY)1)";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "\u000432\b\fY(.#\u0010";
                    n2 = 3;
                    array = z2;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    s = "\u000432\u001f\u001dK.(";
                    n2 = 4;
                    array = z2;
                    n = 3;
                    continue;
                }
                case 3: {
                    array[n2] = intern;
                    n2 = 5;
                    array = z2;
                    s = "\u000432\u000f\u001bO=()";
                    n = 4;
                    continue;
                }
                case 4: {
                    array[n2] = intern;
                    n2 = 6;
                    s = "\u000432\u001f\u001dE,";
                    n = 5;
                    array = z2;
                    continue;
                }
                case 5: {
                    break Label_0207;
                }
            }
        }
        array[n2] = intern;
        z = z2;
    }
    
    yo(final App a) {
        this.a = a;
    }
    
    private void a(final Activity activity, final String s) {
        if (!(activity instanceof DialogToastActivity) && !(activity instanceof DialogToastPreferenceActivity)) {
            Log.i(activity.getClass().getName() + s);
        }
    }
    
    public void onActivityCreated(final Activity activity, final Bundle bundle) {
        this.a(activity, yo.z[5]);
    }
    
    public void onActivityDestroyed(final Activity activity) {
        this.a(activity, yo.z[3]);
    }
    
    public void onActivityPaused(final Activity activity) {
        this.a(activity, yo.z[0]);
    }
    
    public void onActivityResumed(final Activity activity) {
        this.a(activity, yo.z[2]);
    }
    
    public void onActivitySaveInstanceState(final Activity activity, final Bundle bundle) {
        this.a(activity, yo.z[1]);
    }
    
    public void onActivityStarted(final Activity activity) {
        this.a(activity, yo.z[4]);
    }
    
    public void onActivityStopped(final Activity activity) {
        this.a(activity, yo.z[6]);
    }
}
