// 
// Decompiled by Procyon v0.5.30
// 

package com.googlecode.mp4parser.authoring.tracks;

import com.coremedia.iso.boxes.SubSampleInformationBox;
import com.coremedia.iso.boxes.SampleDependencyTypeBox;
import com.coremedia.iso.boxes.SoundMediaHeaderBox;
import com.coremedia.iso.boxes.AbstractMediaHeaderBox;
import com.coremedia.iso.boxes.CompositionTimeToSample;
import com.googlecode.mp4parser.boxes.mp4.objectdescriptors.BitReaderBuffer;
import com.googlecode.mp4parser.authoring.SampleImpl;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.Date;
import com.coremedia.iso.boxes.Box;
import com.googlecode.mp4parser.boxes.EC3SpecificBox;
import com.coremedia.iso.boxes.sampleentry.AudioSampleEntry;
import java.io.IOException;
import java.util.LinkedList;
import java.io.InputStream;
import com.googlecode.mp4parser.authoring.TrackMetaData;
import com.coremedia.iso.boxes.TimeToSampleBox;
import com.googlecode.mp4parser.authoring.Sample;
import com.coremedia.iso.boxes.SampleDescriptionBox;
import java.io.BufferedInputStream;
import java.util.List;
import com.googlecode.mp4parser.authoring.AbstractTrack;

public class EC3TrackImpl extends AbstractTrack
{
    int bitrate;
    List<BitStreamInfo> entries;
    int frameSize;
    private BufferedInputStream inputStream;
    private String lang;
    SampleDescriptionBox sampleDescriptionBox;
    int samplerate;
    private List<Sample> samples;
    List<TimeToSampleBox.Entry> stts;
    TrackMetaData trackMetaData;
    
    public EC3TrackImpl(final InputStream inputStream) throws IOException {
        this.trackMetaData = new TrackMetaData();
        this.entries = new LinkedList<BitStreamInfo>();
        this.stts = new LinkedList<TimeToSampleBox.Entry>();
        this.lang = "und";
        this.parse(inputStream);
    }
    
    public EC3TrackImpl(final InputStream inputStream, final String lang) throws IOException {
        this.trackMetaData = new TrackMetaData();
        this.entries = new LinkedList<BitStreamInfo>();
        this.stts = new LinkedList<TimeToSampleBox.Entry>();
        this.lang = "und";
        this.lang = lang;
        this.parse(inputStream);
    }
    
    private void parse(final InputStream inputStream) throws IOException {
        this.inputStream = new BufferedInputStream(inputStream);
        int i = 0;
        this.inputStream.mark(10000);
        while (i == 0) {
            final BitStreamInfo variables = this.readVariables();
            if (variables == null) {
                throw new IOException();
            }
            for (final BitStreamInfo bitStreamInfo : this.entries) {
                if (variables.strmtyp != 1 && bitStreamInfo.substreamid == variables.substreamid) {
                    i = 1;
                }
            }
            if (i != 0) {
                continue;
            }
            this.entries.add(variables);
            final long skip = this.inputStream.skip(variables.frameSize);
            assert skip == variables.frameSize;
        }
        this.inputStream.reset();
        if (this.entries.size() == 0) {
            throw new IOException();
        }
        this.samplerate = this.entries.get(0).samplerate;
        this.sampleDescriptionBox = new SampleDescriptionBox();
        final AudioSampleEntry audioSampleEntry = new AudioSampleEntry("ec-3");
        audioSampleEntry.setChannelCount(2);
        audioSampleEntry.setSampleRate(this.samplerate);
        audioSampleEntry.setDataReferenceIndex(1);
        audioSampleEntry.setSampleSize(16);
        final EC3SpecificBox ec3SpecificBox = new EC3SpecificBox();
        final int[] array = new int[this.entries.size()];
        final int[] array2 = new int[this.entries.size()];
        for (final BitStreamInfo bitStreamInfo2 : this.entries) {
            if (bitStreamInfo2.strmtyp == 1) {
                final int substreamid = bitStreamInfo2.substreamid;
                ++array[substreamid];
                array2[bitStreamInfo2.substreamid] = ((0x100 & bitStreamInfo2.chanmap >> 6) | (0xFF & bitStreamInfo2.chanmap >> 5));
            }
        }
        for (final BitStreamInfo bitStreamInfo3 : this.entries) {
            if (bitStreamInfo3.strmtyp != 1) {
                final EC3SpecificBox.Entry entry = new EC3SpecificBox.Entry();
                entry.fscod = bitStreamInfo3.fscod;
                entry.bsid = bitStreamInfo3.bsid;
                entry.bsmod = bitStreamInfo3.bsmod;
                entry.acmod = bitStreamInfo3.acmod;
                entry.lfeon = bitStreamInfo3.lfeon;
                entry.reserved = 0;
                entry.num_dep_sub = array[bitStreamInfo3.substreamid];
                entry.chan_loc = array2[bitStreamInfo3.substreamid];
                entry.reserved2 = 0;
                ec3SpecificBox.addEntry(entry);
            }
            this.bitrate += bitStreamInfo3.bitrate;
            this.frameSize += bitStreamInfo3.frameSize;
        }
        ec3SpecificBox.setDataRate(this.bitrate / 1000);
        audioSampleEntry.addBox(ec3SpecificBox);
        this.sampleDescriptionBox.addBox(audioSampleEntry);
        this.trackMetaData.setCreationTime(new Date());
        this.trackMetaData.setModificationTime(new Date());
        this.trackMetaData.setLanguage(this.lang);
        this.trackMetaData.setTimescale(this.samplerate);
        this.trackMetaData.setVolume(1.0f);
        this.samples = new LinkedList<Sample>();
        if (!this.readSamples()) {
            throw new IOException();
        }
    }
    
    private boolean readSamples() throws IOException {
        int n = this.frameSize;
        boolean b = false;
        while (this.frameSize == n) {
            b = true;
            final byte[] array = new byte[this.frameSize];
            n = this.inputStream.read(array);
            if (n == this.frameSize) {
                this.samples.add(new SampleImpl(ByteBuffer.wrap(array)));
                this.stts.add(new TimeToSampleBox.Entry(1L, 1536L));
            }
        }
        return b;
    }
    
    private BitStreamInfo readVariables() throws IOException {
        final byte[] array = new byte[200];
        this.inputStream.mark(200);
        if (200 != this.inputStream.read(array, 0, 200)) {
            return null;
        }
        this.inputStream.reset();
        final BitReaderBuffer bitReaderBuffer = new BitReaderBuffer(ByteBuffer.wrap(array));
        if (bitReaderBuffer.readBits(16) != 2935) {
            return null;
        }
        final BitStreamInfo bitStreamInfo = new BitStreamInfo();
        bitStreamInfo.strmtyp = bitReaderBuffer.readBits(2);
        bitStreamInfo.substreamid = bitReaderBuffer.readBits(3);
        bitStreamInfo.frameSize = 2 * (1 + bitReaderBuffer.readBits(11));
        bitStreamInfo.fscod = bitReaderBuffer.readBits(2);
        int bits = -1;
        int bits2;
        if (bitStreamInfo.fscod == 3) {
            bits = bitReaderBuffer.readBits(2);
            bits2 = 3;
        }
        else {
            bits2 = bitReaderBuffer.readBits(2);
        }
        int n = 0;
        switch (bits2) {
            case 0: {
                n = 1;
                break;
            }
            case 1: {
                n = 2;
                break;
            }
            case 2: {
                n = 3;
                break;
            }
            case 3: {
                n = 6;
                break;
            }
        }
        bitStreamInfo.frameSize *= 6 / n;
        bitStreamInfo.acmod = bitReaderBuffer.readBits(3);
        bitStreamInfo.lfeon = bitReaderBuffer.readBits(1);
        bitStreamInfo.bsid = bitReaderBuffer.readBits(5);
        bitReaderBuffer.readBits(5);
        if (1 == bitReaderBuffer.readBits(1)) {
            bitReaderBuffer.readBits(8);
        }
        if (bitStreamInfo.acmod == 0) {
            bitReaderBuffer.readBits(5);
            if (1 == bitReaderBuffer.readBits(1)) {
                bitReaderBuffer.readBits(8);
            }
        }
        if (1 == bitStreamInfo.strmtyp && 1 == bitReaderBuffer.readBits(1)) {
            bitStreamInfo.chanmap = bitReaderBuffer.readBits(16);
        }
        if (1 == bitReaderBuffer.readBits(1)) {
            if (bitStreamInfo.acmod > 2) {
                bitReaderBuffer.readBits(2);
            }
            if (0x1 == (0x1 & bitStreamInfo.acmod) && bitStreamInfo.acmod > 2) {
                bitReaderBuffer.readBits(3);
                bitReaderBuffer.readBits(3);
            }
            if ((0x4 & bitStreamInfo.acmod) > 0) {
                bitReaderBuffer.readBits(3);
                bitReaderBuffer.readBits(3);
            }
            if (1 == bitStreamInfo.lfeon && 1 == bitReaderBuffer.readBits(1)) {
                bitReaderBuffer.readBits(5);
            }
            if (bitStreamInfo.strmtyp == 0) {
                if (1 == bitReaderBuffer.readBits(1)) {
                    bitReaderBuffer.readBits(6);
                }
                if (bitStreamInfo.acmod == 0 && 1 == bitReaderBuffer.readBits(1)) {
                    bitReaderBuffer.readBits(6);
                }
                if (1 == bitReaderBuffer.readBits(1)) {
                    bitReaderBuffer.readBits(6);
                }
                final int bits3 = bitReaderBuffer.readBits(2);
                if (bits3 != 0) {
                    bitReaderBuffer.readBits(5);
                }
                else if (2 == bits3) {
                    bitReaderBuffer.readBits(12);
                }
                else if (3 == bits3) {
                    final int bits4 = bitReaderBuffer.readBits(5);
                    if (1 == bitReaderBuffer.readBits(1)) {
                        bitReaderBuffer.readBits(5);
                        if (1 == bitReaderBuffer.readBits(1)) {
                            bitReaderBuffer.readBits(4);
                        }
                        if (1 == bitReaderBuffer.readBits(1)) {
                            bitReaderBuffer.readBits(4);
                        }
                        if (1 == bitReaderBuffer.readBits(1)) {
                            bitReaderBuffer.readBits(4);
                        }
                        if (1 == bitReaderBuffer.readBits(1)) {
                            bitReaderBuffer.readBits(4);
                        }
                        if (1 == bitReaderBuffer.readBits(1)) {
                            bitReaderBuffer.readBits(4);
                        }
                        if (1 == bitReaderBuffer.readBits(1)) {
                            bitReaderBuffer.readBits(4);
                        }
                        if (1 == bitReaderBuffer.readBits(1)) {
                            bitReaderBuffer.readBits(4);
                        }
                        if (1 == bitReaderBuffer.readBits(1)) {
                            if (1 == bitReaderBuffer.readBits(1)) {
                                bitReaderBuffer.readBits(4);
                            }
                            if (1 == bitReaderBuffer.readBits(1)) {
                                bitReaderBuffer.readBits(4);
                            }
                        }
                    }
                    if (1 == bitReaderBuffer.readBits(1)) {
                        bitReaderBuffer.readBits(5);
                        if (1 == bitReaderBuffer.readBits(1)) {
                            bitReaderBuffer.readBits(7);
                            if (1 == bitReaderBuffer.readBits(1)) {
                                bitReaderBuffer.readBits(8);
                            }
                        }
                    }
                    for (int i = 0; i < bits4 + 2; ++i) {
                        bitReaderBuffer.readBits(8);
                    }
                    bitReaderBuffer.byteSync();
                }
                if (bitStreamInfo.acmod < 2) {
                    if (1 == bitReaderBuffer.readBits(1)) {
                        bitReaderBuffer.readBits(14);
                    }
                    if (bitStreamInfo.acmod == 0 && 1 == bitReaderBuffer.readBits(1)) {
                        bitReaderBuffer.readBits(14);
                    }
                    if (1 == bitReaderBuffer.readBits(1)) {
                        if (bits2 == 0) {
                            bitReaderBuffer.readBits(5);
                        }
                        else {
                            for (int j = 0; j < n; ++j) {
                                if (1 == bitReaderBuffer.readBits(1)) {
                                    bitReaderBuffer.readBits(5);
                                }
                            }
                        }
                    }
                }
            }
        }
        if (1 == bitReaderBuffer.readBits(1)) {
            bitStreamInfo.bsmod = bitReaderBuffer.readBits(3);
        }
        Label_0592: {
            switch (bitStreamInfo.fscod) {
                case 0: {
                    bitStreamInfo.samplerate = 48000;
                    break;
                }
                case 1: {
                    bitStreamInfo.samplerate = 44100;
                    break;
                }
                case 2: {
                    bitStreamInfo.samplerate = 32000;
                    break;
                }
                case 3: {
                    switch (bits) {
                        default: {
                            break Label_0592;
                        }
                        case 0: {
                            bitStreamInfo.samplerate = 24000;
                            break Label_0592;
                        }
                        case 1: {
                            bitStreamInfo.samplerate = 22050;
                            break Label_0592;
                        }
                        case 2: {
                            bitStreamInfo.samplerate = 16000;
                            break Label_0592;
                        }
                        case 3: {
                            bitStreamInfo.samplerate = 0;
                            break Label_0592;
                        }
                    }
                    break;
                }
            }
        }
        if (bitStreamInfo.samplerate == 0) {
            return null;
        }
        bitStreamInfo.bitrate = (int)(8.0 * (bitStreamInfo.samplerate / 1536.0 * bitStreamInfo.frameSize));
        return bitStreamInfo;
    }
    
    @Override
    public List<CompositionTimeToSample.Entry> getCompositionTimeEntries() {
        return null;
    }
    
    @Override
    public List<TimeToSampleBox.Entry> getDecodingTimeEntries() {
        return this.stts;
    }
    
    @Override
    public String getHandler() {
        return "soun";
    }
    
    @Override
    public AbstractMediaHeaderBox getMediaHeaderBox() {
        return new SoundMediaHeaderBox();
    }
    
    @Override
    public List<SampleDependencyTypeBox.Entry> getSampleDependencies() {
        return null;
    }
    
    @Override
    public SampleDescriptionBox getSampleDescriptionBox() {
        return this.sampleDescriptionBox;
    }
    
    @Override
    public List<Sample> getSamples() {
        return this.samples;
    }
    
    @Override
    public SubSampleInformationBox getSubsampleInformationBox() {
        return null;
    }
    
    @Override
    public long[] getSyncSamples() {
        return null;
    }
    
    @Override
    public TrackMetaData getTrackMetaData() {
        return this.trackMetaData;
    }
    
    @Override
    public String toString() {
        return "EC3TrackImpl{bitrate=" + this.bitrate + ", samplerate=" + this.samplerate + ", entries=" + this.entries + '}';
    }
    
    public static class BitStreamInfo extends Entry
    {
        public int bitrate;
        public int chanmap;
        public int frameSize;
        public int samplerate;
        public int strmtyp;
        public int substreamid;
        
        @Override
        public String toString() {
            return "BitStreamInfo{frameSize=" + this.frameSize + ", substreamid=" + this.substreamid + ", bitrate=" + this.bitrate + ", samplerate=" + this.samplerate + ", strmtyp=" + this.strmtyp + ", chanmap=" + this.chanmap + '}';
        }
    }
}
