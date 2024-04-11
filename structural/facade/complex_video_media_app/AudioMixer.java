package structural.facade.complex_video_media_app;
import java.io.File;
/**
 * The `AudioMixer` class contains a method `fix` that fixes the audio of a `VideoFile` and returns a
 * `File`.
 */
public class AudioMixer {
    public File fix(VideoFile result){
        System.out.println("AudioMixer: fixing audio...");
        return new File("tmp");
    }
}
