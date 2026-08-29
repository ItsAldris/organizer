package com.src.organizer.task;

import com.src.organizer.task.model.TaskResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TaskService {

    private final TaskRepository taskRepository;
    private final TaskMapper taskMapper;

    public TaskResponse getTaskById(Long id) {
        Task task = taskRepository.findById(id).orElseThrow();
        return taskMapper.toResponse(task);
    }

    public List<TaskResponse> getAllTasks() {
        List<Task> tasks = taskRepository.findAll();
        return taskMapper.toResponse(tasks);
    }
}
