// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.service;

import com.twitter.internal.network.l;
import java.io.Closeable;
import java.io.IOException;
import java.io.OutputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.File;
import com.twitter.internal.network.j;

public class o implements j
{
    private final File a;
    
    public o(final File a) {
        this.a = a;
    }
    
    @Override
    public void a(final int n, final InputStream inputStream, final int n2, final String s, final String s2) {
        final FileOutputStream fileOutputStream = new FileOutputStream(this.a);
        try {
            yh.a(inputStream, fileOutputStream, 4096);
            fileOutputStream.flush();
        }
        catch (IOException ex) {}
        finally {
            yh.a(fileOutputStream);
        }
    }
    
    @Override
    public void a(final l l) {
    }
}
