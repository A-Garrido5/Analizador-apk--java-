// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v7.internal.widget;

class AdapterViewCompat$SelectionNotifier implements Runnable
{
    final AdapterViewCompat this$0;
    
    private AdapterViewCompat$SelectionNotifier(final AdapterViewCompat this$0) {
        this.this$0 = this$0;
    }
    
    AdapterViewCompat$SelectionNotifier(final AdapterViewCompat adapterViewCompat, final AdapterViewCompat$1 adapterViewCompat$1) {
        this(adapterViewCompat);
    }
    
    @Override
    public void run() {
        if (this.this$0.mDataChanged) {
            if (this.this$0.getAdapter() == null) {
                return;
            }
            this.this$0.post((Runnable)this);
            if (AdapterViewCompat.a == 0) {
                return;
            }
        }
        AdapterViewCompat.access$200(this.this$0);
    }
}
