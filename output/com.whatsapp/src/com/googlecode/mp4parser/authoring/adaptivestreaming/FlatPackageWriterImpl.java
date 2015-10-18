// 
// Decompiled by Procyon v0.5.30
// 

package com.googlecode.mp4parser.authoring.adaptivestreaming;

import java.io.IOException;
import java.nio.channels.FileChannel;
import com.coremedia.iso.boxes.Container;
import java.io.FileWriter;
import com.coremedia.iso.boxes.fragment.MovieFragmentBox;
import com.coremedia.iso.boxes.Box;
import com.coremedia.iso.boxes.VideoMediaHeaderBox;
import com.coremedia.iso.boxes.SoundMediaHeaderBox;
import java.nio.channels.WritableByteChannel;
import java.io.FileOutputStream;
import com.googlecode.mp4parser.authoring.builder.DefaultMp4Builder;
import com.googlecode.mp4parser.authoring.tracks.ChangeTimeScaleTrack;
import java.util.Iterator;
import com.googlecode.mp4parser.authoring.Track;
import com.googlecode.mp4parser.authoring.Movie;
import com.googlecode.mp4parser.authoring.builder.FragmentIntersectionFinder;
import com.googlecode.mp4parser.authoring.builder.SyncSampleIntersectFinderImpl;
import java.io.File;
import com.googlecode.mp4parser.authoring.builder.FragmentedMp4Builder;
import java.util.logging.Logger;

public class FlatPackageWriterImpl implements PackageWriter
{
    private static Logger LOG;
    private boolean debugOutput;
    private FragmentedMp4Builder ismvBuilder;
    ManifestWriter manifestWriter;
    private File outputDirectory;
    long timeScale;
    
    static {
        FlatPackageWriterImpl.LOG = Logger.getLogger(FlatPackageWriterImpl.class.getName());
    }
    
    public FlatPackageWriterImpl() {
        this.timeScale = 10000000L;
        this.ismvBuilder = new FragmentedMp4Builder();
        final SyncSampleIntersectFinderImpl intersectionFinder = new SyncSampleIntersectFinderImpl();
        this.ismvBuilder.setIntersectionFinder(intersectionFinder);
        this.manifestWriter = new FlatManifestWriterImpl(intersectionFinder);
    }
    
    public FlatPackageWriterImpl(final int n) {
        this.timeScale = 10000000L;
        this.ismvBuilder = new FragmentedMp4Builder();
        final SyncSampleIntersectFinderImpl intersectionFinder = new SyncSampleIntersectFinderImpl(n);
        this.ismvBuilder.setIntersectionFinder(intersectionFinder);
        this.manifestWriter = new FlatManifestWriterImpl(intersectionFinder);
    }
    
    private Movie removeUnknownTracks(final Movie movie) {
        final Movie movie2 = new Movie();
        for (final Track track : movie.getTracks()) {
            if ("vide".equals(track.getHandler()) || "soun".equals(track.getHandler())) {
                movie2.addTrack(track);
            }
            else {
                FlatPackageWriterImpl.LOG.fine("Removed track " + track);
            }
        }
        return movie2;
    }
    
    public Movie correctTimescale(final Movie movie) {
        final Movie movie2 = new Movie();
        for (final Track track : movie.getTracks()) {
            movie2.addTrack(new ChangeTimeScaleTrack(track, this.timeScale, this.ismvBuilder.getFragmentIntersectionFinder().sampleNumbers(track, movie)));
        }
        return movie2;
    }
    
    public void setDebugOutput(final boolean debugOutput) {
        this.debugOutput = debugOutput;
    }
    
    public void setIsmvBuilder(final FragmentedMp4Builder ismvBuilder) {
        this.ismvBuilder = ismvBuilder;
        this.manifestWriter = new FlatManifestWriterImpl(ismvBuilder.getFragmentIntersectionFinder());
    }
    
    public void setManifestWriter(final ManifestWriter manifestWriter) {
        this.manifestWriter = manifestWriter;
    }
    
    public void setOutputDirectory(final File outputDirectory) {
        assert outputDirectory.isDirectory();
        this.outputDirectory = outputDirectory;
    }
    
    @Override
    public void write(final Movie movie) throws IOException {
        if (this.debugOutput) {
            this.outputDirectory.mkdirs();
            final Container build = new DefaultMp4Builder().build(movie);
            final FileOutputStream fileOutputStream = new FileOutputStream(new File(this.outputDirectory, "debug_1_muxed.mp4"));
            build.writeContainer(fileOutputStream.getChannel());
            fileOutputStream.close();
        }
        final Movie correctTimescale = this.correctTimescale(this.removeUnknownTracks(movie));
        if (this.debugOutput) {
            final Container build2 = new DefaultMp4Builder().build(correctTimescale);
            final FileOutputStream fileOutputStream2 = new FileOutputStream(new File(this.outputDirectory, "debug_2_timescale.mp4"));
            build2.writeContainer(fileOutputStream2.getChannel());
            fileOutputStream2.close();
        }
        final Container build3 = this.ismvBuilder.build(correctTimescale);
        if (this.debugOutput) {
            final FileOutputStream fileOutputStream3 = new FileOutputStream(new File(this.outputDirectory, "debug_3_fragmented.mp4"));
            build3.writeContainer(fileOutputStream3.getChannel());
            fileOutputStream3.close();
        }
        for (final Track track : correctTimescale.getTracks()) {
            final String string = Long.toString(this.manifestWriter.getBitrate(track));
            final long trackId = track.getTrackMetaData().getTrackId();
            final Iterator<Box> iterator2 = build3.getBoxes().iterator();
            File file;
            if (track.getMediaHeaderBox() instanceof SoundMediaHeaderBox) {
                file = new File(this.outputDirectory, "audio");
            }
            else {
                if (!(track.getMediaHeaderBox() instanceof VideoMediaHeaderBox)) {
                    System.err.println("Skipping Track with handler " + track.getHandler() + " and " + track.getMediaHeaderBox().getClass().getSimpleName());
                    continue;
                }
                file = new File(this.outputDirectory, "video");
            }
            final File file2 = new File(file, string);
            file2.mkdirs();
            FlatPackageWriterImpl.LOG.finer("Created : " + file2.getCanonicalPath());
            final long[] calculateFragmentDurations = this.manifestWriter.calculateFragmentDurations(track, correctTimescale);
            long n = 0L;
            int n2 = 0;
            while (iterator2.hasNext()) {
                final Box box = iterator2.next();
                if (box instanceof MovieFragmentBox) {
                    assert ((MovieFragmentBox)box).getTrackCount() == 1;
                    if (((MovieFragmentBox)box).getTrackNumbers()[0] != trackId) {
                        continue;
                    }
                    final FileOutputStream fileOutputStream4 = new FileOutputStream(new File(file2, Long.toString(n)));
                    final int n3 = n2 + 1;
                    n += calculateFragmentDurations[n2];
                    final FileChannel channel = fileOutputStream4.getChannel();
                    final Box box2 = iterator2.next();
                    assert box2.getType().equals("mdat");
                    box.getBox(channel);
                    box2.getBox(channel);
                    channel.truncate(channel.position());
                    channel.close();
                    n2 = n3;
                }
            }
        }
        final FileWriter fileWriter = new FileWriter(new File(this.outputDirectory, "Manifest"));
        fileWriter.write(this.manifestWriter.getManifest(correctTimescale));
        fileWriter.close();
    }
}
