// 
// Decompiled by Procyon v0.5.30
// 

package com.coremedia.iso.boxes;

import java.nio.ByteBuffer;

public class NullMediaHeaderBox extends AbstractMediaHeaderBox
{
    public static String TYPE;
    
    static {
        NullMediaHeaderBox.TYPE = "nmhd";
    }
    
    public NullMediaHeaderBox() {
        super(NullMediaHeaderBox.TYPE);
    }
    
    public void _parseDetails(final ByteBuffer byteBuffer) {
        this.parseVersionAndFlags(byteBuffer);
    }
    
    @Override
    protected void getContent(final ByteBuffer byteBuffer) {
        this.writeVersionAndFlags(byteBuffer);
    }
    
    @Override
    protected long getContentSize() {
        return 4L;
    }
}
