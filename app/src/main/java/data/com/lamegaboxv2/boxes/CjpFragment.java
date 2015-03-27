package data.com.lamegaboxv2.boxes;


import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import data.com.lamegaboxv2.R;

public class CjpFragment extends Fragment {

    private MediaPlayer cjpOne;
    private MediaPlayer cjpTwo;
    private MediaPlayer cjpThree;
    private MediaPlayer cjpFour;
    private MediaPlayer cjpFive;
    private MediaPlayer cjpSix;
    private MediaPlayer cjpSeven;
    private MediaPlayer cjpEight;
    private MediaPlayer cjpNine;

	public CjpFragment() {

	}

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        loadMedia();
    }

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {

		View view = inflater.inflate(R.layout.fragment_cjp, container,
				false);
        ImageButton firstCjp = (ImageButton) view.findViewById(R.id.cjpOne);
        firstCjp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cjpOne.start();
            }
        });
        ImageButton secondCjp = (ImageButton) view.findViewById(R.id.cjpTwo);
        secondCjp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cjpTwo.start();
            }
        });

        ImageButton thirdCjp = (ImageButton) view.findViewById(R.id.cjpThree);
        thirdCjp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cjpThree.start();
            }
        });

        ImageButton fourthCjp = (ImageButton) view.findViewById(R.id.cjpFour);
        fourthCjp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cjpFour.start();
            }
        });

        ImageButton fifthCjp = (ImageButton) view.findViewById(R.id.cjpFive);
        fifthCjp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cjpFive.start();
            }
        });
        
        ImageButton SixthCjp = (ImageButton) view.findViewById(R.id.cjpSix);
        SixthCjp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cjpSix.start();
            }
        });

        ImageButton SeventhCjp = (ImageButton) view.findViewById(R.id.cjpSeven);
        SeventhCjp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cjpSeven.start();
            }
        });

        ImageButton EighthCjp = (ImageButton) view.findViewById(R.id.cjpEight);
        EighthCjp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cjpEight.start();
            }
        });

        ImageButton NineCjp = (ImageButton) view.findViewById(R.id.cjpNine);
        NineCjp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cjpNine.start();
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
        cjpOne = MediaPlayer.create(getActivity().getApplicationContext(), R.raw.askab);
        cjpTwo = MediaPlayer.create(getActivity().getApplicationContext(), R.raw.askab2);
        cjpThree = MediaPlayer.create(getActivity().getApplicationContext(), R.raw.askab3);
        cjpFour = MediaPlayer.create(getActivity().getApplicationContext(), R.raw.askab4);
        cjpFive = MediaPlayer.create(getActivity().getApplicationContext(), R.raw.askab5);
        cjpSix = MediaPlayer.create(getActivity().getApplicationContext(), R.raw.askab6);
        cjpSeven = MediaPlayer.create(getActivity().getApplicationContext(), R.raw.askab7);
        cjpEight = MediaPlayer.create(getActivity().getApplicationContext(), R.raw.askab8);
        cjpNine = MediaPlayer.create(getActivity().getApplicationContext(), R.raw.askab9);
    }

    public void releaseMedia()
    {
        cjpOne.release();
        cjpTwo.release();
        cjpThree.release();
        cjpFour.release();
        cjpFive.release();
        cjpSix.release();
        cjpSeven.release();
        cjpEight.release();
        cjpNine.release();
    }

}