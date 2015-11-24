// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import android.content.Intent;
import android.text.TextUtils;
import android.widget.TextView;
import com.twitter.library.client.d;
import com.twitter.android.client.bn;
import android.os.Bundle;
import com.twitter.android.client.TwitterFragmentActivity;

public class CardDebugDetailActivity extends TwitterFragmentActivity
{
    @Override
    public bn a(final Bundle bundle, final bn bn) {
        bn.c(2130968626);
        return bn;
    }
    
    @Override
    public void a(final Bundle bundle, final d d) {
        this.setTitle(this.getString(2131296797));
        final Intent intent = this.getIntent();
        final TextView textView = (TextView)this.findViewById(2131886358);
        final String string = intent.getExtras().getString("detail_text");
        if (!TextUtils.isEmpty((CharSequence)string)) {
            textView.setText((CharSequence)string);
        }
    }
}
