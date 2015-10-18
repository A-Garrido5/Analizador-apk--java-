// 
// Decompiled by Procyon v0.5.30
// 

package com.coremedia.iso;

import java.io.IOException;
import com.coremedia.iso.boxes.Box;
import com.coremedia.iso.boxes.Container;
import java.nio.channels.FileChannel;

public interface BoxParser
{
    Box parseBox(final FileChannel p0, final Container p1) throws IOException;
}
