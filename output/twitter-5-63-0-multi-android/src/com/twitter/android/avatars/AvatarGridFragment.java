// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.avatars;

import android.content.Context;
import com.twitter.android.widget.cp;
import android.os.Bundle;
import com.twitter.android.widget.GalleryGridFragment;

public class AvatarGridFragment extends GalleryGridFragment
{
    public static AvatarGridFragment a(final int n, final int n2, final int n3, final int n4) {
        return a(n, n2, n3, false, n4, false);
    }
    
    public static AvatarGridFragment a(final int n, final int n2, final int n3, final boolean b, final int n4, final boolean b2) {
        final AvatarGridFragment avatarGridFragment = new AvatarGridFragment();
        final Bundle arguments = new Bundle(3);
        arguments.putInt("color", n);
        arguments.putInt("header_text_color", n2);
        arguments.putInt("header", n4);
        arguments.putInt("scroll_header", n3);
        arguments.putBoolean("show_expand", b);
        arguments.putBoolean("new_media_flow", b2);
        avatarGridFragment.setArguments(arguments);
        return avatarGridFragment;
    }
    
    @Override
    protected void a(final boolean b) {
        this.a = new a((Context)this.getActivity(), new cp().a(this.getActivity()).a(), 0, b, 0, this.b);
    }
}
