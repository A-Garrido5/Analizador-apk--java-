// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.util.text;

import java.util.regex.Pattern;

public class d
{
    public static final Pattern a;
    public static final Pattern b;
    public static final Pattern c;
    public static final Pattern d;
    public static final Pattern e;
    
    static {
        a = Pattern.compile("\\w{1,15}");
        b = Pattern.compile("@?" + com.twitter.library.util.text.d.a);
        c = Pattern.compile("@" + com.twitter.library.util.text.d.a);
        d = Pattern.compile("^\\d{7,}$");
        e = Pattern.compile("^https?://twitter\\.com(/#!)?/\\w+/status/\\d+$");
    }
}
