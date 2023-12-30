package com.springbootlearning.learningspringboot3;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class VideoService {
    private List<Video> videos = List.of(
            new Video("Need HELP with your Spring Boot 3 App?"),
            new Video("Don't do THIS to your own CODE!"),
            new Video("SECRETS to fix BROKEN CODE!"));

    public List<Video> getVideos(){
        return videos;
    }

    public Video create(Video newVideo){
        // This method ensures no existing videos list will be mutated accidentally.
        // However, this method is not thread safe.
        // Learning Spring Boot 3.0 pg 84.
        List<Video> extend = new ArrayList<>(videos);
        extend.add(newVideo);
        this.videos = List.copyOf(extend);
        return newVideo;
    }
}
