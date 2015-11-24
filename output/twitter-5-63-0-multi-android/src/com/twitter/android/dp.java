// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import android.net.Uri;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import com.twitter.library.view.c;

class dp extends c
{
    final /* synthetic */ DMConversationFragment a;
    
    dp(final DMConversationFragment a, final int n, final int n2, final boolean b) {
        this.a = a;
        super(n, n2, b);
    }
    
    public void onClick(final View view) {
        this.a.startActivity(new Intent((Context)this.a.getActivity(), (Class)WebViewActivity.class).setData(Uri.parse(this.a.getString(2131298194))));
    }
}
