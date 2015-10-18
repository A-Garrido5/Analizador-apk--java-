// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.card.element;

import java.io.ObjectOutput;
import java.io.ObjectInput;
import com.twitter.library.card.property.Vector2F;
import com.twitter.library.card.property.FormField;

public abstract class FormFieldElement extends Element
{
    private static final long serialVersionUID = 6008092100318834839L;
    public FormField field;
    
    public float a(final int n, final Vector2F vector2F) {
        if (n == 0) {
            return Math.min(((FormFieldElementView)this.mView).getViewWidth(), vector2F.x);
        }
        return ((FormFieldElementView)this.mView).getViewHeight();
    }
    
    public abstract String a();
    
    public String b() {
        if (this.field == null) {
            return "";
        }
        return this.field.name;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this != o) {
            if (!(o instanceof FormFieldElement)) {
                return false;
            }
            if (!super.equals(o)) {
                return false;
            }
            final FormFieldElement formFieldElement = (FormFieldElement)o;
            if (this.field != null) {
                if (this.field.equals(formFieldElement.field)) {
                    return true;
                }
            }
            else if (formFieldElement.field == null) {
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
        if (this.field != null) {
            hashCode = this.field.hashCode();
        }
        else {
            hashCode = 0;
        }
        return hashCode + n;
    }
    
    @Override
    public void readExternal(final ObjectInput objectInput) {
        super.readExternal(objectInput);
        this.field = (FormField)objectInput.readObject();
    }
    
    @Override
    public void writeExternal(final ObjectOutput objectOutput) {
        super.writeExternal(objectOutput);
        objectOutput.writeObject(this.field);
    }
}
