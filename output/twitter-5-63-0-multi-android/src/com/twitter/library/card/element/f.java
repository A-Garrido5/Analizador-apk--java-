// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.card.element;

import android.view.ViewGroup;
import android.view.View;
import android.widget.TextView;
import android.content.Context;
import android.graphics.Typeface;
import android.widget.ArrayAdapter;

class f extends ArrayAdapter
{
    public Typeface a;
    private FormSelect b;
    
    public f(final Context context, final int n, final FormSelect b) {
        super(context, n);
        this.b = b;
    }
    
    private void a(final TextView textView) {
        textView.setTypeface(this.a);
        if (this.b.fontUnderline) {
            textView.setPaintFlags(0x8 | textView.getPaintFlags());
        }
        else {
            textView.setPaintFlags(0xFFFFFFF7 & textView.getPaintFlags());
        }
        textView.setTextSize(0, this.b.fontSize);
        textView.setTextColor(this.b.color);
        textView.setSingleLine(true);
    }
    
    public View getDropDownView(final int n, final View view, final ViewGroup viewGroup) {
        final TextView textView = (TextView)super.getDropDownView(n, view, viewGroup);
        this.a(textView);
        return (View)textView;
    }
    
    public View getView(final int n, final View view, final ViewGroup viewGroup) {
        final TextView textView = (TextView)super.getView(n, view, viewGroup);
        this.a(textView);
        return (View)textView;
    }
}
