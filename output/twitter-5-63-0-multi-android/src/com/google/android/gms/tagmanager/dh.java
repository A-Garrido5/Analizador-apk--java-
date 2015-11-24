// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.tagmanager;

class dh extends Number implements Comparable
{
    private double atZ;
    private long aua;
    private boolean aub;
    
    private dh(final long aua) {
        this.aua = aua;
        this.aub = true;
    }
    
    public static dh a(final long n) {
        return new dh(n);
    }
    
    public int a(final dh dh) {
        if (this.b() && dh.b()) {
            return new Long(this.aua).compareTo(Long.valueOf(dh.aua));
        }
        return Double.compare(this.doubleValue(), dh.doubleValue());
    }
    
    public boolean a() {
        return !this.b();
    }
    
    public boolean b() {
        return this.aub;
    }
    
    @Override
    public byte byteValue() {
        return (byte)this.longValue();
    }
    
    public long c() {
        if (this.b()) {
            return this.aua;
        }
        return (long)this.atZ;
    }
    
    public int d() {
        return (int)this.longValue();
    }
    
    @Override
    public double doubleValue() {
        if (this.b()) {
            return this.aua;
        }
        return this.atZ;
    }
    
    public short e() {
        return (short)this.longValue();
    }
    
    @Override
    public boolean equals(final Object o) {
        return o instanceof dh && this.a((dh)o) == 0;
    }
    
    @Override
    public float floatValue() {
        return (float)this.doubleValue();
    }
    
    @Override
    public int hashCode() {
        return new Long(this.longValue()).hashCode();
    }
    
    @Override
    public int intValue() {
        return this.d();
    }
    
    @Override
    public long longValue() {
        return this.c();
    }
    
    @Override
    public short shortValue() {
        return this.e();
    }
    
    @Override
    public String toString() {
        if (this.b()) {
            return Long.toString(this.aua);
        }
        return Double.toString(this.atZ);
    }
}
