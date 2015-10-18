// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v4.content;

import android.os.Process;

class ModernAsyncTask$2 extends ModernAsyncTask$WorkerRunnable
{
    final ModernAsyncTask this$0;
    
    ModernAsyncTask$2(final ModernAsyncTask this$0) {
        this.this$0 = this$0;
        super(null);
    }
    
    @Override
    public Object call() {
        ModernAsyncTask.access$200(this.this$0).set(true);
        Process.setThreadPriority(10);
        return ModernAsyncTask.access$300(this.this$0, this.this$0.doInBackground(this.mParams));
    }
}
