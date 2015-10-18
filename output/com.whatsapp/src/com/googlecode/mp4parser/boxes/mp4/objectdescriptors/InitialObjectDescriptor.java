// 
// Decompiled by Procyon v0.5.30
// 

package com.googlecode.mp4parser.boxes.mp4.objectdescriptors;

import java.io.IOException;
import com.coremedia.iso.IsoTypeReader;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

public class InitialObjectDescriptor extends ObjectDescriptorBase
{
    int audioProfileLevelIndication;
    List<ESDescriptor> esDescriptors;
    List<ExtensionDescriptor> extensionDescriptors;
    int graphicsProfileLevelIndication;
    int includeInlineProfileLevelFlag;
    int oDProfileLevelIndication;
    private int objectDescriptorId;
    int sceneProfileLevelIndication;
    List<BaseDescriptor> unknownDescriptors;
    int urlFlag;
    int urlLength;
    String urlString;
    int visualProfileLevelIndication;
    
    public InitialObjectDescriptor() {
        this.esDescriptors = new ArrayList<ESDescriptor>();
        this.extensionDescriptors = new ArrayList<ExtensionDescriptor>();
        this.unknownDescriptors = new ArrayList<BaseDescriptor>();
    }
    
    @Override
    public void parseDetail(final ByteBuffer byteBuffer) throws IOException {
        final int uInt16 = IsoTypeReader.readUInt16(byteBuffer);
        this.objectDescriptorId = (0xFFC0 & uInt16) >> 6;
        this.urlFlag = (uInt16 & 0x3F) >> 5;
        this.includeInlineProfileLevelFlag = (uInt16 & 0x1F) >> 4;
        final int n = -2 + this.getSize();
        int n2;
        if (this.urlFlag == 1) {
            this.urlLength = IsoTypeReader.readUInt8(byteBuffer);
            this.urlString = IsoTypeReader.readString(byteBuffer, this.urlLength);
            n2 = n - (1 + this.urlLength);
        }
        else {
            this.oDProfileLevelIndication = IsoTypeReader.readUInt8(byteBuffer);
            this.sceneProfileLevelIndication = IsoTypeReader.readUInt8(byteBuffer);
            this.audioProfileLevelIndication = IsoTypeReader.readUInt8(byteBuffer);
            this.visualProfileLevelIndication = IsoTypeReader.readUInt8(byteBuffer);
            this.graphicsProfileLevelIndication = IsoTypeReader.readUInt8(byteBuffer);
            n2 = n - 5;
            if (n2 > 2) {
                final BaseDescriptor from = ObjectDescriptorFactory.createFrom(-1, byteBuffer);
                n2 -= from.getSize();
                if (from instanceof ESDescriptor) {
                    this.esDescriptors.add((ESDescriptor)from);
                }
                else {
                    this.unknownDescriptors.add(from);
                }
            }
        }
        if (n2 > 2) {
            final BaseDescriptor from2 = ObjectDescriptorFactory.createFrom(-1, byteBuffer);
            if (!(from2 instanceof ExtensionDescriptor)) {
                this.unknownDescriptors.add(from2);
                return;
            }
            this.extensionDescriptors.add((ExtensionDescriptor)from2);
        }
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("InitialObjectDescriptor");
        sb.append("{objectDescriptorId=").append(this.objectDescriptorId);
        sb.append(", urlFlag=").append(this.urlFlag);
        sb.append(", includeInlineProfileLevelFlag=").append(this.includeInlineProfileLevelFlag);
        sb.append(", urlLength=").append(this.urlLength);
        sb.append(", urlString='").append(this.urlString).append('\'');
        sb.append(", oDProfileLevelIndication=").append(this.oDProfileLevelIndication);
        sb.append(", sceneProfileLevelIndication=").append(this.sceneProfileLevelIndication);
        sb.append(", audioProfileLevelIndication=").append(this.audioProfileLevelIndication);
        sb.append(", visualProfileLevelIndication=").append(this.visualProfileLevelIndication);
        sb.append(", graphicsProfileLevelIndication=").append(this.graphicsProfileLevelIndication);
        sb.append(", esDescriptors=").append(this.esDescriptors);
        sb.append(", extensionDescriptors=").append(this.extensionDescriptors);
        sb.append(", unknownDescriptors=").append(this.unknownDescriptors);
        sb.append('}');
        return sb.toString();
    }
}
