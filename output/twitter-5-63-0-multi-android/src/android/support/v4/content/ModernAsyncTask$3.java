// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v4.content;

import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import android.util.Log;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

class ModernAsyncTask$3 extends FutureTask
{
    final /* synthetic */ ModernAsyncTask this$0;
    
    ModernAsyncTask$3(final ModernAsyncTask this$0, final Callable callable) {
        this.this$0 = this$0;
        super(callable);
    }
    
    @Override
    protected void done() {
        try {
            this.this$0.postResultIfNotInvoked(this.get());
        }
        catch (InterruptedException ex) {
            Log.w("AsyncTask", (Throwable)ex);
        }
        catch (ExecutionException ex2) {
            throw new RuntimeException("An error occured while executing doInBackground()", ex2.getCause());
        }
        catch (CancellationException ex3) {
            this.this$0.postResultIfNotInvoked(null);
        }
        catch (Throwable t) {
            throw new RuntimeException("An error occured while executing doInBackground()", t);
        }
    }
}
