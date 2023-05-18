/*
Show USER;

CREATE USER 유저이름 IDENTIFIED BY 비밀번호;

grant connect, resource, dba to 유저이름;

DROP USER c##smhope cascade;

select * from all_users;

ALTER SESSION SET "_ORACLE_SCRIPT" = TRUE;
*/

select * from article order by id;

drop table article;

create table article(
    id number primary key not null,
    title varchar2(100),
    body varchar2(2000)
)

insert into article values(
    1,
    '이번에는 잘 되기를 바래요.',
    '이번에는 정말 잘 되었나요? 잘 되었으면 좋겠어요.'
)

insert into article values(
    2,
    '진짜 잘 되기를 바래요.',
    '이번에는 정말 잘 되었나요? 잘 되었으면 좋겠어요.'
)

insert into article values(
    3,
    '민봉님.. 힘내세요!',
    '민봉님 울지마세요!'
)

CREATE SEQUENCE USER_SEQ START WITH 4 INCREMENT BY 1 MAXVALUE 99999 NOCYCLE NOCACHE;

insert into article values(
    USER_SEQ.NEXTVAL,
    '자동증가를 추가해봤어요',
    '잘 되었나요? 잘 되었으면 좋겠어요.'
)

delete from article where id = 1

commit