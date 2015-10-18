// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import android.content.Context;
import com.twitter.library.util.bn;
import android.net.Uri;
import android.content.DialogInterface;
import android.content.DialogInterface$OnClickListener;

class ex implements DialogInterface$OnClickListener
{
    final /* synthetic */ DialogActivity a;
    
    ex(final DialogActivity a) {
        this.a = a;
    }
    
    public void onClick(final DialogInterface dialogInterface, final int n) {
        if (n == -1) {
            bn.b((Context)this.a, Uri.parse(this.a.getString(2131298289)));
        }
    }
}
