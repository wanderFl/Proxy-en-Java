package com.example.some_cool_media_library;

import java.util.HashMap;

import com.example.Video;

public interface ThirdPartyYouTubeLib {
    HashMap<String, Video> popularVideos();

    Video getVideo(String videoId);
}

