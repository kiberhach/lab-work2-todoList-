package services;

import models.dao.TasksDao;
import models.pojo.Task;
import models.pojo.User;

import java.util.List;

/**
 * Created by admin on 25.02.2017.
 */
public class TasksService {
    public static List<Task> getAllTasks(int id) {
        return TasksDao.getAllTasks(id);
    }

    public static Task getTaskById(Integer id) {
        return TasksDao.getTaskById(id);
    }

    public static boolean isUsersTask(Integer userId, Integer taskId) {
        if (userId < 1 || taskId <1)
            return false;

        User user = TasksDao.getTaskById(taskId).getUser();
        System.out.println(user.getLogin());
        return user.getId() == userId;
    }

    public static int insertTask(Task task) {
        return TasksDao.insertTask(task);
    }
}
