package com.example.Visma_project.Meeting_data;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Component
@Service
public class MeetingDataService {

    private final MeetingDataRepository meetingDataRepository;

    @Autowired
    public MeetingDataService(MeetingDataRepository meetingDataRepository) {
        this.meetingDataRepository = meetingDataRepository;
    }

    public List<MeetingData> getMeetingData() {
        return meetingDataRepository.findAll();

//        return List.of(
//                new MeetingData(
//                        "Visma_meeting",
//                        "Tom",
//                        "Visma project first time with spring boot",
//                        "Hub",
//                        "Live",
//                        LocalDate.now(),
//                        LocalDate.of(2023, Month.APRIL, 8)
//                ),
//                new MeetingData(
//                        "Empty",
//                        "Mathew",
//                        "In progress",
//                        null,
//                        "Live",
//                        LocalDate.of(2022, Month.JANUARY, 1),
//                        LocalDate.of(2022, Month.DECEMBER, 31)
//                )
//        );
    }
}
