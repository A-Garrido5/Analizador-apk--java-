// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.card.element;

import android.view.View;
import java.io.ObjectOutput;
import com.twitter.util.f;
import java.io.ObjectInput;
import java.util.Arrays;
import com.twitter.library.card.Card;
import android.content.Context;
import com.twitter.library.card.property.FormSelectOption;
import java.io.Externalizable;

public class FormSelect extends FormFieldElement implements Externalizable
{
    private static final long serialVersionUID = -2998366155182761389L;
    public int color;
    public boolean fontBold;
    public boolean fontItalic;
    public String fontName;
    public float fontSize;
    public boolean fontUnderline;
    public FormSelectOption[] options;
    
    @Override
    public String a() {
        final int selectedIndex = ((FormSelectView)this.mView).getSelectedIndex();
        if (selectedIndex >= 0 && selectedIndex < this.options.length) {
            return this.options[selectedIndex].value;
        }
        return "";
    }
    
    @Override
    public void a(final Context context) {
        this.mView = (View)new FormSelectView(context, this);
    }
    
    @Override
    protected void a_(final Card card) {
        super.a_(card);
        ((FormSelectView)this.mView).a(card);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this != o) {
            if (!(o instanceof FormSelect)) {
                return false;
            }
            if (!super.equals(o)) {
                return false;
            }
            final FormSelect formSelect = (FormSelect)o;
            if (this.color != formSelect.color) {
                return false;
            }
            if (this.fontBold != formSelect.fontBold) {
                return false;
            }
            if (this.fontItalic != formSelect.fontItalic) {
                return false;
            }
            if (Float.compare(formSelect.fontSize, this.fontSize) != 0) {
                return false;
            }
            if (this.fontUnderline != formSelect.fontUnderline) {
                return false;
            }
            Label_0129: {
                if (this.fontName != null) {
                    if (this.fontName.equals(formSelect.fontName)) {
                        break Label_0129;
                    }
                }
                else if (formSelect.fontName == null) {
                    break Label_0129;
                }
                return false;
            }
            if (!Arrays.equals(this.options, formSelect.options)) {
                return false;
            }
        }
        return true;
    }
    
    @Override
    public int hashCode() {
        int n = 1;
        final int n2 = 31 * (31 * super.hashCode() + this.color);
        int hashCode;
        if (this.fontName != null) {
            hashCode = this.fontName.hashCode();
        }
        else {
            hashCode = 0;
        }
        final int n3 = 31 * (hashCode + n2);
        int floatToIntBits;
        if (this.fontSize != 0.0f) {
            floatToIntBits = Float.floatToIntBits(this.fontSize);
        }
        else {
            floatToIntBits = 0;
        }
        final int n4 = 31 * (floatToIntBits + n3);
        int n5;
        if (this.fontBold) {
            n5 = n;
        }
        else {
            n5 = 0;
        }
        final int n6 = 31 * (n5 + n4);
        int n7;
        if (this.fontItalic) {
            n7 = n;
        }
        else {
            n7 = 0;
        }
        final int n8 = 31 * (n7 + n6);
        if (!this.fontUnderline) {
            n = 0;
        }
        final int n9 = 31 * (n8 + n);
        final FormSelectOption[] options = this.options;
        int hashCode2 = 0;
        if (options != null) {
            hashCode2 = Arrays.hashCode(this.options);
        }
        return n9 + hashCode2;
    }
    
    @Override
    public void readExternal(final ObjectInput objectInput) {
        super.readExternal(objectInput);
        this.color = objectInput.readInt();
        this.fontName = (String)objectInput.readObject();
        this.fontSize = objectInput.readFloat();
        this.fontBold = objectInput.readBoolean();
        this.fontItalic = objectInput.readBoolean();
        this.fontUnderline = objectInput.readBoolean();
        this.options = (FormSelectOption[])f.a(FormSelectOption[].class, objectInput);
    }
    
    @Override
    public void writeExternal(final ObjectOutput objectOutput) {
        super.writeExternal(objectOutput);
        objectOutput.writeInt(this.color);
        objectOutput.writeObject(this.fontName);
        objectOutput.writeFloat(this.fontSize);
        objectOutput.writeBoolean(this.fontBold);
        objectOutput.writeBoolean(this.fontItalic);
        objectOutput.writeBoolean(this.fontUnderline);
        f.a(this.options, objectOutput);
    }
}
