// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.commerce.view;

import android.view.View;
import android.widget.EditText;
import android.content.DialogInterface$OnClickListener;
import android.app.AlertDialog$Builder;
import com.twitter.util.e;
import java.util.List;
import android.content.Context;

public class h
{
    private Context a;
    private l b;
    
    public h(final Context a, final l b) {
        this.a = a;
        this.b = b;
    }
    
    private void a(final List list) {
        e.b(list.size() > 0);
        new AlertDialog$Builder(this.a).setMessage((int)list.get(0)).setCancelable(true).setPositiveButton(2131297362, (DialogInterface$OnClickListener)new k(this)).create().show();
    }
    
    public void a() {
        final AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this.a);
        alertDialog$Builder.setTitle((CharSequence)this.a.getResources().getString(2131296536));
        final EditText view = new EditText(this.a);
        view.setInputType(1);
        alertDialog$Builder.setView((View)view);
        alertDialog$Builder.setPositiveButton((CharSequence)this.a.getResources().getString(2131297362), (DialogInterface$OnClickListener)new i(this, view));
        alertDialog$Builder.setNegativeButton((CharSequence)this.a.getResources().getString(2131296445), (DialogInterface$OnClickListener)new j(this));
        alertDialog$Builder.show();
    }
}
