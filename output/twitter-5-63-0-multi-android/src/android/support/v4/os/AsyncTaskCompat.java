// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v4.os;

import android.os.Build$VERSION;
import android.os.AsyncTask;

public class AsyncTaskCompat
{
    public static AsyncTask executeParallel(final AsyncTask asyncTask, final Object... array) {
        if (asyncTask == null) {
            throw new IllegalArgumentException("task can not be null");
        }
        if (Build$VERSION.SDK_INT >= 11) {
            AsyncTaskCompatHoneycomb.executeParallel(asyncTask, array);
            return asyncTask;
        }
        asyncTask.execute(array);
        return asyncTask;
    }
}
