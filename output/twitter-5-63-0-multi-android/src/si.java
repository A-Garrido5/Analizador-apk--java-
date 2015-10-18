import com.twitter.library.api.geo.Coordinate;
import com.twitter.library.api.geo.TwitterPlace$PlaceInfo;

// 
// Decompiled by Procyon v0.5.30
// 

public class si
{
    public static Coordinate a(final TwitterPlace$PlaceInfo twitterPlace$PlaceInfo) {
        return twitterPlace$PlaceInfo.boundingCoordinates.get(0);
    }
    
    public static Coordinate b(final TwitterPlace$PlaceInfo twitterPlace$PlaceInfo) {
        return twitterPlace$PlaceInfo.boundingCoordinates.get(2);
    }
}
