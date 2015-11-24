// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.view.View$OnClickListener;
import android.text.Html;
import java.util.Date;
import android.widget.TextView;
import java.text.DateFormat;
import android.os.Bundle;
import android.app.Activity;

final class ahs extends ahw
{
    final Activity c;
    
    ahs(final Activity activity, final int n, final Activity c) {
        this.c = c;
        super(activity, n);
    }
    
    @Override
    protected void onCreate(final Bundle bundle) {
        final boolean i = App.I;
        super.onCreate(bundle);
        final DateFormat dateInstance = DateFormat.getDateInstance(2);
        int n = 0;
        Label_0047: {
            if (App.aS == 2) {
                n = 2131231755;
                if (!i) {
                    break Label_0047;
                }
            }
            if (App.aS == 0) {
                n = 2131231757;
                if (!i) {
                    break Label_0047;
                }
            }
            n = 2131231758;
        }
        ((TextView)this.findViewById(2131755757)).setText((CharSequence)Html.fromHtml(this.c.getString(n, new Object[] { dateInstance.format(App.a9()), dateInstance.format(new Date()) })));
        this.findViewById(2131755758).setOnClickListener((View$OnClickListener)new asr(this));
    }
}
