create table cars
(
    id                int8 generated by default as identity,
    issue_date        Date,
    model             varchar(30),
    state_number      varchar(30),
    registration_date date,
    primary key (id)
);
insert into cars(issue_date, model, state_number, registration_date)
values ('2021-08-07', 'bmw', 'A585��199', '2021-09-27'),
       ('2015-15-15', '���', '�585��199', '2016-01-21');

create table vehicle_inspection
(
    id              int8 generated by default as identity,
    card_number     varchar(30),
    date_inspection date,
    remarks         varchar(30),
    cars_id         int8 not null,
    foreign key (cars_id) references cars (id),
    primary key (id)
);
insert into vehicle_inspection(card_number, date_inspection, remarks, cars_id)
values ('DLZ5123697', '2021-09-27', '��� ���������', 1),
       ('DLZ5123697', '2021-09-27', '��� ���������', 2),
       ('DLZ5123697', '2021-09-27', '��� ���������', 1),
       ('DLZ5123697', '2021-09-27', '��� ���������', 2),
       ('DLZ5123697', '2021-09-27', '��� ���������', 1);