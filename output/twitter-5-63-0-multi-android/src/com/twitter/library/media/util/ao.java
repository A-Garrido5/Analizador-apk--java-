// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.media.util;

import android.media.MediaFormat;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.ByteArrayOutputStream;

public class ao
{
    public static String b(final Exception ex) {
        if (ex == null) {
            return "";
        }
        final ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        final PrintWriter printWriter = new PrintWriter(byteArrayOutputStream);
        try {
            ex.printStackTrace(printWriter);
            printWriter.flush();
            return new String(byteArrayOutputStream.toByteArray());
        }
        finally {
            printWriter.close();
        }
    }
    
    public ao a(final int n, final int n2) {
        return this;
    }
    
    public ao a(final Exception ex) {
        return this;
    }
    
    public ao a(final String s) {
        return this;
    }
    
    public ao a(final String s, final String s2, final MediaFormat mediaFormat) {
        return this;
    }
    
    public ao b(final String s) {
        return this;
    }
}
