package com.example.busanapp.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.busanapp.R;

import java.util.ArrayList;
import java.util.List;

public class HomeFragment extends Fragment {
    private ImageAdapter adapter = new ImageAdapter();
    private RecyclerView recyclerView;
    //추가
    List<Course> first_Course;


    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        /*LinearLayoutManager horizonalLayoutManager = new LinearLayoutManager(getActivity(), RecyclerView.HORIZONTAL, false);

        recyclerView.setLayoutManager(horizonalLayoutManager);
        recyclerView.setAdapter(adapter);

        adapter.setItems(new ImageData().getItems());*/


        //course

        first_Course = new ArrayList<>();
        first_Course.add(new Course("부산 2박 3일 여행코스", "여행코스", "깔깔", R.drawable.first));
        first_Course.add(new Course("부산 여행 코스 추천 6곳", "여행코스", "즐거워", R.drawable.second));
        first_Course.add(new Course("부산 1박 2일 밤도깨비 여행 코스", "여행코스", "조사", R.drawable.third));
        first_Course.add(new Course("부산 자유여행 1박 2일 여행코스", "여행코스", "해서 넣을 부분", R.drawable.fourth)); //오류
        first_Course.add(new Course("부산 겨울 당일치기 코스", "여행코스", "^^", R.drawable.fifth));
        first_Course.add(new Course("부산 핫스팟 여행 코스", "여행코스", "사진 출처 구글", R.drawable.sixth));

        RecyclerView myrv = view.findViewById(R.id.recyclerView);

        RecyclerView.Adapter myAdapter = new RecyclerViewAdapter(getActivity(), first_Course);

        //myrv.setLayoutManager(new GridLayoutManager(this, 3));

        // 가로 레이아웃
        LinearLayoutManager horizontalLayoutManager = new LinearLayoutManager(getActivity(), RecyclerView.HORIZONTAL, false);

        // 레이아웃 매니저 연결
        myrv.setLayoutManager(horizontalLayoutManager);

        myrv.setAdapter(myAdapter);

        return view;
    }

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setHasOptionsMenu(true);
    }

}

