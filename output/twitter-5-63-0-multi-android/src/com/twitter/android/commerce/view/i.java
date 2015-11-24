// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.commerce.view;

import android.view.View;
import android.app.AlertDialog$Builder;
import android.content.Context;
import java.util.List;
import com.twitter.util.e;
import com.twitter.library.commerce.model.Email;
import android.content.DialogInterface;
import android.widget.EditText;
import android.content.DialogInterface$OnClickListener;

class i implements DialogInterface$OnClickListener
{
    final /* synthetic */ EditText a;
    final /* synthetic */ h b;
    
    i(final h b, final EditText a) {
        this.b = b;
        this.a = a;
    }
    
    public void onClick(final DialogInterface dialogInterface, final int n) {
        final String string = this.a.getText().toString();
        final Email email = new Email();
        email.a(string);
        final List c = email.c();
        e.b(c != null);
        if (c.size() == 0) {
            this.b.b.a(email);
            return;
        }
        this.b.a(c);
    }
}
