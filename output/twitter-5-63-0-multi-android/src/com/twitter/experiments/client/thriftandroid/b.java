// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.experiments.client.thriftandroid;

import com.twitter.common_header.thriftandroid.VersionedCommonHeader;

public class b
{
    private VersionedCommonHeader a;
    private String b;
    private Integer c;
    private String d;
    
    public DdgImpression a() {
        if (this.a == null) {
            throw new IllegalArgumentException("Required field 'commonHeader' was not present! Struct: " + this.toString());
        }
        if (this.b == null) {
            throw new IllegalArgumentException("Required field 'experiment' was not present! Struct: " + this.toString());
        }
        if (this.c == null) {
            throw new IllegalArgumentException("Required field 'version' was not present! Struct: " + this.toString());
        }
        if (this.d == null) {
            throw new IllegalArgumentException("Required field 'bucket' was not present! Struct: " + this.toString());
        }
        return new DdgImpression(this.a, this.b, this.c, this.d);
    }
    
    public b a(final DdgImpression$_Fields ddgImpression$_Fields, final Object o) {
        switch (com.twitter.experiments.client.thriftandroid.a.a[ddgImpression$_Fields.ordinal()]) {
            case 1: {
                if (o != null) {
                    this.a = (VersionedCommonHeader)o;
                    return this;
                }
                break;
            }
            case 2: {
                if (o != null) {
                    this.b = (String)o;
                    return this;
                }
                break;
            }
            case 3: {
                if (o != null) {
                    this.c = (Integer)o;
                    return this;
                }
                break;
            }
            case 4: {
                if (o != null) {
                    this.d = (String)o;
                    return this;
                }
                break;
            }
        }
        return this;
    }
}
