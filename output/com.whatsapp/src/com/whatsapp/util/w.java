// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.util;

import java.io.Reader;
import java.io.InputStream;
import android.view.InflateException;
import org.xmlpull.v1.XmlPullParserException;
import android.widget.TextView;
import android.util.AttributeSet;
import android.view.View;
import android.view.LayoutInflater;
import org.xmlpull.v1.XmlPullParser;

final class w implements XmlPullParser
{
    private static final String z;
    final LayoutInflater a;
    final View[] b;
    final AttributeSet c;
    final String d;
    
    static {
        final char[] charArray = "\u001e\u0017Vl".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = '@';
                    break;
                }
                case 0: {
                    c2 = '{';
                    break;
                }
                case 1: {
                    c2 = 'o';
                    break;
                }
                case 2: {
                    c2 = '?';
                    break;
                }
                case 3: {
                    c2 = '\u0018';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z = new String(charArray).intern();
    }
    
    w(final View[] b, final LayoutInflater a, final String d, final AttributeSet c) {
        this.b = b;
        this.a = a;
        this.d = d;
        this.c = c;
    }
    
    public void defineEntityReplacementText(final String s, final String s2) {
    }
    
    public int getAttributeCount() {
        return 0;
    }
    
    public String getAttributeName(final int n) {
        return null;
    }
    
    public String getAttributeNamespace(final int n) {
        return null;
    }
    
    public String getAttributePrefix(final int n) {
        return null;
    }
    
    public String getAttributeType(final int n) {
        return null;
    }
    
    public String getAttributeValue(final int n) {
        return null;
    }
    
    public String getAttributeValue(final String s, final String s2) {
        return null;
    }
    
    public int getColumnNumber() {
        return 0;
    }
    
    public int getDepth() {
        return 0;
    }
    
    public int getEventType() {
        return 0;
    }
    
    public boolean getFeature(final String s) {
        return false;
    }
    
    public String getInputEncoding() {
        return null;
    }
    
    public int getLineNumber() {
        return 0;
    }
    
    public String getName() {
        return null;
    }
    
    public String getNamespace() {
        return null;
    }
    
    public String getNamespace(final String s) {
        return null;
    }
    
    public int getNamespaceCount(final int n) {
        return 0;
    }
    
    public String getNamespacePrefix(final int n) {
        return null;
    }
    
    public String getNamespaceUri(final int n) {
        return null;
    }
    
    public String getPositionDescription() {
        return null;
    }
    
    public String getPrefix() {
        return null;
    }
    
    public Object getProperty(final String s) {
        return null;
    }
    
    public String getText() {
        return null;
    }
    
    public char[] getTextCharacters(final int[] array) {
        return null;
    }
    
    public boolean isAttributeDefault(final int n) {
        return false;
    }
    
    public boolean isEmptyElementTag() {
        return false;
    }
    
    public boolean isWhitespace() {
        return false;
    }
    
    public int next() {
        try {
            this.b[0] = this.a.createView(this.d, (String)null, this.c);
            throw new XmlPullParserException(w.z);
        }
        catch (ClassNotFoundException ex) {
            throw new XmlPullParserException(w.z);
        }
        catch (InflateException ex2) {
            throw new XmlPullParserException(w.z);
        }
    }
    
    public int nextTag() {
        return 0;
    }
    
    public String nextText() {
        return null;
    }
    
    public int nextToken() {
        return 0;
    }
    
    public void require(final int n, final String s, final String s2) {
    }
    
    public void setFeature(final String s, final boolean b) {
    }
    
    public void setInput(final InputStream inputStream, final String s) {
    }
    
    public void setInput(final Reader reader) {
    }
    
    public void setProperty(final String s, final Object o) {
    }
}
