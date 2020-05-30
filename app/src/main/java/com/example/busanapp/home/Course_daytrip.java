package com.example.busanapp.home;

public class Course_daytrip {
        private String Title;
        private String Title2;
        private String Category;


        private String Description;
        private String Description2;
        private String Description3;
        private String Description4;
        private String Description5;

        private int Thumbnail;
        private int Thumbnail2;
        private int Thumbnail3;
        private int Thumbnail4;
        private int Thumbnail5;
        private int Thumbnail6;


    /*
    public Course() {
    }
    */

        public Course_daytrip(String title,String title2, String category, String description,String description2, String description3, String description4, String description5,
                      int thumbnail, int thumbnail2,int thumbnail3, int thumbnail4, int thumbnail5,int thumbnail6 ) {
            Title = title;
            Title2 = title2;
            Category = category;

            //요약
            Description = description;
            Description2 = description2;
            Description3 = description3;
            Description4 = description4;
            Description5 = description5;

            //사진
            Thumbnail2 = thumbnail2;
            Thumbnail = thumbnail;
            Thumbnail3 = thumbnail3;
            Thumbnail4 = thumbnail4;
            Thumbnail5 = thumbnail5;
            Thumbnail6 = thumbnail6;

        }

        public String getTitle() {
            return Title;
        }
        public String getTitle2() {
            return Title2;
        }

        public String getCategory() {
            return Category;
        }

        public String getDescription() {
            return Description;
        }
        public String getDescription2() {
            return Description2;
        }
        public String getDescription3() {
            return Description3;
        }
        public String getDescription4() {
            return Description4;
        }
        public String getDescription5() {
            return Description5;
        }


        public int getThumbnail() {
            return Thumbnail;
        }
        public int getThumbnail2() { return Thumbnail2; }
        public int getThumbnail3() {
            return Thumbnail3;
        }
        public int getThumbnail4() {
            return Thumbnail4;
        }
        public int getThumbnail5() {
            return Thumbnail5;
        }
        public int getThumbnail6() {
            return Thumbnail6;
        }
    /*
    // 안 쓰는 거 같아서 일단 주석처리 해둠
    public void setTitle(String title) {
        Title = title;
    }

    public void setCategory(String category) {
        Category = category;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public void setThumbnail(int thumbnail) {
        Thumbnail = thumbnail;
    }
    */
    }

