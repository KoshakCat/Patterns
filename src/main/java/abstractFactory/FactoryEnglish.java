package abstractFactory;

public class FactoryEnglish implements Factory {
    public Audio createAudio() {
        return new AudioEnglish();
    }

    public Subtitle createSubtitle() {
        return new SubtitlesEnglish();
    }
}
