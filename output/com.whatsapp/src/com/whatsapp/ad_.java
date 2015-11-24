// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.text.SpannableString;
import android.text.Spannable;
import android.text.GetChars;

public final class ad_ implements CharSequence, GetChars, Spannable
{
    private SpannableString a;
    
    public ad_(final CharSequence charSequence) {
        this.a = new SpannableString(charSequence);
    }
    
    @Override
    public char charAt(final int n) {
        if (n >= 0 && n < this.length()) {
            return this.a.charAt(n);
        }
        return ' ';
    }
    
    public void getChars(final int n, final int n2, final char[] array, final int n3) {
        if (n2 >= n) {
            final int length = this.length();
            if (n <= length && n2 <= length && n >= 0 && n2 >= 0) {
                this.a.getChars(n, n2, array, n3);
            }
        }
    }
    
    public int getSpanEnd(final Object o) {
        return this.a.getSpanEnd(o);
    }
    
    public int getSpanFlags(final Object o) {
        return this.a.getSpanFlags(o);
    }
    
    public int getSpanStart(final Object o) {
        return this.a.getSpanStart(o);
    }
    
    public Object[] getSpans(final int n, final int n2, final Class clazz) {
        return this.a.getSpans(n, n2, clazz);
    }
    
    @Override
    public int length() {
        return this.a.length();
    }
    
    public int nextSpanTransition(final int n, final int n2, final Class clazz) {
        return this.a.nextSpanTransition(n, n2, clazz);
    }
    
    public void removeSpan(final Object o) {
        this.a.removeSpan(o);
    }
    
    public void setSpan(final Object o, final int n, final int n2, final int n3) {
        this.a.setSpan(o, n, n2, n3);
    }
    
    @Override
    public CharSequence subSequence(final int n, final int n2) {
        return this.a.subSequence(n, n2);
    }
    
    @Override
    public final String toString() {
        return this.a.toString();
    }
}
