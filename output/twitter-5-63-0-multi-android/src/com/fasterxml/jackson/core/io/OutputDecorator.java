// 
// Decompiled by Procyon v0.5.30
// 

package com.fasterxml.jackson.core.io;

import java.io.Writer;
import java.io.OutputStream;
import java.io.Serializable;

public abstract class OutputDecorator implements Serializable
{
    public abstract OutputStream a(final b p0, final OutputStream p1);
    
    public abstract Writer a(final b p0, final Writer p1);
}
