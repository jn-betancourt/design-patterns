package structural.facade.complex_video_media_app;

/**
 * The `CodecFactory` class provides a static method to extract the appropriate codec based on the
 * codec type of a given `VideoFile`.
 */
public class CodecFactory {
    public static Codec extract(VideoFile file) {
        String type = file.getCodecType();
       // The `if` block in the `extract` method of the `CodecFactory` class is checking if the codec
       // type of the `VideoFile` is "mp4". If the codec type is "mp4", it prints a message
       // "CodecFactory: extracting mpeg audio..." to indicate that it is extracting an MPEG audio
       // codec, and then it returns a new instance of `MPEG4CompressionCodec`. This logic allows the
       // `CodecFactory` to provide the appropriate codec based on the codec type specified in the
       // `VideoFile`.
        if (type.equals("mp4")) {
            System.out.println("CodecFactory: extracting mpeg audio...");
            return new MPEG4CompressionCodec();
        }
        // The `else` block in the `extract` method of the `CodecFactory` class is responsible for
        // handling the case when the codec type of the `VideoFile` is not "mp4". In this case, it
        // prints a message "CodecFactory: extracting ogg audio..." to indicate that it is extracting
        // an Ogg audio codec, and then it returns a new instance of `OggCompressionCodec`. This allows
        // the `CodecFactory` to provide the appropriate codec based on the codec type specified in the
        // `VideoFile`.
        else {
            System.out.println("CodecFactory: extracting ogg audio...");
            return new OggCompressionCodec();
        }
    }
}
