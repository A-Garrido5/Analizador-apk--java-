// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.commerce.widget.creditcard;

import android.text.TextWatcher;
import android.text.Editable;
import android.util.AttributeSet;
import android.content.Context;
import com.twitter.library.commerce.model.CreditCard$Type;

public class CardCCV extends CardEntryBase
{
    private CreditCard$Type d;
    
    public CardCCV(final Context context) {
        super(context);
    }
    
    public CardCCV(final Context context, final AttributeSet set) {
        super(context, set);
    }
    
    public CardCCV(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
    }
    
    @Override
    public void a() {
        super.a();
    }
    
    public void afterTextChanged(final Editable editable) {
        if (this.d == null) {
            this.removeTextChangedListener((TextWatcher)this);
            this.setText((CharSequence)"");
            this.addTextChangedListener((TextWatcher)this);
            return;
        }
        final String string = editable.toString();
        if (string.length() < this.d.c()) {
            this.setValid(false);
            return;
        }
        if (string.length() > this.d.c()) {
            editable.delete(3, editable.length());
            this.a.f();
            this.setValid(true);
            return;
        }
        this.a.f();
        this.setValid(true);
    }
    
    public String getDataImpl() {
        try {
            return this.getText().toString();
        }
        catch (NumberFormatException ex) {
            return null;
        }
    }
    
    @Override
    public String getHelperText() {
        return this.c.getString(2131296497);
    }
    
    @Override
    protected int getHintResource() {
        return 2131296498;
    }
    
    public CreditCard$Type getType() {
        return this.d;
    }
    
    public void setType(final CreditCard$Type d) {
        this.d = d;
    }
}
