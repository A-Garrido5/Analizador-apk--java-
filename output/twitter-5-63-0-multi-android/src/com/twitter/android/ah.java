// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import android.net.Uri;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.View$OnClickListener;

class ah implements View$OnClickListener
{
    final /* synthetic */ AgeGateActivity a;
    
    ah(final AgeGateActivity a) {
        this.a = a;
    }
    
    public void onClick(final View view) {
        this.a.startActivity(new Intent((Context)this.a, (Class)WebViewActivity.class).setData(Uri.parse(this.a.getString(2131298239))));
    }
}
