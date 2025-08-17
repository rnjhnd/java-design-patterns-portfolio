public class ChangePlaylist implements Command {
    private MusicSystem music;

    public ChangePlaylist(MusicSystem music) {
        this.music = music;
    }

    @Override
    public void execute() {
        music.changePlaylist();
    }
}