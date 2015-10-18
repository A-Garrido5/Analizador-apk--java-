// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.commerce.view;

import android.widget.TextView;
import android.view.ViewGroup;
import android.view.View;
import java.util.HashMap;
import java.util.Map;
import android.content.Context;
import android.widget.ArrayAdapter;

final class ProductSummaryActivity$ProductSelectAdapter extends ArrayAdapter
{
    private Context a;
    private Map b;
    private Map c;
    private int d;
    
    public ProductSummaryActivity$ProductSelectAdapter(final Context a, final int n, final int n2) {
        super(a, n, n2);
        this.d = a.getResources().getColor(2131689539);
        this.a = a;
    }
    
    public void a() {
        if (this.b != null) {
            this.b.clear();
        }
        if (this.c != null) {
            this.c.clear();
        }
    }
    
    public void a(final int n, final ProductSummaryActivity$ProductSelectAdapter$SpinnerState productSummaryActivity$ProductSelectAdapter$SpinnerState) {
        if (this.b == null) {
            this.b = new HashMap();
        }
        this.b.put(n, productSummaryActivity$ProductSelectAdapter$SpinnerState);
    }
    
    public void a(final int n, final String s) {
        if (this.c == null) {
            this.c = new HashMap();
        }
        this.c.put(n, s);
    }
    
    public boolean a(final int n) {
        return this.b != null && this.b.containsKey(n) && this.b.get(n).equals(ProductSummaryActivity$ProductSelectAdapter$SpinnerState.b);
    }
    
    public View getDropDownView(final int n, final View view, final ViewGroup viewGroup) {
        final View dropDownView = super.getDropDownView(n, view, viewGroup);
        final TextView textView = (TextView)dropDownView.findViewById(16908309);
        if (textView != null) {
            textView.setText((CharSequence)"");
            if (this.b != null && this.b.containsKey(n)) {
                switch (ah.b[this.b.get(n).ordinal()]) {
                    default: {
                        textView.setVisibility(8);
                        break;
                    }
                    case 1: {
                        textView.setVisibility(0);
                        textView.setText((CharSequence)this.a.getString(2131296684));
                        break;
                    }
                    case 2: {
                        textView.setVisibility(0);
                        textView.setText((CharSequence)this.a.getString(2131296672));
                        break;
                    }
                }
            }
            else {
                textView.setVisibility(8);
            }
        }
        final TextView textView2 = (TextView)dropDownView.findViewById(2131886534);
        if (textView2 != null) {
            if (this.c == null || !this.c.containsKey(n)) {
                textView2.setVisibility(8);
                return dropDownView;
            }
            textView2.setVisibility(0);
            textView2.setText((CharSequence)this.c.get(n));
        }
        return dropDownView;
    }
    
    public View getView(final int n, final View view, final ViewGroup viewGroup) {
        final View view2 = super.getView(n, view, viewGroup);
        final TextView textView = (TextView)view2.findViewById(16908308);
        if (textView != null) {
            if (n != 0) {
                textView.setTextColor(-16777216);
                return view2;
            }
            textView.setTextColor(this.d);
        }
        return view2;
    }
}
