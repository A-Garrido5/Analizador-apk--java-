// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.card.element;

import com.twitter.library.card.Card;
import android.text.InputFilter;
import android.text.InputFilter$LengthFilter;
import java.util.ArrayList;
import android.view.View;
import android.widget.TextView;
import android.content.Context;
import android.graphics.Typeface;
import android.widget.EditText;

public class FormTextView extends FormFieldElementView
{
    private EditText c;
    private Typeface d;
    private FormText e;
    
    public FormTextView(final Context context, final FormText e) {
        super(context, e);
        this.e = e;
    }
    
    private void a(final TextView textView) {
        if (this.d == null) {
            this.d = this.a(this.e.fontName, this.e.fontBold, this.e.fontItalic);
        }
        textView.setTypeface(this.d);
        if (this.e.fontUnderline) {
            textView.setPaintFlags(0x8 | textView.getPaintFlags());
        }
        else {
            textView.setPaintFlags(0xFFFFFFF7 & textView.getPaintFlags());
        }
        textView.setTextSize(0, this.e.fontSize);
        textView.setTextColor(this.e.color);
    }
    
    private void setUpConstrain(final String s) {
        if (s == null) {
            this.c.setInputType(1);
            return;
        }
        if (s.equalsIgnoreCase("email")) {
            this.c.setInputType(1);
            return;
        }
        if (s.equalsIgnoreCase("numeric")) {
            this.c.setInputType(2);
            return;
        }
        if (s.equalsIgnoreCase("phone")) {
            this.c.setInputType(3);
            return;
        }
        this.c.setInputType(1);
    }
    
    @Override
    protected View a(final Context context, final FormFieldElement formFieldElement) {
        final FormText formText = (FormText)formFieldElement;
        (this.c = new EditText(context)).setEms(formText.maxLength);
        this.c.setSingleLine(true);
        this.c.setHorizontallyScrolling(false);
        this.c.setImeOptions(6);
        this.setUpConstrain(((FormText)formFieldElement).inputMode);
        final ArrayList<InputFilter$LengthFilter> list = new ArrayList<InputFilter$LengthFilter>();
        list.add(new InputFilter$LengthFilter(formText.maxLength));
        if (formText.charset != null) {
            list.add((InputFilter$LengthFilter)new g(formText.charset));
        }
        this.c.setFilters((InputFilter[])list.toArray(new InputFilter[list.size()]));
        return (View)this.c;
    }
    
    @Override
    public void a(final Card card) {
        this.a((TextView)this.c);
        if (this.e.placeHolderTextId >= 0) {
            this.c.setHint((CharSequence)this.a(this.e.placeHolderTextId, card));
        }
        super.a(card);
    }
    
    public EditText getEditText() {
        return this.c;
    }
    
    public String getText() {
        return this.c.getText().toString();
    }
    
    protected void onLayout(final boolean b, final int n, final int n2, final int n3, final int n4) {
        if (!b) {
            return;
        }
        this.c.layout(0, 0, n3 - n, n4 - n2);
    }
}
