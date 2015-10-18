// 
// Decompiled by Procyon v0.5.30
// 

package com.googlecode.mp4parser.h264.model;

public class AspectRatio
{
    public static final AspectRatio Extended_SAR;
    private int value;
    
    static {
        Extended_SAR = new AspectRatio(255);
    }
    
    private AspectRatio(final int value) {
        this.value = value;
    }
    
    public static AspectRatio fromValue(final int n) {
        if (n == AspectRatio.Extended_SAR.value) {
            return AspectRatio.Extended_SAR;
        }
        return new AspectRatio(n);
    }
    
    public int getValue() {
        return this.value;
    }
}
