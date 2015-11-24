// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.media.model;

import java.io.OutputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectOutput;
import java.io.InputStream;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.ObjectInput;
import java.io.Externalizable;

class SegmentedVideoFile$SerializationProxy implements Externalizable
{
    private static final long serialVersionUID = -5751292908243493952L;
    private SegmentedVideoFile mSegmentedVideoFile;
    
    public SegmentedVideoFile$SerializationProxy() {
    }
    
    public SegmentedVideoFile$SerializationProxy(final SegmentedVideoFile mSegmentedVideoFile) {
        this.mSegmentedVideoFile = mSegmentedVideoFile;
    }
    
    private Object readResolve() {
        return this.mSegmentedVideoFile;
    }
    
    @Override
    public void readExternal(final ObjectInput objectInput) {
        objectInput.readInt();
        final File file = (File)objectInput.readObject();
        final int int1 = objectInput.readInt();
        this.mSegmentedVideoFile = null;
        if (int1 != 0) {
            final byte[] array = new byte[int1];
            yh.a(array, objectInput);
            final ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(array);
            final q a = SegmentedVideoFile.a(byteArrayInputStream);
            byteArrayInputStream.close();
            SegmentedVideoFile mSegmentedVideoFile;
            if (a != null) {
                mSegmentedVideoFile = new SegmentedVideoFile(file, a);
            }
            else {
                mSegmentedVideoFile = null;
            }
            this.mSegmentedVideoFile = mSegmentedVideoFile;
        }
    }
    
    @Override
    public void writeExternal(final ObjectOutput objectOutput) {
        objectOutput.writeInt(0);
        objectOutput.writeObject(this.mSegmentedVideoFile.file);
        final ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(4096);
        this.mSegmentedVideoFile.a(byteArrayOutputStream);
        byteArrayOutputStream.close();
        final byte[] byteArray = byteArrayOutputStream.toByteArray();
        objectOutput.writeInt(byteArray.length);
        objectOutput.write(byteArray);
    }
}
