// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import com.whatsapp.protocol.bi;
import java.util.ArrayList;
import android.os.AsyncTask;

public class f4 extends AsyncTask
{
    private ArrayList a;
    final MediaView b;
    
    public f4(final MediaView b) {
        this.b = b;
    }
    
    protected Integer a(final Void[] array) {
        final boolean i = App.I;
        final Integer value = 0;
        this.a = App.ak.a(MediaView.j(this.b), new d(this));
        Integer value2 = value;
        int n;
        for (int j = 0; j < this.a.size(); j = n) {
            if (((bi)this.a.get(j)).a.equals(MediaView.f(this.b))) {
                value2 = -1 + (this.a.size() - j);
                if (!i) {
                    break;
                }
            }
            n = j + 1;
            if (i) {
                break;
            }
        }
        return value2;
    }
    
    public void a() {
        this.cancel(true);
    }
    
    protected void a(final Integer n) {
        MediaView.a(this.b, this.a);
        MediaView.b(this.b, n);
        if (MediaView.d(this.b).size() > 0) {
            MediaView.g(this.b).notifyDataSetChanged();
            MediaView.c(this.b).setCurrentItem(MediaView.i(this.b), false);
            this.b.getSupportActionBar().setDisplayShowTitleEnabled(true);
            this.b.getSupportActionBar().setTitle(this.b.getString(2131231299, new Object[] { 1 + MediaView.i(this.b), MediaView.d(this.b).size() }));
            this.b.invalidateOptionsMenu();
        }
        this.b.setSupportProgressBarIndeterminateVisibility(false);
    }
    
    protected Object doInBackground(final Object[] array) {
        return this.a((Void[])array);
    }
    
    protected void onPostExecute(final Object o) {
        this.a((Integer)o);
    }
}
