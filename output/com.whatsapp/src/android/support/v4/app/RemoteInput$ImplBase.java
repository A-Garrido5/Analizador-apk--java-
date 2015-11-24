// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v4.app;

import android.util.Log;
import android.os.Bundle;
import android.content.Intent;

class RemoteInput$ImplBase implements RemoteInput$Impl
{
    private static final String[] z;
    
    static {
        final String[] z2 = new String[2];
        String s = "\u000bO4pX<c7oY-\n0l\f6D5f\f*_)oC+^<{\f?X6r\f\u0018z\u0010?`<\\<s\fh\u001c";
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
                        c2 = ',';
                        break;
                    }
                    case 0: {
                        c2 = 'Y';
                        break;
                    }
                    case 1: {
                        c2 = '*';
                        break;
                    }
                    case 2: {
                        c2 = 'Y';
                        break;
                    }
                    case 3: {
                        c2 = '\u001f';
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
                    s = "\u000bO4pX<c7oY-";
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
    public Bundle getResultsFromIntent(final Intent intent) {
        Log.w(RemoteInput$ImplBase.z[1], RemoteInput$ImplBase.z[0]);
        return null;
    }
}
