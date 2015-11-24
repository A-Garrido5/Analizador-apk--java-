// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.commerce.view;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import java.io.Serializable;
import android.os.Bundle;
import android.content.Intent;
import com.twitter.util.f;
import android.view.View;
import com.twitter.android.commerce.util.e;
import com.twitter.library.media.manager.j;
import android.text.TextUtils;
import android.view.View$OnClickListener;
import com.twitter.library.media.manager.k;
import com.twitter.library.commerce.model.OrderHistoryItem;
import android.database.Cursor;
import android.content.Context;
import android.support.v4.widget.CursorAdapter;

class y extends CursorAdapter
{
    final /* synthetic */ OrderHistoryFragment a;
    
    public y(final OrderHistoryFragment a, final Context context) {
        this.a = a;
        super(context, null, 0);
    }
    
    private void a(final OrderHistoryItem orderHistoryItem, final aa aa) {
        aa.a.a((k)null);
        aa.a.setOnClickListener((View$OnClickListener)null);
        if (!TextUtils.isEmpty((CharSequence)orderHistoryItem.c())) {
            aa.a.a(j.a(orderHistoryItem.c()));
            aa.a.setOnClickListener((View$OnClickListener)this.a);
        }
        aa.b.setText((CharSequence)e.a(orderHistoryItem.d()));
        aa.c.setText((CharSequence)this.a.getString(2131296610, new Object[] { orderHistoryItem.a(this.a.getResources()) }));
        int n;
        if ("CANCELED".equals(orderHistoryItem.e())) {
            n = 2131689595;
        }
        else {
            n = 2131689521;
        }
        aa.c.setTextColor(this.a.getResources().getColor(n));
        aa.d.setText((CharSequence)orderHistoryItem.b());
        aa.e.setText((CharSequence)this.a.getResources().getString(2131296676, new Object[] { orderHistoryItem.a() }));
    }
    
    @Override
    public void bindView(final View view, final Context context, final Cursor cursor) {
        this.a((OrderHistoryItem)f.a(cursor.getBlob(3)), (aa)view.getTag());
    }
    
    @Override
    public Object getItem(final int n) {
        final OrderHistoryItem orderHistoryItem = (OrderHistoryItem)f.a(((Cursor)super.getItem(n)).getBlob(3));
        final Intent intent = new Intent((Context)this.a.getActivity(), (Class)OrderHistoryDetailsActivity.class);
        final Bundle bundle = new Bundle();
        bundle.putSerializable("commerce_order_history_item", (Serializable)orderHistoryItem);
        intent.putExtras(bundle);
        return intent;
    }
    
    @Override
    public View newView(final Context context, final Cursor cursor, final ViewGroup viewGroup) {
        final View inflate = LayoutInflater.from(context).inflate(2130968672, viewGroup, false);
        inflate.setTag((Object)new aa(inflate));
        return inflate;
    }
}
