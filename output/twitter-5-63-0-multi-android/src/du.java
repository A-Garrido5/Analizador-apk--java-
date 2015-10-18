import android.text.Spannable;
import android.text.TextUtils;
import android.text.SpannableString;
import android.text.Spanned;
import java.util.Collection;
import java.util.HashSet;
import java.util.Arrays;
import java.util.Set;

// 
// Decompiled by Procyon v0.5.30
// 

public class du extends dr
{
    private static final Set a;
    
    static {
        a = new HashSet(Arrays.asList(' ', '\t', '\n', '.', '!', '?', ',', ':', ';', '\'', '\"', '`', '/', '\\', '-', '=', '+', '~', '$', '%', '^', '&', '*', '(', ')', '[', ']', '{', '}', '<', '>', '|'));
    }
    
    public dt a(final CharSequence charSequence, final int n) {
        final ds d = this.d(charSequence, n);
        if (d != null) {
            final String string = charSequence.subSequence(1 + d.a, d.b).toString();
            int n2;
            if (charSequence.charAt(d.a) == '@') {
                n2 = 1;
            }
            else {
                n2 = 2;
            }
            return new dt(string, n2);
        }
        return null;
    }
    
    @Override
    public CharSequence a(final CharSequence charSequence) {
        if (charSequence instanceof Spanned) {
            final SpannableString spannableString = new SpannableString((CharSequence)((Object)charSequence + " "));
            TextUtils.copySpansFrom((Spanned)charSequence, 0, charSequence.length(), (Class)Object.class, (Spannable)spannableString, 0);
            return (CharSequence)spannableString;
        }
        return (Object)charSequence + " ";
    }
    
    @Override
    public ds d(final CharSequence charSequence, int n) {
        int i = n - 1;
        while (true) {
            while (i >= 0) {
                final char char1 = charSequence.charAt(i);
                if (du.a.contains(char1)) {
                    i = -1;
                }
                else {
                    if (char1 != '@' && char1 != '#') {
                        --i;
                        continue;
                    }
                    if (i != 0 && !du.a.contains(charSequence.charAt(i - 1))) {
                        i = -1;
                    }
                }
                if (i >= 0) {
                    while (n < charSequence.length() && !du.a.contains(charSequence.charAt(n))) {
                        ++n;
                    }
                    return new ds(i, n);
                }
                return null;
            }
            i = -1;
            continue;
        }
    }
}
