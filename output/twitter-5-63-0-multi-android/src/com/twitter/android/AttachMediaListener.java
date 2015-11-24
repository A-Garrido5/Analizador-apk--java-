// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import com.twitter.library.media.model.EditableMedia;
import android.net.Uri;

public interface AttachMediaListener
{
    void a(final AttachMediaListener$MediaAttachFailure p0, final Uri p1);
    
    boolean a(final EditableMedia p0);
    
    void b(final EditableMedia p0);
}
