// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.media.model;

import com.twitter.util.collection.CollectionUtils;
import java.io.ObjectOutput;
import java.util.List;
import android.graphics.RectF;
import java.io.ObjectInput;
import java.io.Externalizable;

class EditableImage$SerializationProxy implements Externalizable
{
    private static final long serialVersionUID = 233136753015761794L;
    private EditableImage mEditableImage;
    
    public EditableImage$SerializationProxy() {
    }
    
    public EditableImage$SerializationProxy(final EditableImage mEditableImage) {
        this.mEditableImage = mEditableImage;
    }
    
    private Object readResolve() {
        return this.mEditableImage;
    }
    
    @Override
    public void readExternal(final ObjectInput objectInput) {
        objectInput.readInt();
        this.mEditableImage = new EditableImage((ImageFile)objectInput.readObject(), (String)objectInput.readObject());
        this.mEditableImage.enhanced = objectInput.readBoolean();
        this.mEditableImage.filterId = objectInput.readInt();
        this.mEditableImage.intensity = objectInput.readFloat();
        if (objectInput.readInt() == 1) {
            this.mEditableImage.cropRect = new RectF(objectInput.readFloat(), objectInput.readFloat(), objectInput.readFloat(), objectInput.readFloat());
        }
        this.mEditableImage.rotation = objectInput.readInt();
        this.mEditableImage.tags = (List)objectInput.readObject();
    }
    
    @Override
    public void writeExternal(final ObjectOutput objectOutput) {
        objectOutput.writeInt(0);
        objectOutput.writeObject(this.mEditableImage.mediaFile);
        objectOutput.writeObject(this.mEditableImage.source);
        objectOutput.writeBoolean(this.mEditableImage.enhanced);
        objectOutput.writeInt(this.mEditableImage.filterId);
        objectOutput.writeFloat(this.mEditableImage.intensity);
        if (this.mEditableImage.cropRect != null) {
            objectOutput.writeInt(1);
            objectOutput.writeFloat(this.mEditableImage.cropRect.left);
            objectOutput.writeFloat(this.mEditableImage.cropRect.top);
            objectOutput.writeFloat(this.mEditableImage.cropRect.right);
            objectOutput.writeFloat(this.mEditableImage.cropRect.bottom);
        }
        else {
            objectOutput.writeInt(0);
        }
        objectOutput.writeInt(this.mEditableImage.rotation);
        objectOutput.writeObject(CollectionUtils.b(this.mEditableImage.tags));
    }
}
