// 
// Decompiled by Procyon v0.5.30
// 

package com.coremedia.iso;

import java.io.IOException;
import java.io.EOFException;
import com.coremedia.iso.boxes.Container;
import java.nio.channels.FileChannel;
import com.coremedia.iso.boxes.Box;
import java.nio.ByteBuffer;
import java.util.logging.Logger;

public abstract class AbstractBoxParser implements BoxParser
{
    private static Logger LOG;
    ThreadLocal<ByteBuffer> header;
    
    static {
        AbstractBoxParser.LOG = Logger.getLogger(AbstractBoxParser.class.getName());
    }
    
    public AbstractBoxParser() {
        this.header = new ThreadLocal<ByteBuffer>() {
            @Override
            protected ByteBuffer initialValue() {
                return ByteBuffer.allocate(32);
            }
        };
    }
    
    public abstract Box createBox(final String p0, final byte[] p1, final String p2);
    
    @Override
    public Box parseBox(final FileChannel fileChannel, final Container parent) throws IOException {
        this.header.get().rewind().limit(8);
        int i = 0;
        do {
            i += fileChannel.read(this.header.get());
            if (i == 8) {
                this.header.get().rewind();
                final long uInt32 = IsoTypeReader.readUInt32(this.header.get());
                if (uInt32 < 8L && uInt32 > 1L) {
                    AbstractBoxParser.LOG.severe("Plausibility check failed: size < 8 (size = " + uInt32 + "). Stop parsing!");
                    return null;
                }
                final String read4cc = IsoTypeReader.read4cc(this.header.get());
                byte[] array = null;
                long n;
                if (uInt32 == 1L) {
                    this.header.get().limit(16);
                    fileChannel.read(this.header.get());
                    this.header.get().position(8);
                    n = IsoTypeReader.readUInt64(this.header.get()) - 16L;
                }
                else {
                    if (uInt32 == 0L) {
                        final long n2 = fileChannel.size() - fileChannel.position() - 8L - 8L;
                        final StringBuilder append = new StringBuilder("'").append(read4cc).append("' with '");
                        String type;
                        if (parent instanceof Box) {
                            type = ((Box)parent).getType();
                        }
                        else {
                            type = "IsoFile";
                        }
                        throw new RuntimeException(append.append(type).append("' as parent has length == 0. That's not supported").toString());
                    }
                    n = uInt32 - 8L;
                }
                if ("uuid".equals(read4cc)) {
                    this.header.get().limit(16 + this.header.get().limit());
                    fileChannel.read(this.header.get());
                    array = new byte[16];
                    for (int j = -16 + this.header.get().position(); j < this.header.get().position(); ++j) {
                        array[j - (-16 + this.header.get().position())] = this.header.get().get(j);
                    }
                    n -= 16L;
                }
                String type2;
                if (parent instanceof Box) {
                    type2 = ((Box)parent).getType();
                }
                else {
                    type2 = "";
                }
                final Box box = this.createBox(read4cc, array, type2);
                box.setParent(parent);
                this.header.get().rewind();
                box.parse(fileChannel, this.header.get(), n, this);
                return box;
            }
        } while (i >= 0);
        throw new EOFException();
    }
}
