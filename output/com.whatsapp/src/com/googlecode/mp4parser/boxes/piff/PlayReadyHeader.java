// 
// Decompiled by Procyon v0.5.30
// 

package com.googlecode.mp4parser.boxes.piff;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import com.coremedia.iso.IsoTypeReader;
import java.util.Collections;
import java.util.Iterator;
import com.coremedia.iso.IsoTypeWriter;
import java.nio.ByteBuffer;
import java.util.List;

public class PlayReadyHeader extends ProtectionSpecificHeader
{
    private long length;
    private List<PlayReadyRecord> records;
    
    @Override
    public ByteBuffer getData() {
        int n = 6;
        final Iterator<PlayReadyRecord> iterator = this.records.iterator();
        while (iterator.hasNext()) {
            n = n + 4 + iterator.next().getValue().rewind().limit();
        }
        final ByteBuffer allocate = ByteBuffer.allocate(n);
        IsoTypeWriter.writeUInt32BE(allocate, n);
        IsoTypeWriter.writeUInt16BE(allocate, this.records.size());
        for (final PlayReadyRecord playReadyRecord : this.records) {
            IsoTypeWriter.writeUInt16BE(allocate, playReadyRecord.type);
            IsoTypeWriter.writeUInt16BE(allocate, playReadyRecord.getValue().limit());
            allocate.put(playReadyRecord.getValue());
        }
        return allocate;
    }
    
    public List<PlayReadyRecord> getRecords() {
        return Collections.unmodifiableList((List<? extends PlayReadyRecord>)this.records);
    }
    
    @Override
    public void parse(final ByteBuffer byteBuffer) {
        this.length = IsoTypeReader.readUInt32BE(byteBuffer);
        this.records = PlayReadyRecord.createFor(byteBuffer, IsoTypeReader.readUInt16BE(byteBuffer));
    }
    
    public void setRecords(final List<PlayReadyRecord> records) {
        this.records = records;
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("PlayReadyHeader");
        sb.append("{length=").append(this.length);
        sb.append(", recordCount=").append(this.records.size());
        sb.append(", records=").append(this.records);
        sb.append('}');
        return sb.toString();
    }
    
    public abstract static class PlayReadyRecord
    {
        int type;
        
        public PlayReadyRecord(final int type) {
            this.type = type;
        }
        
        public static List<PlayReadyRecord> createFor(final ByteBuffer byteBuffer, final int n) {
            final ArrayList<PlayReadyRecord> list = new ArrayList<PlayReadyRecord>(n);
            for (int i = 0; i < n; ++i) {
                final int uInt16BE = IsoTypeReader.readUInt16BE(byteBuffer);
                final int uInt16BE2 = IsoTypeReader.readUInt16BE(byteBuffer);
                PlayReadyRecord playReadyRecord = null;
                switch (uInt16BE) {
                    default: {
                        playReadyRecord = new DefaulPlayReadyRecord(uInt16BE);
                        break;
                    }
                    case 1: {
                        playReadyRecord = new RMHeader();
                        break;
                    }
                    case 2: {
                        playReadyRecord = new DefaulPlayReadyRecord(2);
                        break;
                    }
                    case 3: {
                        playReadyRecord = new EmeddedLicenseStore();
                        break;
                    }
                }
                playReadyRecord.parse((ByteBuffer)byteBuffer.slice().limit(uInt16BE2));
                byteBuffer.position(uInt16BE2 + byteBuffer.position());
                list.add(playReadyRecord);
            }
            return list;
        }
        
        public abstract ByteBuffer getValue();
        
        public abstract void parse(final ByteBuffer p0);
        
        @Override
        public String toString() {
            final StringBuilder sb = new StringBuilder();
            sb.append("PlayReadyRecord");
            sb.append("{type=").append(this.type);
            sb.append(", length=").append(this.getValue().limit());
            sb.append('}');
            return sb.toString();
        }
        
        public static class DefaulPlayReadyRecord extends PlayReadyRecord
        {
            ByteBuffer value;
            
            public DefaulPlayReadyRecord(final int n) {
                super(n);
            }
            
            @Override
            public ByteBuffer getValue() {
                return this.value;
            }
            
            @Override
            public void parse(final ByteBuffer byteBuffer) {
                this.value = byteBuffer.duplicate();
            }
        }
        
        public static class EmeddedLicenseStore extends PlayReadyRecord
        {
            ByteBuffer value;
            
            public EmeddedLicenseStore() {
                super(3);
            }
            
            @Override
            public ByteBuffer getValue() {
                return this.value;
            }
            
            @Override
            public void parse(final ByteBuffer byteBuffer) {
                this.value = byteBuffer.duplicate();
            }
            
            @Override
            public String toString() {
                final StringBuilder sb = new StringBuilder();
                sb.append("EmeddedLicenseStore");
                sb.append("{length=").append(this.getValue().limit());
                sb.append('}');
                return sb.toString();
            }
        }
        
        public static class RMHeader extends PlayReadyRecord
        {
            String header;
            
            public RMHeader() {
                super(1);
            }
            
            public String getHeader() {
                return this.header;
            }
            
            @Override
            public ByteBuffer getValue() {
                try {
                    return ByteBuffer.wrap(this.header.getBytes("UTF-16LE"));
                }
                catch (UnsupportedEncodingException ex) {
                    throw new RuntimeException(ex);
                }
            }
            
            @Override
            public void parse(final ByteBuffer byteBuffer) {
                try {
                    final byte[] array = new byte[byteBuffer.slice().limit()];
                    byteBuffer.get(array);
                    this.header = new String(array, "UTF-16LE");
                }
                catch (UnsupportedEncodingException ex) {
                    throw new RuntimeException(ex);
                }
            }
            
            public void setHeader(final String header) {
                this.header = header;
            }
            
            @Override
            public String toString() {
                final StringBuilder sb = new StringBuilder();
                sb.append("RMHeader");
                sb.append("{length=").append(this.getValue().limit());
                sb.append(", header='").append(this.header).append('\'');
                sb.append('}');
                return sb.toString();
            }
        }
    }
}
