// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.card.element;

import android.view.View;
import java.io.ObjectOutput;
import java.io.ObjectInput;
import com.twitter.library.card.Card;
import android.content.Context;
import android.widget.EditText;
import com.twitter.library.card.property.Vector2;

public class FormText extends FormFieldElement
{
    private static final long serialVersionUID = 5770057730551228713L;
    public Vector2 alignmentMode;
    public String charset;
    public int color;
    public boolean fontBold;
    public boolean fontItalic;
    public String fontName;
    public float fontSize;
    public boolean fontUnderline;
    public String inputMode;
    public int maxLength;
    public int placeHolderTextId;
    
    public FormText() {
        this.alignmentMode = new Vector2(1, 1);
        this.placeHolderTextId = -1;
        this.maxLength = 10;
    }
    
    public void J() {
        final EditText editText = ((FormTextView)this.mView).getEditText();
        final int x = this.alignmentMode.x;
        int gravity = 0;
        switch (x) {
            case 1: {
                gravity = 3;
                break;
            }
            case 2: {
                gravity = 1;
                break;
            }
            case 3: {
                gravity = 5;
                break;
            }
            case 4: {
                gravity = 8388611;
                break;
            }
        }
        switch (this.alignmentMode.y) {
            case 1:
            case 4: {
                gravity |= 0x30;
                break;
            }
            case 2: {
                gravity |= 0x10;
                break;
            }
            case 3: {
                gravity |= 0x50;
                break;
            }
        }
        editText.setGravity(gravity);
        if (this.maxSizeMode.x == 1) {
            editText.setMaxWidth((int)this.maxSize.x);
        }
        if (this.maxSizeMode.y == 1) {
            editText.setMaxHeight((int)this.maxSize.y);
        }
    }
    
    @Override
    public String a() {
        return ((FormTextView)this.mView).getText();
    }
    
    @Override
    public void a(final Context context) {
        this.mView = (View)new FormTextView(context, this);
    }
    
    @Override
    protected void a_(final Card card) {
        ((FormTextView)this.mView).a(card);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this != o) {
            if (!(o instanceof FormText)) {
                return false;
            }
            if (!super.equals(o)) {
                return false;
            }
            final FormText formText = (FormText)o;
            if (this.color != formText.color) {
                return false;
            }
            if (this.fontBold != formText.fontBold) {
                return false;
            }
            if (this.fontItalic != formText.fontItalic) {
                return false;
            }
            if (Float.compare(formText.fontSize, this.fontSize) != 0) {
                return false;
            }
            if (this.fontUnderline != formText.fontUnderline) {
                return false;
            }
            if (this.maxLength != formText.maxLength) {
                return false;
            }
            if (this.placeHolderTextId != formText.placeHolderTextId) {
                return false;
            }
            Label_0155: {
                if (this.alignmentMode != null) {
                    if (this.alignmentMode.equals(formText.alignmentMode)) {
                        break Label_0155;
                    }
                }
                else if (formText.alignmentMode == null) {
                    break Label_0155;
                }
                return false;
            }
            Label_0185: {
                if (this.charset != null) {
                    if (this.charset.equals(formText.charset)) {
                        break Label_0185;
                    }
                }
                else if (formText.charset == null) {
                    break Label_0185;
                }
                return false;
            }
            Label_0215: {
                if (this.fontName != null) {
                    if (this.fontName.equals(formText.fontName)) {
                        break Label_0215;
                    }
                }
                else if (formText.fontName == null) {
                    break Label_0215;
                }
                return false;
            }
            if (this.inputMode != null) {
                if (this.inputMode.equals(formText.inputMode)) {
                    return true;
                }
            }
            else if (formText.inputMode == null) {
                return true;
            }
            return false;
        }
        return true;
    }
    
    @Override
    public int hashCode() {
        int n = 1;
        final int n2 = 31 * (31 * (31 * super.hashCode() + this.maxLength) + this.placeHolderTextId);
        int hashCode;
        if (this.charset != null) {
            hashCode = this.charset.hashCode();
        }
        else {
            hashCode = 0;
        }
        final int n3 = 31 * (hashCode + n2);
        int hashCode2;
        if (this.inputMode != null) {
            hashCode2 = this.inputMode.hashCode();
        }
        else {
            hashCode2 = 0;
        }
        final int n4 = 31 * (hashCode2 + n3);
        int hashCode3;
        if (this.alignmentMode != null) {
            hashCode3 = this.alignmentMode.hashCode();
        }
        else {
            hashCode3 = 0;
        }
        final int n5 = 31 * (hashCode3 + n4);
        int hashCode4;
        if (this.fontName != null) {
            hashCode4 = this.fontName.hashCode();
        }
        else {
            hashCode4 = 0;
        }
        final int n6 = 31 * (hashCode4 + n5);
        int floatToIntBits;
        if (this.fontSize != 0.0f) {
            floatToIntBits = Float.floatToIntBits(this.fontSize);
        }
        else {
            floatToIntBits = 0;
        }
        final int n7 = 31 * (floatToIntBits + n6);
        int n8;
        if (this.fontBold) {
            n8 = n;
        }
        else {
            n8 = 0;
        }
        final int n9 = 31 * (n8 + n7);
        int n10;
        if (this.fontUnderline) {
            n10 = n;
        }
        else {
            n10 = 0;
        }
        final int n11 = 31 * (n10 + n9);
        if (!this.fontItalic) {
            n = 0;
        }
        return 31 * (n11 + n) + this.color;
    }
    
    @Override
    public void readExternal(final ObjectInput objectInput) {
        super.readExternal(objectInput);
        this.maxLength = objectInput.readInt();
        this.placeHolderTextId = objectInput.readInt();
        this.charset = (String)objectInput.readObject();
        this.inputMode = (String)objectInput.readObject();
        this.alignmentMode = (Vector2)objectInput.readObject();
        this.fontName = (String)objectInput.readObject();
        this.fontSize = objectInput.readFloat();
        this.fontBold = objectInput.readBoolean();
        this.fontUnderline = objectInput.readBoolean();
        this.fontItalic = objectInput.readBoolean();
        this.color = objectInput.readInt();
    }
    
    @Override
    public void writeExternal(final ObjectOutput objectOutput) {
        super.writeExternal(objectOutput);
        objectOutput.writeInt(this.maxLength);
        objectOutput.writeInt(this.placeHolderTextId);
        objectOutput.writeObject(this.charset);
        objectOutput.writeObject(this.inputMode);
        objectOutput.writeObject(this.alignmentMode);
        objectOutput.writeObject(this.fontName);
        objectOutput.writeFloat(this.fontSize);
        objectOutput.writeBoolean(this.fontBold);
        objectOutput.writeBoolean(this.fontUnderline);
        objectOutput.writeBoolean(this.fontItalic);
        objectOutput.writeInt(this.color);
    }
}
