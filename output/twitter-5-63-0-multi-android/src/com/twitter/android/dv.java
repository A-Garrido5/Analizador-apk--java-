// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import android.content.Intent;
import android.view.View;
import android.content.Context;
import android.view.View$OnClickListener;

class dv implements View$OnClickListener
{
    final /* synthetic */ Context a;
    final /* synthetic */ cw b;
    final /* synthetic */ du c;
    
    dv(final du c, final Context a, final cw b) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public void onClick(final View view) {
        this.a.startActivity(new Intent(this.a, (Class)ProfileActivity.class).putExtra("user_id", this.b.b));
    }
}
