// 
// Decompiled by Procyon v0.5.30
// 

package org.apache.thrift.meta_data;

public class MapMetaData extends FieldValueMetaData
{
    public final FieldValueMetaData keyMetaData;
    public final FieldValueMetaData valueMetaData;
    
    public MapMetaData(final byte b, final FieldValueMetaData keyMetaData, final FieldValueMetaData valueMetaData) {
        super(b);
        this.keyMetaData = keyMetaData;
        this.valueMetaData = valueMetaData;
    }
}
