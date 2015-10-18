// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v4.content;

import android.content.Intent;
import android.content.ComponentName;

class IntentCompat$IntentCompatImplBase implements IntentCompat$IntentCompatImpl
{
    private static final String[] z;
    
    static {
        final String[] z2 = new String[2];
        String s = "m\\\u001dMEeVWVDxW\u0017K\u0004mQ\rVEb\u001c4~cB";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0087:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = '*';
                        break;
                    }
                    case 0: {
                        c2 = '\f';
                        break;
                    }
                    case 1: {
                        c2 = '2';
                        break;
                    }
                    case 2: {
                        c2 = 'y';
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
                    n2 = 1;
                    array = z2;
                    s = "m\\\u001dMEeVWVDxW\u0017K\u0004oS\rZMc@\u0000\u0011fMg7|bI`";
                    n = 0;
                    continue;
                }
                case 0: {
                    break Label_0087;
                }
            }
        }
        array[n2] = intern;
        z = z2;
    }
    
    @Override
    public Intent makeMainActivity(final ComponentName component) {
        final Intent intent = new Intent(IntentCompat$IntentCompatImplBase.z[0]);
        intent.setComponent(component);
        intent.addCategory(IntentCompat$IntentCompatImplBase.z[1]);
        return intent;
    }
}
