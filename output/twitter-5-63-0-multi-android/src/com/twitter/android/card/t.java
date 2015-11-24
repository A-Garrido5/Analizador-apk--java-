// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.card;

import com.twitter.internal.network.l;
import com.twitter.library.provider.Tweet;
import com.twitter.library.api.PromotedEvent;
import com.twitter.library.scribe.NativeCardUserAction;
import com.twitter.library.scribe.TwitterScribeAssociation;

public interface t
{
    TwitterScribeAssociation a();
    
    void a(final long p0, final String p1, final NativeCardUserAction p2);
    
    void a(final long p0, final String p1, final String p2);
    
    void a(final PromotedEvent p0);
    
    void a(final PromotedEvent p0, final NativeCardUserAction p1);
    
    void a(final Tweet p0);
    
    void a(final TwitterScribeAssociation p0);
    
    void a(final String p0);
    
    void a(final String p0, final l p1);
    
    void a(final String p0, final String p1);
    
    void a(final String p0, final String p1, final NativeCardUserAction p2);
    
    void a(final vc p0);
    
    Tweet b();
    
    void b(final TwitterScribeAssociation p0);
    
    void b(final String p0);
    
    void b(final String p0, final String p1);
    
    void b(final String p0, final String p1, final NativeCardUserAction p2);
    
    void c();
    
    void c(final String p0);
    
    void c(final String p0, final String p1);
    
    void c(final String p0, final String p1, final NativeCardUserAction p2);
    
    void d(final String p0, final String p1);
    
    void e(final String p0, final String p1);
}
