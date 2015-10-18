// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.util;

import java.io.IOException;

public class NullUserException extends IOException
{
    public final long statusId;
    
    public NullUserException(final long statusId) {
        super("User object invalid for statusId " + statusId);
        this.statusId = statusId;
    }
}
