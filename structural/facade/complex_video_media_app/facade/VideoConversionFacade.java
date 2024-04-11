package structural.facade.complex_video_media_app.facade;

import java.io.File;
import structural.facade.complex_video_media_app.*;

// this class acts as a simplified interface for converting video files to a specified
// format using different codecs and performing various operations like bitrate reading and audio
// mixing.
public class VideoConversionFacade {
   /**
    * The `convertVideo` function converts a video file to a specified format using different codecs
    * and performs bitrate reading and audio mixing operations.
    * 
    * @param fileName The `fileName` parameter is the name of the video file that you want to convert.
    * @param format The `format` parameter in the `convertVideo` method specifies the desired format
    * for the video conversion. In the provided code snippet, the method checks if the format is "mp4"
    * and then uses the `MPEG4CompressionCodec` for destination codec if the format is "mp4".
    * @return The method `convertVideo` returns a `File` object, which represents the result of the
    * video conversion process.
    */
    public File convertVideo(String fileName, String format) {
        System.out.println("VideoConversionFacade: conversion started.");
        VideoFile file = new VideoFile(fileName);
        Codec sourceCodec = CodecFactory.extract(file);
        Codec destinationCodec;
        if (format.equals("mp4")) {
            destinationCodec = new MPEG4CompressionCodec();
        } else {
            destinationCodec = new OggCompressionCodec();
        }
        VideoFile buffer = BitrateReader.read(file, sourceCodec);
        VideoFile intermediateResult = BitrateReader.convert(buffer, destinationCodec);
        File result = (new AudioMixer()).fix(intermediateResult);
        System.out.println("VideoConversionFacade: conversion completed.");
        return result;
    }
}
