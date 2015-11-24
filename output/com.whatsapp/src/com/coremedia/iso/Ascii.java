// 
// Decompiled by Procyon v0.5.30
// 

package com.coremedia.iso;

import java.io.UnsupportedEncodingException;

public final class Ascii
{
    public static String convert(final byte[] array) {
        Label_0017: {
            if (array == null) {
                break Label_0017;
            }
            try {
                return new String(array, "us-ascii");
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
                return s.getBytes("us-ascii");
                return null;
            }
            catch (UnsupportedEncodingException ex) {
                throw new Error(ex);
            }
        }
    }
}
