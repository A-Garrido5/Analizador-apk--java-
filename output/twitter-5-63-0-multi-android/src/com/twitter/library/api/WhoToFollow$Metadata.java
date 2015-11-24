// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.api;

import com.twitter.util.l;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import com.twitter.util.k;
import java.util.Map;
import java.io.Serializable;

public class WhoToFollow$Metadata implements Serializable
{
    private static final long serialVersionUID = 142173749186713178L;
    public final String dismiss;
    public final String feedback;
    public final String header;
    public final EntityScribeContent moduleScribeContent;
    public final String no;
    public final String showMore;
    public final int type;
    public final Map userIdToSocialProofMap;
    public final Map userScribeContent;
    public final String yes;
    
    private WhoToFollow$Metadata(final cf cf) {
        this.type = cf.a;
        this.yes = cf.b;
        this.no = cf.c;
        this.dismiss = cf.d;
        this.feedback = cf.e;
        this.header = cf.f;
        this.showMore = cf.g;
        this.moduleScribeContent = cf.h;
        this.userIdToSocialProofMap = k.a(cf.i);
        this.userScribeContent = k.a(cf.j);
    }
    
    private void readObject(final ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Proxy required");
    }
    
    private Object writeReplace() {
        return new WhoToFollow$Metadata$SerializationProxy(this);
    }
    
    public boolean a(final WhoToFollow$Metadata whoToFollow$Metadata) {
        return this == whoToFollow$Metadata || (whoToFollow$Metadata != null && this.type == whoToFollow$Metadata.type && l.a(this.yes, whoToFollow$Metadata.yes) && l.a(this.no, whoToFollow$Metadata.no) && l.a(this.dismiss, whoToFollow$Metadata.dismiss) && l.a(this.feedback, whoToFollow$Metadata.feedback) && l.a(this.showMore, whoToFollow$Metadata.showMore) && l.a(this.header, whoToFollow$Metadata.header) && l.a(this.userIdToSocialProofMap, whoToFollow$Metadata.userIdToSocialProofMap));
    }
    
    @Override
    public boolean equals(final Object o) {
        return this == o || (o instanceof WhoToFollow$Metadata && this.a((WhoToFollow$Metadata)o));
    }
    
    @Override
    public int hashCode() {
        return 31 * (31 * (31 * (31 * (31 * (31 * (31 * this.type + l.a(this.yes)) + l.a(this.no)) + l.a(this.dismiss)) + l.a(this.feedback)) + l.a(this.showMore)) + l.a(this.header)) + l.a(this.userIdToSocialProofMap);
    }
}
