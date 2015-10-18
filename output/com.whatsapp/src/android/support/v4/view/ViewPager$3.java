// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v4.view;

class ViewPager$3 implements Runnable
{
    final ViewPager this$0;
    
    ViewPager$3(final ViewPager this$0) {
        this.this$0 = this$0;
    }
    
    @Override
    public void run() {
        ViewPager.access$000(this.this$0, 0);
        this.this$0.populate();
    }
}
