// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.os.AsyncTask;
import android.view.View;
import android.view.View$OnClickListener;

class atc implements View$OnClickListener
{
    final DescribeProblemActivity a;
    
    atc(final DescribeProblemActivity a) {
        this.a = a;
    }
    
    public void onClick(final View view) {
        final boolean i = App.I;
        final int length = DescribeProblemActivity.b(this.a).getText().toString().trim().getBytes().length;
        if (length < 10) {
            if (length == 0) {
                App.a(this.a.getBaseContext(), this.a.getString(2131231028), 0);
                if (!i) {
                    return;
                }
            }
            App.a(this.a.getBaseContext(), this.a.getString(2131231029), 0);
            if (!i) {
                return;
            }
        }
        DescribeProblemActivity.f(this.a).b = DescribeProblemActivity.b(this.a).getText().toString().trim();
        a8s.a(DescribeProblemActivity.g(this.a), new Void[0]);
    }
}
