// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.card.element;

import android.widget.AdapterView;
import android.view.View;
import android.widget.SpinnerAdapter;
import com.twitter.library.card.Card;
import com.twitter.library.card.property.FormSelectOption;
import android.content.Context;
import android.widget.Spinner;
import android.widget.AdapterView$OnItemSelectedListener;

public class FormSelectView extends FormFieldElementView implements AdapterView$OnItemSelectedListener
{
    private FormSelect c;
    private Spinner d;
    private f e;
    private int f;
    
    public FormSelectView(final Context context, final FormSelect c) {
        super(context, c);
        this.c = c;
        this.f = -1;
    }
    
    private String a(final FormSelectOption formSelectOption, final Card card) {
        return this.a(formSelectOption.tokenizedTextId, card);
    }
    
    private void setUpAdapter(final Card card) {
        if (this.c.options.length > 0) {
            (this.e = new f(card.B(), 17367048, this.c)).setDropDownViewResource(17367049);
            for (final FormSelectOption formSelectOption : this.c.options) {
                final String a = this.a(formSelectOption, card);
                this.e.add((Object)a);
                if (formSelectOption.selected) {
                    this.f = this.e.getPosition((Object)a);
                }
            }
            this.e.notifyDataSetChanged();
            this.e.a = this.a(this.c.fontName, this.c.fontBold, this.c.fontItalic);
            this.d.setAdapter((SpinnerAdapter)this.e);
            if (this.f >= 0) {
                this.d.setSelection(this.f, true);
            }
            this.d.setOnItemSelectedListener((AdapterView$OnItemSelectedListener)this);
        }
    }
    
    @Override
    protected View a(final Context context, final FormFieldElement formFieldElement) {
        return (View)(this.d = new Spinner(context, 0));
    }
    
    @Override
    public void a(final Card upAdapter) {
        this.setUpAdapter(upAdapter);
        super.a(upAdapter);
    }
    
    public int getSelectedIndex() {
        return this.f;
    }
    
    public Spinner getSpinner() {
        return this.d;
    }
    
    public void onItemSelected(final AdapterView adapterView, final View view, final int n, final long n2) {
        this.f = this.d.getSelectedItemPosition();
    }
    
    public void onNothingSelected(final AdapterView adapterView) {
    }
}
