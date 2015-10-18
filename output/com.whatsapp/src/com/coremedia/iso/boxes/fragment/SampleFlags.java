// 
// Decompiled by Procyon v0.5.30
// 

package com.coremedia.iso.boxes.fragment;

import com.googlecode.mp4parser.boxes.mp4.objectdescriptors.BitWriterBuffer;
import com.googlecode.mp4parser.boxes.mp4.objectdescriptors.BitReaderBuffer;
import java.nio.ByteBuffer;

public class SampleFlags
{
    private int reserved;
    private int sampleDegradationPriority;
    private int sampleDependsOn;
    private int sampleHasRedundancy;
    private int sampleIsDependedOn;
    private boolean sampleIsDifferenceSample;
    private int samplePaddingValue;
    
    public SampleFlags() {
    }
    
    public SampleFlags(final ByteBuffer byteBuffer) {
        int sampleIsDifferenceSample = 1;
        final BitReaderBuffer bitReaderBuffer = new BitReaderBuffer(byteBuffer);
        this.reserved = bitReaderBuffer.readBits(6);
        this.sampleDependsOn = bitReaderBuffer.readBits(2);
        this.sampleIsDependedOn = bitReaderBuffer.readBits(2);
        this.sampleHasRedundancy = bitReaderBuffer.readBits(2);
        this.samplePaddingValue = bitReaderBuffer.readBits(3);
        if (bitReaderBuffer.readBits(sampleIsDifferenceSample) != sampleIsDifferenceSample) {
            sampleIsDifferenceSample = 0;
        }
        this.sampleIsDifferenceSample = (sampleIsDifferenceSample != 0);
        this.sampleDegradationPriority = bitReaderBuffer.readBits(16);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this != o) {
            if (o == null || this.getClass() != o.getClass()) {
                return false;
            }
            final SampleFlags sampleFlags = (SampleFlags)o;
            if (this.reserved != sampleFlags.reserved) {
                return false;
            }
            if (this.sampleDegradationPriority != sampleFlags.sampleDegradationPriority) {
                return false;
            }
            if (this.sampleDependsOn != sampleFlags.sampleDependsOn) {
                return false;
            }
            if (this.sampleHasRedundancy != sampleFlags.sampleHasRedundancy) {
                return false;
            }
            if (this.sampleIsDependedOn != sampleFlags.sampleIsDependedOn) {
                return false;
            }
            if (this.sampleIsDifferenceSample != sampleFlags.sampleIsDifferenceSample) {
                return false;
            }
            if (this.samplePaddingValue != sampleFlags.samplePaddingValue) {
                return false;
            }
        }
        return true;
    }
    
    public void getContent(final ByteBuffer byteBuffer) {
        final BitWriterBuffer bitWriterBuffer = new BitWriterBuffer(byteBuffer);
        bitWriterBuffer.writeBits(this.reserved, 6);
        bitWriterBuffer.writeBits(this.sampleDependsOn, 2);
        bitWriterBuffer.writeBits(this.sampleIsDependedOn, 2);
        bitWriterBuffer.writeBits(this.sampleHasRedundancy, 2);
        bitWriterBuffer.writeBits(this.samplePaddingValue, 3);
        int n;
        if (this.sampleIsDifferenceSample) {
            n = 1;
        }
        else {
            n = 0;
        }
        bitWriterBuffer.writeBits(n, 1);
        bitWriterBuffer.writeBits(this.sampleDegradationPriority, 16);
    }
    
    public int getReserved() {
        return this.reserved;
    }
    
    public int getSampleDegradationPriority() {
        return this.sampleDegradationPriority;
    }
    
    public int getSampleDependsOn() {
        return this.sampleDependsOn;
    }
    
    public int getSampleHasRedundancy() {
        return this.sampleHasRedundancy;
    }
    
    public int getSampleIsDependedOn() {
        return this.sampleIsDependedOn;
    }
    
    public int getSamplePaddingValue() {
        return this.samplePaddingValue;
    }
    
    @Override
    public int hashCode() {
        final int n = 31 * (31 * (31 * (31 * (31 * this.reserved + this.sampleDependsOn) + this.sampleIsDependedOn) + this.sampleHasRedundancy) + this.samplePaddingValue);
        int n2;
        if (this.sampleIsDifferenceSample) {
            n2 = 1;
        }
        else {
            n2 = 0;
        }
        return 31 * (n + n2) + this.sampleDegradationPriority;
    }
    
    public boolean isSampleIsDifferenceSample() {
        return this.sampleIsDifferenceSample;
    }
    
    public void setReserved(final int reserved) {
        this.reserved = reserved;
    }
    
    public void setSampleDegradationPriority(final int sampleDegradationPriority) {
        this.sampleDegradationPriority = sampleDegradationPriority;
    }
    
    public void setSampleDependsOn(final int sampleDependsOn) {
        this.sampleDependsOn = sampleDependsOn;
    }
    
    public void setSampleHasRedundancy(final int sampleHasRedundancy) {
        this.sampleHasRedundancy = sampleHasRedundancy;
    }
    
    public void setSampleIsDependedOn(final int sampleIsDependedOn) {
        this.sampleIsDependedOn = sampleIsDependedOn;
    }
    
    public void setSampleIsDifferenceSample(final boolean sampleIsDifferenceSample) {
        this.sampleIsDifferenceSample = sampleIsDifferenceSample;
    }
    
    public void setSamplePaddingValue(final int samplePaddingValue) {
        this.samplePaddingValue = samplePaddingValue;
    }
    
    @Override
    public String toString() {
        return "SampleFlags{reserved=" + this.reserved + ", sampleDependsOn=" + this.sampleDependsOn + ", sampleHasRedundancy=" + this.sampleHasRedundancy + ", samplePaddingValue=" + this.samplePaddingValue + ", sampleIsDifferenceSample=" + this.sampleIsDifferenceSample + ", sampleDegradationPriority=" + this.sampleDegradationPriority + '}';
    }
}
