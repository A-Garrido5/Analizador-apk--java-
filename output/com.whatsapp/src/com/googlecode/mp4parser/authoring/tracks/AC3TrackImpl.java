// 
// Decompiled by Procyon v0.5.30
// 

package com.googlecode.mp4parser.authoring.tracks;

import com.coremedia.iso.boxes.SubSampleInformationBox;
import com.coremedia.iso.boxes.SampleDependencyTypeBox;
import com.coremedia.iso.boxes.SoundMediaHeaderBox;
import com.coremedia.iso.boxes.CompositionTimeToSample;
import com.googlecode.mp4parser.boxes.mp4.objectdescriptors.BitReaderBuffer;
import com.googlecode.mp4parser.authoring.SampleImpl;
import java.nio.ByteBuffer;
import java.util.Date;
import com.coremedia.iso.boxes.Box;
import com.googlecode.mp4parser.boxes.AC3SpecificBox;
import com.coremedia.iso.boxes.sampleentry.AudioSampleEntry;
import java.util.LinkedList;
import java.lang.reflect.Array;
import java.io.IOException;
import com.googlecode.mp4parser.authoring.TrackMetaData;
import com.coremedia.iso.boxes.TimeToSampleBox;
import com.googlecode.mp4parser.authoring.Sample;
import java.util.List;
import com.coremedia.iso.boxes.SampleDescriptionBox;
import java.io.InputStream;
import com.googlecode.mp4parser.authoring.AbstractTrack;

public class AC3TrackImpl extends AbstractTrack
{
    int acmod;
    int[][][][] bitRateAndFrameSizeTable;
    int bitrate;
    int bsid;
    int bsmod;
    int channelCount;
    int frameSize;
    int frmsizecod;
    int fscod;
    private InputStream inputStream;
    private String lang;
    int lfeon;
    boolean readSamples;
    SampleDescriptionBox sampleDescriptionBox;
    int samplerate;
    private List<Sample> samples;
    List<TimeToSampleBox.Entry> stts;
    TrackMetaData trackMetaData;
    
    public AC3TrackImpl(final InputStream inputStream) throws IOException {
        this.trackMetaData = new TrackMetaData();
        this.readSamples = false;
        this.lang = "und";
        this.parse(inputStream);
    }
    
    public AC3TrackImpl(final InputStream inputStream, final String lang) throws IOException {
        this.trackMetaData = new TrackMetaData();
        this.readSamples = false;
        this.lang = "und";
        this.lang = lang;
        this.parse(inputStream);
    }
    
    private boolean calcBitrateAndFrameSize(final int n) {
        final int n2 = n >>> 1;
        final int n3 = n & 0x1;
        if (n2 > 18 || n3 > 1 || this.fscod > 2) {
            return false;
        }
        this.bitrate = this.bitRateAndFrameSizeTable[n2][n3][this.fscod][0];
        this.frameSize = 2 * this.bitRateAndFrameSizeTable[n2][n3][this.fscod][1];
        return true;
    }
    
    private void initBitRateAndFrameSizeTable() {
        this.bitRateAndFrameSizeTable[0][0][0][0] = 32;
        this.bitRateAndFrameSizeTable[0][1][0][0] = 32;
        this.bitRateAndFrameSizeTable[0][0][0][1] = 64;
        this.bitRateAndFrameSizeTable[0][1][0][1] = 64;
        this.bitRateAndFrameSizeTable[1][0][0][0] = 40;
        this.bitRateAndFrameSizeTable[1][1][0][0] = 40;
        this.bitRateAndFrameSizeTable[1][0][0][1] = 80;
        this.bitRateAndFrameSizeTable[1][1][0][1] = 80;
        this.bitRateAndFrameSizeTable[2][0][0][0] = 48;
        this.bitRateAndFrameSizeTable[2][1][0][0] = 48;
        this.bitRateAndFrameSizeTable[2][0][0][1] = 96;
        this.bitRateAndFrameSizeTable[2][1][0][1] = 96;
        this.bitRateAndFrameSizeTable[3][0][0][0] = 56;
        this.bitRateAndFrameSizeTable[3][1][0][0] = 56;
        this.bitRateAndFrameSizeTable[3][0][0][1] = 112;
        this.bitRateAndFrameSizeTable[3][1][0][1] = 112;
        this.bitRateAndFrameSizeTable[4][0][0][0] = 64;
        this.bitRateAndFrameSizeTable[4][1][0][0] = 64;
        this.bitRateAndFrameSizeTable[4][0][0][1] = 128;
        this.bitRateAndFrameSizeTable[4][1][0][1] = 128;
        this.bitRateAndFrameSizeTable[5][0][0][0] = 80;
        this.bitRateAndFrameSizeTable[5][1][0][0] = 80;
        this.bitRateAndFrameSizeTable[5][0][0][1] = 160;
        this.bitRateAndFrameSizeTable[5][1][0][1] = 160;
        this.bitRateAndFrameSizeTable[6][0][0][0] = 96;
        this.bitRateAndFrameSizeTable[6][1][0][0] = 96;
        this.bitRateAndFrameSizeTable[6][0][0][1] = 192;
        this.bitRateAndFrameSizeTable[6][1][0][1] = 192;
        this.bitRateAndFrameSizeTable[7][0][0][0] = 112;
        this.bitRateAndFrameSizeTable[7][1][0][0] = 112;
        this.bitRateAndFrameSizeTable[7][0][0][1] = 224;
        this.bitRateAndFrameSizeTable[7][1][0][1] = 224;
        this.bitRateAndFrameSizeTable[8][0][0][0] = 128;
        this.bitRateAndFrameSizeTable[8][1][0][0] = 128;
        this.bitRateAndFrameSizeTable[8][0][0][1] = 256;
        this.bitRateAndFrameSizeTable[8][1][0][1] = 256;
        this.bitRateAndFrameSizeTable[9][0][0][0] = 160;
        this.bitRateAndFrameSizeTable[9][1][0][0] = 160;
        this.bitRateAndFrameSizeTable[9][0][0][1] = 320;
        this.bitRateAndFrameSizeTable[9][1][0][1] = 320;
        this.bitRateAndFrameSizeTable[10][0][0][0] = 192;
        this.bitRateAndFrameSizeTable[10][1][0][0] = 192;
        this.bitRateAndFrameSizeTable[10][0][0][1] = 384;
        this.bitRateAndFrameSizeTable[10][1][0][1] = 384;
        this.bitRateAndFrameSizeTable[11][0][0][0] = 224;
        this.bitRateAndFrameSizeTable[11][1][0][0] = 224;
        this.bitRateAndFrameSizeTable[11][0][0][1] = 448;
        this.bitRateAndFrameSizeTable[11][1][0][1] = 448;
        this.bitRateAndFrameSizeTable[12][0][0][0] = 256;
        this.bitRateAndFrameSizeTable[12][1][0][0] = 256;
        this.bitRateAndFrameSizeTable[12][0][0][1] = 512;
        this.bitRateAndFrameSizeTable[12][1][0][1] = 512;
        this.bitRateAndFrameSizeTable[13][0][0][0] = 320;
        this.bitRateAndFrameSizeTable[13][1][0][0] = 320;
        this.bitRateAndFrameSizeTable[13][0][0][1] = 640;
        this.bitRateAndFrameSizeTable[13][1][0][1] = 640;
        this.bitRateAndFrameSizeTable[14][0][0][0] = 384;
        this.bitRateAndFrameSizeTable[14][1][0][0] = 384;
        this.bitRateAndFrameSizeTable[14][0][0][1] = 768;
        this.bitRateAndFrameSizeTable[14][1][0][1] = 768;
        this.bitRateAndFrameSizeTable[15][0][0][0] = 448;
        this.bitRateAndFrameSizeTable[15][1][0][0] = 448;
        this.bitRateAndFrameSizeTable[15][0][0][1] = 896;
        this.bitRateAndFrameSizeTable[15][1][0][1] = 896;
        this.bitRateAndFrameSizeTable[16][0][0][0] = 512;
        this.bitRateAndFrameSizeTable[16][1][0][0] = 512;
        this.bitRateAndFrameSizeTable[16][0][0][1] = 1024;
        this.bitRateAndFrameSizeTable[16][1][0][1] = 1024;
        this.bitRateAndFrameSizeTable[17][0][0][0] = 576;
        this.bitRateAndFrameSizeTable[17][1][0][0] = 576;
        this.bitRateAndFrameSizeTable[17][0][0][1] = 1152;
        this.bitRateAndFrameSizeTable[17][1][0][1] = 1152;
        this.bitRateAndFrameSizeTable[18][0][0][0] = 640;
        this.bitRateAndFrameSizeTable[18][1][0][0] = 640;
        this.bitRateAndFrameSizeTable[18][0][0][1] = 1280;
        this.bitRateAndFrameSizeTable[18][1][0][1] = 1280;
        this.bitRateAndFrameSizeTable[0][0][1][0] = 32;
        this.bitRateAndFrameSizeTable[0][1][1][0] = 32;
        this.bitRateAndFrameSizeTable[0][0][1][1] = 69;
        this.bitRateAndFrameSizeTable[0][1][1][1] = 70;
        this.bitRateAndFrameSizeTable[1][0][1][0] = 40;
        this.bitRateAndFrameSizeTable[1][1][1][0] = 40;
        this.bitRateAndFrameSizeTable[1][0][1][1] = 87;
        this.bitRateAndFrameSizeTable[1][1][1][1] = 88;
        this.bitRateAndFrameSizeTable[2][0][1][0] = 48;
        this.bitRateAndFrameSizeTable[2][1][1][0] = 48;
        this.bitRateAndFrameSizeTable[2][0][1][1] = 104;
        this.bitRateAndFrameSizeTable[2][1][1][1] = 105;
        this.bitRateAndFrameSizeTable[3][0][1][0] = 56;
        this.bitRateAndFrameSizeTable[3][1][1][0] = 56;
        this.bitRateAndFrameSizeTable[3][0][1][1] = 121;
        this.bitRateAndFrameSizeTable[3][1][1][1] = 122;
        this.bitRateAndFrameSizeTable[4][0][1][0] = 64;
        this.bitRateAndFrameSizeTable[4][1][1][0] = 64;
        this.bitRateAndFrameSizeTable[4][0][1][1] = 139;
        this.bitRateAndFrameSizeTable[4][1][1][1] = 140;
        this.bitRateAndFrameSizeTable[5][0][1][0] = 80;
        this.bitRateAndFrameSizeTable[5][1][1][0] = 80;
        this.bitRateAndFrameSizeTable[5][0][1][1] = 174;
        this.bitRateAndFrameSizeTable[5][1][1][1] = 175;
        this.bitRateAndFrameSizeTable[6][0][1][0] = 96;
        this.bitRateAndFrameSizeTable[6][1][1][0] = 96;
        this.bitRateAndFrameSizeTable[6][0][1][1] = 208;
        this.bitRateAndFrameSizeTable[6][1][1][1] = 209;
        this.bitRateAndFrameSizeTable[7][0][1][0] = 112;
        this.bitRateAndFrameSizeTable[7][1][1][0] = 112;
        this.bitRateAndFrameSizeTable[7][0][1][1] = 243;
        this.bitRateAndFrameSizeTable[7][1][1][1] = 244;
        this.bitRateAndFrameSizeTable[8][0][1][0] = 128;
        this.bitRateAndFrameSizeTable[8][1][1][0] = 128;
        this.bitRateAndFrameSizeTable[8][0][1][1] = 278;
        this.bitRateAndFrameSizeTable[8][1][1][1] = 279;
        this.bitRateAndFrameSizeTable[9][0][1][0] = 160;
        this.bitRateAndFrameSizeTable[9][1][1][0] = 160;
        this.bitRateAndFrameSizeTable[9][0][1][1] = 348;
        this.bitRateAndFrameSizeTable[9][1][1][1] = 349;
        this.bitRateAndFrameSizeTable[10][0][1][0] = 192;
        this.bitRateAndFrameSizeTable[10][1][1][0] = 192;
        this.bitRateAndFrameSizeTable[10][0][1][1] = 417;
        this.bitRateAndFrameSizeTable[10][1][1][1] = 418;
        this.bitRateAndFrameSizeTable[11][0][1][0] = 224;
        this.bitRateAndFrameSizeTable[11][1][1][0] = 224;
        this.bitRateAndFrameSizeTable[11][0][1][1] = 487;
        this.bitRateAndFrameSizeTable[11][1][1][1] = 488;
        this.bitRateAndFrameSizeTable[12][0][1][0] = 256;
        this.bitRateAndFrameSizeTable[12][1][1][0] = 256;
        this.bitRateAndFrameSizeTable[12][0][1][1] = 557;
        this.bitRateAndFrameSizeTable[12][1][1][1] = 558;
        this.bitRateAndFrameSizeTable[13][0][1][0] = 320;
        this.bitRateAndFrameSizeTable[13][1][1][0] = 320;
        this.bitRateAndFrameSizeTable[13][0][1][1] = 696;
        this.bitRateAndFrameSizeTable[13][1][1][1] = 697;
        this.bitRateAndFrameSizeTable[14][0][1][0] = 384;
        this.bitRateAndFrameSizeTable[14][1][1][0] = 384;
        this.bitRateAndFrameSizeTable[14][0][1][1] = 835;
        this.bitRateAndFrameSizeTable[14][1][1][1] = 836;
        this.bitRateAndFrameSizeTable[15][0][1][0] = 448;
        this.bitRateAndFrameSizeTable[15][1][1][0] = 448;
        this.bitRateAndFrameSizeTable[15][0][1][1] = 975;
        this.bitRateAndFrameSizeTable[15][1][1][1] = 975;
        this.bitRateAndFrameSizeTable[16][0][1][0] = 512;
        this.bitRateAndFrameSizeTable[16][1][1][0] = 512;
        this.bitRateAndFrameSizeTable[16][0][1][1] = 1114;
        this.bitRateAndFrameSizeTable[16][1][1][1] = 1115;
        this.bitRateAndFrameSizeTable[17][0][1][0] = 576;
        this.bitRateAndFrameSizeTable[17][1][1][0] = 576;
        this.bitRateAndFrameSizeTable[17][0][1][1] = 1253;
        this.bitRateAndFrameSizeTable[17][1][1][1] = 1254;
        this.bitRateAndFrameSizeTable[18][0][1][0] = 640;
        this.bitRateAndFrameSizeTable[18][1][1][0] = 640;
        this.bitRateAndFrameSizeTable[18][0][1][1] = 1393;
        this.bitRateAndFrameSizeTable[18][1][1][1] = 1394;
        this.bitRateAndFrameSizeTable[0][0][2][0] = 32;
        this.bitRateAndFrameSizeTable[0][1][2][0] = 32;
        this.bitRateAndFrameSizeTable[0][0][2][1] = 96;
        this.bitRateAndFrameSizeTable[0][1][2][1] = 96;
        this.bitRateAndFrameSizeTable[1][0][2][0] = 40;
        this.bitRateAndFrameSizeTable[1][1][2][0] = 40;
        this.bitRateAndFrameSizeTable[1][0][2][1] = 120;
        this.bitRateAndFrameSizeTable[1][1][2][1] = 120;
        this.bitRateAndFrameSizeTable[2][0][2][0] = 48;
        this.bitRateAndFrameSizeTable[2][1][2][0] = 48;
        this.bitRateAndFrameSizeTable[2][0][2][1] = 144;
        this.bitRateAndFrameSizeTable[2][1][2][1] = 144;
        this.bitRateAndFrameSizeTable[3][0][2][0] = 56;
        this.bitRateAndFrameSizeTable[3][1][2][0] = 56;
        this.bitRateAndFrameSizeTable[3][0][2][1] = 168;
        this.bitRateAndFrameSizeTable[3][1][2][1] = 168;
        this.bitRateAndFrameSizeTable[4][0][2][0] = 64;
        this.bitRateAndFrameSizeTable[4][1][2][0] = 64;
        this.bitRateAndFrameSizeTable[4][0][2][1] = 192;
        this.bitRateAndFrameSizeTable[4][1][2][1] = 192;
        this.bitRateAndFrameSizeTable[5][0][2][0] = 80;
        this.bitRateAndFrameSizeTable[5][1][2][0] = 80;
        this.bitRateAndFrameSizeTable[5][0][2][1] = 240;
        this.bitRateAndFrameSizeTable[5][1][2][1] = 240;
        this.bitRateAndFrameSizeTable[6][0][2][0] = 96;
        this.bitRateAndFrameSizeTable[6][1][2][0] = 96;
        this.bitRateAndFrameSizeTable[6][0][2][1] = 288;
        this.bitRateAndFrameSizeTable[6][1][2][1] = 288;
        this.bitRateAndFrameSizeTable[7][0][2][0] = 112;
        this.bitRateAndFrameSizeTable[7][1][2][0] = 112;
        this.bitRateAndFrameSizeTable[7][0][2][1] = 336;
        this.bitRateAndFrameSizeTable[7][1][2][1] = 336;
        this.bitRateAndFrameSizeTable[8][0][2][0] = 128;
        this.bitRateAndFrameSizeTable[8][1][2][0] = 128;
        this.bitRateAndFrameSizeTable[8][0][2][1] = 384;
        this.bitRateAndFrameSizeTable[8][1][2][1] = 384;
        this.bitRateAndFrameSizeTable[9][0][2][0] = 160;
        this.bitRateAndFrameSizeTable[9][1][2][0] = 160;
        this.bitRateAndFrameSizeTable[9][0][2][1] = 480;
        this.bitRateAndFrameSizeTable[9][1][2][1] = 480;
        this.bitRateAndFrameSizeTable[10][0][2][0] = 192;
        this.bitRateAndFrameSizeTable[10][1][2][0] = 192;
        this.bitRateAndFrameSizeTable[10][0][2][1] = 576;
        this.bitRateAndFrameSizeTable[10][1][2][1] = 576;
        this.bitRateAndFrameSizeTable[11][0][2][0] = 224;
        this.bitRateAndFrameSizeTable[11][1][2][0] = 224;
        this.bitRateAndFrameSizeTable[11][0][2][1] = 672;
        this.bitRateAndFrameSizeTable[11][1][2][1] = 672;
        this.bitRateAndFrameSizeTable[12][0][2][0] = 256;
        this.bitRateAndFrameSizeTable[12][1][2][0] = 256;
        this.bitRateAndFrameSizeTable[12][0][2][1] = 768;
        this.bitRateAndFrameSizeTable[12][1][2][1] = 768;
        this.bitRateAndFrameSizeTable[13][0][2][0] = 320;
        this.bitRateAndFrameSizeTable[13][1][2][0] = 320;
        this.bitRateAndFrameSizeTable[13][0][2][1] = 960;
        this.bitRateAndFrameSizeTable[13][1][2][1] = 960;
        this.bitRateAndFrameSizeTable[14][0][2][0] = 384;
        this.bitRateAndFrameSizeTable[14][1][2][0] = 384;
        this.bitRateAndFrameSizeTable[14][0][2][1] = 1152;
        this.bitRateAndFrameSizeTable[14][1][2][1] = 1152;
        this.bitRateAndFrameSizeTable[15][0][2][0] = 448;
        this.bitRateAndFrameSizeTable[15][1][2][0] = 448;
        this.bitRateAndFrameSizeTable[15][0][2][1] = 1344;
        this.bitRateAndFrameSizeTable[15][1][2][1] = 1344;
        this.bitRateAndFrameSizeTable[16][0][2][0] = 512;
        this.bitRateAndFrameSizeTable[16][1][2][0] = 512;
        this.bitRateAndFrameSizeTable[16][0][2][1] = 1536;
        this.bitRateAndFrameSizeTable[16][1][2][1] = 1536;
        this.bitRateAndFrameSizeTable[17][0][2][0] = 576;
        this.bitRateAndFrameSizeTable[17][1][2][0] = 576;
        this.bitRateAndFrameSizeTable[17][0][2][1] = 1728;
        this.bitRateAndFrameSizeTable[17][1][2][1] = 1728;
        this.bitRateAndFrameSizeTable[18][0][2][0] = 640;
        this.bitRateAndFrameSizeTable[18][1][2][0] = 640;
        this.bitRateAndFrameSizeTable[18][0][2][1] = 1920;
        this.bitRateAndFrameSizeTable[18][1][2][1] = 1920;
    }
    
    private void parse(final InputStream inputStream) throws IOException {
        this.inputStream = inputStream;
        this.bitRateAndFrameSizeTable = (int[][][][])Array.newInstance(Integer.TYPE, 19, 2, 3, 2);
        this.stts = new LinkedList<TimeToSampleBox.Entry>();
        this.initBitRateAndFrameSizeTable();
        if (!this.readVariables()) {
            throw new IOException();
        }
        this.sampleDescriptionBox = new SampleDescriptionBox();
        final AudioSampleEntry audioSampleEntry = new AudioSampleEntry("ac-3");
        audioSampleEntry.setChannelCount(2);
        audioSampleEntry.setSampleRate(this.samplerate);
        audioSampleEntry.setDataReferenceIndex(1);
        audioSampleEntry.setSampleSize(16);
        final AC3SpecificBox ac3SpecificBox = new AC3SpecificBox();
        ac3SpecificBox.setAcmod(this.acmod);
        ac3SpecificBox.setBitRateCode(this.frmsizecod >> 1);
        ac3SpecificBox.setBsid(this.bsid);
        ac3SpecificBox.setBsmod(this.bsmod);
        ac3SpecificBox.setFscod(this.fscod);
        ac3SpecificBox.setLfeon(this.lfeon);
        ac3SpecificBox.setReserved(0);
        audioSampleEntry.addBox(ac3SpecificBox);
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
        boolean readSamples = true;
        if (!this.readSamples) {
            this.readSamples = readSamples;
            final byte[] array = new byte[5];
            readSamples = false;
            this.inputStream.mark(5);
            while (-1 != this.inputStream.read(array)) {
                readSamples = true;
                this.calcBitrateAndFrameSize(0x3F & array[4]);
                this.inputStream.reset();
                final byte[] array2 = new byte[this.frameSize];
                this.inputStream.read(array2);
                this.samples.add(new SampleImpl(ByteBuffer.wrap(array2)));
                this.stts.add(new TimeToSampleBox.Entry(1L, 1536L));
                this.inputStream.mark(5);
            }
        }
        return readSamples;
    }
    
    private boolean readVariables() throws IOException {
        final byte[] array = new byte[100];
        this.inputStream.mark(100);
        if (100 == this.inputStream.read(array, 0, 100)) {
            this.inputStream.reset();
            final BitReaderBuffer bitReaderBuffer = new BitReaderBuffer(ByteBuffer.wrap(array));
            if (bitReaderBuffer.readBits(16) == 2935) {
                bitReaderBuffer.readBits(16);
                switch (this.fscod = bitReaderBuffer.readBits(2)) {
                    case 0: {
                        this.samplerate = 48000;
                        break;
                    }
                    case 1: {
                        this.samplerate = 44100;
                        break;
                    }
                    case 2: {
                        this.samplerate = 32000;
                        break;
                    }
                    case 3: {
                        this.samplerate = 0;
                        break;
                    }
                }
                if (this.samplerate != 0) {
                    this.frmsizecod = bitReaderBuffer.readBits(6);
                    if (this.calcBitrateAndFrameSize(this.frmsizecod) && this.frameSize != 0) {
                        this.bsid = bitReaderBuffer.readBits(5);
                        this.bsmod = bitReaderBuffer.readBits(3);
                        this.acmod = bitReaderBuffer.readBits(3);
                        if (this.bsid == 9) {
                            this.samplerate /= 2;
                        }
                        else if (this.bsid != 8 && this.bsid != 6) {
                            return false;
                        }
                        if (this.acmod != 1 && (0x1 & this.acmod) == 0x1) {
                            bitReaderBuffer.readBits(2);
                        }
                        if ((0x4 & this.acmod) != 0x0) {
                            bitReaderBuffer.readBits(2);
                        }
                        if (this.acmod == 2) {
                            bitReaderBuffer.readBits(2);
                        }
                        switch (this.acmod) {
                            case 0: {
                                this.channelCount = 2;
                                break;
                            }
                            case 1: {
                                this.channelCount = 1;
                                break;
                            }
                            case 2: {
                                this.channelCount = 2;
                                break;
                            }
                            case 3: {
                                this.channelCount = 3;
                                break;
                            }
                            case 4: {
                                this.channelCount = 3;
                                break;
                            }
                            case 5: {
                                this.channelCount = 4;
                                break;
                            }
                            case 6: {
                                this.channelCount = 4;
                                break;
                            }
                            case 7: {
                                this.channelCount = 5;
                                break;
                            }
                        }
                        this.lfeon = bitReaderBuffer.readBits(1);
                        if (this.lfeon == 1) {
                            ++this.channelCount;
                        }
                        return true;
                    }
                }
            }
        }
        return false;
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
    public Box getMediaHeaderBox() {
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
}
