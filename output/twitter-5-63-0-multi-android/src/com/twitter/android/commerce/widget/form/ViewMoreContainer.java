// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.commerce.widget.form;

import android.content.Intent;
import com.twitter.android.SearchTerminalActivity;
import com.twitter.android.client.c;
import android.view.ViewGroup;
import android.view.View;
import android.content.Context;
import com.twitter.library.scribe.ScribeLog;
import android.app.Activity;
import android.widget.TextView;
import android.view.View$OnClickListener;
import android.widget.LinearLayout;

public class ViewMoreContainer extends LinearLayout implements View$OnClickListener
{
    private TextView a;
    private Activity b;
    private String c;
    private String d;
    private int e;
    private ScribeLog f;
    
    public ViewMoreContainer(final Activity b, final String c, final String d, final int e) {
        super((Context)b);
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        View.inflate((Context)b, 2130968685, (ViewGroup)this);
        this.setOnClickListener((View$OnClickListener)this);
        this.a = (TextView)this.findViewById(2131886549);
    }
    
    public void onClick(final View view) {
        if (this.f != null) {
            com.twitter.android.client.c.a(this.getContext()).a(this.f);
        }
        this.b.startActivity(new Intent((Context)this.b, (Class)SearchTerminalActivity.class).putExtra("query", this.c).putExtra("query_name", this.d).putExtra("search_type", this.e).putExtra("terminal", false));
    }
    
    public void setClickScribeLog(final ScribeLog f) {
        this.f = f;
    }
    
    public void setDescription(final CharSequence text) {
        this.a.setText(text);
    }
}
