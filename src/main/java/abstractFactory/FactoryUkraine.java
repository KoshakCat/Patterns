package abstractFactory;

public class FactoryUkraine implements Factory {
    public Audio createAudio() {
        return new AudioUkraine();
    }

    public Subtitle createSubtitle() {
        return new SubtitleUkraine();
    }
}
