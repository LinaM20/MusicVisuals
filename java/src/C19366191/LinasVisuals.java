package C19366191;

import ie.tudublin.Visual;
import ie.tudublin.VisualException;
// import ddf.minim.*;
// import ddf.minim.analysis.*;

public class LinasVisuals extends Visual
{
    //Wave wave;
    Sphere s;
    Pryamid pyramid;
    Circle circle;

    public void settings()
    {
        size(1024, 600, P3D);
        //fullScreen();
    }
    
    public void setup()
    {
        startMinim();
        //loadAudio("Punjabi.mp3");
        loadAudio("Dharma.mp3");
        

        //wave = new Wave(this);
        circle = new Circle(this, width/2, height/2, width/10, 500f);
        s = new Sphere(this);
        pyramid = new Pryamid(this);

    }


    public void keyPressed()
    {
        if (key == ' ') 
        {
            // allows for pausing and playing
            if (getAudioPlayer().isPlaying()) {
                getAudioPlayer().pause();
            } else {
                getAudioPlayer().play();
            }
        }
        switch(key)
        {
            case '1':
                circle.render();
                break;
            
            case '2':
                s.render();
                break;

            case '3':
                pyramid.render();
                break;

            
        }
        // if (key == '1')
        // {
        //     s.render();
            
            
            
        // }
        // if (key == '2')
        // {
        //     pyramid.render();
           
            
            
            
        // }
        // if (key == '3')
        // {
        //     circle.render();
        // }
        
    }

    

    public void draw()
    {
        background(0);
        colorMode(HSB);
        calculateAverageAmplitude(); 
        try
        {
            // Call this if you want to use FFT data
            calculateFFT(); 
        }
        catch(VisualException e)
        {
            e.printStackTrace();
        }
        // Call this is you want to use frequency bands
        calculateFrequencyBands(); 

        // Call this is you want to get the average amplitude
        calculateFrequencyBands();
    
        switch(key)
        {
            case '1':
                circle.render();
                break;
            
            case '2':
                s.render();
                break;

            case '3':
                pyramid.render();
                break;

            
        }
        // if (key == '1')
        // {
        //     s.render();
        //    //wave.render();
            
            
            
        // }
        // if (key == '2')
        // {
            
        //     pyramid.render();
           
            
            
            
        // }
        // if (key == '3')
        // {
            
        //     circle.render();
        // }
        
        
        
        

    }
}