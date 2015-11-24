// 
// Decompiled by Procyon v0.5.30
// 

package com.coremedia.iso.boxes;

import java.nio.channels.ReadableByteChannel;
import com.googlecode.mp4parser.util.ChannelHelper;
import com.coremedia.iso.BoxParser;
import java.nio.channels.FileChannel;
import java.io.IOException;
import java.util.Iterator;
import com.coremedia.iso.IsoTypeWriter;
import java.nio.channels.WritableByteChannel;
import com.googlecode.mp4parser.util.CastUtils;
import java.util.LinkedList;
import java.util.List;
import java.nio.ByteBuffer;

public class FreeBox implements Box
{
    public static final String TYPE = "free";
    ByteBuffer data;
    private long offset;
    private Container parent;
    List<Box> replacers;
    
    public FreeBox() {
        this.replacers = new LinkedList<Box>();
    }
    
    public FreeBox(final int n) {
        this.replacers = new LinkedList<Box>();
        this.data = ByteBuffer.allocate(n);
    }
    
    public void addAndReplace(final Box box) {
        this.data.position(CastUtils.l2i(box.getSize()));
        this.data = this.data.slice();
        this.replacers.add(box);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this != o) {
            if (o == null || this.getClass() != o.getClass()) {
                return false;
            }
            final FreeBox freeBox = (FreeBox)o;
            if (this.data != null) {
                if (this.data.equals(freeBox.data)) {
                    return true;
                }
            }
            else if (freeBox.data == null) {
                return true;
            }
            return false;
        }
        return true;
    }
    
    @Override
    public void getBox(final WritableByteChannel writableByteChannel) throws IOException {
        final Iterator<Box> iterator = this.replacers.iterator();
        while (iterator.hasNext()) {
            iterator.next().getBox(writableByteChannel);
        }
        final ByteBuffer allocate = ByteBuffer.allocate(8);
        IsoTypeWriter.writeUInt32(allocate, 8 + this.data.limit());
        allocate.put("free".getBytes());
        allocate.rewind();
        writableByteChannel.write(allocate);
        allocate.rewind();
        this.data.rewind();
        writableByteChannel.write(this.data);
        this.data.rewind();
    }
    
    public ByteBuffer getData() {
        return this.data;
    }
    
    @Override
    public long getOffset() {
        return this.offset;
    }
    
    @Override
    public Container getParent() {
        return this.parent;
    }
    
    @Override
    public long getSize() {
        long n = 8L;
        final Iterator<Box> iterator = this.replacers.iterator();
        while (iterator.hasNext()) {
            n += iterator.next().getSize();
        }
        return n + this.data.limit();
    }
    
    @Override
    public String getType() {
        return "free";
    }
    
    @Override
    public int hashCode() {
        if (this.data != null) {
            return this.data.hashCode();
        }
        return 0;
    }
    
    @Override
    public void parse(final FileChannel fileChannel, final ByteBuffer byteBuffer, final long n, final BoxParser boxParser) throws IOException {
        this.offset = fileChannel.position() - byteBuffer.remaining();
        if (n > 1048576L) {
            this.data = fileChannel.map(FileChannel.MapMode.READ_ONLY, fileChannel.position(), n);
            fileChannel.position(n + fileChannel.position());
            return;
        }
        assert n < 2147483647L;
        this.data = ChannelHelper.readFully(fileChannel, n);
    }
    
    public void setData(final ByteBuffer data) {
        this.data = data;
    }
    
    @Override
    public void setParent(final Container parent) {
        this.parent = parent;
    }
}
