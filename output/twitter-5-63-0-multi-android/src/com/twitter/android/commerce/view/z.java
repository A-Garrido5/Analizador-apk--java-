// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.commerce.view;

import com.twitter.internal.android.service.a;
import com.twitter.library.commerce.model.OrderHistoryList;
import com.twitter.library.service.aa;
import com.twitter.library.service.y;
import java.lang.ref.WeakReference;

public class z extends com.twitter.library.service.z
{
    private final WeakReference a;
    
    public z(final OrderHistoryFragment orderHistoryFragment) {
        this.a = new WeakReference((T)orderHistoryFragment);
    }
    
    @Override
    public void a(final y y) {
        final OrderHistoryFragment orderHistoryFragment = (OrderHistoryFragment)this.a.get();
        if (orderHistoryFragment != null && orderHistoryFragment.getActivity() != null && !orderHistoryFragment.getActivity().isFinishing() && y instanceof rq) {
            final aa aa = (aa)y.l().b();
            if (!aa.a()) {
                orderHistoryFragment.a(aa.c.getBundle("commerce_error_list_bundle"));
                return;
            }
            orderHistoryFragment.a((OrderHistoryList)aa.c.getSerializable("order_history_list"));
        }
    }
}
