// 
// Decompiled by Procyon v0.5.30
// 

package com.googlecode.mp4parser.boxes.mp4.objectdescriptors;

import com.coremedia.iso.Hex;
import com.coremedia.iso.IsoTypeWriter;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@Descriptor(objectTypeIndication = 64, tags = { 5 })
public class AudioSpecificConfig extends BaseDescriptor
{
    public static Map<Integer, String> audioObjectTypeMap;
    public static Map<Integer, Integer> samplingFrequencyIndexMap;
    int aacScalefactorDataResilienceFlag;
    int aacSectionDataResilienceFlag;
    int aacSpectralDataResilienceFlag;
    int audioObjectType;
    int channelConfiguration;
    byte[] configBytes;
    int coreCoderDelay;
    int dependsOnCoreCoder;
    int directMapping;
    int epConfig;
    int erHvxcExtensionFlag;
    int extensionAudioObjectType;
    int extensionChannelConfiguration;
    int extensionFlag;
    int extensionFlag3;
    int extensionSamplingFrequency;
    int extensionSamplingFrequencyIndex;
    int fillBits;
    int frameLengthFlag;
    boolean gaSpecificConfig;
    int hilnContMode;
    int hilnEnhaLayer;
    int hilnEnhaQuantMode;
    int hilnFrameLength;
    int hilnMaxNumLine;
    int hilnQuantMode;
    int hilnSampleRateCode;
    int hvxcRateMode;
    int hvxcVarMode;
    int isBaseLayer;
    int layerNr;
    int layer_length;
    int numOfSubFrame;
    int paraExtensionFlag;
    int paraMode;
    boolean parametricSpecificConfig;
    int psPresentFlag;
    int sacPayloadEmbedding;
    int samplingFrequency;
    int samplingFrequencyIndex;
    int sbrPresentFlag;
    int syncExtensionType;
    int var_ScalableFlag;
    
    static {
        AudioSpecificConfig.samplingFrequencyIndexMap = new HashMap<Integer, Integer>();
        AudioSpecificConfig.audioObjectTypeMap = new HashMap<Integer, String>();
        AudioSpecificConfig.samplingFrequencyIndexMap.put(0, 96000);
        AudioSpecificConfig.samplingFrequencyIndexMap.put(1, 88200);
        AudioSpecificConfig.samplingFrequencyIndexMap.put(2, 64000);
        AudioSpecificConfig.samplingFrequencyIndexMap.put(3, 48000);
        AudioSpecificConfig.samplingFrequencyIndexMap.put(4, 44100);
        AudioSpecificConfig.samplingFrequencyIndexMap.put(5, 32000);
        AudioSpecificConfig.samplingFrequencyIndexMap.put(6, 24000);
        AudioSpecificConfig.samplingFrequencyIndexMap.put(7, 22050);
        AudioSpecificConfig.samplingFrequencyIndexMap.put(8, 16000);
        AudioSpecificConfig.samplingFrequencyIndexMap.put(9, 12000);
        AudioSpecificConfig.samplingFrequencyIndexMap.put(10, 11025);
        AudioSpecificConfig.samplingFrequencyIndexMap.put(11, 8000);
        AudioSpecificConfig.audioObjectTypeMap.put(1, "AAC main");
        AudioSpecificConfig.audioObjectTypeMap.put(2, "AAC LC");
        AudioSpecificConfig.audioObjectTypeMap.put(3, "AAC SSR");
        AudioSpecificConfig.audioObjectTypeMap.put(4, "AAC LTP");
        AudioSpecificConfig.audioObjectTypeMap.put(5, "SBR");
        AudioSpecificConfig.audioObjectTypeMap.put(6, "AAC Scalable");
        AudioSpecificConfig.audioObjectTypeMap.put(7, "TwinVQ");
        AudioSpecificConfig.audioObjectTypeMap.put(8, "CELP");
        AudioSpecificConfig.audioObjectTypeMap.put(9, "HVXC");
        AudioSpecificConfig.audioObjectTypeMap.put(10, "(reserved)");
        AudioSpecificConfig.audioObjectTypeMap.put(11, "(reserved)");
        AudioSpecificConfig.audioObjectTypeMap.put(12, "TTSI");
        AudioSpecificConfig.audioObjectTypeMap.put(13, "Main synthetic");
        AudioSpecificConfig.audioObjectTypeMap.put(14, "Wavetable synthesis");
        AudioSpecificConfig.audioObjectTypeMap.put(15, "General MIDI");
        AudioSpecificConfig.audioObjectTypeMap.put(16, "Algorithmic Synthesis and Audio FX");
        AudioSpecificConfig.audioObjectTypeMap.put(17, "ER AAC LC");
        AudioSpecificConfig.audioObjectTypeMap.put(18, "(reserved)");
        AudioSpecificConfig.audioObjectTypeMap.put(19, "ER AAC LTP");
        AudioSpecificConfig.audioObjectTypeMap.put(20, "ER AAC Scalable");
        AudioSpecificConfig.audioObjectTypeMap.put(21, "ER TwinVQ");
        AudioSpecificConfig.audioObjectTypeMap.put(22, "ER BSAC");
        AudioSpecificConfig.audioObjectTypeMap.put(23, "ER AAC LD");
        AudioSpecificConfig.audioObjectTypeMap.put(24, "ER CELP");
        AudioSpecificConfig.audioObjectTypeMap.put(25, "ER HVXC");
        AudioSpecificConfig.audioObjectTypeMap.put(26, "ER HILN");
        AudioSpecificConfig.audioObjectTypeMap.put(27, "ER Parametric");
        AudioSpecificConfig.audioObjectTypeMap.put(28, "SSC");
        AudioSpecificConfig.audioObjectTypeMap.put(29, "PS");
        AudioSpecificConfig.audioObjectTypeMap.put(30, "MPEG Surround");
        AudioSpecificConfig.audioObjectTypeMap.put(31, "(escape)");
        AudioSpecificConfig.audioObjectTypeMap.put(32, "Layer-1");
        AudioSpecificConfig.audioObjectTypeMap.put(33, "Layer-2");
        AudioSpecificConfig.audioObjectTypeMap.put(34, "Layer-3");
        AudioSpecificConfig.audioObjectTypeMap.put(35, "DST");
        AudioSpecificConfig.audioObjectTypeMap.put(36, "ALS");
        AudioSpecificConfig.audioObjectTypeMap.put(37, "SLS");
        AudioSpecificConfig.audioObjectTypeMap.put(38, "SLS non-core");
        AudioSpecificConfig.audioObjectTypeMap.put(39, "ER AAC ELD");
        AudioSpecificConfig.audioObjectTypeMap.put(40, "SMR Simple");
        AudioSpecificConfig.audioObjectTypeMap.put(41, "SMR Main");
    }
    
    private int gaSpecificConfigSize() {
        return 0;
    }
    
    private int getAudioObjectType(final BitReaderBuffer bitReaderBuffer) throws IOException {
        int bits = bitReaderBuffer.readBits(5);
        if (bits == 31) {
            bits = 32 + bitReaderBuffer.readBits(6);
        }
        return bits;
    }
    
    private void parseErHvxcConfig(final int n, final int n2, final int n3, final BitReaderBuffer bitReaderBuffer) throws IOException {
        this.hvxcVarMode = bitReaderBuffer.readBits(1);
        this.hvxcRateMode = bitReaderBuffer.readBits(2);
        this.erHvxcExtensionFlag = bitReaderBuffer.readBits(1);
        if (this.erHvxcExtensionFlag == 1) {
            this.var_ScalableFlag = bitReaderBuffer.readBits(1);
        }
    }
    
    private void parseGaSpecificConfig(final int n, final int n2, final int n3, final BitReaderBuffer bitReaderBuffer) throws IOException {
        this.frameLengthFlag = bitReaderBuffer.readBits(1);
        this.dependsOnCoreCoder = bitReaderBuffer.readBits(1);
        if (this.dependsOnCoreCoder == 1) {
            this.coreCoderDelay = bitReaderBuffer.readBits(14);
        }
        this.extensionFlag = bitReaderBuffer.readBits(1);
        if (n2 == 0) {
            throw new UnsupportedOperationException("can't parse program_config_element yet");
        }
        if (n3 == 6 || n3 == 20) {
            this.layerNr = bitReaderBuffer.readBits(3);
        }
        if (this.extensionFlag == 1) {
            if (n3 == 22) {
                this.numOfSubFrame = bitReaderBuffer.readBits(5);
                this.layer_length = bitReaderBuffer.readBits(11);
            }
            if (n3 == 17 || n3 == 19 || n3 == 20 || n3 == 23) {
                this.aacSectionDataResilienceFlag = bitReaderBuffer.readBits(1);
                this.aacScalefactorDataResilienceFlag = bitReaderBuffer.readBits(1);
                this.aacSpectralDataResilienceFlag = bitReaderBuffer.readBits(1);
            }
            this.extensionFlag3 = bitReaderBuffer.readBits(1);
        }
        this.gaSpecificConfig = true;
    }
    
    private void parseHilnConfig(final int n, final int n2, final int n3, final BitReaderBuffer bitReaderBuffer) throws IOException {
        this.hilnQuantMode = bitReaderBuffer.readBits(1);
        this.hilnMaxNumLine = bitReaderBuffer.readBits(8);
        this.hilnSampleRateCode = bitReaderBuffer.readBits(4);
        this.hilnFrameLength = bitReaderBuffer.readBits(12);
        this.hilnContMode = bitReaderBuffer.readBits(2);
    }
    
    private void parseHilnEnexConfig(final int n, final int n2, final int n3, final BitReaderBuffer bitReaderBuffer) throws IOException {
        this.hilnEnhaLayer = bitReaderBuffer.readBits(1);
        if (this.hilnEnhaLayer == 1) {
            this.hilnEnhaQuantMode = bitReaderBuffer.readBits(2);
        }
    }
    
    private void parseParaConfig(final int n, final int n2, final int n3, final BitReaderBuffer bitReaderBuffer) throws IOException {
        this.paraMode = bitReaderBuffer.readBits(2);
        if (this.paraMode != 1) {
            this.parseErHvxcConfig(n, n2, n3, bitReaderBuffer);
        }
        if (this.paraMode != 0) {
            this.parseHilnConfig(n, n2, n3, bitReaderBuffer);
        }
        this.paraExtensionFlag = bitReaderBuffer.readBits(1);
        this.parametricSpecificConfig = true;
    }
    
    private void parseParametricSpecificConfig(final int n, final int n2, final int n3, final BitReaderBuffer bitReaderBuffer) throws IOException {
        this.isBaseLayer = bitReaderBuffer.readBits(1);
        if (this.isBaseLayer == 1) {
            this.parseParaConfig(n, n2, n3, bitReaderBuffer);
            return;
        }
        this.parseHilnEnexConfig(n, n2, n3, bitReaderBuffer);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this != o) {
            if (o == null || this.getClass() != o.getClass()) {
                return false;
            }
            final AudioSpecificConfig audioSpecificConfig = (AudioSpecificConfig)o;
            if (this.aacScalefactorDataResilienceFlag != audioSpecificConfig.aacScalefactorDataResilienceFlag) {
                return false;
            }
            if (this.aacSectionDataResilienceFlag != audioSpecificConfig.aacSectionDataResilienceFlag) {
                return false;
            }
            if (this.aacSpectralDataResilienceFlag != audioSpecificConfig.aacSpectralDataResilienceFlag) {
                return false;
            }
            if (this.audioObjectType != audioSpecificConfig.audioObjectType) {
                return false;
            }
            if (this.channelConfiguration != audioSpecificConfig.channelConfiguration) {
                return false;
            }
            if (this.coreCoderDelay != audioSpecificConfig.coreCoderDelay) {
                return false;
            }
            if (this.dependsOnCoreCoder != audioSpecificConfig.dependsOnCoreCoder) {
                return false;
            }
            if (this.directMapping != audioSpecificConfig.directMapping) {
                return false;
            }
            if (this.epConfig != audioSpecificConfig.epConfig) {
                return false;
            }
            if (this.erHvxcExtensionFlag != audioSpecificConfig.erHvxcExtensionFlag) {
                return false;
            }
            if (this.extensionAudioObjectType != audioSpecificConfig.extensionAudioObjectType) {
                return false;
            }
            if (this.extensionChannelConfiguration != audioSpecificConfig.extensionChannelConfiguration) {
                return false;
            }
            if (this.extensionFlag != audioSpecificConfig.extensionFlag) {
                return false;
            }
            if (this.extensionFlag3 != audioSpecificConfig.extensionFlag3) {
                return false;
            }
            if (this.extensionSamplingFrequency != audioSpecificConfig.extensionSamplingFrequency) {
                return false;
            }
            if (this.extensionSamplingFrequencyIndex != audioSpecificConfig.extensionSamplingFrequencyIndex) {
                return false;
            }
            if (this.fillBits != audioSpecificConfig.fillBits) {
                return false;
            }
            if (this.frameLengthFlag != audioSpecificConfig.frameLengthFlag) {
                return false;
            }
            if (this.gaSpecificConfig != audioSpecificConfig.gaSpecificConfig) {
                return false;
            }
            if (this.hilnContMode != audioSpecificConfig.hilnContMode) {
                return false;
            }
            if (this.hilnEnhaLayer != audioSpecificConfig.hilnEnhaLayer) {
                return false;
            }
            if (this.hilnEnhaQuantMode != audioSpecificConfig.hilnEnhaQuantMode) {
                return false;
            }
            if (this.hilnFrameLength != audioSpecificConfig.hilnFrameLength) {
                return false;
            }
            if (this.hilnMaxNumLine != audioSpecificConfig.hilnMaxNumLine) {
                return false;
            }
            if (this.hilnQuantMode != audioSpecificConfig.hilnQuantMode) {
                return false;
            }
            if (this.hilnSampleRateCode != audioSpecificConfig.hilnSampleRateCode) {
                return false;
            }
            if (this.hvxcRateMode != audioSpecificConfig.hvxcRateMode) {
                return false;
            }
            if (this.hvxcVarMode != audioSpecificConfig.hvxcVarMode) {
                return false;
            }
            if (this.isBaseLayer != audioSpecificConfig.isBaseLayer) {
                return false;
            }
            if (this.layerNr != audioSpecificConfig.layerNr) {
                return false;
            }
            if (this.layer_length != audioSpecificConfig.layer_length) {
                return false;
            }
            if (this.numOfSubFrame != audioSpecificConfig.numOfSubFrame) {
                return false;
            }
            if (this.paraExtensionFlag != audioSpecificConfig.paraExtensionFlag) {
                return false;
            }
            if (this.paraMode != audioSpecificConfig.paraMode) {
                return false;
            }
            if (this.parametricSpecificConfig != audioSpecificConfig.parametricSpecificConfig) {
                return false;
            }
            if (this.psPresentFlag != audioSpecificConfig.psPresentFlag) {
                return false;
            }
            if (this.sacPayloadEmbedding != audioSpecificConfig.sacPayloadEmbedding) {
                return false;
            }
            if (this.samplingFrequency != audioSpecificConfig.samplingFrequency) {
                return false;
            }
            if (this.samplingFrequencyIndex != audioSpecificConfig.samplingFrequencyIndex) {
                return false;
            }
            if (this.sbrPresentFlag != audioSpecificConfig.sbrPresentFlag) {
                return false;
            }
            if (this.syncExtensionType != audioSpecificConfig.syncExtensionType) {
                return false;
            }
            if (this.var_ScalableFlag != audioSpecificConfig.var_ScalableFlag) {
                return false;
            }
            if (!Arrays.equals(this.configBytes, audioSpecificConfig.configBytes)) {
                return false;
            }
        }
        return true;
    }
    
    public int getAudioObjectType() {
        return this.audioObjectType;
    }
    
    public int getChannelConfiguration() {
        return this.channelConfiguration;
    }
    
    public byte[] getConfigBytes() {
        return this.configBytes;
    }
    
    public int getExtensionAudioObjectType() {
        return this.extensionAudioObjectType;
    }
    
    public int getPsPresentFlag() {
        return this.psPresentFlag;
    }
    
    public int getSamplingFrequency() {
        if (this.samplingFrequencyIndex == 15) {
            return this.samplingFrequency;
        }
        return AudioSpecificConfig.samplingFrequencyIndexMap.get(this.samplingFrequencyIndex);
    }
    
    public int getSbrPresentFlag() {
        return this.sbrPresentFlag;
    }
    
    @Override
    public int hashCode() {
        int n = 1;
        int hashCode;
        if (this.configBytes != null) {
            hashCode = Arrays.hashCode(this.configBytes);
        }
        else {
            hashCode = 0;
        }
        final int n2 = 31 * (31 * (31 * (31 * (31 * (31 * (31 * (31 * (31 * (31 * (31 * (31 * (31 * (31 * (31 * (31 * (31 * (31 * (31 * (31 * (31 * (31 * (31 * (31 * (31 * (31 * (hashCode * 31 + this.audioObjectType) + this.samplingFrequencyIndex) + this.samplingFrequency) + this.channelConfiguration) + this.extensionAudioObjectType) + this.sbrPresentFlag) + this.psPresentFlag) + this.extensionSamplingFrequencyIndex) + this.extensionSamplingFrequency) + this.extensionChannelConfiguration) + this.sacPayloadEmbedding) + this.fillBits) + this.epConfig) + this.directMapping) + this.syncExtensionType) + this.frameLengthFlag) + this.dependsOnCoreCoder) + this.coreCoderDelay) + this.extensionFlag) + this.layerNr) + this.numOfSubFrame) + this.layer_length) + this.aacSectionDataResilienceFlag) + this.aacScalefactorDataResilienceFlag) + this.aacSpectralDataResilienceFlag) + this.extensionFlag3);
        int n3;
        if (this.gaSpecificConfig) {
            n3 = n;
        }
        else {
            n3 = 0;
        }
        final int n4 = 31 * (31 * (31 * (31 * (31 * (31 * (31 * (31 * (31 * (31 * (31 * (31 * (31 * (31 * (31 * (n2 + n3) + this.isBaseLayer) + this.paraMode) + this.paraExtensionFlag) + this.hvxcVarMode) + this.hvxcRateMode) + this.erHvxcExtensionFlag) + this.var_ScalableFlag) + this.hilnQuantMode) + this.hilnMaxNumLine) + this.hilnSampleRateCode) + this.hilnFrameLength) + this.hilnContMode) + this.hilnEnhaLayer) + this.hilnEnhaQuantMode);
        if (!this.parametricSpecificConfig) {
            n = 0;
        }
        return n4 + n;
    }
    
    @Override
    public void parseDetail(final ByteBuffer byteBuffer) throws IOException {
        final ByteBuffer slice = byteBuffer.slice();
        slice.limit(this.sizeOfInstance);
        byteBuffer.position(byteBuffer.position() + this.sizeOfInstance);
        slice.get(this.configBytes = new byte[this.sizeOfInstance]);
        slice.rewind();
        final BitReaderBuffer bitReaderBuffer = new BitReaderBuffer(slice);
        this.audioObjectType = this.getAudioObjectType(bitReaderBuffer);
        this.samplingFrequencyIndex = bitReaderBuffer.readBits(4);
        if (this.samplingFrequencyIndex == 15) {
            this.samplingFrequency = bitReaderBuffer.readBits(24);
        }
        this.channelConfiguration = bitReaderBuffer.readBits(4);
        if (this.audioObjectType == 5 || this.audioObjectType == 29) {
            this.extensionAudioObjectType = 5;
            this.sbrPresentFlag = 1;
            if (this.audioObjectType == 29) {
                this.psPresentFlag = 1;
            }
            this.extensionSamplingFrequencyIndex = bitReaderBuffer.readBits(4);
            if (this.extensionSamplingFrequencyIndex == 15) {
                this.extensionSamplingFrequency = bitReaderBuffer.readBits(24);
            }
            this.audioObjectType = this.getAudioObjectType(bitReaderBuffer);
            if (this.audioObjectType == 22) {
                this.extensionChannelConfiguration = bitReaderBuffer.readBits(4);
            }
        }
        else {
            this.extensionAudioObjectType = 0;
        }
        switch (this.audioObjectType) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 6:
            case 7:
            case 17:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23: {
                this.parseGaSpecificConfig(this.samplingFrequencyIndex, this.channelConfiguration, this.audioObjectType, bitReaderBuffer);
                break;
            }
            case 8: {
                throw new UnsupportedOperationException("can't parse CelpSpecificConfig yet");
            }
            case 9: {
                throw new UnsupportedOperationException("can't parse HvxcSpecificConfig yet");
            }
            case 12: {
                throw new UnsupportedOperationException("can't parse TTSSpecificConfig yet");
            }
            case 13:
            case 14:
            case 15:
            case 16: {
                throw new UnsupportedOperationException("can't parse StructuredAudioSpecificConfig yet");
            }
            case 24: {
                throw new UnsupportedOperationException("can't parse ErrorResilientCelpSpecificConfig yet");
            }
            case 25: {
                throw new UnsupportedOperationException("can't parse ErrorResilientHvxcSpecificConfig yet");
            }
            case 26:
            case 27: {
                this.parseParametricSpecificConfig(this.samplingFrequencyIndex, this.channelConfiguration, this.audioObjectType, bitReaderBuffer);
                break;
            }
            case 28: {
                throw new UnsupportedOperationException("can't parse SSCSpecificConfig yet");
            }
            case 30: {
                this.sacPayloadEmbedding = bitReaderBuffer.readBits(1);
                throw new UnsupportedOperationException("can't parse SpatialSpecificConfig yet");
            }
            case 32:
            case 33:
            case 34: {
                throw new UnsupportedOperationException("can't parse MPEG_1_2_SpecificConfig yet");
            }
            case 35: {
                throw new UnsupportedOperationException("can't parse DSTSpecificConfig yet");
            }
            case 36: {
                this.fillBits = bitReaderBuffer.readBits(5);
                throw new UnsupportedOperationException("can't parse ALSSpecificConfig yet");
            }
            case 37:
            case 38: {
                throw new UnsupportedOperationException("can't parse SLSSpecificConfig yet");
            }
            case 39: {
                throw new UnsupportedOperationException("can't parse ELDSpecificConfig yet");
            }
            case 40:
            case 41: {
                throw new UnsupportedOperationException("can't parse SymbolicMusicSpecificConfig yet");
            }
        }
        switch (this.audioObjectType) {
            case 17:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 39: {
                this.epConfig = bitReaderBuffer.readBits(2);
                if (this.epConfig == 2 || this.epConfig == 3) {
                    throw new UnsupportedOperationException("can't parse ErrorProtectionSpecificConfig yet");
                }
                if (this.epConfig != 3) {
                    break;
                }
                this.directMapping = bitReaderBuffer.readBits(1);
                if (this.directMapping == 0) {
                    throw new RuntimeException("not implemented");
                }
                break;
            }
        }
        if (this.extensionAudioObjectType != 5 && bitReaderBuffer.remainingBits() >= 16) {
            this.syncExtensionType = bitReaderBuffer.readBits(11);
            if (this.syncExtensionType == 695) {
                this.extensionAudioObjectType = this.getAudioObjectType(bitReaderBuffer);
                if (this.extensionAudioObjectType == 5) {
                    this.sbrPresentFlag = bitReaderBuffer.readBits(1);
                    if (this.sbrPresentFlag == 1) {
                        this.extensionSamplingFrequencyIndex = bitReaderBuffer.readBits(4);
                        if (this.extensionSamplingFrequencyIndex == 15) {
                            this.extensionSamplingFrequency = bitReaderBuffer.readBits(24);
                        }
                        if (bitReaderBuffer.remainingBits() >= 12) {
                            this.syncExtensionType = bitReaderBuffer.readBits(11);
                            if (this.syncExtensionType == 1352) {
                                this.psPresentFlag = bitReaderBuffer.readBits(1);
                            }
                        }
                    }
                }
                if (this.extensionAudioObjectType == 22) {
                    this.sbrPresentFlag = bitReaderBuffer.readBits(1);
                    if (this.sbrPresentFlag == 1) {
                        this.extensionSamplingFrequencyIndex = bitReaderBuffer.readBits(4);
                        if (this.extensionSamplingFrequencyIndex == 15) {
                            this.extensionSamplingFrequency = bitReaderBuffer.readBits(24);
                        }
                    }
                    this.extensionChannelConfiguration = bitReaderBuffer.readBits(4);
                }
            }
        }
    }
    
    public ByteBuffer serialize() {
        final ByteBuffer allocate = ByteBuffer.allocate(this.serializedSize());
        IsoTypeWriter.writeUInt8(allocate, 5);
        IsoTypeWriter.writeUInt8(allocate, -2 + this.serializedSize());
        final BitWriterBuffer bitWriterBuffer = new BitWriterBuffer(allocate);
        bitWriterBuffer.writeBits(this.audioObjectType, 5);
        bitWriterBuffer.writeBits(this.samplingFrequencyIndex, 4);
        if (this.samplingFrequencyIndex == 15) {
            throw new UnsupportedOperationException("can't serialize that yet");
        }
        bitWriterBuffer.writeBits(this.channelConfiguration, 4);
        return allocate;
    }
    
    public int serializedSize() {
        if (this.audioObjectType == 2) {
            return 4 + this.gaSpecificConfigSize();
        }
        throw new UnsupportedOperationException("can't serialize that yet");
    }
    
    public void setAudioObjectType(final int audioObjectType) {
        this.audioObjectType = audioObjectType;
    }
    
    public void setChannelConfiguration(final int channelConfiguration) {
        this.channelConfiguration = channelConfiguration;
    }
    
    public void setSamplingFrequency(final int samplingFrequency) {
        this.samplingFrequency = samplingFrequency;
    }
    
    public void setSamplingFrequencyIndex(final int samplingFrequencyIndex) {
        this.samplingFrequencyIndex = samplingFrequencyIndex;
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("AudioSpecificConfig");
        sb.append("{configBytes=").append(Hex.encodeHex(this.configBytes));
        sb.append(", audioObjectType=").append(this.audioObjectType).append(" (").append(AudioSpecificConfig.audioObjectTypeMap.get(this.audioObjectType)).append(")");
        sb.append(", samplingFrequencyIndex=").append(this.samplingFrequencyIndex).append(" (").append(AudioSpecificConfig.samplingFrequencyIndexMap.get(this.samplingFrequencyIndex)).append(")");
        sb.append(", samplingFrequency=").append(this.samplingFrequency);
        sb.append(", channelConfiguration=").append(this.channelConfiguration);
        if (this.extensionAudioObjectType > 0) {
            sb.append(", extensionAudioObjectType=").append(this.extensionAudioObjectType).append(" (").append(AudioSpecificConfig.audioObjectTypeMap.get(this.extensionAudioObjectType)).append(")");
            sb.append(", sbrPresentFlag=").append(this.sbrPresentFlag);
            sb.append(", psPresentFlag=").append(this.psPresentFlag);
            sb.append(", extensionSamplingFrequencyIndex=").append(this.extensionSamplingFrequencyIndex).append(" (").append(AudioSpecificConfig.samplingFrequencyIndexMap.get(this.extensionSamplingFrequencyIndex)).append(")");
            sb.append(", extensionSamplingFrequency=").append(this.extensionSamplingFrequency);
            sb.append(", extensionChannelConfiguration=").append(this.extensionChannelConfiguration);
        }
        sb.append(", syncExtensionType=").append(this.syncExtensionType);
        if (this.gaSpecificConfig) {
            sb.append(", frameLengthFlag=").append(this.frameLengthFlag);
            sb.append(", dependsOnCoreCoder=").append(this.dependsOnCoreCoder);
            sb.append(", coreCoderDelay=").append(this.coreCoderDelay);
            sb.append(", extensionFlag=").append(this.extensionFlag);
            sb.append(", layerNr=").append(this.layerNr);
            sb.append(", numOfSubFrame=").append(this.numOfSubFrame);
            sb.append(", layer_length=").append(this.layer_length);
            sb.append(", aacSectionDataResilienceFlag=").append(this.aacSectionDataResilienceFlag);
            sb.append(", aacScalefactorDataResilienceFlag=").append(this.aacScalefactorDataResilienceFlag);
            sb.append(", aacSpectralDataResilienceFlag=").append(this.aacSpectralDataResilienceFlag);
            sb.append(", extensionFlag3=").append(this.extensionFlag3);
        }
        if (this.parametricSpecificConfig) {
            sb.append(", isBaseLayer=").append(this.isBaseLayer);
            sb.append(", paraMode=").append(this.paraMode);
            sb.append(", paraExtensionFlag=").append(this.paraExtensionFlag);
            sb.append(", hvxcVarMode=").append(this.hvxcVarMode);
            sb.append(", hvxcRateMode=").append(this.hvxcRateMode);
            sb.append(", erHvxcExtensionFlag=").append(this.erHvxcExtensionFlag);
            sb.append(", var_ScalableFlag=").append(this.var_ScalableFlag);
            sb.append(", hilnQuantMode=").append(this.hilnQuantMode);
            sb.append(", hilnMaxNumLine=").append(this.hilnMaxNumLine);
            sb.append(", hilnSampleRateCode=").append(this.hilnSampleRateCode);
            sb.append(", hilnFrameLength=").append(this.hilnFrameLength);
            sb.append(", hilnContMode=").append(this.hilnContMode);
            sb.append(", hilnEnhaLayer=").append(this.hilnEnhaLayer);
            sb.append(", hilnEnhaQuantMode=").append(this.hilnEnhaQuantMode);
        }
        sb.append('}');
        return sb.toString();
    }
}
