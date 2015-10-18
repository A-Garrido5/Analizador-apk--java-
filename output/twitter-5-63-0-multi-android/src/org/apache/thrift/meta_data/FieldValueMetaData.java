// 
// Decompiled by Procyon v0.5.30
// 

package org.apache.thrift.meta_data;

import java.io.Serializable;

public class FieldValueMetaData implements Serializable
{
    private final boolean isBinary;
    private final boolean isTypedefType;
    public final byte type;
    private final String typedefName;
    
    public FieldValueMetaData(final byte b) {
        this(b, false);
    }
    
    public FieldValueMetaData(final byte type, final boolean isBinary) {
        this.type = type;
        this.isTypedefType = false;
        this.typedefName = null;
        this.isBinary = isBinary;
    }
}
