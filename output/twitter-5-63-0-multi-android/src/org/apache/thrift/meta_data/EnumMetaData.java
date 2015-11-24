// 
// Decompiled by Procyon v0.5.30
// 

package org.apache.thrift.meta_data;

public class EnumMetaData extends FieldValueMetaData
{
    public final Class enumClass;
    
    public EnumMetaData(final byte b, final Class enumClass) {
        super(b);
        this.enumClass = enumClass;
    }
}
