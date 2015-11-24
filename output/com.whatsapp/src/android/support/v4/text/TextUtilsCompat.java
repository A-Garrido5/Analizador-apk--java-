// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v4.text;

import android.support.annotation.Nullable;
import java.util.Locale;

public class TextUtilsCompat
{
    private static String ARAB_SCRIPT_SUBTAG;
    private static String HEBR_SCRIPT_SUBTAG;
    public static final Locale ROOT;
    
    static {
        ROOT = new Locale("", "");
        String s = "j\u0000D*";
        int n = -1;
        String intern = null;
    Label_0168:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n2 = 0; i > n2; ++n2) {
                final char c = charArray[n2];
                char c2 = '\0';
                switch (n2 % 5) {
                    default: {
                        c2 = '\u0018';
                        break;
                    }
                    case 0: {
                        c2 = '+';
                        break;
                    }
                    case 1: {
                        c2 = 'r';
                        break;
                    }
                    case 2: {
                        c2 = '%';
                        break;
                    }
                    case 3: {
                        c2 = 'H';
                        break;
                    }
                }
                charArray[n2] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    TextUtilsCompat.ARAB_SCRIPT_SUBTAG = intern;
                    s = "c\u0017G:";
                    n = 0;
                    continue;
                }
                case 0: {
                    break Label_0168;
                }
            }
        }
        TextUtilsCompat.HEBR_SCRIPT_SUBTAG = intern;
    }
    
    private static int getLayoutDirectionFromFirstChar(final Locale locale) {
        switch (Character.getDirectionality(locale.getDisplayName(locale).charAt(0))) {
            default: {
                return 0;
            }
            case 1:
            case 2: {
                return 1;
            }
        }
    }
    
    public static int getLayoutDirectionFromLocale(@Nullable final Locale locale) {
        if (locale != null && !locale.equals(TextUtilsCompat.ROOT)) {
            final String script = ICUCompat.getScript(ICUCompat.addLikelySubtags(locale.toString()));
            if (script == null) {
                return getLayoutDirectionFromFirstChar(locale);
            }
            if (script.equalsIgnoreCase(TextUtilsCompat.ARAB_SCRIPT_SUBTAG) || script.equalsIgnoreCase(TextUtilsCompat.HEBR_SCRIPT_SUBTAG)) {
                return 1;
            }
        }
        return 0;
    }
}
