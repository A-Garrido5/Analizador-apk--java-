// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.media.manager;

import com.twitter.library.media.model.ImageFormat;
import java.util.Collections;
import java.util.List;
import com.twitter.internal.android.util.Size;

final class an implements n
{
    @Override
    public List a(String string, final Size size) {
        if (size.c()) {
            return Collections.singletonList(string);
        }
        int n;
        if (ImageFormat.a(string) != ImageFormat.d) {
            n = string.lastIndexOf(".");
        }
        else {
            n = string.length();
        }
        final int n2 = n - UserImageRequest$AvatarSize.f.suffix.length();
        if (!string.startsWith(UserImageRequest$AvatarSize.f.suffix, n2)) {
            return Collections.singletonList(string);
        }
        final int a = size.a();
        final UserImageRequest$AvatarSize e = UserImageRequest$AvatarSize.e;
        while (true) {
            for (final UserImageRequest$AvatarSize userImageRequest$AvatarSize : UserImageRequest$AvatarSize.values()) {
                if (userImageRequest$AvatarSize.pixelSize >= a) {
                    if (userImageRequest$AvatarSize != UserImageRequest$AvatarSize.f) {
                        string = new StringBuilder(string).replace(n2, n, userImageRequest$AvatarSize.suffix).toString();
                    }
                    return Collections.singletonList(string);
                }
            }
            UserImageRequest$AvatarSize userImageRequest$AvatarSize = e;
            continue;
        }
    }
}
