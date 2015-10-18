// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v4.os;

import android.support.v4.app.FragmentActivity;
import android.os.Build$VERSION;
import android.os.AsyncTask;

public class AsyncTaskCompat
{
    private static final String z;
    
    static {
        final char[] charArray = "\u0005\u000fP.^\u0012\u000fMe\u0010\u001e\u001a\u0003'\u001bQ\u0000V)\u0012".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = '~';
                    break;
                }
                case 0: {
                    c2 = 'q';
                    break;
                }
                case 1: {
                    c2 = 'n';
                    break;
                }
                case 2: {
                    c2 = '#';
                    break;
                }
                case 3: {
                    c2 = 'E';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z = new String(charArray).intern();
    }
    
    public static AsyncTask executeParallel(final AsyncTask asyncTask, final Object[] array) {
        final int a = ParcelableCompat.a;
        if (asyncTask == null) {
            try {
                throw new IllegalArgumentException(AsyncTaskCompat.z);
            }
            catch (IllegalArgumentException ex) {
                throw ex;
            }
        }
        try {
            if (Build$VERSION.SDK_INT >= 11) {
                AsyncTaskCompatHoneycomb.executeParallel(asyncTask, array);
                if (a == 0) {
                    return asyncTask;
                }
                ++FragmentActivity.a;
            }
            asyncTask.execute(array);
            return asyncTask;
        }
        catch (IllegalArgumentException ex2) {
            throw ex2;
        }
    }
}
