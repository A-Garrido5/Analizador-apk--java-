// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.commerce.widget.creditcard;

import com.twitter.util.q;
import android.text.TextWatcher;
import com.twitter.android.commerce.util.a;
import android.text.Editable;
import android.text.InputFilter$LengthFilter;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.content.Context;
import java.util.List;
import com.twitter.library.commerce.model.CreditCard$Type;

public class CardNumber extends CardEntryBase
{
    private CreditCard$Type d;
    private List e;
    private Integer f;
    
    public CardNumber(final Context context) {
        super(context);
    }
    
    public CardNumber(final Context context, final AttributeSet set) {
        super(context, set);
    }
    
    public CardNumber(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
    }
    
    @Override
    public void a() {
        super.a();
        this.setGravity(3);
        this.setFilters(new InputFilter[] { new InputFilter$LengthFilter(20) });
    }
    
    public void afterTextChanged(final Editable editable) {
        final String string = editable.toString();
        if (string.length() >= 4) {
            final int c = com.twitter.android.commerce.util.a.c(string);
            final CreditCard$Type e = CreditCard$Type.e(string);
            if (!e.equals(this.d)) {
                this.setFilters(new InputFilter[] { new InputFilter$LengthFilter(c) });
            }
            final boolean equals = e.equals(CreditCard$Type.a);
            int n;
            if (!equals && this.e != null && this.e.size() > 0 && !this.e.contains(e)) {
                n = 1;
            }
            else {
                n = 0;
            }
            if (equals || n != 0) {
                if (equals) {
                    this.removeTextChangedListener((TextWatcher)this);
                    this.setSelection(3);
                    this.addTextChangedListener((TextWatcher)this);
                    this.setLastError(2131296567);
                }
                else if (n != 0) {
                    if (this.d != e) {
                        this.a.a(e);
                    }
                    this.d = e;
                    this.setLastError(2131296568);
                }
                this.a.a(this);
                this.setValid(false);
            }
            else {
                if (this.d != e) {
                    this.a.a(e);
                }
                this.d = e;
                final String b = com.twitter.android.commerce.util.a.b(string);
                if (!string.equalsIgnoreCase(b)) {
                    this.removeTextChangedListener((TextWatcher)this);
                    this.setText((CharSequence)b);
                    this.setSelection(b.length());
                    this.addTextChangedListener((TextWatcher)this);
                }
                if (b.length() >= c) {
                    if (e.d(q.b(string))) {
                        this.a.d();
                        this.setValid(true);
                        return;
                    }
                    this.setLastError(2131296567);
                    this.a.a(this);
                    this.setValid(false);
                }
            }
        }
        else if (this.d != null) {
            this.d = null;
            this.a.a(CreditCard$Type.a);
        }
    }
    
    @Override
    public void b() {
        this.setHint((CharSequence)com.twitter.android.commerce.util.a.a(this.c.getResources().getString(this.getHintResource())));
    }
    
    @Override
    protected String getDataImpl() {
        return q.b(this.getText().toString());
    }
    
    @Override
    public String getHelperText() {
        return this.c.getString(2131296509);
    }
    
    @Override
    protected int getHintResource() {
        if (this.f == null) {
            return 2131296510;
        }
        return this.f;
    }
    
    public CreditCard$Type getType() {
        return this.d;
    }
    
    public void setHintResource(final int n) {
        this.f = n;
        this.b();
    }
    
    public void setSupportedCardTypes(final List e) {
        this.e = e;
    }
}
