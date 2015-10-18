// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.card.property;

import java.io.ObjectOutput;
import java.io.ObjectInput;
import com.twitter.library.card.Card;
import java.io.Externalizable;

public class LocalizedTokenizedText implements Externalizable
{
    private static final long serialVersionUID = -5800742765389373613L;
    public a tokenizedTexts;
    
    public String a(final Card card, final int n) {
        final TokenizedText tokenizedText = (TokenizedText)this.tokenizedTexts.get(n);
        if (tokenizedText == null) {
            return "";
        }
        final StringBuilder sb = new StringBuilder();
        for (final TextTokenGroup textTokenGroup : tokenizedText.textTokenGroups) {
            if (textTokenGroup.visible && textTokenGroup.textTokens != null) {
                for (final TextToken textToken : textTokenGroup.textTokens) {
                    if (textToken.text != null) {
                        sb.append(textToken.text);
                    }
                }
            }
        }
        return sb.toString();
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this != o) {
            if (!(o instanceof LocalizedTokenizedText)) {
                return false;
            }
            final LocalizedTokenizedText localizedTokenizedText = (LocalizedTokenizedText)o;
            if (this.tokenizedTexts != null) {
                if (this.tokenizedTexts.equals(localizedTokenizedText.tokenizedTexts)) {
                    return true;
                }
            }
            else if (localizedTokenizedText.tokenizedTexts == null) {
                return true;
            }
            return false;
        }
        return true;
    }
    
    @Override
    public int hashCode() {
        if (this.tokenizedTexts != null) {
            return this.tokenizedTexts.hashCode();
        }
        return 0;
    }
    
    @Override
    public void readExternal(final ObjectInput objectInput) {
        this.tokenizedTexts = a.a(TokenizedText.class, objectInput);
    }
    
    @Override
    public void writeExternal(final ObjectOutput objectOutput) {
        a.a(this.tokenizedTexts, objectOutput);
    }
}
