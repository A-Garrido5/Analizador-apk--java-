// 
// Decompiled by Procyon v0.5.30
// 

package com.googlecode.mp4parser.h264.model;

public class ChromaFormat
{
    public static ChromaFormat MONOCHROME;
    public static ChromaFormat YUV_420;
    public static ChromaFormat YUV_422;
    public static ChromaFormat YUV_444;
    private int id;
    private int subHeight;
    private int subWidth;
    
    static {
        ChromaFormat.MONOCHROME = new ChromaFormat(0, 0, 0);
        ChromaFormat.YUV_420 = new ChromaFormat(1, 2, 2);
        ChromaFormat.YUV_422 = new ChromaFormat(2, 2, 1);
        ChromaFormat.YUV_444 = new ChromaFormat(3, 1, 1);
    }
    
    public ChromaFormat(final int id, final int subWidth, final int subHeight) {
        this.id = id;
        this.subWidth = subWidth;
        this.subHeight = subHeight;
    }
    
    public static ChromaFormat fromId(final int n) {
        if (n == ChromaFormat.MONOCHROME.id) {
            return ChromaFormat.MONOCHROME;
        }
        if (n == ChromaFormat.YUV_420.id) {
            return ChromaFormat.YUV_420;
        }
        if (n == ChromaFormat.YUV_422.id) {
            return ChromaFormat.YUV_422;
        }
        if (n == ChromaFormat.YUV_444.id) {
            return ChromaFormat.YUV_444;
        }
        return null;
    }
    
    public int getId() {
        return this.id;
    }
    
    public int getSubHeight() {
        return this.subHeight;
    }
    
    public int getSubWidth() {
        return this.subWidth;
    }
    
    @Override
    public String toString() {
        return "ChromaFormat{\nid=" + this.id + ",\n" + " subWidth=" + this.subWidth + ",\n" + " subHeight=" + this.subHeight + '}';
    }
}
