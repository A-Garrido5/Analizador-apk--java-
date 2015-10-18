// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v7.app;

class AppCompatDelegateImplV7$1 implements Runnable
{
    final AppCompatDelegateImplV7 this$0;
    
    AppCompatDelegateImplV7$1(final AppCompatDelegateImplV7 this$0) {
        this.this$0 = this$0;
    }
    
    @Override
    public void run() {
        if ((0x1 & AppCompatDelegateImplV7.access$000(this.this$0)) != 0x0) {
            AppCompatDelegateImplV7.access$100(this.this$0, 0);
        }
        if ((0x100 & AppCompatDelegateImplV7.access$000(this.this$0)) != 0x0) {
            AppCompatDelegateImplV7.access$100(this.this$0, 8);
        }
        AppCompatDelegateImplV7.access$202(this.this$0, false);
        AppCompatDelegateImplV7.access$002(this.this$0, 0);
    }
}
