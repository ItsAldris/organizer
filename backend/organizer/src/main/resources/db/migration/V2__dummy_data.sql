INSERT INTO categories VALUES (DEFAULT, 'Category1', '#33a2c4');
INSERT INTO categories VALUES (DEFAULT, 'Category2', '#e06ca4');
INSERT INTO categories VALUES (DEFAULT, 'Category3', '#88b854');

INSERT INTO tasks VALUES (DEFAULT, 'Task1', DATE '2026-08-28', 1, DEFAULT);
INSERT INTO tasks VALUES (DEFAULT, 'Task2', DATE '2026-08-28', 2, DEFAULT);
INSERT INTO tasks VALUES (DEFAULT, 'Task3', DATE '2026-08-29', 3, DEFAULT);
INSERT INTO tasks VALUES (DEFAULT, 'Task4', DATE '2026-08-29', 2, DEFAULT);
INSERT INTO tasks VALUES (DEFAULT, 'Task5', DATE '2026-08-29', 2, DEFAULT);
INSERT INTO tasks VALUES (DEFAULT, 'Task6', DATE '2026-08-30', 1, DEFAULT);
INSERT INTO tasks VALUES (DEFAULT, 'Task7', DATE '2026-08-30', NULL, DEFAULT);

INSERT INTO schedule_items VALUES(DEFAULT, 'ScheduleItem1', 1, DATE '2026-08-28', TIME '10:00:00', TIME '12:00:00');
INSERT INTO schedule_items VALUES(DEFAULT, 'ScheduleItem2', 2, DATE '2026-08-28', TIME '14:00:00', TIME '15:00:00');
INSERT INTO schedule_items VALUES(DEFAULT, 'ScheduleItem3', 3, DATE '2026-08-28', TIME '18:00:00', NULL);
INSERT INTO schedule_items VALUES(DEFAULT, 'ScheduleItem4', 1, DATE '2026-08-29', TIME '10:00:00', TIME '15:30:00');
INSERT INTO schedule_items VALUES(DEFAULT, 'ScheduleItem5', NULL, DATE '2026-08-29', TIME '17:30:00', NULL);

INSERT INTO notes VALUES (DEFAULT, 'Note1', 'Lorem ipsum dolor sit amet', 1);
INSERT INTO notes VALUES (DEFAULT, 'Note2', 'Lorem ipsum dolor sit amet Lorem ipsum dolor sit amet Lorem ipsum dolor sit amet Lorem ipsum dolor sit amet Lorem ipsum dolor sit amet Lorem ipsum dolor sit amet Lorem ipsum dolor sit amet Lorem ipsum dolor sit amet', 1);
INSERT INTO notes VALUES (DEFAULT, 'Note3', 'Lorem ipsum dolor sit amet Lorem ipsum dolor sit amet', 1);
INSERT INTO notes VALUES (DEFAULT, 'Note4', 'Lorem ipsum dolor sit amet Lorem ipsum dolor sit amet Lorem ipsum dolor sit amet Lorem ipsum dolor sit amet Lorem ipsum dolor sit amet Lorem ipsum dolor sit amet Lorem ipsum dolor sit amet', 2);
INSERT INTO notes VALUES (DEFAULT, 'Note5', 'Lorem ipsum dolor sit amet', 3);