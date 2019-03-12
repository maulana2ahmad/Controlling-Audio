# Controlling-Audio
Controling Audio

### Source
  //global variable
  MediaPlayer mediaPlayer;

 //if the variable is here continue the media player that pause
        mediaPlayer = MediaPlayer.create(this, R.raw.bluebird);

    }

    public void playAudio(View view) {

        mediaPlayer.start();
    }

    public void pauseAudio(View view) {
        mediaPlayer.pause(); //pause

        //mediaPlayer.stop(); //stop

    }
