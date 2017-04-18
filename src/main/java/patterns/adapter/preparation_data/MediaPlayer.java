package patterns.adapter.preparation_data;

/**
 * The interface Media player.
 */
public interface MediaPlayer {
    /**
     * Play.
     *
     * @param audioType the audio type
     * @param filename  the filename
     */
    void play(String audioType, String filename);
}
