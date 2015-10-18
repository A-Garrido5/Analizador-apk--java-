// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.commerce.view;

import com.twitter.android.commerce.util.f;
import com.twitter.android.client.bn;
import android.os.Bundle;
import com.twitter.library.commerce.model.Address;
import java.util.Iterator;
import com.twitter.android.commerce.util.i;
import android.text.TextUtils;
import com.twitter.android.commerce.util.a;
import com.twitter.library.commerce.model.TaxType;
import com.twitter.android.commerce.util.e;
import com.twitter.library.media.manager.j;
import com.twitter.library.media.widget.MediaImageView;
import java.util.Map;
import com.twitter.library.card.Card;
import android.widget.TextView;
import com.twitter.library.commerce.model.OrderHistoryItem;
import com.twitter.library.service.z;
import com.twitter.library.service.y;
import android.content.Context;
import com.twitter.library.client.as;
import android.widget.TextView$BufferType;
import android.text.method.LinkMovementMethod;
import android.text.SpannableString;
import com.twitter.android.commerce.widget.form.OrderHistoryItemAttribute;
import android.view.View$OnClickListener;
import com.twitter.android.commerce.network.c;
import android.view.ViewGroup;
import com.twitter.android.client.TwitterFragmentActivity;

public class OrderHistoryDetailsActivity extends TwitterFragmentActivity
{
    private ViewGroup a;
    private ViewGroup b;
    private c c;
    
    private void a(final int n, final int n2, final CharSequence charSequence, final boolean b, final Integer n3, final View$OnClickListener view$OnClickListener) {
        this.a(n, this.getString(n2), charSequence, b, n3, view$OnClickListener);
    }
    
    private void a(final int n, final String text, final CharSequence text2, final boolean b, final Integer n2, final View$OnClickListener onClickListener) {
        final OrderHistoryItemAttribute orderHistoryItemAttribute = (OrderHistoryItemAttribute)this.findViewById(n);
        if (text2 != null) {
            orderHistoryItemAttribute.b.setText((CharSequence)text);
            orderHistoryItemAttribute.c.setText(text2);
            if (!b) {
                orderHistoryItemAttribute.a.setVisibility(8);
            }
            if (n2 != null) {
                orderHistoryItemAttribute.c.setTextColor((int)n2);
            }
            if (text2 instanceof SpannableString) {
                orderHistoryItemAttribute.c.setMovementMethod(LinkMovementMethod.getInstance());
                orderHistoryItemAttribute.c.setText(text2, TextView$BufferType.SPANNABLE);
            }
            orderHistoryItemAttribute.setOnClickListener(onClickListener);
            return;
        }
        orderHistoryItemAttribute.setVisibility(8);
    }
    
    private void a(final String s) {
        as.a((Context)this).a(new rn((Context)this, this.c.a(), s), new x(this, this));
    }
    
    private void b(final OrderHistoryItem orderHistoryItem) {
        final TextView textView = (TextView)this.findViewById(2131886480);
        final String b = orderHistoryItem.b();
        if (orderHistoryItem.m() != null) {
            textView.setOnClickListener((View$OnClickListener)new v(this, orderHistoryItem));
        }
        else {
            textView.setTextColor(this.getResources().getColor(2131689630));
        }
        textView.setText((CharSequence)b);
        ((TextView)this.findViewById(2131886482)).setText((CharSequence)Card.a(orderHistoryItem.n()));
        final StringBuilder sb = new StringBuilder();
        final Iterator<Map.Entry<K, String>> iterator = orderHistoryItem.h().entrySet().iterator();
        int n = 1;
        while (iterator.hasNext()) {
            final Map.Entry<K, String> entry = iterator.next();
            if (n == 0) {
                sb.append(" \u2022 ");
            }
            sb.append(entry.getValue());
            n = 0;
        }
        ((TextView)this.findViewById(2131886481)).setText((CharSequence)sb.toString());
        final MediaImageView mediaImageView = (MediaImageView)this.findViewById(2131886479);
        mediaImageView.a(com.twitter.library.media.manager.j.a(orderHistoryItem.c()));
        mediaImageView.setOnClickListener((View$OnClickListener)new w(this));
        com.twitter.android.commerce.util.e.a((Context)this, (ViewGroup)this.findViewById(2131886478), null, 2131296598, false);
        com.twitter.android.commerce.util.e.a((Context)this, (ViewGroup)this.findViewById(2131886487), null, this.getString(2131296603, new Object[] { orderHistoryItem.a(this.getResources()), com.twitter.android.commerce.util.e.a(orderHistoryItem.d()) }), true);
        com.twitter.android.commerce.util.e.a((Context)this, (ViewGroup)this.findViewById(2131886493), null, this.getString(2131296611), true);
        final TextView textView2 = (TextView)this.findViewById(2131886491);
        final TextView textView3 = (TextView)this.findViewById(2131886492);
        final Address p = orderHistoryItem.p();
        if (p != null) {
            textView2.setText((CharSequence)this.getString(2131296696));
            textView3.setText((CharSequence)p.toString());
        }
        else {
            textView2.setVisibility(8);
            textView3.setVisibility(8);
        }
        this.a(2131886483, 2131296604, Card.a(orderHistoryItem.n()), false, null, null);
        this.a(2131886484, 2131296602, Card.a(orderHistoryItem.r()), false, null, null);
        String s;
        if (TaxType.a(orderHistoryItem.s()).equals(TaxType.c)) {
            s = this.getString(2131296546);
        }
        else {
            s = Card.a(orderHistoryItem.o());
        }
        this.a(2131886485, 2131296605, s, true, null, null);
        this.a(2131886486, 2131296606, Card.a(orderHistoryItem.i()), false, null, null);
        String string;
        if (orderHistoryItem.j() != null) {
            string = orderHistoryItem.j().toString();
        }
        else {
            string = null;
        }
        this.a(2131886488, 2131296597, string, true, null, null);
        this.a(2131886489, 2131296601, orderHistoryItem.a(), true, null, null);
        this.a(2131886490, 2131296599, com.twitter.android.commerce.util.a.a(orderHistoryItem.q(), (Context)this), true, null, null);
        final String f = orderHistoryItem.f();
        SpannableString spannableString;
        if (!TextUtils.isEmpty((CharSequence)f)) {
            spannableString = new SpannableString((CharSequence)f);
            com.twitter.android.commerce.util.i.a(spannableString, f, f, "mailto:" + f);
        }
        else {
            spannableString = null;
        }
        this.a(2131886494, 2131296596, (CharSequence)spannableString, true, Integer.valueOf(this.getResources().getColor(2131689600)), null);
        final String k = orderHistoryItem.k();
        SpannableString spannableString2;
        if (!TextUtils.isEmpty((CharSequence)k)) {
            spannableString2 = new SpannableString((CharSequence)k);
            com.twitter.android.commerce.util.i.a(spannableString2, k, k, k);
        }
        else {
            spannableString2 = null;
        }
        this.a(2131886495, 2131296607, (CharSequence)spannableString2, true, Integer.valueOf(this.getResources().getColor(2131689600)), null);
        this.a(2131886496, 2131296600, orderHistoryItem.l(), true, null, null);
    }
    
    @Override
    public bn a(final Bundle bundle, final bn bn) {
        bn.c(2130968671);
        bn.b(14);
        bn.a(false);
        return bn;
    }
    
    public void a(final Bundle bundle) {
        new f((Context)this).a((Context)this, bundle);
        this.finish();
    }
    
    public void a(final OrderHistoryItem orderHistoryItem) {
        this.a.setVisibility(8);
        this.b.setVisibility(0);
        this.b(orderHistoryItem);
    }
    
    @Override
    public void b(final Bundle bundle, final bn bn) {
        super.b(bundle, bn);
        this.setTitle(this.getString(2131296613));
        final Bundle extras = this.getIntent().getExtras();
        this.a = (ViewGroup)this.findViewById(2131886475);
        this.b = (ViewGroup)this.findViewById(2131886477);
        if (extras == null) {
            this.finish();
        }
        this.c = new c((Context)this, extras);
        final OrderHistoryItem orderHistoryItem = (OrderHistoryItem)extras.getSerializable("commerce_order_history_item");
        if (orderHistoryItem != null) {
            this.b(orderHistoryItem);
        }
        else {
            final String string = extras.getString("commerce_order_history_item_id");
            if (string != null) {
                this.a.setVisibility(0);
                this.b.setVisibility(8);
                this.a(string);
            }
        }
    }
}
