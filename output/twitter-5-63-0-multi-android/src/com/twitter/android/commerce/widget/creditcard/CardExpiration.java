// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.commerce.widget.creditcard;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import com.twitter.android.commerce.util.a;
import android.text.TextWatcher;
import android.text.Editable;
import android.util.AttributeSet;
import android.content.Context;

public class CardExpiration extends CardEntryBase
{
    public CardExpiration(final Context context) {
        super(context);
    }
    
    public CardExpiration(final Context context, final AttributeSet set) {
        super(context, set);
    }
    
    public CardExpiration(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
    }
    
    @Override
    public void a() {
        super.a();
    }
    
    public void afterTextChanged(final Editable editable) {
        final String string = editable.toString();
        if (string.length() > this.b.length()) {
            this.removeTextChangedListener((TextWatcher)this);
            final String d = com.twitter.android.commerce.util.a.d(editable.toString());
            this.setText((CharSequence)d);
            this.setSelection(d.length());
            this.addTextChangedListener((TextWatcher)this);
            if (d.length() == 5) {
                this.a.e();
                this.setValid(true);
            }
            if (d.length() >= 5) {
                this.a.e();
                this.setValid(true);
            }
            else if (d.length() < string.length()) {
                this.setLastError(2131296560);
                this.a.a(this);
                this.setValid(false);
            }
        }
    }
    
    public Calendar getDataImpl() {
        final Calendar instance = Calendar.getInstance();
        final SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MM/yy");
        simpleDateFormat.setLenient(false);
        try {
            instance.setTime(simpleDateFormat.parse(this.getText().toString()));
            return instance;
        }
        catch (ParseException ex) {
            return null;
        }
    }
    
    @Override
    public String getHelperText() {
        return this.c.getString(2131296499);
    }
    
    @Override
    protected int getHintResource() {
        return 2131296500;
    }
}
