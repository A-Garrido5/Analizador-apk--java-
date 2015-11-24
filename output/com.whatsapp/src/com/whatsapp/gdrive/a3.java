// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.gdrive;

import com.whatsapp.util.Log;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.RejectedExecutionHandler;

final class a3 implements RejectedExecutionHandler
{
    @Override
    public void rejectedExecution(final Runnable runnable, final ThreadPoolExecutor threadPoolExecutor) {
        try {
            threadPoolExecutor.getQueue().put(runnable);
        }
        catch (InterruptedException ex) {
            Log.b(ex);
        }
    }
}
