// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.client;

import android.app.AlertDialog;
import android.widget.CheckBox;
import android.content.DialogInterface;
import android.content.DialogInterface$OnClickListener;

final class an implements DialogInterface$OnClickListener
{
    final /* synthetic */ n a;
    final /* synthetic */ bh b;
    final /* synthetic */ c c;
    final /* synthetic */ long d;
    
    an(final n a, final bh b, final c c, final long d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public void onClick(final DialogInterface dialogInterface, final int n) {
        if (-1 == n) {
            if (((CheckBox)((AlertDialog)dialogInterface).findViewById(2131886660)).isChecked()) {
                switch (this.a.b()) {
                    case 1: {
                        this.b.a(false, true);
                        this.c.a(this.d, "tweet:accept_data:accept::impression");
                        break;
                    }
                    case 2: {
                        this.b.b(false, true);
                        break;
                    }
                }
            }
            this.a.a();
            if (this.a.b() == 1) {
                this.c.a(this.d, "tweet:accept_data:redirect::impression");
            }
        }
    }
}
