// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.commerce.widget.form;

import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.SpannableString;
import android.content.res.TypedArray;
import android.view.View$OnClickListener;
import com.twitter.android.pa;
import android.util.AttributeSet;
import android.content.Context;
import android.widget.TextView$BufferType;
import android.widget.TextView;

public class ExpandableTextView extends TextView
{
    private CharSequence a;
    private TextView$BufferType b;
    private boolean c;
    private boolean d;
    private int e;
    private int f;
    private boolean g;
    private String h;
    
    public ExpandableTextView(final Context context) {
        this(context, null);
    }
    
    public ExpandableTextView(final Context context, final AttributeSet set) {
        super(context, set);
        this.g = true;
        this.c = true;
        this.h = context.getString(2131296532);
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, pa.ExpandableTextView);
        try {
            this.e = obtainStyledAttributes.getInt(0, 4);
            this.f = obtainStyledAttributes.getInt(1, 6);
            this.setShouldTrim(obtainStyledAttributes.getBoolean(2, true));
            this.setOnClickListener((View$OnClickListener)new a(this));
        }
        finally {
            obtainStyledAttributes.recycle();
        }
    }
    
    private CharSequence a(final CharSequence charSequence) {
        if (this.getLayout().getLineCount() > this.f) {
            final SpannableString spannableString = new SpannableString((CharSequence)this.h);
            spannableString.setSpan((Object)new ForegroundColorSpan(this.getResources().getColor(2131689600)), 0, spannableString.length(), 0);
            return (CharSequence)new SpannableStringBuilder(this.a, 0, this.getLayout().getLineEnd(-1 + this.e) - (1 + spannableString.length()) + 1).append((CharSequence)spannableString);
        }
        return this.a;
    }
    
    private void b() {
        super.setText(this.getTextForCurrentMode(), this.b);
    }
    
    private CharSequence getTextForCurrentMode() {
        if (!this.a()) {
            return this.a;
        }
        if (this.c) {
            return this.a(this.a);
        }
        return this.a;
    }
    
    public boolean a() {
        return this.d;
    }
    
    public int getLineTrimLength() {
        return this.e;
    }
    
    public CharSequence getOriginalText() {
        return this.a;
    }
    
    public int getTrimThreshold() {
        return this.f;
    }
    
    protected void onLayout(final boolean b, final int n, final int n2, final int n3, final int n4) {
        super.onLayout(b, n, n2, n3, n4);
        if (this.g) {
            this.g = false;
            this.b();
        }
    }
    
    public void setLineTrimLength(final int e) {
        this.e = e;
        this.b();
    }
    
    public void setShouldTrim(final boolean d) {
        this.d = d;
    }
    
    public void setText(final CharSequence a, final TextView$BufferType b) {
        this.a = a;
        this.b = b;
        if (this.getLayout() != null) {
            this.b();
            return;
        }
        super.setText(a, b);
    }
    
    public void setTrimThreshold(final int f) {
        this.f = f;
    }
}
