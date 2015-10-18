// 
// Decompiled by Procyon v0.5.30
// 

package com.googlecode.mp4parser.h264.model;

import com.googlecode.mp4parser.h264.write.CAVLCWriter;
import java.io.IOException;
import com.googlecode.mp4parser.h264.read.CAVLCReader;

public class ScalingList
{
    public int[] scalingList;
    public boolean useDefaultScalingMatrixFlag;
    
    public static ScalingList read(final CAVLCReader cavlcReader, final int n) throws IOException {
        final ScalingList list = new ScalingList();
        list.scalingList = new int[n];
        int n2 = 8;
        int n3 = 8;
        for (int i = 0; i < n; ++i) {
            if (n3 != 0) {
                n3 = (256 + (n2 + cavlcReader.readSE("deltaScale"))) % 256;
                list.useDefaultScalingMatrixFlag = (i == 0 && n3 == 0);
            }
            final int[] scalingList = list.scalingList;
            if (n3 != 0) {
                n2 = n3;
            }
            scalingList[i] = n2;
            n2 = list.scalingList[i];
        }
        return list;
    }
    
    @Override
    public String toString() {
        return "ScalingList{scalingList=" + this.scalingList + ", useDefaultScalingMatrixFlag=" + this.useDefaultScalingMatrixFlag + '}';
    }
    
    public void write(final CAVLCWriter cavlcWriter) throws IOException {
        if (this.useDefaultScalingMatrixFlag) {
            cavlcWriter.writeSE(0, "SPS: ");
        }
        else {
            int n = 8;
            for (int i = 0; i < this.scalingList.length; ++i) {
                if (8 != 0) {
                    cavlcWriter.writeSE(-256 + (this.scalingList[i] - n), "SPS: ");
                }
                n = this.scalingList[i];
            }
        }
    }
}
