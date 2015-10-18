// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.text.style.ClickableSpan;

class qu extends ClickableSpan
{
    final /* synthetic */ SearchActivity a;
    
    qu(final SearchActivity a) {
        this.a = a;
    }
    
    public void onClick(final View view) {
        this.a.startActivity(new Intent((Context)this.a, (Class)ProfileActivity.class).putExtra("screen_name", "SpikingHawk"));
    }
}
