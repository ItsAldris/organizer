package com.src.organizer.scheduleItem;

import com.src.organizer.scheduleItem.model.ScheduleItemResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ScheduleItemService {

    private final ScheduleItemRepository scheduleItemRepository;
    private final ScheduleItemMapper scheduleItemMapper;

    public List<ScheduleItemResponse> getAllScheduleItems() {
        List<ScheduleItem> items = scheduleItemRepository.findAll();
        return scheduleItemMapper.toResponse(items);
    }

    public ScheduleItemResponse getScheduleItemById(Long id) {
        ScheduleItem item = scheduleItemRepository.findById(id).orElseThrow();
        return scheduleItemMapper.toResponse(item);
    }
}
