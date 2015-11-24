// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.media.util;

import com.twitter.library.media.model.EditableImage;
import com.twitter.library.media.model.EditableMedia;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Collections;
import android.text.style.ImageSpan;
import android.text.SpannableStringBuilder;
import com.twitter.library.api.MediaTag;
import com.twitter.library.client.az;
import android.text.Html;
import com.twitter.library.util.bq;
import android.text.Spanned;
import android.content.Context;
import java.util.Iterator;
import com.twitter.library.api.Entity;
import com.twitter.library.api.af;
import com.twitter.library.api.MediaEntity;
import java.util.Set;
import java.util.List;
import com.twitter.library.api.MediaEntityList;

public class ag
{
    public static MediaEntityList a(final MediaEntityList list, final List list2, final Set set) {
        final com.twitter.library.api.ag ag = new com.twitter.library.api.ag();
        final Iterator iterator = list.iterator();
        int n = 0;
    Label_0119_Outer:
        while (iterator.hasNext()) {
            final MediaEntity mediaEntity = iterator.next();
            while (true) {
                Label_0148: {
                    if (!list2.contains(mediaEntity.id) || mediaEntity.tags.isEmpty()) {
                        break Label_0148;
                    }
                    final List a = a(mediaEntity.tags, set);
                    if (a == mediaEntity.tags) {
                        break Label_0148;
                    }
                    final MediaEntity mediaEntity2 = (MediaEntity)new af(mediaEntity).a(a).f();
                    final int n2 = 1;
                    final MediaEntity mediaEntity3 = mediaEntity2;
                    ag.a(mediaEntity3);
                    n = n2;
                    continue Label_0119_Outer;
                }
                final int n2 = n;
                final MediaEntity mediaEntity3 = mediaEntity;
                continue;
            }
        }
        if (n != 0) {
            return (MediaEntityList)ag.f();
        }
        return list;
    }
    
    public static CharSequence a(final Context context, final int n, final Object... array) {
        final CharSequence text = context.getResources().getText(n);
        if (!(text instanceof Spanned)) {
            return String.format(text.toString(), array);
        }
        return (CharSequence)Html.fromHtml(String.format(bq.a((Spanned)text), array));
    }
    
    public static CharSequence a(final Context context, final List list, final int n) {
        final long g = az.a(context).b().g();
        if (list == null || list.size() == 0) {
            return "";
        }
        CharSequence charSequence;
        if (list.size() == 1) {
            final MediaTag mediaTag = list.get(0);
            int n2;
            if (mediaTag.userId == g) {
                n2 = lg.media_tag_you;
            }
            else {
                n2 = lg.media_tag_user_display_name;
            }
            charSequence = a(context, n2, mediaTag.name);
        }
        else {
            boolean b;
            if (b(list, g) != null) {
                b = true;
            }
            else {
                b = false;
            }
            if (list.size() == 2) {
                int media_tag_you_two_summary;
                int n6;
                int n7;
                if (b) {
                    int n3;
                    if (list.get(0).userId == g) {
                        n3 = 0;
                    }
                    else {
                        n3 = 1;
                    }
                    int n4;
                    if (n3 == 0) {
                        n4 = 1;
                    }
                    else {
                        n4 = 0;
                    }
                    media_tag_you_two_summary = lg.media_tag_you_two_summary;
                    final int n5 = n4;
                    n6 = n3;
                    n7 = n5;
                }
                else {
                    final int media_tag_two_summary = lg.media_tag_two_summary;
                    n7 = 1;
                    media_tag_you_two_summary = media_tag_two_summary;
                    n6 = 0;
                }
                charSequence = a(context, media_tag_you_two_summary, list.get(n6).name, list.get(n7).name);
            }
            else {
                String s;
                int n8;
                if (b) {
                    s = b(list, g).name;
                    n8 = lg.media_tag_you_multiple_summary;
                }
                else {
                    s = list.get(0).name;
                    n8 = lg.media_tag_multiple_summary;
                }
                charSequence = a(context, n8, s, -1 + list.size());
            }
        }
        if (n != 0) {
            final SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder((CharSequence)"  ");
            spannableStringBuilder.append(charSequence);
            spannableStringBuilder.setSpan((Object)new ImageSpan(context, n, 1), 0, 1, 18);
            return (CharSequence)spannableStringBuilder;
        }
        return charSequence;
    }
    
    public static List a(final Iterable iterable) {
        final Iterator<MediaEntity> iterator = iterable.iterator();
        if (!iterator.hasNext()) {
            return Collections.emptyList();
        }
        final MediaEntity mediaEntity = iterator.next();
        if (!iterator.hasNext()) {
            return mediaEntity.tags;
        }
        final LinkedHashSet set = new LinkedHashSet<Object>(mediaEntity.tags);
        while (iterator.hasNext()) {
            set.addAll(iterator.next().tags);
        }
        if (!set.isEmpty()) {
            return new ArrayList(set);
        }
        return Collections.emptyList();
    }
    
    public static List a(final List list) {
        if (list.isEmpty()) {
            return Collections.emptyList();
        }
        if (list.size() == 1) {
            final EditableMedia editableMedia = list.get(0);
            if (editableMedia instanceof EditableImage) {
                return ((EditableImage)editableMedia).b();
            }
            return Collections.emptyList();
        }
        else {
            final LinkedHashSet set = new LinkedHashSet<Object>();
            for (final EditableMedia editableMedia2 : list) {
                if (editableMedia2 instanceof EditableImage) {
                    set.addAll(((EditableImage)editableMedia2).b());
                }
            }
            if (!set.isEmpty()) {
                return new ArrayList(set);
            }
            return Collections.emptyList();
        }
    }
    
    private static List a(List list, final Set set) {
        final ArrayList<MediaTag> list2 = new ArrayList<MediaTag>();
        for (final MediaTag mediaTag : list) {
            if (!set.contains(mediaTag.userId)) {
                list2.add(mediaTag);
            }
        }
        if (list2.size() != list.size()) {
            list = list2;
        }
        return list;
    }
    
    public static boolean a(final List list, final long n) {
        return b(a((Iterable)list), n) != null;
    }
    
    public static MediaTag b(final List list, final long n) {
        for (final MediaTag mediaTag : list) {
            if (mediaTag.userId == n) {
                return mediaTag;
            }
        }
        return null;
    }
    
    public static long[] b(final List list) {
        final long[] array = new long[list.size()];
        for (int i = 0; i < array.length; ++i) {
            array[i] = list.get(i).userId;
        }
        return array;
    }
}
