package patterns.adapter.preparation_data;

/**
 * The interface Advanced media player.
 */
public interface AdvancedMediaPlayer {
    /**
     * Play vlc audio type .
     *
     * @param fileName the file name
     */
    void playVlc(String fileName);

    /**
     * Play mp4 audio type.
     *
     * @param fileName the file name
     */
    void playMp4(String fileName);
}
