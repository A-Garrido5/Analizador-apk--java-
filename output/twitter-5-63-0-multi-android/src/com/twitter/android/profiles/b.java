// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.profiles;

import android.widget.TextView;
import android.content.Context;
import android.view.View;
import android.view.View$OnClickListener;

public class b implements View$OnClickListener
{
    private View a;
    private c b;
    
    public b(final Context context, final View a, final String s) {
        (this.a = a).setEnabled(false);
        a.setOnClickListener((View$OnClickListener)null);
        a.setVisibility(0);
        ((TextView)a.findViewById(2131886317)).setText((CharSequence)context.getString(2131296379, new Object[] { s }));
        ((TextView)a.findViewById(2131886318)).setText((CharSequence)context.getString(2131296378, new Object[] { s }));
        a.findViewById(2131886319).setOnClickListener((View$OnClickListener)this);
    }
    
    public void a(final c b) {
        this.b = b;
    }
    
    public void onClick(final View view) {
        if (this.b != null) {
            this.b.q();
        }
    }
}
