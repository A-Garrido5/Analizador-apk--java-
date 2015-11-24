// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.card.element;

import android.view.View;
import android.content.Context;
import android.widget.CheckBox;

public class FormCheckboxView extends FormFieldElementView
{
    private CheckBox c;
    
    public FormCheckboxView(final Context context, final FormFieldElement formFieldElement) {
        super(context, formFieldElement);
    }
    
    @Override
    protected View a(final Context context, final FormFieldElement formFieldElement) {
        (this.c = new CheckBox(context)).setChecked(((FormCheckbox)formFieldElement).checked);
        return (View)this.c;
    }
    
    public boolean a() {
        return this.c.isChecked();
    }
}
