import com.twitter.library.api.geo.Coordinate;

// 
// Decompiled by Procyon v0.5.30
// 

public class sj
{
    public static Coordinate a(final Coordinate coordinate, final Coordinate coordinate2) {
        final double radians = Math.toRadians(coordinate2.b() - coordinate.b());
        final double radians2 = Math.toRadians(coordinate.a());
        final double radians3 = Math.toRadians(coordinate2.a());
        final double radians4 = Math.toRadians(coordinate.b());
        final double n = Math.cos(radians3) * Math.cos(radians);
        final double n2 = Math.cos(radians3) * Math.sin(radians);
        return new Coordinate(Math.toDegrees(Math.atan2(Math.sin(radians2) + Math.sin(radians3), Math.sqrt((n + Math.cos(radians2)) * (n + Math.cos(radians2)) + n2 * n2))), Math.toDegrees(radians4 + Math.atan2(n2, n + Math.cos(radians2))));
    }
}
