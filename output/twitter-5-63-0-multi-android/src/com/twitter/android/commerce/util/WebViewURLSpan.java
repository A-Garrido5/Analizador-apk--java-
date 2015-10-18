// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.commerce.util;

import android.content.Context;
import android.content.Intent;
import com.twitter.android.WebViewActivity;
import android.net.Uri;
import android.view.View;
import android.text.style.URLSpan;

public class WebViewURLSpan extends URLSpan
{
    public WebViewURLSpan(final String s) {
        super(s);
    }
    
    public void onClick(final View view) {
        final Uri parse = Uri.parse(this.getURL());
        final Context context = view.getContext();
        context.startActivity(new Intent(context, (Class)WebViewActivity.class).setData(parse));
    }
}
