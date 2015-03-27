package data.com.lamegaboxv2.boxes;

import android.annotation.TargetApi;
import android.media.AudioAttributes;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.media.SoundPool;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import data.com.lamegaboxv2.R;

public class RoomTwoFragment extends Fragment {


    private MediaPlayer roomTwentyFour;
    private MediaPlayer roomTwentyTwo;

	public RoomTwoFragment() {

	}

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        loadMedia();
    }

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {

        final SoundPool sounds;
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP)
        {
            sounds = createNewSoundPool();
        }
        else
        {
            sounds = createOldSoundPool();
        }

        final int room13 = sounds.load(getActivity().getApplicationContext(), R.raw.room13, 1);
        final int room14 = sounds.load(getActivity().getApplicationContext(), R.raw.room14, 1);
        final int room15 = sounds.load(getActivity().getApplicationContext(), R.raw.room15, 1);
        final int room16 = sounds.load(getActivity().getApplicationContext(), R.raw.room16, 1);
        final int room17 = sounds.load(getActivity().getApplicationContext(), R.raw.room17, 1);
        final int room18 = sounds.load(getActivity().getApplicationContext(), R.raw.room18, 1);
        final int room19 = sounds.load(getActivity().getApplicationContext(), R.raw.room19, 1);
        final int room20 = sounds.load(getActivity().getApplicationContext(), R.raw.room20, 1);
        final int room21 = sounds.load(getActivity().getApplicationContext(), R.raw.room21, 1);
        final int room23 = sounds.load(getActivity().getApplicationContext(), R.raw.room23, 1);
        final int room25 = sounds.load(getActivity().getApplicationContext(), R.raw.room25, 1);

        View view = inflater.inflate(R.layout.fragment_room_two, container,
				false);

        ImageButton ThirteenRoom = (ImageButton) view.findViewById(R.id.roomThirteen);
        ThirteenRoom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sounds.play(room13, 1, 1, 1, 0, 1);
                //roomNine.start();
            }
        });

        ImageButton FourteenRoom = (ImageButton) view.findViewById(R.id.roomFourteen);
        FourteenRoom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sounds.play(room14, 1, 1, 1, 0, 1);
                //roomNine.start();
            }
        });

        ImageButton FifteenRoom = (ImageButton) view.findViewById(R.id.roomFifteen);
        FifteenRoom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sounds.play(room15, 1, 1, 1, 0, 1);
                //roomNine.start();
            }
        });

        ImageButton SixteenRoom = (ImageButton) view.findViewById(R.id.roomSixteen);
        SixteenRoom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sounds.play(room16, 1, 1, 1, 0, 1);
                //roomNine.start();
            }
        });

        ImageButton SeventeenRoom = (ImageButton) view.findViewById(R.id.roomSeventeen);
        SeventeenRoom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sounds.play(room17, 1, 1, 1, 0, 1);
                //roomNine.start();
            }
        });

        ImageButton EighteenRoom = (ImageButton) view.findViewById(R.id.roomEighteen);
        EighteenRoom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sounds.play(room18, 1, 1, 1, 0, 1);
                //roomNine.start();
            }
        });

        ImageButton NineteenRoom = (ImageButton) view.findViewById(R.id.roomNineteen);
        NineteenRoom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sounds.play(room19, 1, 1, 1, 0, 1);
                //roomNine.start();
            }
        });

        ImageButton TwentyRoom = (ImageButton) view.findViewById(R.id.roomTwenty);
        TwentyRoom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sounds.play(room20, 1, 1, 1, 0, 1);
                //roomNine.start();
            }
        });

        ImageButton TwentyOneRoom = (ImageButton) view.findViewById(R.id.roomTwentyOne);
        TwentyOneRoom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sounds.play(room21, 1, 1, 1, 0, 1);
                //roomNine.start();
            }
        });

        ImageButton TwentyTwoRoom = (ImageButton) view.findViewById(R.id.roomTwentyTwo);
        TwentyTwoRoom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                roomTwentyTwo.start();
            }
        });

        ImageButton TwentyThreeRoom = (ImageButton) view.findViewById(R.id.roomTwentyThree);
        TwentyThreeRoom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sounds.play(room23, 1, 1, 1, 0, 1);
            }
        });

        ImageButton TwentyFourRoom = (ImageButton) view.findViewById(R.id.roomTwentyFour);
        TwentyFourRoom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
             roomTwentyFour.start();
            }
        });


        ImageButton TwentyFiveRoom = (ImageButton) view.findViewById(R.id.roomTwentyFive);
        TwentyFiveRoom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sounds.play(room25, 1, 1, 1, 0, 1);
            }
        });
		return view;
	}

    @Override
    public void onPause()
    {
        releaseMedia();
        super.onPause();
    }

    @Override
    public void onResume() {
        loadMedia();
        super.onResume();
    }

    public void loadMedia()
    {
        roomTwentyFour = MediaPlayer.create(getActivity().getApplicationContext(), R.raw.room24);
        roomTwentyTwo = MediaPlayer.create(getActivity().getApplicationContext(), R.raw.room22);
//        roomOne = MediaPlayer.create(getActivity().getApplicationContext(), R.raw.room);
//        roomTwo = MediaPlayer.create(getActivity().getApplicationContext(), R.raw.room2);
//        roomThree = MediaPlayer.create(getActivity().getApplicationContext(), R.raw.room3);
//        roomFour = MediaPlayer.create(getActivity().getApplicationContext(), R.raw.room4);
//        roomFive = MediaPlayer.create(getActivity().getApplicationContext(), R.raw.room5);
//        roomSix = MediaPlayer.create(getActivity().getApplicationContext(), R.raw.room6);
//        roomSeven = MediaPlayer.create(getActivity().getApplicationContext(), R.raw.room7);
//        roomEight = MediaPlayer.create(getActivity().getApplicationContext(), R.raw.room8);
//        roomNine = MediaPlayer.create(getActivity().getApplicationContext(), R.raw.room9);
    }

    public void releaseMedia()
    {
        roomTwentyFour.release();
        roomTwentyTwo.release();
//        roomOne.release();
//        roomTwo.release();
//        roomThree.release();
//        roomFour.release();
//        roomFive.release();
//        roomSix.release();
//        roomSeven.release();
//        roomEight.release();
//        roomNine.release();
    }


    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    protected SoundPool createNewSoundPool(){

        AudioAttributes attributes = new AudioAttributes.Builder()
                .setUsage(AudioAttributes.USAGE_MEDIA)
                .setContentType(AudioAttributes.CONTENT_TYPE_SONIFICATION)
                .build();

        return new SoundPool.Builder()
                .setAudioAttributes(attributes)
                .build();

    }

    @SuppressWarnings("deprecation")
    protected SoundPool createOldSoundPool(){
        return new SoundPool(30, AudioManager.STREAM_MUSIC,0);
    }
}