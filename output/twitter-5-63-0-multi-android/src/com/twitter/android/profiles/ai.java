// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.profiles;

import com.twitter.library.util.bn;
import android.net.Uri;
import android.view.View;
import android.content.Context;
import com.twitter.library.view.c;

final class ai extends c
{
    final /* synthetic */ int a;
    final /* synthetic */ Context b;
    
    ai(final int n, final int a, final Context b) {
        this.a = a;
        this.b = b;
        super(n);
    }
    
    public void onClick(final View view) {
        switch (this.a) {
            default: {}
            case 0: {
                bn.b(this.b, Uri.parse(this.b.getString(2131298222)));
            }
        }
    }
}
