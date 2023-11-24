create table car(
    car_id uuid primary key default gen_random_uuid(),
    name varchar not null ,
    model varchar not null ,
    color varchar not null ,
    doors int not null ,
    prise int not null ,
    number_of_seats int not null ,
    data_receiving date,
    return_date date,
    is_using bool default false,
    picture varchar
);

insert into car (doors,name, prise, number_of_seats, model, color) values (4,'RX-7', 936, 4, 'Mazda', 'Purple');
insert into car (doors,name, prise, number_of_seats, model, color) values (4,'Rodeo', 969, 4, 'Isuzu', 'Pink');
insert into car (doors,name, prise, number_of_seats, model, color) values (4,'A4', 514, 2, 'Audi', 'Blue');
insert into car (doors,name, prise, number_of_seats, model, color) values (4,'Stratus', 279, 4, 'Dodge', 'Yellow');
insert into car (doors,name, prise, number_of_seats, model, color) values (4,'Precis', 212, 2, 'Mitsubishi', 'Yellow');
insert into car (doors,name, prise, number_of_seats, model, color) values (4,'Integra', 557, 5, 'Acura', 'Indigo');
insert into car (doors,name, prise, number_of_seats, model, color) values (4,'CLK-Class', 446, 3, 'Mercedes-Benz', 'Crimson');
insert into car (doors,name, prise, number_of_seats, model, color) values (4,'Yukon XL 1500', 459, 5, 'GMC', 'Aquamarine');
insert into car (doors,name, prise, number_of_seats, model, color) values (4,'i-290', 140, 2, 'Isuzu', 'Mauv');
insert into car (doors,name, prise, number_of_seats, model, color) values (4,'F150', 942, 4, 'Ford', 'Violet');
insert into car (doors,name, prise, number_of_seats, model, color) values (4,'S60', 669, 4, 'Volvo', 'Teal');
insert into car (doors,name, prise, number_of_seats, model, color) values (4,'Town & Country', 714, 2, 'Chrysler', 'Violet');
insert into car (doors,name, prise, number_of_seats, model, color) values (4,'Vandura 1500', 514, 5, 'GMC', 'Maroon');
insert into car (doors,name, prise, number_of_seats, model, color) values (4,'Equus', 311, 3, 'Hyundai', 'Crimson');
insert into car (doors,name, prise, number_of_seats, model, color) values (4,'Tracer', 896, 4, 'Mercury', 'Purple');
insert into car (doors,name, prise, number_of_seats, model, color) values (4,'Outback', 412, 4, 'Subaru', 'Purple');
insert into car (doors,name, prise, number_of_seats, model, color) values (4,'Q', 260, 3, 'Infiniti', 'Turquoise');
insert into car (doors,name, prise, number_of_seats, model, color) values (4,'Continental', 946, 4, 'Lincoln', 'Aquamarine');
insert into car (doors,name, prise, number_of_seats, model, color) values (4,'Elise', 268, 3, 'Lotus', 'Turquoise');
insert into car (doors,name, prise, number_of_seats, model, color) values (4,'Odyssey', 522, 5, 'Honda', 'Green');
insert into car (doors,name, prise, number_of_seats, model, color) values (4,'Azera', 487, 3, 'Hyundai', 'Mauv');
insert into car (doors,name, prise, number_of_seats, model, color) values (4,'DeVille', 511, 2, 'Cadillac', 'Red');
insert into car (doors,name, prise, number_of_seats, model, color) values (4,'Escalade', 847, 4, 'Cadillac', 'Maroon');
insert into car (doors,name, prise, number_of_seats, model, color) values (4,'CR-V', 579, 2, 'Honda', 'Crimson');
insert into car (doors,name, prise, number_of_seats, model, color) values (4,'Avalon', 403, 4, 'Toyota', 'Yellow');
insert into car (doors,name, prise, number_of_seats, model, color) values (4,'LeMans', 259, 4, 'Pontiac', 'Red');
insert into car (doors,name, prise, number_of_seats, model, color) values (4,'Grand Cherokee', 926, 4, 'Jeep', 'Fuscia');
insert into car (doors,name, prise, number_of_seats, model, color) values (4,'XC60', 301, 3, 'Volvo', 'Violet');
insert into car (doors,name, prise, number_of_seats, model, color) values (4,'RSX', 129, 3, 'Acura', 'Teal');
insert into car (doors,name, prise, number_of_seats, model, color) values (4,'TL', 958, 4, 'Acura', 'Khaki');
insert into car (doors,name, prise, number_of_seats, model, color) values (4,'Mountaineer', 415, 5, 'Mercury', 'Khaki');
insert into car (doors,name, prise, number_of_seats, model, color) values (4,'850', 210, 4, 'Volvo', 'Green');
insert into car (doors,name, prise, number_of_seats, model, color) values (4,'Topaz', 555, 5, 'Mercury', 'Purple');
insert into car (doors,name, prise, number_of_seats, model, color) values (4,'SRX', 959, 5, 'Cadillac', 'Fuscia');
insert into car (doors,name, prise, number_of_seats, model, color) values (4,'Range Rover Sport', 187, 4, 'Land Rover', 'Crimson');
insert into car (doors,name, prise, number_of_seats, model, color) values (4,'Karif', 581, 5, 'Maserati', 'Puce');
insert into car (doors,name, prise, number_of_seats, model, color) values (4,'Excursion', 536, 3, 'Ford', 'Red');
insert into car (doors,name, prise, number_of_seats, model, color) values (4,'Malibu', 101, 3, 'Chevrolet', 'Blue');
insert into car (doors,name, prise, number_of_seats, model, color) values (4,'Marquis', 671, 5, 'Mercury', 'Turquoise');
insert into car (doors,name, prise, number_of_seats, model, color) values (4,'Bonneville', 491, 2, 'Pontiac', 'Mauv');

