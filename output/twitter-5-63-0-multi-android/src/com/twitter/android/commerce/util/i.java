// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.commerce.util;

import android.widget.TextView$BufferType;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;
import android.content.Context;
import android.text.SpannableString;

public class i
{
    public static SpannableString a(final SpannableString spannableString, final String s, final String s2, final Object o) {
        final int index = s.indexOf(s2);
        final int n = index + s2.length();
        if (index >= 0) {
            spannableString.setSpan(o, index, n, 18);
        }
        return spannableString;
    }
    
    public static CharSequence a(final Context context, final long n) {
        final String string = context.getString(2131296678);
        final String string2 = context.getString(2131296681);
        final String string3 = context.getString(2131296680);
        final String string4 = context.getString(2131296679, new Object[] { string, string2, string3 });
        final SpannableString spannableString = new SpannableString((CharSequence)string4);
        a(spannableString, string4, string, "https://support.twitter.com/articles/20171943");
        a(spannableString, string4, string2, String.format("https://twitter.com/i/commerce/marketplaces/%s/tos", n));
        a(spannableString, string4, string3, String.format("https://twitter.com/i/commerce/marketplaces/%s/privacy_policy", n));
        return (CharSequence)spannableString;
    }
    
    public static void a(final Context context, final int n, final TextView textView) {
        final String string = context.getString(2131296678);
        final String string2 = context.getString(2131296682);
        final String string3 = context.getString(n, new Object[] { string, string2 });
        final SpannableString spannableString = new SpannableString((CharSequence)string3);
        a(spannableString, string3, string, "https://support.twitter.com/articles/20171943");
        a(spannableString, string3, string2, "https://twitter.com/privacy");
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        textView.setText((CharSequence)spannableString, TextView$BufferType.SPANNABLE);
    }
    
    public static void a(final Context context, final long n, final TextView textView) {
        final CharSequence a = a(context, n);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        textView.setText(a, TextView$BufferType.SPANNABLE);
    }
    
    public static void a(final SpannableString spannableString, final String s, final String s2, final String s3) {
        for (int i = s.indexOf(s2); i >= 0; i = s.indexOf(s2, i + 1)) {
            spannableString.setSpan((Object)new WebViewURLSpan(s3), i, i + s2.length(), 0);
        }
    }
}
