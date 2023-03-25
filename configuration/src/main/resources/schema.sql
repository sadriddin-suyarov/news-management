drop sequence if exists author_name_uk;
drop sequence if exists news_title_uk;
drop sequence if exists tag_name_uk;

drop table if exists tblAuthor;
drop table if exists tblNews;
drop table if exists tblTag;
drop table if exists tblNewsTag;
drop table if exists tblComment;


create table if not exists tblAuthor (
    id bigint primary key,
    name nvarchar(15) not null
);

alter table tblAuthor
    add constraint author_name_uk unique(name);

create table if not exists tblNews (
    id bigint primary key,
    title nvarchar(30) not null,
    content nvarchar(255) not null,
    author_id bigint not null,
    created timestamp not null,
    modified timestamp not null
);

alter table tblNews
    add constraint news_title_uk unique(title);

alter table tblNews
    add foreign key (author_id) references tblAuthor(id);

create table if not exists tblTag (
    id bigint primary key,
    name nvarchar(15) not null
);

alter table tblTag
    add constraint tag_name_uk unique(name);

create table if not exists tblNewsTag (
    id bigint primary key,
    news_id bigint not null,
    tag_id bigint not null
);

alter table tblNewsTag
    add foreign key (news_id) references tblNews(id);
alter table tblNewsTag
    add foreign key (tag_id) references tblTag(id);

create table if not exists tblComment (
    id bigint primary key,
    content nvarchar(255) not null,
    news_id bigint not null,
    created timestamp not null,
    modified timestamp not null
);

alter table tblComment
    add foreign key (news_id) references tblNews(id);