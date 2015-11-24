// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.media.model;

import com.twitter.library.media.manager.j;
import com.twitter.library.media.manager.k;
import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable$Creator;

public class EditableAnimatedGif extends EditableMedia
{
    public static final Parcelable$Creator CREATOR;
    
    static {
        CREATOR = (Parcelable$Creator)new b();
    }
    
    EditableAnimatedGif(final Parcel parcel) {
        super(parcel);
    }
    
    public EditableAnimatedGif(final AnimatedGifFile animatedGifFile, final String s) {
        super(animatedGifFile, s);
    }
    
    private Object writeReplace() {
        return new EditableAnimatedGif$SerializationProxy(this);
    }
    
    @Override
    public float a() {
        return ((AnimatedGifFile)this.mediaFile).size.e();
    }
    
    public AnimatedGifFile a(final Context context) {
        return (AnimatedGifFile)this.mediaFile;
    }
    
    @Override
    public k b(final Context context) {
        return j.a(this.mediaFile);
    }
    
    @Override
    public void writeToParcel(final Parcel parcel, final int n) {
        super.writeToParcel(parcel, n);
    }
}
