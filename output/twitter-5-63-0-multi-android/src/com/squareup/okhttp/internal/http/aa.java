// 
// Decompiled by Procyon v0.5.30
// 

package com.squareup.okhttp.internal.http;

public class aa
{
    private final String a;
    private final String b;
    private final int c;
    
    public aa(final String a, final String b, final int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public String a() {
        return this.b;
    }
    
    public int b() {
        return this.c;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this != o) {
            if (o == null || this.getClass() != o.getClass()) {
                return false;
            }
            final aa aa = (aa)o;
            if (this.c != aa.c) {
                return false;
            }
            Label_0072: {
                if (this.b != null) {
                    if (this.b.equals(aa.b)) {
                        break Label_0072;
                    }
                }
                else if (aa.b == null) {
                    break Label_0072;
                }
                return false;
            }
            if (this.a != null) {
                if (this.a.equals(aa.a)) {
                    return true;
                }
            }
            else if (aa.a == null) {
                return true;
            }
            return false;
        }
        return true;
    }
    
    @Override
    public int hashCode() {
        int hashCode;
        if (this.a != null) {
            hashCode = this.a.hashCode();
        }
        else {
            hashCode = 0;
        }
        final int n = hashCode * 31;
        final String b = this.b;
        int hashCode2 = 0;
        if (b != null) {
            hashCode2 = this.b.hashCode();
        }
        return 31 * (n + hashCode2) + this.c;
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(this.getClass().getName()).append("[");
        sb.append("scheme = ").append(this.a).append("  ");
        sb.append("hostname = ").append(this.b).append("  ");
        sb.append("port = ").append(this.c);
        sb.append("]");
        return sb.toString();
    }
}
