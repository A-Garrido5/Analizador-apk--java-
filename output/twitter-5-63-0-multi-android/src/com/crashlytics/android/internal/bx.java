// 
// Decompiled by Procyon v0.5.30
// 

package com.crashlytics.android.internal;

import java.io.File;
import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.util.Iterator;
import java.util.Map;
import java.net.MalformedURLException;
import java.io.IOException;
import java.net.URL;
import java.net.HttpURLConnection;
import java.io.Closeable;
import java.io.OutputStream;
import java.io.InputStream;

final class bx extends z
{
    private /* synthetic */ InputStream a;
    private /* synthetic */ OutputStream b;
    private /* synthetic */ bw c;
    
    bx(final bw c, final Closeable closeable, final boolean b, final InputStream a, final OutputStream b2) {
        this.c = c;
        this.a = a;
        this.b = b2;
        super(closeable, b);
    }
}
