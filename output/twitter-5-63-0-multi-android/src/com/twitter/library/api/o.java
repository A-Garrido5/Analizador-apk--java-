// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.api;

import android.net.Uri;

public class o
{
    private static final String[] a;
    private static String b;
    private String c;
    private String d;
    private Uri e;
    
    static {
        a = new String[] { "_mdpi", "_hdpi", "_xhdpi", "_xxhdpi" };
    }
    
    o(final String d, final Uri e, final String c) {
        this.d = d;
        this.e = e;
        this.c = c;
    }
    
    public Uri a(final int n) {
        final String string = this.e.toString();
        final int lastIndex = string.lastIndexOf(46);
        Uri parse;
        if (lastIndex == -1) {
            parse = null;
        }
        else {
            final String substring = string.substring(lastIndex, string.length());
            switch (n) {
                default: {
                    o.b = o.a[3];
                    break;
                }
                case 120:
                case 160: {
                    o.b = o.a[0];
                    break;
                }
                case 240: {
                    o.b = o.a[1];
                    break;
                }
                case 320: {
                    o.b = o.a[2];
                    break;
                }
            }
            parse = Uri.parse(string.substring(0, lastIndex) + o.b + substring);
            if (parse == null) {
                return this.e;
            }
        }
        return parse;
    }
    
    public String a() {
        return this.d;
    }
}
