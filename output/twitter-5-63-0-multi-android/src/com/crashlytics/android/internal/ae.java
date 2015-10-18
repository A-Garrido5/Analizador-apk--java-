// 
// Decompiled by Procyon v0.5.30
// 

package com.crashlytics.android.internal;

import java.io.File;
import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.util.Iterator;
import java.util.Map;
import java.io.Closeable;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.io.IOException;
import java.net.URL;
import java.net.HttpURLConnection;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.io.OutputStream;
import java.nio.charset.CharsetEncoder;
import java.io.BufferedOutputStream;

public final class ae extends BufferedOutputStream
{
    private final CharsetEncoder a;
    
    public ae(final OutputStream outputStream, final String s, final int n) {
        super(outputStream, n);
        this.a = Charset.forName(c(s)).newEncoder();
    }
    
    public final ae a(final String s) {
        final ByteBuffer encode = this.a.encode(CharBuffer.wrap(s));
        super.write(encode.array(), 0, encode.limit());
        return this;
    }
}
