package com.example.Visma_project.Meeting_data;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface MeetingDataRepository extends JpaRepository<MeetingData, String> {
    List<MeetingData> findMeetingDataByName(String name);

}
