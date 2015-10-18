// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.card.element;

import android.text.Spannable;
import java.io.ObjectOutput;
import android.text.TextUtils;
import java.io.ObjectInput;
import android.graphics.Canvas;
import com.twitter.library.card.property.TextToken;
import com.twitter.library.card.property.TextTokenGroup;
import com.twitter.library.card.property.LocalizedTokenizedText;
import com.twitter.library.card.property.TokenizedText;
import com.twitter.library.card.Card;
import android.content.Context;
import android.text.Layout;
import android.text.SpannableString;
import android.view.MotionEvent;
import android.view.View;
import android.text.TextPaint;
import android.text.StaticLayout;
import android.text.Layout$Alignment;
import com.twitter.library.card.property.Vector2F;
import android.text.TextUtils$TruncateAt;
import android.widget.TextView;
import android.text.style.UnderlineSpan;
import android.text.style.StyleSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.TypefaceSpan;
import android.text.style.BackgroundColorSpan;
import com.twitter.library.card.property.Style;
import android.graphics.Typeface;
import android.text.SpannableStringBuilder;
import com.twitter.library.card.property.Vector2;
import java.io.Externalizable;

public class Text extends Element implements Externalizable
{
    private static final long serialVersionUID = -1339446484261354280L;
    public Vector2 alignmentMode;
    public int color;
    public boolean fontBold;
    public boolean fontItalic;
    public float fontSize;
    public boolean fontUnderline;
    public float lineHeight;
    private SpannableStringBuilder mCookedText;
    private String mFontName;
    private boolean mHasActionSpans;
    private String mRawText;
    private m mTouchedActionSpan;
    private Typeface mTypeface;
    public int maxLines;
    public int overflowMode;
    public int tokenizedTextId;
    
    public Text() {
        this.mCookedText = new SpannableStringBuilder();
    }
    
    private void a(final Style style, final SpannableStringBuilder spannableStringBuilder, final int n, final int n2) {
        if (style.background != null) {
            spannableStringBuilder.setSpan((Object)new BackgroundColorSpan(style.background.solid), n, n2, 0);
        }
        if (style.fontName != null) {
            spannableStringBuilder.setSpan((Object)new TypefaceSpan(style.fontName), n, n2, 0);
        }
        if (style.fontSize != null) {
            spannableStringBuilder.setSpan((Object)new AbsoluteSizeSpan((int)(float)style.fontSize), n, n2, 0);
        }
        if (style.color != null) {
            spannableStringBuilder.setSpan((Object)new ForegroundColorSpan((int)style.color), n, n2, 0);
        }
        if (style.lineHeight != null) {
            spannableStringBuilder.setSpan((Object)new RelativeSizeSpan((float)style.lineHeight), n, n2, 0);
        }
        if (style.fontBold != null && style.fontBold) {
            spannableStringBuilder.setSpan((Object)new StyleSpan(1), n, n2, 0);
        }
        if (style.fontUnderline != null && style.fontUnderline) {
            spannableStringBuilder.setSpan((Object)new UnderlineSpan(), n, n2, 0);
        }
        if (style.fontItalic != null && style.fontItalic) {
            spannableStringBuilder.setSpan((Object)new StyleSpan(2), n, n2, 0);
        }
    }
    
    @Override
    public boolean D() {
        return super.D() || this.mHasActionSpans;
    }
    
    public void J() {
        final TextView textView = (TextView)this.mView;
        final String fontName = this.mComputedStyle.fontName;
        final float floatValue = this.mComputedStyle.fontSize;
        final int intValue = this.mComputedStyle.color;
        final float floatValue2 = this.mComputedStyle.lineHeight;
        final boolean booleanValue = this.mComputedStyle.fontBold;
        final boolean booleanValue2 = this.mComputedStyle.fontItalic;
        textView.setLineSpacing(0.0f, floatValue2 * 1.2f);
        textView.setText((CharSequence)this.mCookedText);
        textView.setTextSize(0, floatValue);
        textView.setTextColor(intValue);
        textView.setSingleLine(false);
        if (this.overflowMode == 3) {
            textView.setEllipsize(TextUtils$TruncateAt.END);
        }
        textView.setHorizontallyScrolling(false);
        if (this.maxLines != 0) {
            textView.setMaxLines(this.maxLines);
        }
        if (this.mTypeface != null) {
            textView.setTypeface(this.mTypeface);
        }
        else if (fontName != null) {
            int n;
            if (booleanValue) {
                n = 1;
            }
            else {
                n = 0;
            }
            if (booleanValue2) {
                n |= 0x2;
            }
            this.a(Typeface.create(fontName, n));
            textView.setTypeface(this.mTypeface);
        }
        int gravity = 0;
        switch (this.alignmentMode.x) {
            default: {
                gravity = 0;
                break;
            }
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
        textView.setGravity(gravity);
        if (this.maxSizeMode.x == 1) {
            textView.setMaxWidth((int)this.maxSize.x);
        }
        if (this.maxSizeMode.y == 1) {
            textView.setMaxHeight((int)this.maxSize.y);
        }
    }
    
    public float a(final int n, final Vector2F vector2F) {
        int n5;
        while (true) {
            int n2 = 1000000;
            final TextPaint paint = ((TextView)this.mView).getPaint();
            int height = 0;
        Label_0108_Outer:
            while (true) {
                while (true) {
                    float n4 = 0.0f;
                    Label_0231: {
                        try {
                            final float n3 = 1.2f * this.mComputedStyle.lineHeight;
                            final int length = this.mCookedText.length();
                            if (n == 0) {
                                return (float)Math.ceil(new StaticLayout((CharSequence)this.mCookedText, 0, length, paint, 1000000, Layout$Alignment.ALIGN_NORMAL, n3, 0.0f, true).getLineWidth(0));
                            }
                            if (this.maxSizeMode.x == 1) {
                                n4 = Math.min(vector2F.x, this.maxSize.x);
                                break Label_0231;
                            }
                            if (this.sizeMode.x == 3) {
                                n4 = 0.0f;
                                break Label_0231;
                            }
                            n4 = vector2F.x;
                            break Label_0231;
                            n2 = (int)Math.ceil(n4);
                            final StaticLayout staticLayout = new StaticLayout((CharSequence)this.mCookedText, 0, length, paint, n2, Layout$Alignment.ALIGN_NORMAL, n3, 0.0f, true);
                            height = staticLayout.getHeight();
                            final int lineCount = staticLayout.getLineCount();
                            // iftrue(Label_0224:, this.maxLines == 0 || lineCount <= this.maxLines)
                            n5 = height / lineCount * this.maxLines;
                            break;
                        }
                        catch (Exception ex) {
                            return 0.0f;
                        }
                        break Label_0108_Outer;
                    }
                    if (n4 <= 0.0f) {
                        continue;
                    }
                    break;
                }
                continue Label_0108_Outer;
            }
            n5 = height;
            break;
        }
        return n5;
    }
    
    protected m a(final View view, final MotionEvent motionEvent) {
        final TextView textView = (TextView)view;
        final Layout layout = textView.getLayout();
        if (layout == null) {
            return null;
        }
        final int n = (int)motionEvent.getX() - textView.getTotalPaddingLeft() + textView.getScrollX();
        final int lineForVertical = layout.getLineForVertical((int)motionEvent.getY() - textView.getTotalPaddingTop() + textView.getScrollY());
        final int n2 = (int)layout.getLineLeft(lineForVertical);
        final int n3 = (int)layout.getLineRight(lineForVertical);
        if (n >= n2 && n <= n3) {
            final int offsetForHorizontal = layout.getOffsetForHorizontal(lineForVertical, (float)n);
            final n[] array = (n[])((Spannable)SpannableString.valueOf((CharSequence)this.mCookedText)).getSpans(offsetForHorizontal, offsetForHorizontal, (Class)n.class);
            if (array.length != 0) {
                final n n4 = array[0];
                if (n4 instanceof m) {
                    return (m)n4;
                }
            }
        }
        return null;
    }
    
    public String a() {
        return this.mFontName;
    }
    
    @Override
    public void a(final Context context) {
        this.mView = (View)new TextElementView(context, this);
    }
    
    public void a(final Typeface mTypeface) {
        this.mFontName = null;
        this.mTypeface = mTypeface;
    }
    
    public void a(final String mRawText) {
        this.mRawText = mRawText;
        this.mCookedText.clear();
    }
    
    protected void b(final Card card) {
        this.mCookedText.clear();
        final LocalizedTokenizedText ae_ = card.aE_();
        if (ae_ != null) {
            final TokenizedText tokenizedText = (TokenizedText)ae_.tokenizedTexts.get(this.tokenizedTextId);
            if (tokenizedText != null && tokenizedText.textTokenGroups != null) {
                for (final TextTokenGroup textTokenGroup : tokenizedText.textTokenGroups) {
                    if (textTokenGroup.visible && textTokenGroup.textTokens != null) {
                        for (final TextToken textToken : textTokenGroup.textTokens) {
                            if (textToken.text != null) {
                                final int styleId = textToken.styleId;
                                final int length3 = this.mCookedText.length();
                                this.mCookedText.append((CharSequence)textToken.text);
                                final int length4 = this.mCookedText.length();
                                if (styleId != 0) {
                                    this.a((Style)card.styles.get(textToken.styleId), this.mCookedText, length3, length4);
                                }
                                if (textToken.a()) {
                                    this.mCookedText.setSpan((Object)new m(textToken), length3, length4, 0);
                                    this.mHasActionSpans = true;
                                }
                            }
                        }
                    }
                }
            }
        }
    }
    
    public void b(final String mFontName) {
        this.mFontName = mFontName;
        this.mTypeface = null;
    }
    
    protected boolean b(final int n) {
        if (this.mHasActionSpans && this.mTouchedActionSpan != null) {
            final TextToken a = this.mTouchedActionSpan.a;
            switch (n) {
                case 2: {
                    this.a(n, a.pressDownActionId);
                    break;
                }
                case 3: {
                    this.a(n, a.pressUpActionId);
                    break;
                }
                case 4: {
                    this.a(n, a.tapActionId);
                    break;
                }
                case 5: {
                    this.a(n, a.longPressActionId);
                    break;
                }
            }
            return true;
        }
        return false;
    }
    
    @Override
    public void d(final Canvas canvas) {
        final int color = Text.a.getColor();
        Text.a.setColor((0xFF000000 & this.color >>> 2) | (0xFFFFFF & this.color));
        canvas.drawRect(this.mLayoutRect, Text.a);
        Text.a.setColor(color);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this != o) {
            if (!(o instanceof Text)) {
                return false;
            }
            if (!super.equals(o)) {
                return false;
            }
            final Text text = (Text)o;
            if (this.color != text.color) {
                return false;
            }
            if (this.fontBold != text.fontBold) {
                return false;
            }
            if (this.fontItalic != text.fontItalic) {
                return false;
            }
            if (Float.compare(text.fontSize, this.fontSize) != 0) {
                return false;
            }
            if (this.fontUnderline != text.fontUnderline) {
                return false;
            }
            if (Float.compare(text.lineHeight, this.lineHeight) != 0) {
                return false;
            }
            if (this.maxLines != text.maxLines) {
                return false;
            }
            if (this.overflowMode != text.overflowMode) {
                return false;
            }
            if (this.tokenizedTextId != text.tokenizedTextId) {
                return false;
            }
            Label_0184: {
                if (this.alignmentMode != null) {
                    if (this.alignmentMode.equals(text.alignmentMode)) {
                        break Label_0184;
                    }
                }
                else if (text.alignmentMode == null) {
                    break Label_0184;
                }
                return false;
            }
            if (this.mFontName != null) {
                if (this.mFontName.equals(text.mFontName)) {
                    return true;
                }
            }
            else if (text.mFontName == null) {
                return true;
            }
            return false;
        }
        return true;
    }
    
    @Override
    public int hashCode() {
        int n = 1;
        final int n2 = 31 * (31 * super.hashCode() + this.tokenizedTextId);
        int floatToIntBits;
        if (this.fontSize != 0.0f) {
            floatToIntBits = Float.floatToIntBits(this.fontSize);
        }
        else {
            floatToIntBits = 0;
        }
        final int n3 = 31 * (31 * (31 * (31 * (floatToIntBits + n2) + this.color) + this.maxLines) + this.overflowMode);
        int floatToIntBits2;
        if (this.lineHeight != 0.0f) {
            floatToIntBits2 = Float.floatToIntBits(this.lineHeight);
        }
        else {
            floatToIntBits2 = 0;
        }
        final int n4 = 31 * (floatToIntBits2 + n3);
        int n5;
        if (this.fontBold) {
            n5 = n;
        }
        else {
            n5 = 0;
        }
        final int n6 = 31 * (n5 + n4);
        int n7;
        if (this.fontUnderline) {
            n7 = n;
        }
        else {
            n7 = 0;
        }
        final int n8 = 31 * (n7 + n6);
        if (!this.fontItalic) {
            n = 0;
        }
        final int n9 = 31 * (n8 + n);
        int hashCode;
        if (this.alignmentMode != null) {
            hashCode = this.alignmentMode.hashCode();
        }
        else {
            hashCode = 0;
        }
        final int n10 = 31 * (hashCode + n9);
        final String mFontName = this.mFontName;
        int hashCode2 = 0;
        if (mFontName != null) {
            hashCode2 = this.mFontName.hashCode();
        }
        return n10 + hashCode2;
    }
    
    @Override
    public boolean onDown(final MotionEvent motionEvent) {
        return this.b(2) || super.onDown(motionEvent);
    }
    
    @Override
    public void onLongPress(final MotionEvent motionEvent) {
        if (!this.b(5)) {
            super.onLongPress(motionEvent);
        }
    }
    
    @Override
    public void onShowPress(final MotionEvent motionEvent) {
    }
    
    @Override
    public boolean onSingleTapUp(final MotionEvent motionEvent) {
        return this.b(4) || super.onSingleTapUp(motionEvent);
    }
    
    @Override
    public boolean onTouch(final View view, final MotionEvent motionEvent) {
        if (this.mHasActionSpans) {
            this.mTouchedActionSpan = this.a(view, motionEvent);
            if ((0xFF & motionEvent.getAction()) == 0x1) {
                this.b(3);
            }
        }
        return super.onTouch(view, motionEvent);
    }
    
    @Override
    protected void q() {
        super.q();
        this.mComputedStyle.fontName = this.mFontName;
        this.mComputedStyle.fontSize = this.fontSize;
        this.mComputedStyle.color = this.color;
        this.mComputedStyle.lineHeight = this.lineHeight;
        this.mComputedStyle.fontBold = this.fontBold;
        this.mComputedStyle.fontUnderline = this.fontUnderline;
        this.mComputedStyle.fontItalic = this.fontItalic;
    }
    
    @Override
    public void readExternal(final ObjectInput objectInput) {
        super.readExternal(objectInput);
        this.tokenizedTextId = objectInput.readInt();
        this.fontSize = objectInput.readFloat();
        this.color = objectInput.readInt();
        this.maxLines = objectInput.readInt();
        this.overflowMode = objectInput.readInt();
        this.lineHeight = objectInput.readFloat();
        this.fontBold = objectInput.readBoolean();
        this.fontUnderline = objectInput.readBoolean();
        this.fontItalic = objectInput.readBoolean();
        this.alignmentMode = (Vector2)objectInput.readObject();
        this.mFontName = (String)objectInput.readObject();
        this.mRawText = (String)objectInput.readObject();
    }
    
    @Override
    protected void s() {
        if (this.tokenizedTextId != 0) {
            this.b(this.mCard);
        }
        else {
            this.mCookedText.clear();
            if (!TextUtils.isEmpty((CharSequence)this.mRawText)) {
                this.mCookedText.append((CharSequence)this.mRawText);
            }
        }
    }
    
    @Override
    protected int t() {
        if (this.maxLines != 1 && this.sizeMode.y == 3 && (this.sizeMode.x != 3 || this.maxSizeMode.x != 5)) {
            return 3;
        }
        return 1;
    }
    
    @Override
    public void writeExternal(final ObjectOutput objectOutput) {
        super.writeExternal(objectOutput);
        objectOutput.writeInt(this.tokenizedTextId);
        objectOutput.writeFloat(this.fontSize);
        objectOutput.writeInt(this.color);
        objectOutput.writeInt(this.maxLines);
        objectOutput.writeInt(this.overflowMode);
        objectOutput.writeFloat(this.lineHeight);
        objectOutput.writeBoolean(this.fontBold);
        objectOutput.writeBoolean(this.fontUnderline);
        objectOutput.writeBoolean(this.fontItalic);
        objectOutput.writeObject(this.alignmentMode);
        objectOutput.writeObject(this.mFontName);
        objectOutput.writeObject(this.mRawText);
    }
}
