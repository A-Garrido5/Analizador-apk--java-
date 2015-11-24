// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.client;

import com.twitter.library.network.LoginVerificationRequiredResponse;

public interface bf extends bh
{
    void a(final Session p0, final int p1, final int[] p2);
    
    void a(final Session p0, final LoginVerificationRequiredResponse p1);
    
    void a(final Session p0, final String p1);
    
    void b(final Session p0, final LoginVerificationRequiredResponse p1);
}
