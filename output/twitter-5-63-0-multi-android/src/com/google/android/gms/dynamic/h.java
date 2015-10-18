// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.dynamic;

import com.google.android.gms.common.e;
import android.view.View;
import android.content.Context;
import android.view.View$OnClickListener;

final class h implements View$OnClickListener
{
    final /* synthetic */ Context a;
    final /* synthetic */ int b;
    
    h(final Context a, final int b) {
        this.a = a;
        this.b = b;
    }
    
    public void onClick(final View view) {
        this.a.startActivity(e.a(this.b));
    }
}
