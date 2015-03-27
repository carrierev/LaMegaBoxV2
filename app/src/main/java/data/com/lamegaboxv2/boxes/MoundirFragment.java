package data.com.lamegaboxv2.boxes;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import data.com.lamegaboxv2.R;

public class MoundirFragment extends Fragment {

    private MediaPlayer moundirOne;
    private MediaPlayer moundirTwo;
    private MediaPlayer moundirThree;

    
	public MoundirFragment() {

	}

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        loadMedia();
    }

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {

		View view = inflater.inflate(R.layout.fragment_moundir, container,
				false);
        ImageButton imgOne = (ImageButton) view.findViewById(R.id.moundirOne);
        imgOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                moundirOne.start();
            }
        });

        ImageButton imgTwo = (ImageButton) view.findViewById(R.id.moundirTwo);
        imgTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                moundirTwo.start();
            }
        });

        ImageButton imgThree = (ImageButton) view.findViewById(R.id.moundirThree);
        imgThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                moundirThree.start();
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
        moundirOne = MediaPlayer.create(getActivity().getApplicationContext(), R.raw.moundir1);
        moundirTwo = MediaPlayer.create(getActivity().getApplicationContext(), R.raw.moundir2);
        moundirThree = MediaPlayer.create(getActivity().getApplicationContext(), R.raw.moundir3);
    }

    public void releaseMedia()
    {
        moundirOne.release();
        moundirTwo.release();
        moundirThree.release();
    }

}