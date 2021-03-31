package C19366191;

import ie.tudublin.Visual;

public class LinasVisuals extends Visual
{
    public void settings()
    {
        size(1024, 500);
    }
    
    public void setup()
    {
        startMinim();
        loadAudio("Punjabi.mp3");
    }

    public void keyPressed()
    {
        if (key == ' ')
        {
            getAudioPlayer().cue(0);
            getAudioPlayer().play();
        }
    }

    public void draw()
    {
        background(0);
    }
}