// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.api.conversations;

import java.io.ObjectOutput;
import java.io.File;
import android.net.Uri;
import com.twitter.util.c;
import java.io.ObjectInput;
import com.twitter.internal.android.util.Size;
import com.twitter.library.api.MediaEntity$Type;
import com.twitter.library.api.af;
import com.twitter.library.api.MediaEntity;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.JsonParser;
import com.twitter.library.media.model.ImageFile;
import com.twitter.library.media.model.EditableImage;

public class DMPhoto extends BaseDMAttachment
{
    private static final long serialVersionUID = 2088777460177803676L;
    public EditableImage editableImage;
    public int height;
    public String mediaUrl;
    public boolean possiblySensitive;
    public int width;
    
    public static DMPhoto a(final EditableImage editableImage) {
        final DMPhoto dmPhoto = new DMPhoto();
        dmPhoto.mediaUrl = ((ImageFile)editableImage.mediaFile).b().toString();
        dmPhoto.width = ((ImageFile)editableImage.mediaFile).size.a();
        dmPhoto.height = ((ImageFile)editableImage.mediaFile).size.b();
        dmPhoto.editableImage = editableImage;
        return dmPhoto;
    }
    
    static DMPhoto g(final JsonParser jsonParser) {
        final DMPhoto dmPhoto = new DMPhoto();
        dmPhoto.b(jsonParser);
        return dmPhoto;
    }
    
    private void h(final JsonParser jsonParser) {
        for (JsonToken jsonToken = jsonParser.a(); jsonToken != null && jsonToken != JsonToken.c; jsonToken = jsonParser.a()) {
            if (jsonToken == JsonToken.b) {
                if ("large".equals(jsonParser.e())) {
                    for (JsonToken jsonToken2 = jsonParser.a(); jsonToken2 != null && jsonToken2 != JsonToken.c; jsonToken2 = jsonParser.a()) {
                        if (jsonToken2 == JsonToken.i) {
                            final String e = jsonParser.e();
                            if ("w".equals(e)) {
                                this.width = jsonParser.h();
                            }
                            else if ("h".equals(e)) {
                                this.height = jsonParser.h();
                            }
                        }
                        else if (jsonToken2 == JsonToken.b || jsonToken2 == JsonToken.d) {
                            jsonParser.c();
                        }
                    }
                }
                else {
                    jsonParser.c();
                }
            }
            else if (jsonToken == JsonToken.d) {
                jsonParser.c();
            }
        }
    }
    
    @Override
    public String a() {
        return "photo";
    }
    
    @Override
    protected void c(final JsonParser jsonParser) {
        if ("possibly_sensitive".equals(jsonParser.e())) {
            this.possiblySensitive = jsonParser.l();
            return;
        }
        super.c(jsonParser);
    }
    
    @Override
    protected void d(final JsonParser jsonParser) {
        if ("sizes".equals(jsonParser.e())) {
            this.h(jsonParser);
            return;
        }
        super.d(jsonParser);
    }
    
    public MediaEntity e() {
        return (MediaEntity)((af)((af)((af)new af().a(this.start)).b(this.end)).a(MediaEntity$Type.b).b(this.mediaUrl)).a(Size.a(this.width, this.height)).f();
    }
    
    @Override
    protected void f(final JsonParser jsonParser) {
        if ("media_url_https".equals(jsonParser.e())) {
            this.mediaUrl = jsonParser.r();
            return;
        }
        super.f(jsonParser);
    }
    
    @Override
    public void readExternal(final ObjectInput objectInput) {
        super.readExternal(objectInput);
        this.mediaUrl = (String)objectInput.readObject();
        this.width = objectInput.readInt();
        this.height = objectInput.readInt();
        this.possiblySensitive = objectInput.readBoolean();
        try {
            final MediaEntity mediaEntity = (MediaEntity)objectInput.readObject();
            if (mediaEntity != null && !c.a()) {
                this.editableImage = new EditableImage(ImageFile.a(new File(Uri.parse(mediaEntity.mediaUrl).getPath())), "");
                objectInput.readObject();
                return;
            }
            this.editableImage = (EditableImage)objectInput.readObject();
        }
        catch (Exception ex) {}
    }
    
    @Override
    public void writeExternal(final ObjectOutput objectOutput) {
        super.writeExternal(objectOutput);
        objectOutput.writeObject(this.mediaUrl);
        objectOutput.writeInt(this.width);
        objectOutput.writeInt(this.height);
        objectOutput.writeBoolean(this.possiblySensitive);
        objectOutput.writeObject(null);
        objectOutput.writeObject(this.editableImage);
    }
}
