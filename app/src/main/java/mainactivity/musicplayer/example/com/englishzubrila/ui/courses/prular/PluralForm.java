package mainactivity.musicplayer.example.com.englishzubrila.ui.courses.prular;

import android.media.MediaPlayer;
import android.os.Handler;
import android.support.annotation.NonNull;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.SeekBar;

import mainactivity.musicplayer.example.com.englishzubrila.R;

public class PluralForm extends AppCompatActivity {

    private Toolbar toolbar;
    private ActionBar actionBar;

    private ImageView bPley1,bPley2,bPley3,bPley4,bPley5,bPley6;
    private SeekBar seekBar1, seekBar2,seekBar3,seekBar4,seekBar5,seekBar6;
    private MediaPlayer player1, player2,player3,player4,player5,player6;
    private Runnable runnable1, runnable2,runnable3,runnable4,runnable5,runnable6;
    private Handler handler1, handler2,handler3,handler4,handler5,handler6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prular_form);

        toolbar = findViewById(R.id.toolbarAlphabet1);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        actionBar = getSupportActionBar();
        actionBar.setTitle("Plural Form");

        getLessonA();
        getLessonE();
        getLessonI();
        getLessonO();
        getLessonU();
        getLessonY();
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        if (id == android.R.id.home){
            finish();
        }

        return super.onOptionsItemSelected(item);
    }

    private void getLessonA() {
        bPley1 = findViewById(R.id.bPlay1);

        handler1 = new Handler();

        seekBar1 = findViewById(R.id.seekBarS);

        player1 = MediaPlayer.create(this, R.raw.man);

        player1.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mediaPlayer) {
                seekBar1.setMax(mediaPlayer.getDuration());
                mediaPlayer.start();
                changeSeekBarA();
                player1.pause();
            }
        });
        seekBar1.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                if (b) {
                    player1.seekTo(i);
                }
            }
            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
            }
            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
            }
        });
    }
    private void changeSeekBarA() {
        seekBar1.setProgress(player1.getCurrentPosition());

        if (player1.isPlaying()) {
            runnable1 = new Runnable() {
                @Override
                public void run() {
                    changeSeekBarA();
                }
            };
            handler1.postDelayed(runnable1, 1000);
        }
        bPley1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (view.getId()) {
                    case R.id.bPlay1:
                        if (player1.isPlaying()) {
                            player1.pause();
                            bPley1.setImageResource(R.drawable.ic_play_arrow_black_24dp);
                        } else {
                            player1.start();
                            changeSeekBarA();
                        }
                        break;
                }
            }
        });
    }
    private void getLessonE() {
        bPley2 = findViewById(R.id.bPlayB);

        handler2 = new Handler();

        seekBar2 = findViewById(R.id.seekBarB);

        player2 = MediaPlayer.create(this, R.raw.men);

        player2.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mediaPlayer) {
                seekBar2.setMax(mediaPlayer.getDuration());
                mediaPlayer.start();
                changeSeekBarE();
                player2.pause();
            }
        });
        seekBar2.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                if (b) {
                    player2.seekTo(i);
                }
            }
            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
            }
            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
            }
        });
    }
    private void changeSeekBarE() {
        seekBar2.setProgress(player2.getCurrentPosition());

        if (player2.isPlaying()) {
            runnable2 = new Runnable() {
                @Override
                public void run() {
                    changeSeekBarE();
                }
            };
            handler2.postDelayed(runnable2, 1000);
        }
        bPley2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (view.getId()) {
                    case R.id.bPlayB:
                        if (player2.isPlaying()){
                            player2.pause();
                            bPley2.setImageResource(R.drawable.ic_play_arrow_black_24dp);
                        } else {
                            player2.start();
                            changeSeekBarE();
                        }
                        break;
                }
            }

        });
    }
    private void getLessonI() {
        bPley3 = findViewById(R.id.bPlayS);

        handler3 = new Handler();

        seekBar3 = findViewById(R.id.seekBar3);

        player3 = MediaPlayer.create(this, R.raw.woman);

        player3.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mediaPlayer) {
                seekBar3.setMax(mediaPlayer.getDuration());
                mediaPlayer.start();
                changeSeekBarI();
                player3.pause();
            }
        });
        seekBar3.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                if (b) {
                    player2.seekTo(i);
                }
            }
            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
            }
            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
            }
        });
    }
    private void changeSeekBarI() {
        seekBar3.setProgress(player3.getCurrentPosition());

        if (player3.isPlaying()) {
            runnable3 = new Runnable() {
                @Override
                public void run() {
                    changeSeekBarI();
                }
            };
            handler3.postDelayed(runnable3, 1000);
        }
        bPley3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (view.getId()) {
                    case R.id.bPlayS:
                        if (player3.isPlaying()) {
                            player3.pause();
                            bPley3.setImageResource(R.drawable.ic_play_arrow_black_24dp);
                        } else {
                            player3.start();
                            changeSeekBarI();
                        }
                        break;
                }
            }
        });
    }

    private void getLessonO() {
        bPley4 = findViewById(R.id.bPlayD);

        handler4 = new Handler();

        seekBar4 = findViewById(R.id.seekBarS);

        player4 = MediaPlayer.create(this, R.raw.women);

        player4.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mediaPlayer) {
                seekBar4.setMax(mediaPlayer.getDuration());
                mediaPlayer.start();
                changeSeekBarO();
                player4.pause();
            }
        });
        seekBar4.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                if (b) {
                    player4.seekTo(i);
                }
            }
            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
            }
            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
            }
        });
    }
    private void changeSeekBarO() {
        seekBar4.setProgress(player4.getCurrentPosition());

        if (player4.isPlaying()) {
            runnable4 = new Runnable() {
                @Override
                public void run() {
                    changeSeekBarO();
                }
            };
            handler4.postDelayed(runnable4, 1000);
        }
        bPley4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (view.getId()) {
                    case R.id.bPlayD:
                        if (player4.isPlaying()) {
                            player4.pause();
                            bPley4.setImageResource(R.drawable.ic_play_arrow_black_24dp);
                        } else {
                            player4.start();
                            changeSeekBarO();
                            bPley4.setImageResource(R.drawable.ic_stop_black_24dp);
                        }
                        break;
                }
            }
        });
    }
    private void getLessonU() {
        bPley5 = findViewById(R.id.bPlayI);

        handler5 = new Handler();

        seekBar5 = findViewById(R.id.seekBarI);

        player5 = MediaPlayer.create(this, R.raw.lesson8_num1);

        player5.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mediaPlayer) {
                seekBar5.setMax(mediaPlayer.getDuration());
                mediaPlayer.start();
                changeSeekBarU();
                player5.pause();
            }
        });
        seekBar5.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                if (b) {
                    player5.seekTo(i);
                }
            }
            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
            }
            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
            }
        });
    }
    private void changeSeekBarU() {
        seekBar5.setProgress(player5.getCurrentPosition());

        if (player5.isPlaying()) {
            runnable5 = new Runnable() {
                @Override
                public void run() {
                    changeSeekBarU();
                }
            };
            handler5.postDelayed(runnable5, 1000);
        }
        bPley5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (view.getId()) {
                    case R.id.bPlayI:
                        if (player5.isPlaying()) {
                            player5.pause();
                            bPley5.setImageResource(R.drawable.ic_play_arrow_black_24dp);
                        } else {
                            player5.start();
                            changeSeekBarU();
                        }
                        break;
                }
            }
        });
    }
    private void getLessonY() {
        bPley6 = findViewById(R.id.bPlayJ);

        handler6 = new Handler();

        seekBar6 = findViewById(R.id.seekBarJ);

        player6 = MediaPlayer.create(this, R.raw.lesson8_num2);

        player6.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mediaPlayer) {
                seekBar6.setMax(mediaPlayer.getDuration());
                mediaPlayer.start();
                changeSeekBarY();
                player6.pause();
            }
        });
        seekBar6.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                if (b) {
                    player6.seekTo(i);
                }
            }
            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
            }
            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
            }
        });
    }
    private void changeSeekBarY() {
        seekBar6.setProgress(player6.getCurrentPosition());

        if (player6.isPlaying()) {
            runnable6 = new Runnable() {
                @Override
                public void run() {
                    changeSeekBarY();
                }
            };
            handler6.postDelayed(runnable6, 1000);
        }
        bPley6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (view.getId()) {
                    case R.id.bPlayJ:
                        if (player6.isPlaying()) {
                            player6.pause();
                            bPley6.setImageResource(R.drawable.ic_play_arrow_black_24dp);
                        } else {
                            player6.start();
                            changeSeekBarY();
                            bPley6.setImageResource(R.drawable.ic_stop_black_24dp);
                        }
                        break;
                }
            }
        });
    }
    @Override
    public void onBackPressed() {
        super.onBackPressed();
        handler1.removeCallbacks(null);
        player1.stop();
        handler2.removeCallbacks(null);
        player2.stop();
        handler3.removeCallbacks(null);
        player3.stop();
        handler4.removeCallbacks(null);
        player4.stop();
        handler5.removeCallbacks(null);
        player5.stop();
        handler6.removeCallbacks(null);
        player6.stop();
    }
}
