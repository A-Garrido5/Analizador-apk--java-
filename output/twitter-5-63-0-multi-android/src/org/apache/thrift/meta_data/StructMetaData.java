// 
// Decompiled by Procyon v0.5.30
// 

package org.apache.thrift.meta_data;

public class StructMetaData extends FieldValueMetaData
{
    public final Class structClass;
    
    public StructMetaData(final byte b, final Class structClass) {
        super(b);
        this.structClass = structClass;
    }
}
