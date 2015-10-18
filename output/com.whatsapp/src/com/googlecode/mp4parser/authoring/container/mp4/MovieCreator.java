// 
// Decompiled by Procyon v0.5.30
// 

package com.googlecode.mp4parser.authoring.container.mp4;

import java.util.Iterator;
import com.googlecode.mp4parser.authoring.Track;
import com.googlecode.mp4parser.authoring.Mp4TrackImpl;
import com.coremedia.iso.boxes.TrackBox;
import com.coremedia.iso.IsoFile;
import java.nio.channels.FileChannel;
import java.io.IOException;
import java.io.FileInputStream;
import com.googlecode.mp4parser.authoring.Movie;

public class MovieCreator
{
    public static Movie build(final String s) throws IOException {
        return build(new FileInputStream(s).getChannel());
    }
    
    public static Movie build(final FileChannel fileChannel) throws IOException {
        final IsoFile isoFile = new IsoFile(fileChannel);
        final Movie movie = new Movie();
        final Iterator<TrackBox> iterator = isoFile.getMovieBox().getBoxes(TrackBox.class).iterator();
        while (iterator.hasNext()) {
            movie.addTrack(new Mp4TrackImpl(iterator.next(), new IsoFile[0]));
        }
        movie.setMatrix(isoFile.getMovieBox().getMovieHeaderBox().getMatrix());
        return movie;
    }
}
