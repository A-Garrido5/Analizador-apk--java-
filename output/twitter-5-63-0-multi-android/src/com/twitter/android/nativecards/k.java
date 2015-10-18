// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.nativecards;

import android.content.Context;
import com.twitter.library.util.bq;
import android.content.DialogInterface;
import android.app.Activity;
import android.content.DialogInterface$OnClickListener;

class k implements DialogInterface$OnClickListener
{
    final /* synthetic */ String a;
    final /* synthetic */ Activity b;
    final /* synthetic */ String c;
    final /* synthetic */ j d;
    
    k(final j d, final String a, final Activity b, final String c) {
        this.d = d;
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public void onClick(final DialogInterface dialogInterface, final int n) {
        switch (n) {
            default: {}
            case 0: {
                this.d.B.d("share", this.d.l());
                this.d.C.a(this.a);
            }
            case 1: {
                this.d.B.d("share", this.d.l());
                bq.b((Context)this.b, this.a);
            }
            case 2: {
                this.d.B.d("share", this.d.l());
                this.d.C.a(this.a, this.c);
            }
        }
    }
}
