// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.api.upload;

import com.twitter.util.n;
import com.twitter.library.media.model.EditableMedia;
import com.twitter.library.service.aa;
import java.util.Iterator;
import com.twitter.library.media.model.MediaFile;
import java.util.UUID;
import java.util.LinkedHashMap;
import java.util.List;
import com.twitter.library.service.ab;
import android.content.Context;

@Deprecated
public class a implements o
{
    private final Context a;
    private final ab b;
    private final nw c;
    private final List d;
    private final String e;
    private final MediaProcessorFactory$MediaUsage f;
    private LinkedHashMap g;
    private long h;
    
    public a(String string, final Context a, final ab b, final List d, final MediaProcessorFactory$MediaUsage f) {
        this.g = new LinkedHashMap();
        this.h = 0L;
        this.d = d;
        this.a = a;
        this.b = b;
        this.f = f;
        if (string == null) {
            string = UUID.randomUUID().toString();
        }
        this.e = string;
        this.c = new nw(d.size(), this.e, 3, true);
    }
    
    private void d() {
        final Iterator<MediaFile> iterator = this.g.values().iterator();
        while (iterator.hasNext()) {
            iterator.next().a();
        }
        this.g.clear();
    }
    
    @Override
    public String an_() {
        return this.e;
    }
    
    @Override
    public LinkedHashMap az_() {
        if (this.g.isEmpty()) {
            return null;
        }
        return this.g;
    }
    
    @Override
    public aa b() {
        for (final EditableMedia editableMedia : this.d) {
            final p a = new b(this.a, this.b).a(editableMedia, this.c, this.f, s.a(this.a, editableMedia.e()));
            if (!a.a()) {
                this.d();
                if (a.b != null) {
                    a.b.a();
                }
                return a;
            }
            this.h += a.b.file.length();
            this.g.put(a.a, a.b);
        }
        final aa aa = new aa();
        aa.a(true);
        return aa;
    }
}
