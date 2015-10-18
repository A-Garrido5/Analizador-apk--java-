// 
// Decompiled by Procyon v0.5.30
// 

package com.coremedia.iso;

import java.util.Iterator;
import com.coremedia.iso.boxes.Box;
import com.coremedia.iso.boxes.MovieBox;
import java.nio.channels.WritableByteChannel;
import java.io.UnsupportedEncodingException;
import java.nio.channels.FileChannel;
import java.io.IOException;
import java.io.FileInputStream;
import com.googlecode.mp4parser.util.Logger;
import com.googlecode.mp4parser.annotations.DoNotParseDetail;
import java.io.Closeable;
import com.googlecode.mp4parser.BasicContainer;

@DoNotParseDetail
public class IsoFile extends BasicContainer implements Closeable
{
    private static Logger LOG;
    
    static {
        IsoFile.LOG = Logger.getLogger(IsoFile.class);
    }
    
    public IsoFile(final String s) throws IOException {
        this(new FileInputStream(s).getChannel());
    }
    
    public IsoFile(final FileChannel fileChannel) throws IOException {
        this.parseContainer(fileChannel, fileChannel.size(), new PropertyBoxParserImpl(new String[0]));
    }
    
    public IsoFile(final FileChannel fileChannel, final BoxParser boxParser) throws IOException {
        this.fileChannel = fileChannel;
        this.boxParser = boxParser;
    }
    
    public static String bytesToFourCC(final byte[] array) {
        final byte[] array2 = new byte[4];
        if (array != null) {
            System.arraycopy(array, 0, array2, 0, Math.min(array.length, 4));
        }
        try {
            return new String(array2, "ISO-8859-1");
        }
        catch (UnsupportedEncodingException ex) {
            throw new Error("Required character encoding is missing", ex);
        }
    }
    
    public static byte[] fourCCtoBytes(final String s) {
        final byte[] array = new byte[4];
        if (s != null) {
            for (int i = 0; i < Math.min(4, s.length()); ++i) {
                array[i] = (byte)s.charAt(i);
            }
        }
        return array;
    }
    
    @Override
    public void close() throws IOException {
        this.fileChannel.close();
    }
    
    public void getBox(final WritableByteChannel writableByteChannel) throws IOException {
        this.writeContainer(writableByteChannel);
    }
    
    public MovieBox getMovieBox() {
        for (final Box box : this.getBoxes()) {
            if (box instanceof MovieBox) {
                return (MovieBox)box;
            }
        }
        return null;
    }
    
    public long getSize() {
        return this.getContainerSize();
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("IsoFile[").append(this.fileChannel.toString()).append("]");
        return sb.toString();
    }
}
