// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v4.app;

class FragmentManagerImpl$4 implements Runnable
{
    final FragmentManagerImpl this$0;
    final int val$flags;
    final int val$id;
    
    FragmentManagerImpl$4(final FragmentManagerImpl this$0, final int val$id, final int val$flags) {
        this.this$0 = this$0;
        this.val$id = val$id;
        this.val$flags = val$flags;
    }
    
    @Override
    public void run() {
        this.this$0.popBackStackState(this.this$0.mActivity.mHandler, null, this.val$id, this.val$flags);
    }
}
