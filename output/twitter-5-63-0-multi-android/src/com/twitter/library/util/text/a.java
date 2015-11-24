// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.util.text;

import java.util.regex.Pattern;

public class a
{
    public static final Pattern a;
    public static final Pattern b;
    public static final Pattern c;
    
    static {
        a = Pattern.compile("\\b(([\\w-]+://?|www[.])[^\\s()<>]+(?:\\([\\w\\d]+\\)|([^[:punct:]\\s]|/)))");
        b = Pattern.compile("(\\s|\\n|\\r)");
        c = Pattern.compile("[a-zA-Z0-9\\+\\.\\_\\%\\-\\+]{1,256}\\@[a-zA-Z0-9][a-zA-Z0-9\\-]{0,64}(\\.[a-zA-Z0-9][a-zA-Z0-9\\-]{1,25})+");
    }
}
