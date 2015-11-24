// 
// Decompiled by Procyon v0.5.30
// 

package com.coremedia.iso;

import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.Iterator;
import com.coremedia.iso.boxes.Container;
import com.googlecode.mp4parser.util.Path;
import java.util.HashMap;
import java.io.RandomAccessFile;
import java.io.File;
import com.coremedia.iso.boxes.Box;
import java.util.Map;

public class BoxReplacer
{
    public static void replace(final Map<String, Box> map, final File file) throws IOException {
        final IsoFile isoFile = new IsoFile(new RandomAccessFile(file, "r").getChannel(), new PropertyBoxParserImpl(new String[0]));
        final HashMap<String, Box> hashMap = new HashMap<String, Box>();
        for (final Map.Entry<String, Box> entry : map.entrySet()) {
            final Box path = Path.getPath(isoFile, entry.getKey());
            hashMap.put(Path.createPath(path), entry.getValue());
            assert path.getSize() == entry.getValue().getSize();
        }
        isoFile.close();
        final FileChannel channel = new RandomAccessFile(file, "rw").getChannel();
        final Iterator<Map.Entry<String, V>> iterator2 = hashMap.entrySet().iterator();
        if (iterator2.hasNext()) {
            final String s = iterator2.next().getKey();
            throw new RuntimeException("ddd");
        }
        channel.close();
    }
}
