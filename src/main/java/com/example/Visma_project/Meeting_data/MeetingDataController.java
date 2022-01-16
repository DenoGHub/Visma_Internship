package com.example.Visma_project.Meeting_data;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/MeetingData")
public class MeetingDataController {

    private final MeetingDataService meetingDataService;

    @Autowired
    public MeetingDataController(MeetingDataService meetingDataService) {
        this.meetingDataService = meetingDataService;
    }

    @GetMapping
    public List<MeetingData> getMeetingData() {
        return meetingDataService.getMeetingData();
    }
}
