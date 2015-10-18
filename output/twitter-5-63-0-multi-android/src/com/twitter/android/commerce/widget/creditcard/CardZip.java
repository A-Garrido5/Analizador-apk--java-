// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.commerce.widget.creditcard;

import android.text.Editable;
import android.text.InputFilter$LengthFilter;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.content.Context;

public class CardZip extends CardEntryBase
{
    public CardZip(final Context context) {
        super(context);
    }
    
    public CardZip(final Context context, final AttributeSet set) {
        super(context, set);
    }
    
    public CardZip(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
    }
    
    @Override
    public void a() {
        super.a();
        this.setFilters(new InputFilter[] { new InputFilter$LengthFilter(5) });
    }
    
    public void afterTextChanged(final Editable editable) {
        if (editable.toString().length() == 5) {
            this.a.g();
            this.setValid(true);
            return;
        }
        this.setValid(false);
    }
    
    @Override
    protected String getDataImpl() {
        return this.getText().toString();
    }
    
    @Override
    public String getHelperText() {
        return this.c.getString(2131296514);
    }
    
    @Override
    protected int getHintResource() {
        return 2131296515;
    }
}
