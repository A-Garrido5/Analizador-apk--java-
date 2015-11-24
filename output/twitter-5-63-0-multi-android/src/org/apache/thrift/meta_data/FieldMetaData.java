// 
// Decompiled by Procyon v0.5.30
// 

package org.apache.thrift.meta_data;

import java.util.HashMap;
import java.util.Map;
import java.io.Serializable;

public class FieldMetaData implements Serializable
{
    private static Map a;
    public final String fieldName;
    public final byte requirementType;
    public final FieldValueMetaData valueMetaData;
    
    static {
        FieldMetaData.a = new HashMap();
    }
    
    public FieldMetaData(final String fieldName, final byte requirementType, final FieldValueMetaData valueMetaData) {
        this.fieldName = fieldName;
        this.requirementType = requirementType;
        this.valueMetaData = valueMetaData;
    }
    
    public static void a(final Class clazz, final Map map) {
        FieldMetaData.a.put(clazz, map);
    }
}
