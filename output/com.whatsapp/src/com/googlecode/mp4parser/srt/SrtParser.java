// 
// Decompiled by Procyon v0.5.30
// 

package com.googlecode.mp4parser.srt;

import java.io.IOException;
import java.io.Reader;
import java.io.LineNumberReader;
import java.io.InputStreamReader;
import com.googlecode.mp4parser.authoring.tracks.TextTrackImpl;
import java.io.InputStream;

public class SrtParser
{
    private static long parse(final String s) {
        return Long.parseLong(s.split(":")[2].split(",")[1].trim()) + (1000L * (60L * (60L * Long.parseLong(s.split(":")[0].trim()))) + 1000L * (60L * Long.parseLong(s.split(":")[1].trim())) + 1000L * Long.parseLong(s.split(":")[2].split(",")[0].trim()));
    }
    
    public static TextTrackImpl parse(final InputStream inputStream) throws IOException {
        final LineNumberReader lineNumberReader = new LineNumberReader(new InputStreamReader(inputStream, "UTF-8"));
        final TextTrackImpl textTrackImpl = new TextTrackImpl();
        while (lineNumberReader.readLine() != null) {
            final String line = lineNumberReader.readLine();
            String string = "";
            while (true) {
                final String line2 = lineNumberReader.readLine();
                if (line2 == null || line2.trim().equals("")) {
                    break;
                }
                string = String.valueOf(string) + line2 + "\n";
            }
            textTrackImpl.getSubs().add(new TextTrackImpl.Line(parse(line.split("-->")[0]), parse(line.split("-->")[1]), string));
        }
        return textTrackImpl;
    }
}
