// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.model.timeline;

import com.twitter.util.l;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

public class SuggestsInfo implements Serializable
{
    private static final long serialVersionUID = -8370459931870227348L;
    public final String controllerData;
    public final String scribeComponent;
    public final String sourceData;
    public final String suggestionType;
    public final String typeId;
    
    private SuggestsInfo(final b b) {
        this.suggestionType = b.a;
        this.controllerData = b.b;
        this.sourceData = b.c;
        this.scribeComponent = b.d;
        this.typeId = b.e;
    }
    
    private void readObject(final ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Proxy required");
    }
    
    private Object writeReplace() {
        return new SuggestsInfo$SerializationProxy(this);
    }
    
    public boolean a(final SuggestsInfo suggestsInfo) {
        return this == suggestsInfo || (suggestsInfo != null && l.a(this.suggestionType, suggestsInfo.suggestionType) && l.a(this.controllerData, suggestsInfo.controllerData) && l.a(this.sourceData, suggestsInfo.sourceData) && l.a(this.scribeComponent, suggestsInfo.scribeComponent) && l.a(this.typeId, suggestsInfo.typeId));
    }
    
    @Override
    public boolean equals(final Object o) {
        return this == o || (o instanceof SuggestsInfo && this.a((SuggestsInfo)o));
    }
    
    @Override
    public int hashCode() {
        return 31 * (31 * (31 * (31 * l.a(this.suggestionType) + l.a(this.controllerData)) + l.a(this.sourceData)) + l.a(this.scribeComponent)) + l.a(this.typeId);
    }
}
