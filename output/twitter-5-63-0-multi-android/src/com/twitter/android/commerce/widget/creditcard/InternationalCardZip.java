// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.commerce.widget.creditcard;

import android.text.Editable;
import android.util.AttributeSet;
import android.content.Context;

public class InternationalCardZip extends CardEntryBase
{
    public InternationalCardZip(final Context context) {
        super(context);
    }
    
    public InternationalCardZip(final Context context, final AttributeSet set) {
        super(context, set);
    }
    
    public InternationalCardZip(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
    }
    
    @Override
    public void a() {
        super.a();
        this.setInputType(1);
        this.setValid(true);
    }
    
    public void afterTextChanged(final Editable editable) {
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
