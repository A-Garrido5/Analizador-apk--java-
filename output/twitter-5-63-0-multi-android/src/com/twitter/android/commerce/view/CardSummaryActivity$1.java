// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.commerce.view;

import com.twitter.library.commerce.model.CreditCard$Type;
import com.twitter.library.commerce.model.CreditCard;

class CardSummaryActivity$1 extends CreditCard
{
    final /* synthetic */ CardSummaryActivity this$0;
    final /* synthetic */ String val$ccLastFour;
    final /* synthetic */ CreditCard$Type val$ccType;
    
    CardSummaryActivity$1(final CardSummaryActivity this$0, final CreditCard$Type val$ccType, final String val$ccLastFour) {
        this.this$0 = this$0;
        this.val$ccType = val$ccType;
        this.val$ccLastFour = val$ccLastFour;
    }
    
    @Override
    public CreditCard$Type a() {
        return this.val$ccType;
    }
    
    @Override
    public String b() {
        return this.val$ccLastFour;
    }
}
