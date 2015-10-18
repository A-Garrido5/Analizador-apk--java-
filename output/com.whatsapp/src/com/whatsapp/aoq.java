// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.widget.Toast;
import com.whatsapp.fieldstats.a5;
import com.whatsapp.fieldstats.a1;
import android.content.Context;
import android.app.ProgressDialog;
import com.whatsapp.protocol.bi;
import android.os.AsyncTask;

class aoq extends AsyncTask
{
    private bi a;
    private ProgressDialog b;
    private String c;
    private boolean d;
    final Conversation e;
    
    public aoq(final Conversation e, final String c, final boolean d, final bi a) {
        this.e = e;
        this.c = c;
        this.d = d;
        this.a = a;
        (this.b = ProgressDialog.show((Context)e, (CharSequence)"", (CharSequence)e.getString(2131231626), true, false)).setCancelable(true);
        a5.a((Context)App.aq, a1.CONTENT_SEARCH_C, Integer.valueOf(1));
    }
    
    public ad8 a(final Void[] array) {
        final ad8 a = App.ak.a(this.e.s.u, this.a, this.d, this.c, 100, Conversation.j(this.e));
        if (a != null && a.b != null) {
            a.b.moveToPosition(Math.max(0, -50 + (a.b.getCount() - a.a)));
        }
        return a;
    }
    
    public void a(final ad8 ad8) {
        this.b.dismiss();
        if (!this.isCancelled()) {
            if (ad8 != null) {
                if (ad8.b != null) {
                    Conversation.a(this.e, ad8.b);
                    Conversation.j(this.e).b();
                    this.e.u.changeCursor(ad8.b);
                }
                this.e.aI.setTranscriptMode(0);
                this.e.aI.setSelectionFromTop(ad8.a + this.e.aI.getHeaderViewsCount(), this.e.getResources().getDimensionPixelSize(2131361793));
                Conversation.a(this.e, (aoq)null);
                if (!App.I) {
                    return;
                }
            }
            Toast.makeText(this.e.getApplicationContext(), (CharSequence)this.e.getString(2131231431), 0).show();
        }
    }
    
    public Object doInBackground(final Object[] array) {
        return this.a((Void[])array);
    }
    
    public void onPostExecute(final Object o) {
        this.a((ad8)o);
    }
}
