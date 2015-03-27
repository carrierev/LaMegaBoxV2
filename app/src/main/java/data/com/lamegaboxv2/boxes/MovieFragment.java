package data.com.lamegaboxv2.boxes;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import data.com.lamegaboxv2.R;

public class MovieFragment extends Fragment {

    private MediaPlayer movieOne;
    private MediaPlayer movieTwo;
    private MediaPlayer movieThree;
    private MediaPlayer movieFour;
    private MediaPlayer movieFive;

	public MovieFragment() {

	}

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        loadMedia();
    }

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {

		View view = inflater.inflate(R.layout.fragment_movie, container,
				false);
        ImageButton firstTlow = (ImageButton) view.findViewById(R.id.movieOne);
        firstTlow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                movieOne.start();
            }
        });
        ImageButton secondTlow = (ImageButton) view.findViewById(R.id.movieTwo);
        secondTlow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                movieTwo.start();
            }
        });

        ImageButton thirdTlow = (ImageButton) view.findViewById(R.id.movieThree);
        thirdTlow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                movieThree.start();
            }
        });

        ImageButton fourthTlow = (ImageButton) view.findViewById(R.id.movieFour);
        fourthTlow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                movieFour.start();
            }
        });

        ImageButton fifthTlow = (ImageButton) view.findViewById(R.id.movieFive);
        fifthTlow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                movieFive.start();
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
        movieOne = MediaPlayer.create(getActivity().getApplicationContext(), R.raw.movie);
        movieTwo = MediaPlayer.create(getActivity().getApplicationContext(), R.raw.movie2);
        movieThree = MediaPlayer.create(getActivity().getApplicationContext(), R.raw.movie3);
        movieFour = MediaPlayer.create(getActivity().getApplicationContext(), R.raw.movie4);
        movieFive = MediaPlayer.create(getActivity().getApplicationContext(), R.raw.movie5);
    }

    public void releaseMedia()
    {
        movieOne.release();
        movieTwo.release();
        movieThree.release();
        movieFour.release();
        movieFive.release();
    }

}