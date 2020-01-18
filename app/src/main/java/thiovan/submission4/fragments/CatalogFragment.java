package thiovan.submission4.fragments;


import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.material.tabs.TabLayout;

import java.util.Objects;

import androidx.fragment.app.FragmentActivity;
import androidx.viewpager.widget.ViewPager;
import thiovan.submission4.R;
import thiovan.submission4.adapters.CatalogPagerAdapter;

/**
 * A simple {@link Fragment} subclass.
 */
public class CatalogFragment extends Fragment {

    public CatalogFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_catalog, container, false);

        ((AppCompatActivity) Objects.requireNonNull(getActivity())).getSupportActionBar().setTitle(R.string.header_main);

        CatalogPagerAdapter catalogPagerAdapter = new CatalogPagerAdapter(rootView.getContext(), getChildFragmentManager());
        ViewPager viewPager = rootView.findViewById(R.id.view_pager);
        viewPager.setAdapter(catalogPagerAdapter);
        TabLayout tabs = rootView.findViewById(R.id.tabs);
        tabs.setupWithViewPager(viewPager);

        return rootView;
    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        FragmentActivity mContext = (FragmentActivity) context;
    }

}