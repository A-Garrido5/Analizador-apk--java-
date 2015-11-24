// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.commerce.view;

import android.view.View;
import android.widget.EditText;
import android.app.AlertDialog$Builder;
import com.twitter.util.e;
import java.util.List;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface$OnClickListener;

class j implements DialogInterface$OnClickListener
{
    final /* synthetic */ h a;
    
    j(final h a) {
        this.a = a;
    }
    
    public void onClick(final DialogInterface dialogInterface, final int n) {
        this.a.b.a();
    }
}
