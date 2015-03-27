package data.com.lamegaboxv2.boxes;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import data.com.lamegaboxv2.R;

public class WilhelmFragment extends Fragment {

    private MediaPlayer wilhelmOne;

	public WilhelmFragment() {

	}

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        loadMedia();
    }

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {

		View view = inflater.inflate(R.layout.fragment_wilhelm, container,
				false);
        ImageButton firstScream = (ImageButton) view.findViewById(R.id.wilhelmOne);
        firstScream.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                wilhelmOne.start();
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
        wilhelmOne = MediaPlayer.create(getActivity().getApplicationContext(), R.raw.wilhelm);
    }


    public void releaseMedia()
    {
        wilhelmOne.release();
    }

}