// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.gdrive;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Comparator;

final class j implements Comparator
{
    private static final Pattern a;
    private static final Pattern b;
    
    static {
        String s = "\rR6sv\u007f\u001cBKNG$zsv\u007f\u001cBK;\rR";
        int n = -1;
        String intern = null;
    Label_0160:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n2 = 0; i > n2; ++n2) {
                final char c = charArray[n2];
                char c2 = '\0';
                switch (n2 % 5) {
                    default: {
                        c2 = '\u0012';
                        break;
                    }
                    case 0: {
                        c2 = '#';
                        break;
                    }
                    case 1: {
                        c2 = 'x';
                        break;
                    }
                    case 2: {
                        c2 = '\u001e';
                        break;
                    }
                    case 3: {
                        c2 = '/';
                        break;
                    }
                }
                charArray[n2] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    a = Pattern.compile(intern);
                    s = "t96sv\u007f\u001cBKNGQ";
                    n = 0;
                    continue;
                }
                case 0: {
                    break Label_0160;
                }
            }
        }
        b = Pattern.compile(intern);
    }
    
    public int a(final String s, final String s2) {
        final Matcher matcher = j.a.matcher(s);
        final Matcher matcher2 = j.a.matcher(s2);
        int n;
        if (matcher.find()) {
            n = Integer.parseInt(matcher.group(1));
        }
        else {
            n = 0;
        }
        int int1;
        if (matcher2.find()) {
            int1 = Integer.parseInt(matcher2.group(1));
        }
        else {
            int1 = 0;
        }
        int int2;
        if (n == int1) {
            final Matcher matcher3 = j.b.matcher(s);
            final Matcher matcher4 = j.b.matcher(s2);
            if (matcher3.find()) {
                n = Integer.parseInt(matcher3.group(1));
            }
            else {
                n = 0;
            }
            final boolean find = matcher4.find();
            int2 = 0;
            if (find) {
                int2 = Integer.parseInt(matcher4.group(1));
            }
        }
        else {
            int2 = int1;
        }
        return -1 * (n - int2);
    }
    
    @Override
    public int compare(final Object o, final Object o2) {
        return this.a((String)o, (String)o2);
    }
}
