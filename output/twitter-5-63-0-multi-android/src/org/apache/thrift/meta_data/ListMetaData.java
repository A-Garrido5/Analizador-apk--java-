// 
// Decompiled by Procyon v0.5.30
// 

package org.apache.thrift.meta_data;

public class ListMetaData extends FieldValueMetaData
{
    public final FieldValueMetaData elemMetaData;
    
    public ListMetaData(final byte b, final FieldValueMetaData elemMetaData) {
        super(b);
        this.elemMetaData = elemMetaData;
    }
}
