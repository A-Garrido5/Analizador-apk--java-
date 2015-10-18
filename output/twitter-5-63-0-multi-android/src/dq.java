import android.text.Spanned;

// 
// Decompiled by Procyon v0.5.30
// 

public abstract class dq extends dr
{
    private final Class a;
    
    public dq(final Class a) {
        this.a = a;
    }
    
    public String c(final CharSequence charSequence, final int n) {
        final ds d = this.d(charSequence, n);
        String string;
        if (d != null) {
            string = charSequence.subSequence(d.a, d.b).toString();
        }
        else {
            string = "";
        }
        return string.trim();
    }
    
    @Override
    public ds d(final CharSequence charSequence, final int n) {
        if (n < 0) {
            return null;
        }
        if (!(charSequence instanceof Spanned)) {
            return new ds(0, charSequence.length());
        }
        final int length = charSequence.length();
        final Spanned spanned = (Spanned)charSequence;
        final Object[] spans = spanned.getSpans(0, spanned.length(), this.a);
        final int length2 = spans.length;
        int i = 0;
        int n2 = 0;
        int n3 = length;
        while (i < length2) {
            final Object o = spans[i];
            int spanStart = spanned.getSpanStart(o);
            final int spanEnd = spanned.getSpanEnd(o);
            if (spanStart < n && n < spanEnd) {
                return new ds(spanStart, spanEnd);
            }
            if (n2 < spanEnd && spanEnd <= n) {
                n2 = spanEnd;
            }
            if (n > spanStart || spanStart >= n3) {
                spanStart = n3;
            }
            ++i;
            n3 = spanStart;
        }
        int n4;
        if (n2 < spanned.length() && spanned.charAt(n2) == ' ' && n2 < n3) {
            n4 = n2 + 1;
        }
        else {
            n4 = n2;
        }
        return new ds(n4, n3);
    }
}
