// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.card;

import java.util.ArrayList;
import com.twitter.library.client.Session;
import com.twitter.library.scribe.TwitterScribeAssociation;
import com.twitter.library.provider.Tweet;

public interface g
{
    void a(final long p0, final Tweet p1, final TwitterScribeAssociation p2);
    
    void a(final Session p0, final Tweet p1, final String p2, final boolean p3);
    
    void a(final Tweet p0, final TwitterScribeAssociation p1);
    
    void a(final TwitterScribeAssociation p0, final Tweet p1, final String p2);
    
    void a(final String p0);
    
    void a(final String p0, final Tweet p1);
    
    void a(final String p0, final String p1);
    
    void a(final String p0, final String p1, final String p2, final boolean p3, final boolean p4, final Tweet p5);
    
    void a(final ArrayList p0, final int p1, final TwitterScribeAssociation p2);
    
    boolean a(final um p0, final String p1);
    
    boolean b(final String p0);
    
    boolean b(final String p0, final String p1);
    
    boolean c(final String p0);
    
    boolean c(final String p0, final String p1);
}
