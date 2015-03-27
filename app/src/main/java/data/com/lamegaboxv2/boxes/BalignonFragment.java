package data.com.lamegaboxv2.boxes;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import data.com.lamegaboxv2.R;

public class BalignonFragment extends Fragment {

    private MediaPlayer balignonOne;
    private MediaPlayer balignonTwo;
    private MediaPlayer balignonThree;
    private MediaPlayer balignonFour;
    private MediaPlayer balignonFive;

    public BalignonFragment() {

	}

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        loadMedia();
    }

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {

		View view = inflater.inflate(R.layout.fragment_balignon, container,
				false);
        ImageButton imgOne = (ImageButton) view.findViewById(R.id.balignonOne);
        imgOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                balignonOne.start();
            }
        });

        ImageButton imgTwo = (ImageButton) view.findViewById(R.id.balignonTwo);
        imgTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                balignonTwo.start();
            }
        });

        ImageButton  imgThree = (ImageButton) view.findViewById(R.id.balignonThree);
        imgThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                balignonThree.start();
            }
        });

        ImageButton imgFour = (ImageButton) view.findViewById(R.id.balignonFour);
        imgFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                balignonFour.start();
            }
        });

        ImageButton  imgFive = (ImageButton) view.findViewById(R.id.balignonFive);
        imgFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                balignonFive.start();
            }
        });

		return view;
	}

    @Override
    public void onPause() {
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
        balignonOne = MediaPlayer.create(getActivity().getApplicationContext(), R.raw.balignon1);
        balignonTwo = MediaPlayer.create(getActivity().getApplicationContext(), R.raw.balignon2);
        balignonThree = MediaPlayer.create(getActivity().getApplicationContext(), R.raw.balignon3);
        balignonFour = MediaPlayer.create(getActivity().getApplicationContext(), R.raw.balignon4);
        balignonFive = MediaPlayer.create(getActivity().getApplicationContext(), R.raw.balignon5);
    }

    public void releaseMedia()
    {
        balignonOne.release();
        balignonTwo.release();
        balignonThree.release();
        balignonFour.release();
        balignonFive.release();
    }

}