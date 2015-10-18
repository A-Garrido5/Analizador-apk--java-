// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v4.content;

import java.util.concurrent.Callable;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.FutureTask;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executor;
import android.os.Process;

class ModernAsyncTask$2 extends ModernAsyncTask$WorkerRunnable
{
    final /* synthetic */ ModernAsyncTask this$0;
    
    ModernAsyncTask$2(final ModernAsyncTask this$0) {
        this.this$0 = this$0;
        super(null);
    }
    
    @Override
    public Object call() {
        this.this$0.mTaskInvoked.set(true);
        Process.setThreadPriority(10);
        return this.this$0.postResult(this.this$0.doInBackground(this.mParams));
    }
}
