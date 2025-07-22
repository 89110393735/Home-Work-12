package ru.netology.javaqa;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TaskTest {
    @Test

    public void testSimpleTaskMatches() {
        Task task = new SimpleTask(123, "Зайти в магазин");
        boolean actual = task.matches("Зайти");
        Assertions.assertTrue(actual);
    }

    @Test

    public void testSimpleTaskNotMatches() {
        Task task = new SimpleTask(123, "Зайти в магазин");
        boolean actual = task.matches("Позвонить");
        Assertions.assertFalse(actual);
    }


    @Test
    public void testMeetingMatchesTopic() {
        Meeting meeting = new Meeting(
                555,
                "Выкатка 3й версии приложения",
                "Приложение НетоБанка",
                "Во вторник после обеда"
        );

        boolean actual = meeting.matches("Выкатка");
        Assertions.assertTrue(actual);
    }

    @Test
    public void testMeetingMatchesProject() {
        Meeting meeting = new Meeting(
                555,
                "Выкатка 3й версии приложения",
                "Приложение НетоБанка",
                "Во вторник после обеда"
        );

        boolean actual = meeting.matches("Приложение");
        Assertions.assertTrue(actual);
    }

    @Test
    public void testMeetingNotMatches() {
        Meeting meeting = new Meeting(
                555,
                "Выкатка 3й версии приложения",
                "Приложение НетоБанка",
                "Во вторник после обеда"
        );

        boolean actual = meeting.matches("Вторник");
        Assertions.assertFalse(actual);
    }


    @Test

    public void testEpicMatches() {
        String[] subtasks = {"Молоко", "Яйца", "Батон"};
        Epic epic = new Epic(123, subtasks);
        boolean actual = epic.matches("Молоко");
        Assertions.assertTrue(actual);
    }

    @Test

    public void testEpicNotMatches() {
        String[] subtasks = {"Молоко", "Яйца", "Батон"};
        Epic epic = new Epic(123, subtasks);
        boolean actual = epic.matches("Сыр");
        Assertions.assertFalse(actual);
    }

    @Test

    public void testTaskNotMatches() {
        String[] subtasks = {"Молоко", "Яйца", "Батон"};
        Task task = new Task(123);
        boolean actual = task.matches("Сыр");
        Assertions.assertFalse(actual);
    }

    @Test

    public void testTaskMatches() {
        String[] subtasks = {};
        Task task = new Task(123);
        boolean actual = task.matches("Зайти в магазин");
        Assertions.assertFalse(actual);
    }


}

