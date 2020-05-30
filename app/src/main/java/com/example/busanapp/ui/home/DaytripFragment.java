package com.example.busanapp.ui.home;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.busanapp.R;
import com.example.busanapp.home.Course_daytrip;
import com.example.busanapp.home.ImageAdapter;
import com.example.busanapp.home.RecyclerViewAdapter;
import com.example.busanapp.home.RecyclerViewAdapterDayTrip;

import java.util.ArrayList;
import java.util.List;


public class DaytripFragment extends Fragment {
    private ImageAdapter adapter = new ImageAdapter();
    private RecyclerView recyclerView;

    private List<Course_daytrip> first_Course;

    public DaytripFragment(){
    }

    public  void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setHasOptionsMenu(true);

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.activity_main_trip, container, false);


        first_Course = new ArrayList<>();

        first_Course.add(new Course_daytrip("부산바다 당일치기", "추천코스","당일여행",
            "추천코스\n " +
                        "광안리해수욕장/광안대교 → 해운대해수욕장 → 부산아쿠아리움 → 문탠로드 → 청사포 → 용궁사\n",
                "부산의 랜드마크 중 하나인 광안대교를 한눈에 담을 수 있는 이곳은 사시사철 여행자로 북적인다. 사람들은 낮과 밤이 선사하는 각기 다른 광안리해수욕장의 매력에 흠뻑 빠져든다." +
                        " 특히 부산불꽃축제가 열리는 가을밤이면 광안리해수욕장 앞바다는 화려한 불꽃의 향연으로 물든다.\n",
                "해운대해수욕장은 넓고 고운 백사장을 가진 대한민국 대표 해수욕장으로 부산 시민보다 여행자로 더 북적이는 곳이다." +
                        " 해수욕장 주변에는 산책코스가 잘 갖춰져 있고 그 중 아름답기로 소문난 동백해안산책로는 바다, 바람, 그리고 도시풍경을 가장 가까이에서 만끽할 수 있는 코스이다. \n" ,
                "해안을 따라 조성된 문탠로드는 순환산책로로 평소 옷차림에 운동화만 있다면 도보에 무리가 없다." +
                        " 솔숲 사이 바다 냄새 느끼며 느린 걸음으로 다녀오는 가벼운 산책길도 경험해보자.\n",
                "바다와 가장 인접한 곳에 위치하고 있어 바다 위 사찰이라 불리는 해동용궁사."+
                        " 가장 높은 곳에 위치한 해수관음대불에 인사드리고 바다를 마주하면 간절하던 소원이 이루어진 마냥 입가에 절로 미소가 찾아온다.\n",
                R.drawable.daytrip1,R.drawable.daytrip1_2,R.drawable.daytrip1_3,R.drawable.daytrip1_4,R.drawable.daytrip1_5,R.drawable.daytrip1_map));

        first_Course.add(new Course_daytrip("역사 & 가족 당일코스", "지도로보는 추천코스","당일여행",
                "추천코스\n " +
                        "유엔기념공원 → 국립일제강제동원역사관 → 오륙도 → 광안리해수욕장/광안대교 → 동백해안산책로 → 달맞이길 \n",
                "세계에서 유일한 유엔군 공동묘역이 조성돼 있는 유엔기념공원은 한국전쟁 당시 목숨을 잃은 병사들이 잠들어 있다. " +
                        "이름 모를 군인들의 넋을 기리는 조형물과 전사한 이들의 이름이 새겨진 비석들 사이로 참전국 국기가 펄럭이는 모습은 이곳을 찾는 이들의 마음을 절로 숙연케 한다.\n",
                "역사관에서 그리 멀지 않은 곳에 오륙도가 위치한다. " +
                        "해맞이공원 끝자락에 아슬아슬하게 매달려 있는 스카이워크, 투명한 바닥에 들어서면 마치 에메랄드 빛 바다 위를 걷는 듯 아찔한 기분을 느낄 수 있다. " +
                        "오륙도의 기괴한 해안절경은 부산에서 느낄 수 있는 특별함 중 하나다. \n" ,
                "해운대해수욕장 위로 달이 뜨는 풍경을 만끽할 수 있는 곳, 바로 달맞이길이다. " +
                        "구불구불 언덕 산책로를 따라 형성된 예쁜 길, 갤러리며 카페며 주위 경관이 아름답기로 유명하다." +
                        " 봄이 오면 길을 따라 만개한 벚나무 덕에 벚꽃터널이 만들어지는 장소이기도 하다.\n",
                "광안리 해수욕장을 만났으니 해운대 해수욕장도 빼놓을 수는 없을 터. 광안리와 해운대 사이에 있는 동백섬에 들러 산책로를 먼저 걸어보자. " +
                        "동백섬에는 동백해안산책로가 조성되어 있어 바다를 바라보며 숲길을 걷는 묘미를 제대로 만끽할 수 있다\n",
                //un - 오륙도 - 동백해안산책로 - 달맞이길
                R.drawable.daytrip2_4,R.drawable.daytrip2_1,R.drawable.daytrip2_2,R.drawable.daytrip2_3,R.drawable.day2trip_6,R.drawable.daytrip2_map));

        first_Course.add(new Course_daytrip("동서로 가로지르기", "지도로보는 추천코스","다일여행",
                "추천코스\n " +
                        "태종대 → 흰여울문화마을 → 국제시장 → 용두산공원 → 오륙도 → 광안리해수욕장/광안대교 → 해운대해수욕장 → 동백해안산책로\n",
                "출발은 서쪽 영도 바다에서 시작한다. 영도의 끝자락에 위치한 태종대라면 더 없이 좋다.\n" +
                        "맑은 날이면 대마도까지 조망할 수 있고 사시사철 멋진 기암절벽에 부서지는 하얀 포말을 감상할 수 있다." +
                        " 다누비 열차를 이용해 태종대 전체를 편하게 둘러볼 수 있는데 초여름이면 수국꽃밭이 여행자를 반겨준다.\n",
                "국제시장을 주제로 촬영한 영화가 있을 정도로 피란민의 애환이 남아 있는 이곳은 여기저기 먹을거리가 많아 출출한 배를 달래기에 좋다. " +
                        "구제물품까지 저렴하게 구매할 수 있으니 잠시 걸음을 멈추고 이런 저런 구경으로 시간을 보내보면 어떨까.\n" ,
                "남해와 동해가 만나는 오륙도 풍경을 담기 위해 동쪽으로 순간이동. 높디높은 절벽위에 투명유리 스카이워크가 조성되면서 관광객들에게 아찔한 경험까지 선사하는 오륙도는 일출·일몰 명소로도 유명하다. " +
                        "해질 무렵 방문해 아름다운 부산 바다의 일몰을 느껴보는 것도 좋겠다.\n",
                "해운대 끝에서 이어져 동백섬을 둘러싸는 동백해안산책로. 이곳은 2005년 APEC 정상회담 회의장으로 사용됐던 누리마루가 있는 곳이다." +
                        " 바다를 감아 돌며 걷는 산책로에선 광안리와는 또 다른 매력의 해운대 야경이 기다리고 있다.\n",
                //태종대 - 국제시장 - 오륙도 - 동백해안산책로
                R.drawable.daytrip3_1,R.drawable.daytrip3_5,R.drawable.daytrip3_2,R.drawable.daytrip3_3,R.drawable.daytrip3_4,R.drawable.daytrip3_map));


        RecyclerView myrv = (RecyclerView) view.findViewById(R.id.recyclerview_id);

        RecyclerView.Adapter myAdapter = new RecyclerViewAdapterDayTrip(getActivity(), first_Course);

        //myrv.setLayoutManager(new GridLayoutManager(this, 3));

        // 세로 레이아웃
        LinearLayoutManager verticalLayoutManager = new LinearLayoutManager(getActivity(),RecyclerView.VERTICAL, false);

        // 레이아웃 매니저 연결
        myrv.setLayoutManager(verticalLayoutManager);

        myrv.setAdapter(myAdapter);

        return view;
    }

    }


