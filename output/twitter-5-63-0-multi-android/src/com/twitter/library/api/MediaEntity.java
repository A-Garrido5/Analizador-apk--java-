// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.api;

import java.io.ObjectOutput;
import java.io.EOFException;
import java.io.OptionalDataException;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.io.ObjectInput;
import com.twitter.util.l;
import java.util.Iterator;
import java.util.Collections;
import com.twitter.util.k;
import com.twitter.util.collection.CollectionUtils;
import com.twitter.internal.android.util.Size;
import java.util.ArrayList;
import java.util.List;

public class MediaEntity extends UrlEntity
{
    private static final long serialVersionUID = 3820360449367569386L;
    public long id;
    private List mFaces;
    private ArrayList mLegacyFaces;
    public String mediaUrl;
    public Size size;
    public long sourceTweetId;
    public List tags;
    public MediaEntity$Type type;
    public MediaVideoInfo videoInfo;
    
    public MediaEntity() {
        this(new af());
    }
    
    public MediaEntity(final af af) {
        super(af);
        this.type = MediaEntity$Type.a;
        this.size = Size.a;
        this.id = af.c;
        this.sourceTweetId = af.d;
        String mediaUrl;
        if (af.e != null) {
            mediaUrl = af.e;
        }
        else {
            mediaUrl = this.url;
        }
        this.mediaUrl = mediaUrl;
        this.type = af.f;
        this.size = af.g;
        ArrayList mLegacyFaces;
        if (af.h != null) {
            mLegacyFaces = af.h;
        }
        else {
            mLegacyFaces = CollectionUtils.d((Object[])new TweetMediaFeature[0]);
        }
        this.mLegacyFaces = mLegacyFaces;
        this.mFaces = af.i;
        this.tags = k.a(af.k);
        this.videoInfo = af.j;
    }
    
    public boolean a(final MediaEntity mediaEntity) {
        return this == mediaEntity || (super.a(mediaEntity) && this.id == mediaEntity.id);
    }
    
    public af b() {
        return new af(this);
    }
    
    public List c() {
        if (this.mFaces == null) {
            if (this.mLegacyFaces.isEmpty()) {
                this.mFaces = Collections.emptyList();
            }
            else {
                final ArrayList<TweetMediaFace> list = new ArrayList<TweetMediaFace>(this.mLegacyFaces.size());
                final Iterator<TweetMediaFeature> iterator = this.mLegacyFaces.iterator();
                while (iterator.hasNext()) {
                    list.add(new TweetMediaFace(iterator.next(), this.size));
                }
                this.mFaces = Collections.unmodifiableList((List<?>)list);
            }
        }
        return this.mFaces;
    }
    
    @Override
    public boolean equals(final Object o) {
        return this == o || (o instanceof MediaEntity && this.a((MediaEntity)o));
    }
    
    @Override
    public int hashCode() {
        return 31 * super.hashCode() + l.a(this.id);
    }
    
    @Override
    public void readExternal(final ObjectInput objectInput) {
        super.readExternal(objectInput);
        this.id = objectInput.readLong();
        this.mediaUrl = (String)objectInput.readObject();
        objectInput.readObject();
        this.type = MediaEntity$Type.a(objectInput.readInt());
        this.size = Size.a(objectInput.readInt(), objectInput.readInt());
        objectInput.readBoolean();
        objectInput.readInt();
        objectInput.readBoolean();
        try {
            final HashMap hashMap = (HashMap)objectInput.readObject();
            if (hashMap != null) {
                ArrayList d = (ArrayList)CollectionUtils.a((Iterable)hashMap.values());
                if (d == null) {
                    d = CollectionUtils.d((Object[])new TweetMediaFeature[0]);
                }
                this.mLegacyFaces = d;
            }
            this.tags = k.a((List)objectInput.readObject());
            this.sourceTweetId = objectInput.readLong();
            objectInput.readObject();
            objectInput.readObject();
            objectInput.readInt();
            objectInput.readInt();
            objectInput.readInt();
            objectInput.readInt();
            objectInput.read(ByteBuffer.allocate(16).array());
            objectInput.readFloat();
            this.videoInfo = (MediaVideoInfo)objectInput.readObject();
        }
        catch (OptionalDataException ex) {}
        catch (EOFException ex2) {}
    }
    
    @Override
    public void writeExternal(final ObjectOutput objectOutput) {
        super.writeExternal(objectOutput);
        objectOutput.writeLong(this.id);
        objectOutput.writeObject(this.mediaUrl);
        objectOutput.writeObject(null);
        objectOutput.writeInt(this.type.typeId);
        objectOutput.writeInt(this.size.a());
        objectOutput.writeInt(this.size.b());
        objectOutput.writeBoolean(false);
        objectOutput.writeInt(0);
        objectOutput.writeBoolean(false);
        final HashMap<String, ArrayList> hashMap = new HashMap<String, ArrayList>(1);
        hashMap.put("", this.mLegacyFaces);
        objectOutput.writeObject(hashMap);
        objectOutput.writeObject(CollectionUtils.b(this.tags));
        objectOutput.writeLong(this.sourceTweetId);
        objectOutput.writeObject(null);
        objectOutput.writeObject(null);
        objectOutput.writeInt(0);
        objectOutput.writeInt(0);
        objectOutput.writeInt(0);
        objectOutput.writeInt(0);
        objectOutput.write(new byte[16]);
        objectOutput.writeFloat(0.0f);
        objectOutput.writeObject(this.videoInfo);
    }
}
