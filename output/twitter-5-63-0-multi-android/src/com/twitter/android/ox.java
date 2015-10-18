// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import com.twitter.library.api.TwitterUser;
import android.widget.TextView;
import android.support.annotation.LayoutRes;
import android.view.ViewGroup;
import android.view.View;
import android.content.Context;
import java.util.List;
import android.view.LayoutInflater;
import android.widget.BaseAdapter;

final class ox extends BaseAdapter
{
    private final LayoutInflater a;
    private List b;
    
    public ox(final Context context) {
        this.a = LayoutInflater.from(context);
    }
    
    private View a(final int n, final View view, final ViewGroup viewGroup, @LayoutRes final int n2) {
        TextView textView;
        if (view != null) {
            textView = (TextView)view;
        }
        else {
            textView = (TextView)this.a.inflate(n2, viewGroup, false);
        }
        final TwitterUser a = this.a(n);
        String string;
        if (a != null) {
            string = '@' + a.username;
        }
        else {
            string = "";
        }
        textView.setText((CharSequence)string);
        return (View)textView;
    }
    
    public TwitterUser a(final int n) {
        if (n >= 0 && n < this.getCount()) {
            return this.b.get(n);
        }
        return null;
    }
    
    public void a(final List b) {
        this.b = b;
    }
    
    public int getCount() {
        if (this.b != null) {
            return this.b.size();
        }
        return -1;
    }
    
    public View getDropDownView(final int n, final View view, final ViewGroup viewGroup) {
        return this.a(n, view, viewGroup, 17367049);
    }
    
    public long getItemId(final int n) {
        return n;
    }
    
    public View getView(final int n, final View view, final ViewGroup viewGroup) {
        return this.a(n, view, viewGroup, 17367048);
    }
}
