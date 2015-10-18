// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.internal;

import java.util.regex.Matcher;
import android.text.TextUtils;
import java.util.regex.Pattern;

public final class bh
{
    private static final Pattern a;
    private static final Pattern b;
    
    static {
        a = Pattern.compile("\\\\.");
        b = Pattern.compile("[\\\\\"/\b\f\n\r\t]");
    }
    
    public static String a(final String s) {
        if (!TextUtils.isEmpty((CharSequence)s)) {
            final Matcher matcher = bh.b.matcher(s);
            StringBuffer sb = null;
            while (matcher.find()) {
                if (sb == null) {
                    sb = new StringBuffer();
                }
                switch (matcher.group().charAt(0)) {
                    default: {
                        continue;
                    }
                    case '\b': {
                        matcher.appendReplacement(sb, "\\\\b");
                        continue;
                    }
                    case '\"': {
                        matcher.appendReplacement(sb, "\\\\\\\"");
                        continue;
                    }
                    case '\\': {
                        matcher.appendReplacement(sb, "\\\\\\\\");
                        continue;
                    }
                    case '/': {
                        matcher.appendReplacement(sb, "\\\\/");
                        continue;
                    }
                    case '\f': {
                        matcher.appendReplacement(sb, "\\\\f");
                        continue;
                    }
                    case '\n': {
                        matcher.appendReplacement(sb, "\\\\n");
                        continue;
                    }
                    case '\r': {
                        matcher.appendReplacement(sb, "\\\\r");
                        continue;
                    }
                    case '\t': {
                        matcher.appendReplacement(sb, "\\\\t");
                        continue;
                    }
                }
            }
            if (sb != null) {
                matcher.appendTail(sb);
                return sb.toString();
            }
        }
        return s;
    }
}
