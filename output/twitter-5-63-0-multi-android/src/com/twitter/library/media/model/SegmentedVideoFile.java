// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.media.model;

import java.util.ArrayList;
import com.twitter.util.concurrent.i;
import java.io.Closeable;
import java.io.IOException;
import com.twitter.errorreporter.ErrorReporter;
import com.twitter.library.api.bh;
import java.io.OutputStream;
import com.twitter.util.e;
import com.twitter.library.media.service.tasks.VideoStitchTask;
import com.twitter.internal.android.util.Size;
import java.util.Iterator;
import com.fasterxml.jackson.core.JsonGenerator;
import java.io.InputStream;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.JsonParser;
import com.twitter.library.media.util.z;
import com.twitter.library.media.util.af;
import com.twitter.library.media.util.w;
import com.twitter.util.d;
import android.content.Context;
import java.io.File;
import java.util.Collections;
import android.os.Parcel;
import java.util.List;
import android.os.Parcelable$Creator;

public class SegmentedVideoFile extends MediaFile
{
    public static final Parcelable$Creator CREATOR;
    public final int cameraId;
    public final List playList;
    public final int screenOrientation;
    public final List videoFiles;
    
    static {
        CREATOR = (Parcelable$Creator)new n();
    }
    
    SegmentedVideoFile(final Parcel parcel) {
        super(parcel);
        this.cameraId = parcel.readInt();
        this.videoFiles = Collections.unmodifiableList((List<?>)parcel.readArrayList(VideoFile.class.getClassLoader()));
        this.playList = Collections.unmodifiableList((List<?>)parcel.readArrayList((ClassLoader)null));
        this.screenOrientation = parcel.readInt();
    }
    
    SegmentedVideoFile(final File file, final q q) {
        super(file, q.b.get(0).size, MediaType.e);
        this.cameraId = q.a;
        this.videoFiles = Collections.unmodifiableList((List<?>)q.b);
        this.playList = Collections.unmodifiableList((List<?>)q.c);
        this.screenOrientation = q.d;
    }
    
    public static SegmentedVideoFile a(final File p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: invokestatic    com/twitter/util/d.c:()V
        //     3: new             Ljava/io/FileInputStream;
        //     6: dup            
        //     7: aload_0        
        //     8: invokespecial   java/io/FileInputStream.<init>:(Ljava/io/File;)V
        //    11: astore_1       
        //    12: aload_1        
        //    13: invokestatic    com/twitter/library/media/model/SegmentedVideoFile.a:(Ljava/io/InputStream;)Lcom/twitter/library/media/model/q;
        //    16: astore          5
        //    18: aload           5
        //    20: ifnull          42
        //    23: new             Lcom/twitter/library/media/model/SegmentedVideoFile;
        //    26: dup            
        //    27: aload_0        
        //    28: aload           5
        //    30: invokespecial   com/twitter/library/media/model/SegmentedVideoFile.<init>:(Ljava/io/File;Lcom/twitter/library/media/model/q;)V
        //    33: astore          6
        //    35: aload_1        
        //    36: invokestatic    yp.a:(Ljava/io/Closeable;)V
        //    39: aload           6
        //    41: areturn        
        //    42: aconst_null    
        //    43: astore          6
        //    45: goto            35
        //    48: astore          7
        //    50: aconst_null    
        //    51: astore_3       
        //    52: aload_3        
        //    53: invokestatic    yp.a:(Ljava/io/Closeable;)V
        //    56: aconst_null    
        //    57: areturn        
        //    58: astore          4
        //    60: aconst_null    
        //    61: astore_1       
        //    62: aload_1        
        //    63: invokestatic    yp.a:(Ljava/io/Closeable;)V
        //    66: aload           4
        //    68: athrow         
        //    69: astore          4
        //    71: goto            62
        //    74: astore_2       
        //    75: aload_1        
        //    76: astore_3       
        //    77: goto            52
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  3      12     48     52     Ljava/io/IOException;
        //  3      12     58     62     Any
        //  12     18     74     80     Ljava/io/IOException;
        //  12     18     69     74     Any
        //  23     35     74     80     Ljava/io/IOException;
        //  23     35     69     74     Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0035:
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
    
    public static VideoFile a(final Context context, final EditableSegmentedVideo editableSegmentedVideo) {
        d.c();
        final w a = w.a(context);
        final af af = new af(editableSegmentedVideo);
        final File a2 = a.a(af);
        if (a2 != null) {
            return (VideoFile)MediaFile.a(a2, MediaType.d);
        }
        final File b = b(context, editableSegmentedVideo);
        if (b == null) {
            return null;
        }
        File a3 = a.a(af, b);
        if (a3 == null) {
            a3 = b;
        }
        return (VideoFile)MediaFile.a(a3, MediaType.d);
    }
    
    private static q a(final JsonParser jsonParser) {
        if (jsonParser.d() == JsonToken.b) {
            final q q = new q();
            while (jsonParser.a() == JsonToken.f) {
                jsonParser.a();
                final String e = jsonParser.e();
                switch (e) {
                    default: {
                        jsonParser.c();
                        continue;
                    }
                    case "camera_id": {
                        q.a = jsonParser.h();
                        continue;
                    }
                    case "orientation": {
                        q.d = jsonParser.h();
                        continue;
                    }
                    case "files": {
                        a(jsonParser, q.b);
                        continue;
                    }
                    case "play_list": {
                        b(jsonParser, q.c);
                        continue;
                    }
                }
            }
            b(jsonParser);
            if (!q.b.isEmpty() && !q.c.isEmpty()) {
                return q;
            }
        }
        return null;
    }
    
    static q a(final InputStream p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: invokestatic    com/twitter/library/api/bh.a:(Ljava/io/InputStream;)Lcom/fasterxml/jackson/core/JsonParser;
        //     4: astore          5
        //     6: aload           5
        //     8: astore_2       
        //     9: aload_2        
        //    10: invokestatic    com/twitter/library/media/model/SegmentedVideoFile.a:(Lcom/fasterxml/jackson/core/JsonParser;)Lcom/twitter/library/media/model/q;
        //    13: astore          7
        //    15: aload_2        
        //    16: invokestatic    yp.a:(Ljava/io/Closeable;)V
        //    19: aload           7
        //    21: areturn        
        //    22: astore          4
        //    24: aconst_null    
        //    25: astore_2       
        //    26: aload_2        
        //    27: invokestatic    yp.a:(Ljava/io/Closeable;)V
        //    30: aconst_null    
        //    31: areturn        
        //    32: astore_1       
        //    33: aconst_null    
        //    34: astore_2       
        //    35: aload_1        
        //    36: astore_3       
        //    37: aload_2        
        //    38: invokestatic    yp.a:(Ljava/io/Closeable;)V
        //    41: aload_3        
        //    42: athrow         
        //    43: astore_3       
        //    44: goto            37
        //    47: astore          6
        //    49: goto            26
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  0      6      22     26     Ljava/io/IOException;
        //  0      6      32     37     Any
        //  9      15     47     52     Ljava/io/IOException;
        //  9      15     43     47     Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0026:
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
    
    private void a(final JsonGenerator jsonGenerator) {
        jsonGenerator.c();
        jsonGenerator.a("camera_id", this.cameraId);
        jsonGenerator.a("orientation", this.screenOrientation);
        jsonGenerator.a("files");
        jsonGenerator.a();
        for (final VideoFile videoFile : this.videoFiles) {
            jsonGenerator.c();
            jsonGenerator.a("path", videoFile.file.getAbsolutePath());
            jsonGenerator.a("duration", videoFile.duration);
            jsonGenerator.a("width", videoFile.size.a());
            jsonGenerator.a("height", videoFile.size.b());
            jsonGenerator.d();
        }
        jsonGenerator.b();
        jsonGenerator.a("play_list");
        jsonGenerator.a();
        final Iterator<Integer> iterator2 = this.playList.iterator();
        while (iterator2.hasNext()) {
            jsonGenerator.b(iterator2.next());
        }
        jsonGenerator.b();
        jsonGenerator.d();
    }
    
    private static void a(final JsonParser jsonParser, final List list) {
        if (jsonParser.d() != JsonToken.d) {
            return;
        }
        while (jsonParser.a() == JsonToken.b) {
            File file = null;
            int n = 0;
            int h = 0;
            int h2 = 0;
            while (jsonParser.a() == JsonToken.f) {
                jsonParser.a();
                final String e = jsonParser.e();
                switch (e) {
                    default: {
                        jsonParser.c();
                        continue;
                    }
                    case "path": {
                        file = new File(jsonParser.r());
                        continue;
                    }
                    case "duration": {
                        n = jsonParser.n();
                        continue;
                    }
                    case "width": {
                        h2 = jsonParser.h();
                        continue;
                    }
                    case "height": {
                        h = jsonParser.h();
                        continue;
                    }
                }
            }
            b(jsonParser);
            if (file != null && n > 0) {
                list.add(new VideoFile(file, n, Size.a(h2, h)));
            }
        }
        c(jsonParser);
    }
    
    private static File b(final Context context, final EditableSegmentedVideo editableSegmentedVideo) {
        d.c();
        final File a = com.twitter.library.util.af.a(context, MediaType.d.extension);
        if (a == null) {
            return null;
        }
        if (!new VideoStitchTask(((SegmentedVideoFile)editableSegmentedVideo.mediaFile).videoFiles, a).d(context)) {
            return null;
        }
        return a;
    }
    
    private static void b(final JsonParser jsonParser) {
        if (e.e() && jsonParser.d() != JsonToken.c) {
            throw new RuntimeException();
        }
    }
    
    private static void b(final JsonParser jsonParser, final List list) {
        if (jsonParser.d() != JsonToken.d) {
            return;
        }
        while (jsonParser.a() == JsonToken.i) {
            list.add(jsonParser.h());
        }
        c(jsonParser);
    }
    
    private static void c(final JsonParser jsonParser) {
        if (e.e() && jsonParser.d() != JsonToken.e) {
            throw new RuntimeException();
        }
    }
    
    private Object writeReplace() {
        return new SegmentedVideoFile$SerializationProxy(this);
    }
    
    void a(final OutputStream outputStream) {
        JsonGenerator a = null;
        try {
            a = bh.a.a(outputStream);
            this.a(a);
        }
        catch (IOException ex) {
            ErrorReporter.a(ex);
        }
        finally {
            yh.a(a);
        }
    }
    
    @Override
    public boolean a() {
        d.c();
        for (final VideoFile videoFile : this.videoFiles) {
            videoFile.a();
            videoFile.file.delete();
        }
        return this.file.delete() && this.file.getParentFile().delete();
    }
    
    public boolean a(final SegmentedVideoFile segmentedVideoFile) {
        return this == segmentedVideoFile || (segmentedVideoFile != null && this.a(segmentedVideoFile) && segmentedVideoFile.cameraId == this.cameraId && segmentedVideoFile.videoFiles.equals(this.videoFiles) && segmentedVideoFile.playList.equals(this.playList));
    }
    
    @Override
    public i c() {
        final ArrayList<File> list = new ArrayList<File>(2 + this.videoFiles.size());
        final Iterator<VideoFile> iterator = this.videoFiles.iterator();
        while (iterator.hasNext()) {
            list.add(iterator.next().file);
        }
        list.add(this.file);
        list.add(this.file.getParentFile());
        return com.twitter.library.util.af.a(list, false);
    }
    
    public int d() {
        final Iterator<Integer> iterator = this.playList.iterator();
        int n = 0;
        while (iterator.hasNext()) {
            n += this.videoFiles.get(iterator.next()).duration;
        }
        return n;
    }
    
    void e() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: aconst_null    
        //     4: astore_1       
        //     5: new             Ljava/io/FileOutputStream;
        //     8: dup            
        //     9: aload_0        
        //    10: getfield        com/twitter/library/media/model/SegmentedVideoFile.file:Ljava/io/File;
        //    13: invokespecial   java/io/FileOutputStream.<init>:(Ljava/io/File;)V
        //    16: astore_2       
        //    17: aload_0        
        //    18: aload_2        
        //    19: invokevirtual   com/twitter/library/media/model/SegmentedVideoFile.a:(Ljava/io/OutputStream;)V
        //    22: aload_2        
        //    23: invokestatic    yp.a:(Ljava/io/Closeable;)V
        //    26: return         
        //    27: astore_3       
        //    28: aconst_null    
        //    29: astore_2       
        //    30: aload_3        
        //    31: invokestatic    com/twitter/errorreporter/ErrorReporter.a:(Ljava/lang/Throwable;)V
        //    34: aload_2        
        //    35: invokestatic    yp.a:(Ljava/io/Closeable;)V
        //    38: return         
        //    39: astore          4
        //    41: aload_1        
        //    42: invokestatic    yp.a:(Ljava/io/Closeable;)V
        //    45: aload           4
        //    47: athrow         
        //    48: astore          4
        //    50: aload_2        
        //    51: astore_1       
        //    52: goto            41
        //    55: astore_3       
        //    56: goto            30
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  5      17     27     30     Ljava/io/IOException;
        //  5      17     39     41     Any
        //  17     22     55     59     Ljava/io/IOException;
        //  17     22     48     55     Any
        //  30     34     48     55     Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0030:
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
    
    @Override
    public boolean equals(final Object o) {
        return this == o || (o instanceof SegmentedVideoFile && this.a((SegmentedVideoFile)o));
    }
    
    @Override
    public int hashCode() {
        return 31 * (31 * (31 * super.hashCode() + this.cameraId) + this.videoFiles.hashCode()) + this.playList.hashCode();
    }
    
    @Override
    public void writeToParcel(final Parcel parcel, final int n) {
        super.writeToParcel(parcel, n);
        parcel.writeInt(this.cameraId);
        parcel.writeList(this.videoFiles);
        parcel.writeList(this.playList);
        parcel.writeInt(this.screenOrientation);
    }
}
