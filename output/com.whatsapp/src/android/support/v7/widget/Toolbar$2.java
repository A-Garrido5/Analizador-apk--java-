// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v7.widget;

class Toolbar$2 implements Runnable
{
    final Toolbar this$0;
    
    Toolbar$2(final Toolbar this$0) {
        this.this$0 = this$0;
    }
    
    @Override
    public void run() {
        this.this$0.showOverflowMenu();
    }
}
