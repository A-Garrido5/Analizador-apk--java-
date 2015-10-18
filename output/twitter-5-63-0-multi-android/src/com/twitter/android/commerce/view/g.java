// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.commerce.view;

import android.widget.TextView;
import android.content.Context;
import com.twitter.android.commerce.widget.creditcard.CardEntryContainer;
import com.twitter.android.commerce.util.f;

class g extends f
{
    final /* synthetic */ CardEntryContainer a;
    final /* synthetic */ CreditCardNumberEntryActivity b;
    
    g(final CreditCardNumberEntryActivity b, final Context context, final CardEntryContainer a) {
        this.b = b;
        this.a = a;
        super(context);
        this.a(Integer.valueOf(2131296566), (TextView)this.a.b);
        this.a(Integer.valueOf(2131296567), (TextView)this.a.b);
        this.a(Integer.valueOf(2131296570), (TextView)this.a.b);
        this.a(Integer.valueOf(2131296569), (TextView)this.a.b);
    }
}
