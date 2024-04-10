
create table student (
                         id int auto_increment primary key,
                         name varchar(255),
                         email varchar(255) unique not null,
                         matricule varchar(255) unique,
                         password varchar(255) not null,
                         created_at timestamp default current_timestamp,
                         updated_at timestamp default current_timestamp on update current_timestamp
);

create table staff(
                      id int auto_increment primary key,
                      name varchar(255),
                      email varchar(255) unique not null,
                      password varchar(255) not null,
                      role enum('LECTURER', 'HOD', 'SECRETORY', 'ADMINISTRATOR', 'OTHER') default 'OTHER',
                      created_by int default null,
                      foreign key(created_by) references staff(id),
                      created_at timestamp default current_timestamp,
                      updated_at timestamp default current_timestamp on update current_timestamp
);

create table channel(
                        id int auto_increment primary key,
                        name varchar(255) not null,
                        description text,
                        department enum('ENGINEERING', 'MANAGEMENT', 'COMMUNICATION', 'HEALTH_SCIENCES', 'GENERAL') not null,
                        created_by int not null,
                        foreign key(created_by) references staff(id),
                        created_at timestamp default current_timestamp,
                        updated_at timestamp default current_timestamp on update current_timestamp
);

create table announcement(
                             id int auto_increment primary key,
                             message text not null,
                             channel_id int not null,
                             staff_id int not null,
                             foreign key (channel_id) references channel(id) on delete cascade,
                             foreign key (staff_id) references staff(id),
                             created_at timestamp default current_timestamp,
                             updated_at timestamp default current_timestamp on update current_timestamp
);

create table channel_permission(
                                   channel_id int not null,
                                   staff_id int not null,
                                   access_level enum('READ', 'WRITE') default 'READ',
                                   foreign key(channel_id) references channel(id) on delete cascade,
                                   foreign key(staff_id) references staff(id) on delete cascade,
                                   primary key(channel_id, staff_id),
                                   created_at timestamp default current_timestamp,
                                   updated_at timestamp default current_timestamp on update current_timestamp
);

create table student_subscription(
                                     channel_id int not null,
                                     student_id int not null,
                                     foreign key(channel_id) references channel(id) on delete cascade,
                                     foreign key(student_id) references student(id) on delete cascade,
                                     primary key(channel_id, student_id),
                                     created_at timestamp default current_timestamp
);