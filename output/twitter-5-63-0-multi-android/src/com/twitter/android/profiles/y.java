// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.profiles;

import com.twitter.library.util.bn;
import android.net.Uri;
import android.view.View;
import android.content.Context;
import android.view.View$OnClickListener;

final class y implements View$OnClickListener
{
    final /* synthetic */ Context a;
    
    y(final Context a) {
        this.a = a;
    }
    
    public void onClick(final View view) {
        bn.b(this.a, Uri.parse(this.a.getString(2131298295)));
    }
}
