// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

class ah7
{
    String a;
    String b;
    
    ah7(final String b, final String a) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this != o) {
            if (o == null) {
                return false;
            }
            if (!(o instanceof ah7)) {
                return false;
            }
            final ah7 ah7 = (ah7)o;
            if (this.b == null) {
                if (ah7.b != null) {
                    return false;
                }
            }
            else if (!this.b.equals(ah7.b)) {
                return false;
            }
            if (this.a == null) {
                if (ah7.a != null) {
                    return false;
                }
            }
            else if (!this.a.equals(ah7.a)) {
                return false;
            }
        }
        return true;
    }
    
    @Override
    public int hashCode() {
        int hashCode;
        if (this.b == null) {
            hashCode = 0;
        }
        else {
            hashCode = this.b.hashCode();
        }
        final int n = 31 * (hashCode + 31);
        final String a = this.a;
        int hashCode2 = 0;
        if (a != null) {
            hashCode2 = this.a.hashCode();
        }
        return n + hashCode2;
    }
}
