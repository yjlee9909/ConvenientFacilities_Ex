package com.example.busanapp.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.busanapp.R;
import com.example.busanapp.home.Course_daytrip;
import com.example.busanapp.home.Course_two_three_trip;
import com.example.busanapp.home.ImageAdapter;
import com.example.busanapp.home.RecyclerViewAdapterDayTrip;
import com.example.busanapp.home.RecyclerViewAdapterTwoThreeTrip;

import java.util.ArrayList;
import java.util.List;


public class TwoThreetripFragment extends Fragment {
    private ImageAdapter adapter = new ImageAdapter();
    private RecyclerView recyclerView;

    private List<Course_two_three_trip> third_Course;

    public TwoThreetripFragment(){
    }

    public  void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setHasOptionsMenu(true);

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.activity_main_trip, container, false);


        third_Course = new ArrayList<>();

        third_Course.add(new Course_two_three_trip("2박 3일에 완성하는 부산 완전정복","2박 3일",
                "추천코스\n" + "\n" +
                        "1일차 : 범어사 - 동래읍성 - 복천박물관/복천동고분군 - 죽성성당 - 해동용궁사 - 송정해수욕장/죽도공원\n" +
                        "2일차 : 해운대해수욕장/동백섬 - 오륙도 - 태종대 - 영도대교 - 용두산공원\n" +
                        "3일차 : 감천문화마을 - 송도해수욕장/케이블카 - 다대포 해수욕장 - 장림포구 - 을숙도 - 가덕도\n" +
                        "\n" + "\n" +
                        "1일차 추천코스\n" + "범어사 → 동래읍성 → 복천박물관/복천동고분군 → 죽성성당 → 해동용궁사 → 송정해수욕장/죽도공원\n" +
                        "\n",
                "황금빛 물고기가 내려와 노닐었다는 천년고찰 범어사는 차분하고 아늑한 산사의 분위기를 물씬 풍긴다. 사찰 자체가 문화재인 범어사에서 문화재급의 아름다운 자연도 함께 즐겨보자.\n",

                "조선시대 동래부를 지켜주던 동래읍성, 그 성벽을 따라 걸으며 임진왜란 최대 격전지였던 곳의 흔적을 새긴다. 성벽 아래 복천동고분군에서는 가야 왕국의 무덤이 발견되었고 출토된 유물을 복천박물관에서 전시하고 있다." +
                        "죽성마을 갯바위 끝에 한 폭의 그림처럼 걸려있는 죽성성당. 푸른 하늘, 에메랄드빛 바다와 어우러진 예쁜 성당 앞에는 너도나도 사진 찍기 바쁜 사람들로 종일 북적인다.\n",

                "뒤로는 소나무가 우거진 바위산이 사찰을 감싸고, 앞으로는 푸른 망망대해가 펼쳐져 있는 해동용궁사에서 새로운 추억을 만들어보자.\n",

                "서핑을 배우는 교육생들의 활기로 가득한 송정해수욕장의 끝자락, 죽도공원에서는 햇빛에 반짝이는 송정 바다 위, 밀려오는 파도를 즐기는 서퍼들의 소리가 어울린 천혜의 휴식처를 만날 수 있다.\n" + "\n\n\n\n" +
                        "2일차 추천코스\n" + "해운대해수욕장/동백섬 → 오륙도 → 태종대 → 영도대교 → 용두산공원\n" +
                        "\n",

                "해운대 해수욕장의 드넓은 백사장을 따라 걷다가 동백섬을 만나면 해안산책로를 유유자적 한 바퀴 돌아보자. 병풍처럼 펼쳐진 해운대의 마천루와 광안대교의 전망을 동시에 조망할 수 있다.\n",


                "오륙도는 시원하게 트인 바다가 일상의 근심을 날려주고 기암괴석에 부딪히는 하얀 포말이 삶의 위로가 되는 곳이다." +
                        "멋진 바다풍경하면 태종대를 빼놓을 수가 없다. 깎아지는 벼랑과 부딪치는 하얀 파도, 끝없이 푸른 바다와 함께 녹음으로 가득한 태종대 공원을 넉넉하게 돌아보자.\n" +
                        "영도와 남포동을 이어주는 주황색 영도대교를 넘어 도심 한가운데 봉긋 솟아있는 용두산 공원에 오른다. 부산타워 전망대에서는 부산의 동서남북을 모두 조망할 수 있다.\n\n\n" +
                        "3일차 추천코스\n" + "감천문화마을 → 송도해수욕장/케이블카 → 다대포해수욕장 → 장림포구 → 을숙도 → 가덕도\n\n",


                "한국의 마추픽추 감천문화마을로 향한다. 부산의 피란역사를 고스란히 담고 있는 이곳은 곳곳에 설치된 예술작품과 벽화가 형형색색의 지붕과 어우러져 낙후되었던 감천을 감성골목으로 만들었다." +
                        "우리나라 1호 해수욕장인 송도해수욕장이 해상케이블카와 스카이워크로 옛 명성을 되찾았다. 깨끗한 백사장과 해안산책로, 해송 우거진 숲길산책로까지 모두 갖춘 송도해수욕장은 방문리스트 1호!\n",


                "드넓은 자연 그 자체의 바다, 다대포해수욕장은 수평선보다는 지평선이 보이는 느낌이다. 오직 바다와 나지막한 산이 시야를 가득 채우는 이곳은 황홀한 낙조를 선사하는 곳으로 유명하다.\n",


                "‘부네치아’라는 애칭을 얻은 장림포구는 형형색색의 창고건물이 긴 포구를 따라 마주보고 있는 모습이 이국적인 정취를 자아낸다.\n" +
                        "가을이 짙어갈수록 흰 꽃을 피우는 억새군락 사이로 날아오르는 철새들을 관찰할 수 있는 을숙도는 미술관과 문화회관도 위치해 자연과 문화를 동시에 즐길 수 있는 아름다운 섬이다.\n" +
                        "부산과 거제도를 잇는 거가대교의 개통으로 유명해진 가덕도는 천혜의 자연환경이 그대로 보존된 섬이다. 그 풍경 속에 가려져 미처 몰랐던 가덕도의 슬픈 역사도 마주할 수 있다.\n\n",

                "추천코스",
                R.drawable.two_three_first,R.drawable.two_three_first_dtwo,R.drawable.two_three_first_dthree,R.drawable.two_three_first_dfour,R.drawable.two_three_first_dfive,
                R.drawable.two_three_first_dsix,R.drawable.two_three_first_dseven,R.drawable.two_three_first_deight,R.drawable.two_three_first_dnine,R.drawable.two_three_first_dten,R.drawable.two_three_first_deleven));

        third_Course.add(new Course_two_three_trip("부산 원도심의 이야기", "2박 3일",
                "추천코스\n" + "\n" +
                        "1일차 : 초량이바구길  - 40계단/문화관 - BIFF광장/국제시장/깡통시장 - 보수동책방골목 - 부산영화체험관/트릭아이뮤지엄 - 용두산공원\n" +
                        "2일차 : 영도대교 - 흰여울문화마을 - 태종대 - 국립해양박물관 - 오륙도 - 광안리해수욕장/광안대교\n" +
                        "3일차 : 해운대 - 삼포해안길 - 청사포 - 송정해수욕장/죽도공원 - 해동용궁사 - 아난티코브 - 죽성성당\n" +
                        "\n" + "\n" +
                        "1일차 추천코스\n" + "초량이바구길  → 40계단/문화관 → BIFF광장/국제시장/깡통시장 → 보수동책방골목 → 부산영화체험관/트릭아이뮤지엄 → 용두산공원\n" +
                        "\n",
                "부산의 원도심인 동구의 168계단을 중심으로 산복도로 이야기를 전해주는 초량이바구길, 피란민들의 아픔이 서린 부산의 근현대 역사를 한 번에 만나볼 수 있는 길이다.\n" +
                        "피란민의 애환이 서린 40계단과 그 아픔을 기억하는 40계단 문화관, 부산국제영화제의 태동지 BIFF광장, ‘없는 것 빼고 다 있다’는 국제시장과 부평깡통시장, 50년 문화 골목 보수동책방골목까지 하나하나 귀중한 부산의 이야기를 만날 수 있다.\n" +
                        "부산영화체험박물관은 다양한 영화 콘텐츠를 한 편의 영화탐험스토리 속에서 보다 쉽고 재미있게 체험할 수 있다. 박물관 2층에 자리한 착시체험형 미술관 트릭아이뮤지엄도 재미있는 체험을 만끽할 수 있는 명소이다.\n" +
                        "\n" +
                        "용두산 공원 부산타워 꼭대기에서 내려다보는 부산야경을 즐기며 하루를 마감한다.\n" + "\n\n\n\n" +
                        "2일차 추천코스\n" + "영도대교 → 흰여울문화마을 → 태종대 → 국립해양박물관 → 오륙도 → 광안리해수욕장/광안대교\n" +
                        "\n",

                "깎아지른 절벽을 사이에 두고 좁은 마을과 넓은 바다가 절묘한 대비를 이루는 흰여울문화마을. 골목길을 들어설 때마다 각기 다른 느낌의 진풍경이 방문객을 맞이하고 그 사이로 보이는 눈부신 바다가 탄성을 자아낸다.\n",

                "여름철 수국축제로 새로운 인기를 얻고 있는 태종대는 깎아지른 듯한 절벽과 에메랄드빛 푸른 바다가 끝없이 맞닿아있는 부산의 오랜 명소이다.\n" +
                        "아이와 함께 꼭 들러야 하는 국립해양박물관에서는 바다와 관련된 귀중한 유물과 자료를 볼 수 있고 다양한 해양 체험과 교육 프로그램을 들을 수 있다.\n",

                "썰물이면 여섯 봉우리, 밀물이면 다섯 봉우리가 된다고 해서 붙은 이름 ‘오륙도’는 탁 트인 바다 전망에 투명 스카이워크까지 아찔한 자연의 스릴을 만끽할 수 있다.\n" +
                        "화려한 광안대교 야경을 배경으로 펼쳐지는 버스킹 공연, 즐거운 음악에 몸이 절로 흔들거리며 여행의 두 번째 날이 광안리에서 저문다.\n" + "\n\n\n\n" +
                        "3일차 추천코스\n" + "해운대 → 삼포해안길 → 청사포 → 송정해수욕장/죽도공원 → 해동용궁사 → 아난티코브 → 죽성성당\n" +
                        "\n",

                "해운대 해수욕장을 거쳐 미포, 청사포, 구덕포를 잇는 삼포해안길을 따라 송정해수욕장으로 넘어가는 도보여행을 시도해도 좋겠다. 해안철길을 따라 걷는, 부산에서 가장 아름다운 산책로를 놓칠 수 없다.\n",

                "밀려오는 파도에 몸을 맡긴 서퍼들의 현란한 모습을 감상하며 송정해수욕장 송일정에 올라 편안한 휴식을 취하면 도보의 고단함도, 일상의 피로도 바닷바람에 날려 저 멀리 사라진다.\n",

                "해안절벽 위에 자리한 아름다운 사찰 해동용궁사는 광활한 동해바다의 파란세상이 눈앞에 펼쳐지는 절경 덕에 국내외 관광객의 발걸음이 끊이지 않는 곳이다.\n",

                "기장 앞바다를 정원으로 둔 힐튼호텔 아난니코브 타운. 맘에 드는 레스토랑을 찾아도 좋고 독특한 큐레이션이 눈길을 끄는 서점에서 충분한 시간을 보내도 좋겠다.\n",

                "빨간 뾰족지붕과 잘 어울리는 하얀 벽돌건물이 동화 속 한 장면처럼 이국적인 죽성성당. 아침에는 가슴 벅찬 일출을 맞이하는 곳이 밤이 되면 은은한 조명으로 둘러싸인 낭만성당으로 변모한다.\n",
                "추천코스",R.drawable.two_three_second_dsix,R.drawable.two_three_second,R.drawable.two_three_second_dtwo,R.drawable.two_three_second_dfour,R.drawable.two_three_second_dfive,
                R.drawable.two_three_second_dsix,R.drawable.two_three_second_dseven,R.drawable.two_three_second_deight,R.drawable.two_three_second_dnine,R.drawable.two_three_second_dten,R.drawable.two_three_second_deleven));


        RecyclerView myrv = (RecyclerView) view.findViewById(R.id.recyclerview_id);

        RecyclerView.Adapter myAdapter = new RecyclerViewAdapterTwoThreeTrip(getActivity(), third_Course);

        //myrv.setLayoutManager(new GridLayoutManager(this, 3));

        // 세로 레이아웃
        LinearLayoutManager verticalLayoutManager = new LinearLayoutManager(getActivity(),RecyclerView.VERTICAL, false);

        // 레이아웃 매니저 연결
        myrv.setLayoutManager(verticalLayoutManager);

        myrv.setAdapter(myAdapter);

        return view;
    }

    }


