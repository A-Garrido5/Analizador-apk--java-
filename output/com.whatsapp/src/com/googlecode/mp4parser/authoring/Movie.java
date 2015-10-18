// 
// Decompiled by Procyon v0.5.30
// 

package com.googlecode.mp4parser.authoring;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import com.googlecode.mp4parser.util.Matrix;

public class Movie
{
    Matrix matrix;
    List<Track> tracks;
    
    public Movie() {
        this.matrix = Matrix.ROTATE_0;
        this.tracks = new LinkedList<Track>();
    }
    
    public static long gcd(final long n, final long n2) {
        if (n2 == 0L) {
            return n;
        }
        return gcd(n2, n % n2);
    }
    
    public void addTrack(final Track track) {
        if (this.getTrackByTrackId(track.getTrackMetaData().getTrackId()) != null) {
            track.getTrackMetaData().setTrackId(this.getNextTrackId());
        }
        this.tracks.add(track);
    }
    
    public Matrix getMatrix() {
        return this.matrix;
    }
    
    public long getNextTrackId() {
        long trackId = 0L;
        for (final Track track : this.tracks) {
            if (trackId < track.getTrackMetaData().getTrackId()) {
                trackId = track.getTrackMetaData().getTrackId();
            }
        }
        return trackId + 1L;
    }
    
    public long getTimescale() {
        long n = this.getTracks().iterator().next().getTrackMetaData().getTimescale();
        final Iterator<Track> iterator = this.getTracks().iterator();
        while (iterator.hasNext()) {
            n = gcd(iterator.next().getTrackMetaData().getTimescale(), n);
        }
        return n;
    }
    
    public Track getTrackByTrackId(final long n) {
        for (final Track track : this.tracks) {
            if (track.getTrackMetaData().getTrackId() == n) {
                return track;
            }
        }
        return null;
    }
    
    public List<Track> getTracks() {
        return this.tracks;
    }
    
    public void setMatrix(final Matrix matrix) {
        this.matrix = matrix;
    }
    
    public void setTracks(final List<Track> tracks) {
        this.tracks = tracks;
    }
    
    @Override
    public String toString() {
        String string = "Movie{ ";
        for (final Track track : this.tracks) {
            string = String.valueOf(string) + "track_" + track.getTrackMetaData().getTrackId() + " (" + track.getHandler() + ") ";
        }
        return String.valueOf(string) + '}';
    }
}
