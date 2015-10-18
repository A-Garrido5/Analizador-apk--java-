// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.card.element;

import android.view.View;
import java.io.ObjectOutput;
import java.io.ObjectInput;
import com.twitter.library.card.Card;
import android.content.Context;

public class FormCheckbox extends FormFieldElement
{
    private static final long serialVersionUID = 296654600553034927L;
    public boolean checked;
    public String value;
    
    @Override
    public String a() {
        if (((FormCheckboxView)this.mView).a()) {
            return "true";
        }
        return "false";
    }
    
    @Override
    public void a(final Context context) {
        this.mView = (View)new FormCheckboxView(context, this);
    }
    
    @Override
    protected void a_(final Card card) {
        ((FormCheckboxView)this.mView).a(card);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this != o) {
            if (!(o instanceof FormCheckbox)) {
                return false;
            }
            if (!super.equals(o)) {
                return false;
            }
            final FormCheckbox formCheckbox = (FormCheckbox)o;
            if (this.checked != formCheckbox.checked) {
                return false;
            }
            if (this.value != null) {
                if (this.value.equals(formCheckbox.value)) {
                    return true;
                }
            }
            else if (formCheckbox.value == null) {
                return true;
            }
            return false;
        }
        return true;
    }
    
    @Override
    public int hashCode() {
        final int n = 31 * super.hashCode();
        int hashCode;
        if (this.value != null) {
            hashCode = this.value.hashCode();
        }
        else {
            hashCode = 0;
        }
        final int n2 = 31 * (hashCode + n);
        final boolean checked = this.checked;
        int n3 = 0;
        if (checked) {
            n3 = 1;
        }
        return n2 + n3;
    }
    
    @Override
    public void readExternal(final ObjectInput objectInput) {
        super.readExternal(objectInput);
        this.value = (String)objectInput.readObject();
        this.checked = objectInput.readBoolean();
    }
    
    @Override
    public void writeExternal(final ObjectOutput objectOutput) {
        super.writeExternal(objectOutput);
        objectOutput.writeObject(this.value);
        objectOutput.writeBoolean(this.checked);
    }
}
