# Controlling-Audio
Controling Audio

## Priview
![controling-audio](https://user-images.githubusercontent.com/43386555/54200245-83ca5200-44fd-11e9-987d-a267374fab94.gif)

## 1. Add MediaPlayer
```java
//global variable
  MediaPlayer mediaPlayer;

### Code:
```java
 //if the variable is here continue the media player that pause
  
   mediaPlayer = MediaPlayer.create(this, R.raw.bluebird)
  }
    public void playAudio(View view) {

        mediaPlayer.start();
    }

    public void pauseAudio(View view) {
        mediaPlayer.pause(); //pause

        //mediaPlayer.stop(); //stop

    }
