// 
// Decompiled by Procyon v0.5.30
// 

package com.googlecode.mp4parser.boxes.mp4.samplegrouping;

import com.coremedia.iso.Hex;
import com.coremedia.iso.IsoTypeReader;
import com.coremedia.iso.IsoTypeWriter;
import java.nio.ByteBuffer;
import java.util.Arrays;

public class CencSampleEncryptionInformationGroupEntry extends GroupEntry
{
    public static final String TYPE = "seig";
    private int isEncrypted;
    private byte ivSize;
    private byte[] kid;
    
    public CencSampleEncryptionInformationGroupEntry() {
        this.kid = new byte[16];
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this != o) {
            if (o == null || this.getClass() != o.getClass()) {
                return false;
            }
            final CencSampleEncryptionInformationGroupEntry cencSampleEncryptionInformationGroupEntry = (CencSampleEncryptionInformationGroupEntry)o;
            if (this.isEncrypted != cencSampleEncryptionInformationGroupEntry.isEncrypted) {
                return false;
            }
            if (this.ivSize != cencSampleEncryptionInformationGroupEntry.ivSize) {
                return false;
            }
            if (!Arrays.equals(this.kid, cencSampleEncryptionInformationGroupEntry.kid)) {
                return false;
            }
        }
        return true;
    }
    
    @Override
    public ByteBuffer get() {
        final ByteBuffer allocate = ByteBuffer.allocate(20);
        IsoTypeWriter.writeUInt24(allocate, this.isEncrypted);
        IsoTypeWriter.writeUInt8(allocate, this.ivSize);
        allocate.put(this.kid);
        allocate.rewind();
        return allocate;
    }
    
    public int getEncrypted() {
        return this.isEncrypted;
    }
    
    public byte getIvSize() {
        return this.ivSize;
    }
    
    public byte[] getKid() {
        return this.kid;
    }
    
    @Override
    public int hashCode() {
        final int n = 31 * (31 * this.isEncrypted + this.ivSize);
        int hashCode;
        if (this.kid != null) {
            hashCode = Arrays.hashCode(this.kid);
        }
        else {
            hashCode = 0;
        }
        return n + hashCode;
    }
    
    @Override
    public void parse(final ByteBuffer byteBuffer) {
        this.isEncrypted = IsoTypeReader.readUInt24(byteBuffer);
        this.ivSize = (byte)IsoTypeReader.readUInt8(byteBuffer);
        byteBuffer.get(this.kid = new byte[16]);
    }
    
    public void setEncrypted(final int isEncrypted) {
        this.isEncrypted = isEncrypted;
    }
    
    public void setIvSize(final byte ivSize) {
        this.ivSize = ivSize;
    }
    
    public void setKid(final byte[] kid) {
        assert kid.length == 16;
        this.kid = kid;
    }
    
    @Override
    public String toString() {
        return "CencSampleEncryptionInformationGroupEntry{isEncrypted=" + this.isEncrypted + ", ivSize=" + this.ivSize + ", kid=" + Hex.encodeHex(this.kid) + '}';
    }
}
