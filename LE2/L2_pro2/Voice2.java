public class Voice2 {
    private Voice voice;

    public Voice2() {
        voice = new Voice();
    }

    public void templateMethod() {
        voice.prepareVoice();
        voice.hear();
    }
}