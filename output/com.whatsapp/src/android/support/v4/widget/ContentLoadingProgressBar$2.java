// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v4.widget;

class ContentLoadingProgressBar$2 implements Runnable
{
    final ContentLoadingProgressBar this$0;
    
    ContentLoadingProgressBar$2(final ContentLoadingProgressBar this$0) {
        this.this$0 = this$0;
    }
    
    @Override
    public void run() {
        ContentLoadingProgressBar.access$202(this.this$0, false);
        if (!ContentLoadingProgressBar.access$300(this.this$0)) {
            ContentLoadingProgressBar.access$102(this.this$0, System.currentTimeMillis());
            this.this$0.setVisibility(0);
        }
    }
}
