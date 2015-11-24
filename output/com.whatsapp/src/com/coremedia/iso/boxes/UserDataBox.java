// 
// Decompiled by Procyon v0.5.30
// 

package com.coremedia.iso.boxes;

import com.coremedia.iso.BoxParser;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.io.IOException;
import java.nio.channels.WritableByteChannel;
import com.googlecode.mp4parser.AbstractContainerBox;

public class UserDataBox extends AbstractContainerBox
{
    public static final String TYPE = "udta";
    
    public UserDataBox() {
        super("udta");
    }
    
    @Override
    public void getBox(final WritableByteChannel writableByteChannel) throws IOException {
        super.getBox(writableByteChannel);
    }
    
    @Override
    public void parse(final FileChannel fileChannel, final ByteBuffer byteBuffer, final long n, final BoxParser boxParser) throws IOException {
        super.parse(fileChannel, byteBuffer, n, boxParser);
    }
}
