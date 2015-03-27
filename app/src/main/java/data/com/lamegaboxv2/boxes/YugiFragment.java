package data.com.lamegaboxv2.boxes;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import data.com.lamegaboxv2.R;

public class YugiFragment extends Fragment {

    private MediaPlayer yugiOne;
    private MediaPlayer yugiTwo;


	public YugiFragment() {

	}

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        loadMedia();
    }

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {

		View view = inflater.inflate(R.layout.fragment_yugi, container,
				false);
        ImageButton firstYugi = (ImageButton) view.findViewById(R.id.yugiOne);
        firstYugi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                yugiOne.start();
            }
        });
        ImageButton secondYugi = (ImageButton) view.findViewById(R.id.yugiTwo);
        secondYugi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                yugiTwo.start();
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
        yugiOne = MediaPlayer.create(getActivity().getApplicationContext(), R.raw.yugi);
        yugiTwo = MediaPlayer.create(getActivity().getApplicationContext(), R.raw.yugi2);
    }

    public void releaseMedia()
    {
        yugiOne.release();
        yugiTwo.release();
    }

}