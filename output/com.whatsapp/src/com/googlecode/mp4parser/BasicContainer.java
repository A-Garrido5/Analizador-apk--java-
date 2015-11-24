// 
// Decompiled by Procyon v0.5.30
// 

package com.googlecode.mp4parser;

import java.nio.channels.WritableByteChannel;
import java.io.EOFException;
import java.util.NoSuchElementException;
import java.io.IOException;
import com.googlecode.mp4parser.util.LazyList;
import java.util.Collection;
import java.util.ArrayList;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.List;
import com.coremedia.iso.BoxParser;
import com.googlecode.mp4parser.util.Logger;
import com.coremedia.iso.boxes.Box;
import java.util.Iterator;
import com.coremedia.iso.boxes.Container;

public class BasicContainer implements Container, Iterator<Box>
{
    private static final Box EOF;
    private static Logger LOG;
    protected BoxParser boxParser;
    private List<Box> boxes;
    long endPosition;
    protected FileChannel fileChannel;
    Box lookahead;
    long parsePosition;
    long startPosition;
    
    static {
        BasicContainer.LOG = Logger.getLogger(AbstractContainerBox.class);
        EOF = new AbstractBox() {
            @Override
            protected void _parseDetails(final ByteBuffer byteBuffer) {
            }
            
            @Override
            protected void getContent(final ByteBuffer byteBuffer) {
            }
            
            @Override
            protected long getContentSize() {
                return 0L;
            }
        };
    }
    
    public BasicContainer() {
        this.boxes = new ArrayList<Box>();
        this.lookahead = null;
        this.parsePosition = 0L;
        this.startPosition = 0L;
        this.endPosition = 0L;
    }
    
    public void addBox(final Box box) {
        this.boxes = new ArrayList<Box>(this.getBoxes());
        box.setParent(this);
        this.boxes.add(box);
    }
    
    @Override
    public List<Box> getBoxes() {
        if (this.fileChannel != null && this.lookahead != BasicContainer.EOF) {
            return new LazyList<Box>(this.boxes, this);
        }
        return this.boxes;
    }
    
    @Override
    public <T extends Box> List<T> getBoxes(final Class<T> clazz) {
        return this.getBoxes(clazz, false);
    }
    
    @Override
    public <T extends Box> List<T> getBoxes(final Class<T> clazz, final boolean b) {
        final ArrayList<T> list = new ArrayList<T>(2);
        for (final Box box : this.getBoxes()) {
            if (clazz.isInstance(box)) {
                list.add((T)box);
            }
            if (b && box instanceof Container) {
                list.addAll((Collection<?>)((Container)box).getBoxes((Class<Box>)clazz, b));
            }
        }
        return list;
    }
    
    @Override
    public ByteBuffer getByteBuffer(final long n, final long n2) throws IOException {
        synchronized (this.fileChannel) {
            return this.fileChannel.map(FileChannel.MapMode.READ_ONLY, n + this.startPosition, n2);
        }
    }
    
    protected long getContainerSize() {
        long n = 0L;
        for (int i = 0; i < this.getBoxes().size(); ++i) {
            n += this.boxes.get(i).getSize();
        }
        return n;
    }
    
    @Override
    public boolean hasNext() {
        if (this.lookahead == BasicContainer.EOF) {
            return false;
        }
        if (this.lookahead != null) {
            return true;
        }
        try {
            this.lookahead = this.next();
            return true;
        }
        catch (NoSuchElementException ex) {
            this.lookahead = BasicContainer.EOF;
            return false;
        }
    }
    
    @Override
    public Box next() {
        if (this.lookahead != null && this.lookahead != BasicContainer.EOF) {
            final Box lookahead = this.lookahead;
            this.lookahead = null;
            return lookahead;
        }
        BasicContainer.LOG.logDebug("Parsing next() box");
        if (this.fileChannel == null || this.parsePosition >= this.endPosition) {
            this.lookahead = BasicContainer.EOF;
            throw new NoSuchElementException();
        }
        try {
            synchronized (this.fileChannel) {
                this.fileChannel.position(this.parsePosition);
                final Box box = this.boxParser.parseBox(this.fileChannel, this);
                this.parsePosition = this.fileChannel.position();
                return box;
            }
        }
        catch (EOFException ex) {
            throw new NoSuchElementException();
        }
        catch (IOException ex2) {
            throw new NoSuchElementException();
        }
    }
    
    public void parseContainer(final FileChannel fileChannel, final long n, final BoxParser boxParser) throws IOException {
        this.fileChannel = fileChannel;
        final long position = fileChannel.position();
        this.startPosition = position;
        this.parsePosition = position;
        fileChannel.position(n + fileChannel.position());
        this.endPosition = fileChannel.position();
        this.boxParser = boxParser;
    }
    
    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }
    
    @Override
    public void setBoxes(final List<Box> list) {
        this.boxes = new ArrayList<Box>(list);
        this.lookahead = BasicContainer.EOF;
        this.fileChannel = null;
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(this.getClass().getSimpleName()).append("[");
        for (int i = 0; i < this.boxes.size(); ++i) {
            if (i > 0) {
                sb.append(";");
            }
            sb.append(this.boxes.get(i).toString());
        }
        sb.append("]");
        return sb.toString();
    }
    
    @Override
    public final void writeContainer(final WritableByteChannel writableByteChannel) throws IOException {
        final Iterator<Box> iterator = this.getBoxes().iterator();
        while (iterator.hasNext()) {
            iterator.next().getBox(writableByteChannel);
        }
    }
}
