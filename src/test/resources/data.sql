INSERT INTO daily_report VALUES(1, 2500, 100, 24 , 120, now(), 0, 99);
INSERT INTO daily_report VALUES(2, 2500, 100, 24 , 120, (NOW() - INTERVAL 1 DAY), 0, 99);
INSERT INTO daily_report VALUES(3, 2500, 100, 24 , 120, NOW() - INTERVAL 3 DAY, 0, 99);
INSERT INTO daily_report VALUES(4, 2500, 100, 24 , 120, NOW() - INTERVAL 9 DAY, 0, 99);



INSERT INTO user VALUES(0, 'No description',
'https://scontent-cdg2-1.xx.fbcdn.net/v/t1.0-9/54255583_1276949652454861_874443465881026560_n.jpg?_nc_cat=107&_nc_sid=09cbfe&_nc_ohc=88gfQTlQJV0AX__vKxd&_nc_ht=scontent-cdg2-1.xx&oh=869df4abffa857bfe315f77dbf1e4d54&oe=5EFE98AE',
'florian@mydiet.fr', 1,false, 'Florian', 'patatra');

INSERT INTO user VALUES(1, 'No description', 'https://scontent-cdg2-1.xx.fbcdn.net/v/t1.0-9/69482110_2450338508361582_8741807199682035712_o.jpg?_nc_cat=104&_nc_sid=09cbfe&_nc_ohc=qIebk6N6kS8AX-XcLRV&_nc_ht=scontent-cdg2-1.xx&oh=0db7011ea8c36368edb40d67a9a05488&oe=5EFCFD2E',
'virgile@mydiet.fr',null ,true, 'Virgile', 'patatra');


INSERT INTO food VALUES(1, 10, 10, 10,'viande', 10);
INSERT INTO recommendation VALUES(0, 'Fait du sport', 1, 0);