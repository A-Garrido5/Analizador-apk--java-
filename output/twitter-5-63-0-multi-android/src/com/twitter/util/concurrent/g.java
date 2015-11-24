// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.util.concurrent;

import java.util.concurrent.CancellationException;
import com.twitter.util.e;
import java.util.concurrent.Future;
import java.util.concurrent.ExecutionException;

public class g
{
    private static Exception a(final ExecutionException ex) {
        final Throwable cause = ex.getCause();
        if (cause instanceof Exception) {
            return (Exception)cause;
        }
        throw new IllegalStateException("Future has a throwable that does not extend Exception", cause);
    }
    
    public static Object a(final Future future) {
        e.c();
        try {
            return future.get();
        }
        catch (ExecutionException ex) {
            throw a(ex);
        }
        catch (CancellationException ex2) {
            return null;
        }
    }
}
