// 
// Decompiled by Procyon v0.5.30
// 

package de.greenrobot.event.util;

import android.support.v4.app.DialogFragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentActivity;
import android.app.Activity;
import android.os.Bundle;
import de.greenrobot.event.m;
import android.support.v4.app.Fragment;

public class ErrorDialogManager$SupportManagerFragment extends Fragment
{
    private static final String[] z;
    protected boolean b;
    private m c;
    protected Bundle d;
    private boolean e;
    private Object f;
    
    static {
        final String[] z2 = new String[4];
        String s = "0\u0016:Xt1\u0016zMi6\u001c`\u0011c\"\u0016zKd!\u0000:Zt&\u001cf`b=\u0012xPa\u000b\u001euQg3\u0016f";
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
                        c2 = '\u0006';
                        break;
                    }
                    case 0: {
                        c2 = 'T';
                        break;
                    }
                    case 1: {
                        c2 = 's';
                        break;
                    }
                    case 2: {
                        c2 = '\u0014';
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
                    s = "0\u0016:Xt1\u0016zMi6\u001c`\u0011c\"\u0016zKd!\u0000:Zt&\u001cf`b=\u0012xPa\u000b\u001euQg3\u0016f";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "0\u0016:Xt1\u0016zMi6\u001c`\u0011c\"\u0016zKd!\u0000:Zt&\u001cf`b=\u0012xPa";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    n2 = 3;
                    array = z2;
                    s = "0\u0016:Xt1\u0016zMi6\u001c`\u0011c\"\u0016zKd!\u0000:Zt&\u001cf`b=\u0012xPa";
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
    
    public static void a(final Activity activity, final Object f, final boolean b, final Bundle d) {
        final int b2 = c.b;
        final FragmentManager supportFragmentManager = ((FragmentActivity)activity).getSupportFragmentManager();
        ErrorDialogManager$SupportManagerFragment errorDialogManager$SupportManagerFragment = (ErrorDialogManager$SupportManagerFragment)supportFragmentManager.findFragmentByTag(ErrorDialogManager$SupportManagerFragment.z[1]);
        if (errorDialogManager$SupportManagerFragment == null) {
            errorDialogManager$SupportManagerFragment = new ErrorDialogManager$SupportManagerFragment();
            supportFragmentManager.beginTransaction().add(errorDialogManager$SupportManagerFragment, ErrorDialogManager$SupportManagerFragment.z[0]).commit();
            supportFragmentManager.executePendingTransactions();
        }
        errorDialogManager$SupportManagerFragment.b = b;
        errorDialogManager$SupportManagerFragment.d = d;
        errorDialogManager$SupportManagerFragment.f = f;
        if (m.q != 0) {
            c.b = b2 + 1;
        }
    }
    
    @Override
    public void onCreate(final Bundle bundle) {
        super.onCreate(bundle);
        (this.c = g.g.a.a()).d(this);
        this.e = true;
    }
    
    public void onEventMainThread(final k k) {
        if (g.a(this.f, k)) {
            g.a(k);
            final FragmentManager fragmentManager = this.getFragmentManager();
            fragmentManager.executePendingTransactions();
            final DialogFragment dialogFragment = (DialogFragment)fragmentManager.findFragmentByTag(ErrorDialogManager$SupportManagerFragment.z[2]);
            if (dialogFragment != null) {
                dialogFragment.dismiss();
            }
            final DialogFragment dialogFragment2 = (DialogFragment)g.g.a(k, this.b, this.d);
            if (dialogFragment2 != null) {
                dialogFragment2.show(fragmentManager, ErrorDialogManager$SupportManagerFragment.z[3]);
            }
        }
    }
    
    @Override
    public void onPause() {
        this.c.e(this);
        super.onPause();
    }
    
    @Override
    public void onResume() {
        super.onResume();
        if (this.e) {
            this.e = false;
            if (de.greenrobot.event.util.c.b == 0) {
                return;
            }
        }
        (this.c = g.g.a.a()).d(this);
    }
}
