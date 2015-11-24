// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v7.widget;

import android.view.View;

class ActionMenuPresenter$OpenOverflowRunnable implements Runnable
{
    private ActionMenuPresenter$OverflowPopup mPopup;
    final ActionMenuPresenter this$0;
    
    public ActionMenuPresenter$OpenOverflowRunnable(final ActionMenuPresenter this$0, final ActionMenuPresenter$OverflowPopup mPopup) {
        this.this$0 = this$0;
        this.mPopup = mPopup;
    }
    
    @Override
    public void run() {
        ActionMenuPresenter.access$800(this.this$0).changeMenuMode();
        final View view = (View)ActionMenuPresenter.access$900(this.this$0);
        if (view != null && view.getWindowToken() != null && this.mPopup.tryShow()) {
            ActionMenuPresenter.access$202(this.this$0, this.mPopup);
        }
        ActionMenuPresenter.access$302(this.this$0, null);
    }
}
