// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.widget.TextView;
import java.util.Collection;
import java.io.IOException;
import org.json.JSONException;
import java.util.List;
import android.os.AsyncTask;

class o3 extends AsyncTask
{
    final p1 a;
    
    private o3(final p1 a) {
        this.a = a;
    }
    
    o3(final p1 p2, final arc arc) {
        this(p2);
    }
    
    protected List a(final Void[] array) {
        try {
            return WebImagePicker.n(this.a.b).c();
        }
        catch (JSONException ex) {}
        catch (IOException ex2) {
            goto Label_0017;
        }
    }
    
    protected void a(final List list) {
        final boolean i = App.I;
        p1.a(this.a, WebImagePicker.n(this.a.b).d() && WebImagePicker.d(this.a.b).size() < 100);
        Label_0125: {
            if (p1.b(this.a)) {
                WebImagePicker.e(this.a.b).setVisibility(8);
                WebImagePicker.m(this.a.b).setVisibility(0);
                if (!i) {
                    break Label_0125;
                }
            }
            WebImagePicker.e(this.a.b).setVisibility(0);
            WebImagePicker.m(this.a.b).setVisibility(8);
        }
        p1.a(this.a, (o3)null);
        if (list != null) {
            list.removeAll(WebImagePicker.d(this.a.b));
            WebImagePicker.d(this.a.b).addAll(list);
        }
        Label_0265: {
            if (WebImagePicker.d(this.a.b).isEmpty()) {
                final TextView textView = (TextView)this.a.b.c().getEmptyView();
                if (list == null) {
                    textView.setText(2131231474);
                    if (!i) {
                        break Label_0265;
                    }
                }
                textView.setText((CharSequence)this.a.b.getString(2131231467, new Object[] { WebImagePicker.n(this.a.b).b() }));
            }
        }
        this.a.notifyDataSetChanged();
    }
    
    protected Object doInBackground(final Object[] array) {
        return this.a((Void[])array);
    }
    
    protected void onPostExecute(final Object o) {
        this.a((List)o);
    }
}
