// 
// Decompiled by Procyon v0.5.30
// 

package com.googlecode.mp4parser;

import com.coremedia.iso.BoxParser;
import com.googlecode.mp4parser.util.Path;
import com.googlecode.mp4parser.annotations.DoNotParseDetail;
import java.nio.channels.WritableByteChannel;
import com.coremedia.iso.Hex;
import com.googlecode.mp4parser.util.CastUtils;
import java.io.IOException;
import com.coremedia.iso.IsoFile;
import com.coremedia.iso.IsoTypeWriter;
import com.coremedia.iso.boxes.Container;
import java.nio.channels.FileChannel;
import java.nio.ByteBuffer;
import com.googlecode.mp4parser.util.Logger;
import com.coremedia.iso.boxes.Box;

public abstract class AbstractBox implements Box
{
    private static Logger LOG;
    private ByteBuffer content;
    long contentStartPosition;
    private ByteBuffer deadBytes;
    FileChannel fileChannel;
    boolean isParsed;
    boolean isRead;
    long memMapSize;
    long offset;
    private Container parent;
    protected String type;
    private byte[] userType;
    
    static {
        AbstractBox.LOG = Logger.getLogger(AbstractBox.class);
    }
    
    protected AbstractBox(final String type) {
        this.memMapSize = -1L;
        this.deadBytes = null;
        this.type = type;
        this.isRead = true;
        this.isParsed = true;
    }
    
    protected AbstractBox(final String type, final byte[] userType) {
        this.memMapSize = -1L;
        this.deadBytes = null;
        this.type = type;
        this.userType = userType;
        this.isRead = true;
        this.isParsed = true;
    }
    
    private void getHeader(final ByteBuffer byteBuffer) {
        if (this.isSmallBox()) {
            IsoTypeWriter.writeUInt32(byteBuffer, this.getSize());
            byteBuffer.put(IsoFile.fourCCtoBytes(this.getType()));
        }
        else {
            IsoTypeWriter.writeUInt32(byteBuffer, 1L);
            byteBuffer.put(IsoFile.fourCCtoBytes(this.getType()));
            IsoTypeWriter.writeUInt64(byteBuffer, this.getSize());
        }
        if ("uuid".equals(this.getType())) {
            byteBuffer.put(this.getUserType());
        }
    }
    
    private boolean isSmallBox() {
        int n = 8;
        if ("uuid".equals(this.getType())) {
            n += 16;
        }
        if (this.isRead) {
            if (this.isParsed) {
                final long contentSize = this.getContentSize();
                int limit;
                if (this.deadBytes != null) {
                    limit = this.deadBytes.limit();
                }
                else {
                    limit = 0;
                }
                if (contentSize + limit + n >= 4294967296L) {
                    return false;
                }
            }
            else if (n + this.content.limit() >= 4294967296L) {
                return false;
            }
        }
        else if (this.memMapSize + n >= 4294967296L) {
            return false;
        }
        return true;
    }
    
    private void readContent() {
        synchronized (this) {
            if (this.isRead) {
                return;
            }
            try {
                AbstractBox.LOG.logDebug("mem mapping " + this.getType());
                this.content = this.fileChannel.map(FileChannel.MapMode.READ_ONLY, this.contentStartPosition, this.memMapSize);
                this.isRead = true;
            }
            catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        }
    }
    
    private boolean verify(final ByteBuffer byteBuffer) {
        final long contentSize = this.getContentSize();
        int limit;
        if (this.deadBytes != null) {
            limit = this.deadBytes.limit();
        }
        else {
            limit = 0;
        }
        final ByteBuffer allocate = ByteBuffer.allocate(CastUtils.l2i(contentSize + limit));
        this.getContent(allocate);
        if (this.deadBytes != null) {
            this.deadBytes.rewind();
            while (this.deadBytes.remaining() > 0) {
                allocate.put(this.deadBytes);
            }
        }
        byteBuffer.rewind();
        allocate.rewind();
        if (byteBuffer.remaining() != allocate.remaining()) {
            AbstractBox.LOG.logError(String.valueOf(this.getType()) + ": remaining differs " + byteBuffer.remaining() + " vs. " + allocate.remaining());
            return false;
        }
        for (int position = byteBuffer.position(), i = -1 + byteBuffer.limit(), n = -1 + allocate.limit(); i >= position; --i, --n) {
            final byte value = byteBuffer.get(i);
            final byte value2 = allocate.get(n);
            if (value != value2) {
                AbstractBox.LOG.logError(String.format("%s: buffers differ at %d: %2X/%2X", this.getType(), i, value, value2));
                final byte[] array = new byte[byteBuffer.remaining()];
                final byte[] array2 = new byte[allocate.remaining()];
                byteBuffer.get(array);
                allocate.get(array2);
                System.err.println("original      : " + Hex.encodeHex(array, 4));
                System.err.println("reconstructed : " + Hex.encodeHex(array2, 4));
                return false;
            }
        }
        return true;
    }
    
    protected abstract void _parseDetails(final ByteBuffer p0);
    
    @Override
    public void getBox(final WritableByteChannel writableByteChannel) throws IOException {
        int n = 8;
        int n2 = 16;
        if (!this.isRead) {
            if (!this.isSmallBox()) {
                n = n2;
            }
            final ByteBuffer allocate = ByteBuffer.allocate(n);
            this.getHeader(allocate);
            writableByteChannel.write((ByteBuffer)allocate.rewind());
            this.fileChannel.transferTo(this.contentStartPosition, this.memMapSize, writableByteChannel);
            return;
        }
        if (this.isParsed) {
            final ByteBuffer allocate2 = ByteBuffer.allocate(CastUtils.l2i(this.getSize()));
            this.getHeader(allocate2);
            this.getContent(allocate2);
            if (this.deadBytes != null) {
                this.deadBytes.rewind();
                while (this.deadBytes.remaining() > 0) {
                    allocate2.put(this.deadBytes);
                }
            }
            writableByteChannel.write((ByteBuffer)allocate2.rewind());
            return;
        }
        if (!this.isSmallBox()) {
            n = n2;
        }
        if (!"uuid".equals(this.getType())) {
            n2 = 0;
        }
        final ByteBuffer allocate3 = ByteBuffer.allocate(n + n2);
        this.getHeader(allocate3);
        writableByteChannel.write((ByteBuffer)allocate3.rewind());
        writableByteChannel.write((ByteBuffer)this.content.position(0));
    }
    
    protected abstract void getContent(final ByteBuffer p0);
    
    protected abstract long getContentSize();
    
    @Override
    public long getOffset() {
        return this.offset;
    }
    
    @DoNotParseDetail
    @Override
    public Container getParent() {
        return this.parent;
    }
    
    @DoNotParseDetail
    public String getPath() {
        return Path.createPath(this);
    }
    
    @Override
    public long getSize() {
        long n;
        if (this.isRead) {
            if (this.isParsed) {
                n = this.getContentSize();
            }
            else {
                n = this.content.limit();
            }
        }
        else {
            n = this.memMapSize;
        }
        int n2;
        if (n >= 4294967288L) {
            n2 = 8;
        }
        else {
            n2 = 0;
        }
        final int n3 = n2 + 8;
        int n4;
        if ("uuid".equals(this.getType())) {
            n4 = 16;
        }
        else {
            n4 = 0;
        }
        final long n5 = n + (n4 + n3);
        final ByteBuffer deadBytes = this.deadBytes;
        int limit = 0;
        if (deadBytes != null) {
            limit = this.deadBytes.limit();
        }
        return n5 + limit;
    }
    
    @DoNotParseDetail
    @Override
    public String getType() {
        return this.type;
    }
    
    @DoNotParseDetail
    public byte[] getUserType() {
        return this.userType;
    }
    
    public boolean isParsed() {
        return this.isParsed;
    }
    
    @DoNotParseDetail
    @Override
    public void parse(final FileChannel fileChannel, final ByteBuffer byteBuffer, final long memMapSize, final BoxParser boxParser) throws IOException {
        this.contentStartPosition = fileChannel.position();
        this.offset = this.contentStartPosition - byteBuffer.remaining();
        this.memMapSize = memMapSize;
        (this.fileChannel = fileChannel).position(memMapSize + fileChannel.position());
        this.isRead = false;
        this.isParsed = false;
    }
    
    public final void parseDetails() {
        synchronized (this) {
            this.readContent();
            AbstractBox.LOG.logDebug("parsing details of " + this.getType());
            if (this.content != null) {
                final ByteBuffer content = this.content;
                this.isParsed = true;
                content.rewind();
                this._parseDetails(content);
                if (content.remaining() > 0) {
                    this.deadBytes = content.slice();
                }
                this.content = null;
                assert this.verify(content);
            }
        }
    }
    // monitorexit(this)
    
    protected void setDeadBytes(final ByteBuffer deadBytes) {
        this.deadBytes = deadBytes;
    }
    
    @DoNotParseDetail
    @Override
    public void setParent(final Container parent) {
        this.parent = parent;
    }
}
