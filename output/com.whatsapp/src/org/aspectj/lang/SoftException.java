// 
// Decompiled by Procyon v0.5.30
// 

package org.aspectj.lang;

import java.io.PrintWriter;
import java.io.PrintStream;

public class SoftException extends RuntimeException
{
    private static final boolean HAVE_JAVA_14;
    Throwable inner;
    
    static {
        while (true) {
            try {
                Class.forName("java.nio.Buffer");
                final boolean have_JAVA_14 = true;
                HAVE_JAVA_14 = have_JAVA_14;
            }
            catch (Throwable t) {
                final boolean have_JAVA_14 = false;
                continue;
            }
            break;
        }
    }
    
    public SoftException(final Throwable inner) {
        this.inner = inner;
    }
    
    @Override
    public Throwable getCause() {
        return this.inner;
    }
    
    public Throwable getWrappedThrowable() {
        return this.inner;
    }
    
    @Override
    public void printStackTrace() {
        this.printStackTrace(System.err);
    }
    
    @Override
    public void printStackTrace(final PrintStream printStream) {
        super.printStackTrace(printStream);
        final Throwable inner = this.inner;
        if (!SoftException.HAVE_JAVA_14 && inner != null) {
            printStream.print("Caused by: ");
            inner.printStackTrace(printStream);
        }
    }
    
    @Override
    public void printStackTrace(final PrintWriter printWriter) {
        super.printStackTrace(printWriter);
        final Throwable inner = this.inner;
        if (!SoftException.HAVE_JAVA_14 && inner != null) {
            printWriter.print("Caused by: ");
            inner.printStackTrace(printWriter);
        }
    }
}
