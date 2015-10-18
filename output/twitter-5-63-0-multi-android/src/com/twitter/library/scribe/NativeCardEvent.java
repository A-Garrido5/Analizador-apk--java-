// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.scribe;

import com.fasterxml.jackson.core.JsonGenerator;
import org.json.JSONException;
import org.json.JSONObject;
import android.os.Parcel;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

public class NativeCardEvent implements Parcelable
{
    public static final Parcelable$Creator CREATOR;
    private String a;
    private String b;
    private NativeCardUserAction c;
    private String d;
    private int e;
    private boolean f;
    private boolean g;
    private boolean h;
    
    static {
        CREATOR = (Parcelable$Creator)new a();
    }
    
    public NativeCardEvent(final Parcel parcel) {
        boolean h = true;
        this.e = -1;
        this.a = parcel.readString();
        this.b = parcel.readString();
        if (parcel.readByte() == (h ? 1 : 0)) {
            this.c = new NativeCardUserAction(parcel);
        }
        this.d = parcel.readString();
        this.e = parcel.readInt();
        this.f = (parcel.readInt() == (h ? 1 : 0) && h);
        this.g = (parcel.readInt() == (h ? 1 : 0) && h);
        if (parcel.readInt() != (h ? 1 : 0)) {
            h = false;
        }
        this.h = h;
    }
    
    public NativeCardEvent(final String a) {
        this.e = -1;
        this.a = a;
    }
    
    private String b(final String s) {
        if (s != null) {
            try {
                final String string = new JSONObject(s).toString();
                if (string.length() > 2) {
                    return string.substring(1, -1 + string.length());
                }
            }
            catch (JSONException ex) {
                return null;
            }
        }
        return null;
    }
    
    public void a(final int e) {
        this.e = e;
    }
    
    public void a(final JsonGenerator jsonGenerator) {
        int n = 1;
        jsonGenerator.c();
        final String b = this.b;
        int n2 = 0;
        if (b != null) {
            jsonGenerator.a("card_layout_version", this.b);
            n2 = n;
        }
        if (this.c != null) {
            jsonGenerator.a("card_user_action");
            this.c.a(jsonGenerator);
            n2 = n;
        }
        if (this.d != null) {
            jsonGenerator.a("network_provider", this.d);
            n2 = n;
        }
        if (this.e != -1) {
            jsonGenerator.a("publisher_app_install_status", this.e);
            n2 = n;
        }
        if (this.f) {
            jsonGenerator.a("card_user_data");
            jsonGenerator.c();
            jsonGenerator.d("binding_values");
            jsonGenerator.c();
            jsonGenerator.a("name", "markup_prefetch_try");
            jsonGenerator.a("value", Boolean.toString(this.g));
            jsonGenerator.d();
            jsonGenerator.c();
            jsonGenerator.a("name", "markup_prefetch_use");
            jsonGenerator.a("value", Boolean.toString(this.h));
            jsonGenerator.d();
            jsonGenerator.b();
            jsonGenerator.d();
        }
        else {
            n = n2;
        }
        final String b2 = this.b(this.a);
        if (b2 != null) {
            if (n != 0) {
                jsonGenerator.c(",");
            }
            jsonGenerator.c(b2);
        }
        jsonGenerator.d();
    }
    
    public void a(final NativeCardUserAction c) {
        this.c = c;
    }
    
    public void a(final String b) {
        this.b = b;
    }
    
    public void a(final boolean g, final boolean h) {
        this.f = true;
        this.g = g;
        this.h = h;
    }
    
    public int describeContents() {
        return 0;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this != o) {
            if (o == null || this.getClass() != o.getClass()) {
                return false;
            }
            final NativeCardEvent nativeCardEvent = (NativeCardEvent)o;
            if (this.e != nativeCardEvent.e) {
                return false;
            }
            if (this.b != null && !this.b.equals(nativeCardEvent.b)) {
                return false;
            }
            if (this.a != null && !this.a.equals(nativeCardEvent.a)) {
                return false;
            }
            if (this.c != null && !this.c.a(nativeCardEvent.c)) {
                return false;
            }
            if (this.d != null && !this.d.equals(nativeCardEvent.d)) {
                return false;
            }
            if (this.f != nativeCardEvent.f) {
                return false;
            }
            if (this.g != nativeCardEvent.g) {
                return false;
            }
            if (this.h != nativeCardEvent.h) {
                return false;
            }
        }
        return true;
    }
    
    @Override
    public int hashCode() {
        int n = 1;
        final int n2 = 31 * (31 * (31 * (31 * (31 * this.a.hashCode() + this.b.hashCode()) + this.c.hashCode()) + this.d.hashCode()) + this.e);
        int n3;
        if (this.f) {
            n3 = n;
        }
        else {
            n3 = 0;
        }
        final int n4 = 31 * (n3 + n2);
        int n5;
        if (this.g) {
            n5 = n;
        }
        else {
            n5 = 0;
        }
        final int n6 = 31 * (n5 + n4);
        if (!this.h) {
            n = 0;
        }
        return n6 + n;
    }
    
    @Override
    public String toString() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: new             Ljava/io/StringWriter;
        //     3: dup            
        //     4: invokespecial   java/io/StringWriter.<init>:()V
        //     7: astore_1       
        //     8: new             Lcom/fasterxml/jackson/core/JsonFactory;
        //    11: dup            
        //    12: invokespecial   com/fasterxml/jackson/core/JsonFactory.<init>:()V
        //    15: aload_1        
        //    16: invokevirtual   com/fasterxml/jackson/core/JsonFactory.a:(Ljava/io/Writer;)Lcom/fasterxml/jackson/core/JsonGenerator;
        //    19: astore          6
        //    21: aload           6
        //    23: astore_3       
        //    24: aload_0        
        //    25: aload_3        
        //    26: invokevirtual   com/twitter/library/scribe/NativeCardEvent.a:(Lcom/fasterxml/jackson/core/JsonGenerator;)V
        //    29: aload_3        
        //    30: invokevirtual   com/fasterxml/jackson/core/JsonGenerator.flush:()V
        //    33: aload_1        
        //    34: invokevirtual   java/io/StringWriter.getBuffer:()Ljava/lang/StringBuffer;
        //    37: invokevirtual   java/lang/StringBuffer.toString:()Ljava/lang/String;
        //    40: astore          8
        //    42: aload_3        
        //    43: invokestatic    yp.a:(Ljava/io/Closeable;)V
        //    46: aload           8
        //    48: areturn        
        //    49: astore          5
        //    51: aconst_null    
        //    52: astore_3       
        //    53: aload_3        
        //    54: invokestatic    yp.a:(Ljava/io/Closeable;)V
        //    57: ldc             ""
        //    59: areturn        
        //    60: astore_2       
        //    61: aconst_null    
        //    62: astore_3       
        //    63: aload_2        
        //    64: astore          4
        //    66: aload_3        
        //    67: invokestatic    yp.a:(Ljava/io/Closeable;)V
        //    70: aload           4
        //    72: athrow         
        //    73: astore          4
        //    75: goto            66
        //    78: astore          7
        //    80: goto            53
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  0      21     49     53     Ljava/io/IOException;
        //  0      21     60     66     Any
        //  24     42     78     83     Ljava/io/IOException;
        //  24     42     73     78     Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0053:
        //     at com.strobel.decompiler.ast.Error.expressionLinkedFromMultipleLocations(Error.java:27)
        //     at com.strobel.decompiler.ast.AstOptimizer.mergeDisparateObjectInitializations(AstOptimizer.java:2592)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:235)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:42)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:214)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:99)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:757)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:655)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:532)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:499)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:141)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:130)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:105)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:317)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:238)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:123)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        byte b = 1;
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        if (this.c != null) {
            parcel.writeByte(b);
            this.c.writeToParcel(parcel, n);
        }
        else {
            parcel.writeByte((byte)0);
        }
        parcel.writeString(this.d);
        parcel.writeInt(this.e);
        int n2;
        if (this.f) {
            n2 = b;
        }
        else {
            n2 = 0;
        }
        parcel.writeInt(n2);
        int n3;
        if (this.g) {
            n3 = b;
        }
        else {
            n3 = 0;
        }
        parcel.writeInt(n3);
        if (!this.h) {
            b = 0;
        }
        parcel.writeInt((int)b);
    }
}
