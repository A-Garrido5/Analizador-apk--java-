// 
// Decompiled by Procyon v0.5.30
// 

package com.googlecode.mp4parser.authoring.tracks;

import com.googlecode.mp4parser.h264.read.CAVLCReader;
import java.nio.MappedByteBuffer;
import java.io.FilterInputStream;
import com.coremedia.iso.boxes.SubSampleInformationBox;
import com.coremedia.iso.boxes.VideoMediaHeaderBox;
import com.coremedia.iso.boxes.AbstractMediaHeaderBox;
import java.util.Iterator;
import com.googlecode.mp4parser.authoring.SampleImpl;
import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.Date;
import com.coremedia.iso.boxes.Box;
import com.coremedia.iso.boxes.h264.AvcConfigurationBox;
import com.coremedia.iso.boxes.sampleentry.VisualSampleEntry;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.io.IOException;
import java.nio.channels.FileChannel;
import com.googlecode.mp4parser.authoring.TrackMetaData;
import com.coremedia.iso.boxes.TimeToSampleBox;
import com.googlecode.mp4parser.h264.model.SeqParameterSet;
import com.coremedia.iso.boxes.SampleDependencyTypeBox;
import com.googlecode.mp4parser.authoring.Sample;
import com.coremedia.iso.boxes.SampleDescriptionBox;
import java.util.LinkedList;
import com.googlecode.mp4parser.h264.model.PictureParameterSet;
import com.coremedia.iso.boxes.CompositionTimeToSample;
import java.util.List;
import java.util.logging.Logger;
import com.googlecode.mp4parser.authoring.AbstractTrack;

public class H264TrackImpl extends AbstractTrack
{
    private static final Logger LOG;
    List<CompositionTimeToSample.Entry> ctts;
    private int currentScSize;
    private boolean determineFrameRate;
    int frameNrInGop;
    private int frametick;
    private int height;
    private String lang;
    PictureParameterSet pictureParameterSet;
    LinkedList<byte[]> pictureParameterSetList;
    private int prevScSize;
    boolean readSamples;
    private ReaderWrapper reader;
    SampleDescriptionBox sampleDescriptionBox;
    private List<Sample> samples;
    List<SampleDependencyTypeBox.Entry> sdtp;
    private SEIMessage seiMessage;
    SeqParameterSet seqParameterSet;
    LinkedList<byte[]> seqParameterSetList;
    List<Integer> stss;
    List<TimeToSampleBox.Entry> stts;
    private long timescale;
    TrackMetaData trackMetaData;
    private int width;
    
    static /* synthetic */ int[] $SWITCH_TABLE$com$googlecode$mp4parser$authoring$tracks$H264TrackImpl$NALActions() {
        final int[] $switch_TABLE$com$googlecode$mp4parser$authoring$tracks$H264TrackImpl$NALActions = H264TrackImpl.$SWITCH_TABLE$com$googlecode$mp4parser$authoring$tracks$H264TrackImpl$NALActions;
        if ($switch_TABLE$com$googlecode$mp4parser$authoring$tracks$H264TrackImpl$NALActions != null) {
            return $switch_TABLE$com$googlecode$mp4parser$authoring$tracks$H264TrackImpl$NALActions;
        }
        final int[] $switch_TABLE$com$googlecode$mp4parser$authoring$tracks$H264TrackImpl$NALActions2 = new int[NALActions.values().length];
        while (true) {
            try {
                $switch_TABLE$com$googlecode$mp4parser$authoring$tracks$H264TrackImpl$NALActions2[NALActions.BUFFER.ordinal()] = 2;
                try {
                    $switch_TABLE$com$googlecode$mp4parser$authoring$tracks$H264TrackImpl$NALActions2[NALActions.END.ordinal()] = 4;
                    try {
                        $switch_TABLE$com$googlecode$mp4parser$authoring$tracks$H264TrackImpl$NALActions2[NALActions.IGNORE.ordinal()] = 1;
                        try {
                            $switch_TABLE$com$googlecode$mp4parser$authoring$tracks$H264TrackImpl$NALActions2[NALActions.STORE.ordinal()] = 3;
                            return H264TrackImpl.$SWITCH_TABLE$com$googlecode$mp4parser$authoring$tracks$H264TrackImpl$NALActions = $switch_TABLE$com$googlecode$mp4parser$authoring$tracks$H264TrackImpl$NALActions2;
                        }
                        catch (NoSuchFieldError noSuchFieldError) {}
                    }
                    catch (NoSuchFieldError noSuchFieldError2) {}
                }
                catch (NoSuchFieldError noSuchFieldError3) {}
            }
            catch (NoSuchFieldError noSuchFieldError4) {
                continue;
            }
            break;
        }
    }
    
    static {
        LOG = Logger.getLogger(H264TrackImpl.class.getName());
    }
    
    public H264TrackImpl(final FileChannel fileChannel) throws IOException {
        this.trackMetaData = new TrackMetaData();
        this.readSamples = false;
        this.seqParameterSet = null;
        this.pictureParameterSet = null;
        this.seqParameterSetList = new LinkedList<byte[]>();
        this.pictureParameterSetList = new LinkedList<byte[]>();
        this.frameNrInGop = 0;
        this.determineFrameRate = true;
        this.lang = "eng";
        this.parse(fileChannel);
    }
    
    public H264TrackImpl(final FileChannel fileChannel, final String lang) throws IOException {
        this.trackMetaData = new TrackMetaData();
        this.readSamples = false;
        this.seqParameterSet = null;
        this.pictureParameterSet = null;
        this.seqParameterSetList = new LinkedList<byte[]>();
        this.pictureParameterSetList = new LinkedList<byte[]>();
        this.frameNrInGop = 0;
        this.determineFrameRate = true;
        this.lang = "eng";
        this.lang = lang;
        this.parse(fileChannel);
    }
    
    public H264TrackImpl(final FileChannel fileChannel, final String lang, final long timescale, final int frametick) throws IOException {
        this.trackMetaData = new TrackMetaData();
        this.readSamples = false;
        this.seqParameterSet = null;
        this.pictureParameterSet = null;
        this.seqParameterSetList = new LinkedList<byte[]>();
        this.pictureParameterSetList = new LinkedList<byte[]>();
        this.frameNrInGop = 0;
        this.determineFrameRate = true;
        this.lang = "eng";
        this.lang = lang;
        this.timescale = timescale;
        this.frametick = frametick;
        if (timescale > 0L && frametick > 0) {
            this.determineFrameRate = false;
        }
        this.parse(fileChannel);
    }
    
    private void configureFramerate() {
        if (this.determineFrameRate) {
            if (this.seqParameterSet.vuiParams == null) {
                System.err.println("Warning: Can't determine frame rate. Guessing 25 fps");
                this.timescale = 90000L;
                this.frametick = 3600;
                return;
            }
            this.timescale = this.seqParameterSet.vuiParams.time_scale >> 1;
            this.frametick = this.seqParameterSet.vuiParams.num_units_in_tick;
            if (this.timescale == 0L || this.frametick == 0) {
                System.err.println("Warning: vuiParams contain invalid values: time_scale: " + this.timescale + " and frame_tick: " + this.frametick + ". Setting frame rate to 25fps");
                this.timescale = 90000L;
                this.frametick = 3600;
            }
        }
    }
    
    private boolean findNextStartcode() throws IOException {
        final byte[] array = { -1, -1, -1, -1 };
        while (this.reader.hasRemaining()) {
            array[0] = array[1];
            array[1] = array[2];
            array[2] = array[3];
            array[3] = (byte)this.reader.get();
            if (array[0] == 0 && array[1] == 0 && array[2] == 0 && array[3] == 1) {
                this.prevScSize = this.currentScSize;
                this.currentScSize = 4;
                return true;
            }
            if (array[0] == 0 && array[1] == 0 && array[2] == 1) {
                this.prevScSize = this.currentScSize;
                this.currentScSize = 3;
                return true;
            }
        }
        return false;
    }
    
    private NALActions handleNALUnit(final int n, final int n2, final ByteBuffer byteBuffer) throws IOException {
        switch (n2) {
            default: {
                System.err.println("Unknown NAL unit type: " + n2);
                return NALActions.IGNORE;
            }
            case 1:
            case 2:
            case 3:
            case 4:
            case 5: {
                return NALActions.STORE;
            }
            case 6: {
                this.seiMessage = new SEIMessage(this.cleanBuffer(new ByteBufferBackedInputStream(byteBuffer)), this.seqParameterSet);
                return NALActions.BUFFER;
            }
            case 9: {
                H264TrackImpl.LOG.fine("Access unit delimiter type: " + (byteBuffer.get(1 + byteBuffer.position()) >> 5));
                return NALActions.BUFFER;
            }
            case 7: {
                if (this.seqParameterSet == null) {
                    final InputStream cleanBuffer = this.cleanBuffer(new ByteBufferBackedInputStream(byteBuffer));
                    cleanBuffer.read();
                    this.seqParameterSet = SeqParameterSet.read(cleanBuffer);
                    this.seqParameterSetList.add(toArray(byteBuffer));
                    this.configureFramerate();
                }
                return NALActions.IGNORE;
            }
            case 8: {
                if (this.pictureParameterSet == null) {
                    final ByteBufferBackedInputStream byteBufferBackedInputStream = new ByteBufferBackedInputStream(byteBuffer);
                    byteBufferBackedInputStream.read();
                    this.pictureParameterSet = PictureParameterSet.read(byteBufferBackedInputStream);
                    this.pictureParameterSetList.add(toArray(byteBuffer));
                }
                return NALActions.IGNORE;
            }
            case 10:
            case 11: {
                return NALActions.END;
            }
        }
    }
    
    private void parse(final FileChannel fileChannel) throws IOException {
        this.reader = new ReaderWrapper(fileChannel, (ReaderWrapper)null);
        this.stts = new LinkedList<TimeToSampleBox.Entry>();
        this.ctts = new LinkedList<CompositionTimeToSample.Entry>();
        this.sdtp = new LinkedList<SampleDependencyTypeBox.Entry>();
        this.stss = new LinkedList<Integer>();
        this.samples = new LinkedList<Sample>();
        if (!this.readSamples()) {
            throw new IOException();
        }
        if (!this.readVariables()) {
            throw new IOException();
        }
        this.sampleDescriptionBox = new SampleDescriptionBox();
        final VisualSampleEntry visualSampleEntry = new VisualSampleEntry("avc1");
        visualSampleEntry.setDataReferenceIndex(1);
        visualSampleEntry.setDepth(24);
        visualSampleEntry.setFrameCount(1);
        visualSampleEntry.setHorizresolution(72.0);
        visualSampleEntry.setVertresolution(72.0);
        visualSampleEntry.setWidth(this.width);
        visualSampleEntry.setHeight(this.height);
        visualSampleEntry.setCompressorname("AVC Coding");
        final AvcConfigurationBox avcConfigurationBox = new AvcConfigurationBox();
        avcConfigurationBox.setSequenceParameterSets(this.seqParameterSetList);
        avcConfigurationBox.setPictureParameterSets(this.pictureParameterSetList);
        avcConfigurationBox.setAvcLevelIndication(this.seqParameterSet.level_idc);
        avcConfigurationBox.setAvcProfileIndication(this.seqParameterSet.profile_idc);
        avcConfigurationBox.setBitDepthLumaMinus8(this.seqParameterSet.bit_depth_luma_minus8);
        avcConfigurationBox.setBitDepthChromaMinus8(this.seqParameterSet.bit_depth_chroma_minus8);
        avcConfigurationBox.setChromaFormat(this.seqParameterSet.chroma_format_idc.getId());
        avcConfigurationBox.setConfigurationVersion(1);
        avcConfigurationBox.setLengthSizeMinusOne(3);
        avcConfigurationBox.setProfileCompatibility(this.seqParameterSetList.get(0)[1]);
        visualSampleEntry.addBox(avcConfigurationBox);
        this.sampleDescriptionBox.addBox(visualSampleEntry);
        this.trackMetaData.setCreationTime(new Date());
        this.trackMetaData.setModificationTime(new Date());
        this.trackMetaData.setLanguage(this.lang);
        this.trackMetaData.setTimescale(this.timescale);
        this.trackMetaData.setWidth(this.width);
        this.trackMetaData.setHeight(this.height);
    }
    
    private boolean readSamples() throws IOException {
        if (this.readSamples) {
            return true;
        }
        this.readSamples = true;
        this.findNextStartcode();
        this.reader.mark();
        long pos = this.reader.getPos();
        ArrayList<ByteBuffer> list = new ArrayList<ByteBuffer>();
        int n = 0;
        while (this.findNextStartcode()) {
            final long pos2 = this.reader.getPos();
            final int n2 = (int)(pos2 - pos - this.prevScSize);
            this.reader.reset();
            final ByteBuffer map = this.reader.map(n2);
            final byte value = map.get(map.position());
            final int n3 = 0x3 & value >> 5;
            final byte b = (byte)(value & 0x1F);
            switch ($SWITCH_TABLE$com$googlecode$mp4parser$authoring$tracks$H264TrackImpl$NALActions()[this.handleNALUnit(n3, b, map).ordinal()]) {
                case 2: {
                    list.add(map);
                    break;
                }
                case 3: {
                    int n4 = 22;
                    ++n;
                    list.add(map);
                    boolean b2 = false;
                    if (b == 5) {
                        n4 += 16;
                        b2 = true;
                    }
                    if (new SliceHeader(this.cleanBuffer(new ByteBufferBackedInputStream(list.get(-1 + list.size()))), this.seqParameterSet, this.pictureParameterSet, b2).slice_type == SliceType.B) {
                        n4 += 4;
                    }
                    final Sample sample = this.createSample(list);
                    list = new ArrayList<ByteBuffer>();
                    this.samples.add(sample);
                    this.stts.add(new TimeToSampleBox.Entry(1L, this.frametick));
                    if (b == 5) {
                        this.stss.add(n);
                    }
                    if (this.seiMessage == null || this.seiMessage.n_frames == 0) {
                        this.frameNrInGop = 0;
                    }
                    int n5;
                    if (this.seiMessage != null && this.seiMessage.clock_timestamp_flag) {
                        n5 = this.seiMessage.n_frames - this.frameNrInGop;
                    }
                    else {
                        final SEIMessage seiMessage = this.seiMessage;
                        n5 = 0;
                        if (seiMessage != null) {
                            final boolean removal_delay_flag = this.seiMessage.removal_delay_flag;
                            n5 = 0;
                            if (removal_delay_flag) {
                                n5 = this.seiMessage.dpb_removal_delay / 2;
                            }
                        }
                    }
                    this.ctts.add(new CompositionTimeToSample.Entry(1, n5 * this.frametick));
                    this.sdtp.add(new SampleDependencyTypeBox.Entry(n4));
                    ++this.frameNrInGop;
                    break;
                }
                case 4: {
                    return true;
                }
            }
            pos = pos2;
            this.reader.seek(this.currentScSize);
            this.reader.mark();
        }
        return true;
    }
    
    private boolean readVariables() {
        this.width = 16 * (1 + this.seqParameterSet.pic_width_in_mbs_minus1);
        int n = 2;
        if (this.seqParameterSet.frame_mbs_only_flag) {
            n = 1;
        }
        this.height = n * (16 * (1 + this.seqParameterSet.pic_height_in_map_units_minus1));
        if (this.seqParameterSet.frame_cropping_flag) {
            final boolean residual_color_transform_flag = this.seqParameterSet.residual_color_transform_flag;
            int id = 0;
            if (!residual_color_transform_flag) {
                id = this.seqParameterSet.chroma_format_idc.getId();
            }
            int subWidth = 1;
            int n2 = n;
            if (id != 0) {
                subWidth = this.seqParameterSet.chroma_format_idc.getSubWidth();
                n2 = n * this.seqParameterSet.chroma_format_idc.getSubHeight();
            }
            this.width -= subWidth * (this.seqParameterSet.frame_crop_left_offset + this.seqParameterSet.frame_crop_right_offset);
            this.height -= n2 * (this.seqParameterSet.frame_crop_top_offset + this.seqParameterSet.frame_crop_bottom_offset);
        }
        return true;
    }
    
    static byte[] toArray(final ByteBuffer byteBuffer) {
        final ByteBuffer duplicate = byteBuffer.duplicate();
        final byte[] array = new byte[duplicate.remaining()];
        duplicate.get(array, 0, array.length);
        return array;
    }
    
    protected InputStream cleanBuffer(final InputStream inputStream) {
        return new CleanInputStream(inputStream);
    }
    
    protected InputStream cleanBuffer(final byte[] array) {
        return this.cleanBuffer(new ByteArrayInputStream(array));
    }
    
    protected Sample createSample(final List<? extends ByteBuffer> list) {
        final byte[] array = new byte[4 * list.size()];
        final ByteBuffer wrap = ByteBuffer.wrap(array);
        final Iterator<? extends ByteBuffer> iterator = list.iterator();
        while (iterator.hasNext()) {
            wrap.putInt(((ByteBuffer)iterator.next()).remaining());
        }
        final ByteBuffer[] array2 = new ByteBuffer[2 * list.size()];
        for (int i = 0; i < list.size(); ++i) {
            array2[i * 2] = ByteBuffer.wrap(array, i * 4, 4);
            array2[1 + i * 2] = (ByteBuffer)list.get(i);
        }
        return new SampleImpl(array2);
    }
    
    @Override
    public List<CompositionTimeToSample.Entry> getCompositionTimeEntries() {
        return this.ctts;
    }
    
    @Override
    public List<TimeToSampleBox.Entry> getDecodingTimeEntries() {
        return this.stts;
    }
    
    @Override
    public String getHandler() {
        return "vide";
    }
    
    @Override
    public AbstractMediaHeaderBox getMediaHeaderBox() {
        return new VideoMediaHeaderBox();
    }
    
    @Override
    public List<SampleDependencyTypeBox.Entry> getSampleDependencies() {
        return this.sdtp;
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
        final long[] array = new long[this.stss.size()];
        for (int i = 0; i < this.stss.size(); ++i) {
            array[i] = this.stss.get(i);
        }
        return array;
    }
    
    @Override
    public TrackMetaData getTrackMetaData() {
        return this.trackMetaData;
    }
    
    public void printAccessUnitDelimiter(final byte[] array) {
        H264TrackImpl.LOG.fine("Access unit delimiter: " + (array[1] >> 5));
    }
    
    public class ByteBufferBackedInputStream extends InputStream
    {
        private final ByteBuffer buf;
        
        public ByteBufferBackedInputStream(final ByteBuffer byteBuffer) {
            this.buf = byteBuffer.duplicate();
        }
        
        @Override
        public int read() throws IOException {
            if (!this.buf.hasRemaining()) {
                return -1;
            }
            return 0xFF & this.buf.get();
        }
        
        @Override
        public int read(final byte[] array, final int n, final int n2) throws IOException {
            if (!this.buf.hasRemaining()) {
                return -1;
            }
            final int min = Math.min(n2, this.buf.remaining());
            this.buf.get(array, n, min);
            return min;
        }
    }
    
    protected class CleanInputStream extends FilterInputStream
    {
        int prev;
        int prevprev;
        
        CleanInputStream(final InputStream inputStream) {
            super(inputStream);
            this.prevprev = -1;
            this.prev = -1;
        }
        
        @Override
        public boolean markSupported() {
            return false;
        }
        
        @Override
        public int read() throws IOException {
            int prev = super.read();
            if (prev == 3 && this.prevprev == 0 && this.prev == 0) {
                this.prevprev = -1;
                this.prev = -1;
                prev = super.read();
            }
            this.prevprev = this.prev;
            return this.prev = prev;
        }
        
        @Override
        public int read(final byte[] array, final int n, final int n2) throws IOException {
            if (array == null) {
                throw new NullPointerException();
            }
            if (n < 0 || n2 < 0 || n2 > array.length - n) {
                throw new IndexOutOfBoundsException();
            }
            int i;
            if (n2 == 0) {
                i = 0;
            }
            else {
                final int read = this.read();
                if (read == -1) {
                    return -1;
                }
                array[n] = (byte)read;
                i = 1;
                while (i < n2) {
                    try {
                        final int read2 = this.read();
                        if (read2 == -1) {
                            break;
                        }
                        array[n + i] = (byte)read2;
                        ++i;
                    }
                    catch (IOException ex) {
                        return i;
                    }
                }
            }
            return i;
        }
    }
    
    private enum NALActions
    {
        BUFFER("BUFFER", 1), 
        END("END", 3), 
        IGNORE("IGNORE", 0), 
        STORE("STORE", 2);
        
        private NALActions(final String s, final int n) {
        }
    }
    
    private class ReaderWrapper
    {
        final MappedByteBuffer buffer;
        
        private ReaderWrapper(final FileChannel fileChannel) throws IOException {
            this.buffer = fileChannel.map(FileChannel.MapMode.READ_ONLY, fileChannel.position(), fileChannel.size() - fileChannel.position());
        }
        
        int get() throws IOException {
            return this.buffer.get();
        }
        
        public long getPos() throws IOException {
            return this.buffer.position();
        }
        
        boolean hasRemaining() {
            return this.buffer.hasRemaining();
        }
        
        ByteBuffer map(final int n) throws IOException {
            final ByteBuffer duplicate = this.buffer.duplicate();
            duplicate.position(this.buffer.position());
            duplicate.limit(n + duplicate.position());
            this.buffer.position(n + this.buffer.position());
            return duplicate;
        }
        
        public void mark() throws IOException {
            this.buffer.mark();
        }
        
        public void reset() throws IOException {
            this.buffer.reset();
        }
        
        void seek(final int n) throws IOException {
            this.buffer.position(n + this.buffer.position());
        }
    }
    
    public class SEIMessage
    {
        boolean clock_timestamp_flag;
        int cnt_dropped_flag;
        int counting_type;
        int cpb_removal_delay;
        int ct_type;
        int discontinuity_flag;
        int dpb_removal_delay;
        int full_timestamp_flag;
        int hours_value;
        int minutes_value;
        int n_frames;
        int nuit_field_based_flag;
        int payloadSize;
        int payloadType;
        int pic_struct;
        boolean removal_delay_flag;
        int seconds_value;
        SeqParameterSet sps;
        int time_offset;
        int time_offset_length;
        
        public SEIMessage(final InputStream inputStream, final SeqParameterSet sps) throws IOException {
            this.payloadType = 0;
            this.payloadSize = 0;
            this.sps = sps;
            inputStream.read();
            final int available = inputStream.available();
            int i = 0;
            while (i < available) {
                this.payloadType = 0;
                this.payloadSize = 0;
                int j;
                int n;
                for (j = inputStream.read(), n = i + 1; j == 255; j = inputStream.read(), ++n) {
                    this.payloadType += j;
                }
                this.payloadType += j;
                int k;
                for (k = inputStream.read(), i = n + 1; k == 255; k = inputStream.read(), ++i) {
                    this.payloadSize += k;
                }
                this.payloadSize += k;
                if (available - i >= this.payloadSize) {
                    if (this.payloadType == 1) {
                        if (sps.vuiParams != null && (sps.vuiParams.nalHRDParams != null || sps.vuiParams.vclHRDParams != null || sps.vuiParams.pic_struct_present_flag)) {
                            final byte[] array = new byte[this.payloadSize];
                            inputStream.read(array);
                            i += this.payloadSize;
                            final CAVLCReader cavlcReader = new CAVLCReader(new ByteArrayInputStream(array));
                            if (sps.vuiParams.nalHRDParams != null || sps.vuiParams.vclHRDParams != null) {
                                this.removal_delay_flag = true;
                                this.cpb_removal_delay = cavlcReader.readU(1 + sps.vuiParams.nalHRDParams.cpb_removal_delay_length_minus1, "SEI: cpb_removal_delay");
                                this.dpb_removal_delay = cavlcReader.readU(1 + sps.vuiParams.nalHRDParams.dpb_output_delay_length_minus1, "SEI: dpb_removal_delay");
                            }
                            else {
                                this.removal_delay_flag = false;
                            }
                            if (sps.vuiParams.pic_struct_present_flag) {
                                int n2 = 0;
                                switch (this.pic_struct = cavlcReader.readU(4, "SEI: pic_struct")) {
                                    default: {
                                        n2 = 1;
                                        break;
                                    }
                                    case 3:
                                    case 4:
                                    case 7: {
                                        n2 = 2;
                                        break;
                                    }
                                    case 5:
                                    case 6:
                                    case 8: {
                                        n2 = 3;
                                        break;
                                    }
                                }
                                for (int l = 0; l < n2; ++l) {
                                    this.clock_timestamp_flag = cavlcReader.readBool("pic_timing SEI: clock_timestamp_flag[" + l + "]");
                                    if (this.clock_timestamp_flag) {
                                        this.ct_type = cavlcReader.readU(2, "pic_timing SEI: ct_type");
                                        this.nuit_field_based_flag = cavlcReader.readU(1, "pic_timing SEI: nuit_field_based_flag");
                                        this.counting_type = cavlcReader.readU(5, "pic_timing SEI: counting_type");
                                        this.full_timestamp_flag = cavlcReader.readU(1, "pic_timing SEI: full_timestamp_flag");
                                        this.discontinuity_flag = cavlcReader.readU(1, "pic_timing SEI: discontinuity_flag");
                                        this.cnt_dropped_flag = cavlcReader.readU(1, "pic_timing SEI: cnt_dropped_flag");
                                        this.n_frames = cavlcReader.readU(8, "pic_timing SEI: n_frames");
                                        if (this.full_timestamp_flag == 1) {
                                            this.seconds_value = cavlcReader.readU(6, "pic_timing SEI: seconds_value");
                                            this.minutes_value = cavlcReader.readU(6, "pic_timing SEI: minutes_value");
                                            this.hours_value = cavlcReader.readU(5, "pic_timing SEI: hours_value");
                                        }
                                        else if (cavlcReader.readBool("pic_timing SEI: seconds_flag")) {
                                            this.seconds_value = cavlcReader.readU(6, "pic_timing SEI: seconds_value");
                                            if (cavlcReader.readBool("pic_timing SEI: minutes_flag")) {
                                                this.minutes_value = cavlcReader.readU(6, "pic_timing SEI: minutes_value");
                                                if (cavlcReader.readBool("pic_timing SEI: hours_flag")) {
                                                    this.hours_value = cavlcReader.readU(5, "pic_timing SEI: hours_value");
                                                }
                                            }
                                        }
                                        if (sps.vuiParams.nalHRDParams != null) {
                                            this.time_offset_length = sps.vuiParams.nalHRDParams.time_offset_length;
                                        }
                                        else if (sps.vuiParams.vclHRDParams != null) {
                                            this.time_offset_length = sps.vuiParams.vclHRDParams.time_offset_length;
                                        }
                                        else {
                                            this.time_offset_length = 24;
                                        }
                                        this.time_offset = cavlcReader.readU(24, "pic_timing SEI: time_offset");
                                    }
                                }
                            }
                        }
                        else {
                            for (int n3 = 0; n3 < this.payloadSize; ++n3) {
                                inputStream.read();
                                ++i;
                            }
                        }
                    }
                    else {
                        for (int n4 = 0; n4 < this.payloadSize; ++n4) {
                            inputStream.read();
                            ++i;
                        }
                    }
                }
                else {
                    i = available;
                }
                H264TrackImpl.LOG.fine(this.toString());
            }
        }
        
        @Override
        public String toString() {
            String s = "SEIMessage{payloadType=" + this.payloadType + ", payloadSize=" + this.payloadSize;
            if (this.payloadType == 1) {
                if (this.sps.vuiParams.nalHRDParams != null || this.sps.vuiParams.vclHRDParams != null) {
                    s = String.valueOf(s) + ", cpb_removal_delay=" + this.cpb_removal_delay + ", dpb_removal_delay=" + this.dpb_removal_delay;
                }
                if (this.sps.vuiParams.pic_struct_present_flag) {
                    s = String.valueOf(s) + ", pic_struct=" + this.pic_struct;
                    if (this.clock_timestamp_flag) {
                        s = String.valueOf(s) + ", ct_type=" + this.ct_type + ", nuit_field_based_flag=" + this.nuit_field_based_flag + ", counting_type=" + this.counting_type + ", full_timestamp_flag=" + this.full_timestamp_flag + ", discontinuity_flag=" + this.discontinuity_flag + ", cnt_dropped_flag=" + this.cnt_dropped_flag + ", n_frames=" + this.n_frames + ", seconds_value=" + this.seconds_value + ", minutes_value=" + this.minutes_value + ", hours_value=" + this.hours_value + ", time_offset_length=" + this.time_offset_length + ", time_offset=" + this.time_offset;
                    }
                }
            }
            return String.valueOf(s) + '}';
        }
    }
    
    public static class SliceHeader
    {
        public boolean bottom_field_flag;
        public int colour_plane_id;
        public int delta_pic_order_cnt_bottom;
        public boolean field_pic_flag;
        public int first_mb_in_slice;
        public int frame_num;
        public int idr_pic_id;
        public int pic_order_cnt_lsb;
        public int pic_parameter_set_id;
        public SliceType slice_type;
        
        public SliceHeader(final InputStream inputStream, final SeqParameterSet set, final PictureParameterSet set2, final boolean b) throws IOException {
            this.field_pic_flag = false;
            this.bottom_field_flag = false;
            inputStream.read();
            final CAVLCReader cavlcReader = new CAVLCReader(inputStream);
            this.first_mb_in_slice = cavlcReader.readUE("SliceHeader: first_mb_in_slice");
            switch (cavlcReader.readUE("SliceHeader: slice_type")) {
                case 0:
                case 5: {
                    this.slice_type = SliceType.P;
                    break;
                }
                case 1:
                case 6: {
                    this.slice_type = SliceType.B;
                    break;
                }
                case 2:
                case 7: {
                    this.slice_type = SliceType.I;
                    break;
                }
                case 3:
                case 8: {
                    this.slice_type = SliceType.SP;
                    break;
                }
                case 4:
                case 9: {
                    this.slice_type = SliceType.SI;
                    break;
                }
            }
            this.pic_parameter_set_id = cavlcReader.readUE("SliceHeader: pic_parameter_set_id");
            if (set.residual_color_transform_flag) {
                this.colour_plane_id = cavlcReader.readU(2, "SliceHeader: colour_plane_id");
            }
            this.frame_num = cavlcReader.readU(4 + set.log2_max_frame_num_minus4, "SliceHeader: frame_num");
            if (!set.frame_mbs_only_flag) {
                this.field_pic_flag = cavlcReader.readBool("SliceHeader: field_pic_flag");
                if (this.field_pic_flag) {
                    this.bottom_field_flag = cavlcReader.readBool("SliceHeader: bottom_field_flag");
                }
            }
            if (b) {
                this.idr_pic_id = cavlcReader.readUE("SliceHeader: idr_pic_id");
                if (set.pic_order_cnt_type == 0) {
                    this.pic_order_cnt_lsb = cavlcReader.readU(4 + set.log2_max_pic_order_cnt_lsb_minus4, "SliceHeader: pic_order_cnt_lsb");
                    if (set2.pic_order_present_flag && !this.field_pic_flag) {
                        this.delta_pic_order_cnt_bottom = cavlcReader.readSE("SliceHeader: delta_pic_order_cnt_bottom");
                    }
                }
            }
        }
        
        @Override
        public String toString() {
            return "SliceHeader{first_mb_in_slice=" + this.first_mb_in_slice + ", slice_type=" + this.slice_type + ", pic_parameter_set_id=" + this.pic_parameter_set_id + ", colour_plane_id=" + this.colour_plane_id + ", frame_num=" + this.frame_num + ", field_pic_flag=" + this.field_pic_flag + ", bottom_field_flag=" + this.bottom_field_flag + ", idr_pic_id=" + this.idr_pic_id + ", pic_order_cnt_lsb=" + this.pic_order_cnt_lsb + ", delta_pic_order_cnt_bottom=" + this.delta_pic_order_cnt_bottom + '}';
        }
        
        public enum SliceType
        {
            B("B", 1), 
            I("I", 2), 
            P("P", 0), 
            SI("SI", 4), 
            SP("SP", 3);
            
            private SliceType(final String s, final int n) {
            }
        }
    }
}
