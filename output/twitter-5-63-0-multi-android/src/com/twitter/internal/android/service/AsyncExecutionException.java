// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.internal.android.service;

public class AsyncExecutionException extends RuntimeException
{
    AsyncExecutionException(final Exception ex) {
        this.initCause(ex);
    }
}
