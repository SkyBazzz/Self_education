package patterns.adapter.preparation_data;

/**
 * Media adapter.
 */
public class MediaAdapter implements MediaPlayer {
    /**
     * The Advanced media player.
     */
    AdvancedMediaPlayer advancedMediaPlayer;

    /**
     * Instantiates a new Media adapter.
     *
     * @param audioType type of music the audio type
     */
    public MediaAdapter(String audioType) {
        if ("vlc".equalsIgnoreCase(audioType)) {
            advancedMediaPlayer = new VlcPlayer();
        } else if ("mp4".equalsIgnoreCase(audioType)) {
            advancedMediaPlayer = new Mp4Player();
        }
    }

    /**
     * Instantiates playing.
     *
     * @param audioType type of music the audio type
     * @param filename song name
     */
    public void play(String audioType, String filename) {
        if ("vlc".equalsIgnoreCase(audioType)) {
            advancedMediaPlayer.playVlc(filename);
        } else if ("mp4".equalsIgnoreCase(audioType)) {
            advancedMediaPlayer.playMp4(filename);
        }
    }
}
