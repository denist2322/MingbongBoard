/*
Show USER;

CREATE USER �����̸� IDENTIFIED BY ��й�ȣ;

grant connect, resource, dba to �����̸�;

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
    '�̹����� �� �Ǳ⸦ �ٷ���.',
    '�̹����� ���� �� �Ǿ�����? �� �Ǿ����� ���ھ��.'
)

insert into article values(
    2,
    '��¥ �� �Ǳ⸦ �ٷ���.',
    '�̹����� ���� �� �Ǿ�����? �� �Ǿ����� ���ھ��.'
)

insert into article values(
    3,
    '�κ���.. ��������!',
    '�κ��� ����������!'
)

CREATE SEQUENCE USER_SEQ START WITH 4 INCREMENT BY 1 MAXVALUE 99999 NOCYCLE NOCACHE;

insert into article values(
    USER_SEQ.NEXTVAL,
    '�ڵ������� �߰��غþ��',
    '�� �Ǿ�����? �� �Ǿ����� ���ھ��.'
)

delete from article where id = 1

commit