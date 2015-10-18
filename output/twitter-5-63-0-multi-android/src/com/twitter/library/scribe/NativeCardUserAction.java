// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.scribe;

import com.twitter.util.l;
import com.fasterxml.jackson.core.JsonGenerator;
import com.twitter.library.media.manager.j;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Button;
import com.twitter.library.media.widget.MediaImageView;
import android.view.MotionEvent;
import android.view.View;
import android.os.Parcel;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

public class NativeCardUserAction implements Parcelable
{
    public static final Parcelable$Creator CREATOR;
    private int a;
    private int b;
    private int c;
    private int d;
    private int e;
    private String f;
    private String g;
    private int h;
    
    static {
        CREATOR = (Parcelable$Creator)new b();
    }
    
    public NativeCardUserAction(final Parcel parcel) {
        this.a = -1;
        this.b = -1;
        this.c = -1;
        this.d = -1;
        this.e = -1;
        this.h = -1;
        this.a = parcel.readInt();
        this.b = parcel.readInt();
        this.c = parcel.readInt();
        this.d = parcel.readInt();
        this.e = parcel.readInt();
        this.f = parcel.readString();
        this.g = parcel.readString();
        this.h = parcel.readInt();
    }
    
    private NativeCardUserAction(final View view, final View view2, final MotionEvent motionEvent, final int h) {
        this.a = -1;
        this.b = -1;
        this.c = -1;
        this.d = -1;
        this.e = -1;
        this.h = -1;
        final int[] array = new int[2];
        view.getLocationInWindow(array);
        this.a = (int)(motionEvent.getRawX() - array[0]);
        this.b = (int)(motionEvent.getRawY() - array[1]);
        this.c = view.getWidth();
        this.d = view.getHeight();
        this.h = h;
        final Object tag = view2.getTag();
        if (tag instanceof String) {
            this.f = (String)tag;
        }
        if (view2 instanceof MediaImageView) {
            this.e = 1;
            final j imageRequest = ((MediaImageView)view2).getImageRequest();
            String a;
            if (imageRequest != null) {
                a = imageRequest.a();
            }
            else {
                a = null;
            }
            this.g = a;
        }
        else {
            if (view2 instanceof Button) {
                this.e = 4;
                this.g = ((Button)view2).getText().toString();
                return;
            }
            if (view2 instanceof TextView) {
                this.e = 2;
                this.g = ((TextView)view2).getText().toString();
                return;
            }
            if (view2 instanceof ViewGroup) {
                this.e = 0;
            }
        }
    }
    
    public static NativeCardUserAction a(final View view, final View view2, final MotionEvent motionEvent, final int n) {
        if (motionEvent != null) {
            return new NativeCardUserAction(view, view2, motionEvent, n);
        }
        return null;
    }
    
    public void a(final JsonGenerator jsonGenerator) {
        jsonGenerator.c();
        jsonGenerator.a("x_coord", this.a);
        jsonGenerator.a("y_coord", this.b);
        jsonGenerator.a("width", this.c);
        jsonGenerator.a("height", this.d);
        jsonGenerator.a("card_elements");
        jsonGenerator.a();
        jsonGenerator.c();
        jsonGenerator.a("element_type", this.e);
        if (this.f != null) {
            jsonGenerator.a("element_name", this.f);
        }
        if (this.g != null) {
            jsonGenerator.a("element_value", this.g);
        }
        jsonGenerator.d();
        jsonGenerator.b();
        jsonGenerator.a("action_type", this.h);
        jsonGenerator.d();
    }
    
    public boolean a(final NativeCardUserAction nativeCardUserAction) {
        return this == nativeCardUserAction || (nativeCardUserAction != null && this.h == nativeCardUserAction.h && this.d == nativeCardUserAction.d && this.c == nativeCardUserAction.c && this.e == nativeCardUserAction.e && this.a == nativeCardUserAction.a && this.b == nativeCardUserAction.b && l.a(this.f, nativeCardUserAction.f) && l.a(this.g, nativeCardUserAction.g));
    }
    
    public int describeContents() {
        return 0;
    }
    
    @Override
    public boolean equals(final Object o) {
        return this == o || (o != null && o instanceof NativeCardUserAction && this.a((NativeCardUserAction)o));
    }
    
    @Override
    public int hashCode() {
        return 31 * (31 * (31 * (31 * (31 * this.a + this.b) + this.c) + this.d) + this.e) + this.h;
    }
    
    @Override
    public String toString() {
        return "NativeCardUserAction{mXCoord=" + this.a + ", mYCoord=" + this.b + ", mCardWidth=" + this.c + ", mCardHeight=" + this.d + ", mElementType=" + this.e + ", mElementName='" + this.f + '\'' + ", mElementValue='" + this.g + '\'' + ", mActionType=" + this.h + '}';
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeInt(this.a);
        parcel.writeInt(this.b);
        parcel.writeInt(this.c);
        parcel.writeInt(this.d);
        parcel.writeInt(this.e);
        parcel.writeString(this.f);
        parcel.writeString(this.g);
        parcel.writeInt(this.h);
    }
}
