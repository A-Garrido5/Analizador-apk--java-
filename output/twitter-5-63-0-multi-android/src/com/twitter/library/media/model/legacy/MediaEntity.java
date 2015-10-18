// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.media.model.legacy;

import java.io.ObjectOutput;
import java.io.EOFException;
import java.io.OptionalDataException;
import java.nio.ByteBuffer;
import java.io.ObjectInput;
import java.util.Collections;
import com.twitter.library.media.model.MediaType;
import java.util.List;
import com.twitter.internal.android.util.Size;
import java.util.HashMap;
import android.graphics.RectF;
import java.io.Externalizable;

@Deprecated
public class MediaEntity extends UrlEntity implements Externalizable
{
    static final long serialVersionUID = 3820360449367569386L;
    public int clipEnd;
    public int clipStart;
    public String composerSourceUrl;
    public RectF cropRect;
    public int duration;
    public int effect;
    public boolean enhanced;
    public HashMap features;
    public long id;
    public String insecureMediaUrl;
    public float intensity;
    public String mediaUrl;
    public int rotation;
    public Size size;
    public long sourceStatusId;
    public List tags;
    public MediaType type;
    public MediaVideoInfo videoInfo;
    
    public MediaEntity() {
        this.type = MediaType.a;
        this.size = Size.a;
        this.features = new HashMap();
        this.tags = Collections.emptyList();
    }
    
    @Override
    public void readExternal(final ObjectInput objectInput) {
        super.readExternal(objectInput);
        this.intensity = 1.0f;
        this.id = objectInput.readLong();
        this.mediaUrl = (String)objectInput.readObject();
        this.insecureMediaUrl = (String)objectInput.readObject();
        this.type = MediaType.a(objectInput.readInt());
        this.size = Size.a(objectInput.readInt(), objectInput.readInt());
        this.enhanced = objectInput.readBoolean();
        this.effect = objectInput.readInt();
        objectInput.readBoolean();
        try {
            this.features = (HashMap)objectInput.readObject();
            this.tags = (List)objectInput.readObject();
            if (this.tags == null) {
                this.tags = Collections.emptyList();
            }
            this.sourceStatusId = objectInput.readLong();
            this.composerSourceUrl = (String)objectInput.readObject();
            objectInput.readObject();
            this.duration = objectInput.readInt();
            this.clipStart = objectInput.readInt();
            this.clipEnd = objectInput.readInt();
            this.rotation = objectInput.readInt();
            final ByteBuffer allocate = ByteBuffer.allocate(16);
            if (objectInput.read(allocate.array()) == 16) {
                this.cropRect = new RectF(allocate.getFloat(), allocate.getFloat(), allocate.getFloat(), allocate.getFloat());
            }
            this.intensity = objectInput.readFloat();
            this.videoInfo = (MediaVideoInfo)objectInput.readObject();
        }
        catch (OptionalDataException ex) {}
        catch (EOFException ex2) {}
    }
    
    @Override
    public void writeExternal(final ObjectOutput objectOutput) {
    }
}
