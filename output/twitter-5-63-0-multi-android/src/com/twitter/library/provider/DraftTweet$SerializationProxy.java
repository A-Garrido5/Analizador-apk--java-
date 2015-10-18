// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.provider;

import java.util.Iterator;
import com.twitter.library.media.model.EditableMedia;
import com.twitter.util.d;
import com.twitter.errorreporter.ErrorReporter;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import com.twitter.util.collection.g;
import java.io.Serializable;
import com.twitter.util.collection.CollectionUtils;
import java.io.ObjectOutput;
import com.twitter.library.api.QuotedTweetData;
import com.twitter.library.api.PromotedContent;
import com.twitter.library.api.geo.GeoTag;
import java.util.List;
import java.io.ObjectInput;
import com.twitter.model.common.a;
import com.twitter.model.common.BuilderSerializationProxy;

class DraftTweet$SerializationProxy extends BuilderSerializationProxy
{
    private static final long serialVersionUID = -3286731247781430480L;
    
    public DraftTweet$SerializationProxy() {
        super(new e());
    }
    
    public DraftTweet$SerializationProxy(final DraftTweet draftTweet) {
        super(draftTweet);
    }
    
    protected void a(final ObjectInput objectInput, final e e) {
        e.a(objectInput.readLong()).a((String)objectInput.readObject()).a((List)objectInput.readObject()).b(objectInput.readLong()).a((GeoTag)objectInput.readObject()).a((List)objectInput.readObject(), objectInput.readLong()).a((PromotedContent)objectInput.readObject()).a((QuotedTweetData)objectInput.readObject()).b((String)objectInput.readObject());
    }
    
    protected void a(final ObjectOutput objectOutput, final DraftTweet draftTweet) {
        objectOutput.writeLong(draftTweet.draftId);
        objectOutput.writeObject(draftTweet.statusText);
        objectOutput.writeObject(CollectionUtils.b(draftTweet.media));
        objectOutput.writeLong(draftTweet.repliedTweetId);
        objectOutput.writeObject(draftTweet.geoTag);
        objectOutput.writeObject(CollectionUtils.b(draftTweet.mPreparedMediaIds));
        objectOutput.writeLong(draftTweet.mMediaPreparedAtTimestamp);
        objectOutput.writeObject(draftTweet.promotedContent);
        objectOutput.writeObject(draftTweet.quotedData);
        objectOutput.writeObject(draftTweet.cardUrl);
    }
}
