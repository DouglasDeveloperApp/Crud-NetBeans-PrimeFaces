create table sistema_carros(
 id Number not null,
 modelo VARCHAR2(11) not null,
 fabricante VARCHAR2(11) not null,
 cor VARCHAR2(11) not null,
 ano Date not null,
 constraint PK_EQUIPA primary key (id)
)

select * from sistema_carros