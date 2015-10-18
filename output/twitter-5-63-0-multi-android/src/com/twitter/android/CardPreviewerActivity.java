// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import com.twitter.library.card.CardDebugLog;
import android.support.v4.view.PagerAdapter;
import com.twitter.library.client.d;
import com.twitter.android.client.bn;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import com.twitter.android.client.TwitterFragmentActivity;

public class CardPreviewerActivity extends TwitterFragmentActivity
{
    private String a;
    private br b;
    private ViewPager c;
    
    @Override
    public bn a(final Bundle bundle, final bn bn) {
        bn.c(2130968631);
        return bn;
    }
    
    @Override
    public void a(final Bundle bundle, final d d) {
        this.setTitle(this.getString(2131296797));
        this.a = this.getIntent().getStringExtra("host");
        this.b = new br(this, this.getSupportFragmentManager());
        (this.c = (ViewPager)this.findViewById(2131886367)).setAdapter(this.b);
    }
    
    public void onStart() {
        super.onStart();
        CardDebugLog.a();
        CardDebugLog.c();
    }
    
    public void onStop() {
        super.onStop();
        CardDebugLog.d();
        CardDebugLog.b();
    }
}
