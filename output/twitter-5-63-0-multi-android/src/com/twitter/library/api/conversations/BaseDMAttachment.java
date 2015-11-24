// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.api.conversations;

import java.io.ObjectOutput;
import java.io.ObjectInput;
import com.twitter.library.api.cb;
import com.twitter.library.api.UrlEntity;
import android.text.TextUtils;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.JsonParser;
import java.io.Externalizable;

public abstract class BaseDMAttachment implements Externalizable
{
    private static final long serialVersionUID = 1921382009559782811L;
    public String displayUrl;
    public int end;
    public String expandedUrl;
    public int start;
    public String url;
    
    public BaseDMAttachment() {
        this.start = -1;
        this.end = -1;
    }
    
    static BaseDMAttachment a(final JsonParser jsonParser) {
        JsonToken jsonToken = jsonParser.a();
        BaseDMAttachment baseDMAttachment = null;
        while (jsonToken != null && jsonToken != JsonToken.c) {
            switch (i.a[jsonToken.ordinal()]) {
                case 1: {
                    final String e = jsonParser.e();
                    if ("photo".equals(e)) {
                        baseDMAttachment = DMPhoto.g(jsonParser);
                        break;
                    }
                    if ("tweet".equals(e)) {
                        baseDMAttachment = DMTweet.g(jsonParser);
                        break;
                    }
                    baseDMAttachment = DMUnknownAttachment.g(jsonParser);
                    break;
                }
                case 2: {
                    jsonParser.c();
                    break;
                }
            }
            jsonToken = jsonParser.a();
        }
        return baseDMAttachment;
    }
    
    public abstract String a();
    
    protected void b(final JsonParser jsonParser) {
        for (JsonToken jsonToken = jsonParser.a(); jsonToken != null && jsonToken != JsonToken.c; jsonToken = jsonParser.a()) {
            switch (i.a[jsonToken.ordinal()]) {
                case 3: {
                    this.f(jsonParser);
                    break;
                }
                case 1: {
                    this.d(jsonParser);
                    break;
                }
                case 2: {
                    this.e(jsonParser);
                    break;
                }
                case 4: {
                    this.c(jsonParser);
                    break;
                }
            }
        }
    }
    
    boolean b() {
        return this.start != this.end;
    }
    
    protected void c(final JsonParser jsonParser) {
    }
    
    boolean c() {
        return !TextUtils.isEmpty((CharSequence)this.url) && !TextUtils.isEmpty((CharSequence)this.displayUrl) && !TextUtils.isEmpty((CharSequence)this.expandedUrl);
    }
    
    UrlEntity d() {
        if (this.c()) {
            return (UrlEntity)((cb)((cb)((cb)new cb().b(this.url)).c(this.expandedUrl)).d(this.displayUrl)).f();
        }
        return null;
    }
    
    protected void d(final JsonParser jsonParser) {
        jsonParser.c();
    }
    
    protected void e(final JsonParser jsonParser) {
        if ("indices".equals(jsonParser.e())) {
            for (JsonToken jsonToken = jsonParser.a(); jsonToken != JsonToken.e; jsonToken = jsonParser.a()) {
                if (jsonToken == JsonToken.i) {
                    final int h = jsonParser.h();
                    if (this.start == -1) {
                        this.start = h;
                    }
                    else if (this.end == -1) {
                        this.end = h;
                    }
                }
                else {
                    jsonParser.c();
                }
            }
        }
        else {
            jsonParser.c();
        }
    }
    
    protected void f(final JsonParser jsonParser) {
        final String e = jsonParser.e();
        if ("url".equals(e)) {
            this.url = jsonParser.r();
        }
        else {
            if ("display_url".equals(e)) {
                this.displayUrl = jsonParser.r();
                return;
            }
            if ("expanded_url".equals(e)) {
                this.expandedUrl = jsonParser.r();
            }
        }
    }
    
    @Override
    public void readExternal(final ObjectInput objectInput) {
        this.url = (String)objectInput.readObject();
        this.displayUrl = (String)objectInput.readObject();
        this.expandedUrl = (String)objectInput.readObject();
        this.start = objectInput.readInt();
        this.end = objectInput.readInt();
    }
    
    @Override
    public void writeExternal(final ObjectOutput objectOutput) {
        objectOutput.writeObject(this.url);
        objectOutput.writeObject(this.displayUrl);
        objectOutput.writeObject(this.expandedUrl);
        objectOutput.writeInt(this.start);
        objectOutput.writeInt(this.end);
    }
}
