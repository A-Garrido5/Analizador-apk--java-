// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.media.camera;

import android.support.v4.app.FragmentActivity;
import com.twitter.library.client.Session;
import com.twitter.android.media.widget.CameraToolbar;
import com.twitter.library.media.model.MediaFile;
import com.twitter.library.media.model.MediaType;
import android.view.View;

public interface c
{
    View a();
    
    void a(final MediaType p0, final MediaFile p1);
    
    void a(final boolean p0);
    
    CameraToolbar b();
    
    void b(final int p0);
    
    void c();
    
    Session d();
    
    int g();
    
    void h();
    
    FragmentActivity i();
    
    VideoTooltipManager j();
}
