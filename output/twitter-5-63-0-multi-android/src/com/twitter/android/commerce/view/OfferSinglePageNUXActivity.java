// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.commerce.view;

import android.view.View$OnClickListener;
import android.content.Context;
import com.twitter.android.commerce.util.e;
import com.twitter.internal.android.widget.TypefacesTextView;
import android.text.style.RelativeSizeSpan;
import android.text.style.StyleSpan;
import com.twitter.android.commerce.util.i;
import android.text.style.ForegroundColorSpan;
import android.text.SpannableString;
import com.twitter.internal.android.widget.ToolBar;
import com.twitter.android.client.bn;
import android.os.Bundle;
import com.twitter.ui.widget.TwitterButton;
import com.twitter.library.provider.Tweet;
import com.twitter.android.client.TwitterFragmentActivity;

public class OfferSinglePageNUXActivity extends TwitterFragmentActivity
{
    private Tweet a;
    private String b;
    private TwitterButton c;
    
    @Override
    public bn a(final Bundle bundle, final bn bn) {
        bn.c(2130968952);
        return bn;
    }
    
    @Override
    protected boolean a(final jv jv, final ToolBar toolBar) {
        return true;
    }
    
    @Override
    public void b(final Bundle bundle, final bn bn) {
        super.b(bundle, bn);
        final int[][] array = { { 2131887074, 2131296627, 2131296628 }, { 2131887075, 2131296630, 2131296631 }, { 2131887076, 2131296632, 2131296633 } };
        for (int i = 0; i < array.length; ++i) {
            final SpannableString text = new SpannableString((CharSequence)this.getString(array[i][1]));
            com.twitter.android.commerce.util.i.a(text, this.getString(array[i][1]), this.getString(array[i][2]), new ForegroundColorSpan(this.getResources().getColor(2131689634)));
            com.twitter.android.commerce.util.i.a(text, this.getString(array[i][1]), this.getString(array[i][2]), new StyleSpan(1));
            com.twitter.android.commerce.util.i.a(text, this.getString(array[i][1]), this.getString(array[i][2]), new RelativeSizeSpan(1.3f));
            ((TypefacesTextView)this.findViewById(array[i][0])).setText((CharSequence)text);
        }
        final Bundle extras = this.getIntent().getExtras();
        if (extras != null) {
            this.a = (Tweet)extras.getParcelable("commerce_buynow_tweet");
            this.b = extras.getString("commerce_buynow_card_url");
        }
        com.twitter.android.commerce.util.e.a((Context)this, this.a, "cl_offer::product_detail:offers_nux:open", this.b);
        (this.c = (TwitterButton)this.findViewById(2131887077)).setOnClickListener((View$OnClickListener)new m(this));
    }
    
    @Override
    public void finish() {
        super.finish();
        this.overridePendingTransition(2131034154, 2131034155);
    }
}
