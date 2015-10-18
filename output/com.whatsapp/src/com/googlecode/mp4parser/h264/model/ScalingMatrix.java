// 
// Decompiled by Procyon v0.5.30
// 

package com.googlecode.mp4parser.h264.model;

import java.util.Arrays;

public class ScalingMatrix
{
    public ScalingList[] ScalingList4x4;
    public ScalingList[] ScalingList8x8;
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ScalingMatrix{ScalingList4x4=");
        Object list;
        if (this.ScalingList4x4 == null) {
            list = null;
        }
        else {
            list = Arrays.asList(this.ScalingList4x4);
        }
        final StringBuilder append = sb.append(list).append("\n").append(", ScalingList8x8=");
        final ScalingList[] scalingList8x8 = this.ScalingList8x8;
        Object list2 = null;
        if (scalingList8x8 != null) {
            list2 = Arrays.asList(this.ScalingList8x8);
        }
        return append.append(list2).append("\n").append('}').toString();
    }
}
