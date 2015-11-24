// 
// Decompiled by Procyon v0.5.30
// 

package de.greenrobot.event.util;

import android.app.DialogFragment;
import android.app.FragmentManager;
import android.app.Activity;
import de.greenrobot.event.m;
import android.os.Bundle;
import android.annotation.TargetApi;
import android.app.Fragment;

@TargetApi(11)
public class ErrorDialogManager$HoneycombManagerFragment extends Fragment
{
    private static final String[] z;
    protected Bundle a;
    protected boolean b;
    private m c;
    private Object d;
    
    static {
        final String[] z2 = new String[4];
        String s = "\u0006Az,\u001f\u0007A:9\u0002\u0000K e\b\u0014A:?\u000f\u0017Wz.\u001f\u0010K&\u0014\t\u000bE8$\n";
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
                        c2 = 'm';
                        break;
                    }
                    case 0: {
                        c2 = 'b';
                        break;
                    }
                    case 1: {
                        c2 = '$';
                        break;
                    }
                    case 2: {
                        c2 = 'T';
                        break;
                    }
                    case 3: {
                        c2 = 'K';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "\u0006Az,\u001f\u0007A:9\u0002\u0000K e\b\u0014A:?\u000f\u0017Wz.\u001f\u0010K&\u0014\t\u000bE8$\n";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "\u0006Az,\u001f\u0007A:9\u0002\u0000K e\b\u0014A:?\u000f\u0017Wz.\u001f\u0010K&\u0014\t\u000bE8$\n=I5%\f\u0005A&";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    n2 = 3;
                    array = z2;
                    s = "\u0006Az,\u001f\u0007A:9\u0002\u0000K e\b\u0014A:?\u000f\u0017Wz.\u001f\u0010K&\u0014\t\u000bE8$\n=I5%\f\u0005A&";
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
    
    public static void a(final Activity activity, final Object d, final boolean b, final Bundle a) {
        final FragmentManager fragmentManager = activity.getFragmentManager();
        ErrorDialogManager$HoneycombManagerFragment errorDialogManager$HoneycombManagerFragment = (ErrorDialogManager$HoneycombManagerFragment)fragmentManager.findFragmentByTag(ErrorDialogManager$HoneycombManagerFragment.z[2]);
        if (errorDialogManager$HoneycombManagerFragment == null) {
            errorDialogManager$HoneycombManagerFragment = new ErrorDialogManager$HoneycombManagerFragment();
            fragmentManager.beginTransaction().add((Fragment)errorDialogManager$HoneycombManagerFragment, ErrorDialogManager$HoneycombManagerFragment.z[3]).commit();
            fragmentManager.executePendingTransactions();
        }
        errorDialogManager$HoneycombManagerFragment.b = b;
        errorDialogManager$HoneycombManagerFragment.a = a;
        errorDialogManager$HoneycombManagerFragment.d = d;
    }
    
    public void onEventMainThread(final k k) {
        if (g.a(this.d, k)) {
            g.a(k);
            final FragmentManager fragmentManager = this.getFragmentManager();
            fragmentManager.executePendingTransactions();
            final DialogFragment dialogFragment = (DialogFragment)fragmentManager.findFragmentByTag(ErrorDialogManager$HoneycombManagerFragment.z[0]);
            if (dialogFragment != null) {
                dialogFragment.dismiss();
            }
            final DialogFragment dialogFragment2 = (DialogFragment)g.g.a(k, this.b, this.a);
            if (dialogFragment2 != null) {
                dialogFragment2.show(fragmentManager, ErrorDialogManager$HoneycombManagerFragment.z[1]);
            }
        }
    }
    
    public void onPause() {
        this.c.e(this);
        super.onPause();
    }
    
    public void onResume() {
        super.onResume();
        (this.c = g.g.a.a()).d(this);
    }
}
