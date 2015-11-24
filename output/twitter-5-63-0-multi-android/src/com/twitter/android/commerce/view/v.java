// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.commerce.view;

import android.net.Uri$Builder;
import android.content.Context;
import android.content.Intent;
import com.twitter.android.TweetActivity;
import android.view.View;
import com.twitter.library.commerce.model.OrderHistoryItem;
import android.view.View$OnClickListener;

class v implements View$OnClickListener
{
    final /* synthetic */ OrderHistoryItem a;
    final /* synthetic */ OrderHistoryDetailsActivity b;
    
    v(final OrderHistoryDetailsActivity b, final OrderHistoryItem a) {
        this.b = b;
        this.a = a;
    }
    
    public void onClick(final View view) {
        this.b.startActivity(new Intent((Context)this.b, (Class)TweetActivity.class).setData(new Uri$Builder().scheme("twitter").authority("tweet").appendQueryParameter("status_id", this.a.m().toString()).build()));
    }
}
