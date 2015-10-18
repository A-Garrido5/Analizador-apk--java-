// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.commerce.view;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.twitter.library.media.widget.MediaImageView;
import android.view.View;
import android.view.View$OnClickListener;

class w implements View$OnClickListener
{
    final /* synthetic */ OrderHistoryDetailsActivity a;
    
    w(final OrderHistoryDetailsActivity a) {
        this.a = a;
    }
    
    public void onClick(final View view) {
        final Uri parse = Uri.parse(((MediaImageView)view).getImageRequest().c());
        this.a.startActivity(new Intent((Context)this.a, (Class)CommerceImageActivity.class).setData(parse).putExtra("image_url", parse.toString()));
    }
}
