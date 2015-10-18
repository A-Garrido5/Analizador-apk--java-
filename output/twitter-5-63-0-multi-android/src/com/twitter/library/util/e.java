// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.util;

import android.os.AsyncTask;

public abstract class e extends AsyncTask
{
    public void a(final Object... array) {
        this.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, array);
    }
}
