// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.av;

import com.twitter.library.provider.Tweet;
import com.twitter.library.card.property.ImageSpec;
import android.view.View;

public interface ao
{
    void a();
    
    void b();
    
    float getAspectRatio();
    
    View getView();
    
    void setImageSpec(final ImageSpec p0);
    
    void setScaleType(final int p0);
    
    void setTweet(final Tweet p0);
}
