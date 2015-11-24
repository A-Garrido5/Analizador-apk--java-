// 
// Decompiled by Procyon v0.5.30
// 

package com.coremedia.iso.boxes.mdat;

import com.coremedia.iso.boxes.Container;
import com.googlecode.mp4parser.authoring.samples.DefaultMp4SampleList;
import com.googlecode.mp4parser.authoring.samples.FragmentedMp4SampleList;
import com.coremedia.iso.boxes.fragment.MovieExtendsBox;
import com.coremedia.iso.boxes.Box;
import com.coremedia.iso.IsoFile;
import com.coremedia.iso.boxes.TrackBox;
import java.util.List;
import com.googlecode.mp4parser.authoring.Sample;
import java.util.AbstractList;

public class SampleList extends AbstractList<Sample>
{
    List<Sample> samples;
    
    public SampleList(final TrackBox trackBox, final IsoFile... array) {
        final Container parent = ((Box)trackBox.getParent()).getParent();
        if (!trackBox.getParent().getBoxes(MovieExtendsBox.class).isEmpty()) {
            this.samples = new FragmentedMp4SampleList(trackBox.getTrackHeaderBox().getTrackId(), parent, array);
            return;
        }
        if (array.length > 0) {
            throw new RuntimeException("The TrackBox comes from a standard MP4 file. Only use the additionalFragments param if you are dealing with ( fragmented MP4 files AND additional fragments in standalone files )");
        }
        this.samples = new DefaultMp4SampleList(trackBox.getTrackHeaderBox().getTrackId(), parent);
    }
    
    @Override
    public Sample get(final int n) {
        return this.samples.get(n);
    }
    
    @Override
    public int size() {
        return this.samples.size();
    }
}
