// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.av;

import android.content.Context;
import com.twitter.library.util.bq;
import com.twitter.library.provider.Tweet;
import com.twitter.android.kg;
import android.support.v4.app.FragmentActivity;

public class ac
{
    private void a(final FragmentActivity fragmentActivity, final int n, final String s) {
        kg.a(fragmentActivity, n, s);
    }
    
    public void a(final FragmentActivity fragmentActivity, final Tweet tweet) {
        bq.a((Context)fragmentActivity, tweet, false);
    }
    
    public void a(final FragmentActivity fragmentActivity, final String s) {
        this.a(fragmentActivity, 3, s);
    }
    
    public void b(final FragmentActivity fragmentActivity, final String s) {
        this.a(fragmentActivity, 2, s);
    }
    
    public void c(final FragmentActivity fragmentActivity, final String s) {
        this.a(fragmentActivity, 1, s);
    }
}
