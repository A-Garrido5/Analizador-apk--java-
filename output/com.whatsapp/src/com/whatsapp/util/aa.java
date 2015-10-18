// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.util;

import java.util.Iterator;
import java.text.BreakIterator;
import com.whatsapp.vy;
import java.util.List;
import android.text.SpannableStringBuilder;
import android.content.Context;

public abstract class aa
{
    private static final aa a;
    public static final aa b;
    
    static {
        a = new a0();
        b = new a2();
    }
    
    public static CharSequence a(final Context context, final SpannableStringBuilder spannableStringBuilder, final String s, final List list) {
        return a(context, spannableStringBuilder, s, list, aa.a);
    }
    
    public static CharSequence a(final Context context, final SpannableStringBuilder spannableStringBuilder, final String s, final List list, final aa aa) {
        final boolean l = Log.l;
        SpannableStringBuilder spannableStringBuilder2 = null;
        Label_0187: {
            if (list != null && !list.isEmpty()) {
                final String replaceAll = vy.j.matcher(s).replaceAll(" ");
                final BreakIterator a = by.a();
                a.setText(replaceAll);
                final int first = a.first();
                final int next = a.next();
                int n = first;
                int i = next;
                spannableStringBuilder2 = spannableStringBuilder;
            Label_0069:
                while (i != -1) {
                    final String h = vy.h(replaceAll.substring(n, i));
                    final Iterator<String> iterator = list.iterator();
                    SpannableStringBuilder spannableStringBuilder3 = spannableStringBuilder2;
                    while (true) {
                        while (iterator.hasNext()) {
                            final String s2 = iterator.next();
                            if (h.startsWith(s2)) {
                                if (spannableStringBuilder3 == null) {
                                    spannableStringBuilder3 = new SpannableStringBuilder((CharSequence)s);
                                }
                                aa.a(context, spannableStringBuilder3, n, n + s2.length());
                            }
                            spannableStringBuilder2 = spannableStringBuilder3;
                            if (l) {
                                final int next2 = a.next();
                                if (l) {
                                    break Label_0187;
                                }
                                n = i;
                                i = next2;
                                continue Label_0069;
                            }
                            else {
                                spannableStringBuilder3 = spannableStringBuilder2;
                            }
                        }
                        spannableStringBuilder2 = spannableStringBuilder3;
                        continue;
                    }
                }
            }
            else {
                spannableStringBuilder2 = spannableStringBuilder;
            }
        }
        if (spannableStringBuilder2 == null) {
            return s;
        }
        return (CharSequence)spannableStringBuilder2;
    }
    
    abstract void a(final Context p0, final SpannableStringBuilder p1, final int p2, final int p3);
}
