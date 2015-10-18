// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v4.content;

import java.util.concurrent.CountDownLatch;

final class AsyncTaskLoader$LoadTask extends ModernAsyncTask implements Runnable
{
    private CountDownLatch done;
    Object result;
    final /* synthetic */ AsyncTaskLoader this$0;
    boolean waiting;
    
    AsyncTaskLoader$LoadTask(final AsyncTaskLoader this$0) {
        this.this$0 = this$0;
        this.done = new CountDownLatch(1);
    }
    
    protected Object doInBackground(final Void... array) {
        return this.result = this.this$0.onLoadInBackground();
    }
    
    @Override
    protected void onCancelled() {
        try {
            this.this$0.dispatchOnCancelled(this, this.result);
        }
        finally {
            this.done.countDown();
        }
    }
    
    @Override
    protected void onPostExecute(final Object o) {
        try {
            this.this$0.dispatchOnLoadComplete(this, o);
        }
        finally {
            this.done.countDown();
        }
    }
    
    @Override
    public void run() {
        this.waiting = false;
        this.this$0.executePendingTask();
    }
}
