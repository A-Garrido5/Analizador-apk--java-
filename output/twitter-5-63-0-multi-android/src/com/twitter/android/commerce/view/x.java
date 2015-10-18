// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.commerce.view;

import com.twitter.internal.android.service.a;
import com.twitter.library.commerce.model.OrderHistoryItem;
import com.twitter.library.service.aa;
import com.twitter.library.service.y;
import java.lang.ref.WeakReference;
import com.twitter.library.service.z;

public class x extends z
{
    final /* synthetic */ OrderHistoryDetailsActivity a;
    private final WeakReference b;
    
    public x(final OrderHistoryDetailsActivity a, final OrderHistoryDetailsActivity orderHistoryDetailsActivity) {
        this.a = a;
        this.b = new WeakReference((T)orderHistoryDetailsActivity);
    }
    
    @Override
    public void a(final y y) {
        final OrderHistoryDetailsActivity orderHistoryDetailsActivity = (OrderHistoryDetailsActivity)this.b.get();
        if (orderHistoryDetailsActivity != null && !orderHistoryDetailsActivity.isFinishing() && y instanceof rn) {
            final aa aa = (aa)y.l().b();
            if (!aa.a()) {
                orderHistoryDetailsActivity.a(aa.c.getBundle("commerce_error_list_bundle"));
                return;
            }
            orderHistoryDetailsActivity.a((OrderHistoryItem)aa.c.getSerializable("order_history_item"));
        }
    }
}
