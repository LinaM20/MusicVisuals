package C19366191;

import processing.core.*;
import C19366191.LinasVisuals;

// This is an example of a visual that renders the waveform
public class Waveform
{
    LinasVisuals mv;
    float cy = 0;

    

    public Waveform(LinasVisuals mv)
    {
        this.mv = mv;
        cy = this.mv.height / 2;
    }

    public void render()
    {
        mv.colorMode(PApplet.HSB);
        for(int i = 0 ; i < mv.getAudioBuffer().size() ; i ++)
        {
            mv.stroke(
                PApplet.map(i, 0, mv.getAudioBuffer().size(), 0, 255)
                , 255
                , 255
            );

            mv.line(i, cy, i, cy + cy * mv.getAudioBuffer().get(i));
        }
    }
}