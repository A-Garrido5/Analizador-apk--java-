// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.os.Build$VERSION;
import android.os.AsyncTask;

public class a8s
{
    public static AsyncTask a(final AsyncTask asyncTask, final Object[] array) {
        if (Build$VERSION.SDK_INT >= 11) {
            return asyncTask.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, array);
        }
        return asyncTask.execute(array);
    }
}
