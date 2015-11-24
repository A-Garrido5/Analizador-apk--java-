// 
// Decompiled by Procyon v0.5.30
// 

package org.whispersystems.jobqueue;

import java.io.IOException;
import java.io.Writer;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ByteArrayInputStream;
import java.io.OutputStream;
import java.io.ObjectOutputStream;
import java.io.ByteArrayOutputStream;

public class r implements d
{
    @Override
    public String a(final a a) {
        final ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        new ObjectOutputStream(byteArrayOutputStream).writeObject(a);
        return f.a(byteArrayOutputStream.toByteArray(), 2);
    }
    
    @Override
    public a a(final o o, final boolean b, final String s) {
        try {
            return (a)new ObjectInputStream(new ByteArrayInputStream(f.a(s, 2))).readObject();
        }
        catch (ClassNotFoundException ex) {
            final StringWriter stringWriter = new StringWriter();
            ex.printStackTrace(new PrintWriter(stringWriter));
            throw new IOException(ex.getMessage() + "\n" + stringWriter.toString());
        }
    }
}
