// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.util;

import android.text.TextUtils;
import android.text.SpannableStringBuilder;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;

public class t
{
    private static final String z;
    
    static {
        final char[] charArray = "e\n".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = 'r';
                    break;
                }
                case 0: {
                    c2 = '@';
                    break;
                }
                case 1: {
                    c2 = 'y';
                    break;
                }
                case 2: {
                    c2 = 'V';
                    break;
                }
                case 3: {
                    c2 = '\u007f';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z = new String(charArray).intern();
    }
    
    public static CharSequence a(final CharSequence charSequence, final Drawable drawable, final Paint paint) {
        return a(charSequence, drawable, paint, t.z);
    }
    
    public static CharSequence a(final CharSequence charSequence, final Drawable drawable, final Paint paint, final int n, final int n2) {
        final SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
        final int n3 = (int)paint.getTextSize();
        drawable.setBounds(0, 0, n3 * drawable.getIntrinsicWidth() / drawable.getIntrinsicHeight(), n3);
        spannableStringBuilder.setSpan((Object)new az(drawable), n, n2, 33);
        return (CharSequence)spannableStringBuilder;
    }
    
    public static CharSequence a(final CharSequence charSequence, final Drawable drawable, final Paint paint, final String s) {
        final int index = TextUtils.indexOf(charSequence, (CharSequence)s);
        return a(charSequence, drawable, paint, index, index + s.length());
    }
}
