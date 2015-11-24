// 
// Decompiled by Procyon v0.5.30
// 

package com.coremedia.iso;

import java.io.UnsupportedEncodingException;

public final class Utf8
{
    public static String convert(final byte[] array) {
        Label_0017: {
            if (array == null) {
                break Label_0017;
            }
            try {
                return new String(array, "UTF-8");
                return null;
            }
            catch (UnsupportedEncodingException ex) {
                throw new Error(ex);
            }
        }
    }
    
    public static byte[] convert(final String s) {
        Label_0013: {
            if (s == null) {
                break Label_0013;
            }
            try {
                return s.getBytes("UTF-8");
                return null;
            }
            catch (UnsupportedEncodingException ex) {
                throw new Error(ex);
            }
        }
    }
    
    public static int utf8StringLengthInBytes(final String s) {
        if (s == null) {
            return 0;
        }
        try {
            return s.getBytes("UTF-8").length;
        }
        catch (UnsupportedEncodingException ex) {
            throw new RuntimeException();
        }
    }
}
