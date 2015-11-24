// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.media.model.legacy;

import java.util.Iterator;
import com.twitter.library.api.MediaTag;
import java.util.ArrayList;
import java.util.List;
import com.twitter.library.media.model.EditableSegmentedVideo;
import com.twitter.library.media.model.SegmentedVideoFile;
import com.twitter.library.media.model.EditableVideo;
import com.twitter.library.media.model.VideoFile;
import com.twitter.library.media.model.EditableAnimatedGif;
import com.twitter.library.media.model.AnimatedGifFile;
import java.util.Collection;
import com.twitter.library.media.model.EditableImage;
import com.twitter.library.media.model.ImageFile;
import com.twitter.library.media.model.MediaFile;
import java.io.File;
import com.twitter.errorreporter.ErrorReporter;
import android.net.Uri;
import com.twitter.util.d;
import com.twitter.library.media.model.EditableMedia;

@Deprecated
public class a
{
    public static EditableMedia a(final MediaEntity mediaEntity, final String s) {
        d.c();
        String s2;
        if (mediaEntity.composerSourceUrl != null) {
            s2 = mediaEntity.composerSourceUrl;
        }
        else if (mediaEntity.mediaUrl != null) {
            s2 = mediaEntity.mediaUrl;
        }
        else {
            s2 = mediaEntity.url;
        }
        if (s2 != null) {
            final Uri parse = Uri.parse(s2);
            if (!"file".equals(parse.getScheme())) {
                ErrorReporter.a(new IllegalStateException("MediaEntity has an non-file media uri=" + parse));
            }
            else {
                final MediaFile a = MediaFile.a(new File(parse.getPath()), mediaEntity.type);
                if (a == null) {
                    return null;
                }
                switch (c.a[a.type.ordinal()]) {
                    case 1: {
                        final EditableImage editableImage = new EditableImage((ImageFile)a, s);
                        editableImage.enhanced = mediaEntity.enhanced;
                        editableImage.filterId = mediaEntity.effect;
                        editableImage.intensity = mediaEntity.intensity;
                        editableImage.cropRect = mediaEntity.cropRect;
                        editableImage.rotation = mediaEntity.rotation;
                        editableImage.tags = a(mediaEntity.tags);
                        return editableImage;
                    }
                    case 2: {
                        return new EditableAnimatedGif((AnimatedGifFile)a, s);
                    }
                    case 3: {
                        final EditableVideo editableVideo = new EditableVideo((VideoFile)a, s);
                        editableVideo.clipStart = mediaEntity.clipStart;
                        editableVideo.clipEnd = mediaEntity.clipEnd;
                        return editableVideo;
                    }
                    case 4: {
                        return new EditableSegmentedVideo((SegmentedVideoFile)a, s);
                    }
                }
            }
        }
        return null;
    }
    
    public static Object a(final byte[] p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: ifnonnull       6
        //     4: aconst_null    
        //     5: areturn        
        //     6: new             Ljava/io/ByteArrayInputStream;
        //     9: dup            
        //    10: aload_0        
        //    11: invokespecial   java/io/ByteArrayInputStream.<init>:([B)V
        //    14: astore_1       
        //    15: new             Lcom/twitter/library/media/model/legacy/b;
        //    18: dup            
        //    19: aload_1        
        //    20: invokespecial   com/twitter/library/media/model/legacy/b.<init>:(Ljava/io/InputStream;)V
        //    23: astore_2       
        //    24: aload_2        
        //    25: invokevirtual   java/io/ObjectInputStream.readObject:()Ljava/lang/Object;
        //    28: astore          5
        //    30: aload_2        
        //    31: invokestatic    yp.a:(Ljava/io/Closeable;)V
        //    34: aload_1        
        //    35: invokestatic    yp.a:(Ljava/io/Closeable;)V
        //    38: aload           5
        //    40: areturn        
        //    41: astore_3       
        //    42: aconst_null    
        //    43: astore_2       
        //    44: invokestatic    com/twitter/library/client/App.a:()Z
        //    47: ifne            62
        //    50: invokestatic    com/twitter/library/client/App.b:()Z
        //    53: ifne            62
        //    56: invokestatic    com/twitter/library/client/App.c:()Z
        //    59: ifeq            66
        //    62: aload_3        
        //    63: invokestatic    com/twitter/errorreporter/ErrorReporter.a:(Ljava/lang/Throwable;)V
        //    66: aload_2        
        //    67: invokestatic    yp.a:(Ljava/io/Closeable;)V
        //    70: aload_1        
        //    71: invokestatic    yp.a:(Ljava/io/Closeable;)V
        //    74: aconst_null    
        //    75: areturn        
        //    76: astore          6
        //    78: aconst_null    
        //    79: astore_2       
        //    80: aload           6
        //    82: astore          4
        //    84: aload_2        
        //    85: invokestatic    yp.a:(Ljava/io/Closeable;)V
        //    88: aload_1        
        //    89: invokestatic    yp.a:(Ljava/io/Closeable;)V
        //    92: aload           4
        //    94: athrow         
        //    95: astore          4
        //    97: goto            84
        //   100: astore_3       
        //   101: goto            44
        //   104: astore_3       
        //   105: aconst_null    
        //   106: astore_2       
        //   107: goto            44
        //   110: astore_3       
        //   111: goto            44
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                              
        //  -----  -----  -----  -----  ----------------------------------
        //  15     24     41     44     Ljava/io/IOException;
        //  15     24     104    110    Ljava/lang/ClassNotFoundException;
        //  15     24     76     84     Any
        //  24     30     100    104    Ljava/io/IOException;
        //  24     30     110    114    Ljava/lang/ClassNotFoundException;
        //  24     30     95     100    Any
        //  44     62     95     100    Any
        //  62     66     95     100    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0044:
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
    
    @Deprecated
    private static List a(final Collection collection) {
        final ArrayList<MediaTag> list = new ArrayList<MediaTag>(collection.size());
        for (final com.twitter.library.media.model.legacy.MediaTag mediaTag : collection) {
            list.add(new MediaTag(mediaTag.userId, mediaTag.name, mediaTag.screenName));
        }
        return list;
    }
    
    public static List a(final List list, final String s) {
        d.c();
        final ArrayList<EditableMedia> list2 = new ArrayList<EditableMedia>(list.size());
        final Iterator<MediaEntity> iterator = list.iterator();
        while (iterator.hasNext()) {
            final EditableMedia a = a(iterator.next(), s);
            if (a != null) {
                list2.add(a);
            }
        }
        return list2;
    }
}
