// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.card.property;

import java.io.ObjectOutput;
import java.io.ObjectInput;
import java.io.Externalizable;

public class Style implements Externalizable
{
    private static final long serialVersionUID = 7450215083743477009L;
    public Fill background;
    public Border border;
    public Integer color;
    public Float cornerRadius;
    public Boolean fontBold;
    public Boolean fontItalic;
    public String fontName;
    public Float fontSize;
    public Boolean fontUnderline;
    public int id;
    public Float lineHeight;
    public Spacing margin;
    public Float maxSizeX;
    public Float maxSizeY;
    public Float opacity;
    public Spacing padding;
    public Float positionX;
    public Float positionY;
    public Float sizeX;
    public Float sizeY;
    public Boolean visible;
    public Integer visibleChildIndex;
    
    public float a(final int n) {
        Float n2;
        if (n == 0) {
            n2 = this.sizeX;
        }
        else {
            n2 = this.sizeY;
        }
        return n2;
    }
    
    public void a() {
        this.positionX = null;
        this.positionY = null;
        this.sizeX = null;
        this.sizeY = null;
        this.maxSizeX = null;
        this.maxSizeY = null;
        this.margin = null;
        this.opacity = null;
        this.visible = null;
        this.background = null;
        this.border = null;
        this.padding = null;
        this.fontName = null;
        this.fontSize = null;
        this.color = null;
        this.lineHeight = null;
        this.fontBold = null;
        this.fontUnderline = null;
        this.fontItalic = null;
        this.cornerRadius = null;
        this.visibleChildIndex = null;
    }
    
    public void a(final Style style) {
        if (style.positionX != null) {
            this.positionX = style.positionX;
        }
        if (style.positionY != null) {
            this.positionY = style.positionY;
        }
        if (style.sizeX != null) {
            this.sizeX = style.sizeX;
        }
        if (style.sizeY != null) {
            this.sizeY = style.sizeY;
        }
        if (style.maxSizeX != null) {
            this.maxSizeX = style.maxSizeX;
        }
        if (style.maxSizeY != null) {
            this.maxSizeY = style.maxSizeY;
        }
        if (style.margin != null) {
            this.margin = style.margin;
        }
        if (style.opacity != null) {
            this.opacity = style.opacity;
        }
        if (style.visible != null) {
            this.visible = style.visible;
        }
        if (style.background != null) {
            this.background = style.background;
        }
        if (style.border != null) {
            this.border = style.border;
        }
        if (style.padding != null) {
            this.padding = style.padding;
        }
        if (style.fontName != null) {
            this.fontName = style.fontName;
        }
        if (style.fontSize != null) {
            this.fontSize = style.fontSize;
        }
        if (style.color != null) {
            this.color = style.color;
        }
        if (style.lineHeight != null) {
            this.lineHeight = style.lineHeight;
        }
        if (style.fontBold != null) {
            this.fontBold = style.fontBold;
        }
        if (style.fontUnderline != null) {
            this.fontUnderline = style.fontUnderline;
        }
        if (style.fontItalic != null) {
            this.fontItalic = style.fontItalic;
        }
        if (style.cornerRadius != null) {
            this.cornerRadius = style.cornerRadius;
        }
        if (style.visibleChildIndex != null) {
            this.visibleChildIndex = style.visibleChildIndex;
        }
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this != o) {
            if (!(o instanceof Style)) {
                return false;
            }
            final Style style = (Style)o;
            if (this.id != style.id) {
                return false;
            }
            Label_0064: {
                if (this.background != null) {
                    if (this.background.equals(style.background)) {
                        break Label_0064;
                    }
                }
                else if (style.background == null) {
                    break Label_0064;
                }
                return false;
            }
            Label_0094: {
                if (this.border != null) {
                    if (this.border.equals(style.border)) {
                        break Label_0094;
                    }
                }
                else if (style.border == null) {
                    break Label_0094;
                }
                return false;
            }
            Label_0124: {
                if (this.color != null) {
                    if (this.color.equals(style.color)) {
                        break Label_0124;
                    }
                }
                else if (style.color == null) {
                    break Label_0124;
                }
                return false;
            }
            Label_0154: {
                if (this.cornerRadius != null) {
                    if (this.cornerRadius.equals(style.cornerRadius)) {
                        break Label_0154;
                    }
                }
                else if (style.cornerRadius == null) {
                    break Label_0154;
                }
                return false;
            }
            Label_0184: {
                if (this.fontBold != null) {
                    if (this.fontBold.equals(style.fontBold)) {
                        break Label_0184;
                    }
                }
                else if (style.fontBold == null) {
                    break Label_0184;
                }
                return false;
            }
            Label_0214: {
                if (this.fontItalic != null) {
                    if (this.fontItalic.equals(style.fontItalic)) {
                        break Label_0214;
                    }
                }
                else if (style.fontItalic == null) {
                    break Label_0214;
                }
                return false;
            }
            Label_0244: {
                if (this.fontName != null) {
                    if (this.fontName.equals(style.fontName)) {
                        break Label_0244;
                    }
                }
                else if (style.fontName == null) {
                    break Label_0244;
                }
                return false;
            }
            Label_0274: {
                if (this.fontSize != null) {
                    if (this.fontSize.equals(style.fontSize)) {
                        break Label_0274;
                    }
                }
                else if (style.fontSize == null) {
                    break Label_0274;
                }
                return false;
            }
            Label_0304: {
                if (this.fontUnderline != null) {
                    if (this.fontUnderline.equals(style.fontUnderline)) {
                        break Label_0304;
                    }
                }
                else if (style.fontUnderline == null) {
                    break Label_0304;
                }
                return false;
            }
            Label_0334: {
                if (this.lineHeight != null) {
                    if (this.lineHeight.equals(style.lineHeight)) {
                        break Label_0334;
                    }
                }
                else if (style.lineHeight == null) {
                    break Label_0334;
                }
                return false;
            }
            Label_0364: {
                if (this.margin != null) {
                    if (this.margin.equals(style.margin)) {
                        break Label_0364;
                    }
                }
                else if (style.margin == null) {
                    break Label_0364;
                }
                return false;
            }
            Label_0394: {
                if (this.maxSizeX != null) {
                    if (this.maxSizeX.equals(style.maxSizeX)) {
                        break Label_0394;
                    }
                }
                else if (style.maxSizeX == null) {
                    break Label_0394;
                }
                return false;
            }
            Label_0424: {
                if (this.maxSizeY != null) {
                    if (this.maxSizeY.equals(style.maxSizeY)) {
                        break Label_0424;
                    }
                }
                else if (style.maxSizeY == null) {
                    break Label_0424;
                }
                return false;
            }
            Label_0454: {
                if (this.opacity != null) {
                    if (this.opacity.equals(style.opacity)) {
                        break Label_0454;
                    }
                }
                else if (style.opacity == null) {
                    break Label_0454;
                }
                return false;
            }
            Label_0484: {
                if (this.padding != null) {
                    if (this.padding.equals(style.padding)) {
                        break Label_0484;
                    }
                }
                else if (style.padding == null) {
                    break Label_0484;
                }
                return false;
            }
            Label_0514: {
                if (this.positionX != null) {
                    if (this.positionX.equals(style.positionX)) {
                        break Label_0514;
                    }
                }
                else if (style.positionX == null) {
                    break Label_0514;
                }
                return false;
            }
            Label_0544: {
                if (this.positionY != null) {
                    if (this.positionY.equals(style.positionY)) {
                        break Label_0544;
                    }
                }
                else if (style.positionY == null) {
                    break Label_0544;
                }
                return false;
            }
            Label_0574: {
                if (this.sizeX != null) {
                    if (this.sizeX.equals(style.sizeX)) {
                        break Label_0574;
                    }
                }
                else if (style.sizeX == null) {
                    break Label_0574;
                }
                return false;
            }
            Label_0604: {
                if (this.sizeY != null) {
                    if (this.sizeY.equals(style.sizeY)) {
                        break Label_0604;
                    }
                }
                else if (style.sizeY == null) {
                    break Label_0604;
                }
                return false;
            }
            Label_0634: {
                if (this.visible != null) {
                    if (this.visible.equals(style.visible)) {
                        break Label_0634;
                    }
                }
                else if (style.visible == null) {
                    break Label_0634;
                }
                return false;
            }
            if (this.visibleChildIndex != null) {
                if (this.visibleChildIndex.equals(style.visibleChildIndex)) {
                    return true;
                }
            }
            else if (style.visibleChildIndex == null) {
                return true;
            }
            return false;
        }
        return true;
    }
    
    @Override
    public int hashCode() {
        final int n = 31 * this.id;
        int hashCode;
        if (this.positionX != null) {
            hashCode = this.positionX.hashCode();
        }
        else {
            hashCode = 0;
        }
        final int n2 = 31 * (hashCode + n);
        int hashCode2;
        if (this.positionY != null) {
            hashCode2 = this.positionY.hashCode();
        }
        else {
            hashCode2 = 0;
        }
        final int n3 = 31 * (hashCode2 + n2);
        int hashCode3;
        if (this.sizeX != null) {
            hashCode3 = this.sizeX.hashCode();
        }
        else {
            hashCode3 = 0;
        }
        final int n4 = 31 * (hashCode3 + n3);
        int hashCode4;
        if (this.sizeY != null) {
            hashCode4 = this.sizeY.hashCode();
        }
        else {
            hashCode4 = 0;
        }
        final int n5 = 31 * (hashCode4 + n4);
        int hashCode5;
        if (this.maxSizeX != null) {
            hashCode5 = this.maxSizeX.hashCode();
        }
        else {
            hashCode5 = 0;
        }
        final int n6 = 31 * (hashCode5 + n5);
        int hashCode6;
        if (this.maxSizeY != null) {
            hashCode6 = this.maxSizeY.hashCode();
        }
        else {
            hashCode6 = 0;
        }
        final int n7 = 31 * (hashCode6 + n6);
        int hashCode7;
        if (this.margin != null) {
            hashCode7 = this.margin.hashCode();
        }
        else {
            hashCode7 = 0;
        }
        final int n8 = 31 * (hashCode7 + n7);
        int hashCode8;
        if (this.opacity != null) {
            hashCode8 = this.opacity.hashCode();
        }
        else {
            hashCode8 = 0;
        }
        final int n9 = 31 * (hashCode8 + n8);
        int hashCode9;
        if (this.visible != null) {
            hashCode9 = this.visible.hashCode();
        }
        else {
            hashCode9 = 0;
        }
        final int n10 = 31 * (hashCode9 + n9);
        int hashCode10;
        if (this.background != null) {
            hashCode10 = this.background.hashCode();
        }
        else {
            hashCode10 = 0;
        }
        final int n11 = 31 * (hashCode10 + n10);
        int hashCode11;
        if (this.border != null) {
            hashCode11 = this.border.hashCode();
        }
        else {
            hashCode11 = 0;
        }
        final int n12 = 31 * (hashCode11 + n11);
        int hashCode12;
        if (this.padding != null) {
            hashCode12 = this.padding.hashCode();
        }
        else {
            hashCode12 = 0;
        }
        final int n13 = 31 * (hashCode12 + n12);
        int hashCode13;
        if (this.fontName != null) {
            hashCode13 = this.fontName.hashCode();
        }
        else {
            hashCode13 = 0;
        }
        final int n14 = 31 * (hashCode13 + n13);
        int hashCode14;
        if (this.fontSize != null) {
            hashCode14 = this.fontSize.hashCode();
        }
        else {
            hashCode14 = 0;
        }
        final int n15 = 31 * (hashCode14 + n14);
        int hashCode15;
        if (this.color != null) {
            hashCode15 = this.color.hashCode();
        }
        else {
            hashCode15 = 0;
        }
        final int n16 = 31 * (hashCode15 + n15);
        int hashCode16;
        if (this.lineHeight != null) {
            hashCode16 = this.lineHeight.hashCode();
        }
        else {
            hashCode16 = 0;
        }
        final int n17 = 31 * (hashCode16 + n16);
        int hashCode17;
        if (this.fontBold != null) {
            hashCode17 = this.fontBold.hashCode();
        }
        else {
            hashCode17 = 0;
        }
        final int n18 = 31 * (hashCode17 + n17);
        int hashCode18;
        if (this.fontUnderline != null) {
            hashCode18 = this.fontUnderline.hashCode();
        }
        else {
            hashCode18 = 0;
        }
        final int n19 = 31 * (hashCode18 + n18);
        int hashCode19;
        if (this.fontItalic != null) {
            hashCode19 = this.fontItalic.hashCode();
        }
        else {
            hashCode19 = 0;
        }
        final int n20 = 31 * (hashCode19 + n19);
        int hashCode20;
        if (this.cornerRadius != null) {
            hashCode20 = this.cornerRadius.hashCode();
        }
        else {
            hashCode20 = 0;
        }
        final int n21 = 31 * (hashCode20 + n20);
        final Integer visibleChildIndex = this.visibleChildIndex;
        int hashCode21 = 0;
        if (visibleChildIndex != null) {
            hashCode21 = this.visibleChildIndex.hashCode();
        }
        return n21 + hashCode21;
    }
    
    @Override
    public void readExternal(final ObjectInput objectInput) {
        this.id = objectInput.readInt();
        this.positionX = (Float)objectInput.readObject();
        this.positionY = (Float)objectInput.readObject();
        this.sizeX = (Float)objectInput.readObject();
        this.sizeY = (Float)objectInput.readObject();
        this.maxSizeX = (Float)objectInput.readObject();
        this.maxSizeY = (Float)objectInput.readObject();
        this.margin = (Spacing)objectInput.readObject();
        this.opacity = (Float)objectInput.readObject();
        this.visible = (Boolean)objectInput.readObject();
        this.background = (Fill)objectInput.readObject();
        this.border = (Border)objectInput.readObject();
        this.padding = (Spacing)objectInput.readObject();
        this.fontName = (String)objectInput.readObject();
        this.fontSize = (Float)objectInput.readObject();
        this.color = (Integer)objectInput.readObject();
        this.lineHeight = (Float)objectInput.readObject();
        this.fontBold = (Boolean)objectInput.readObject();
        this.fontUnderline = (Boolean)objectInput.readObject();
        this.fontItalic = (Boolean)objectInput.readObject();
        this.cornerRadius = (Float)objectInput.readObject();
        this.visibleChildIndex = (Integer)objectInput.readObject();
    }
    
    @Override
    public void writeExternal(final ObjectOutput objectOutput) {
        objectOutput.writeInt(this.id);
        objectOutput.writeObject(this.positionX);
        objectOutput.writeObject(this.positionY);
        objectOutput.writeObject(this.sizeX);
        objectOutput.writeObject(this.sizeY);
        objectOutput.writeObject(this.maxSizeX);
        objectOutput.writeObject(this.maxSizeY);
        objectOutput.writeObject(this.margin);
        objectOutput.writeObject(this.opacity);
        objectOutput.writeObject(this.visible);
        objectOutput.writeObject(this.background);
        objectOutput.writeObject(this.border);
        objectOutput.writeObject(this.padding);
        objectOutput.writeObject(this.fontName);
        objectOutput.writeObject(this.fontSize);
        objectOutput.writeObject(this.color);
        objectOutput.writeObject(this.lineHeight);
        objectOutput.writeObject(this.fontBold);
        objectOutput.writeObject(this.fontUnderline);
        objectOutput.writeObject(this.fontItalic);
        objectOutput.writeObject(this.cornerRadius);
        objectOutput.writeObject(this.visibleChildIndex);
    }
}
