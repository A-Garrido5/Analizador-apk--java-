// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.os.AsyncTask;
import android.view.View;
import android.view.View$OnClickListener;

class a6r implements View$OnClickListener
{
    final SearchFAQ a;
    
    a6r(final SearchFAQ a) {
        this.a = a;
    }
    
    public void onClick(final View view) {
        a8s.a(new aob(this.a), new Void[0]);
    }
}
