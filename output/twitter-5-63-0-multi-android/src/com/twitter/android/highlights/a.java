// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.highlights;

import android.view.View;
import android.content.Intent;
import android.content.Context;
import java.util.List;

public class a extends af
{
    public final int a;
    
    public a(final int a) {
        super("EmptyStory", 2147483647L, 0, new mx(0, 0, null), true, null, null);
        this.a = a;
    }
    
    @Override
    public int a() {
        return 12;
    }
    
    @Override
    public Intent a(final Context context) {
        return null;
    }
    
    @Override
    public ag a(final View view) {
        return new b(view);
    }
    
    @Override
    public String b() {
        return null;
    }
}
