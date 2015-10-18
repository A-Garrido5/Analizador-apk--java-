// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v7.widget;

import android.support.v7.internal.view.menu.MenuPresenter$Callback;
import android.support.v7.appcompat.R$attr;
import android.view.View;
import android.support.v7.internal.view.menu.MenuBuilder;
import android.content.Context;
import android.support.v7.internal.view.menu.MenuPopupHelper;

class ActionMenuPresenter$OverflowPopup extends MenuPopupHelper
{
    final ActionMenuPresenter this$0;
    
    public ActionMenuPresenter$OverflowPopup(final ActionMenuPresenter this$0, final Context context, final MenuBuilder menuBuilder, final View view, final boolean b) {
        this.this$0 = this$0;
        super(context, menuBuilder, view, b, R$attr.actionOverflowMenuStyle);
        this.setGravity(8388613);
        this.setCallback(this$0.mPopupPresenterCallback);
    }
    
    @Override
    public void onDismiss() {
        super.onDismiss();
        ActionMenuPresenter.access$400(this.this$0).close();
        ActionMenuPresenter.access$202(this.this$0, null);
    }
}
