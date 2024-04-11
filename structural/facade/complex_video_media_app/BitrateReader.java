package structural.facade.complex_video_media_app;

/**
 * The `BitrateReader` class in Java provides methods for reading and converting video files using a
 * specified codec.
 */
public class BitrateReader {
    public static VideoFile read(VideoFile file, Codec codec) {
        System.out.println("BitrateReader: reading file...");
        return file;
    }

    public static VideoFile convert(VideoFile buffer, Codec codec) {
        System.out.println("BitrateReader: writing file...");
        return buffer;
    }
}
